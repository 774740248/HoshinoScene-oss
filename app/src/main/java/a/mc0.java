package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class mc0 implements android.view.ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ android.view.View c;
    public final /* synthetic */ int d;
    public final /* synthetic */ a.nc0 e;
    public final /* synthetic */ com.google.android.material.transformation.ExpandableBehavior f;

    public mc0(com.google.android.material.transformation.ExpandableBehavior expandableBehavior, android.view.View view, int i, a.nc0 nc0Var) {
        this.f = expandableBehavior;
        this.c = view;
        this.d = i;
        this.e = nc0Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        android.view.View view = this.c;
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        com.google.android.material.transformation.ExpandableBehavior expandableBehavior = this.f;
        if (expandableBehavior.f764a == this.d) {
            java.lang.Object obj = this.e;
            expandableBehavior.s((android.view.View) obj, view, ((com.google.android.material.floatingactionbutton.FloatingActionButton) obj).expandableWidgetHelper.f475a, false);
        }
        return false;
    }
}
