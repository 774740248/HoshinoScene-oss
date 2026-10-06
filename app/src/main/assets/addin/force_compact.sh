Level="$1" # 清理级别（0:极微, 1：轻微，2：更重，3：极端）

# Messages
StrKernelUnsupported="@string:home_shell_01"
StrSwapTooLow="@string:home_shell_02"
StrProhibitParallel="@string:home_shell_03"
StrReclaimCompleted="@string:home_shell_04"
StrCalculationError="@string:home_shell_05"
StrMemoryPlenty="@string:home_shell_06"
StrWriteBackCompleted="@string:home_shell_07"

KeyStateStore='vtools.state.force_compact'

# 级别0用在实时加速中，一般处于内存负载较高的状态下，此时缓存占用本就不高，无需再清理
if [[ "$Level" != "0" ]]; then
  echo 3 > /proc/sys/vm/drop_caches
fi

ModifyPath='none'
# 是否是友好的，非友好的是指会导致手机直接卡住，有明显感知
Friendly=false
UseMemcg=false

if [[ -e /sys/fs/cgroup/memory/memory.swappiness ]]; then
  Memcg="/sys/fs/cgroup/memory"
elif [[ -d /dev/memcg ]]; then
  Memcg="/dev/memcg"
fi

# 通常是在骁龙865及更早的处理器上可用
if [[ -f '/proc/sys/vm/extra_free_kbytes' ]]; then
  ModifyPath='/proc/sys/vm/extra_free_kbytes'
  Friendly=true
# 这个方式比较蹩脚。有些机型有魔改的拓展内存(或回写)效果就比较好了
elif [[ -d $Memcg ]]; then
  UseMemcg=true
# 通过调整这个值触发swap，会导致整个系统处于未响应状态
elif [[ -f '/proc/sys/vm/min_free_kbytes' ]]; then
  ModifyPath='/proc/sys/vm/min_free_kbytes'
# 啥也没有，爬！
else
  echo $StrKernelUnsupported
  return 1
fi
FreeKBytesOriginal=$(cat $ModifyPath)

getMemFree(){
  tmp=$(cat /proc/meminfo | grep MemFree)
  echo "${tmp:16:8}"
}
getMemTotal(){
  tmp=$(cat /proc/meminfo | grep MemTotal)
  echo "${tmp:16:8}"
}
getSwapFree(){
  tmp=$(cat /proc/meminfo | grep SwapFree)
  echo "${tmp:16:8}"
}
MemTotal=$(getMemTotal)

# 回收比例(%)
if [[ "$Level" == "3" ]]; then
  RecycleRatio=55
elif [[ "$Level" == "2" ]]; then
  RecycleRatio=35
elif [[ "$Level" == "0" ]]; then
  RecycleRatio=14
else
  RecycleRatio=20
fi
if [[ $Friendly == "true" ]]; then
  TargetFree=$(($MemTotal / 100 * $RecycleRatio))
else
  TargetFree=$(($MemTotal / 200 * $RecycleRatio))
fi

