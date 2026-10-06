debugfs=$(grep -e "^debugfs" /proc/mounts | head -1 | awk '{print $2}')

check() {
  if [[ -e $debugfs/opp/cpu0 ]]; then
    echo 1
  fi
}

get() {
  for file in /sys/devices/system/cpu/cpufreq/policy*; do
    cpu=$(basename "$file" | sed 's/policy//')
    echo "CPU $(cat "$file/affected_cpus")"
    for freq in $(cat /sys/devices/system/cpu/cpu${cpu}/cpufreq/scaling*frequencies); do
      opp_value=$(cat "$debugfs/opp/cpu$cpu/opp:${freq}000/supply-0/u_volt_target")
      echo $freq $opp_value
    done
  done
}

$1