package a;

import android.animation.ValueAnimator;
import com.google.android.material.internal.CheckableImageButton;

/* loaded from: /tmp/jadx-9051527860862319108.dex */
public final /* synthetic */ class fv implements ValueAnimator.AnimatorUpdateListener {

    public fv(jv p0) {
        this(p0, 0);
    }

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5a;
    public final /* synthetic */ jv b;

    public /* synthetic */ fv(jv jvVar, int i) {
        this.f5a = i;
        this.b = jvVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.f5a;
        jv jvVar = this.b;
        switch (i) {
            case 0:
                jvVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                CheckableImageButton checkableImageButton = ((wb0) jvVar).d;
                checkableImageButton.setScaleX(floatValue);
                checkableImageButton.setScaleY(floatValue);
                return;
            default:
                jvVar.getClass();
                ((wb0) jvVar).d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
