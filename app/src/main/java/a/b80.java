package a;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.view.View;

/* loaded from: /tmp/jadx-9051527860862319108.dex */
public final /* synthetic */ class b80 implements View.OnClickListener {

    public b80(x01 p0) {
        this(p0, null, 0);
    }
    public final /* synthetic */ int c;
    public final /* synthetic */ x01 d;
    public final /* synthetic */ v60 e;

    public /* synthetic */ b80(x01 x01Var, v60 v60Var, int i) {
        this.c = i;
        this.d = x01Var;
        this.e = v60Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.c;
        v60 v60Var = this.e;
        x01 x01Var = this.d;
        switch (i) {
            case 0:
                wv.w(x01Var, "this$0");
                wv.w(v60Var, "$d");
                try {
                    Intent intent = new Intent("android.intent.action.SENDTO");
                    intent.setData(Uri.parse("mailto:1191634433@qq.com"));
                    intent.putExtra("android.intent.extra.SUBJECT", "Scene(Paypal)");
                    intent.putExtra("android.intent.extra.TEXT", "I have finished the payment, please send the activation to me as soon as possible.\nHere is my payment information:\nOrderID: XXXXXX\nTime: YYYY/MM/DD");
                    ((Activity) x01Var.e).startActivity(Intent.createChooser(intent, "Send payment information"));
                } catch (Exception unused) {
                    int i2 = x60.f681a;
                    fs1.G((Activity) x01Var.e, "Failed to launch the mail app on your phone, Please send email to helloklf@outlook.com in the following format\n\nI have finished the payment, please send the activation to me as soon as possible.\nHere is my payment information:\nOrderID: XXXXXX\nTime: YYYY/MM/DD", (Runnable) null);
                }
                v60Var.a();
                return;
            default:
                wv.w(x01Var, "this$0");
                wv.w(v60Var, "$d");
                new i50((Activity) x01Var.e, (c50) x01Var.f, (b81) x01Var.g).c();
                v60Var.a();
                return;
        }
    }
}
