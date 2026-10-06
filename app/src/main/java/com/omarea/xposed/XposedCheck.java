package com.omarea.xposed;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public class XposedCheck {
    private static int check;

    public static boolean xposedIsRunning() {
        check %= 1;
        return false;
    }
}
