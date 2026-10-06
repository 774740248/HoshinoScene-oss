package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class m01 extends a.vw0 implements a.wz0 {
    public static final java.lang.reflect.Method F;
    public a.wz0 E;

    static {
        try {
            if (android.os.Build.VERSION.SDK_INT <= 28) {
                F = android.widget.PopupWindow.class.getDeclaredMethod("setTouchModal", java.lang.Boolean.TYPE);
            }
        } catch (java.lang.NoSuchMethodException unused) {
            android.util.Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override // a.vw0
    public final a.y90 a(android.content.Context context, boolean z) {
        a.l01 l01Var = new a.l01(context, z);
        l01Var.setHoverListener(this);
        return l01Var;
    }

    @Override // a.wz0
    public final void h(a.pz0 pz0Var, a.xz0 xz0Var) {
        a.wz0 wz0Var = this.E;
        if (wz0Var != null) {
            wz0Var.h(pz0Var, xz0Var);
        }
    }

    @Override // a.wz0
    public final void q(a.pz0 pz0Var, android.view.MenuItem menuItem) {
        a.wz0 wz0Var = this.E;
        if (wz0Var != null) {
            wz0Var.q(pz0Var, menuItem);
        }
    }
}
