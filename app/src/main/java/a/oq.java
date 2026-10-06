package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class oq implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a.vq f416a;

    public oq(a.vq vqVar) {
        this.f416a = vqVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        int intValue = ((java.lang.Integer) valueAnimator.getAnimatedValue()).intValue();
        a.hd0 hd0Var = a.vq.u;
        this.f416a.i.setTranslationY(intValue);
    }
}
