package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class hk1 implements android.view.View.OnLayoutChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.View f209a;
    public final /* synthetic */ a.ik1 b;

    public hk1(a.ik1 ik1Var, android.view.View view) {
        this.b = ik1Var;
        this.f209a = view;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(android.view.View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        android.view.View view2 = this.f209a;
        if (view2.getVisibility() == 0) {
            this.b.d(view2);
        }
    }
}
