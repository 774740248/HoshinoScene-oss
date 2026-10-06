package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class y61 extends a.k91 implements a.p91 {

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.Paint f704a;
    public final android.graphics.RectF b;
    public final float c;
    public final float d;
    public final float e;
    public boolean f;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [a.q91, java.lang.Object] */
    public y61(androidx.recyclerview.widget.RecyclerView recyclerView) {
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.f704a = paint;
        this.b = new android.graphics.RectF();
        this.c = 8.0f * recyclerView.getResources().getDisplayMetrics().density;
        this.d = 48.0f * recyclerView.getResources().getDisplayMetrics().density;
        this.e = 2.0f * recyclerView.getResources().getDisplayMetrics().density;
        android.content.res.TypedArray obtainStyledAttributes = recyclerView.getContext().obtainStyledAttributes(new int[]{android.R.attr.textColorSecondary});
        a.wv.v(obtainStyledAttributes, "recyclerView.context.obt…attr.textColorSecondary))");
        int color = obtainStyledAttributes.getColor(0, -1711276033);
        obtainStyledAttributes.recycle();
        paint.setColor((16777215 & color) | 1711276032);
        recyclerView.i(this);
        recyclerView.s.add(this);
        recyclerView.j((q91) (new java.lang.Object()));
    }

    @Override // a.p91
    public final boolean a(androidx.recyclerview.widget.RecyclerView recyclerView, android.view.MotionEvent motionEvent) {
        a.wv.w(recyclerView, "rv");
        a.wv.w(motionEvent, "e");
        if (motionEvent.getActionMasked() != 0 || !this.b.contains(motionEvent.getX(), motionEvent.getY())) {
            return this.f;
        }
        this.f = true;
        return true;
    }

    @Override // a.p91
    public final void b(androidx.recyclerview.widget.RecyclerView recyclerView, android.view.MotionEvent motionEvent) {
        a.wv.w(recyclerView, "rv");
        a.wv.w(motionEvent, "e");
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                float y = motionEvent.getY();
                int computeVerticalScrollRange = recyclerView.computeVerticalScrollRange() - recyclerView.computeVerticalScrollExtent();
                if (computeVerticalScrollRange <= 0) {
                    return;
                }
                java.lang.Float valueOf = java.lang.Float.valueOf(this.b.height());
                if (valueOf.floatValue() <= 0.0f) {
                    valueOf = null;
                }
                float floatValue = valueOf != null ? valueOf.floatValue() : this.d;
                float height = recyclerView.getHeight() - floatValue;
                if (height < 1.0f) {
                    height = 1.0f;
                }
                recyclerView.scrollBy(0, ((int) (computeVerticalScrollRange * a.wv.B((y - (floatValue / 2.0f)) / height, 0.0f, 1.0f))) - recyclerView.computeVerticalScrollOffset());
                return;
            }
            if (actionMasked != 3) {
                return;
            }
        }
        this.f = false;
    }

    @Override // a.p91
    public final void c(boolean z) {
        if (z) {
            this.f = false;
        }
    }

    @Override // a.k91
    public final void f(android.graphics.Canvas canvas, androidx.recyclerview.widget.RecyclerView recyclerView, a.z91 z91Var) {
        a.wv.w(canvas, "canvas");
        a.wv.w(recyclerView, "parent");
        a.wv.w(z91Var, "state");
        int computeVerticalScrollRange = recyclerView.computeVerticalScrollRange();
        int computeVerticalScrollExtent = recyclerView.computeVerticalScrollExtent();
        android.graphics.RectF rectF = this.b;
        if (computeVerticalScrollRange <= computeVerticalScrollExtent) {
            rectF.setEmpty();
            return;
        }
        float height = recyclerView.getHeight();
        float f = (computeVerticalScrollExtent / computeVerticalScrollRange) * height;
        float f2 = this.d;
        if (f < f2) {
            f = f2;
        }
        float f3 = height - f;
        if (f3 < 0.0f) {
            f3 = 0.0f;
        }
        float computeVerticalScrollOffset = computeVerticalScrollRange > computeVerticalScrollExtent ? (recyclerView.computeVerticalScrollOffset() / (computeVerticalScrollRange - computeVerticalScrollExtent)) * f3 : 0.0f;
        int layoutDirection = recyclerView.getLayoutDirection();
        float f4 = this.e;
        float f5 = this.c;
        if (layoutDirection != 1) {
            f4 = (recyclerView.getWidth() - f5) - f4;
        }
        rectF.set(f4, computeVerticalScrollOffset, f4 + f5, f + computeVerticalScrollOffset);
        float f6 = f5 / 2.0f;
        canvas.drawRoundRect(rectF, f6, f6, this.f704a);
    }
}
