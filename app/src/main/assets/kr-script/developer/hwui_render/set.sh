#!/system/bin/sh

source ./kr-script/common/props.sh

ANDROID_SDK=`getprop ro.build.version.sdk`

prop="debug.hwui.renderer"
magisk_set_system_prop $prop $renderer
if [[ "$?" = "1" ]];
then
    echo "已通过Magisk更改 $prop，需要重启才能生效！"
else
    set_system_prop $prop $renderer
fi

if [[ "$ANDROID_SDK" = 28 ]]
then
    if [[ "$renderer" = "opengl" ]]
    then
        echo '在Android P系统使用OpenGL作为HWUI渲染引擎，可能会导致Webview异常，打开网页时闪退！' 1>&2
    elif [[ "$renderer" = "skiavk" ]]
    then
        echo '在Android P系统使用Skia Vulkan作为HWUI渲染引擎，可能导致Webview界面红屏，视频播放界面蓝屏，无法截图' 1>&2
    fi
fi
