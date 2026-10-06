package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class vd0 extends a.b20 {
    public final android.content.Context E;
    public final int F;
    public final android.util.LruCache G;
    public final java.util.HashSet H;
    public final a.vj1 I;
    public final java.util.HashSet J;
    public final java.util.HashSet K;

    public vd0(android.content.Context context) {
        a.wv.w(context, "context");
        this.E = context;
        this.F = 128;
        this.G = new android.util.LruCache(128);
        this.H = new java.util.HashSet();
        this.I = new a.vj1(new a.cd1(15, this));
        this.J = a.oe0.b;
        this.K = a.oe0.c;
    }

    public static android.graphics.Bitmap N1(android.graphics.Bitmap bitmap, int i) {
        if (bitmap.getWidth() <= i && bitmap.getHeight() <= i) {
            return bitmap;
        }
        float f = i;
        float min = java.lang.Math.min(f / bitmap.getWidth(), f / bitmap.getHeight());
        android.graphics.Bitmap createScaledBitmap = android.graphics.Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * min), (int) (bitmap.getHeight() * min), true);
        a.wv.v(createScaledBitmap, "createScaledBitmap(\n    …           true\n        )");
        return createScaledBitmap;
    }

    public final android.content.pm.PackageManager I1() {
        java.lang.Object a2 = this.I.a();
        a.wv.v(a2, "<get-pm>(...)");
        return (android.content.pm.PackageManager) a2;
    }

    public final android.graphics.drawable.Drawable J1(java.lang.String str) {
        android.content.pm.ApplicationInfo applicationInfo;
        try {
            android.content.pm.PackageInfo packageArchiveInfo = I1().getPackageArchiveInfo(str, 1);
            if (packageArchiveInfo == null || (applicationInfo = packageArchiveInfo.applicationInfo) == null) {
                return null;
            }
            applicationInfo.sourceDir = str;
            applicationInfo.publicSourceDir = str;
            android.graphics.drawable.Drawable loadIcon = applicationInfo.loadIcon(I1());
            if (loadIcon == null) {
                return null;
            }
            int i = this.F;
            return a.b20.B(loadIcon, i, i);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public final android.graphics.drawable.Drawable K1(java.lang.String str) {
        android.content.pm.ApplicationInfo applicationInfo;
        android.graphics.drawable.Drawable loadIcon;
        try {
            android.content.pm.PackageInfo packageInfo = I1().getPackageInfo(str, 0);
            if (packageInfo == null || (applicationInfo = packageInfo.applicationInfo) == null || (loadIcon = applicationInfo.loadIcon(I1())) == null) {
                return null;
            }
            int i = this.F;
            return a.b20.B(loadIcon, i, i);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public final void L1(a.mc1 mc1Var, android.widget.ImageView imageView) {
        a.wv.w(mc1Var, "file");
        a.wv.w(imageView, "imageView");
        java.lang.String str = mc1Var.c;
        imageView.setTag(str);
        boolean z = mc1Var.f343a;
        if (!z) {
            java.lang.String str2 = (java.lang.String) a.qv.m2(a.yi1.y2(mc1Var.b, new java.lang.String[]{"."}));
            if (a.qv.d2(a.oe0.f, str2)) {
                imageView.setImageResource(2131231242);
                return;
            } else if (a.qv.d2(a.oe0.e, str2)) {
                imageView.setImageResource(2131231297);
                return;
            } else if (a.wv.e(str2, "img")) {
                imageView.setImageResource(2131230927);
                return;
            }
        }
        imageView.setImageResource(z ? 2131230938 : 2131230931);
        android.graphics.drawable.Drawable drawable = (android.graphics.drawable.Drawable) this.G.get(str);
        if (drawable != null) {
            imageView.setImageDrawable(drawable);
        } else {
            if (this.H.contains(str)) {
                return;
            }
            a.wv.M0(a.wv.b(a.z80.b), null, new a.ud0(this, mc1Var, imageView, str, null), 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:132:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0102 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0115 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.drawable.Drawable M1(a.mc1 r18) {
        /*
            Method dump skipped, instructions count: 526
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.vd0.M1(a.mc1):android.graphics.drawable.Drawable");
    }
    public boolean q(a.q p0, a.p p1, a.p p2) {
        throw new UnsupportedOperationException("Method not decompiled: vd0.q");
    }
    public boolean p(a.q p0, java.lang.Object p1, java.lang.Object p2) {
        throw new UnsupportedOperationException("Method not decompiled: vd0.p");
    }
    public boolean o(a.q p0, a.m p1) {
        throw new UnsupportedOperationException("Method not decompiled: vd0.o");
    }
    public void U0(a.p p0, java.lang.Thread p1) {
        throw new UnsupportedOperationException("Method not decompiled: vd0.U0");
    }
    public void U(float p0, float p1, a.gh1 p2) {
        throw new UnsupportedOperationException("Method not decompiled: vd0.U");
    }
    public void T0(a.p p0, a.p p1) {
        throw new UnsupportedOperationException("Method not decompiled: vd0.T0");
    }
    public void N0(a.ej1 p0) {
        throw new UnsupportedOperationException("Method not decompiled: vd0.N0");
    }
    public void M0(android.graphics.Typeface p0, boolean p1) {
        throw new UnsupportedOperationException("Method not decompiled: vd0.M0");
    }
    public void L0(android.graphics.Typeface p0) {
        throw new UnsupportedOperationException("Method not decompiled: vd0.L0");
    }
    public void K0(int p0) {
        throw new UnsupportedOperationException("Method not decompiled: vd0.K0");
    }
    public void J0(java.lang.Throwable p0) {
        throw new UnsupportedOperationException("Method not decompiled: vd0.J0");
    }
}
