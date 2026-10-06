package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class lb1 {
    public static a.lb1 g;

    /* renamed from: a, reason: collision with root package name */
    public java.util.WeakHashMap f315a;
    public final java.util.WeakHashMap b = new java.util.WeakHashMap(0);
    public android.util.TypedValue c;
    public boolean d;
    public a.mm e;
    public static final android.graphics.PorterDuff.Mode f = android.graphics.PorterDuff.Mode.SRC_IN;
    public static final a.kb1 h = (kb1) new a.ux0(6);

    public static synchronized a.lb1 c() {
        a.lb1 lb1Var;
        synchronized (a.lb1.class) {
            try {
                if (g == null) {
                    g = new a.lb1();
                }
                lb1Var = g;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return lb1Var;
    }

    public static synchronized android.graphics.PorterDuffColorFilter g(int i, android.graphics.PorterDuff.Mode mode) {
        android.graphics.PorterDuffColorFilter porterDuffColorFilter;
        synchronized (a.lb1.class) {
            a.kb1 kb1Var = h;
            kb1Var.getClass();
            int i2 = (31 + i) * 31;
            porterDuffColorFilter = (android.graphics.PorterDuffColorFilter) kb1Var.a(java.lang.Integer.valueOf(mode.hashCode() + i2));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new android.graphics.PorterDuffColorFilter(i, mode);
            }
        }
        return porterDuffColorFilter;
    }

    public final synchronized void a(android.content.Context context, long j, android.graphics.drawable.Drawable drawable) {
        try {
            android.graphics.drawable.Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                a.sx0 sx0Var = (a.sx0) this.b.get(context);
                if (sx0Var == null) {
                    sx0Var = new a.sx0();
                    this.b.put(context, sx0Var);
                }
                sx0Var.e(j, new java.lang.ref.WeakReference(constantState));
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    public final android.graphics.drawable.Drawable b(android.content.Context context, int i) {
        if (this.c == null) {
            this.c = new android.util.TypedValue();
        }
        android.util.TypedValue typedValue = this.c;
        context.getResources().getValue(i, typedValue, true);
        long j = (typedValue.assetCookie << 32) | typedValue.data;
        android.graphics.drawable.Drawable d = d(context, j);
        if (d != null) {
            return d;
        }
        android.graphics.drawable.LayerDrawable layerDrawable = null;
        if (this.e != null) {
            if (i == 2131230776) {
                layerDrawable = new android.graphics.drawable.LayerDrawable(new android.graphics.drawable.Drawable[]{f(context, 2131230775), f(context, 2131230777)});
            } else if (i == 2131230811) {
                layerDrawable = a.mm.f(this, context, 2131165245);
            } else if (i == 2131230810) {
                layerDrawable = a.mm.f(this, context, 2131165246);
            } else if (i == 2131230812) {
                layerDrawable = a.mm.f(this, context, 2131165247);
            }
        }
        if (layerDrawable != null) {
            layerDrawable.setChangingConfigurations(typedValue.changingConfigurations);
            a(context, j, layerDrawable);
        }
        return layerDrawable;
    }

    public final synchronized android.graphics.drawable.Drawable d(android.content.Context context, long j) {
        a.sx0 sx0Var = (a.sx0) this.b.get(context);
        if (sx0Var == null) {
            return null;
        }
        java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) sx0Var.d(j, null);
        if (weakReference != null) {
            android.graphics.drawable.Drawable.ConstantState constantState = (android.graphics.drawable.Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            int m = a.wv.m(sx0Var.d, sx0Var.f, j);
            if (m >= 0) {
                java.lang.Object[] objArr = sx0Var.e;
                java.lang.Object obj = objArr[m];
                java.lang.Object obj2 = a.sx0.g;
                if (obj != obj2) {
                    objArr[m] = obj2;
                    sx0Var.c = true;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0052, code lost:
    
        a.i90.i(r0, r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized android.graphics.drawable.Drawable e(int r9, android.content.Context r10, boolean r11) {
        /*
            r8 = this;
            monitor-enter(r8)
            boolean r0 = r8.d     // Catch: java.lang.Throwable -> Lda
            if (r0 == 0) goto L6
            goto L26
        L6:
            r0 = 1
            r8.d = r0     // Catch: java.lang.Throwable -> Lda
            r0 = 2131230838(0x7f080076, float:1.807774E38)
            android.graphics.drawable.Drawable r0 = r8.f(r10, r0)     // Catch: java.lang.Throwable -> Lda
            if (r0 == 0) goto Lde
            boolean r1 = r0 instanceof a.cp1     // Catch: java.lang.Throwable -> Lda
            if (r1 != 0) goto L26
            java.lang.Class r0 = r0.getClass()     // Catch: java.lang.Throwable -> Lda
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Throwable -> Lda
            java.lang.String r1 = "android.graphics.drawable.VectorDrawable"
            boolean r0 = r1.equals(r0)     // Catch: java.lang.Throwable -> Lda
            if (r0 == 0) goto Lde
        L26:
            android.graphics.drawable.Drawable r0 = r8.b(r10, r9)     // Catch: java.lang.Throwable -> Lda
            if (r0 != 0) goto L32
            java.lang.Object r0 = a.zx.f748a     // Catch: java.lang.Throwable -> Lda
            android.graphics.drawable.Drawable r0 = a.xx.b(r10, r9)     // Catch: java.lang.Throwable -> Lda
        L32:
            if (r0 == 0) goto Ld4
            android.content.res.ColorStateList r1 = r8.h(r10, r9)     // Catch: java.lang.Throwable -> Lda
            r2 = 0
            if (r1 == 0) goto L57
            int[] r10 = a.m90.f340a     // Catch: java.lang.Throwable -> Lda
            android.graphics.drawable.Drawable r0 = r0.mutate()     // Catch: java.lang.Throwable -> Lda
            a.i90.h(r0, r1)     // Catch: java.lang.Throwable -> Lda
            a.mm r10 = r8.e     // Catch: java.lang.Throwable -> Lda
            if (r10 != 0) goto L49
            goto L50
        L49:
            r10 = 2131230825(0x7f080069, float:1.8077714E38)
            if (r9 != r10) goto L50
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.MULTIPLY     // Catch: java.lang.Throwable -> Lda
        L50:
            if (r2 == 0) goto Ld4
            a.i90.i(r0, r2)     // Catch: java.lang.Throwable -> Lda
            goto Ld4
        L57:
            a.mm r1 = r8.e     // Catch: java.lang.Throwable -> Lda
            if (r1 == 0) goto Lcb
            r1 = 2131230820(0x7f080064, float:1.8077704E38)
            r3 = 16908301(0x102000d, float:2.3877265E-38)
            r4 = 16908303(0x102000f, float:2.387727E-38)
            r5 = 16908288(0x1020000, float:2.387723E-38)
            r6 = 2130968797(0x7f0400dd, float:1.7546258E38)
            r7 = 2130968799(0x7f0400df, float:1.7546262E38)
            if (r9 != r1) goto L95
            r9 = r0
            android.graphics.drawable.LayerDrawable r9 = (android.graphics.drawable.LayerDrawable) r9     // Catch: java.lang.Throwable -> Lda
            android.graphics.drawable.Drawable r11 = r9.findDrawableByLayerId(r5)     // Catch: java.lang.Throwable -> Lda
            int r1 = a.rl1.c(r10, r7)     // Catch: java.lang.Throwable -> Lda
            android.graphics.PorterDuff$Mode r2 = a.nm.b     // Catch: java.lang.Throwable -> Lda
            a.mm.i(r11, r1, r2)     // Catch: java.lang.Throwable -> Lda
            android.graphics.drawable.Drawable r11 = r9.findDrawableByLayerId(r4)     // Catch: java.lang.Throwable -> Lda
            int r1 = a.rl1.c(r10, r7)     // Catch: java.lang.Throwable -> Lda
            a.mm.i(r11, r1, r2)     // Catch: java.lang.Throwable -> Lda
            android.graphics.drawable.Drawable r9 = r9.findDrawableByLayerId(r3)     // Catch: java.lang.Throwable -> Lda
            int r10 = a.rl1.c(r10, r6)     // Catch: java.lang.Throwable -> Lda
            a.mm.i(r9, r10, r2)     // Catch: java.lang.Throwable -> Lda
            goto Ld4
        L95:
            r1 = 2131230811(0x7f08005b, float:1.8077685E38)
            if (r9 == r1) goto La4
            r1 = 2131230810(0x7f08005a, float:1.8077683E38)
            if (r9 == r1) goto La4
            r1 = 2131230812(0x7f08005c, float:1.8077687E38)
            if (r9 != r1) goto Lcb
        La4:
            r9 = r0
            android.graphics.drawable.LayerDrawable r9 = (android.graphics.drawable.LayerDrawable) r9     // Catch: java.lang.Throwable -> Lda
            android.graphics.drawable.Drawable r11 = r9.findDrawableByLayerId(r5)     // Catch: java.lang.Throwable -> Lda
            int r1 = a.rl1.b(r10, r7)     // Catch: java.lang.Throwable -> Lda
            android.graphics.PorterDuff$Mode r2 = a.nm.b     // Catch: java.lang.Throwable -> Lda
            a.mm.i(r11, r1, r2)     // Catch: java.lang.Throwable -> Lda
            android.graphics.drawable.Drawable r11 = r9.findDrawableByLayerId(r4)     // Catch: java.lang.Throwable -> Lda
            int r1 = a.rl1.c(r10, r6)     // Catch: java.lang.Throwable -> Lda
            a.mm.i(r11, r1, r2)     // Catch: java.lang.Throwable -> Lda
            android.graphics.drawable.Drawable r9 = r9.findDrawableByLayerId(r3)     // Catch: java.lang.Throwable -> Lda
            int r10 = a.rl1.c(r10, r6)     // Catch: java.lang.Throwable -> Lda
            a.mm.i(r9, r10, r2)     // Catch: java.lang.Throwable -> Lda
            goto Ld4
        Lcb:
            boolean r9 = r8.i(r10, r9, r0)     // Catch: java.lang.Throwable -> Lda
            if (r9 != 0) goto Ld4
            if (r11 == 0) goto Ld4
            r0 = r2
        Ld4:
            if (r0 == 0) goto Ldc
            a.m90.a(r0)     // Catch: java.lang.Throwable -> Lda
            goto Ldc
        Lda:
            r9 = move-exception
            goto Le9
        Ldc:
            monitor-exit(r8)
            return r0
        Lde:
            r9 = 0
            r8.d = r9     // Catch: java.lang.Throwable -> Lda
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lda
            java.lang.String r10 = "This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat."
            r9.<init>(r10)     // Catch: java.lang.Throwable -> Lda
            throw r9     // Catch: java.lang.Throwable -> Lda
        Le9:
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: a.lb1.e(int, android.content.Context, boolean):android.graphics.drawable.Drawable");
    }

    public final synchronized android.graphics.drawable.Drawable f(android.content.Context context, int i) {
        return e(i, context, false);
    }

    public final synchronized android.content.res.ColorStateList h(android.content.Context context, int i) {
        android.content.res.ColorStateList colorStateList;
        a.fi1 fi1Var;
        java.util.WeakHashMap weakHashMap = this.f315a;
        android.content.res.ColorStateList colorStateList2 = null;
        colorStateList = (weakHashMap == null || (fi1Var = (a.fi1) weakHashMap.get(context)) == null) ? null : (android.content.res.ColorStateList) fi1Var.c(i, null);
        if (colorStateList == null) {
            a.mm mmVar = this.e;
            if (mmVar != null) {
                colorStateList2 = mmVar.g(context, i);
            }
            if (colorStateList2 != null) {
                if (this.f315a == null) {
                    this.f315a = new java.util.WeakHashMap();
                }
                a.fi1 fi1Var2 = (a.fi1) this.f315a.get(context);
                if (fi1Var2 == null) {
                    fi1Var2 = new a.fi1();
                    this.f315a.put(context, fi1Var2);
                }
                fi1Var2.a(i, colorStateList2);
            }
            colorStateList = colorStateList2;
        }
        return colorStateList;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean i(android.content.Context r8, int r9, android.graphics.drawable.Drawable r10) {
        /*
            r7 = this;
            a.mm r0 = r7.e
            r1 = 0
            if (r0 == 0) goto L6e
            android.graphics.PorterDuff$Mode r2 = a.nm.b
            java.lang.Object r3 = r0.f356a
            int[] r3 = (int[]) r3
            boolean r3 = a.mm.b(r3, r9)
            r4 = 1
            r5 = -1
            if (r3 == 0) goto L19
            r9 = 2130968799(0x7f0400df, float:1.7546262E38)
        L16:
            r3 = r4
        L17:
            r0 = r5
            goto L55
        L19:
            java.lang.Object r3 = r0.c
            int[] r3 = (int[]) r3
            boolean r3 = a.mm.b(r3, r9)
            if (r3 == 0) goto L27
            r9 = 2130968797(0x7f0400dd, float:1.7546258E38)
            goto L16
        L27:
            java.lang.Object r0 = r0.d
            int[] r0 = (int[]) r0
            boolean r0 = a.mm.b(r0, r9)
            r3 = 16842801(0x1010031, float:2.3693695E-38)
            if (r0 == 0) goto L38
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.MULTIPLY
        L36:
            r9 = r3
            goto L16
        L38:
            r0 = 2131230797(0x7f08004d, float:1.8077657E38)
            if (r9 != r0) goto L4c
            r9 = 1109603123(0x42233333, float:40.8)
            int r9 = java.lang.Math.round(r9)
            r0 = 16842800(0x1010030, float:2.3693693E-38)
            r3 = r4
            r6 = r0
            r0 = r9
            r9 = r6
            goto L55
        L4c:
            r0 = 2131230779(0x7f08003b, float:1.807762E38)
            if (r9 != r0) goto L52
            goto L36
        L52:
            r9 = r1
            r3 = r9
            goto L17
        L55:
            if (r3 == 0) goto L6e
            int[] r1 = a.m90.f340a
            android.graphics.drawable.Drawable r10 = r10.mutate()
            int r8 = a.rl1.c(r8, r9)
            android.graphics.PorterDuffColorFilter r8 = a.nm.c(r8, r2)
            r10.setColorFilter(r8)
            if (r0 == r5) goto L6d
            r10.setAlpha(r0)
        L6d:
            r1 = r4
        L6e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: a.lb1.i(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
    }
}
