package a;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* loaded from: /tmp/jadx-9051527860862319108.dex */
public final /* synthetic */ class yd implements Runnable {

    public yd() {
        this(null, null, 0);
    }
    public final /* synthetic */ int c;
    public final /* synthetic */ ImageView d;
    public final /* synthetic */ ma1 e;

    public /* synthetic */ yd(ImageView imageView, ma1 ma1Var, int i) {
        this.c = i;
        this.d = imageView;
        this.e = ma1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        ma1 ma1Var = this.e;
        ImageView imageView = this.d;
        switch (i) {
            case 0:
                imageView.setImageDrawable((Drawable) ma1Var.c);
                return;
            case 1:
                imageView.setImageDrawable((Drawable) ma1Var.c);
                return;
            default:
                imageView.setImageDrawable((Drawable) ma1Var.c);
                return;
        }
    }
}
