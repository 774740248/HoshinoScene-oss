package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class vo1 extends a.yo1 {
    public a.p4 e;
    public float f;
    public a.p4 g;
    public float h;
    public float i;
    public float j;
    public float k;
    public float l;
    public android.graphics.Paint.Cap m;
    public android.graphics.Paint.Join n;
    public float o;

    @Override // a.xo1
    public final boolean a() {
        return this.g.l() || this.e.l();
    }

    @Override // a.xo1
    public final boolean b(int[] iArr) {
        return this.e.p(iArr) | this.g.p(iArr);
    }

    public float getFillAlpha() {
        return this.i;
    }

    public int getFillColor() {
        return this.g.c;
    }

    public float getStrokeAlpha() {
        return this.h;
    }

    public int getStrokeColor() {
        return this.e.c;
    }

    public float getStrokeWidth() {
        return this.f;
    }

    public float getTrimPathEnd() {
        return this.k;
    }

    public float getTrimPathOffset() {
        return this.l;
    }

    public float getTrimPathStart() {
        return this.j;
    }

    public void setFillAlpha(float f) {
        this.i = f;
    }

    public void setFillColor(int i) {
        this.g.c = i;
    }

    public void setStrokeAlpha(float f) {
        this.h = f;
    }

    public void setStrokeColor(int i) {
        this.e.c = i;
    }

    public void setStrokeWidth(float f) {
        this.f = f;
    }

    public void setTrimPathEnd(float f) {
        this.k = f;
    }

    public void setTrimPathOffset(float f) {
        this.l = f;
    }

    public void setTrimPathStart(float f) {
        this.j = f;
    }
}
