package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final /* synthetic */ class n80 implements android.view.View.OnClickListener {
    public final /* synthetic */ int c;
    public final /* synthetic */ java.lang.Object d;
    public final /* synthetic */ java.lang.Object e;

    public /* synthetic */ n80(java.lang.Object obj, int i, java.lang.Object obj2) {
        this.c = i;
        this.d = obj;
        this.e = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        int i = this.c;
        java.lang.Object obj = this.e;
        java.lang.Object obj2 = this.d;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                android.view.View view2 = (android.view.View) obj2;
                a.p80 p80Var = (a.p80) obj;
                a.wv.w(p80Var, "this$0");
                android.content.Context context = view2.getContext();
                android.content.Intent intent = new android.content.Intent(view2.getContext(), (java.lang.Class<?>) com.omarea.vtools.activities.ActivityFastShare.class);
                intent.putExtra("packageName", p80Var.e.getPackageName());
                context.startActivity(intent);
                return;
            case 1:
                a.v60 v60Var = (a.v60) obj2;
                a.nk nkVar = (a.nk) obj;
                a.wv.w(v60Var, "$dialog");
                a.wv.w(nkVar, "$xposedExtension");
                v60Var.a();
                nkVar.V();
                return;
            default:
                a.kf0 kf0Var = (a.kf0) obj2;
                a.la1 la1Var = (a.la1) obj;
                a.fa0 fa0Var = a.kf0.B;
                a.wv.w(kf0Var, "this$0");
                a.wv.w(la1Var, "$lastClickTime");
                try {
                    android.widget.TextView textView = kf0Var.l;
                    if (textView != null) {
                        textView.setVisibility(kf0Var.r ? 8 : 0);
                    }
                    ((android.widget.LinearLayout) view.findViewById(2131362543)).setOrientation(!kf0Var.r ? 1 : 0);
                    android.view.View view3 = a.kf0.E;
                    a.wv.t(view3, "null cannot be cast to non-null type android.widget.LinearLayout");
                    ((android.widget.LinearLayout) view3).setOrientation(kf0Var.r ? 1 : 0);
                    kf0Var.r = !kf0Var.r;
                } catch (java.lang.Exception unused) {
                }
                try {
                    if (java.lang.System.currentTimeMillis() - la1Var.c < 300) {
                        a.kf0.a(true);
                        return;
                    } else {
                        la1Var.c = java.lang.System.currentTimeMillis();
                        return;
                    }
                } catch (java.lang.Exception unused2) {
                    return;
                }
        }
    }
}
