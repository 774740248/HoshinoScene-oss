package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ug1 {
    public static final int[] i = new int[3];
    public static final float[] j = {0.0f, 0.5f, 1.0f};
    public static final int[] k = new int[4];
    public static final float[] l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.Paint f593a;
    public final android.graphics.Paint b;
    public final android.graphics.Paint c;
    public int d;
    public int e;
    public int f;
    public final android.graphics.Path g = new android.graphics.Path();
    public final android.graphics.Paint h;

    public ug1() {
        android.graphics.Paint paint = new android.graphics.Paint();
        this.h = paint;
        this.f593a = new android.graphics.Paint();
        a(-16777216);
        paint.setColor(0);
        android.graphics.Paint paint2 = new android.graphics.Paint(4);
        this.b = paint2;
        paint2.setStyle(android.graphics.Paint.Style.FILL);
        this.c = new android.graphics.Paint(paint2);
    }

    public final void a(int i2) {
        this.d = a.sv.d(i2, 68);
        this.e = a.sv.d(i2, 20);
        this.f = a.sv.d(i2, 0);
        this.f593a.setColor(this.d);
    }
}
