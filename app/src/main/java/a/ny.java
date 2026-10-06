package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ny implements android.view.ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int c;
    public final /* synthetic */ java.lang.Object d;

    public /* synthetic */ ny(int i, java.lang.Object obj) {
        this.c = i;
        this.d = obj;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        int i = this.c;
        java.lang.Object obj = this.d;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                ((androidx.coordinatorlayout.widget.CoordinatorLayout) obj).onChildViewsChanged(0);
                return true;
            default:
                a.di0 di0Var = (a.di0) obj;
                float rotation = di0Var.s.getRotation();
                if (di0Var.o != rotation) {
                    di0Var.o = rotation;
                    di0Var.p();
                }
                return true;
        }
    }
}
