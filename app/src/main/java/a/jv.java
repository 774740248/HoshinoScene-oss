package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class jv extends a.wb0 {
    public final int e;
    public final int f;
    public final android.animation.TimeInterpolator g;
    public final android.animation.TimeInterpolator h;
    public android.widget.EditText i;
    public final a.gv j;
    public final a.hv k;
    public android.animation.AnimatorSet l;
    public android.animation.ValueAnimator m;

    public jv(a.vb0 vb0Var) {
        super(vb0Var);
        int i = 0;
        this.j = new a.gv(i, this);
        this.k = new a.hv(i, this);
        this.e = a.wv.o1(vb0Var.getContext(), 2130969362, 100);
        this.f = a.wv.o1(vb0Var.getContext(), 2130969362, 150);
        this.g = a.wv.p1(vb0Var.getContext(), 2130969371, a.el.f126a);
        this.h = a.wv.p1(vb0Var.getContext(), 2130969369, a.el.d);
    }

    @Override // a.wb0
    public final void a() {
        if (this.b.r != null) {
            return;
        }
        t(u());
    }

    @Override // a.wb0
    public final int c() {
        return 2131952126;
    }

    @Override // a.wb0
    public final int d() {
        return 2131231175;
    }

    @Override // a.wb0
    public final android.view.View.OnFocusChangeListener e() {
        return this.k;
    }

    @Override // a.wb0
    public final android.view.View.OnClickListener f() {
        return this.j;
    }

    @Override // a.wb0
    public final android.view.View.OnFocusChangeListener g() {
        return this.k;
    }

    @Override // a.wb0
    public final void m(android.widget.EditText editText) {
        this.i = editText;
        this.f655a.setEndIconVisible(u());
    }

    @Override // a.wb0
    public final void p(boolean z) {
        if (this.b.r == null) {
            return;
        }
        t(z);
    }

    @Override // a.wb0
    public final void r() {
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.8f, 1.0f);
        ofFloat.setInterpolator(this.h);
        ofFloat.setDuration(this.f);
        final int i = 0;
        ofFloat.addUpdateListener(new a.fv(this));
        android.animation.ValueAnimator ofFloat2 = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        android.animation.TimeInterpolator timeInterpolator = this.g;
        ofFloat2.setInterpolator(timeInterpolator);
        int i2 = this.e;
        ofFloat2.setDuration(i2);
        final int i3 = 1;
        ofFloat2.addUpdateListener(new a.fv(this));
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        this.l = animatorSet;
        animatorSet.playTogether(ofFloat, ofFloat2);
        this.l.addListener(new a.iv(this, i));
        android.animation.ValueAnimator ofFloat3 = android.animation.ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat3.setInterpolator(timeInterpolator);
        ofFloat3.setDuration(i2);
        ofFloat3.addUpdateListener(new a.fv(this));
        this.m = ofFloat3;
        ofFloat3.addListener(new a.iv(this, i3));
    }

    @Override // a.wb0
    public final void s() {
        android.widget.EditText editText = this.i;
        if (editText != null) {
            editText.post(new a.fw(6, this));
        }
    }

    public final void t(boolean z) {
        boolean z2 = this.b.c() == z;
        if (z && !this.l.isRunning()) {
            this.m.cancel();
            this.l.start();
            if (z2) {
                this.l.end();
                return;
            }
            return;
        }
        if (z) {
            return;
        }
        this.l.cancel();
        this.m.start();
        if (z2) {
            this.m.end();
        }
    }

    public final boolean u() {
        android.widget.EditText editText = this.i;
        return editText != null && (editText.hasFocus() || this.d.hasFocus()) && this.i.getText().length() > 0;
    }
}
