package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class vb0 extends android.widget.LinearLayout {
    public static final /* synthetic */ int y = 0;
    public final com.google.android.material.textfield.TextInputLayout c;
    public final android.widget.FrameLayout d;
    public final com.google.android.material.internal.CheckableImageButton e;
    public android.content.res.ColorStateList f;
    public android.graphics.PorterDuff.Mode g;
    public android.view.View.OnLongClickListener h;
    public final com.google.android.material.internal.CheckableImageButton i;
    public final a.ts0 j;
    public int k;
    public final java.util.LinkedHashSet l;
    public android.content.res.ColorStateList m;
    public android.graphics.PorterDuff.Mode n;
    public int o;
    public android.widget.ImageView.ScaleType p;
    public android.view.View.OnLongClickListener q;
    public java.lang.CharSequence r;
    public final a.vn s;
    public boolean t;
    public android.widget.EditText u;
    public final android.view.accessibility.AccessibilityManager v;
    public a.x w;
    public final a.tb0 x;

    /* JADX WARN: Type inference failed for: r11v1, types: [a.ts0, java.lang.Object] */
    public vb0(com.google.android.material.textfield.TextInputLayout textInputLayout, a.nk nkVar) {
        super(textInputLayout.getContext());
        java.lang.CharSequence A;
        this.k = 0;
        this.l = new java.util.LinkedHashSet();
        this.x = new a.tb0(this);
        a.ub0 ub0Var = new a.ub0(this);
        this.v = (android.view.accessibility.AccessibilityManager) getContext().getSystemService("accessibility");
        this.c = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new android.widget.FrameLayout.LayoutParams(-2, -1, 8388613));
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(getContext());
        this.d = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-2, -1));
        android.view.LayoutInflater from = android.view.LayoutInflater.from(getContext());
        com.google.android.material.internal.CheckableImageButton a2 = a(this, from, 2131363266);
        this.e = a2;
        com.google.android.material.internal.CheckableImageButton a3 = a(frameLayout, from, 2131363265);
        this.i = a3;
        a.ts0 obj = new a.ts0();
        obj.e = new android.util.SparseArray();
        obj.f = this;
        obj.c = nkVar.x(26, 0);
        obj.d = nkVar.x(50, 0);
        this.j = obj;
        a.vn vnVar = new a.vn(getContext(), null);
        this.s = vnVar;
        if (nkVar.C(36)) {
            this.f = a.wv.b0(getContext(), nkVar, 36);
        }
        if (nkVar.C(37)) {
            this.g = a.wv.X0(nkVar.o(37, -1), null);
        }
        if (nkVar.C(35)) {
            h(nkVar.l(35));
        }
        a2.setContentDescription(getResources().getText(2131952226));
        java.util.WeakHashMap weakHashMap = a.jq1.f264a;
        a.rp1.s(a2, 2);
        a2.setClickable(false);
        a2.setPressable(false);
        a2.setFocusable(false);
        if (!nkVar.C(51)) {
            if (nkVar.C(30)) {
                this.m = a.wv.b0(getContext(), nkVar, 30);
            }
            if (nkVar.C(31)) {
                this.n = a.wv.X0(nkVar.o(31, -1), null);
            }
        }
        if (nkVar.C(28)) {
            f(nkVar.o(28, 0));
            if (nkVar.C(25) && a3.getContentDescription() != (A = nkVar.A(25))) {
                a3.setContentDescription(A);
            }
            a3.setCheckable(nkVar.h(24, true));
        } else if (nkVar.C(51)) {
            if (nkVar.C(52)) {
                this.m = a.wv.b0(getContext(), nkVar, 52);
            }
            if (nkVar.C(53)) {
                this.n = a.wv.X0(nkVar.o(53, -1), null);
            }
            f(nkVar.h(51, false) ? 1 : 0);
            java.lang.CharSequence A2 = nkVar.A(49);
            if (a3.getContentDescription() != A2) {
                a3.setContentDescription(A2);
            }
        }
        int k = nkVar.k(27, getResources().getDimensionPixelSize(2131165872));
        if (k < 0) {
            throw new java.lang.IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (k != this.o) {
            this.o = k;
            a3.setMinimumWidth(k);
            a3.setMinimumHeight(k);
            a2.setMinimumWidth(k);
            a2.setMinimumHeight(k);
        }
        if (nkVar.C(29)) {
            android.widget.ImageView.ScaleType F = a.b20.F(nkVar.o(29, -1));
            this.p = F;
            a3.setScaleType(F);
            a2.setScaleType(F);
        }
        vnVar.setVisibility(8);
        vnVar.setId(2131363274);
        vnVar.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-2, -2, 80.0f));
        a.up1.f(vnVar, 1);
        vnVar.setTextAppearance(nkVar.x(70, 0));
        if (nkVar.C(71)) {
            vnVar.setTextColor(nkVar.i(71));
        }
        java.lang.CharSequence A3 = nkVar.A(69);
        this.r = android.text.TextUtils.isEmpty(A3) ? null : A3;
        vnVar.setText(A3);
        m();
        frameLayout.addView(a3);
        addView(vnVar);
        addView(frameLayout);
        addView(a2);
        textInputLayout.editTextAttachedListeners.add((com.google.android.material.textfield.TextInputLayout.OnEditTextAttachedListener) ub0Var);
        if (textInputLayout.editText != null) {
            ub0Var.a(textInputLayout);
        }
        addOnAttachStateChangeListener(new a.gt(2, this));
    }

    public final com.google.android.material.internal.CheckableImageButton a(android.view.ViewGroup viewGroup, android.view.LayoutInflater layoutInflater, int i) {
        com.google.android.material.internal.CheckableImageButton checkableImageButton = (com.google.android.material.internal.CheckableImageButton) layoutInflater.inflate(2131558492, viewGroup, false);
        checkableImageButton.setId(i);
        if (a.wv.H0(getContext())) {
            a.gy0.h((android.view.ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams(), 0);
        }
        return checkableImageButton;
    }

    public final a.wb0 b() {
        int i = this.k;
        a.ts0 ts0Var = this.j;
        android.util.SparseArray sparseArray = (android.util.SparseArray) ts0Var.e;
        a.wb0 wb0Var = (a.wb0) sparseArray.get(i);
        if (wb0Var == null) {
            if (i != -1) {
                int i2 = 1;
                if (i == 0) {
                    wb0Var = new a.zz((a.vb0) ts0Var.f, i2);
                } else if (i == 1) {
                    wb0Var = new a.q41((a.vb0) ts0Var.f, ts0Var.d);
                } else if (i == 2) {
                    wb0Var = new a.jv((a.vb0) ts0Var.f);
                } else {
                    if (i != 3) {
                        throw new java.lang.IllegalArgumentException(a.ii1.d("Invalid end icon mode: ", i));
                    }
                    wb0Var = new a.ca0((a.vb0) ts0Var.f);
                }
            } else {
                wb0Var = new a.zz((a.vb0) ts0Var.f, 0);
            }
            sparseArray.append(i, wb0Var);
        }
        return wb0Var;
    }

    public final boolean c() {
        return this.d.getVisibility() == 0 && this.i.getVisibility() == 0;
    }

    public final boolean d() {
        return this.e.getVisibility() == 0;
    }

    public final void e(boolean z) {
        boolean z2;
        boolean isActivated;
        boolean isChecked;
        a.wb0 b = b();
        boolean k = b.k();
        com.google.android.material.internal.CheckableImageButton checkableImageButton = this.i;
        boolean z3 = true;
        if (!k || (isChecked = checkableImageButton.isChecked()) == b.l()) {
            z2 = false;
        } else {
            checkableImageButton.setChecked(!isChecked);
            z2 = true;
        }
        if (!(b instanceof a.ca0) || (isActivated = checkableImageButton.isActivated()) == b.j()) {
            z3 = z2;
        } else {
            checkableImageButton.setActivated(!isActivated);
        }
        if (z || z3) {
            a.b20.b1(this.c, checkableImageButton, this.m);
        }
    }

    public final void f(int i) {
        if (this.k == i) {
            return;
        }
        a.wb0 b = b();
        a.x xVar = this.w;
        android.view.accessibility.AccessibilityManager accessibilityManager = this.v;
        if (xVar != null && accessibilityManager != null) {
            a.w.b(accessibilityManager, xVar);
        }
        this.w = null;
        b.s();
        this.k = i;
        java.util.Iterator it = this.l.iterator();
        if (it.hasNext()) {
            a.ai1.t(it.next());
            throw null;
        }
        g(i != 0);
        a.wb0 b2 = b();
        int i2 = this.j.c;
        if (i2 == 0) {
            i2 = b2.d();
        }
        android.graphics.drawable.Drawable Y = i2 != 0 ? a.b20.Y(getContext(), i2) : null;
        com.google.android.material.internal.CheckableImageButton checkableImageButton = this.i;
        checkableImageButton.setImageDrawable(Y);
        com.google.android.material.textfield.TextInputLayout textInputLayout = this.c;
        if (Y != null) {
            a.b20.e(textInputLayout, checkableImageButton, this.m, this.n);
            a.b20.b1(textInputLayout, checkableImageButton, this.m);
        }
        int c = b2.c();
        java.lang.CharSequence text = c != 0 ? getResources().getText(c) : null;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
        checkableImageButton.setCheckable(b2.k());
        if (!b2.i(textInputLayout.getBoxBackgroundMode())) {
            throw new java.lang.IllegalStateException("The current box background mode " + textInputLayout.getBoxBackgroundMode() + " is not supported by the end icon mode " + i);
        }
        b2.r();
        a.x h = b2.h();
        this.w = h;
        if (h != null && accessibilityManager != null) {
            java.util.WeakHashMap weakHashMap = a.jq1.f264a;
            if (a.up1.b(this)) {
                a.w.a(accessibilityManager, this.w);
            }
        }
        android.view.View.OnClickListener f = b2.f();
        android.view.View.OnLongClickListener onLongClickListener = this.q;
        checkableImageButton.setOnClickListener(f);
        a.b20.i1(checkableImageButton, onLongClickListener);
        android.widget.EditText editText = this.u;
        if (editText != null) {
            b2.m(editText);
            i(b2);
        }
        a.b20.e(textInputLayout, checkableImageButton, this.m, this.n);
        e(true);
    }

    public final void g(boolean z) {
        if (c() != z) {
            this.i.setVisibility(z ? 0 : 8);
            j();
            l();
            this.c.cutoutEnabled();
        }
    }

    public final void h(android.graphics.drawable.Drawable drawable) {
        com.google.android.material.internal.CheckableImageButton checkableImageButton = this.e;
        checkableImageButton.setImageDrawable(drawable);
        k();
        a.b20.e(this.c, checkableImageButton, this.f, this.g);
    }

    public final void i(a.wb0 wb0Var) {
        if (this.u == null) {
            return;
        }
        if (wb0Var.e() != null) {
            this.u.setOnFocusChangeListener(wb0Var.e());
        }
        if (wb0Var.g() != null) {
            this.i.setOnFocusChangeListener(wb0Var.g());
        }
    }

    public final void j() {
        this.d.setVisibility((this.i.getVisibility() != 0 || d()) ? 8 : 0);
        setVisibility((c() || d() || !((this.r == null || this.t) ? 8 : false)) ? 0 : 8);
    }

    public final void k() {
        com.google.android.material.internal.CheckableImageButton checkableImageButton = this.e;
        android.graphics.drawable.Drawable drawable = checkableImageButton.getDrawable();
        com.google.android.material.textfield.TextInputLayout textInputLayout = this.c;
        checkableImageButton.setVisibility((drawable != null && textInputLayout.tmpBoundsRect.q && textInputLayout.cutoutEnabled()) ? 0 : 8);
        j();
        l();
        if (this.k != 0) {
            return;
        }
        textInputLayout.cutoutEnabled();
    }

    public final void l() {
        int i;
        com.google.android.material.textfield.TextInputLayout textInputLayout = this.c;
        if (textInputLayout.editText == null) {
            return;
        }
        if (c() || d()) {
            i = 0;
        } else {
            android.widget.EditText editText = textInputLayout.editText;
            java.util.WeakHashMap weakHashMap = a.jq1.f264a;
            i = a.sp1.e(editText);
        }
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(2131165741);
        int paddingTop = textInputLayout.editText.getPaddingTop();
        int paddingBottom = textInputLayout.editText.getPaddingBottom();
        java.util.WeakHashMap weakHashMap2 = a.jq1.f264a;
        a.sp1.k(this.s, dimensionPixelSize, paddingTop, i, paddingBottom);
    }

    public final void m() {
        a.vn vnVar = this.s;
        int visibility = vnVar.getVisibility();
        int i = (this.r == null || this.t) ? 8 : 0;
        if (visibility != i) {
            b().p(i == 0);
        }
        j();
        vnVar.setVisibility(i);
        this.c.cutoutEnabled();
    }
}
