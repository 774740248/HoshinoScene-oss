package a;

import android.content.Intent;
import android.widget.ProgressBar;
import com.omarea.vtools.activities.ActionPageOnline;
import java.util.Timer;

/* loaded from: /tmp/jadx-9051527860862319108.dex */
public final /* synthetic */ class u2 implements Runnable {

    public u2() {
        this(null, null, false);
    }
    public final /* synthetic */ ActionPageOnline c;
    public final /* synthetic */ ma1 d;
    public final /* synthetic */ boolean e;

    public /* synthetic */ u2(ActionPageOnline actionPageOnline, ma1 ma1Var, boolean z) {
        this.c = actionPageOnline;
        this.d = ma1Var;
        this.e = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ActionPageOnline actionPageOnline = this.c;
        wv.w(actionPageOnline, "this$0");
        ma1 ma1Var = this.d;
        wv.w(ma1Var, "$absPath");
        actionPageOnline.setTitle(2131952668);
        ((ProgressBar) actionPageOnline.f.a(ActionPageOnline.p[2])).setVisibility(8);
        Timer timer = actionPageOnline.o;
        if (timer != null) {
            timer.cancel();
            actionPageOnline.o = null;
        }
        Intent intent = new Intent();
        intent.putExtra("absPath", (String) ma1Var.c);
        actionPageOnline.setResult(0, intent);
        if (this.e) {
            actionPageOnline.finish();
        }
    }
}
