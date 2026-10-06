package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class si1 extends android.widget.LinearLayout {
    public final com.google.android.material.textfield.TextInputLayout c;
    public final a.vn d;
    public java.lang.CharSequence e;
    public final com.google.android.material.internal.CheckableImageButton f;
    public android.content.res.ColorStateList g;
    public android.graphics.PorterDuff.Mode h;
    public int i;
    public android.widget.ImageView.ScaleType j;
    public android.view.View.OnLongClickListener k;
    public boolean l;

    public si1(com.google.android.material.textfield.TextInputLayout textInputLayout, a.nk nkVar) {
        super(textInputLayout.getContext());
        java.lang.CharSequence A;
        this.c = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new android.widget.FrameLayout.LayoutParams(-2, -1, 8388611));
        com.google.android.material.internal.CheckableImageButton checkableImageButton = (com.google.android.material.internal.CheckableImageButton) android.view.LayoutInflater.from(getContext()).inflate(2131558493, (android.view.ViewGroup) this, false);
        this.f = checkableImageButton;
        a.vn vnVar = new a.vn(getContext(), null);
        this.d = vnVar;
        if (a.wv.H0(getContext())) {
            a.gy0.g((android.view.ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams(), 0);
        }
        android.view.View.OnLongClickListener onLongClickListener = this.k;
        checkableImageButton.setOnClickListener(null);
        a.b20.i1(checkableImageButton, onLongClickListener);
        this.k = null;
        checkableImageButton.setOnLongClickListener(null);
        a.b20.i1(checkableImageButton, null);
        if (nkVar.C(67)) {
            this.g = a.wv.b0(getContext(), nkVar, 67);
        }
        if (nkVar.C(68)) {
            this.h = a.wv.X0(nkVar.o(68, -1), null);
        }
        if (nkVar.C(64)) {
            a(nkVar.l(64));
            if (nkVar.C(63) && checkableImageButton.getContentDescription() != (A = nkVar.A(63))) {
                checkableImageButton.setContentDescription(A);
            }
            checkableImageButton.setCheckable(nkVar.h(62, true));
        }
        int k = nkVar.k(65, getResources().getDimensionPixelSize(2131165872));
        if (k < 0) {
            throw new java.lang.IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (k != this.i) {
            this.i = k;
            checkableImageButton.setMinimumWidth(k);
            checkableImageButton.setMinimumHeight(k);
        }
        if (nkVar.C(66)) {
            android.widget.ImageView.ScaleType F = a.b20.F(nkVar.o(66, -1));
            this.j = F;
            checkableImageButton.setScaleType(F);
        }
        vnVar.setVisibility(8);
        vnVar.setId(2131363273);
        vnVar.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-2, -2));
        java.util.WeakHashMap weakHashMap = a.jq1.f264a;
        a.up1.f(vnVar, 1);
        vnVar.setTextAppearance(nkVar.x(58, 0));
        if (nkVar.C(59)) {
            vnVar.setTextColor(nkVar.i(59));
        }
        java.lang.CharSequence A2 = nkVar.A(57);
        this.e = android.text.TextUtils.isEmpty(A2) ? null : A2;
        vnVar.setText(A2);
        d();
        addView(checkableImageButton);
        addView(vnVar);
    }

    public final void a(android.graphics.drawable.Drawable drawable) {
        com.google.android.material.internal.CheckableImageButton checkableImageButton = this.f;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            android.content.res.ColorStateList colorStateList = this.g;
            android.graphics.PorterDuff.Mode mode = this.h;
            com.google.android.material.textfield.TextInputLayout textInputLayout = this.c;
            a.b20.e(textInputLayout, checkableImageButton, colorStateList, mode);
            b(true);
            a.b20.b1(textInputLayout, checkableImageButton, this.g);
            return;
        }
        b(false);
        android.view.View.OnLongClickListener onLongClickListener = this.k;
        checkableImageButton.setOnClickListener(null);
        a.b20.i1(checkableImageButton, onLongClickListener);
        this.k = null;
        checkableImageButton.setOnLongClickListener(null);
        a.b20.i1(checkableImageButton, null);
        if (checkableImageButton.getContentDescription() != null) {
            checkableImageButton.setContentDescription(null);
        }
    }

    public final void b(boolean z) {
        com.google.android.material.internal.CheckableImageButton checkableImageButton = this.f;
        if ((checkableImageButton.getVisibility() == 0) != z) {
            checkableImageButton.setVisibility(z ? 0 : 8);
            c();
            d();
        }
    }

    public final void c() {
        int f;
        android.widget.EditText editText = this.c.focusedTextColor;
        if (editText == null) {
            return;
        }
        if (this.f.getVisibility() == 0) {
            f = 0;
        } else {
            java.util.WeakHashMap weakHashMap = a.jq1.f264a;
            f = a.sp1.f(editText);
        }
        int compoundPaddingTop = editText.getCompoundPaddingTop();
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(2131165741);
        int compoundPaddingBottom = editText.getCompoundPaddingBottom();
        java.util.WeakHashMap weakHashMap2 = a.jq1.f264a;
        a.sp1.k(this.d, f, compoundPaddingTop, dimensionPixelSize, compoundPaddingBottom);
    }

    public final void d() {
        int i = (this.e == null || this.l) ? 8 : 0;
        setVisibility((this.f.getVisibility() == 0 || i == 0) ? 0 : 8);
        this.d.setVisibility(i);
        this.c.cutoutEnabled();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        c();
    }
}
