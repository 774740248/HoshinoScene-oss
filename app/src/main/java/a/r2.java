package a;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* loaded from: /tmp/jadx-9051527860862319108.dex */
public final /* synthetic */ class r2 implements DialogInterface.OnDismissListener {

    public r2() {
        this(null, 0);
    }
    public final /* synthetic */ int c;
    public final /* synthetic */ JsResult d;

    public /* synthetic */ r2(JsResult jsResult, int i) {
        this.c = i;
        this.d = jsResult;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        int i = this.c;
        JsResult jsResult = this.d;
        switch (i) {
            case 0:
                if (jsResult != null) {
                    jsResult.confirm();
                    return;
                }
                return;
            default:
                if (jsResult != null) {
                    jsResult.confirm();
                    return;
                }
                return;
        }
    }
}
