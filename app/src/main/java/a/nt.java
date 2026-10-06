package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class nt extends android.util.Property {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f393a = 1;
    public final java.lang.Object b;

    public nt() {
        super(android.graphics.Matrix.class, "imageMatrixProperty");
        this.b = new android.graphics.Matrix();
    }

    @Override // android.util.Property
    public final java.lang.Object get(java.lang.Object obj) {
        switch (this.f393a) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                ((android.graphics.drawable.Drawable) obj).copyBounds((android.graphics.Rect) this.b);
                android.graphics.Rect rect = (android.graphics.Rect) this.b;
                return new android.graphics.PointF(rect.left, rect.top);
            default:
                ((android.graphics.Matrix) this.b).set(((android.widget.ImageView) obj).getImageMatrix());
                return (android.graphics.Matrix) this.b;
        }
    }

    @Override // android.util.Property
    public final void set(java.lang.Object obj, java.lang.Object obj2) {
        switch (this.f393a) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                android.graphics.drawable.Drawable drawable = (android.graphics.drawable.Drawable) obj;
                android.graphics.PointF pointF = (android.graphics.PointF) obj2;
                drawable.copyBounds((android.graphics.Rect) this.b);
                ((android.graphics.Rect) this.b).offsetTo(java.lang.Math.round(pointF.x), java.lang.Math.round(pointF.y));
                drawable.setBounds((android.graphics.Rect) this.b);
                return;
            default:
                ((android.widget.ImageView) obj).setImageMatrix((android.graphics.Matrix) obj2);
                return;
        }
    }

    public nt(int i) {
        super(android.graphics.PointF.class, "boundsOrigin");
        this.b = new android.graphics.Rect();
    }
}
