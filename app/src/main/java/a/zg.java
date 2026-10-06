package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final /* synthetic */ class zg implements android.view.View.OnLongClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f734a;
    public final /* synthetic */ int b;
    public final /* synthetic */ a.e91 c;

    public /* synthetic */ zg(a.e91 e91Var, int i, int i2) {
        this.f734a = i2;
        this.c = e91Var;
        this.b = i;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        int i = this.f734a;
        a.e91 e91Var = this.c;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.fh fhVar = (a.fh) e91Var;
                a.wv.w(fhVar, "this$0");
                a.bh bhVar = fhVar.n;
                if (bhVar != null) {
                    a.wv.v(view, "it");
                    bhVar.a(view, this.b);
                }
                return fhVar.n != null;
            default:
                a.wv.w((a.jh) e91Var, "this$0");
                return false;
        }
    }
}
