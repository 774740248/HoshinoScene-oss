package a;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

/* loaded from: /tmp/jadx-9051527860862319108.dex */
public final /* synthetic */ class g70 implements View.OnClickListener {

    public g70(l70 p0) {
        this(p0, 0);
    }
    public final /* synthetic */ int c;
    public final /* synthetic */ l70 d;

    public /* synthetic */ g70(l70 l70Var, int i) {
        this.c = i;
        this.d = l70Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.c;
        l70 l70Var = this.d;
        switch (i) {
            case 0:
                fs1 fs1Var = l70.A0;
                wv.w(l70Var, "this$0");
                try {
                    l70Var.S(false, false);
                    return;
                } catch (Exception unused) {
                    return;
                }
            default:
                fs1 fs1Var2 = l70.A0;
                wv.w(l70Var, "this$0");
                try {
                    Object systemService = l70Var.L().getSystemService("clipboard");
                    wv.t(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
                    ClipData newPlainText = ClipData.newPlainText("text", ((TextView) l70Var.p0.a(l70.B0[4])).getText().toString());
                    wv.v(newPlainText, "newPlainText(\"text\", shell_output.text.toString())");
                    ((ClipboardManager) systemService).setPrimaryClip(newPlainText);
                    Toast.makeText(l70Var.f(), l70Var.m(2131952139), 0).show();
                    return;
                } catch (Exception unused2) {
                    Toast.makeText(l70Var.f(), l70Var.m(2131952138), 0).show();
                    return;
                }
        }
    }
}
