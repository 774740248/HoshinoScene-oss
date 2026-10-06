package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class qy0 implements android.view.View.OnClickListener {
    public final /* synthetic */ int c;
    public final /* synthetic */ com.google.android.material.datepicker.c d;
    public final /* synthetic */ a.wy0 e;

    public /* synthetic */ qy0(a.wy0 wy0Var, com.google.android.material.datepicker.c cVar, int i) {
        this.c = i;
        this.e = wy0Var;
        this.d = cVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        int i = this.c;
        com.google.android.material.datepicker.c cVar = this.d;
        a.wy0 wy0Var = this.e;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                int X0 = ((androidx.recyclerview.widget.LinearLayoutManager) wy0Var.d0.getLayoutManager()).X0() - 1;
                if (X0 >= 0) {
                    java.util.Calendar b = a.so1.b(cVar.f.c.c);
                    b.add(2, X0);
                    wy0Var.S(new a.n11(b));
                    return;
                }
                return;
            default:
                int W0 = ((androidx.recyclerview.widget.LinearLayoutManager) wy0Var.d0.getLayoutManager()).W0() + 1;
                if (W0 < wy0Var.d0.getAdapter().c()) {
                    java.util.Calendar b2 = a.so1.b(cVar.f.c.c);
                    b2.add(2, W0);
                    wy0Var.S(new a.n11(b2));
                    return;
                }
                return;
        }
    }
}
