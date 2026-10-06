support() {
  os_version="$(getprop ro.build.version.oplusrom)"
  if [[ "$os_version" > "V16.1.0" || "$os_version" == "V16.1.0" ]]; then
    echo 0 # 因为官方给Scene加白名单了，咱就不管闲事咯
    # echo 1
  fi
}

switch(){
  name="safe_accessibility_turn_off_whitelist"
  values='<filter-conf>
    <isOpen>1</isOpen>
    <filter-name>233</filter-name>
    <version>666</version>
    <accessibility_turn_off_switch>'$state'</accessibility_turn_off_switch>
    <accessibility_turn_off_skip_package>com.omarea.vtools</accessibility_turn_off_skip_package>
  </filter-conf>'

  provider=content://com.oplus.romupdate.provider.db/update_list
  version=$(date +%Y%m%d%H%M)
  values=$(echo "$values" | sed "s|<filter-name>.*</filter-name>|<filter-name>$name</filter-name>|g")
  values=$(echo "$values" | sed "s|<version>.*</version>|<version>$version</version>|g")
  values=$(echo "$values" | sed 's/:/\\:/g')

  content delete --uri $provider --where "filterName='$name'"
  content insert --uri $provider --bind filterName:s:$name --bind version:s:$version --bind xml:s:"$values" --bind isOpen:i:1
  settings put secure accessibility_turn_off_switch "$state"
}

$1