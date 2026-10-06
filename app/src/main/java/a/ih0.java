package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ih0 extends a.lj1 implements a.fp0 {
    public final /* synthetic */ a.io g;
    public final /* synthetic */ a.kh0 h;
    public final /* synthetic */ java.lang.String i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ih0(a.io ioVar, a.kh0 kh0Var, java.lang.String str, a.ey eyVar) {
        super(2, eyVar);
        this.g = ioVar;
        this.h = kh0Var;
        this.i = str;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.ih0(this.g, this.h, this.i, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.b20.q1(obj);
        a.io ioVar = this.g;
        android.graphics.drawable.Drawable drawable = ioVar.b;
        a.kh0 kh0Var = this.h;
        if (drawable == null) {
            kh0Var.a();
        } else {
            try {
                android.widget.TextView textView = (android.widget.TextView) kh0Var.b.findViewById(2131362255);
                java.lang.String string = kh0Var.f291a.getString(2131951885);
                a.wv.v(string, "mContext.getString(R.str…appops_quickly_grant_app)");
                java.lang.String format = java.lang.String.format(string, java.util.Arrays.copyOf(new java.lang.Object[]{ioVar.f236a, this.i}, 2));
                a.wv.v(format, "format(format, *args)");
                textView.setText(format);
            } catch (java.lang.Exception unused) {
            }
        }
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        a.ih0 ih0Var = (a.ih0) a((a.cz) obj, (a.ey) obj2);
        a.no1 no1Var = a.no1.f387a;
        ih0Var.e(no1Var);
        return no1Var;
    }
}
