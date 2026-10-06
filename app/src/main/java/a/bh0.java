package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class bh0 extends a.lj1 implements a.fp0 {
    public final /* synthetic */ android.widget.TextView[] g;
    public final /* synthetic */ java.lang.String h;
    public final /* synthetic */ a.dh0 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bh0(a.dh0 dh0Var, java.lang.String str, a.ey eyVar, android.widget.TextView[] textViewArr) {
        super(2, eyVar);
        this.g = textViewArr;
        this.h = str;
        this.i = dh0Var;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.bh0(this.i, this.h, eyVar, this.g);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.b20.q1(obj);
        for (android.widget.TextView textView : this.g) {
            a.wv.t(textView, "null cannot be cast to non-null type android.widget.TextView");
            java.lang.CharSequence text = textView.getText();
            a.wv.s(text);
            if (a.wv.e(text.toString(), this.h)) {
                textView.setAlpha(1.0f);
            } else if (textView.getAlpha() != 0.0f) {
                android.view.WindowManager windowManager = a.dh0.n;
                textView.setAlpha(this.i.c());
            }
        }
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        a.bh0 bh0Var = (a.bh0) a((a.cz) obj, (a.ey) obj2);
        a.no1 no1Var = a.no1.f387a;
        bh0Var.e(no1Var);
        return no1Var;
    }
}
