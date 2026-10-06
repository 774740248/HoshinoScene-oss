package a;

import android.content.Intent;
import com.omarea.vtools.activities.ActivityFileSelector;

/* loaded from: /tmp/jadx-9051527860862319108.dex */
public final /* synthetic */ class b8 implements Runnable {

    public b8() {
        this(null, null, 0);
    }
    public final /* synthetic */ int c;
    public final /* synthetic */ ActivityFileSelector d;
    public final /* synthetic */ String e;

    public /* synthetic */ b8(ActivityFileSelector activityFileSelector, String str, int i) {
        this.c = i;
        this.d = activityFileSelector;
        this.e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        String str = this.e;
        ActivityFileSelector activityFileSelector = this.d;
        switch (i) {
            case 0:
                fa0 fa0Var = ActivityFileSelector.m;
                wv.w(activityFileSelector, "this$0");
                wv.w(str, "$file");
                activityFileSelector.setResult(-1, new Intent().putExtra("file", str));
                activityFileSelector.finish();
                return;
            default:
                fa0 fa0Var2 = ActivityFileSelector.m;
                wv.w(activityFileSelector, "this$0");
                wv.w(str, "$file");
                activityFileSelector.setResult(-1, new Intent().putExtra("file", str));
                activityFileSelector.finish();
                return;
        }
    }
}
