perfmgr=/sys/module/mtk_fpsgo/parameters/perfmgr_enable
pandora_feas=/sys/module/perfmgr_mtk/parameters/perfmgr_enable
ged_kpi=/sys/module/sspm_v3/holders/ged/parameters/is_GED_KPI_enabled
if [[ -f $pandora_feas ]]; then
  perfmgr=$pandora_feas
fi
fpsgo=/sys/kernel/fpsgo/common/fpsgo_enable
fbt_ceiling=/sys/kernel/fpsgo/fbt/enable_ceiling
hybrid=/data/adb/modules/dimensity_hybrid_governor

dvfsrc_a=/sys/devices/platform/soc/1c00f000.dvfsrc
dvfsrc_b=/sys/devices/platform/1c00f000.dvfsrc
dvfsrc_c=/sys/devices/platform/1c013000.dvfsrc
dvfsrc_d=/sys/devices/platform/soc/1c100000.dvfsrc
dvfsrc_e=/sys/class/devfreq/mtk-dvfsrc-devfreq
dvfsrc_dir=''
if [[ -d $dvfsrc_a ]]; then
  dvfsrc_dir=$dvfsrc_a
elif [[ -d $dvfsrc_b ]]; then
  dvfsrc_dir=$dvfsrc_b
elif [[ -d $dvfsrc_c ]]; then
  dvfsrc_dir=$dvfsrc_c
elif [[ -d $dvfsrc_d ]]; then
  dvfsrc_dir=$dvfsrc_d
else
  dvfsrc_dir=$dvfsrc_e
fi
dvfsrc=$dvfsrc_dir/mtk-dvfsrc-devfreq/devfreq/mtk-dvfsrc-devfreq
dvfsrc_dir_name=$(basename $dvfsrc_dir)
dvfsrc2=${dvfsrc_dir}/${dvfsrc_dir_name}:dvfsrc-helper # ${dvfsrc_dir}/1c00f000.dvfsrc:dvfsrc-helper