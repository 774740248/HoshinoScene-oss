package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class d00 extends a.gz0 {

    public d00() {
        this(null);
    }
    public static final /* synthetic */ int A = 0;
    public a.b00 z;

    public d00(a.b00 b00Var) {
        super(b00Var);
        this.z = b00Var;
    }

    @Override // a.gz0, android.graphics.drawable.Drawable
    public final android.graphics.drawable.Drawable mutate() {
        this.z = new a.b00(this.z);
        return this;
    }

    public final void p(float f, float f2, float f3, float f4) {
        android.graphics.RectF rectF = this.z.v;
        if (f == rectF.left && f2 == rectF.top && f3 == rectF.right && f4 == rectF.bottom) {
            return;
        }
        rectF.set(f, f2, f3, f4);
        invalidateSelf();
    }
}
