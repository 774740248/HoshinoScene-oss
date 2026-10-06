mode=$(cat /data/vendor/thermal/config/thermal.current.ini)

name=""
case "$mode" in
  *"default")
    name="@string:kr_system_default"
   ;;
  *"cool")
    name="清爽酷凉 (cool)"
   ;;
  *"pro")
    name="深度定制 (pro)"
  ;;
  *"extreme")
    name="极致性能 (extreme)"
  ;;
  *"danger")
    name="丧心病狂 (danger)"
  ;;
  *)
    name="未替换"
  ;;
esac

echo "当前：$name"
