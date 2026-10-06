package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class c2 extends a.xj0 {
    public final /* synthetic */ androidx.appcompat.view.menu.ActionMenuItemView l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(androidx.appcompat.view.menu.ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.l = actionMenuItemView;
    }

    @Override // a.xj0
    public final a.nh1 b() {
        a.e2 e2Var;
        a.d2 d2Var = this.l.o;
        if (d2Var == null || (e2Var = ((a.f2) d2Var).f142a.v) == null) {
            return null;
        }
        return e2Var.a();
    }

    @Override // a.xj0
    public final boolean c() {
        a.nh1 b;
        androidx.appcompat.view.menu.ActionMenuItemView actionMenuItemView = this.l;
        a.oz0 oz0Var = actionMenuItemView.mItemInvoker;
        return oz0Var != null && oz0Var.e(actionMenuItemView.mItemData) && (b = b()) != null && b.b();
    }
}
