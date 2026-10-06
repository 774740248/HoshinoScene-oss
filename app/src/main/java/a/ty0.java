package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ty0 extends androidx.recyclerview.widget.LinearLayoutManager {
    public final /* synthetic */ int G;
    public final /* synthetic */ a.wy0 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ty0(a.wy0 wy0Var, int i, int i2) {
        super(i);
        this.H = wy0Var;
        this.G = i2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.a
    public final void J0(androidx.recyclerview.widget.RecyclerView recyclerView, int i) {
        a.u31 u31Var = new a.u31(this, recyclerView.getContext(), 2);
        u31Var.f695a = i;
        K0(u31Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void M0(a.z91 z91Var, int[] iArr) {
        int i = this.G;
        a.wy0 wy0Var = this.H;
        if (i == 0) {
            iArr[0] = wy0Var.d0.getWidth();
            iArr[1] = wy0Var.d0.getWidth();
        } else {
            iArr[0] = wy0Var.d0.getHeight();
            iArr[1] = wy0Var.d0.getHeight();
        }
    }
}
