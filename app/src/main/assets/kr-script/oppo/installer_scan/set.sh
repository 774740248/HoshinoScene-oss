#!/system/bin/sh

pm_cmd="uninstall"
pm_cmd2="disable"
if [[ "$state" = "1" ]]; then
    pm_cmd="install-existing"
    pm_cmd2="enable"
fi

echo ''
echo ''

pm $pm_cmd --user ${ANDROID_UID} com.oplus.appdetail 2> /dev/null
pm $pm_cmd2 com.coloros.phonemanager/com.oplus.phonemanager.virusdetect.service.AutoTestScanApksService 2> /dev/null