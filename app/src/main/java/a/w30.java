package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final /* synthetic */ class w30 implements android.view.View.OnClickListener {
    public final /* synthetic */ int c;
    public final /* synthetic */ android.widget.EditText d;

    public /* synthetic */ w30(android.widget.EditText editText, int i) {
        this.c = i;
        this.d = editText;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        int i = this.c;
        android.widget.EditText editText = this.d;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                editText.setText((java.lang.CharSequence) null);
                return;
            case 1:
                int i2 = a.b70.y0;
                editText.setText((java.lang.CharSequence) null);
                return;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                editText.setText((java.lang.CharSequence) null);
                return;
            default:
                int i3 = a.f70.u0;
                editText.setText((java.lang.CharSequence) null);
                return;
        }
    }
}
