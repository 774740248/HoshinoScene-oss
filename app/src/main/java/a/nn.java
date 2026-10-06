package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class nn implements java.lang.Runnable {
    public final /* synthetic */ android.widget.TextView c;
    public final /* synthetic */ android.graphics.Typeface d;
    public final /* synthetic */ int e;

    public nn(android.widget.TextView textView, android.graphics.Typeface typeface, int i) {
        this.c = textView;
        this.d = typeface;
        this.e = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.setTypeface(this.d, this.e);
    }
}
