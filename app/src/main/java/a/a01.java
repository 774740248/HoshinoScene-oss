package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class a01 extends android.widget.FrameLayout implements a.mv {
    public final android.view.CollapsibleActionView c;

    /* JADX WARN: Multi-variable type inference failed */
    public a01(android.view.View view) {
        super(view.getContext());
        this.c = (android.view.CollapsibleActionView) view;
        addView(view);
    }

    @Override // a.mv
    public final void b() {
        this.c.onActionViewExpanded();
    }

    @Override // a.mv
    public final void c() {
        this.c.onActionViewCollapsed();
    }
}
