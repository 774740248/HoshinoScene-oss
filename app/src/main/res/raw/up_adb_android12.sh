scene="com.omarea.vtools"

SOURCE_DAMON="/storage/emulated/0/Android/data/$scene/daemon"
SOURCE_BUSYBOX="/storage/emulated/0/Android/data/$scene/toolkit/busybox"
BINDER_SO="/storage/emulated/0/Android/data/$scene/binder.so"

STARTER_PATH="/data/local/tmp/scene-daemon"
TARGET_BUSYBOX="/data/local/tmp/toolkit/busybox"
TOOLKIT="/data/local/tmp/toolkit"

mkdir -p $TOOLKIT
# Env PATH add /data/local/tmp
export PATH=$PATH:$TOOLKIT

cp $SOURCE_DAMON $STARTER_PATH
chmod 777 $STARTER_PATH
echo 'Success: Copy [scene-daemon] to complete'

cp $SOURCE_BUSYBOX $TARGET_BUSYBOX
chmod 777 $TARGET_BUSYBOX
echo 'Success: Copy [busybox] to complete'

echo 'Install BusyBox……'
cd $TOOLKIT
for applet in `./busybox --list`; do
  case "$applet" in
  "sh"|"busybox"|"shell"|"swapon"|"swapoff"|"mkswap")
    echo '  Skip' > /dev/null
  ;;
  *)
    ./busybox ln -sf busybox "$applet";
  ;;
  esac
done
./busybox ln -sf busybox busybox_1_30_1

if [[ -f "$BINDER_SO" ]]; then
  cp -f "$BINDER_SO" /data/local/tmp/binder.so
fi


echo ''
nohup $STARTER_PATH >/dev/null 2>&1 &
if [[ $(pgrep scene-daemon) != "" ]]; then
  echo 'Scene-Daemon OK! ^_^'
else
  echo 'Scene-Daemon Fail! @_@'
fi

am start -n $scene/.activities.ActivityStartSplash --es port "$port" -f 0x10008000

cmd package compile -m speed $scene >/dev/null 2>&1 &

dumpsys deviceidle whitelist +$scene 2>&1 >/dev/null
cmd appops set $scene RUN_IN_BACKGROUND allow 2>&1 >/dev/null
cmd appops set $scene RUN_ANY_IN_BACKGROUND allow 2>&1 >/dev/null
am set-standby-bucket $scene active 2>&1 >/dev/null
am set-inactive --user 0 $scene false 2>&1 >/dev/null
am set-bg-restriction-level --user 0 $scene unrestricted 2>&1 >/dev/null
am set-foreground-service-delegate --user 0 com.omarea.vtools start 2>&1 >/dev/null
am unfreeze --sticky com.omarea.vtools 2>&1 >/dev/null

echo ''
