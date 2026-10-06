package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ca0 extends a.wb0 {
    public final int e;
    public final int f;
    public final android.animation.TimeInterpolator g;
    public android.widget.AutoCompleteTextView h;
    public final a.gv i;
    public final a.hv j;
    public final a.m6 k;
    public boolean l;
    public boolean m;
    public boolean n;
    public long o;
    public android.view.accessibility.AccessibilityManager p;
    public android.animation.ValueAnimator q;
    public android.animation.ValueAnimator r;

    public ca0(a.vb0 vb0Var) {
        super(vb0Var);
        int i = 1;
        this.i = new a.gv(i, this);
        this.j = new a.hv(i, this);
        this.k = new a.m6(this);
        this.o = Long.MAX_VALUE;
        this.f = a.wv.o1(vb0Var.getContext(), 2130969362, 67);
        this.e = a.wv.o1(vb0Var.getContext(), 2130969362, 50);
        this.g = a.wv.p1(vb0Var.getContext(), 2130969371, a.el.f126a);
    }

    @Override // a.wb0
    public final void a() {
        if (this.p.isTouchExplorationEnabled() && this.h.getInputType() != 0 && !this.d.hasFocus()) {
            this.h.dismissDropDown();
        }
        this.h.post(new a.fw(7, this));
    }

    @Override // a.wb0
    public final int c() {
        return 2131952233;
    }

    @Override // a.wb0
    public final int d() {
        return 2131231172;
    }

    @Override // a.wb0
    public final android.view.View.OnFocusChangeListener e() {
        return this.j;
    }

    @Override // a.wb0
    public final android.view.View.OnClickListener f() {
        return this.i;
    }

    @Override // a.wb0
    public final a.x h() {
        return this.k;
    }

    @Override // a.wb0
    public final boolean i(int i) {
        return i != 0;
    }

    @Override // a.wb0
    public final boolean j() {
        return this.l;
    }

    @Override // a.wb0
    public final boolean l() {
        return this.n;
    }

    @Override // a.wb0
    public final void m(android.widget.EditText editText) {
        if (!(editText instanceof android.widget.AutoCompleteTextView)) {
            throw new java.lang.RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
        }
        android.widget.AutoCompleteTextView autoCompleteTextView = (android.widget.AutoCompleteTextView) editText;
        this.h = autoCompleteTextView;
        autoCompleteTextView.setOnTouchListener(new a.aa0(0, this));
        this.h.setOnDismissListener(new a.ba0());
        this.h.setThreshold(0);
        com.google.android.material.textfield.TextInputLayout textInputLayout = this.f655a;
        textInputLayout.setErrorIconDrawable((android.graphics.drawable.Drawable) null);
        if (editText.getInputType() == 0 && this.p.isTouchExplorationEnabled()) {
            java.util.WeakHashMap weakHashMap = a.jq1.f264a;
            a.rp1.s(this.d, 2);
        }
        textInputLayout.setEndIconVisible(true);
    }

    @Override // a.wb0
    public final void n(a.g0 g0Var) {
        if (this.h.getInputType() == 0) {
            g0Var.g(android.widget.Spinner.class.getName());
        }
        android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo = g0Var.f165a;
        if (accessibilityNodeInfo.isShowingHintText()) {
            accessibilityNodeInfo.setHintText(null);
        }
    }

    @Override // a.wb0
    public final void o(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        if (this.p.isEnabled() && this.h.getInputType() == 0) {
            boolean z = accessibilityEvent.getEventType() == 32768 && this.n && !this.h.isPopupShowing();
            if (accessibilityEvent.getEventType() == 1 || z) {
                u();
                this.m = true;
                this.o = java.lang.System.currentTimeMillis();
            }
        }
    }

    @Override // a.wb0
    public final void r() {
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        android.animation.TimeInterpolator timeInterpolator = this.g;
        ofFloat.setInterpolator(timeInterpolator);
        ofFloat.setDuration(this.f);
        int i = 0;
        ofFloat.addUpdateListener(new a.z90(i, this));
        this.r = ofFloat;
        android.animation.ValueAnimator ofFloat2 = android.animation.ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat2.setInterpolator(timeInterpolator);
        ofFloat2.setDuration(this.e);
        ofFloat2.addUpdateListener(new a.z90(i, this));
        this.q = ofFloat2;
        ofFloat2.addListener(new a.h1(7, this));
        this.p = (android.view.accessibility.AccessibilityManager) this.c.getSystemService("accessibility");
    }

    @Override // a.wb0
    public final void s() {
        android.widget.AutoCompleteTextView autoCompleteTextView = this.h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.h.setOnDismissListener(null);
        }
    }

    public final void t(boolean z) {
        if (this.n != z) {
            this.n = z;
            this.r.cancel();
            this.q.start();
        }
    }

    public final void u() {
        if (this.h == null) {
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis() - this.o;
        if (currentTimeMillis < 0 || currentTimeMillis > 300) {
            this.m = false;
        }
        if (this.m) {
            this.m = false;
            return;
        }
        t(!this.n);
        if (!this.n) {
            this.h.dismissDropDown();
        } else {
            this.h.requestFocus();
            this.h.showDropDown();
        }
    }
}
