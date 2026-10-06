package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class qh extends a.lj1 implements a.fp0 {
    public final /* synthetic */ a.sh g;
    public final /* synthetic */ a.io h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qh(a.sh shVar, a.io ioVar, a.ey eyVar) {
        super(2, eyVar);
        this.g = shVar;
        this.h = ioVar;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.qh(this.g, this.h, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.b20.q1(obj);
        a.sh shVar = this.g;
        android.widget.TextView textView = shVar.u;
        if (textView == null) {
            a.wv.M1("itemTitle");
            throw null;
        }
        a.io ioVar = this.h;
        textView.setText(ioVar.f236a);
        android.widget.ImageView imageView = shVar.v;
        if (imageView != null) {
            imageView.setImageDrawable(ioVar.b);
            return a.no1.f387a;
        }
        a.wv.M1("itemIcon");
        throw null;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        a.qh qhVar = (a.qh) a((a.cz) obj, (a.ey) obj2);
        a.no1 no1Var = a.no1.f387a;
        qhVar.e(no1Var);
        return no1Var;
    }
}
