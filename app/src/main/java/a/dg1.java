package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class dg1 implements android.widget.AdapterView.OnItemClickListener {
    public final /* synthetic */ int c;
    public final /* synthetic */ android.view.View d;

    public /* synthetic */ dg1(android.view.View view, int i) {
        this.c = i;
        this.d = view;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i, long j) {
        java.lang.Object item;
        int i2 = this.c;
        android.view.View view2 = this.d;
        switch (i2) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                ((androidx.appcompat.widget.SearchView) view2).p(i);
                return;
            default:
                a.ly0 ly0Var = (a.ly0) view2;
                if (i < 0) {
                    a.vw0 vw0Var = ly0Var.g;
                    item = !vw0Var.B.isShowing() ? null : vw0Var.e.getSelectedItem();
                } else {
                    item = ly0Var.getAdapter().getItem(i);
                }
                a.ly0 ly0Var2 = (a.ly0) view2;
                a.ly0.a(ly0Var2, item);
                android.widget.AdapterView.OnItemClickListener onItemClickListener = ly0Var2.getOnItemClickListener();
                a.vw0 vw0Var2 = ly0Var2.g;
                if (onItemClickListener != null) {
                    if (view == null || i < 0) {
                        view = vw0Var2.B.isShowing() ? vw0Var2.e.getSelectedView() : null;
                        i = !vw0Var2.B.isShowing() ? -1 : vw0Var2.e.getSelectedItemPosition();
                        j = !vw0Var2.B.isShowing() ? Long.MIN_VALUE : vw0Var2.e.getSelectedItemId();
                    }
                    onItemClickListener.onItemClick(vw0Var2.e, view, i, j);
                }
                vw0Var2.dismiss();
                return;
        }
    }
}
