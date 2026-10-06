package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class es1 extends a.ds1 {
    @Override // a.ds1, a.fs1
    public final void Q(android.view.View view, int i) {
        view.setTransitionVisibility(i);
    }

    @Override // a.as1
    public final float a0(android.view.View view) {
        float transitionAlpha;
        transitionAlpha = view.getTransitionAlpha();
        return transitionAlpha;
    }

    @Override // a.as1
    public final void b0(android.view.View view, float f) {
        view.setTransitionAlpha(f);
    }

    @Override // a.bs1
    public final void c0(android.view.View view, android.graphics.Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // a.bs1
    public final void d0(android.view.View view, android.graphics.Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }

    @Override // a.cs1
    public final void e0(android.view.View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }
}
