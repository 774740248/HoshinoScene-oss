package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class do1 {

    /* renamed from: a, reason: collision with root package name */
    public static final a.vu0 f102a;
    public static final a.ux0 b;

    static {
        int i = android.os.Build.VERSION.SDK_INT;
        if (i >= 29) {
            f102a = new a.vu0();
        } else if (i >= 28) {
            f102a = new a.fo1();
        } else {
            f102a = new a.fo1();
        }
        b = new a.ux0(16);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002b, code lost:
    
        if (r3.equals(r5) == false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Typeface a(android.content.Context r15, a.yi0 r16, android.content.res.Resources r17, int r18, java.lang.String r19, int r20, int r21, a.b20 r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.do1.a(android.content.Context, a.yi0, android.content.res.Resources, int, java.lang.String, int, int, a.b20, boolean):android.graphics.Typeface");
    }

    public static java.lang.String b(android.content.res.Resources resources, int i, java.lang.String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
    }
}