# 适用于oppo meizu vivo的拓展内存
zram_writback_ov() {
  # 先强制写到磁盘，再强制将匿名内存压到zram，再强制写到磁盘
  actions="force_swapout force_shrink_anon force_shrink_file force_swapout"
  if [[ -f /dev/memcg/memory.force_reclaim_zram ]]; then
    # vivo
    actions="force_reclaim_zram force_reclaim_anon force_reclaim_file force_reclaim_zram"
  elif [[ -f /dev/memcg/memory.force_swapout_percent ]]; then
    # 一加12，只能通过 force_swapout_percent 触发回写？
    actions="force_swapout_percent force_shrink_anon_percent force_shrink_file force_swapout_percent"
    value=100
  fi

  for action in $actions; do
    value=1
    if [[ $action == *percent ]]; then
      value=100
    fi
    if [[ -f /dev/memcg/memory.$action ]]; then
      for dir in scene_idle apps system; do
        actionF=/dev/memcg/$dir/memory.$action
        if [[ -f $actionF ]]; then
          for subDir in /dev/memcg/$dir/*; do
            if [[ -f $subDir/memory.$action ]]; then
              echo $value > $subDir/memory.$action
            fi
          done
          echo $value > $actionF
        fi
      done

      if [[ "$TargetFree" != "" ]]; then
        if [[ $(getMemFree) -gt $TargetFree ]]; then
          return 1
        fi
      fi
    fi
  done
  return 0
}

# 触发回写或写入拓展内存
zram_writback() {
  if [[ $(cat /proc/swaps | grep zram0) == '' ]]; then
    return 0
  fi
  blk=/sys/block/zram0/backing_dev
  blk_oplus=/sys/block/zram0/hybridswap_loop_device
  if [[ -f $blk_oplus ]]; then
    blk=$blk_oplus
  elif [[ ! -f $blk ]]; then
    return 0
  fi

  backing_dev=$(cat $blk)
  if [[ "$backing_dev" == '' ]] || [[ "$backing_dev" == 'chp' ]] || [[ "$backing_dev" == 'none' ]]; then
    return 0
  fi

  if [[ -f /sys/block/zram0/writeback ]]; then
    chmod 0664 /sys/block/zram0/idle
    chmod 0664 /sys/block/zram0/writeback
    echo all > /sys/block/zram0/idle
    wbl=/sys/block/zram0/writeback_limit_enable
    for t in incompressible huge_idle idle; do
      # 限制一次写入512M，避免完全回写导致一直阻塞
      if [[ -f $wbl ]]; then
        echo 1 > $wbl
        echo $((512*1024/4)) > sys/block/zram0/writeback_limit
      fi
      echo $t > /sys/block/zram0/writeback
      if [[ $(getMemFree) -gt $TargetFree ]]; then
        return 1
      fi
    done
  elif [[ -f /dev/memcg/memory.force_swapout ]]; then # meizu, oppo
    extSize=0
    for file in smartswap_meminfo hybridswap_meminfo; do
      if [[ -f /sys/block/zram0/$file ]]; then
        extSize=$(head -1 /sys/block/zram0/$file | tr -s ' ' | cut -d' ' -f2)
      fi
    done
    if [[ $extSize -gt 0 ]] || [[ -d /proc/mz_info ]]; then
      zram_writback_ov
      return $?
    fi
  elif [[ -f /dev/memcg/memory.force_reclaim_zram ]]; then # vivo
    zram_writback_ov
    return $?
  fi

  return 0
}

# 对运行中的应用按uid进行分组(分为apps或system)
memcg_distribute(){
  if [[ $(getprop ro.build.version.sdk) -lt 28 ]]; then
    return
  fi
  if [[ ! -d $Memcg ]]; then
    return
  fi

  mkdir -p $Memcg/apps
  mkdir -p $Memcg/system
  cat $Memcg/memory.swappiness > $Memcg/apps/memory.swappiness
  cat $Memcg/memory.swappiness > $Memcg/system/memory.swappiness

  for set in '' '/apps' '/system';do
    echo 1 > $Memcg$set/memory.use_hierarchy
    echo 1 > $Memcg$set/memory.oom_control
    echo 1 > $Memcg$set/memory.move_charge_at_immigrate
  done

  dumpsys activity lru | grep '#' | while read line; do
    for col in $line;do
      if [[ $col == */* ]]; then
        pid=$(echo $col | awk -F ':' '{print $1}')
        uid=$(echo $col | awk -F '/' '{print $2}')
        if [[ $uid == *i* ]]; then
          uid=$(echo $uid | awk -F 'i' '{print $1}')
        fi
        # 仅对没有指定memory分组的进程设置cgroup
        if [[ $(grep memory /proc/$pid/cgroup | awk -F '/' '{print $2}') == '' ]]; then
          # echo $pid $uid
          if [[ $uid == u* ]]; then
            echo $pid > $Memcg/apps/cgroup.procs
          else
            echo $pid > $Memcg/system/cgroup.procs
          fi
        fi
      fi
    done
  done
}

# 降低memcg的soft_limit触发swap
memcg_reclaim() {
  # 太暴力啦，会卡到怀疑人生
  # echo "echo 1 > $Memcg/apps/memory.force_empty" > /cache/force_empty.sh

  cmd=""

  # 先回收scene创建的垃圾堆
  for set in scene_idle; do
    if [[ -e $Memcg/$set ]]; then
      limit=$(cat $Memcg/$set/memory.soft_limit_in_bytes)
      if [[ $limit == '9223372036854771712' ]]; then
        limit='384M'
      fi
      cmd="$cmd\necho $limit > $Memcg/$set/memory.limit_in_bytes"
    fi
  done

  # 然后回收apps
  for set in apps; do
    if [[ -e $Memcg/$set ]]; then
      usage=$(cat $Memcg/$set/memory.usage_in_bytes)
      limit_kb=$((usage / 1000 - TargetFree))
      # 避免压到 < 384MB
      if [[ $limit_kb -lt 393216 ]]; then
        limit_kb=393216
      fi
      cmd="$cmd\necho ${limit_kb}K > $Memcg/$set/memory.limit_in_bytes"
    fi
  done

  # 最后system也压榨一点
  for set in scene_active system; do
    if [[ -e $Memcg/$set ]]; then
      usage=$(cat $Memcg/$set/memory.usage_in_bytes)
      # in_swap=$(grep '^swap' "$Memcg/$set/memory.stat" | awk '{print $2}')
      # total_sys=$((usage+in_swap))
      limit_kb=$((usage*50/100/1000)) # system应用期望其内存swap率为50%
      # 避免压到 < 384MB
      if [[ $limit_kb -lt 393216 ]]; then
        limit_kb=393216
      fi
      cmd="$cmd\necho ${limit_kb}K > $Memcg/$set/memory.limit_in_bytes"
    fi
  done

  echo "$cmd" > /cache/force_empty.sh
  nohup sh /cache/force_empty.sh > /dev/null &
}

