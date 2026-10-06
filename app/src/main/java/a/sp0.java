package a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.omarea.Scene;
import com.omarea.ui.apps.Games;
import com.omarea.vtools.activities.ActivityFastShare;

/* loaded from: /tmp/jadx-9051527860862319108.dex */
public final /* synthetic */ class sp0 implements View.OnClickListener {

    public sp0() {
        this(null, 0);
    }
    public final /* synthetic */ int c;
    public final /* synthetic */ Context d;

    public /* synthetic */ sp0(Context context, int i) {
        this.c = i;
        this.d = context;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.c;
        Context context = this.d;
        switch (i) {
            case 0:
                gu0[] gu0VarArr = Games.l;
                wv.w(context, "$context");
                try {
                    Intent intent = new Intent();
                    intent.setComponent(new ComponentName("com.fastshare.remoteplay", "com.fastshare.remoteplay.ui.ConnectActivity"));
                    intent.addFlags(268435456);
                    context.startActivity(intent);
                    return;
                } catch (Exception unused) {
                    cp cpVar = Scene.c;
                    String string = context.getString(2131952465);
                    wv.v(string, "context.getString(R.string.fs_remote_play)");
                    fs1.X(string, 0);
                    context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://omarea.com/#/platform")));
                    return;
                }
            default:
                gu0[] gu0VarArr2 = Games.l;
                wv.w(context, "$context");
                context.startActivity(new Intent(context, (Class<?>) ActivityFastShare.class));
                return;
        }
    }
}
