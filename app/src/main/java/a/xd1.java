package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class xd1 extends android.view.View {
    public final a.vj1 c;
    public final a.vj1 d;
    public final a.vj1 e;
    public final a.vj1 f;
    public final a.vj1 g;
    public final a.vj1 h;
    public final a.vj1 i;
    public final a.vj1 j;
    public final a.vj1 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xd1(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        a.wv.w(context, "context");
        a.wv.w(attributeSet, "attrs");
        this.c = new a.vj1(new a.wd1(this, 3));
        this.d = new a.vj1(new a.wd1(this, 8));
        this.e = new a.vj1(new a.wd1(this, 4));
        this.f = new a.vj1(new a.wd1(this, 6));
        this.g = new a.vj1(new a.wd1(this, 5));
        this.h = new a.vj1(new a.wd1(this, 7));
        this.i = new a.vj1(new a.wd1(this, 0));
        this.j = new a.vj1(new a.wd1(this, 2));
        this.k = new a.vj1(new a.wd1(this, 1));
    }

    public final int getColorAccent() {
        return ((java.lang.Number) this.i.a()).intValue();
    }

    public final int getColorPrimary() {
        return ((java.lang.Number) this.k.a()).intValue();
    }

    public final int getColorSecondary() {
        return ((java.lang.Number) this.j.a()).intValue();
    }

    public final int getFull() {
        return ((java.lang.Number) this.c.a()).intValue();
    }

    public final int getHigh() {
        return ((java.lang.Number) this.e.a()).intValue();
    }

    public final int getLow() {
        return ((java.lang.Number) this.g.a()).intValue();
    }

    public final int getMiddle() {
        return ((java.lang.Number) this.f.a()).intValue();
    }

    public final int getNone() {
        return ((java.lang.Number) this.h.a()).intValue();
    }

    public final int getVeryHigh() {
        return ((java.lang.Number) this.d.a()).intValue();
    }
}
