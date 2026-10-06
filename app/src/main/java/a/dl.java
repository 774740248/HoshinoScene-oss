package a;

import android.content.Context;
/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class dl extends a.to1 implements android.graphics.drawable.Animatable {
    public final android.content.Context e;
    public a.h1 f = null;
    public java.util.ArrayList g = null;
    public final a.k90 h = new a.k90(this);
    public final a.bl d = new android.graphics.drawable.Drawable.ConstantState();

    /* JADX WARN: Type inference failed for: r2v1, types: [android.graphics.drawable.Drawable.ConstantState, a.bl] */
    public dl(android.content.Context context) {
        this.e = context;
    }

    @Override // a.to1, android.graphics.drawable.Drawable
    public final void applyTheme(android.content.res.Resources.Theme theme) {
        android.graphics.drawable.Drawable drawable = this.c;
        if (drawable != null) {
            a.i90.a(drawable, theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        android.graphics.drawable.Drawable drawable = this.c;
        if (drawable != null) {
            return a.i90.b(drawable);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(android.graphics.Canvas canvas) {
        android.graphics.drawable.Drawable drawable = this.c;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        a.bl blVar = this.d;
        blVar.f45a.draw(canvas);
        if (blVar.b.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        android.graphics.drawable.Drawable drawable = this.c;
        return drawable != null ? a.h90.a(drawable) : this.d.f45a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        android.graphics.drawable.Drawable drawable = this.c;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.d.getClass();
        return changingConfigurations | 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final android.graphics.ColorFilter getColorFilter() {
        android.graphics.drawable.Drawable drawable = this.c;
        return drawable != null ? a.i90.c(drawable) : this.d.f45a.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final android.graphics.drawable.Drawable.ConstantState getConstantState() {
        if (this.c != null) {
            return new a.cl(this.c.getConstantState());
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        android.graphics.drawable.Drawable drawable = this.c;
        return drawable != null ? drawable.getIntrinsicHeight() : this.d.f45a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        android.graphics.drawable.Drawable drawable = this.c;
        return drawable != null ? drawable.getIntrinsicWidth() : this.d.f45a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        android.graphics.drawable.Drawable drawable = this.c;
        return drawable != null ? drawable.getOpacity() : this.d.f45a.getOpacity();
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [a.rh1, a.kp] */
    @Override // android.graphics.drawable.Drawable
    public final void inflate(android.content.res.Resources resources, org.xmlpull.v1.XmlPullParser xmlPullParser, android.util.AttributeSet attributeSet, android.content.res.Resources.Theme theme) {
        a.bl blVar;
        android.graphics.drawable.Drawable drawable = this.c;
        if (drawable != null) {
            a.i90.d(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            blVar = this.d;
            if (eventType == 1 || (xmlPullParser.getDepth() < depth && eventType == 3)) {
                break;
            }
            if (eventType == 2) {
                java.lang.String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    android.content.res.TypedArray U0 = a.wv.U0(resources, theme, attributeSet, a.wv.g);
                    int resourceId = U0.getResourceId(0, 0);
                    if (resourceId != 0) {
                        a.cp1 cp1Var = new a.cp1();
                        java.lang.ThreadLocal threadLocal = a.wb1.f656a;
                        cp1Var.c = a.pb1.a(resources, resourceId, theme);
                        new a.bp1(cp1Var.c.getConstantState());
                        cp1Var.h = false;
                        cp1Var.setCallback(this.h);
                        a.cp1 cp1Var2 = blVar.f45a;
                        if (cp1Var2 != null) {
                            cp1Var2.setCallback(null);
                        }
                        blVar.f45a = cp1Var;
                    }
                    U0.recycle();
                } else if ("target".equals(name)) {
                    android.content.res.TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, a.wv.h);
                    java.lang.String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        android.content.Context context = this.e;
                        if (context != null) {
                            android.animation.Animator loadAnimator = android.animation.AnimatorInflater.loadAnimator(context, resourceId2);
                            loadAnimator.setTarget(blVar.f45a.d.b.o.getOrDefault(string, null));
                            if (blVar.c == null) {
                                blVar.c = new java.util.ArrayList();
                                blVar.d = (kp) new a.rh1();
                            }
                            blVar.c.add(loadAnimator);
                            blVar.d.put(loadAnimator, string);
                        } else {
                            obtainAttributes.recycle();
                            throw new java.lang.IllegalStateException("Context can't be null when inflating animators");
                        }
                    }
                    obtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        if (blVar.b == null) {
            blVar.b = new android.animation.AnimatorSet();
        }
        blVar.b.playTogether(blVar.c);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        android.graphics.drawable.Drawable drawable = this.c;
        return drawable != null ? a.h90.d(drawable) : this.d.f45a.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        android.graphics.drawable.Drawable drawable = this.c;
        return drawable != null ? ((android.graphics.drawable.AnimatedVectorDrawable) drawable).isRunning() : this.d.b.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        android.graphics.drawable.Drawable drawable = this.c;
        return drawable != null ? drawable.isStateful() : this.d.f45a.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final android.graphics.drawable.Drawable mutate() {
        android.graphics.drawable.Drawable drawable = this.c;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(android.graphics.Rect rect) {
        android.graphics.drawable.Drawable drawable = this.c;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.d.f45a.setBounds(rect);
        }
    }

    @Override // a.to1, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        android.graphics.drawable.Drawable drawable = this.c;
        return drawable != null ? drawable.setLevel(i) : this.d.f45a.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        android.graphics.drawable.Drawable drawable = this.c;
        return drawable != null ? drawable.setState(iArr) : this.d.f45a.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        android.graphics.drawable.Drawable drawable = this.c;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.d.f45a.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        android.graphics.drawable.Drawable drawable = this.c;
        if (drawable != null) {
            a.h90.e(drawable, z);
        } else {
            this.d.f45a.setAutoMirrored(z);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(android.graphics.ColorFilter colorFilter) {
        android.graphics.drawable.Drawable drawable = this.c;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.d.f45a.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        android.graphics.drawable.Drawable drawable = this.c;
        if (drawable != null) {
            a.wv.C1(drawable, i);
        } else {
            this.d.f45a.setTint(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(android.content.res.ColorStateList colorStateList) {
        android.graphics.drawable.Drawable drawable = this.c;
        if (drawable != null) {
            a.wv.D1(drawable, colorStateList);
        } else {
            this.d.f45a.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(android.graphics.PorterDuff.Mode mode) {
        android.graphics.drawable.Drawable drawable = this.c;
        if (drawable != null) {
            a.wv.E1(drawable, mode);
        } else {
            this.d.f45a.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        android.graphics.drawable.Drawable drawable = this.c;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        this.d.f45a.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        android.graphics.drawable.Drawable drawable = this.c;
        if (drawable != null) {
            ((android.graphics.drawable.AnimatedVectorDrawable) drawable).start();
            return;
        }
        a.bl blVar = this.d;
        if (blVar.b.isStarted()) {
            return;
        }
        blVar.b.start();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        android.graphics.drawable.Drawable drawable = this.c;
        if (drawable != null) {
            ((android.graphics.drawable.AnimatedVectorDrawable) drawable).stop();
        } else {
            this.d.b.end();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(android.content.res.Resources resources, org.xmlpull.v1.XmlPullParser xmlPullParser, android.util.AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
