p="com.omarea.vtools"
service=`dumpsys activity service $p/.AccessibilitySceneMode | grep SERVICE`
if [[ "$service" == "" ]]; then
  settings put secure accessibility_enabled 0
  services=`settings get secure enabled_accessibility_services`
  scene="$p/$p.AccessibilitySceneMode"
  include=`echo "$services" | grep "$scene"`
  if [ ! -n "$services" ]; then
    settings put secure enabled_accessibility_services "$scene"
  elif [ ! -n "$include" ]; then
    settings put secure enabled_accessibility_services "$services:$scene"
  fi
  settings put secure accessibility_enabled 1
fi
