package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class vy0 extends a.q91 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.google.android.material.datepicker.c f645a;
    public final /* synthetic */ com.google.android.material.button.MaterialButton b;
    public final /* synthetic */ a.wy0 c;

    public vy0(a.wy0 wy0Var, com.google.android.material.datepicker.c cVar, com.google.android.material.button.MaterialButton materialButton) {
        this.c = wy0Var;
        this.f645a = cVar;
        this.b = materialButton;
    }

    @Override // a.q91
    public final void a(androidx.recyclerview.widget.RecyclerView recyclerView, int i) {
        if (i == 0) {
            recyclerView.announceForAccessibility(this.b.getText());
        }
    }

    @Override // a.q91
    public final void b(androidx.recyclerview.widget.RecyclerView recyclerView, int i, int i2) {
        a.wy0 wy0Var = this.c;
        int W0 = i < 0 ? ((androidx.recyclerview.widget.LinearLayoutManager) wy0Var.d0.getLayoutManager()).W0() : ((androidx.recyclerview.widget.LinearLayoutManager) wy0Var.d0.getLayoutManager()).X0();
        com.google.android.material.datepicker.c cVar = this.f645a;
        java.util.Calendar b = a.so1.b(cVar.f.c.c);
        b.add(2, W0);
        wy0Var.Z = new a.n11(b);
        java.util.Calendar b2 = a.so1.b(cVar.f.c.c);
        b2.add(2, W0);
        b2.set(5, 1);
        java.util.Calendar b3 = a.so1.b(b2);
        b3.get(2);
        b3.get(1);
        b3.getMaximum(7);
        b3.getActualMaximum(5);
        b3.getTimeInMillis();
        this.b.setText(a.so1.a("yMMMM", java.util.Locale.getDefault()).format(new java.util.Date(b3.getTimeInMillis())));
    }
}
