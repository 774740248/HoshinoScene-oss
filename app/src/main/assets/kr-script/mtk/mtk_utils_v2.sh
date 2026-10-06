source $START_DIR/kr-script/mtk/mtk_v2_env.sh

lock_value () {
  chmod 644 $2
  echo $1 > $2
  chmod 444 $2
}

gpu_freq(){
  # echo 'gpu_freq' $state
  if [[ "$state" == "-1" ]]; then
    echo -1 > /proc/gpufreqv2/fix_target_opp_index
    echo 0 0 > /proc/gpufreqv2/fix_custom_freq_volt
  else
    if [[ "$voltage" == "" || "$voltage" = "-1" ]]; then
      freq_row=$(grep "$state," /proc/gpufreqv2/stack_signed_opp_table)
      opp=${freq_row:1:2}
      echo 0 0 > /proc/gpufreqv2/fix_custom_freq_volt
      if [[ $(getprop ro.hardware) == "mt6989" ]]; then
        echo $opp $opp > /proc/gpufreqv2/fix_target_opp_index
      else
        echo $opp > /proc/gpufreqv2/fix_target_opp_index
      fi
      if [[ -f /sys/kernel/thermal/gpt ]]; then
        echo disable > /sys/kernel/thermal/gpt
      fi
    else
      echo -1 > /proc/gpufreqv2/fix_target_opp_index
      echo $state $voltage > /proc/gpufreqv2/fix_custom_freq_volt
    fi
  fi
}

gpu_freq_cur_khz() {
 gpu_freq_cur KHz
}
gpu_freq_cur_khz2() {
 freq=$(gpu_freq_cur)
 volt=$(gpu_volt_cur)
 if [[ "$freq" != "" ]]; then
   if [[ "$volt" != "" ]]; then
     echo "${freq}KHz,$volt"
   else
     echo "$freq"KHz
   fi
 fi
}
gpu_freq_cur() {
  fix_freq_volt=$(cat /proc/gpufreqv2/fix_custom_freq_volt | grep -v disabled)
  if [[ "$fix_freq_volt" == "" ]]; then
    opp=$(grep ':' /proc/gpufreqv2/fix_target_opp_index | cut -f2 -d ':')
    if [[ "$opp" == "" ]]; then
      echo ''
    else
      opp=$(printf "%02d" $opp)
      freq_row=$(grep "\[$opp\*\]" /proc/gpufreqv2/stack_signed_opp_table)
      echo -n ${freq_row:11:7}$1
    fi
  else
     freq=$(echo -n $fix_freq_volt | awk '{ print $4}')
     echo $freq$1
  fi
}
gpu_volt_cur(){
  fix_freq_volt=$(cat /proc/gpufreqv2/fix_custom_freq_volt | grep -v disabled)
  if [[ "$fix_freq_volt" != "" ]]; then
     echo $fix_freq_volt | awk '{ print $7}'
  fi
}

ddr_freq () {
  chmod 664 $dvfsrc/min_freq
  echo $state > $dvfsrc/min_freq
  chmod 444 $dvfsrc/min_freq
}

ddr_freq_fixed () {
  echo $state > $dvfsrc2/dvfsrc_force_vcore_dvfs_opp
}

# gpu_freq_max [oppIndex]
gpu_freq_max() {
  lock_value $state /sys/kernel/ged/hal/custom_upbound_gpu_freq
}
# gpu_freq_max_freq [freqKHZ]
gpu_freq_max_freq() {
  lock_value $state /sys/kernel/ged/hal/custom_upbound_gpu_freq

  state=-1
  gpu_freq
}
gpu_freq_max_freq_cur(){
  cur=$(cat /sys/kernel/ged/hal/custom_upbound_gpu_freq | head -1)
  cur=$(printf "%02d" $cur)
  freq_row=$(grep "\[$cur\*\]" /proc/gpufreqv2/stack_signed_opp_table)
  echo -n ${freq_row:11:7}$1
}
gpu_freq_max_freq_cur_khz(){
  gpu_freq_max_freq_cur KHz
}

set_dcs_mode(){
  dcs_mode=/sys/kernel/ged/hal/dcs_mode
  lock_value $state $dcs_mode
}
set_ged_kpi(){
  lock_value $state $ged_kpi
}
set_fpsgo(){
  lock_value $state $fpsgo
}
set_fbt_ceiling(){
  lock_value $state $fbt_ceiling
}

dimensity_hybrid_switch() {
  module=/data/adb/modules/dimensity_hybrid_governor
  disable=$module/disable
  if [[ $(pidof gpu-scheduler) != '' ]]; then
    echo '' > $disable
    killall gpu-scheduler 2>/dev/null
  else
    if [[ -d /sys/kernel/debug ]]; then
      umount /sys/kernel/debug 2>/dev/null
    fi
    mount -t debugfs none /sys/kernel/debug
    nohup $module/gpu-scheduler > /dev/null 2>&1 &
    rm -f $disable 2>/dev/null
  fi
}

set_perfmgr() {
  if [[ $(cat $fpsgo) != "1" ]]; then
    lock_value 1 $fpsgo
  fi

  if [[ $(cat $ged_kpi) != "1" ]] && [[ ! -d $hybrid ]]; then
    lock_value 1 $ged_kpi
  fi

  lock_value $state $perfmgr

  echo '请注意：'
  echo '1. Perfmgr可能导致日常流畅度下降，不玩游戏时建议关闭'
  echo '2. [SCENE-在线]配置方案会自动管理FEAS启用状态'
  echo '3. 手动修改CPU频率会导致Perfmgr失效(可重启手机恢复)'
  echo '4. 禁用Joyose仍可启用Perfmgr，但表现会略有不同'
}