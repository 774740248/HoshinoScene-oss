package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class yq0 extends android.view.View {
    public yq0(android.content.Context context) {
        super(context);
        super.setVisibility(8);
    }

    @Override // android.view.View
    public final void draw(android.graphics.Canvas canvas) {
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setGuidelineBegin(int i) {
        a.yw ywVar = (a.yw) getLayoutParams();
        ywVar.f720a = i;
        setLayoutParams(ywVar);
    }

    public void setGuidelineEnd(int i) {
        a.yw ywVar = (a.yw) getLayoutParams();
        ywVar.b = i;
        setLayoutParams(ywVar);
    }

    public void setGuidelinePercent(float f) {
        a.yw ywVar = (a.yw) getLayoutParams();
        ywVar.c = f;
        setLayoutParams(ywVar);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
    }
}
