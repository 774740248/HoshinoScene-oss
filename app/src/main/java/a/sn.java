package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class sn {

    /* renamed from: a, reason: collision with root package name */
    public final android.widget.TextView f531a;
    public a.nm1 b;
    public a.nm1 c;
    public a.nm1 d;
    public a.nm1 e;
    public a.nm1 f;
    public a.nm1 g;
    public a.nm1 h;
    public final a.co i;
    public int j = 0;
    public int k = -1;
    public android.graphics.Typeface l;
    public boolean m;

    public sn(android.widget.TextView textView) {
        this.f531a = textView;
        this.i = new a.co(textView);
    }

    public static a.nm1 c(android.content.Context context, a.nm nmVar, int i) {
        android.content.res.ColorStateList h;
        synchronized (nmVar) {
            h = nmVar.f384a.h(context, i);
        }
        if (h == null) {
            return null;
        }
        a.nm1 nm1Var = new a.nm1(0);
        nm1Var.b = true;
        nm1Var.c = h;
        return nm1Var;
    }

    public static void h(android.widget.TextView textView, android.view.inputmethod.InputConnection inputConnection, android.view.inputmethod.EditorInfo editorInfo) {
        int i = android.os.Build.VERSION.SDK_INT;
        if (i >= 30 || inputConnection == null) {
            return;
        }
        java.lang.CharSequence text = textView.getText();
        if (i >= 30) {
            a.ha0.a(editorInfo, text);
            return;
        }
        text.getClass();
        if (i >= 30) {
            a.ha0.a(editorInfo, text);
            return;
        }
        int i2 = editorInfo.initialSelStart;
        int i3 = editorInfo.initialSelEnd;
        int i4 = i2 > i3 ? i3 : i2;
        if (i2 <= i3) {
            i2 = i3;
        }
        int length = text.length();
        if (i4 < 0 || i2 > length) {
            a.wv.B1(editorInfo, null, 0, 0);
            return;
        }
        int i5 = editorInfo.inputType & 4095;
        if (i5 == 129 || i5 == 225 || i5 == 18) {
            a.wv.B1(editorInfo, null, 0, 0);
            return;
        }
        if (length <= 2048) {
            a.wv.B1(editorInfo, text, i4, i2);
            return;
        }
        int i6 = i2 - i4;
        int i7 = i6 > 1024 ? 0 : i6;
        int i8 = 2048 - i7;
        int min = java.lang.Math.min(text.length() - i2, i8 - java.lang.Math.min(i4, (int) (i8 * 0.8d)));
        int min2 = java.lang.Math.min(i4, i8 - min);
        int i9 = i4 - min2;
        if (java.lang.Character.isLowSurrogate(text.charAt(i9))) {
            i9++;
            min2--;
        }
        if (java.lang.Character.isHighSurrogate(text.charAt((i2 + min) - 1))) {
            min--;
        }
        int i10 = min2 + i7;
        a.wv.B1(editorInfo, i7 != i6 ? android.text.TextUtils.concat(text.subSequence(i9, i9 + min2), text.subSequence(i2, min + i2)) : text.subSequence(i9, i10 + min + i9), min2, i10);
    }

    public final void a(android.graphics.drawable.Drawable drawable, a.nm1 nm1Var) {
        if (drawable == null || nm1Var == null) {
            return;
        }
        a.nm.e(drawable, nm1Var, this.f531a.getDrawableState());
    }

    public final void b() {
        a.nm1 nm1Var = this.b;
        android.widget.TextView textView = this.f531a;
        if (nm1Var != null || this.c != null || this.d != null || this.e != null) {
            android.graphics.drawable.Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.b);
            a(compoundDrawables[1], this.c);
            a(compoundDrawables[2], this.d);
            a(compoundDrawables[3], this.e);
        }
        if (this.f == null && this.g == null) {
            return;
        }
        android.graphics.drawable.Drawable[] a2 = a.on.a(textView);
        a(a2[0], this.f);
        a(a2[2], this.g);
    }

    public final android.content.res.ColorStateList d() {
        a.nm1 nm1Var = this.h;
        if (nm1Var != null) {
            return (android.content.res.ColorStateList) nm1Var.c;
        }
        return null;
    }

    public final android.graphics.PorterDuff.Mode e() {
        a.nm1 nm1Var = this.h;
        if (nm1Var != null) {
            return (android.graphics.PorterDuff.Mode) nm1Var.d;
        }
        return null;
    }

    public final void f(android.util.AttributeSet attributeSet, int i) {
        boolean z;
        boolean z2;
        java.lang.String str;
        java.lang.String str2;
        int i2;
        int i3;
        int resourceId;
        int i4;
        android.widget.TextView textView = this.f531a;
        android.content.Context context = textView.getContext();
        a.nm a2 = a.nm.a();
        int[] iArr = a.u81.h;
        a.nk G = a.nk.G(context, attributeSet, iArr, i);
        a.jq1.n(textView, textView.getContext(), iArr, attributeSet, (android.content.res.TypedArray) G.e, i);
        int x = G.x(0, -1);
        if (G.C(3)) {
            this.b = c(context, a2, G.x(3, 0));
        }
        if (G.C(1)) {
            this.c = c(context, a2, G.x(1, 0));
        }
        if (G.C(4)) {
            this.d = c(context, a2, G.x(4, 0));
        }
        if (G.C(2)) {
            this.e = c(context, a2, G.x(2, 0));
        }
        int i5 = android.os.Build.VERSION.SDK_INT;
        if (G.C(5)) {
            this.f = c(context, a2, G.x(5, 0));
        }
        if (G.C(6)) {
            this.g = c(context, a2, G.x(6, 0));
        }
        G.K();
        boolean z3 = textView.getTransformationMethod() instanceof android.text.method.PasswordTransformationMethod;
        int[] iArr2 = a.u81.w;
        if (x != -1) {
            a.nk nkVar = new a.nk(context, context.obtainStyledAttributes(x, iArr2));
            if (z3 || !nkVar.C(14)) {
                z = false;
                z2 = false;
            } else {
                z = nkVar.h(14, false);
                z2 = true;
            }
            n(context, nkVar);
            if (nkVar.C(15)) {
                str = nkVar.z(15);
                i4 = 13;
            } else {
                i4 = 13;
                str = null;
            }
            str2 = nkVar.C(i4) ? nkVar.z(i4) : null;
            nkVar.K();
        } else {
            z = false;
            z2 = false;
            str = null;
            str2 = null;
        }
        a.nk nkVar2 = new a.nk(context, context.obtainStyledAttributes(attributeSet, iArr2, i, 0));
        if (!z3 && nkVar2.C(14)) {
            z = nkVar2.h(14, false);
            z2 = true;
        }
        if (nkVar2.C(15)) {
            str = nkVar2.z(15);
        }
        if (nkVar2.C(13)) {
            str2 = nkVar2.z(13);
        }
        java.lang.String str3 = str2;
        if (i5 >= 28 && nkVar2.C(0) && nkVar2.k(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        n(context, nkVar2);
        nkVar2.K();
        if (!z3 && z2) {
            textView.setAllCaps(z);
        }
        android.graphics.Typeface typeface = this.l;
        if (typeface != null) {
            if (this.k == -1) {
                textView.setTypeface(typeface, this.j);
            } else {
                textView.setTypeface(typeface);
            }
        }
        if (str3 != null) {
            a.qn.d(textView, str3);
        }
        if (str != null) {
            a.pn.b(textView, a.pn.a(str));
        }
        int[] iArr3 = a.u81.i;
        a.co coVar = this.i;
        android.content.Context context2 = coVar.j;
        android.content.res.TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr3, i, 0);
        android.widget.TextView textView2 = coVar.i;
        a.jq1.n(textView2, textView2.getContext(), iArr3, attributeSet, obtainStyledAttributes, i);
        if (obtainStyledAttributes.hasValue(5)) {
            coVar.f75a = obtainStyledAttributes.getInt(5, 0);
        }
        float dimension = obtainStyledAttributes.hasValue(4) ? obtainStyledAttributes.getDimension(4, -1.0f) : -1.0f;
        float dimension2 = obtainStyledAttributes.hasValue(2) ? obtainStyledAttributes.getDimension(2, -1.0f) : -1.0f;
        float dimension3 = obtainStyledAttributes.hasValue(1) ? obtainStyledAttributes.getDimension(1, -1.0f) : -1.0f;
        if (obtainStyledAttributes.hasValue(3) && (resourceId = obtainStyledAttributes.getResourceId(3, 0)) > 0) {
            android.content.res.TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            int length = obtainTypedArray.length();
            int[] iArr4 = new int[length];
            if (length > 0) {
                for (int i6 = 0; i6 < length; i6++) {
                    iArr4[i6] = obtainTypedArray.getDimensionPixelSize(i6, -1);
                }
                coVar.f = a.co.b(iArr4);
                coVar.i();
            }
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes.recycle();
        if (!coVar.j()) {
            coVar.f75a = 0;
        } else if (coVar.f75a == 1) {
            if (!coVar.g) {
                android.util.DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    i3 = 2;
                    dimension2 = android.util.TypedValue.applyDimension(2, 12.0f, displayMetrics);
                } else {
                    i3 = 2;
                }
                if (dimension3 == -1.0f) {
                    dimension3 = android.util.TypedValue.applyDimension(i3, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                coVar.k(dimension2, dimension3, dimension);
            }
            coVar.h();
        }
        if (a.zr1.b && coVar.f75a != 0) {
            int[] iArr5 = coVar.f;
            if (iArr5.length > 0) {
                if (a.qn.a(textView) != -1.0f) {
                    a.qn.b(textView, java.lang.Math.round(coVar.d), java.lang.Math.round(coVar.e), java.lang.Math.round(coVar.c), 0);
                } else {
                    a.qn.c(textView, iArr5, 0);
                }
            }
        }
        a.nk nkVar3 = new a.nk(context, context.obtainStyledAttributes(attributeSet, iArr3));
        int x2 = nkVar3.x(8, -1);
        android.graphics.drawable.Drawable b = x2 != -1 ? a2.b(context, x2) : null;
        int x3 = nkVar3.x(13, -1);
        android.graphics.drawable.Drawable b2 = x3 != -1 ? a2.b(context, x3) : null;
        int x4 = nkVar3.x(9, -1);
        android.graphics.drawable.Drawable b3 = x4 != -1 ? a2.b(context, x4) : null;
        int x5 = nkVar3.x(6, -1);
        android.graphics.drawable.Drawable b4 = x5 != -1 ? a2.b(context, x5) : null;
        int x6 = nkVar3.x(10, -1);
        android.graphics.drawable.Drawable b5 = x6 != -1 ? a2.b(context, x6) : null;
        int x7 = nkVar3.x(7, -1);
        android.graphics.drawable.Drawable b6 = x7 != -1 ? a2.b(context, x7) : null;
        if (b5 != null || b6 != null) {
            android.graphics.drawable.Drawable[] a3 = a.on.a(textView);
            if (b5 == null) {
                b5 = a3[0];
            }
            if (b2 == null) {
                b2 = a3[1];
            }
            if (b6 == null) {
                b6 = a3[2];
            }
            if (b4 == null) {
                b4 = a3[3];
            }
            a.on.b(textView, b5, b2, b6, b4);
        } else if (b != null || b2 != null || b3 != null || b4 != null) {
            android.graphics.drawable.Drawable[] a4 = a.on.a(textView);
            android.graphics.drawable.Drawable drawable = a4[0];
            if (drawable == null && a4[2] == null) {
                android.graphics.drawable.Drawable[] compoundDrawables = textView.getCompoundDrawables();
                if (b == null) {
                    b = compoundDrawables[0];
                }
                if (b2 == null) {
                    b2 = compoundDrawables[1];
                }
                if (b3 == null) {
                    b3 = compoundDrawables[2];
                }
                if (b4 == null) {
                    b4 = compoundDrawables[3];
                }
                textView.setCompoundDrawablesWithIntrinsicBounds(b, b2, b3, b4);
            } else {
                if (b2 == null) {
                    b2 = a4[1];
                }
                android.graphics.drawable.Drawable drawable2 = a4[2];
                if (b4 == null) {
                    b4 = a4[3];
                }
                a.on.b(textView, drawable, b2, drawable2, b4);
            }
        }
        if (nkVar3.C(11)) {
            a.jl1.f(textView, nkVar3.i(11));
        }
        if (nkVar3.C(12)) {
            i2 = -1;
            a.jl1.g(textView, a.m90.b(nkVar3.o(12, -1), null));
        } else {
            i2 = -1;
        }
        int k = nkVar3.k(15, i2);
        int k2 = nkVar3.k(18, i2);
        int k3 = nkVar3.k(19, i2);
        nkVar3.K();
        if (k != i2) {
            a.b20.h1(textView, k);
        }
        if (k2 != i2) {
            a.b20.j1(textView, k2);
        }
        if (k3 != i2) {
            a.wv.r(k3);
            if (k3 != textView.getPaint().getFontMetricsInt(null)) {
                textView.setLineSpacing(k3 - r1, 1.0f);
            }
        }
    }

    public final void g(android.content.Context context, int i) {
        java.lang.String z;
        a.nk nkVar = new a.nk(context, context.obtainStyledAttributes(i, a.u81.w));
        boolean C = nkVar.C(14);
        android.widget.TextView textView = this.f531a;
        if (C) {
            textView.setAllCaps(nkVar.h(14, false));
        }
        if (nkVar.C(0) && nkVar.k(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        n(context, nkVar);
        if (nkVar.C(13) && (z = nkVar.z(13)) != null) {
            a.qn.d(textView, z);
        }
        nkVar.K();
        android.graphics.Typeface typeface = this.l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.j);
        }
    }

    public final void i(int i, int i2, int i3, int i4) {
        a.co coVar = this.i;
        if (coVar.j()) {
            android.util.DisplayMetrics displayMetrics = coVar.j.getResources().getDisplayMetrics();
            coVar.k(android.util.TypedValue.applyDimension(i4, i, displayMetrics), android.util.TypedValue.applyDimension(i4, i2, displayMetrics), android.util.TypedValue.applyDimension(i4, i3, displayMetrics));
            if (coVar.h()) {
                coVar.a();
            }
        }
    }

    public final void j(int[] iArr, int i) {
        a.co coVar = this.i;
        if (coVar.j()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i == 0) {
                    iArr2 = java.util.Arrays.copyOf(iArr, length);
                } else {
                    android.util.DisplayMetrics displayMetrics = coVar.j.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArr2[i2] = java.lang.Math.round(android.util.TypedValue.applyDimension(i, iArr[i2], displayMetrics));
                    }
                }
                coVar.f = a.co.b(iArr2);
                if (!coVar.i()) {
                    throw new java.lang.IllegalArgumentException("None of the preset sizes is valid: " + java.util.Arrays.toString(iArr));
                }
            } else {
                coVar.g = false;
            }
            if (coVar.h()) {
                coVar.a();
            }
        }
    }

    public final void k(int i) {
        a.co coVar = this.i;
        if (coVar.j()) {
            if (i == 0) {
                coVar.f75a = 0;
                coVar.d = -1.0f;
                coVar.e = -1.0f;
                coVar.c = -1.0f;
                coVar.f = new int[0];
                coVar.b = false;
                return;
            }
            if (i != 1) {
                throw new java.lang.IllegalArgumentException(a.ii1.d("Unknown auto-size text type: ", i));
            }
            android.util.DisplayMetrics displayMetrics = coVar.j.getResources().getDisplayMetrics();
            coVar.k(android.util.TypedValue.applyDimension(2, 12.0f, displayMetrics), android.util.TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (coVar.h()) {
                coVar.a();
            }
        }
    }

    public final void l(android.content.res.ColorStateList colorStateList) {
        if (this.h == null) {
            this.h = new a.nm1(0);
        }
        a.nm1 nm1Var = this.h;
        nm1Var.c = colorStateList;
        nm1Var.b = colorStateList != null;
        this.b = nm1Var;
        this.c = nm1Var;
        this.d = nm1Var;
        this.e = nm1Var;
        this.f = nm1Var;
        this.g = nm1Var;
    }

    public final void m(android.graphics.PorterDuff.Mode mode) {
        if (this.h == null) {
            this.h = new a.nm1(0);
        }
        a.nm1 nm1Var = this.h;
        nm1Var.d = mode;
        nm1Var.f385a = mode != null;
        this.b = nm1Var;
        this.c = nm1Var;
        this.d = nm1Var;
        this.e = nm1Var;
        this.f = nm1Var;
        this.g = nm1Var;
    }

    public final void n(android.content.Context context, a.nk nkVar) {
        java.lang.String z;
        this.j = nkVar.o(2, this.j);
        int i = android.os.Build.VERSION.SDK_INT;
        if (i >= 28) {
            int o = nkVar.o(11, -1);
            this.k = o;
            if (o != -1) {
                this.j &= 2;
            }
        }
        if (!nkVar.C(10) && !nkVar.C(12)) {
            if (nkVar.C(1)) {
                this.m = false;
                int o2 = nkVar.o(1, 1);
                if (o2 == 1) {
                    this.l = android.graphics.Typeface.SANS_SERIF;
                    return;
                } else if (o2 == 2) {
                    this.l = android.graphics.Typeface.SERIF;
                    return;
                } else {
                    if (o2 != 3) {
                        return;
                    }
                    this.l = android.graphics.Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.l = null;
        int i2 = nkVar.C(12) ? 12 : 10;
        int i3 = this.k;
        int i4 = this.j;
        if (!context.isRestricted()) {
            try {
                android.graphics.Typeface n = nkVar.n(i2, this.j, new a.mn(this, i3, i4, new java.lang.ref.WeakReference(this.f531a)));
                if (n != null) {
                    if (i < 28 || this.k == -1) {
                        this.l = n;
                    } else {
                        this.l = a.rn.a(android.graphics.Typeface.create(n, 0), this.k, (this.j & 2) != 0);
                    }
                }
                this.m = this.l == null;
            } catch (android.content.res.Resources.NotFoundException | java.lang.UnsupportedOperationException unused) {
            }
        }
        if (this.l != null || (z = nkVar.z(i2)) == null) {
            return;
        }
        if (android.os.Build.VERSION.SDK_INT < 28 || this.k == -1) {
            this.l = android.graphics.Typeface.create(z, this.j);
        } else {
            this.l = a.rn.a(android.graphics.Typeface.create(z, 0), this.k, (this.j & 2) != 0);
        }
    }
}
