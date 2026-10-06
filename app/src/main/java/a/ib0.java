package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ib0 extends a.fa0 {
    public final a.hb0 e;

    public ib0(android.widget.TextView textView) {
        super(16, (java.lang.Object) null);
        this.e = new a.hb0(textView);
    }

    @Override // a.fa0
    public final void A(boolean z) {
        if (!(a.ta0.j != null)) {
            return;
        }
        this.e.A(z);
    }

    @Override // a.fa0
    public final void D(boolean z) {
        boolean z2 = !(a.ta0.j != null);
        a.hb0 hb0Var = this.e;
        if (z2) {
            hb0Var.g = z;
        } else {
            hb0Var.D(z);
        }
    }

    @Override // a.fa0
    public final android.text.InputFilter[] l(android.text.InputFilter[] inputFilterArr) {
        return (a.ta0.j != null) ^ true ? inputFilterArr : this.e.l(inputFilterArr);
    }
}
