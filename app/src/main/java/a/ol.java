package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ol {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f411a;
    public int b;
    public final java.lang.Object c;
    public final java.lang.Object d;
    public java.lang.Object e;
    public java.lang.Object f;
    public java.lang.Object g;

    public ol(android.view.View view) {
        this.f411a = 0;
        this.b = -1;
        this.c = view;
        this.d = a.nm.a();
    }

    public static a.ol b(android.content.Context context, int i) {
        a.wv.q("Cannot create a CalendarItemStyle with a styleResId of 0", i != 0);
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, a.t81.p);
        android.graphics.Rect rect = new android.graphics.Rect(obtainStyledAttributes.getDimensionPixelOffset(0, 0), obtainStyledAttributes.getDimensionPixelOffset(2, 0), obtainStyledAttributes.getDimensionPixelOffset(1, 0), obtainStyledAttributes.getDimensionPixelOffset(3, 0));
        android.content.res.ColorStateList c0 = a.wv.c0(context, obtainStyledAttributes, 4);
        android.content.res.ColorStateList c02 = a.wv.c0(context, obtainStyledAttributes, 9);
        android.content.res.ColorStateList c03 = a.wv.c0(context, obtainStyledAttributes, 7);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        a.wg1 a2 = a.wg1.a(context, obtainStyledAttributes.getResourceId(5, 0), obtainStyledAttributes.getResourceId(6, 0), new a.d(0)).a();
        obtainStyledAttributes.recycle();
        return new a.ol(c0, c02, c03, dimensionPixelSize, a2, rect);
    }

    public final void a() {
        android.view.View view = (android.view.View) this.c;
        android.graphics.drawable.Drawable background = view.getBackground();
        if (background != null) {
            if (((a.nm1) this.e) != null) {
                if (((a.nm1) this.g) == null) {
                    this.g = new a.nm1(0);
                }
                a.nm1 nm1Var = (a.nm1) this.g;
                nm1Var.c = null;
                nm1Var.b = false;
                nm1Var.d = null;
                nm1Var.f385a = false;
                java.util.WeakHashMap weakHashMap = a.jq1.f264a;
                android.content.res.ColorStateList g = a.xp1.g(view);
                if (g != null) {
                    nm1Var.b = true;
                    nm1Var.c = g;
                }
                android.graphics.PorterDuff.Mode h = a.xp1.h(view);
                if (h != null) {
                    nm1Var.f385a = true;
                    nm1Var.d = h;
                }
                if (nm1Var.b || nm1Var.f385a) {
                    a.nm.e(background, nm1Var, view.getDrawableState());
                    return;
                }
            }
            a.nm1 nm1Var2 = (a.nm1) this.f;
            if (nm1Var2 != null) {
                a.nm.e(background, nm1Var2, view.getDrawableState());
                return;
            }
            a.nm1 nm1Var3 = (a.nm1) this.e;
            if (nm1Var3 != null) {
                a.nm.e(background, nm1Var3, view.getDrawableState());
            }
        }
    }

    public final android.content.res.ColorStateList c() {
        java.lang.Object obj = this.f;
        if (((a.nm1) obj) != null) {
            return (android.content.res.ColorStateList) ((a.nm1) obj).c;
        }
        return null;
    }

    public final android.graphics.PorterDuff.Mode d() {
        java.lang.Object obj = this.f;
        if (((a.nm1) obj) != null) {
            return (android.graphics.PorterDuff.Mode) ((a.nm1) obj).d;
        }
        return null;
    }

    public final void e(android.util.AttributeSet attributeSet, int i) {
        android.content.res.ColorStateList h;
        java.lang.Object obj = this.c;
        android.view.View view = (android.view.View) obj;
        android.content.Context context = view.getContext();
        int[] iArr = a.u81.z;
        a.nk G = a.nk.G(context, attributeSet, iArr, i);
        a.jq1.n(view, view.getContext(), iArr, attributeSet, (android.content.res.TypedArray) G.e, i);
        try {
            if (G.C(0)) {
                this.b = G.x(0, -1);
                a.nm nmVar = (a.nm) this.d;
                android.content.Context context2 = ((android.view.View) obj).getContext();
                int i2 = this.b;
                synchronized (nmVar) {
                    h = nmVar.f384a.h(context2, i2);
                }
                if (h != null) {
                    h(h);
                }
            }
            if (G.C(1)) {
                a.xp1.q((android.view.View) obj, G.i(1));
            }
            if (G.C(2)) {
                a.xp1.r((android.view.View) obj, a.m90.b(G.o(2, -1), null));
            }
            G.K();
        } catch (java.lang.Throwable th) {
            G.K();
            throw th;
        }
    }

    public final void f() {
        this.b = -1;
        h(null);
        a();
    }

    public final void g(int i) {
        android.content.res.ColorStateList colorStateList;
        this.b = i;
        a.nm nmVar = (a.nm) this.d;
        if (nmVar != null) {
            android.content.Context context = ((android.view.View) this.c).getContext();
            synchronized (nmVar) {
                colorStateList = nmVar.f384a.h(context, i);
            }
        } else {
            colorStateList = null;
        }
        h(colorStateList);
        a();
    }

    public final void h(android.content.res.ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (((a.nm1) this.e) == null) {
                this.e = new a.nm1(0);
            }
            java.lang.Object obj = this.e;
            ((a.nm1) obj).c = colorStateList;
            ((a.nm1) obj).b = true;
        } else {
            this.e = null;
        }
        a();
    }

    public final void i(android.content.res.ColorStateList colorStateList) {
        if (((a.nm1) this.f) == null) {
            this.f = new a.nm1(0);
        }
        a.nm1 nm1Var = (a.nm1) this.f;
        nm1Var.c = colorStateList;
        nm1Var.b = true;
        a();
    }

    public final void j(android.graphics.PorterDuff.Mode mode) {
        if (((a.nm1) this.f) == null) {
            this.f = new a.nm1(0);
        }
        a.nm1 nm1Var = (a.nm1) this.f;
        nm1Var.d = mode;
        nm1Var.f385a = true;
        a();
    }

    public final java.lang.String toString() {
        switch (this.f411a) {
            case 1:
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append("FontRequest {mProviderAuthority: " + ((java.lang.String) this.c) + ", mProviderPackage: " + ((java.lang.String) this.d) + ", mQuery: " + ((java.lang.String) this.e) + ", mCertificates:");
                for (int i = 0; i < ((java.util.List) this.f).size(); i++) {
                    sb.append(" [");
                    java.util.List list = (java.util.List) ((java.util.List) this.f).get(i);
                    for (int i2 = 0; i2 < list.size(); i2++) {
                        sb.append(" \"");
                        sb.append(android.util.Base64.encodeToString((byte[]) list.get(i2), 0));
                        sb.append("\"");
                    }
                    sb.append(" ]");
                }
                sb.append("}");
                sb.append("mCertificatesArray: " + this.b);
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public ol(java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.List list) {
        this.f411a = 1;
        str.getClass();
        this.c = str;
        str2.getClass();
        this.d = str2;
        this.e = str3;
        list.getClass();
        this.f = list;
        this.b = 0;
        this.g = a.ai1.i(str, "-", str2, "-", str3);
    }

    public ol(android.content.res.ColorStateList colorStateList, android.content.res.ColorStateList colorStateList2, android.content.res.ColorStateList colorStateList3, int i, a.wg1 wg1Var, android.graphics.Rect rect) {
        this.f411a = 2;
        a.wv.r(rect.left);
        a.wv.r(rect.top);
        a.wv.r(rect.right);
        a.wv.r(rect.bottom);
        this.c = rect;
        this.d = colorStateList2;
        this.e = colorStateList;
        this.f = colorStateList3;
        this.b = i;
        this.g = wg1Var;
    }
}
