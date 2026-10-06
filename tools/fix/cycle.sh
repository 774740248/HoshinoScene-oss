#!/usr/bin/env bash
# Iteratively run all mechanical fixers against the latest build log until the
# error count stops improving.
set -u
cd /workspace/hoshino-scene-recovered
LOG=${1:-/tmp/build.log}
ITER=0
while [ $ITER -lt 8 ]; do
  ITER=$((ITER+1))
  echo "===== CYCLE $ITER ====="
  python3 tools/fix/fix_cast_object2.py         "$LOG" || true
  python3 tools/fix/resolve_register_leaks.py   "$LOG" || true
  python3 tools/fix/rename_typed_receivers.py --apply "$LOG" || true
  python3 tools/fix/apply_lib_member_names.py --apply  "$LOG" || true

  gradle :app:compileDebugJavaWithJavac --offline --rerun-tasks > /tmp/cycle.log 2>&1
  NEW=$(grep -E '^ *[0-9,]+ errors?$' /tmp/cycle.log | tail -1 | tr -dc '0-9')
  OLD=$(grep -E '^ *[0-9,]+ errors?$' "$LOG" | tail -1 | tr -dc '0-9')
  echo "old=$OLD new=$NEW"
  cp /tmp/cycle.log "$LOG"
  if [ "$NEW" -ge "$OLD" ]; then
    echo "no improvement, stopping"
    break
  fi
done
echo "final: $(grep -E '^ *[0-9,]+ errors?$' "$LOG" | tail -1)"
