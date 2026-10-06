package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class du {
    public static final a.vj1 f = new a.vj1(a.cu.e);
    public static final a.vj1 g = new a.vj1(a.cu.f);
    public static final a.vj1 h = new a.vj1(a.cu.g);

    /* renamed from: a, reason: collision with root package name */
    public final int f106a;
    public final float b;
    public final float c;
    public final android.graphics.DashPathEffect d;
    public final int e;

    public du(android.content.Context context) {
        int M = a.b20.M(context, 1.0f);
        this.f106a = M;
        float f2 = M;
        this.b = 24.0f * f2;
        this.c = f2 * 8.5f;
        this.d = new android.graphics.DashPathEffect(new float[]{4.0f, 8.0f}, 0.0f);
        this.e = android.graphics.Color.parseColor("#50888888");
    }

    public static void b(android.graphics.Paint paint) {
        paint.reset();
        paint.setColor(a.tg1.g());
        paint.setAntiAlias(true);
        paint.setStrokeWidth(8.0f);
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        paint.setPathEffect(null);
    }

    public final void a(int i, boolean z, android.graphics.Paint paint) {
        a.wv.w(paint, "paint");
        int i2 = this.e;
        if (i == 0) {
            paint.setPathEffect(null);
            paint.setStrokeWidth(2.0f);
            paint.setColor(i2);
        } else if (z) {
            paint.setPathEffect(null);
            paint.setStrokeWidth(1.0f);
            paint.setColor(i2);
        } else {
            paint.setPathEffect(this.d);
            paint.setStrokeWidth(1.0f);
            paint.setColor(i2);
        }
    }

    public final void c(android.graphics.Paint paint) {
        a.wv.w(paint, "paint");
        paint.setTypeface(android.graphics.Typeface.create(android.graphics.Typeface.SANS_SERIF, 0));
        paint.setTextAlign(android.graphics.Paint.Align.CENTER);
        paint.setColor(android.graphics.Color.parseColor("#888888"));
        paint.setTextSize(this.c);
    }

    public final void d(android.graphics.Paint paint) {
        a.wv.w(paint, "paint");
        paint.setTypeface(android.graphics.Typeface.create(android.graphics.Typeface.SANS_SERIF, 0));
        paint.setTextAlign(android.graphics.Paint.Align.RIGHT);
        paint.setColor(android.graphics.Color.parseColor("#888888"));
        paint.setTextSize(this.c);
    }
}
