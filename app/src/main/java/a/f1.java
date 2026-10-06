package a;
import de.robv.android.xposed.XposedBridge;



/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class f1 implements android.view.View.OnClickListener {
    public final /* synthetic */ int c;
    public final java.lang.Object d;
    public final /* synthetic */ java.lang.Object e;

    public f1(a.v60 v60Var, a.at atVar) {
        this.c = 2;
        this.d = v60Var;
        this.e = atVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        int i = this.c;
        java.lang.Object obj = this.e;
        java.lang.Object obj2 = this.d;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                ((a.o2) obj2).a();
                return;
            case 1:
                a.bn1 bn1Var = (a.bn1) obj;
                android.view.Window.Callback callback = bn1Var.k;
                if (callback == null || !bn1Var.l) {
                    return;
                }
                callback.onMenuItemSelected(0, (a.b2) obj2);
                return;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                ((a.v60) obj2).a();
                ((a.at) ((a.zs) obj)).j(null);
                return;
            default:
                a.vs vsVar = (a.vs) ((a.pm) obj).d;
                int i2 = vsVar.b;
                a.hs1[] hs1VarArr = vsVar.f641a;
                int length = i2 > -1 ? (i2 + 1) % hs1VarArr.length : 1 % hs1VarArr.length;
                vsVar.b = length;
                vsVar.c = true;
                XposedBridge.log("Scene: 切换摄像头 " + length);
                ((android.app.Activity) obj2).recreate();
                return;
        }
    }

    public /* synthetic */ f1(java.lang.Object obj, int i, java.lang.Object obj2) {
        this.c = i;
        this.e = obj;
        this.d = obj2;
    }

    public f1(a.bn1 bn1Var) {
        this.c = 1;
        this.e = bn1Var;
        this.d = new a.b2(bn1Var.f47a.getContext(), bn1Var.h);
    }
}
