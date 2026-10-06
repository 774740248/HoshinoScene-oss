package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class et extends a.k91 {

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.Paint f135a;
    public final java.util.List b;

    public et() {
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f135a = paint;
        this.b = java.util.Collections.unmodifiableList(new java.util.ArrayList());
        paint.setStrokeWidth(5.0f);
        paint.setColor(-65281);
    }

    @Override // a.k91
    public final void f(android.graphics.Canvas canvas, androidx.recyclerview.widget.RecyclerView recyclerView, a.z91 z91Var) {
        android.graphics.Paint paint = this.f135a;
        paint.setStrokeWidth(recyclerView.getResources().getDimension(2131165421));
        for (a.pu0 pu0Var : (Iterable<a.pu0>) this.b) {
            pu0Var.getClass();
            java.lang.ThreadLocal threadLocal = a.sv.f540a;
            float f = 1.0f - 0.0f;
            paint.setColor(android.graphics.Color.argb((int) ((android.graphics.Color.alpha(-16776961) * 0.0f) + (android.graphics.Color.alpha(-65281) * f)), (int) ((android.graphics.Color.red(-16776961) * 0.0f) + (android.graphics.Color.red(-65281) * f)), (int) ((android.graphics.Color.green(-16776961) * 0.0f) + (android.graphics.Color.green(-65281) * f)), (int) ((android.graphics.Color.blue(-16776961) * 0.0f) + (android.graphics.Color.blue(-65281) * f))));
            pu0Var.getClass();
            float paddingTop = ((com.google.android.material.carousel.CarouselLayoutManager) recyclerView.getLayoutManager()).getPaddingTop();
            pu0Var.getClass();
            com.google.android.material.carousel.CarouselLayoutManager carouselLayoutManager = (com.google.android.material.carousel.CarouselLayoutManager) recyclerView.getLayoutManager();
            canvas.drawLine(0.0f, paddingTop, 0.0f, carouselLayoutManager.q - carouselLayoutManager.getPaddingBottom(), paint);
        }
    }
}
