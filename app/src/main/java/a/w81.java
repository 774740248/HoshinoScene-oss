package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class w81 extends androidx.constraintlayout.widget.ConstraintLayout {
    public final a.v81 r;
    public int s;
    public final a.gz0 t;

    /* JADX WARN: Type inference failed for: r6v2, types: [a.v81] */
    public w81(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet, 2130969302);
        android.view.LayoutInflater.from(context).inflate(2131558671, this);
        a.gz0 gz0Var = new a.gz0();
        this.t = gz0Var;
        a.bb1 bb1Var = new a.bb1(0.5f);
        a.vg1 e = gz0Var.c.f164a.e();
        e.e = bb1Var;
        e.f = bb1Var;
        e.g = bb1Var;
        e.h = bb1Var;
        gz0Var.setShapeAppearanceModel(e.a());
        this.t.l(android.content.res.ColorStateList.valueOf(-1));
        a.gz0 gz0Var2 = this.t;
        java.util.WeakHashMap weakHashMap = a.jq1.f264a;
        a.rp1.q(this, gz0Var2);
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.t81.w, 2130969302, 0);
        this.s = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.r = new a.v81();
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void addView(android.view.View view, int i, android.view.ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view.getId() == -1) {
            java.util.WeakHashMap weakHashMap = a.jq1.f264a;
            view.setId(a.sp1.a());
        }
        android.os.Handler handler = getHandler();
        if (handler != null) {
            a.v81 v81Var = this.r;
            handler.removeCallbacks(v81Var);
            handler.post(v81Var);
        }
    }

    public abstract void g();

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        g();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(android.view.View view) {
        super.onViewRemoved(view);
        android.os.Handler handler = getHandler();
        if (handler != null) {
            a.v81 v81Var = this.r;
            handler.removeCallbacks(v81Var);
            handler.post(v81Var);
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        this.t.l(android.content.res.ColorStateList.valueOf(i));
    }
}
