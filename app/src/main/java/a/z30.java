package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class z30 implements android.text.TextWatcher {
    public final /* synthetic */ int c;
    public final /* synthetic */ java.lang.Object d;
    public final /* synthetic */ java.lang.Object e;

    public /* synthetic */ z30(java.lang.Object obj, int i, java.lang.Object obj2) {
        this.c = i;
        this.d = obj;
        this.e = obj2;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(android.text.Editable editable) {
        java.lang.String str;
        int i = this.c;
        java.lang.Object obj = this.d;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                if (editable != null) {
                    ((android.view.View) obj).setVisibility(editable.length() > 0 ? 0 : 8);
                    return;
                }
                return;
            default:
                if (editable == null || (str = editable.toString()) == null) {
                    str = "";
                }
                a.ma1 ma1Var = (a.ma1) obj;
                if (a.wv.e(str, ma1Var.c)) {
                    return;
                }
                ma1Var.c = str;
                ((a.ij0) this.e).setValue(str);
                return;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        switch (this.c) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                android.widget.Adapter adapter = ((android.widget.AbsListView) this.e).getAdapter();
                a.wv.t(adapter, "null cannot be cast to non-null type android.widget.Filterable");
                ((android.widget.Filterable) adapter).getFilter().filter(charSequence == null ? "" : charSequence.toString());
                return;
            default:
                return;
        }
    }
}
