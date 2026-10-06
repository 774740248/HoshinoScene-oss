package a;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/* loaded from: /tmp/jadx-9051527860862319108.dex */
public final /* synthetic */ class z70 implements View.OnClickListener {

    public z70(x01 p0) {
        this(p0, 0);
    }
    public final /* synthetic */ int c;
    public final /* synthetic */ x01 d;

    public /* synthetic */ z70(x01 x01Var, int i) {
        this.c = i;
        this.d = x01Var;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [a.a80] */
    /* JADX WARN: Type inference failed for: r4v3, types: [a.a80] */
    /* JADX WARN: Type inference failed for: r4v4, types: [a.a80] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.c;
        final x01 x01Var = this.d;
        switch (i) {
            case 0:
                wv.w(x01Var, "this$0");
                final int i2 = 0;
                x01Var.a("alipay", (a80) new a.a80());
                return;
            case 1:
                wv.w(x01Var, "this$0");
                final int i3 = 1;
                x01Var.a("wechat", (a80) new a.a80());
                return;
            case 2:
                wv.w(x01Var, "this$0");
                final int i4 = 2;
                x01Var.a("paypal", (a80) new a.a80());
                return;
            default:
                wv.w(x01Var, "this$0");
                x01Var.c("https://play.google.com/store/apps/details?id=" + ((Activity) x01Var.e).getPackageName());
                return;
        }
    }
}
