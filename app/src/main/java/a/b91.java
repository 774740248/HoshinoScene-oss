package a;

import java.util.concurrent.ThreadFactory;
/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class b91 {
    public static final java.util.concurrent.ExecutorService q = java.util.concurrent.Executors.newSingleThreadExecutor((ThreadFactory) (new java.lang.Object()));

    /* renamed from: a, reason: collision with root package name */
    public final android.view.ViewGroup f35a;
    public final boolean b;
    public boolean e;
    public boolean f;
    public long g;
    public android.graphics.drawable.BitmapDrawable h;
    public a.pm j;
    public volatile boolean k;
    public int l;
    public final float c = 0.25f;
    public final int d = 15;
    public final java.lang.Object i = new java.lang.Object();
    public final a.vr m = new a.vr(1, this);
    public final a.gt n = new a.gt(3, this);
    public final android.graphics.Paint o = new android.graphics.Paint(1);
    public final android.graphics.Paint p = new android.graphics.Paint(1);

    public b91(android.view.ViewGroup viewGroup, boolean z) {
        this.f35a = viewGroup;
        this.b = z;
    }

    public final void a(android.graphics.Bitmap bitmap, android.graphics.Bitmap bitmap2) {
        boolean z = this.b;
        float f = z ? 0.7f : 1.2f;
        android.graphics.Paint paint = this.o;
        android.graphics.ColorMatrix colorMatrix = new android.graphics.ColorMatrix();
        colorMatrix.set(new float[]{f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
        paint.setColorFilter(new android.graphics.ColorMatrixColorFilter(colorMatrix));
        android.graphics.Canvas canvas = new android.graphics.Canvas(bitmap2);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        android.graphics.Paint paint2 = this.p;
        paint2.setColor(z ? -16777216 : android.graphics.Color.rgb(220, 220, 220));
        paint2.setAlpha(z ? 80 : 120);
        canvas.drawRect(0.0f, 0.0f, bitmap2.getWidth(), bitmap2.getHeight(), paint2);
    }
}
