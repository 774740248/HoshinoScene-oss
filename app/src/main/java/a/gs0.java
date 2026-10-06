package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class gs0 {
    public android.content.res.ColorStateList A;
    public android.graphics.Typeface B;

    /* renamed from: a, reason: collision with root package name */
    public final int f190a;
    public final int b;
    public final int c;
    public final android.animation.TimeInterpolator d;
    public final android.animation.TimeInterpolator e;
    public final android.animation.TimeInterpolator f;
    public final android.content.Context g;
    public final com.google.android.material.textfield.TextInputLayout h;
    public android.widget.LinearLayout i;
    public int j;
    public android.widget.FrameLayout k;
    public android.animation.Animator l;
    public final float m;
    public int n;
    public int o;
    public java.lang.CharSequence p;
    public boolean q;
    public a.vn r;
    public java.lang.CharSequence s;
    public int t;
    public int u;
    public android.content.res.ColorStateList v;
    public java.lang.CharSequence w;
    public boolean x;
    public a.vn y;
    public int z;

    public gs0(com.google.android.material.textfield.TextInputLayout textInputLayout) {
        android.content.Context context = textInputLayout.getContext();
        this.g = context;
        this.h = textInputLayout;
        this.m = context.getResources().getDimensionPixelSize(2131165332);
        this.f190a = a.wv.o1(context, 2130969363, 217);
        this.b = a.wv.o1(context, 2130969359, 167);
        this.c = a.wv.o1(context, 2130969363, 167);
        this.d = a.wv.p1(context, 2130969368, a.el.d);
        android.view.animation.LinearInterpolator linearInterpolator = a.el.f126a;
        this.e = a.wv.p1(context, 2130969368, linearInterpolator);
        this.f = a.wv.p1(context, 2130969371, linearInterpolator);
    }

    public final void a(android.widget.TextView textView, int i) {
        if (this.i == null && this.k == null) {
            android.content.Context context = this.g;
            android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(context);
            this.i = linearLayout;
            linearLayout.setOrientation(0);
            android.widget.LinearLayout linearLayout2 = this.i;
            com.google.android.material.textfield.TextInputLayout textInputLayout = this.h;
            textInputLayout.addView(linearLayout2, -1, -2);
            this.k = new android.widget.FrameLayout(context);
            this.i.addView(this.k, new android.widget.LinearLayout.LayoutParams(0, -2, 1.0f));
            if (textInputLayout.getEditText() != null) {
                b();
            }
        }
        if (i == 0 || i == 1) {
            this.k.setVisibility(0);
            this.k.addView(textView);
        } else {
            this.i.addView(textView, new android.widget.LinearLayout.LayoutParams(-2, -2));
        }
        this.i.setVisibility(0);
        this.j++;
    }

    public final void b() {
        if (this.i != null) {
            com.google.android.material.textfield.TextInputLayout textInputLayout = this.h;
            if (textInputLayout.getEditText() != null) {
                android.widget.EditText editText = textInputLayout.getEditText();
                android.content.Context context = this.g;
                boolean H0 = a.wv.H0(context);
                android.widget.LinearLayout linearLayout = this.i;
                java.util.WeakHashMap weakHashMap = a.jq1.f264a;
                int f = a.sp1.f(editText);
                if (H0) {
                    f = context.getResources().getDimensionPixelSize(2131165739);
                }
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(2131165738);
                if (H0) {
                    dimensionPixelSize = context.getResources().getDimensionPixelSize(2131165740);
                }
                int e = a.sp1.e(editText);
                if (H0) {
                    e = context.getResources().getDimensionPixelSize(2131165739);
                }
                a.sp1.k(linearLayout, f, dimensionPixelSize, e, 0);
            }
        }
    }

    public final void c() {
        android.animation.Animator animator = this.l;
        if (animator != null) {
            animator.cancel();
        }
    }

    public final void d(java.util.ArrayList arrayList, boolean z, android.widget.TextView textView, int i, int i2, int i3) {
        if (textView == null || !z) {
            return;
        }
        if (i == i3 || i == i2) {
            boolean z2 = i3 == i;
            android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(textView, (android.util.Property<android.widget.TextView, java.lang.Float>) android.view.View.ALPHA, z2 ? 1.0f : 0.0f);
            int i4 = this.c;
            ofFloat.setDuration(z2 ? this.b : i4);
            ofFloat.setInterpolator(z2 ? this.e : this.f);
            if (i == i3 && i2 != 0) {
                ofFloat.setStartDelay(i4);
            }
            arrayList.add(ofFloat);
            if (i3 != i || i2 == 0) {
                return;
            }
            android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(textView, (android.util.Property<android.widget.TextView, java.lang.Float>) android.view.View.TRANSLATION_Y, -this.m, 0.0f);
            ofFloat2.setDuration(this.f190a);
            ofFloat2.setInterpolator(this.d);
            ofFloat2.setStartDelay(i4);
            arrayList.add(ofFloat2);
        }
    }

    public final android.widget.TextView e(int i) {
        if (i == 1) {
            return this.r;
        }
        if (i != 2) {
            return null;
        }
        return this.y;
    }

    public final void f() {
        this.p = null;
        c();
        if (this.n == 1) {
            if (!this.x || android.text.TextUtils.isEmpty(this.w)) {
                this.o = 0;
            } else {
                this.o = 2;
            }
        }
        i(this.n, this.o, h(this.r, ""));
    }

    public final void g(android.widget.TextView textView, int i) {
        android.widget.FrameLayout frameLayout;
        android.widget.LinearLayout linearLayout = this.i;
        if (linearLayout == null) {
            return;
        }
        if ((i == 0 || i == 1) && (frameLayout = this.k) != null) {
            frameLayout.removeView(textView);
        } else {
            linearLayout.removeView(textView);
        }
        int i2 = this.j - 1;
        this.j = i2;
        android.widget.LinearLayout linearLayout2 = this.i;
        if (i2 == 0) {
            linearLayout2.setVisibility(8);
        }
    }

    public final boolean h(android.widget.TextView textView, java.lang.CharSequence charSequence) {
        java.util.WeakHashMap weakHashMap = a.jq1.f264a;
        com.google.android.material.textfield.TextInputLayout textInputLayout = this.h;
        return a.up1.c(textInputLayout) && textInputLayout.isEnabled() && !(this.o == this.n && textView != null && android.text.TextUtils.equals(textView.getText(), charSequence));
    }

    public final void i(int i, int i2, boolean z) {
        android.widget.TextView e;
        android.widget.TextView e2;
        if (i == i2) {
            return;
        }
        if (z) {
            android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
            this.l = animatorSet;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            d(arrayList, this.x, this.y, 2, i, i2);
            d(arrayList, this.q, this.r, 1, i, i2);
            a.wv.Y0(animatorSet, arrayList);
            animatorSet.addListener(new a.es0(this, i2, e(i), i, e(i2)));
            animatorSet.start();
        } else if (i != i2) {
            if (i2 != 0 && (e2 = e(i2)) != null) {
                e2.setVisibility(0);
                e2.setAlpha(1.0f);
            }
            if (i != 0 && (e = e(i)) != null) {
                e.setVisibility(4);
                if (i == 1) {
                    e.setText((java.lang.CharSequence) null);
                }
            }
            this.n = i2;
        }
        com.google.android.material.textfield.TextInputLayout textInputLayout = this.h;
        textInputLayout.openCutout();
        textInputLayout.updateLabelState(z, false);
        textInputLayout.updateCursorColor();
    }
}
