package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class zm extends android.widget.SeekBar {
    public final a.an c;

    public zm(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet, 2130969477);
        a.rl1.a(getContext(), this);
        a.an anVar = new a.an(this);
        this.c = anVar;
        anVar.a(attributeSet, 2130969477);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        a.an anVar = this.c;
        android.graphics.drawable.Drawable drawable = anVar.e;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        android.widget.SeekBar seekBar = anVar.d;
        if (drawable.setState(seekBar.getDrawableState())) {
            seekBar.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        android.graphics.drawable.Drawable drawable = this.c.e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        this.c.d(canvas);
    }
}
