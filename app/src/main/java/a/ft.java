package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ft implements android.view.ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int c;
    public final /* synthetic */ java.lang.Object d;

    public /* synthetic */ ft(int i, java.lang.Object obj) {
        this.c = i;
        this.d = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int i = this.c;
        java.lang.Object obj = this.d;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.kt ktVar = (a.kt) obj;
                if (ktVar.b()) {
                    java.util.ArrayList arrayList = ktVar.k;
                    if (arrayList.size() <= 0 || ((a.jt) arrayList.get(0)).f268a.A) {
                        return;
                    }
                    android.view.View view = ktVar.r;
                    if (view == null || !view.isShown()) {
                        ktVar.dismiss();
                        return;
                    }
                    java.util.Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((a.jt) it.next()).f268a.f();
                    }
                    return;
                }
                return;
            case 1:
                a.ri1 ri1Var = (a.ri1) obj;
                if (ri1Var.b()) {
                    a.m01 m01Var = ri1Var.k;
                    if (m01Var.A) {
                        return;
                    }
                    android.view.View view2 = ri1Var.p;
                    if (view2 == null || !view2.isShown()) {
                        ri1Var.dismiss();
                        return;
                    } else {
                        m01Var.f();
                        return;
                    }
                }
                return;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                a.kn knVar = (a.kn) obj;
                if (!knVar.getInternalPopup().b()) {
                    knVar.h.e(a.cn.b(knVar), a.cn.a(knVar));
                }
                android.view.ViewTreeObserver viewTreeObserver = knVar.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    a.bn.a(viewTreeObserver, this);
                    return;
                }
                return;
            default:
                a.hn hnVar = (a.hn) obj;
                a.kn knVar2 = hnVar.I;
                java.util.WeakHashMap weakHashMap = a.jq1.f264a;
                if (!a.up1.b(knVar2) || !knVar2.getGlobalVisibleRect(hnVar.G)) {
                    hnVar.dismiss();
                    return;
                } else {
                    hnVar.s();
                    hnVar.f();
                    return;
                }
        }
    }
}
