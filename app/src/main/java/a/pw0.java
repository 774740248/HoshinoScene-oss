package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class pw0 implements android.widget.AdapterView.OnItemSelectedListener {
    public final /* synthetic */ int c;
    public final /* synthetic */ java.lang.Object d;

    public /* synthetic */ pw0(int i, java.lang.Object obj) {
        this.c = i;
        this.d = obj;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(android.widget.AdapterView adapterView, android.view.View view, int i, long j) {
        a.y90 y90Var;
        int i2 = this.c;
        java.lang.Object obj = this.d;
        switch (i2) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                if (i == -1 || (y90Var = ((a.vw0) obj).e) == null) {
                    return;
                }
                y90Var.setListSelectionHidden(false);
                return;
            default:
                ((androidx.appcompat.widget.SearchView) obj).q(i);
                return;
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(android.widget.AdapterView adapterView) {
    }
}
