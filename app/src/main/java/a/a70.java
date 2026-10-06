package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class a70 implements android.text.TextWatcher {
    public final /* synthetic */ int c;
    public final /* synthetic */ android.view.View d;
    public final /* synthetic */ android.view.View e;

    public /* synthetic */ a70(android.view.View view, android.view.View view2, int i) {
        this.c = i;
        this.d = view;
        this.e = view2;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(android.text.Editable editable) {
        int i = this.c;
        android.view.View view = this.d;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                if (editable != null) {
                    view.setVisibility(editable.length() > 0 ? 0 : 8);
                    return;
                }
                return;
            case 1:
                if (editable != null) {
                    view.setVisibility(editable.length() > 0 ? 0 : 8);
                    return;
                }
                return;
            default:
                if (editable != null) {
                    view.setVisibility(editable.length() > 0 ? 0 : 8);
                    return;
                }
                return;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        int i4 = this.c;
        android.view.View view = this.e;
        switch (i4) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                android.widget.ListAdapter T = a.b20.T(view);
                a.wv.t(T, "null cannot be cast to non-null type android.widget.Filterable");
                ((android.widget.Filterable) T).getFilter().filter(charSequence != null ? charSequence.toString() : "");
                return;
            case 1:
                android.widget.ListAdapter T2 = a.b20.T(view);
                a.wv.t(T2, "null cannot be cast to non-null type android.widget.Filterable");
                ((android.widget.Filterable) T2).getFilter().filter(charSequence != null ? charSequence.toString() : "");
                return;
            default:
                android.widget.ListAdapter T3 = a.b20.T(view);
                a.wv.t(T3, "null cannot be cast to non-null type android.widget.Filterable");
                ((android.widget.Filterable) T3).getFilter().filter(charSequence != null ? charSequence.toString() : "");
                return;
        }
    }
}
