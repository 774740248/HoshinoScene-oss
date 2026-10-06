package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class wr {
    public static android.graphics.Bitmap f;
    public static final android.util.LruCache g = new android.util.LruCache(3);
    public static final java.util.LinkedHashMap h = new java.util.LinkedHashMap();
    public static final int i = android.graphics.Color.parseColor("#20ffffff");
    public static final int j;
    public static final android.graphics.Paint k;
    public static final float l;
    public static boolean m;

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f673a;
    public int[] b;
    public java.lang.Integer[] c;
    public boolean d;
    public android.graphics.Bitmap e;

    static {
        int parseColor = android.graphics.Color.parseColor("#40ffffff");
        j = parseColor;
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setColor(parseColor);
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        paint.setStrokeWidth(4.0f);
        k = paint;
        l = 30.0f;
    }

    public wr(android.view.View view) {
        a.wv.w(view, "view");
        this.f673a = view;
        this.b = new int[]{Integer.MIN_VALUE, Integer.MIN_VALUE};
        this.c = new java.lang.Integer[]{0, 0};
    }

    public final void a() {
        a.pc1 pc1Var = new a.pc1(l);
        android.view.View view = this.f673a;
        view.setOutlineProvider(pc1Var);
        view.setClipToOutline(true);
        view.getViewTreeObserver().addOnPreDrawListener(new a.vr(0, this));
    }

    public final void b() {
        android.graphics.Bitmap bitmap;
        android.graphics.Bitmap bitmap2 = f;
        if (bitmap2 != null && !m && bitmap2 != null && this.f673a.getWidth() > 0 && this.f673a.getHeight() > 0 && this.f673a.isAttachedToWindow()) {
            android.content.Context context = this.f673a.getContext();
            a.wv.t(context, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            a.ml mlVar = (a.ml) context;
            if (!mlVar.isInPictureInPictureMode() && !mlVar.isInMultiWindowMode()) {
                int[] iArr = new int[2];
                this.f673a.getLocationInWindow(iArr);
                int[] iArr2 = this.b;
                if (iArr2[0] == iArr[0] && iArr2[1] == iArr[1] && this.c[0].intValue() == this.f673a.getWidth() && this.c[1].intValue() == this.f673a.getHeight()) {
                    return;
                }
                this.b = iArr;
                this.c = new java.lang.Integer[]{java.lang.Integer.valueOf(this.f673a.getWidth()), java.lang.Integer.valueOf(this.f673a.getHeight())};
                try {
                    float width = this.f673a.getRootView().getWidth() / 192.0f;
                    int width2 = (int) (this.f673a.getWidth() / width);
                    int height = (int) (this.f673a.getHeight() / width);
                    int i2 = (int) (iArr[0] / width);
                    int i3 = (int) (iArr[1] / width);
                    int width3 = bitmap2.getWidth() - i2;
                    int height2 = bitmap2.getHeight() - i3;
                    if (height <= height2) {
                        height2 = height;
                    }
                    if (width2 <= width3) {
                        width3 = width2;
                    }
                    android.graphics.Bitmap bitmap3 = this.e;
                    if (bitmap3 == null || bitmap3 == null || bitmap3.getWidth() != width2 || (bitmap = this.e) == null || bitmap.getHeight() != height) {
                        android.graphics.Bitmap bitmap4 = this.e;
                        if (bitmap4 != null) {
                            bitmap4.recycle();
                        }
                        this.e = android.graphics.Bitmap.createBitmap(width2, height, android.graphics.Bitmap.Config.ARGB_8888);
                    }
                    android.graphics.Bitmap bitmap5 = this.e;
                    a.wv.s(bitmap5);
                    android.graphics.Canvas canvas = new android.graphics.Canvas(bitmap5);
                    canvas.drawColor(0, android.graphics.PorterDuff.Mode.CLEAR);
                    int i4 = i2 < 0 ? 0 : i2;
                    int i5 = i3 < 0 ? 0 : i3;
                    int i6 = width3 + i2;
                    int width4 = bitmap2.getWidth();
                    if (i6 > width4) {
                        i6 = width4;
                    }
                    int i7 = height2 + i3;
                    int height3 = bitmap2.getHeight();
                    if (i7 > height3) {
                        i7 = height3;
                    }
                    android.graphics.Rect rect = new android.graphics.Rect(i4, i5, i6, i7);
                    canvas.drawBitmap(bitmap2, rect, new android.graphics.Rect(i2 < 0 ? -i2 : 0, i3 < 0 ? -i3 : 0, (i2 < 0 ? -i2 : 0) + rect.width(), (i3 < 0 ? -i3 : 0) + rect.height()), (android.graphics.Paint) null);
                    this.f673a.setBackground(new android.graphics.drawable.BitmapDrawable(this.f673a.getResources(), this.e));
                    this.d = true;
                    return;
                } catch (java.lang.Exception unused) {
                }
            }
        }
        if (this.d) {
            android.view.View view = this.f673a;
            android.content.Context context2 = view.getContext();
            java.lang.Object obj = a.zx.f748a;
            view.setBackground(a.xx.b(context2, 2131231114));
            this.d = false;
        }
    }
}
