package a;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import com.omarea.vtools.activities.ActionPageOnline;

/* loaded from: /tmp/jadx-9051527860862319108.dex */
public final /* synthetic */ class p2 implements View.OnClickListener {

    public p2(ActionPageOnline p0) {
        this(p0, 0);
    }
    public final /* synthetic */ int c;
    public final /* synthetic */ ActionPageOnline d;

    public /* synthetic */ p2(ActionPageOnline actionPageOnline, int i) {
        this.c = i;
        this.d = actionPageOnline;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.c;
        ActionPageOnline actionPageOnline = this.d;
        switch (i) {
            case 0:
                gu0[] gu0VarArr = ActionPageOnline.p;
                wv.w(actionPageOnline, "this$0");
                actionPageOnline.finish();
                return;
            case 1:
                gu0[] gu0VarArr2 = ActionPageOnline.p;
                wv.w(actionPageOnline, "this$0");
                Object systemService = actionPageOnline.getSystemService("clipboard");
                wv.t(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
                ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText("text", ((TextView) actionPageOnline.d.a(ActionPageOnline.p[0])).getText().toString()));
                Toast.makeText((Context) actionPageOnline, (CharSequence) actionPageOnline.getString(2131952139), 0).show();
                return;
            default:
                gu0[] gu0VarArr3 = ActionPageOnline.p;
                wv.w(actionPageOnline, "this$0");
                Object systemService2 = actionPageOnline.getSystemService("clipboard");
                wv.t(systemService2, "null cannot be cast to non-null type android.content.ClipboardManager");
                ((ClipboardManager) systemService2).setPrimaryClip(ClipData.newPlainText("text", ((TextView) actionPageOnline.h.a(ActionPageOnline.p[4])).getText().toString()));
                Toast.makeText((Context) actionPageOnline, (CharSequence) actionPageOnline.getString(2131952139), 0).show();
                return;
        }
    }
}
