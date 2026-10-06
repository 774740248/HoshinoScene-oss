package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class mo extends a.b20 {
    public final android.content.Context E;
    public final int F;
    public final a.vj1 G;
    public final a.vj1 H;
    public final a.vj1 I;
    public final android.util.LruCache J;
    public android.content.pm.PackageManager K;

    public mo(android.content.Context context, int i, int i2) {
        a.wv.w(context, "context");
        this.E = context;
        this.F = i2;
        this.G = new a.vj1(new a.jo(this, 0));
        this.H = new a.vj1(new a.jo(this, 1));
        this.I = new a.vj1(new a.jo(this, 2));
        this.J = i < 1 ? null : new android.util.LruCache(i);
    }

    public final android.graphics.drawable.Drawable I1(java.lang.String str) {
        return a.wv.e(str, "com.tencent.mm:appbrand") ? (android.graphics.drawable.Drawable) this.I.a() : a.wv.e(str, "standby") ? (android.graphics.drawable.Drawable) this.H.a() : (android.graphics.drawable.Drawable) this.G.a();
    }

    public final android.content.pm.PackageManager J1() {
        if (this.K == null) {
            this.K = this.E.getPackageManager();
        }
        android.content.pm.PackageManager packageManager = this.K;
        a.wv.s(packageManager);
        return packageManager;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v5, types: [a.f, a.e30] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    public final a.e30 K1(java.lang.String str) {
        a.wv.w(str, "packageName");
        a.ty tyVar = a.z80.b;
        a.ko koVar = new a.ko(this, str, null);
        int i = 2 & 1;
        a.ty tyVar2 = a.ob0.c;
        if (i != 0) {
            tyVar = tyVar2;
        }
        int i2 = (2 & 2) != 0 ? 1 : 0;
        a.ty W = a.wv.W(tyVar2, tyVar, true);
        a.u20 u20Var = a.z80.f728a;
        if (W != u20Var && W.g(a.gy.c) == null) {
            W = W.c(u20Var);
        }
        java.lang.Object zu0Var = i2 == 2 ? new a.zu0(W, koVar) : new a.f(W, true);
        /* TODO: jadx type unresolved, defaulted to Object */
        zu0Var.S(i2, zu0Var, koVar);
        return (e30) (zu0Var);
    }

    public final android.graphics.drawable.Drawable L1(com.omarea.model.AppInfo appInfo) {
        java.lang.CharSequence charSequence;
        android.content.pm.ApplicationInfo applicationInfo;
        a.wv.w(appInfo, "item");
        android.graphics.drawable.Drawable drawable = null;
        android.util.LruCache lruCache = this.J;
        android.graphics.drawable.Drawable drawable2 = lruCache != null ? (android.graphics.drawable.Drawable) lruCache.get(appInfo.getPackageName()) : null;
        if (drawable2 != null) {
            return drawable2;
        }
        android.graphics.drawable.Drawable M1 = M1(appInfo.getPackageName());
        if (M1 != null || (charSequence = appInfo.path) == null) {
            return M1;
        }
        if (charSequence.length() != 0) {
            try {
                java.io.File file = new java.io.File(appInfo.path.toString());
                if (!file.exists() || !file.canRead()) {
                    return M1;
                }
                android.content.pm.PackageInfo packageArchiveInfo = J1().getPackageArchiveInfo(file.getAbsolutePath(), 1);
                M1 = (packageArchiveInfo == null || (applicationInfo = packageArchiveInfo.applicationInfo) == null) ? null : applicationInfo.loadIcon(J1());
                if (M1 != null) {
                    int i = this.F;
                    drawable = a.b20.B(M1, i, i);
                }
                try {
                    java.lang.String packageName = appInfo.getPackageName();
                    if (lruCache != null && drawable != null) {
                        lruCache.put(packageName, drawable);
                    }
                } catch (java.lang.Exception unused) {
                }
            } catch (java.lang.Exception unused2) {
                return M1;
            }
        }
        return drawable;
    }

    public final android.graphics.drawable.Drawable M1(java.lang.String str) {
        android.graphics.drawable.Drawable drawable;
        a.wv.w(str, "packageName");
        android.graphics.drawable.Drawable drawable2 = null;
        android.util.LruCache lruCache = this.J;
        android.graphics.drawable.Drawable drawable3 = lruCache != null ? (android.graphics.drawable.Drawable) lruCache.get(str) : null;
        if (drawable3 != null) {
            return drawable3;
        }
        try {
            android.content.pm.ApplicationInfo applicationInfo = J1().getPackageInfo(str, 0).applicationInfo;
            if (applicationInfo == null || (drawable = applicationInfo.loadIcon(J1())) == null) {
                drawable = I1(str);
            }
        } catch (java.lang.Exception unused) {
            drawable = null;
        }
        if (drawable != null) {
            int i = this.F;
            drawable2 = a.b20.B(drawable, i, i);
        }
        if (lruCache != null && drawable2 != null) {
            lruCache.put(str, drawable2);
        }
        return drawable2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v5, types: [a.f, a.e30] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    public final a.e30 N1(java.lang.String str) {
        a.wv.w(str, "packageName");
        a.ty tyVar = a.z80.b;
        a.lo loVar = new a.lo(this, str, null);
        int i = 2 & 1;
        a.ty tyVar2 = a.ob0.c;
        if (i != 0) {
            tyVar = tyVar2;
        }
        int i2 = (2 & 2) != 0 ? 1 : 0;
        a.ty W = a.wv.W(tyVar2, tyVar, true);
        a.u20 u20Var = a.z80.f728a;
        if (W != u20Var && W.g(a.gy.c) == null) {
            W = W.c(u20Var);
        }
        java.lang.Object zu0Var = i2 == 2 ? new a.zu0(W, loVar) : new a.f(W, true);
        /* TODO: jadx type unresolved, defaulted to Object */
        zu0Var.S(i2, zu0Var, loVar);
        return (e30) (zu0Var);
    }

    public /* synthetic */ mo(android.content.Context context, int i, int i2, int i3) {
        this(context, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? 128 : 0);
    }
    public boolean q(a.q p0, a.p p1, a.p p2) {
        throw new UnsupportedOperationException("Method not decompiled: mo.q");
    }
    public boolean p(a.q p0, java.lang.Object p1, java.lang.Object p2) {
        throw new UnsupportedOperationException("Method not decompiled: mo.p");
    }
    public boolean o(a.q p0, a.m p1) {
        throw new UnsupportedOperationException("Method not decompiled: mo.o");
    }
    public void U0(a.p p0, java.lang.Thread p1) {
        throw new UnsupportedOperationException("Method not decompiled: mo.U0");
    }
    public void U(float p0, float p1, a.gh1 p2) {
        throw new UnsupportedOperationException("Method not decompiled: mo.U");
    }
    public void T0(a.p p0, a.p p1) {
        throw new UnsupportedOperationException("Method not decompiled: mo.T0");
    }
    public void N0(a.ej1 p0) {
        throw new UnsupportedOperationException("Method not decompiled: mo.N0");
    }
    public void M0(android.graphics.Typeface p0, boolean p1) {
        throw new UnsupportedOperationException("Method not decompiled: mo.M0");
    }
    public void L0(android.graphics.Typeface p0) {
        throw new UnsupportedOperationException("Method not decompiled: mo.L0");
    }
    public void K0(int p0) {
        throw new UnsupportedOperationException("Method not decompiled: mo.K0");
    }
    public void J0(java.lang.Throwable p0) {
        throw new UnsupportedOperationException("Method not decompiled: mo.J0");
    }
}
