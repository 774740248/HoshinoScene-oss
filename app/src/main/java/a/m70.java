package a;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.Toast;

/* loaded from: /tmp/jadx-9051527860862319108.dex */
public final /* synthetic */ class m70 implements View.OnClickListener {

    public m70(ej1 p0) {
        this(p0, 0);
    }
    public final /* synthetic */ int c;
    public final /* synthetic */ ej1 d;

    public /* synthetic */ m70(ej1 ej1Var, int i) {
        this.c = i;
        this.d = ej1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.c;
        ej1 ej1Var = this.d;
        switch (i) {
            case 0:
                wv.w(ej1Var, "this$0");
                try {
                    ((Context) ej1Var.d).startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://vtools.omarea.com/#/email")));
                    return;
                } catch (Exception unused) {
                    Toast.makeText((Context) ej1Var.d, 2131952503, 0).show();
                    return;
                }
            default:
                wv.w(ej1Var, "this$0");
                new l1((Context) ej1Var.d, 14).j();
                return;
        }
    }
}
