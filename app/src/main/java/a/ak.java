package a;

import android.view.View;

/* loaded from: /tmp/jadx-9051527860862319108.dex */
public final /* synthetic */ class ak implements View.OnClickListener {

    public ak(dk p0) {
        this(p0, 0, 0);
    }
    public final /* synthetic */ int c;
    public final /* synthetic */ dk d;
    public final /* synthetic */ int e;

    public /* synthetic */ ak(dk dkVar, int i, int i2) {
        this.c = i2;
        this.d = dkVar;
        this.e = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.c;
        int i2 = this.e;
        dk dkVar = this.d;
        switch (i) {
            case 0:
                wv.w(dkVar, "this$0");
                dkVar.p(-1, false);
                bk bkVar = dkVar.p;
                if (bkVar != null) {
                    bkVar.b(i2);
                    return;
                }
                return;
            default:
                wv.w(dkVar, "this$0");
                dkVar.p(i2, true);
                return;
        }
    }
}
