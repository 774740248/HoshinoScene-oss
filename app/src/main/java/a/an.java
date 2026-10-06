package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class an extends a.vm {
    public final android.widget.SeekBar d;
    public android.graphics.drawable.Drawable e;
    public android.content.res.ColorStateList f;
    public android.graphics.PorterDuff.Mode g;
    public boolean h;
    public boolean i;

    public an(android.widget.SeekBar seekBar) {
        super(seekBar);
        this.f = null;
        this.g = null;
        this.h = false;
        this.i = false;
        this.d = seekBar;
    }

    @Override // a.vm
    public final void a(android.util.AttributeSet attributeSet, int i) {
        super.a(attributeSet, 2130969477);
        android.widget.SeekBar seekBar = this.d;
        android.content.Context context = seekBar.getContext();
        int[] iArr = a.u81.g;
        a.nk G = a.nk.G(context, attributeSet, iArr, 2130969477);
        a.jq1.n(seekBar, seekBar.getContext(), iArr, attributeSet, (android.content.res.TypedArray) G.e, 2130969477);
        android.graphics.drawable.Drawable m = G.m(0);
        if (m != null) {
            seekBar.setThumb(m);
        }
        android.graphics.drawable.Drawable l = G.l(1);
        android.graphics.drawable.Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.e = l;
        if (l != null) {
            l.setCallback(seekBar);
            a.j90.b(l, a.sp1.d(seekBar));
            if (l.isStateful()) {
                l.setState(seekBar.getDrawableState());
            }
            c();
        }
        seekBar.invalidate();
        if (G.C(3)) {
            this.g = a.m90.b(G.o(3, -1), this.g);
            this.i = true;
        }
        if (G.C(2)) {
            this.f = G.i(2);
            this.h = true;
        }
        G.K();
        c();
    }

    public final void c() {
        android.graphics.drawable.Drawable drawable = this.e;
        if (drawable != null) {
            if (this.h || this.i) {
                android.graphics.drawable.Drawable mutate = drawable.mutate();
                this.e = mutate;
                if (this.h) {
                    a.i90.h(mutate, this.f);
                }
                if (this.i) {
                    a.i90.i(this.e, this.g);
                }
                if (this.e.isStateful()) {
                    this.e.setState(this.d.getDrawableState());
                }
            }
        }
    }

    public final void d(android.graphics.Canvas canvas) {
        if (this.e != null) {
            int max = this.d.getMax();
            if (max > 1) {
                int intrinsicWidth = this.e.getIntrinsicWidth();
                int intrinsicHeight = this.e.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i2 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.e.setBounds(-i, -i2, i, i2);
                float width = ((this.e.getWidth() - this.e.getPaddingLeft()) - this.e.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(this.e.getPaddingLeft(), this.e.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    this.e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
