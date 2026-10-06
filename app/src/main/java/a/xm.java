package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class xm extends android.widget.RatingBar {
    public final a.vm c;

    public xm(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet, 2130969452);
        a.rl1.a(getContext(), this);
        a.vm vmVar = new a.vm(this);
        this.c = vmVar;
        vmVar.a(attributeSet, 2130969452);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        android.graphics.Bitmap bitmap = this.c.b;
        if (bitmap != null) {
            setMeasuredDimension(android.view.View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }
}
