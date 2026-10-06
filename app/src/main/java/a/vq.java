package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class vq {

    /* renamed from: a, reason: collision with root package name */
    public final int f639a;
    public final int b;
    public final int c;
    public final android.animation.TimeInterpolator d;
    public final android.animation.TimeInterpolator e;
    public final android.animation.TimeInterpolator f;
    public final android.view.ViewGroup g;
    public final android.content.Context h;
    public final a.uq i;
    public final a.tx j;
    public int k;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public boolean r;
    public final android.view.accessibility.AccessibilityManager s;
    public static final a.hd0 u = a.el.b;
    public static final android.view.animation.LinearInterpolator v = a.el.f126a;
    public static final a.wv0 w = a.el.d;
    public static final int[] y = {2130969520};
    public static final java.lang.String z = a.vq.class.getSimpleName();
    public static final android.os.Handler x = new android.os.Handler(android.os.Looper.getMainLooper(), (android.os.Handler.Callback) (new java.lang.Object()));
    public final a.qq l = new a.qq(this, 0);
    public final a.sq t = new a.sq(this);

    public vq(android.content.Context context, android.view.ViewGroup viewGroup, com.google.android.material.snackbar.SnackbarContentLayout snackbarContentLayout, com.google.android.material.snackbar.SnackbarContentLayout snackbarContentLayout2) {
        if (snackbarContentLayout == null) {
            throw new java.lang.IllegalArgumentException("Transient bottom bar must have non-null content");
        }
        if (snackbarContentLayout2 == null) {
            throw new java.lang.IllegalArgumentException("Transient bottom bar must have non-null callback");
        }
        this.g = viewGroup;
        this.j = (tx) snackbarContentLayout2;
        this.h = context;
        a.b20.v(context, a.b20.u, "Theme.AppCompat");
        android.view.LayoutInflater from = android.view.LayoutInflater.from(context);
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(y);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        a.uq uqVar = (a.uq) from.inflate(resourceId != -1 ? 2131558695 : 2131558481, viewGroup, false);
        this.i = uqVar;
        a.uq.a(uqVar, this);
        float actionTextColorAlpha = uqVar.getActionTextColorAlpha();
        if (actionTextColorAlpha != 1.0f) {
            snackbarContentLayout.actionView.setTextColor(a.wv.N0(actionTextColorAlpha, a.wv.a0(snackbarContentLayout, 2130968838), snackbarContentLayout.actionView.getCurrentTextColor()));
        }
        snackbarContentLayout.setMaxInlineActionWidth(uqVar.getMaxInlineActionWidth());
        uqVar.addView(snackbarContentLayout);
        java.util.WeakHashMap weakHashMap = a.jq1.f264a;
        a.up1.f(uqVar, 1);
        a.rp1.s(uqVar, 1);
        uqVar.setFitsSystemWindows(true);
        a.xp1.u(uqVar, new a.rq(this));
        a.jq1.o(uqVar, new a.lr1(4, this));
        this.s = (android.view.accessibility.AccessibilityManager) context.getSystemService("accessibility");
        this.c = a.wv.o1(context, 2130969353, 250);
        this.f639a = a.wv.o1(context, 2130969353, 150);
        this.b = a.wv.o1(context, 2130969356, 75);
        this.d = a.wv.p1(context, 2130969369, v);
        this.f = a.wv.p1(context, 2130969369, w);
        this.e = a.wv.p1(context, 2130969369, u);
    }

    public final void a(int i) {
        a.yh1 b = a.yh1.b();
        a.sq sqVar = this.t;
        synchronized (b.f710a) {
            try {
                if (b.c(sqVar)) {
                    b.a(b.c, i);
                } else {
                    a.xh1 xh1Var = b.d;
                    if (xh1Var != null && sqVar != null && xh1Var.f689a.get() == sqVar) {
                        b.a(b.d, i);
                    }
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        a.yh1 b = a.yh1.b();
        a.sq sqVar = this.t;
        synchronized (b.f710a) {
            try {
                if (b.c(sqVar)) {
                    b.c = null;
                    if (b.d != null) {
                        b.g();
                    }
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        android.view.ViewParent parent = this.i.getParent();
        if (parent instanceof android.view.ViewGroup) {
            ((android.view.ViewGroup) parent).removeView(this.i);
        }
    }

    public final void c() {
        a.yh1 b = a.yh1.b();
        a.sq sqVar = this.t;
        synchronized (b.f710a) {
            try {
                if (b.c(sqVar)) {
                    b.f(b.c);
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        java.util.List<android.accessibilityservice.AccessibilityServiceInfo> enabledAccessibilityServiceList;
        boolean z2 = true;
        android.view.accessibility.AccessibilityManager accessibilityManager = this.s;
        if (accessibilityManager != null && ((enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1)) == null || !enabledAccessibilityServiceList.isEmpty())) {
            z2 = false;
        }
        a.uq uqVar = this.i;
        if (z2) {
            uqVar.post(new a.qq(this, 2));
            return;
        }
        if (uqVar.getParent() != null) {
            uqVar.setVisibility(0);
        }
        c();
    }

    public final void e() {
        a.uq uqVar = this.i;
        android.view.ViewGroup.LayoutParams layoutParams = uqVar.getLayoutParams();
        boolean z2 = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams;
        java.lang.String str = z;
        if (!z2) {
            android.util.Log.w(str, "Unable to update margins because layout params are not MarginLayoutParams");
            return;
        }
        if (uqVar.l == null) {
            android.util.Log.w(str, "Unable to update margins because original view margins are not set");
            return;
        }
        if (uqVar.getParent() == null) {
            return;
        }
        int i = this.m;
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
        android.graphics.Rect rect = uqVar.l;
        int i2 = rect.bottom + i;
        int i3 = rect.left + this.n;
        int i4 = rect.right + this.o;
        int i5 = rect.top;
        boolean z3 = (marginLayoutParams.bottomMargin == i2 && marginLayoutParams.leftMargin == i3 && marginLayoutParams.rightMargin == i4 && marginLayoutParams.topMargin == i5) ? false : true;
        if (z3) {
            marginLayoutParams.bottomMargin = i2;
            marginLayoutParams.leftMargin = i3;
            marginLayoutParams.rightMargin = i4;
            marginLayoutParams.topMargin = i5;
            uqVar.requestLayout();
        }
        if ((z3 || this.q != this.p) && android.os.Build.VERSION.SDK_INT >= 29 && this.p > 0) {
            android.view.ViewGroup.LayoutParams layoutParams2 = uqVar.getLayoutParams();
            if ((layoutParams2 instanceof a.my) && (((a.my) layoutParams2).f364a instanceof com.google.android.material.behavior.SwipeDismissBehavior)) {
                a.qq qqVar = this.l;
                uqVar.removeCallbacks(qqVar);
                uqVar.post(qqVar);
            }
        }
    }
}
