package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public class fo1 extends a.eo1 {
    public final java.lang.Class j;
    public final java.lang.reflect.Constructor k;
    public final java.lang.reflect.Method l;
    public final java.lang.reflect.Method m;
    public final java.lang.reflect.Method n;
    public final java.lang.reflect.Method o;
    public final java.lang.reflect.Method p;

    public fo1() {
        java.lang.Class<?> cls;
        java.lang.reflect.Method method;
        java.lang.reflect.Constructor<?> constructor;
        java.lang.reflect.Method method2;
        java.lang.reflect.Method method3;
        java.lang.reflect.Method method4;
        java.lang.reflect.Method method5;
        try {
            cls = java.lang.Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new java.lang.Class[0]);
            method2 = M(cls);
            method3 = N(cls);
            method4 = cls.getMethod("freeze", new java.lang.Class[0]);
            method = cls.getMethod("abortCreation", new java.lang.Class[0]);
            method5 = O(cls);
        } catch (java.lang.ClassNotFoundException | java.lang.NoSuchMethodException e) {
            android.util.Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e.getClass().getName()), e);
            cls = null;
            method = null;
            constructor = null;
            method2 = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.j = cls;
        this.k = constructor;
        this.l = method2;
        this.m = method3;
        this.n = method4;
        this.o = method;
        this.p = method5;
    }

    public static java.lang.reflect.Method M(java.lang.Class cls) {
        java.lang.Class<?> cls2 = java.lang.Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", android.content.res.AssetManager.class, java.lang.String.class, cls2, java.lang.Boolean.TYPE, cls2, cls2, cls2, android.graphics.fonts.FontVariationAxis[].class);
    }

    public static java.lang.reflect.Method N(java.lang.Class cls) {
        java.lang.Class<?> cls2 = java.lang.Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", java.nio.ByteBuffer.class, cls2, android.graphics.fonts.FontVariationAxis[].class, cls2, cls2);
    }

    public final void G(java.lang.Object obj) {
        try {
            this.o.invoke(obj, new java.lang.Object[0]);
        } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException unused) {
        }
    }

    public final boolean H(android.content.Context context, java.lang.Object obj, java.lang.String str, int i, int i2, int i3, android.graphics.fonts.FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((java.lang.Boolean) this.l.invoke(obj, context.getAssets(), str, 0, java.lang.Boolean.FALSE, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException unused) {
            return false;
        }
    }

    public android.graphics.Typeface I(java.lang.Object obj) {
        try {
            java.lang.Object newInstance = java.lang.reflect.Array.newInstance((java.lang.Class<?>) this.j, 1);
            java.lang.reflect.Array.set(newInstance, 0, obj);
            return (android.graphics.Typeface) this.p.invoke(null, newInstance, -1, -1);
        } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean J(java.lang.Object obj) {
        try {
            return ((java.lang.Boolean) this.n.invoke(obj, new java.lang.Object[0])).booleanValue();
        } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean K() {
        java.lang.reflect.Method method = this.l;
        if (method == null) {
            android.util.Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return method != null;
    }

    public final java.lang.Object L() {
        try {
            return this.k.newInstance(new java.lang.Object[0]);
        } catch (java.lang.IllegalAccessException | java.lang.InstantiationException | java.lang.reflect.InvocationTargetException unused) {
            return null;
        }
    }

    public java.lang.reflect.Method O(java.lang.Class cls) {
        java.lang.Class cls2 = java.lang.Integer.TYPE;
        java.lang.reflect.Method declaredMethod = android.graphics.Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", java.lang.reflect.Array.newInstance((java.lang.Class<?>) cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // a.eo1, a.vu0
    public final android.graphics.Typeface v(android.content.Context context, a.zi0 zi0Var, android.content.res.Resources resources, int i) {
        if (!K()) {
            return super.v(context, zi0Var, resources, i);
        }
        java.lang.Object L = L();
        if (L == null) {
            return null;
        }
        for (a.aj0 aj0Var : zi0Var.f737a) {
            if (!H(context, L, aj0Var.f13a, aj0Var.e, aj0Var.b, aj0Var.c ? 1 : 0, android.graphics.fonts.FontVariationAxis.fromFontVariationSettings(aj0Var.d))) {
                G(L);
                return null;
            }
        }
        if (J(L)) {
            return I(L);
        }
        return null;
    }

    @Override // a.vu0
    public final android.graphics.Typeface w(android.content.Context context, a.cj0[] cj0VarArr, int i) {
        android.graphics.Typeface I;
        if (cj0VarArr.length < 1) {
            return null;
        }
        if (!K()) {
            a.cj0 A = A(i, cj0VarArr);
            try {
                android.os.ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(A.f73a, "r", null);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                try {
                    android.graphics.Typeface build = new android.graphics.Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(A.c).setItalic(A.d).build();
                    openFileDescriptor.close();
                    return build;
                } finally {
                }
            } catch (java.io.IOException unused) {
                return null;
            }
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        for (a.cj0 cj0Var : cj0VarArr) {
            if (cj0Var.e == 0) {
                android.net.Uri uri = cj0Var.f73a;
                if (!hashMap.containsKey(uri)) {
                    hashMap.put(uri, a.wv.S0(context, uri));
                }
            }
        }
        java.util.Map unmodifiableMap = java.util.Collections.unmodifiableMap(hashMap);
        java.lang.Object L = L();
        if (L == null) {
            return null;
        }
        int length = cj0VarArr.length;
        int i2 = 0;
        boolean z = false;
        while (i2 < length) {
            a.cj0 cj0Var2 = cj0VarArr[i2];
            java.nio.ByteBuffer byteBuffer = (java.nio.ByteBuffer) unmodifiableMap.get(cj0Var2.f73a);
            if (byteBuffer != null) {
                if (!((java.lang.Boolean) this.m.invoke(L, byteBuffer, java.lang.Integer.valueOf(cj0Var2.b), null, java.lang.Integer.valueOf(cj0Var2.c), java.lang.Integer.valueOf(cj0Var2.d ? 1 : 0))).booleanValue()) {
                    G(L);
                    return null;
                }
                z = true;
            }
            i2++;
            z = z;
        }
        if (!z) {
            G(L);
            return null;
        }
        if (J(L) && (I = I(L)) != null) {
            return android.graphics.Typeface.create(I, i);
        }
        return null;
    }

    @Override // a.vu0
    public final android.graphics.Typeface y(android.content.Context context, android.content.res.Resources resources, int i, java.lang.String str, int i2) {
        if (!K()) {
            return super.y(context, resources, i, str, i2);
        }
        java.lang.Object L = L();
        if (L == null) {
            return null;
        }
        if (!H(context, L, str, 0, -1, -1, null)) {
            G(L);
            return null;
        }
        if (J(L)) {
            return I(L);
        }
        return null;
    }
}
