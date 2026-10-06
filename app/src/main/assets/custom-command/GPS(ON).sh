version=`getprop ro.build.version.sdk`

if [[ "$version" -gt 28 ]]; then
    settings put secure location_mode 3
elif [[ "$version" -gt 22 ]]; then
    settings put secure location_providers_allowed +gps
else
    settings put secure location_providers_allowed gps,network
fi