# SCENE'ExtremeGT

t=29500
bat_t=29500
shell_t=33000
for tz in /sys/class/thermal/*
do
  if [[ -f $tz/temp ]]; then
    case $(cat $tz/type) in
      pm8550_gpio03_usr|pm8550vs_g_tz|pm8550b_tz|pm8550vs_c_tz|pa-therm2-sys3)
        echo $t > $tz/emul_temp
      ;;
      rear-tof-therm|cam-flash-therm)
        echo $t > $tz/emul_temp
      ;;
      batt-therm|usb-therm)
        echo $bat_t > $tz/emul_temp
      ;;
      wlan-therm|xo-therm|oplus_thermal_ipa)
        echo $t > $tz/emul_temp
      ;;
      board_temp|ap_ntc|ltepa_ntc|nrpa_ntc|wcn_temp)
        echo $t > $tz/emul_temp
      ;;
      shell*)
        echo $shell_t > $tz/emul_temp
      ;;
    esac
  fi
done

# 可能导致相机性能异常、充电状态检测异常
# stop horae

for i in `seq 0 9`; do
  echo $i $t > /proc/shell-temp
done

# 恢复8E 105°C墙，但似乎没啥必要
# stop thermal-engine

gu=/proc/oplus-votable/GAUGE_UPDATE
if [[ -d $gu ]]; then
 chmod 666 $gu/force_val
 echo '1000' > $gu/force_val
 chmod 666 $gu/force_active
 echo '1' > $gu/force_active
fi
