package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class h60 extends a.lj1 implements a.fp0 {
    public final /* synthetic */ android.view.View g;
    public final /* synthetic */ androidx.recyclerview.widget.LinearLayoutManager h;
    public final /* synthetic */ java.util.ArrayList i;
    public final /* synthetic */ a.ma1 j;
    public final /* synthetic */ a.v60 k;
    public final /* synthetic */ a.bp0 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h60(android.view.View view, androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager, java.util.ArrayList arrayList, a.ma1 ma1Var, a.v60 v60Var, a.bp0 bp0Var, a.ey eyVar) {
        super(2, eyVar);
        this.g = view;
        this.h = linearLayoutManager;
        this.i = arrayList;
        this.j = ma1Var;
        this.k = v60Var;
        this.l = bp0Var;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.h60(this.g, this.h, this.i, this.j, this.k, this.l, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.b20.q1(obj);
        android.view.View view = this.g;
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) view.findViewById(2131362205);
        a.ma1 ma1Var = this.j;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(this.h);
            android.content.Context context = recyclerView.getContext();
            a.wv.v(context, "context");
            java.util.ArrayList arrayList = this.i;
            a.dk dkVar = new a.dk(context, arrayList);
            dkVar.o = new a.g60(ma1Var, arrayList);
            recyclerView.setAdapter(dkVar);
        }
        android.view.View findViewById = view.findViewById(2131362097);
        a.v60 v60Var = this.k;
        findViewById.setOnClickListener(new a.q60(v60Var, 20));
        view.findViewById(2131362098).setOnClickListener(new a.sg(ma1Var, v60Var, this.l, 22));
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        a.h60 h60Var = (a.h60) a((a.cz) obj, (a.ey) obj2);
        a.no1 no1Var = a.no1.f387a;
        h60Var.e(no1Var);
        return no1Var;
    }
}
