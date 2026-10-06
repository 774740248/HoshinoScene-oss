package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class c00 extends a.d00 {
    @Override // a.gz0
    public final void g(android.graphics.Canvas canvas) {
        if (this.z.v.isEmpty()) {
            super.g(canvas);
            return;
        }
        canvas.save();
        canvas.clipOutRect(this.z.v);
        super.g(canvas);
        canvas.restore();
    }
}
