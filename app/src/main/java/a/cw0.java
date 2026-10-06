package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final /* synthetic */ class cw0 implements android.view.View.OnLongClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f85a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ cw0(int i, java.lang.Object obj) {
        this.f85a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        int i = this.f85a;
        java.lang.Object obj = this.b;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.dw0 dw0Var = (a.dw0) obj;
                a.wv.w(dw0Var, "this$0");
                a.s31 s31Var = dw0Var.h;
                if (s31Var != null) {
                    java.lang.String index = dw0Var.b.getIndex();
                    a.mm mmVar = s31Var.f513a;
                    com.omarea.krscript.model.NodeInfoBase d = a.mm.d(index, (java.util.ArrayList) mmVar.b);
                    if (d instanceof com.omarea.krscript.model.ClickableNode) {
                        com.omarea.krscript.model.ClickableNode clickableNode = (com.omarea.krscript.model.ClickableNode) d;
                        a.a2 a2Var = (a.a2) ((a.r31) mmVar.c);
                        a2Var.getClass();
                        a.wv.w(clickableNode, "clickableNode");
                        if (clickableNode.getKey().length() == 0) {
                            int i2 = a.x60.f681a;
                            a.kk0 K = a2Var.K();
                            java.lang.String m = a2Var.m(2131952736);
                            a.wv.v(m, "getString(R.string.kr_shortcut_create_fail)");
                            java.lang.String m2 = a2Var.m(2131952772);
                            a.wv.v(m2, "getString(R.string.kr_ushortcut_nsupported)");
                            a.fs1.a(K, m, m2, null);
                        } else {
                            com.omarea.krscript.model.KrScriptActionHandler krScriptActionHandler = a2Var.Y;
                            if (krScriptActionHandler != null) {
                                krScriptActionHandler.addToFavorites(clickableNode, new a.x1(a2Var));
                            }
                        }
                    }
                }
                return true;
            case 1:
                a.pl0 pl0Var = (a.pl0) obj;
                a.gu0[] gu0VarArr = a.pl0.W0;
                a.wv.w(pl0Var, "this$0");
                ((android.widget.TextView) pl0Var.H0.a(a.pl0.W0[37])).setText(pl0Var.j().getText(2131953213));
                a.cp cpVar = com.omarea.Scene.c;
                a.fs1.c(new a.el0(pl0Var, null));
                return true;
            default:
                android.widget.CompoundButton compoundButton = (android.widget.CompoundButton) obj;
                android.view.WindowManager windowManager = a.hh0.d;
                compoundButton.getContext().startActivity(new android.content.Intent(compoundButton.getContext(), (java.lang.Class<?>) com.omarea.vtools.activities.ActivityCpuControl.class));
                return true;
        }
    }
}
