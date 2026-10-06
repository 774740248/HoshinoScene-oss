package a;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/* loaded from: /tmp/jadx-9051527860862319108.dex */
public final /* synthetic */ class fj0 implements View.OnFocusChangeListener {

    public fj0() {
        this(null, null, null);
    }

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ia1 f4a;
    public final /* synthetic */ ij0 b;
    public final /* synthetic */ EditText c;

    public /* synthetic */ fj0(ia1 ia1Var, u41 u41Var, EditText editText) {
        this.f4a = ia1Var;
        this.b = u41Var;
        this.c = editText;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        String str;
        ia1 ia1Var = this.f4a;
        wv.w(ia1Var, "$currentValue");
        ij0 ij0Var = this.b;
        wv.w(ij0Var, "$inputHandler");
        EditText editText = this.c;
        wv.w(editText, "$editText");
        wv.t(view, "null cannot be cast to non-null type android.widget.TextView");
        CharSequence text = ((TextView) view).getText();
        if (text == null || (str = text.toString()) == null) {
            str = "";
        }
        try {
            double parseDouble = Double.parseDouble(str);
            ia1Var.c = parseDouble;
            ij0Var.setValue(Double.valueOf(parseDouble));
        } catch (Exception unused) {
            editText.setText(String.valueOf(ia1Var.c));
        }
    }
}
