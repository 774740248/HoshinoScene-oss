#!/usr/bin/env bash
# measure.sh -- run a full (non-incremental) javac compile and print the
# authoritative error count from javac's own summary line.
#
# Usage: tools/fix/measure.sh  [logfile]
set -u
cd "$(dirname "$0")/../.." || exit 1
LOG="${1:-/tmp/errout}"
rm -f "$LOG"
gradle :app:compileDebugJavaWithJavac --offline --rerun-tasks > "$LOG" 2>&1
EXIT=$?
# javac prints "N errors" (and repeats it in the Gradle failure block)
COUNT=$(grep -oE '[0-9,]+ errors?' "$LOG" | head -1 | tr -dc '0-9' )
if [ -z "$COUNT" ]; then
  if [ $EXIT -eq 0 ]; then COUNT=0; else COUNT="?"; fi
fi
UNIQ=$(head -10805 "$LOG" 2>/dev/null | grep -E 'error:' | sed -E 's/:[0-9]+:/:/' | sort -u | wc -l | tr -d ' ')
echo "javac_exit=$EXIT"
echo "javac_errors=$COUNT"
echo "unique_error_lines=$UNIQ"
echo "log=$LOG"
