package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class o61 extends a.uu0 implements a.bp0 {
    public final /* synthetic */ android.graphics.Canvas d;
    public final /* synthetic */ a.ja1 e;
    public final /* synthetic */ float f;
    public final /* synthetic */ com.omarea.ui.power.PowerStatView g;
    public final /* synthetic */ android.graphics.Path h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o61(android.graphics.Canvas canvas, a.ja1 ja1Var, float f, com.omarea.ui.power.PowerStatView powerStatView, android.graphics.Path path) {
        super(1);
        this.d = canvas;
        this.e = ja1Var;
        this.f = f;
        this.g = powerStatView;
        this.h = path;
    }

    @Override // a.bp0
    public final java.lang.Object i(java.lang.Object obj) {
        float floatValue = ((java.lang.Number) obj).floatValue();
        android.graphics.Canvas canvas = this.d;
        canvas.save();
        com.omarea.ui.power.PowerStatView powerStatView = this.g;
        float height = powerStatView.getHeight();
        float f = this.f;
        canvas.clipRect(this.e.c, f, floatValue + 2.0f, height - f);
        canvas.drawPath(this.h, powerStatView.g);
        canvas.restore();
        return a.no1.f387a;
    }
}
