package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final /* synthetic */ class im0 implements android.widget.CompoundButton.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f233a;
    public final /* synthetic */ a.bn0 b;

    public /* synthetic */ im0(a.bn0 bn0Var, int i) {
        this.f233a = i;
        this.b = bn0Var;
    }

    /* JADX WARN: Type inference failed for: r8v2, types: [a.bp0, a.lj1] */
    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
        int i = this.f233a;
        a.bn0 bn0Var = this.b;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.gu0[] gu0VarArr = a.bn0.x0;
                a.wv.w(bn0Var, "this$0");
                a.wv.w(compoundButton, "<anonymous parameter 0>");
                ((android.widget.LinearLayout) bn0Var.g0.a(a.bn0.x0[10])).setVisibility(z ? 0 : 8);
                if (z) {
                    a.cp cpVar = com.omarea.Scene.c;
                    a.fs1.c((bp0) new a.lj1(1, null));
                    return;
                }
                a.cp cpVar2 = com.omarea.Scene.c;
                java.lang.String m = bn0Var.m(2131953430);
                a.wv.v(m, "getString(R.string.schedule_restore_automatic)");
                a.fs1.X(m, 1);
                a.fs1.c(new a.wm0(bn0Var, null));
                return;
            default:
                a.gu0[] gu0VarArr2 = a.bn0.x0;
                a.wv.w(bn0Var, "this$0");
                a.wv.w(compoundButton, "<anonymous parameter 0>");
                ((android.widget.LinearLayout) bn0Var.j0.a(a.bn0.x0[13])).setVisibility(z ? 8 : 0);
                return;
        }
    }
}
