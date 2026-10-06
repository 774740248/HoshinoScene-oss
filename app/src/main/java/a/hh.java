package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final /* synthetic */ class hh implements java.lang.Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ android.widget.ImageView d;
    public final /* synthetic */ android.graphics.drawable.Drawable e;

    public /* synthetic */ hh(android.widget.ImageView imageView, android.graphics.drawable.Drawable drawable, int i) {
        this.c = i;
        this.d = imageView;
        this.e = drawable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        android.graphics.drawable.Drawable drawable = this.e;
        android.widget.ImageView imageView = this.d;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                imageView.setImageDrawable(drawable);
                return;
            case 1:
                imageView.setImageDrawable(drawable);
                return;
            default:
                imageView.setImageDrawable(drawable);
                return;
        }
    }
}
