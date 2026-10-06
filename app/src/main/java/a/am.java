package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class am extends a.oq1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ am(int i, java.lang.Object obj) {
        this.f17a = i;
        this.b = obj;
    }

    @Override // a.vr1
    public final void a() {
        int i = this.f17a;
        java.lang.Object obj = this.b;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.yl ylVar = (a.yl) obj;
                ylVar.d.x.setAlpha(1.0f);
                a.km kmVar = ylVar.d;
                kmVar.A.d(null);
                kmVar.A = null;
                return;
            case 1:
                a.km kmVar2 = (a.km) obj;
                kmVar2.x.setAlpha(1.0f);
                kmVar2.A.d(null);
                kmVar2.A = null;
                return;
            default:
                a.bm bmVar = (a.bm) obj;
                bmVar.d.x.setVisibility(8);
                a.km kmVar3 = bmVar.d;
                android.widget.PopupWindow popupWindow = kmVar3.y;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (kmVar3.x.getParent() instanceof android.view.View) {
                    android.view.View view = (android.view.View) kmVar3.x.getParent();
                    java.util.WeakHashMap weakHashMap = a.jq1.f264a;
                    a.vp1.c(view);
                }
                kmVar3.x.e();
                kmVar3.A.d(null);
                kmVar3.A = null;
                android.view.ViewGroup viewGroup = kmVar3.C;
                java.util.WeakHashMap weakHashMap2 = a.jq1.f264a;
                a.vp1.c(viewGroup);
                return;
        }
    }

    @Override // a.oq1, a.vr1
    public final void c() {
        int i = this.f17a;
        java.lang.Object obj = this.b;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                ((a.yl) obj).d.x.setVisibility(0);
                return;
            case 1:
                a.km kmVar = (a.km) obj;
                kmVar.x.setVisibility(0);
                if (kmVar.x.getParent() instanceof android.view.View) {
                    android.view.View view = (android.view.View) kmVar.x.getParent();
                    java.util.WeakHashMap weakHashMap = a.jq1.f264a;
                    a.vp1.c(view);
                    return;
                }
                return;
            default:
                return;
        }
    }
    public boolean n(android.view.View p0, int p1) {
        throw new UnsupportedOperationException("Method not decompiled: am.n");
    }
    public void m(android.view.View p0, float p1, float p2) {
        throw new UnsupportedOperationException("Method not decompiled: am.m");
    }
    public void l(android.view.View p0, int p1, int p2) {
        throw new UnsupportedOperationException("Method not decompiled: am.l");
    }
    public void k(int p0) {
        throw new UnsupportedOperationException("Method not decompiled: am.k");
    }
    public int e(android.view.View p0, int p1) {
        throw new UnsupportedOperationException("Method not decompiled: am.e");
    }
    public int d(android.view.View p0, int p1) {
        throw new UnsupportedOperationException("Method not decompiled: am.d");
    }
}
