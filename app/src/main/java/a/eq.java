package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class eq extends android.graphics.drawable.Drawable implements a.xk1 {
    public final java.lang.ref.WeakReference c;
    public final a.gz0 d;
    public final a.yk1 e;
    public final android.graphics.Rect f;
    public final a.gq g;
    public float h;
    public float i;
    public final int j;
    public float k;
    public float l;
    public float m;
    public java.lang.ref.WeakReference n;
    public java.lang.ref.WeakReference o;

    public eq(android.content.Context context) {
        a.sk1 sk1Var;
        java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(context);
        this.c = weakReference;
        a.b20.v(context, a.b20.v, "Theme.MaterialComponents");
        this.f = new android.graphics.Rect();
        a.yk1 yk1Var = new a.yk1(this);
        this.e = yk1Var;
        android.text.TextPaint textPaint = yk1Var.f712a;
        textPaint.setTextAlign(android.graphics.Paint.Align.CENTER);
        a.gq gqVar = new a.gq(context);
        this.g = gqVar;
        boolean a2 = gqVar.a();
        a.fq fqVar = gqVar.b;
        a.gz0 gz0Var = new a.gz0(a.wg1.a(context, a2 ? fqVar.i.intValue() : fqVar.g.intValue(), gqVar.a() ? fqVar.j.intValue() : fqVar.h.intValue(), new a.d(0)).a());
        this.d = gz0Var;
        d();
        android.content.Context context2 = (android.content.Context) weakReference.get();
        if (context2 != null && yk1Var.f != (sk1Var = new a.sk1(context2, fqVar.f.intValue()))) {
            yk1Var.b(sk1Var, context2);
            textPaint.setColor(fqVar.e.intValue());
            invalidateSelf();
            f();
            invalidateSelf();
        }
        this.j = ((int) java.lang.Math.pow(10.0d, fqVar.m - 1.0d)) - 1;
        yk1Var.d = true;
        f();
        invalidateSelf();
        yk1Var.d = true;
        d();
        f();
        invalidateSelf();
        textPaint.setAlpha(getAlpha());
        invalidateSelf();
        android.content.res.ColorStateList valueOf = android.content.res.ColorStateList.valueOf(fqVar.d.intValue());
        if (gz0Var.c.c != valueOf) {
            gz0Var.l(valueOf);
            invalidateSelf();
        }
        textPaint.setColor(fqVar.e.intValue());
        invalidateSelf();
        java.lang.ref.WeakReference weakReference2 = this.n;
        if (weakReference2 != null && weakReference2.get() != null) {
            android.view.View view = (android.view.View) this.n.get();
            java.lang.ref.WeakReference weakReference3 = this.o;
            e(view, weakReference3 != null ? (android.widget.FrameLayout) weakReference3.get() : null);
        }
        f();
        setVisible(fqVar.s.booleanValue(), false);
    }

    @Override // a.xk1
    public final void a() {
        invalidateSelf();
    }

    public final java.lang.String b() {
        int c = c();
        int i = this.j;
        a.gq gqVar = this.g;
        if (c <= i) {
            return java.text.NumberFormat.getInstance(gqVar.b.n).format(c());
        }
        android.content.Context context = (android.content.Context) this.c.get();
        return context == null ? "" : java.lang.String.format(gqVar.b.n, context.getString(2131953023), java.lang.Integer.valueOf(this.j), "+");
    }

    public final int c() {
        a.gq gqVar = this.g;
        if (gqVar.a()) {
            return gqVar.b.l;
        }
        return 0;
    }

    public final void d() {
        android.content.Context context = (android.content.Context) this.c.get();
        if (context == null) {
            return;
        }
        a.gq gqVar = this.g;
        boolean a2 = gqVar.a();
        a.fq fqVar = gqVar.b;
        this.d.setShapeAppearanceModel(a.wg1.a(context, a2 ? fqVar.i.intValue() : fqVar.g.intValue(), gqVar.a() ? fqVar.j.intValue() : fqVar.h.intValue(), new a.d(0)).a());
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(android.graphics.Canvas canvas) {
        if (getBounds().isEmpty() || getAlpha() == 0 || !isVisible()) {
            return;
        }
        this.d.draw(canvas);
        if (this.g.a()) {
            android.graphics.Rect rect = new android.graphics.Rect();
            java.lang.String b = b();
            a.yk1 yk1Var = this.e;
            yk1Var.f712a.getTextBounds(b, 0, b.length(), rect);
            canvas.drawText(b, this.h, this.i + (rect.height() / 2), yk1Var.f712a);
        }
    }

    public final void e(android.view.View view, android.widget.FrameLayout frameLayout) {
        this.n = new java.lang.ref.WeakReference(view);
        this.o = new java.lang.ref.WeakReference(frameLayout);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
        f();
        invalidateSelf();
    }

    public final void f() {
        android.content.Context context = (android.content.Context) this.c.get();
        java.lang.ref.WeakReference weakReference = this.n;
        android.view.View view = weakReference != null ? (android.view.View) weakReference.get() : null;
        if (context == null || view == null) {
            return;
        }
        android.graphics.Rect rect = new android.graphics.Rect();
        android.graphics.Rect rect2 = this.f;
        rect.set(rect2);
        android.graphics.Rect rect3 = new android.graphics.Rect();
        view.getDrawingRect(rect3);
        java.lang.ref.WeakReference weakReference2 = this.o;
        android.view.ViewGroup viewGroup = weakReference2 != null ? (android.view.ViewGroup) weakReference2.get() : null;
        if (viewGroup != null) {
            viewGroup.offsetDescendantRectToMyCoords(view, rect3);
        }
        a.gq gqVar = this.g;
        float f = !gqVar.a() ? gqVar.c : gqVar.d;
        this.k = f;
        if (f != -1.0f) {
            this.m = f;
            this.l = f;
        } else {
            this.m = java.lang.Math.round((!gqVar.a() ? gqVar.f : gqVar.h) / 2.0f);
            this.l = java.lang.Math.round((!gqVar.a() ? gqVar.e : gqVar.g) / 2.0f);
        }
        if (c() > 9) {
            this.l = java.lang.Math.max(this.l, (this.e.a(b()) / 2.0f) + gqVar.i);
        }
        boolean a2 = gqVar.a();
        a.fq fqVar = gqVar.b;
        int intValue = a2 ? fqVar.w.intValue() : fqVar.u.intValue();
        int i = gqVar.l;
        if (i == 0) {
            intValue -= java.lang.Math.round(this.m);
        }
        int intValue2 = fqVar.y.intValue() + intValue;
        int intValue3 = fqVar.r.intValue();
        if (intValue3 == 8388691 || intValue3 == 8388693) {
            this.i = rect3.bottom - intValue2;
        } else {
            this.i = rect3.top + intValue2;
        }
        int intValue4 = gqVar.a() ? fqVar.v.intValue() : fqVar.t.intValue();
        if (i == 1) {
            intValue4 += gqVar.a() ? gqVar.k : gqVar.j;
        }
        int intValue5 = fqVar.x.intValue() + intValue4;
        int intValue6 = fqVar.r.intValue();
        if (intValue6 == 8388659 || intValue6 == 8388691) {
            java.util.WeakHashMap weakHashMap = a.jq1.f264a;
            this.h = a.sp1.d(view) == 0 ? (rect3.left - this.l) + intValue5 : (rect3.right + this.l) - intValue5;
        } else {
            java.util.WeakHashMap weakHashMap2 = a.jq1.f264a;
            this.h = a.sp1.d(view) == 0 ? (rect3.right + this.l) - intValue5 : (rect3.left - this.l) + intValue5;
        }
        float f2 = this.h;
        float f3 = this.i;
        float f4 = this.l;
        float f5 = this.m;
        rect2.set((int) (f2 - f4), (int) (f3 - f5), (int) (f2 + f4), (int) (f3 + f5));
        float f6 = this.k;
        a.gz0 gz0Var = this.d;
        if (f6 != -1.0f) {
            a.vg1 e = gz0Var.c.f164a.e();
            e.e = new a.d(f6);
            e.f = new a.d(f6);
            e.g = new a.d(f6);
            e.h = new a.d(f6);
            gz0Var.setShapeAppearanceModel(e.a());
        }
        if (rect.equals(rect2)) {
            return;
        }
        gz0Var.setBounds(rect2);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.g.b.k;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return false;
    }

    @Override // android.graphics.drawable.Drawable, a.xk1
    public final boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        a.gq gqVar = this.g;
        gqVar.f187a.k = i;
        gqVar.b.k = i;
        this.e.f712a.setAlpha(getAlpha());
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(android.graphics.ColorFilter colorFilter) {
    }
}
