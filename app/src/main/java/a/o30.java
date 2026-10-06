package a;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.Toast;

/* loaded from: /tmp/jadx-9051527860862319108.dex */
public final /* synthetic */ class o30 implements View.OnClickListener {

    public o30() {
        this(null, null, 0);
    }
    public final /* synthetic */ int c;
    public final /* synthetic */ v60 d;
    public final /* synthetic */ p30 e;

    public /* synthetic */ o30(v60 v60Var, p30 p30Var, int i) {
        this.c = i;
        this.d = v60Var;
        this.e = p30Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.c;
        p30 p30Var = this.e;
        v60 v60Var = this.d;
        switch (i) {
            case 0:
                wv.w(v60Var, "$dialog");
                wv.w(p30Var, "this$0");
                v60Var.a();
                String string = p30Var.f.getString(2131953360);
                wv.v(string, "context.getString(R.stri…ne_speed_profile_compile)");
                p30Var.e(string);
                return;
            case 1:
                wv.w(v60Var, "$dialog");
                wv.w(p30Var, "this$0");
                v60Var.a();
                String string2 = p30Var.f.getString(2131953359);
                wv.v(string2, "context.getString(R.string.scene_speed_compile)");
                p30Var.e(string2);
                return;
            case 2:
                wv.w(v60Var, "$dialog");
                wv.w(p30Var, "this$0");
                v60Var.a();
                String string3 = p30Var.f.getString(2131953338);
                wv.v(string3, "context.getString(R.stri…scene_everything_compile)");
                p30Var.e(string3);
                return;
            case 3:
                wv.w(v60Var, "$dialog");
                wv.w(p30Var, "this$0");
                v60Var.a();
                String string4 = p30Var.f.getString(2131953348);
                wv.v(string4, "context.getString(R.string.scene_reset_compile)");
                p30Var.e(string4);
                return;
            default:
                wv.w(v60Var, "$dialog");
                wv.w(p30Var, "this$0");
                v60Var.a();
                p5 p5Var = p30Var.f;
                Toast.makeText((Context) p5Var, (CharSequence) p5Var.getString(2131952169), 1).show();
                p30Var.f.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(p30Var.f.getString(2131951833))));
                return;
        }
    }
}
