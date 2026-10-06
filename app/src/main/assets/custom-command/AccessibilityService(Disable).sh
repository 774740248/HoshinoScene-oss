p="com.omarea.vtools"
service=`dumpsys activity service $p/.AccessibilitySceneMode | grep SERVICE`
if [[ "$service" != "" ]]; then
  settings put secure accessibility_enabled 0
  services=`settings get secure enabled_accessibility_services`
  scene="$p/$p.AccessibilitySceneMode"
  include=`echo "$services" | grep "$scene"`
  if [ -n "$include" ]; then
    IFS=":"
    new_str=""
    for service in $services
    do
      if [[ "$service" != "$scene" ]]; then
       if [[ ! -n "$new_str" ]]; then
         new_str="$service"
       else
         new_str="$new_str:$service"
       fi
      fi
    done
    settings put secure enabled_accessibility_services "$new_str"
    IFS=" "
    # echo $new_str
  fi
  settings put secure accessibility_enabled 1
fi
