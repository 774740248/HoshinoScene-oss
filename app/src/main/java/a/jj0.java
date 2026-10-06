package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class jj0 extends a.lj1 implements a.fp0 {
    public final /* synthetic */ android.widget.TextView g;
    public final /* synthetic */ int h;
    public final /* synthetic */ android.widget.SeekBar i;
    public final /* synthetic */ a.tj1 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jj0(android.widget.TextView textView, int i, android.widget.SeekBar seekBar, a.tj1 tj1Var, a.ey eyVar) {
        super(2, eyVar);
        this.g = textView;
        this.h = i;
        this.i = seekBar;
        this.j = tj1Var;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.jj0(this.g, this.h, this.i, this.j, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.b20.q1(obj);
        int i = this.h;
        android.widget.TextView textView = this.g;
        if (textView != null) {
            textView.setText(java.lang.String.valueOf(i));
        }
        double d = this.j.i;
        if (d != 0.0d) {
            i = (int) (i / d);
        }
        this.i.setProgress(i);
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        a.jj0 jj0Var = (a.jj0) a((a.cz) obj, (a.ey) obj2);
        a.no1 no1Var = a.no1.f387a;
        jj0Var.e(no1Var);
        return no1Var;
    }
}
