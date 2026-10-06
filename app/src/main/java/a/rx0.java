package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class rx0 extends a.b20 {
    public final android.content.Context E;
    public final boolean F;
    public final android.content.SharedPreferences G;
    public final android.util.LruCache H;

    public rx0(android.content.Context context, boolean z, int i) {
        z = (i & 2) != 0 ? false : z;
        a.wv.w(context, "context");
        this.E = context;
        this.F = z;
        this.G = context.getSharedPreferences("IconCacheManager", 0);
        this.H = null;
    }

    public final a.io I1(java.lang.String str) {
        android.content.SharedPreferences sharedPreferences = this.G;
        if (!sharedPreferences.contains(str)) {
            M1(str);
        }
        java.lang.String string = sharedPreferences.getString(str, null);
        android.graphics.drawable.Drawable K1 = K1(str);
        if (string != null) {
            str = string;
        }
        return new a.io(K1, str);
    }

    public final java.lang.String J1(java.lang.String str) {
        java.lang.String str2 = this.F ? "logo_cache_xs/" : "logo_cache/";
        java.lang.String str3 = a.pe0.f434a;
        return a.pe0.d(this.E, a.ii1.f(str2, str, ".png"));
    }

    public final android.graphics.drawable.Drawable K1(java.lang.String str) {
        a.wv.w(str, "packageName");
        if (a.yi1.B2(str, ".")) {
            return null;
        }
        android.util.LruCache lruCache = this.H;
        android.graphics.drawable.Drawable drawable = lruCache != null ? (android.graphics.drawable.Drawable) lruCache.get(str) : null;
        if (drawable != null) {
            return drawable;
        }
        if (this.G.contains(str)) {
            android.graphics.Bitmap L1 = L1(str);
            android.graphics.drawable.BitmapDrawable bitmapDrawable = L1 != null ? new android.graphics.drawable.BitmapDrawable(L1) : null;
            if (bitmapDrawable == null) {
                M1(str);
            }
            drawable = bitmapDrawable;
        } else {
            M1(str);
        }
        if (drawable != null && lruCache != null) {
        }
        return drawable;
    }

    public final android.graphics.Bitmap L1(java.lang.String str) {
        android.graphics.Bitmap bitmap;
        a.wv.w(str, "packageName");
        try {
            java.io.FileInputStream fileInputStream = new java.io.FileInputStream(J1(str));
            android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
            options.inSampleSize = 1;
            bitmap = android.graphics.BitmapFactory.decodeStream(fileInputStream, null, options);
            fileInputStream.close();
        } catch (java.lang.Exception unused) {
            bitmap = null;
        }
        if (bitmap == null) {
            return null;
        }
        return bitmap;
    }

    public final void M1(java.lang.String str) {
        a.wv.w(str, "packageName");
        a.wv.v1(new a.qx0(this, str, null));
    }

    public final void N1(android.graphics.drawable.Drawable drawable, java.lang.String str) {
        a.wv.w(str, "packageName");
        android.graphics.Bitmap bitmap = null;
        if (this.F) {
            android.graphics.Bitmap O = a.b20.O(drawable);
            if (O != null) {
                bitmap = a.b20.A(O, 32, 32);
            }
        } else {
            android.graphics.Bitmap O2 = a.b20.O(drawable);
            if (O2 != null) {
                if (O2.getWidth() > 96) {
                    O2 = a.b20.A(O2, O2.getWidth() / 2, O2.getHeight() / 2);
                }
                bitmap = O2;
            }
        }
        a.fs1.M(bitmap, J1(str), java.lang.Boolean.TRUE);
    }
    public boolean q(a.q p0, a.p p1, a.p p2) {
        throw new UnsupportedOperationException("Method not decompiled: rx0.q");
    }
    public boolean p(a.q p0, java.lang.Object p1, java.lang.Object p2) {
        throw new UnsupportedOperationException("Method not decompiled: rx0.p");
    }
    public boolean o(a.q p0, a.m p1) {
        throw new UnsupportedOperationException("Method not decompiled: rx0.o");
    }
    public void U0(a.p p0, java.lang.Thread p1) {
        throw new UnsupportedOperationException("Method not decompiled: rx0.U0");
    }
    public void U(float p0, float p1, a.gh1 p2) {
        throw new UnsupportedOperationException("Method not decompiled: rx0.U");
    }
    public void T0(a.p p0, a.p p1) {
        throw new UnsupportedOperationException("Method not decompiled: rx0.T0");
    }
    public void N0(a.ej1 p0) {
        throw new UnsupportedOperationException("Method not decompiled: rx0.N0");
    }
    public void M0(android.graphics.Typeface p0, boolean p1) {
        throw new UnsupportedOperationException("Method not decompiled: rx0.M0");
    }
    public void L0(android.graphics.Typeface p0) {
        throw new UnsupportedOperationException("Method not decompiled: rx0.L0");
    }
    public void K0(int p0) {
        throw new UnsupportedOperationException("Method not decompiled: rx0.K0");
    }
    public void J0(java.lang.Throwable p0) {
        throw new UnsupportedOperationException("Method not decompiled: rx0.J0");
    }
}
