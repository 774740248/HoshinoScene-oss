if [[ -f /sys/devices/platform/soc/1d84000.ufshc/health_descriptor/life_time_estimation_a ]]; then
  bDeviceLifeTimeEstA=$(cat /sys/devices/platform/soc/1d84000.ufshc/health_descriptor/life_time_estimation_a)
  # bDeviceLifeTimeEstB=$(cat /sys/devices/platform/soc/1d84000.ufshc/health_descriptor/life_time_estimation_b)
elif [[ -f /sys/devices/virtual/mi_memory/mi_memory_device/ufshcd0/dump_health_desc ]];then
  bDeviceLifeTimeEstA=$(cat /sys/devices/virtual/mi_memory/mi_memory_device/ufshcd0/dump_health_desc | grep bDeviceLifeTimeEstA | cut -f2 -d '=' | cut -f2 -d ' ')
  # bDeviceLifeTimeEstB=$(cat /sys/devices/virtual/mi_memory/mi_memory_device/ufshcd0/dump_health_desc | grep bDeviceLifeTimeEstB | cut -f2 -d '=' | cut -f2 -d ' ')
else
  bDeviceLifeTimeEstA=$(cat /sys/kernel/debug/*.ufshc/dump_health_desc 2>/dev/null | grep bDeviceLifeTimeEstA | cut -f2 -d '=' | cut -f2 -d ' ')
  # bDeviceLifeTimeEstB=$(cat /sys/kernel/debug/*.ufshc/dump_health_desc 2>/dev/null | grep bDeviceLifeTimeEstB | cut -f2 -d '=' | cut -f2 -d ' ')
fi

dump_files=$(find /sys -name "dump_*_desc" | grep ufshc)
if [[ "$bDeviceLifeTimeEstA" == "" ]];then
  for line in $dump_files
  do
    str=$(grep 'bDeviceLifeTimeEstA' $line | cut -f2 -d '=' | cut -f2 -d ' ')
    if [[ "$str" != "" ]]; then
      bDeviceLifeTimeEstA="$str"
    fi
  done
fi

if [[ "$bDeviceLifeTimeEstA" == "" ]];then
  find /sys -name "life_time_estimation_a" | grep ufshc | while read line
  do
    str=$(cat $line)
    if [[ "$str" != "" ]]; then
      bDeviceLifeTimeEstA="$str"
    fi
  done
fi

# 0x00	未找到有关设备使用寿命的信息。
# 0x01	设备估计使用寿命的 0% 到 10%。
# 0x02	设备估计使用寿命的 10% 到 20%。
# 0x03	设备估计使用寿命的 20% 到 30%。
# 0x04	设备估计使用寿命的 30% 到 40%。
# 0x05	设备估计使用寿命的 40% 到 50%。
# 0x06	设备估计使用寿命的 50% 到 60%。
# 0x07	设备估计使用寿命的 60% 到 70%。
# 0x08	设备估计使用寿命的 70% 到 80%。
# 0x09	设备估计使用寿命的 80% 到 90%。
# 0x0A	设备估计使用寿命的 90% 到 100%。
# 0x0B	设备已超过其估计的使用寿命。

case $bDeviceLifeTimeEstA in
"0x00"|"0x0")
  echo '@string:kr_others_ufs_health_used @string:kr_others_ufs_health_unknown'
;;
"0x01"|"0x1")
  echo '@string:kr_others_ufs_health_used 0% ~ 10%'
;;
"0x02"|"0x2")
  echo '@string:kr_others_ufs_health_used 10% ~ 20%'
;;
"0x03"|"0x3")
  echo '@string:kr_others_ufs_health_used 20% ~ 30%'
;;
"0x04"|"0x4")
  echo '@string:kr_others_ufs_health_used 30% ~ 40%'
;;
"0x05"|"0x5")
  echo '@string:kr_others_ufs_health_used 40% ~ 50%'
;;
"0x06"|"0x6")
  echo '@string:kr_others_ufs_health_used 50% ~ 60%'
;;
"0x07"|"0x7")
  echo '@string:kr_others_ufs_health_used 60% ~ 70%'
;;
"0x08"|"0x8")
  echo '@string:kr_others_ufs_health_used 70% ~ 80%'
;;
"0x09"|"0x9")
  echo '@string:kr_others_ufs_health_used 80% ~ 90%'
;;
"0x0A"|"0xA")
  echo '@string:kr_others_ufs_health_used 90% ~ 100%'
;;
"0x0B"|"0xB")
  echo '已超过预估寿命'
;;
*)
  echo '@string:kr_others_ufs_health_used @string:kr_others_ufs_health_unknown'
;;
esac


if [[ -f /sys/devices/platform/soc/1d84000.ufshc/health_descriptor/eol_info ]]; then
  bPreEOLInfo=$(cat /sys/devices/platform/soc/1d84000.ufshc/health_descriptor/eol_info)
elif [[ -f /sys/devices/virtual/mi_memory/mi_memory_device/ufshcd0/dump_health_desc ]];then
  bPreEOLInfo=$(cat /sys/devices/virtual/mi_memory/mi_memory_device/ufshcd0/dump_health_desc | grep bPreEOLInfo | cut -f2 -d '=' | cut -f2 -d ' ')
else
  bPreEOLInfo=$(cat /sys/kernel/debug/*.ufshc/dump_health_desc | grep bPreEOLInfo | cut -f2 -d '=' | cut -f2 -d ' ')
fi

if [[ "$bPreEOLInfo" == "" ]];then
  # dump_files=$(find /sys -name "dump_*_desc" | grep ufshc)
  for line in $dump_files
  do
    str=$(grep 'bPreEOLInfo' $line | cut -f2 -d '=' | cut -f2 -d ' ')
    if [[ "$str" != "" ]]; then
      bPreEOLInfo="$str"
    fi
  done
fi

if [[ "$bPreEOLInfo" == "" ]];then
  files=$(find /sys -name "eol_info" | grep ufshc)
  for line in $files
  do
    str=$(cat $line)
    if [[ "$str" != "" ]]; then
      bPreEOLInfo="$str"
    fi
  done
fi

# 0x00	未定义成员。
# 0x01	正常。消耗不到 80% 的保留区块。
# 0x02	消耗了 80% 的保留区块。
# 0x03	危急。消耗了 90% 的保留区块。
# 所有其他值	保留供将来使用。

# 保留区块磨损
case $bPreEOLInfo in
"0x00"|"0x00")
  echo '@string:kr_others_ufs_health_op_used @string:kr_others_ufs_health_unknown'
;;
"0x01"|"0x1")
  echo '@string:kr_others_ufs_health_op_used < 80%'
;;
"0x02"|"0x2")
  echo '@string:kr_others_ufs_health_op_used ≈ 80%'
;;
"0x03"|"0x3")
  echo '@string:kr_others_ufs_health_op_used > 90%'
;;
*)
  echo '@string:kr_others_ufs_health_op_used @string:kr_others_ufs_health_unknown'
;;
esac