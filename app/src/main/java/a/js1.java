package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class js1 extends a.mn1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f267a;
    public final /* synthetic */ android.view.View b;
    public final /* synthetic */ android.view.View c;
    public final /* synthetic */ a.dd0 d;

    public js1(a.dd0 dd0Var, android.view.ViewGroup viewGroup, android.view.View view, android.view.View view2) {
        this.d = dd0Var;
        this.f267a = viewGroup;
        this.b = view;
        this.c = view2;
    }

    @Override // a.mn1, a.kn1
    public final void c() {
        this.f267a.getOverlay().remove(this.b);
    }

    @Override // a.kn1
    public final void d(a.ln1 ln1Var) {
        this.c.setTag(2131363026, null);
        this.f267a.getOverlay().remove(this.b);
        ln1Var.v(this);
    }

    @Override // a.mn1, a.kn1
    public final void e() {
        android.view.View view = this.b;
        if (view.getParent() == null) {
            this.f267a.getOverlay().add(view);
            return;
        }
        a.dd0 dd0Var = this.d;
        java.util.ArrayList arrayList = dd0Var.o;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((android.animation.Animator) arrayList.get(size)).cancel();
        }
        java.util.ArrayList arrayList2 = dd0Var.s;
        if (arrayList2 == null || arrayList2.size() <= 0) {
            return;
        }
        java.util.ArrayList arrayList3 = (java.util.ArrayList) dd0Var.s.clone();
        int size2 = arrayList3.size();
        for (int i = 0; i < size2; i++) {
            ((a.kn1) arrayList3.get(i)).a();
        }
    }
}
