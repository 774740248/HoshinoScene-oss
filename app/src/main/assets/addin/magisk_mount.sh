MODDIR=${0%/*}

# MODDIR=/data/adb/modules/scene_systemless

# replace_files /my_product
replace_files() {
  folder="$1"
  find "$MODDIR/$folder" -type f 2>/dev/null | while read -r src; do
    dst="${src#$MODDIR}"
    [[ -f "$dst" ]] && mount --bind "$src" "$dst"
  done
}

# 通过 OverlayFS 挂载目录
overlay_mount(){
  parent=$1
  folder=$2
  if [[ "$folder" == "" ]]; then
    folder="$parent"
  fi
  src=$MODDIR/$parent
  any=$(find "$src" -mindepth 1 -type f | head -1)
  # 目录下有文件才执行挂载
  if [[ "$any" != "" ]]; then
    tmp=/dev/swap_$parent
    mkdir -p $tmp && /system/bin/cp -af --preserve=all "$src" "$tmp"
    mount -t overlay -o lowerdir="$tmp/$folder:$folder" overlay $folder
  fi
}

# 需要手动挂载的目录
mount_folders='my_product my_heytap my_stock odm'
if [[ "$KSU" == "true" ]] || [[ $(which ksud) != "" ]] || [[ $(which apd) != "" ]]; then
  mount_folders='my_product my_heytap my_stock'
fi

for parent in $mount_folders; do
  if [ -d "$MODDIR/$parent" ] && [ -d "/$parent" ]; then
    overlay_mount $parent || replace_files $parent
  fi
done