# 还原soft_limit
memcg_reclaim_stop() {
  killall 'sh /cache/force_empty.sh'
  rm -f '/cache/force_empty.sh' 2>/dev/null
  for set in apps system scene_active scene_idle; do
    if [[ -e $Memcg/$set ]]; then
      echo '9223372036854771712' > $Memcg/$set/memory.limit_in_bytes
    fi
  done
}

force_reclaim() {
  local memFree
  local swapFree
  memFree=$(getMemFree)
  swapFree=$(getSwapFree)

  # 计算需要回收多少内存
  local recycleSize=$((TargetFree - memFree))
  # 计算回收这些内存需要消耗多少SWAP容量(压缩前大小+压缩后大小，假设压缩率为30%)
  local swapRequire=$((recycleSize*130/100))
  # 如果swap空闲不足以回收这么多内存，则只拿Swap剩余容量的70%来回收内存
  if [[ $swapFree -lt $swapRequire ]]; then
    recycleSize=$((swapFree * 70 / 100))
    # 相应的调整目标空闲内存
    TargetFree=$((recycleSize + memFree))
  fi

  if [[ $recycleSize != "" ]] && [[ $recycleSize -gt 0 ]]; then
    if [[ $UseMemcg == "true" ]]; then
      memcg_distribute
      memcg_reclaim
    else
      echo $TargetFree > $ModifyPath
    fi

    # 回收超时时间(秒)
    duration_limit=30
    # 级别0用在实时加速中，最重要的保持系统的持续流畅，隐藏缩短回收持续时间，减少卡顿
    if [[ "$Level" == "0" ]]; then
      reclaim_timeout=$((recycleSize / 1024 / 120 + 2))
      duration_limit=6
    else
      reclaim_timeout=$((recycleSize / 1024 / 60 + 2))
    fi
    if [[ $reclaim_timeout -gt $duration_limit ]]; then
      reclaim_timeout=$duration_limit
    fi
    if [[ $Friendly != "true" ]] && [[ $reclaim_timeout -gt 3 ]]; then
      reclaim_timeout=$((reclaim_timeout / 2))
    fi

    while [[ $reclaim_timeout -gt 0 ]]; do
      sleep 1

      # 如果内存已经回收足够，提前结束
      if [[ $((TargetFree - $(getMemFree))) -lt 100 ]]; then
        break
      fi

      # 如果memcg回收脚本已退出，提前结束
      if [[ $UseMemcg == "true" ]] && [[ $(pidof -x 'force_empty.sh') == '' ]]; then
        break
      fi

      # 如果SWAP可用空间已经不足，提前结束
      if [[ $(getSwapFree) -lt 100 ]]; then
        echo $StrSwapTooLow
        break
      fi

      # 否则继续等待倒计时结束
      reclaim_timeout=$((reclaim_timeout-1))
    done

    # 还原原始设置
    if [[ $UseMemcg == "true" ]]; then
      memcg_reclaim_stop
    else
      echo "$FreeKBytesOriginal" > $ModifyPath
    fi
    echo $StrReclaimCompleted
  else
    echo $StrCalculationError
  fi
}

# 状态记录，避免同时执行多次
if [[ $(getprop $KeyStateStore) == "1" ]]; then
  echo $StrProhibitParallel
  return 0
fi

# 如果可用内存大于目标可用内存大小，则不需要回收了
if [[ $(getMemFree) -gt $TargetFree ]]; then
  echo $StrMemoryPlenty
else
  # 状态记录，避免同时执行多次
  setprop $KeyStateStore 1

  # 优先通过回写和拓展内存缓解内存压力，因为相对来说效果比较显著
  zram_writback

  if [[ "$?" == '1' ]]; then
    echo $StrWriteBackCompleted
  else
    # 无法通过回写缓解内存压力，再用别的方法触发swap(效果比较一般)
    force_reclaim
  fi

  # 清除执行状态标记
  setprop $KeyStateStore 0
fi

if [[ -f /proc/sys/vm/compact_memory ]]; then
  echo 1 > /proc/sys/vm/compact_memory
fi
