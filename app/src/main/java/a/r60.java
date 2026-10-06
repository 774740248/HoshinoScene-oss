package a;

import android.view.View;

/* loaded from: /tmp/jadx-9051527860862319108.dex */
public final /* synthetic */ class r60 implements View.OnClickListener {

    public r60() {
        this(null, null, 0);
    }
    public final /* synthetic */ int c;
    public final /* synthetic */ u60 d;
    public final /* synthetic */ v60 e;

    public /* synthetic */ r60(u60 u60Var, v60 v60Var, int i) {
        this.c = i;
        this.d = u60Var;
        this.e = v60Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.c;
        u60 u60Var = this.d;
        v60 v60Var = this.e;
        switch (i) {
            case 0:
                wv.w(v60Var, "$dialog");
                if (u60Var == null) {
                    v60Var.a();
                    return;
                }
                if (u60Var.c) {
                    v60Var.a();
                }
                Runnable runnable = u60Var.b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                wv.w(v60Var, "$dialog");
                if (u60Var == null) {
                    v60Var.a();
                    return;
                }
                if (u60Var.c) {
                    v60Var.a();
                }
                Runnable runnable2 = u60Var.b;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }
}
