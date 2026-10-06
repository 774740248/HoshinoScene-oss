# 如果你有自己的测试应用清单，请指定
packages=""
num=$1 # app切换个数
interval=$2 # app切换间隔秒数

COLOR_OS=$(getprop ro.build.version.oplusrom.display)
if [ "$COLOR_OS" != '' ]; then
  echo '确保跑分应用(安兔兔、Geekbench等)都已冻结，否则影响测试结果！' 1>&2
  sleep 3
fi

function starApp() {
  activity="$(pm resolve-activity --brief -a android.intent.action.MAIN -c android.intent.category.LAUNCHER $1 | grep '/' | head -1)"
  am start-activity --activity-reorder-to-front -n $activity 1 >/dev/null 2>&1
}

pidList=()
# 随机启动应用
function randomStart() {
  echo 'Random Start Apps …'

  count=$1
  interval=$2
  if [[ "$packages" == "" ]]; then
    # 获取可启动的第三方应用列表，排除SCENE
    packages=$(pm list packages -3 -e | grep -v com.omarea.vtools | cut -f2 -d ':' | while read package; do
      if pm resolve-activity --brief -a android.intent.action.MAIN -c android.intent.category.LAUNCHER "$package" >/dev/null 2>&1; then
        echo "$package"
      fi
    done)
  fi
  total=$(echo "$packages" | wc -l)
  if [[ $total -lt $count ]]; then
    echo "Only $total available apps, less than requested $count. !!!" >&2
    disabled=$(pm list packages -3 -d | wc -l)
    if [[ $disabled -gt 0 ]]; then
      echo "There are $disabled disabled apps. Perhaps you can enable them first." >&2
    fi
    exit 1
  fi

  # 生成唯一随机序列，确保不会选中相同的应用
  random_indices=$(seq 1 "$total" | awk 'BEGIN {srand()} {print $0, rand()}' | sort -k2,2n | cut -d ' ' -f1)

  # 随机启动指定个数应用
  c=0
  for i in $random_indices; do
    package=$(echo "$packages" | sed -n "${i}p")
    pm enable $package >/dev/null 2>&1
    pm unsuspend $package >/dev/null 2>&1
    pm unhide $package >/dev/null 2>&1
    echo [$((c+1))] "Starting package: $package"
    starApp $package
    sleep $interval
    pid=$(pidof $package | cut -f1 -d ' ')
    if [[ "$pid" != "" ]]; then
      pidList=("${pidList[@]}" $pid)
      c=$((c + 1))
      if [[ $c -ge $count ]]; then
        break
      fi
    else
      echo "Failed to start app: $package"
    fi
  done

  # 已安装的应用数量不够测的
  if [[ $c -lt $count ]]; then
    echo "Only started $c apps, less than requested $count."
    echo "Please install more apps to test."
  fi
}


function checkProcessAlive() {
  alive=0
  for pid in "${pidList[@]}"; do
    if [[ -n "$pid" && -d "/proc/$pid" ]]; then
      alive=$((alive + 1))
    fi
  done
  echo $alive
}

echo "=== $(date) ==="
screen_off=$(settings get system screen_off_timeout)
settings put system screen_off_timeout 600000 # 设置息屏时间为10分钟

if [[ "$num" == '' ]]; then
  num=8 # 启动app个数
  memStr=$(cat /proc/meminfo | grep MemTotal)
  memKB=${memStr:16:8}
  memGB=$(((memKB/1024+2047)/2048*2))
  if [[ $memGB -ge 16 ]]; then
    num=60
  elif [[ $memGB -ge 12 ]]; then
    num=45
  elif [[ $memGB -ge 8 ]]; then
    num=25
  elif [[ $memGB -ge 6 ]]; then
    num=15
  fi
fi

if [[ "$interval" == '' ]]; then
  interval=5
fi
randomStart "$num" "$interval"
am start-activity -a android.intent.action.MAIN -c android.intent.category.HOME >/dev/null 2>&1

settings put system screen_off_timeout $screen_off

alive=$(checkProcessAlive)
echo "Alive apps: $alive/$num"
if [[ $alive -ge $num ]]; then
  echo "(^o^) Amazing!"
elif [[ $alive -ge $((num*75/100)) ]]; then
  echo "(^_^) Nice!"
elif [[ $alive -ge $((num*50/100)) ]]; then
  echo "(-_-) So so."
else
  echo "(>_<) Poor."
fi
