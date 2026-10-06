package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ct1 extends a.oq1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f83a;
    public final /* synthetic */ a.et1 b;

    public /* synthetic */ ct1(a.et1 et1Var, int i) {
        this.f83a = i;
        this.b = et1Var;
    }

    @Override // a.vr1
    public final void a() {
        android.view.View view;
        int i = this.f83a;
        a.et1 et1Var = this.b;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                if (et1Var.o && (view = et1Var.g) != null) {
                    view.setTranslationY(0.0f);
                    et1Var.d.setTranslationY(0.0f);
                }
                et1Var.d.setVisibility(8);
                et1Var.d.setTransitioning(false);
                et1Var.s = null;
                a.n2 n2Var = et1Var.k;
                if (n2Var != null) {
                    n2Var.b(et1Var.j);
                    et1Var.j = null;
                    et1Var.k = null;
                }
                androidx.appcompat.widget.ActionBarOverlayLayout actionBarOverlayLayout = et1Var.c;
                if (actionBarOverlayLayout != null) {
                    java.util.WeakHashMap weakHashMap = a.jq1.f264a;
                    a.vp1.c(actionBarOverlayLayout);
                    return;
                }
                return;
            default:
                et1Var.s = null;
                et1Var.d.requestLayout();
                return;
        }
    }
    public boolean n(android.view.View p0, int p1) {
        throw new UnsupportedOperationException("Method not decompiled: ct1.n");
    }
    public void m(android.view.View p0, float p1, float p2) {
        throw new UnsupportedOperationException("Method not decompiled: ct1.m");
    }
    public void l(android.view.View p0, int p1, int p2) {
        throw new UnsupportedOperationException("Method not decompiled: ct1.l");
    }
    public void k(int p0) {
        throw new UnsupportedOperationException("Method not decompiled: ct1.k");
    }
    public int e(android.view.View p0, int p1) {
        throw new UnsupportedOperationException("Method not decompiled: ct1.e");
    }
    public int d(android.view.View p0, int p1) {
        throw new UnsupportedOperationException("Method not decompiled: ct1.d");
    }
}
