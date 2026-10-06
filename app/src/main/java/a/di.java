package a;

import android.view.View;

/* loaded from: /tmp/jadx-9051527860862319108.dex */
public final /* synthetic */ class di implements View.OnClickListener {

    public di(gi p0) {
        this(p0, null, 0);
    }
    public final /* synthetic */ int c;
    public final /* synthetic */ gi d;
    public final /* synthetic */ fi e;

    public /* synthetic */ di(gi giVar, fi fiVar, int i) {
        this.c = i;
        this.d = giVar;
        this.e = fiVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.c;
        fi fiVar = this.e;
        gi giVar = this.d;
        switch (i) {
            case 0:
                wv.w(giVar, "this$0");
                wv.w(fiVar, "$viewHolder");
                ei eiVar = giVar.h;
                if (eiVar != null) {
                    wv.v(view, "it");
                    eiVar.a(view, fiVar.d());
                    return;
                }
                return;
            default:
                wv.w(giVar, "this$0");
                wv.w(fiVar, "$viewHolder");
                ei eiVar2 = giVar.i;
                if (eiVar2 != null) {
                    wv.v(view, "it");
                    eiVar2.a(view, fiVar.d());
                    return;
                }
                return;
        }
    }
}
