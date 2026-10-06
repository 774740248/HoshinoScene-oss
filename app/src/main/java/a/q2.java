package a;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* loaded from: /tmp/jadx-9051527860862319108.dex */
public final /* synthetic */ class q2 implements DialogInterface.OnClickListener {

    public q2() {
        this(null, 0);
    }
    public final /* synthetic */ int c;
    public final /* synthetic */ JsResult d;

    public /* synthetic */ q2(JsResult jsResult, int i) {
        this.c = i;
        this.d = jsResult;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.c;
        JsResult jsResult = this.d;
        switch (i2) {
            case 0:
                if (jsResult != null) {
                    jsResult.confirm();
                    return;
                }
                return;
            case 1:
                if (jsResult != null) {
                    jsResult.cancel();
                    return;
                }
                return;
            case 2:
                if (jsResult != null) {
                    jsResult.confirm();
                    return;
                }
                return;
            default:
                if (jsResult != null) {
                    jsResult.cancel();
                    return;
                }
                return;
        }
    }
}
