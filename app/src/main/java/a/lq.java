package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class lq implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f324a;
    public final /* synthetic */ a.vq b;

    public /* synthetic */ lq(a.vq vqVar, int i) {
        this.f324a = i;
        this.b = vqVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        int i = this.f324a;
        a.vq vqVar = this.b;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                vqVar.i.setAlpha(((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                float floatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
                vqVar.i.setScaleX(floatValue);
                vqVar.i.setScaleY(floatValue);
                return;
        }
    }
}
