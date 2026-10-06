package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class wg1 {

    public wg1() {
    }

    public static final a.bb1 m = new a.bb1(0.5f);

    /* renamed from: a, reason: collision with root package name */
    public a.b20 f661a = new a.qc1();
    public a.b20 b = new a.qc1();
    public a.b20 c = new a.qc1();
    public a.b20 d = new a.qc1();
    public a.qy e = new a.d(0.0f);
    public a.qy f = new a.d(0.0f);
    public a.qy g = new a.d(0.0f);
    public a.qy h = new a.d(0.0f);
    public a.fa0 i = a.b20.H();
    public a.fa0 j = a.b20.H();
    public a.fa0 k = a.b20.H();
    public a.fa0 l = a.b20.H();

    public static a.vg1 a(android.content.Context context, int i, int i2, a.qy qyVar) {
        android.view.ContextThemeWrapper contextThemeWrapper = new android.view.ContextThemeWrapper(context, i);
        if (i2 != 0) {
            contextThemeWrapper = new android.view.ContextThemeWrapper(contextThemeWrapper, i2);
        }
        android.content.res.TypedArray obtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(a.t81.y);
        try {
            int i3 = obtainStyledAttributes.getInt(0, 0);
            int i4 = obtainStyledAttributes.getInt(3, i3);
            int i5 = obtainStyledAttributes.getInt(4, i3);
            int i6 = obtainStyledAttributes.getInt(2, i3);
            int i7 = obtainStyledAttributes.getInt(1, i3);
            a.qy c = c(obtainStyledAttributes, 5, qyVar);
            a.qy c2 = c(obtainStyledAttributes, 8, c);
            a.qy c3 = c(obtainStyledAttributes, 9, c);
            a.qy c4 = c(obtainStyledAttributes, 7, c);
            a.qy c5 = c(obtainStyledAttributes, 6, c);
            a.vg1 vg1Var = new a.vg1();
            a.b20 G = a.b20.G(i4);
            vg1Var.f632a = G;
            a.vg1.b(G);
            vg1Var.e = c2;
            a.b20 G2 = a.b20.G(i5);
            vg1Var.b = G2;
            a.vg1.b(G2);
            vg1Var.f = c3;
            a.b20 G3 = a.b20.G(i6);
            vg1Var.c = G3;
            a.vg1.b(G3);
            vg1Var.g = c4;
            a.b20 G4 = a.b20.G(i7);
            vg1Var.d = G4;
            a.vg1.b(G4);
            vg1Var.h = c5;
            return vg1Var;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static a.vg1 b(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        a.d dVar = new a.d(0);
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.t81.s, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        return a(context, resourceId, resourceId2, dVar);
    }

    public static a.qy c(android.content.res.TypedArray typedArray, int i, a.qy qyVar) {
        android.util.TypedValue peekValue = typedArray.peekValue(i);
        if (peekValue == null) {
            return qyVar;
        }
        int i2 = peekValue.type;
        return i2 == 5 ? new a.d(android.util.TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics())) : i2 == 6 ? new a.bb1(peekValue.getFraction(1.0f, 1.0f)) : qyVar;
    }

    public final boolean d(android.graphics.RectF rectF) {
        boolean z = this.l.getClass().equals(a.fa0.class) && this.j.getClass().equals(a.fa0.class) && this.i.getClass().equals(a.fa0.class) && this.k.getClass().equals(a.fa0.class);
        float a2 = this.e.a(rectF);
        return z && ((this.f.a(rectF) > a2 ? 1 : (this.f.a(rectF) == a2 ? 0 : -1)) == 0 && (this.h.a(rectF) > a2 ? 1 : (this.h.a(rectF) == a2 ? 0 : -1)) == 0 && (this.g.a(rectF) > a2 ? 1 : (this.g.a(rectF) == a2 ? 0 : -1)) == 0) && ((this.b instanceof a.qc1) && (this.f661a instanceof a.qc1) && (this.c instanceof a.qc1) && (this.d instanceof a.qc1));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, a.vg1] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, a.b20] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, a.b20] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, a.b20] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, a.b20] */
    public final a.vg1 e() {
        vg1 obj = new vg1();
        obj.f632a = (b20) (new java.lang.Object());
        obj.b = (b20) (new java.lang.Object());
        obj.c = (b20) (new java.lang.Object());
        obj.d = (b20) (new java.lang.Object());
        obj.e = new a.d(0.0f);
        obj.f = new a.d(0.0f);
        obj.g = new a.d(0.0f);
        obj.h = new a.d(0.0f);
        obj.i = a.b20.H();
        obj.j = a.b20.H();
        obj.k = a.b20.H();
        obj.f632a = this.f661a;
        obj.b = this.b;
        obj.c = this.c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f = this.f;
        obj.g = this.g;
        obj.h = this.h;
        obj.i = this.i;
        obj.j = this.j;
        obj.k = this.k;
        obj.l = this.l;
        return obj;
    }
}
