package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class u31 extends a.xv0 {
    public final /* synthetic */ int q;
    public final /* synthetic */ java.lang.Object r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u31(java.lang.Object obj, android.content.Context context, int i) {
        super(context);
        this.q = i;
        this.scrollOffset = obj;
    }

    @Override // a.xv0
    public final int b(android.view.View view, int i) {
        switch (this.q) {
            case 1:
                ((com.google.android.material.carousel.CarouselLayoutManager) this.scrollOffset).getClass();
                throw null;
            default:
                return super.b(view, i);
        }
    }

    @Override // a.xv0
    public final float c(android.util.DisplayMetrics displayMetrics) {
        switch (this.q) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                return 100.0f / displayMetrics.densityDpi;
            case 1:
            default:
                return 25.0f / displayMetrics.densityDpi;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                return 100.0f / displayMetrics.densityDpi;
        }
    }

    @Override // a.xv0
    public final int d(int i) {
        switch (this.q) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                return java.lang.Math.min(100, super.d(i));
            default:
                return super.d(i);
        }
    }

    @Override // a.xv0
    public final android.graphics.PointF e(int i) {
        switch (this.q) {
            case 1:
                ((com.google.android.material.carousel.CarouselLayoutManager) this.scrollOffset).getClass();
                return null;
            default:
                return super.e(i);
        }
    }

    @Override // a.xv0
    public final void g(android.view.View view, a.z91 z91Var, a.x91 x91Var) {
        switch (this.q) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.v31 v31Var = (a.v31) this.v31Var;
                int[] a2 = v31Var.a(v31Var.f621a.getLayoutManager(), view);
                int i = a2[0];
                int i2 = a2[1];
                int ceil = (int) java.lang.Math.ceil(d(java.lang.Math.max(java.lang.Math.abs(i), java.lang.Math.abs(i2))) / 0.3356d);
                if (ceil > 0) {
                    android.view.animation.DecelerateInterpolator decelerateInterpolator = this.j;
                    x91Var.f684a = i;
                    x91Var.b = i2;
                    x91Var.c = ceil;
                    x91Var.e = decelerateInterpolator;
                    x91Var.f = true;
                    return;
                }
                return;
            default:
                super.g(view, z91Var, x91Var);
                return;
        }
    }
}
