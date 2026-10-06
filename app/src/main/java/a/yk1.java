package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class yk1 {
    public float c;
    public final java.lang.ref.WeakReference e;
    public a.sk1 f;

    /* renamed from: a, reason: collision with root package name */
    public final android.text.TextPaint f712a = new android.text.TextPaint(1);
    public final a.vu b = new a.vu(1, this);
    public boolean d = true;

    public yk1(a.xk1 xk1Var) {
        this.e = new java.lang.ref.WeakReference(null);
        this.e = new java.lang.ref.WeakReference(xk1Var);
    }

    public final float a(java.lang.String str) {
        if (!this.d) {
            return this.c;
        }
        float measureText = str == null ? 0.0f : this.f712a.measureText((java.lang.CharSequence) str, 0, str.length());
        this.c = measureText;
        this.d = false;
        return measureText;
    }

    public final void b(a.sk1 sk1Var, android.content.Context context) {
        if (this.f != sk1Var) {
            this.f = sk1Var;
            if (sk1Var != null) {
                android.text.TextPaint textPaint = this.f712a;
                a.vu vuVar = this.b;
                sk1Var.f(context, textPaint, vuVar);
                a.xk1 xk1Var = (a.xk1) this.e.get();
                if (xk1Var != null) {
                    textPaint.drawableState = xk1Var.getState();
                }
                sk1Var.e(context, textPaint, vuVar);
                this.d = true;
            }
            a.xk1 xk1Var2 = (a.xk1) this.e.get();
            if (xk1Var2 != null) {
                xk1Var2.a();
                xk1Var2.onStateChange(xk1Var2.getState());
            }
        }
    }
}
