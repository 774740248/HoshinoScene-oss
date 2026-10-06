package a;

import android.view.View;
import android.widget.EditText;

/* loaded from: /tmp/jadx-9051527860862319108.dex */
public final /* synthetic */ class s30 implements View.OnClickListener {

    public s30() {
        this(null, null, null, null, 0);
    }
    public final /* synthetic */ int c;
    public final /* synthetic */ EditText d;
    public final /* synthetic */ EditText e;
    public final /* synthetic */ v30 f;
    public final /* synthetic */ EditText g;

    public /* synthetic */ s30(EditText editText, EditText editText2, v30 v30Var, EditText editText3, int i) {
        this.c = i;
        this.d = editText;
        this.e = editText2;
        this.f = v30Var;
        this.g = editText3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.c;
        EditText editText = this.g;
        v30 v30Var = this.f;
        EditText editText2 = this.e;
        EditText editText3 = this.d;
        switch (i) {
            case 0:
                wv.w(editText3, "$widthInput");
                wv.w(editText2, "$heightInput");
                wv.w(v30Var, "this$0");
                wv.w(editText, "$dpiInput");
                editText3.setText(String.valueOf(1080));
                editText2.setText(String.valueOf(v30Var.c(1080)));
                editText.setText(String.valueOf(v30Var.b(1080)));
                return;
            case 1:
                wv.w(editText3, "$widthInput");
                wv.w(editText2, "$heightInput");
                wv.w(v30Var, "this$0");
                wv.w(editText, "$dpiInput");
                editText3.setText(String.valueOf(1440));
                editText2.setText(String.valueOf(v30Var.c(1440)));
                editText.setText(String.valueOf(v30Var.b(1440)));
                return;
            default:
                wv.w(editText3, "$widthInput");
                wv.w(editText2, "$heightInput");
                wv.w(v30Var, "this$0");
                wv.w(editText, "$dpiInput");
                editText3.setText(String.valueOf(2160));
                editText2.setText(String.valueOf(v30Var.c(2160)));
                editText.setText(String.valueOf(v30Var.b(2160)));
                return;
        }
    }
}
