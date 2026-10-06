package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ia0 extends a.fs1 {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ia0(int i) {
        super(1);
        this.d = i;
    }

    @Override // a.fs1
    public final void Y(com.google.android.material.tabs.TabLayout tabLayout, android.view.View view, android.view.View view2, float f, android.graphics.drawable.Drawable drawable) {
        float cos;
        float f2;
        switch (this.d) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                android.graphics.RectF e = a.fs1.e(tabLayout, view);
                android.graphics.RectF e2 = a.fs1.e(tabLayout, view2);
                if (e.left < e2.left) {
                    double d = (f * 3.141592653589793d) / 2.0d;
                    f2 = (float) (1.0d - java.lang.Math.cos(d));
                    cos = (float) java.lang.Math.sin(d);
                } else {
                    double d2 = (f * 3.141592653589793d) / 2.0d;
                    float sin = (float) java.lang.Math.sin(d2);
                    cos = (float) (1.0d - java.lang.Math.cos(d2));
                    f2 = sin;
                }
                drawable.setBounds(a.el.c(f2, (int) e.left, (int) e2.left), drawable.getBounds().top, a.el.c(cos, (int) e.right, (int) e2.right), drawable.getBounds().bottom);
                return;
            default:
                if (f >= 0.5f) {
                    view = view2;
                }
                android.graphics.RectF e3 = a.fs1.e(tabLayout, view);
                float b = f < 0.5f ? a.el.b(1.0f, 0.0f, 0.0f, 0.5f, f) : a.el.b(0.0f, 1.0f, 0.5f, 1.0f, f);
                drawable.setBounds((int) e3.left, drawable.getBounds().top, (int) e3.right, drawable.getBounds().bottom);
                drawable.setAlpha((int) (b * 255.0f));
                return;
        }
    }
}
