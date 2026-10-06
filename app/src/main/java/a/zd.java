package a;

import android.content.Context;
import android.widget.ImageView;
import com.omarea.vtools.activities.ActivityProcess;

/* loaded from: /tmp/jadx-9051527860862319108.dex */
public final /* synthetic */ class zd implements Runnable {

    public zd() {
        this(null, null, 0);
    }
    public final /* synthetic */ int c;
    public final /* synthetic */ ImageView d;
    public final /* synthetic */ ActivityProcess e;

    public /* synthetic */ zd(ImageView imageView, ActivityProcess activityProcess, int i) {
        this.c = i;
        this.d = imageView;
        this.e = activityProcess;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        ActivityProcess activityProcess = this.e;
        ImageView imageView = this.d;
        switch (i) {
            case 0:
                Context context = activityProcess.getContext();
                Object obj = zx.f748a;
                imageView.setImageDrawable(xx.b(context, 2131231235));
                return;
            case 1:
                Context context2 = activityProcess.getContext();
                Object obj2 = zx.f748a;
                imageView.setImageDrawable(xx.b(context2, 2131231235));
                return;
            default:
                Context context3 = activityProcess.getContext();
                Object obj3 = zx.f748a;
                imageView.setImageDrawable(xx.b(context3, 2131231235));
                return;
        }
    }
}
