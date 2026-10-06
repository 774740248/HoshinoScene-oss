package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class wp {
    public static android.view.accessibility.AccessibilityNodeInfo k;
    public static java.lang.CharSequence l;
    public static java.lang.String m;
    public static java.lang.String n;

    /* renamed from: a, reason: collision with root package name */
    public final android.accessibilityservice.AccessibilityService f669a;
    public final a.e3 b;
    public int c;
    public int d;
    public final android.content.SharedPreferences e;
    public final a.tg1 f;
    public final java.util.ArrayList g;
    public final a.ab1 h;
    public final a.ab1 i;
    public long j;

    public wp(android.accessibilityservice.AccessibilityService accessibilityService) {
        a.wv.w(accessibilityService, "service");
        this.f669a = accessibilityService;
        this.b = new a.e3(accessibilityService.getApplicationContext(), 1);
        this.e = accessibilityService.getSharedPreferences("AUTO_SKIP_BLACKLIST", 0);
        this.f = new a.tg1(8);
        this.g = a.b20.f("android", "com.android.systemui", "com.miui.home", "com.tencent.mobileqq", "com.tencent.mm", "com.omarea.vtools", "com.omarea.gesture", "com.android.settings");
        this.h = new a.ab1("^[0-9]+[\\ss]*跳过[广告]*$");
        this.i = new a.ab1("^[点击]*跳过[广告]*[\\ss]{0,}[0-9]+$");
    }

    public final boolean a(android.graphics.Rect rect) {
        float f = rect.top;
        int i = this.d;
        float f2 = i - rect.bottom;
        float f3 = rect.left;
        int i2 = this.c;
        float f4 = i2 - rect.right;
        if (i > i2) {
            i = i2;
        }
        float f5 = i;
        float f6 = 0.3f * f5;
        float f7 = f5 * 0.28f;
        if (f > f7 && f2 > f7) {
            android.util.Log.d("@Scene", "Y Filter " + f + " " + f2 + " " + f7);
            return false;
        }
        if (f3 <= f6 || f4 <= f6) {
            return true;
        }
        android.util.Log.d("@Scene", "X Filter " + f3 + " " + f4 + " " + f6);
        return false;
    }
}
