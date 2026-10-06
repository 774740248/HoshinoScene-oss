package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ok0 extends android.view.animation.AnimationSet implements java.lang.Runnable {
    public final android.view.ViewGroup c;
    public final android.view.View d;
    public boolean e;
    public boolean f;
    public boolean g;

    public ok0(android.view.animation.Animation animation, android.view.ViewGroup viewGroup, android.view.View view) {
        super(false);
        this.g = true;
        this.c = viewGroup;
        this.d = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public final boolean getTransformation(long j, android.view.animation.Transformation transformation) {
        this.g = true;
        if (this.e) {
            return !this.f;
        }
        if (!super.getTransformation(j, transformation)) {
            this.e = true;
            a.k31.a(this.c, this);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = this.e;
        android.view.ViewGroup viewGroup = this.c;
        if (z || !this.g) {
            viewGroup.endViewTransition(this.d);
            this.f = true;
        } else {
            this.g = false;
            viewGroup.post(this);
        }
    }

    @Override // android.view.animation.Animation
    public final boolean getTransformation(long j, android.view.animation.Transformation transformation, float f) {
        this.g = true;
        if (this.e) {
            return !this.f;
        }
        if (!super.getTransformation(j, transformation, f)) {
            this.e = true;
            a.k31.a(this.c, this);
        }
        return true;
    }
}
