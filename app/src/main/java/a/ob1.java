package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public class ob1 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f406a;
    public final a.ab1 b;

    public ob1(android.content.Context context) {
        a.wv.w(context, "context");
        this.f406a = context;
        this.b = new a.ab1("@(string|dimen)[:/][_a-z][_0-9a-z]+", 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x0022 -> B:8:0x0023). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String a(java.lang.String r17, boolean r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            java.lang.String r2 = "originRow"
            a.wv.w(r1, r2)
            a.ab1 r2 = r0.b
            r3 = 0
            a.jy0 r4 = r2.a(r3, r1)
            r5 = 0
            if (r4 == 0) goto L22
            a.iy0 r4 = r4.c
            if (r4 == 0) goto L22
            a.hy0 r4 = a.qv.f2(r4)
            a.hy0 r4 = (a.hy0) r4
            if (r4 == 0) goto L22
            java.lang.String r4 = r4.f223a
            goto L23
        L22:
            r4 = r5
        L23:
            if (r4 == 0) goto Lf4
            java.lang.String r6 = ":"
            boolean r6 = a.yi1.g2(r4, r6)
            if (r6 == 0) goto L34
            r6 = 58
            java.lang.Character r6 = java.lang.Character.valueOf(r6)
            goto L44
        L34:
            java.lang.String r6 = "/"
            boolean r6 = a.yi1.g2(r4, r6)
            if (r6 == 0) goto L43
            r6 = 47
            java.lang.Character r6 = java.lang.Character.valueOf(r6)
            goto L44
        L43:
            r6 = r5
        L44:
            if (r6 == 0) goto Lc8
            android.content.Context r7 = r0.f406a
            android.content.res.Resources r8 = r7.getResources()
            char r9 = r6.charValue()
            r10 = 6
            int r9 = a.yi1.l2(r4, r9, r3, r10)
            r11 = 1
            java.lang.String r9 = r4.substring(r11, r9)
            java.lang.String r12 = "this as java.lang.String…ing(startIndex, endIndex)"
            a.wv.v(r9, r12)
            java.util.Locale r13 = java.util.Locale.ENGLISH
            java.lang.String r14 = "ENGLISH"
            java.lang.String r15 = "this as java.lang.String).toLowerCase(locale)"
            java.lang.String r9 = a.ai1.k(r13, r14, r9, r13, r15)
            char r6 = r6.charValue()
            int r6 = a.yi1.l2(r4, r6, r3, r10)
            int r6 = r6 + r11
            java.lang.String r6 = r4.substring(r6)
            java.lang.String r11 = "this as java.lang.String).substring(startIndex)"
            a.wv.v(r6, r11)
            java.lang.String r7 = r7.getPackageName()     // Catch: java.lang.Exception -> La6
            int r6 = r8.getIdentifier(r6, r9, r7)     // Catch: java.lang.Exception -> La6
            java.lang.String r7 = "string"
            boolean r7 = a.wv.e(r9, r7)     // Catch: java.lang.Exception -> La6
            if (r7 == 0) goto L95
            java.lang.String r6 = r8.getString(r6)     // Catch: java.lang.Exception -> La6
            java.lang.String r7 = "resources.getString(id)"
            a.wv.v(r6, r7)     // Catch: java.lang.Exception -> La6
            goto Lca
        L95:
            java.lang.String r7 = "dimen"
            boolean r7 = a.wv.e(r9, r7)     // Catch: java.lang.Exception -> La6
            if (r7 == 0) goto Lc8
            float r6 = r8.getDimension(r6)     // Catch: java.lang.Exception -> La6
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch: java.lang.Exception -> La6
            goto Lca
        La6:
            java.lang.String r6 = "[("
            boolean r7 = a.yi1.g2(r4, r6)
            if (r7 == 0) goto Lc8
            java.lang.String r7 = ")]"
            boolean r8 = a.yi1.g2(r4, r7)
            if (r8 == 0) goto Lc8
            int r6 = a.yi1.m2(r4, r6, r3, r3, r10)
            int r6 = r6 + 2
            int r7 = a.yi1.m2(r4, r7, r3, r3, r10)
            java.lang.String r6 = r4.substring(r6, r7)
            a.wv.v(r6, r12)
            goto Lca
        Lc8:
            java.lang.String r6 = ""
        Lca:
            if (r18 == 0) goto Lda
            int r7 = r6.length()
            if (r7 <= 0) goto Lda
            java.lang.String r7 = "&"
            java.lang.String r8 = "&amp;"
            java.lang.String r6 = a.yi1.v2(r6, r7, r8)
        Lda:
            java.lang.String r1 = a.yi1.v2(r1, r4, r6)
            a.jy0 r4 = r2.a(r3, r1)
            if (r4 == 0) goto L22
            a.iy0 r4 = r4.c
            if (r4 == 0) goto L22
            a.hy0 r4 = a.qv.f2(r4)
            a.hy0 r4 = (a.hy0) r4
            if (r4 == 0) goto L22
            java.lang.String r4 = r4.f223a
            goto L23
        Lf4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: a.ob1.a(java.lang.String, boolean):java.lang.String");
    }
}
