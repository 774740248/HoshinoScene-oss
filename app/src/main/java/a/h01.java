package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public class h01 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f197a;
    public final a.pz0 b;
    public final boolean c;
    public final int d;
    public final int e;
    public android.view.View f;
    public boolean h;
    public a.n01 i;
    public a.e01 j;
    public android.widget.PopupWindow.OnDismissListener k;
    public int g = 8388611;
    public final a.f01 l = new a.f01(0, this);

    public h01(int i, int i2, android.content.Context context, android.view.View view, a.pz0 pz0Var, boolean z) {
        this.f197a = context;
        this.b = pz0Var;
        this.f = view;
        this.c = z;
        this.d = i;
        this.e = i2;
    }

    public final a.e01 a() {
        a.e01 ri1Var;
        if (this.j == null) {
            android.content.Context context = this.f197a;
            android.view.Display defaultDisplay = ((android.view.WindowManager) context.getSystemService("window")).getDefaultDisplay();
            android.graphics.Point point = new android.graphics.Point();
            a.g01.a(defaultDisplay, point);
            if (java.lang.Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(2131165208)) {
                ri1Var = new a.kt(this.f197a, this.f, this.d, this.e, this.c);
            } else {
                android.content.Context context2 = this.f197a;
                a.pz0 pz0Var = this.b;
                ri1Var = new a.ri1(this.d, this.e, context2, this.f, pz0Var, this.c);
            }
            ri1Var.l(this.b);
            ri1Var.r(this.l);
            ri1Var.n(this.f);
            ri1Var.e(this.i);
            ri1Var.o(this.h);
            ri1Var.p(this.g);
            this.j = ri1Var;
        }
        return this.j;
    }

    public final boolean b() {
        a.e01 e01Var = this.j;
        return e01Var != null && e01Var.b();
    }

    public void c() {
        this.j = null;
        android.widget.PopupWindow.OnDismissListener onDismissListener = this.k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(int i, int i2, boolean z, boolean z2) {
        a.e01 a2 = a();
        a2.s(z2);
        if (z) {
            int i3 = this.g;
            android.view.View view = this.f;
            java.util.WeakHashMap weakHashMap = a.jq1.f264a;
            if ((android.view.Gravity.getAbsoluteGravity(i3, a.sp1.d(view)) & 7) == 5) {
                i -= this.f.getWidth();
            }
            a2.q(i);
            a2.t(i2);
            int i4 = (int) ((this.f197a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a2.c = new android.graphics.Rect(i - i4, i2 - i4, i + i4, i2 + i4);
        }
        a2.f();
    }
}
