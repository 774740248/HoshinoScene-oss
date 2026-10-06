package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class qq implements java.lang.Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ a.vq d;

    public /* synthetic */ qq(a.vq vqVar, int i) {
        this.c = i;
        this.d = vqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.content.Context context;
        android.graphics.Rect rect;
        android.view.WindowMetrics currentWindowMetrics;
        int i = this.c;
        a.vq vqVar = this.d;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                if (vqVar.i == null || (context = vqVar.h) == null) {
                    return;
                }
                android.view.WindowManager windowManager = (android.view.WindowManager) context.getSystemService("window");
                if (android.os.Build.VERSION.SDK_INT >= 30) {
                    currentWindowMetrics = windowManager.getCurrentWindowMetrics();
                    rect = currentWindowMetrics.getBounds();
                } else {
                    android.view.Display defaultDisplay = windowManager.getDefaultDisplay();
                    android.graphics.Point point = new android.graphics.Point();
                    defaultDisplay.getRealSize(point);
                    rect = new android.graphics.Rect();
                    rect.right = point.x;
                    rect.bottom = point.y;
                }
                int height = rect.height();
                int[] iArr = new int[2];
                a.uq uqVar = vqVar.i;
                uqVar.getLocationOnScreen(iArr);
                int height2 = (height - (uqVar.getHeight() + iArr[1])) + ((int) uqVar.getTranslationY());
                int i2 = vqVar.p;
                if (height2 >= i2) {
                    vqVar.q = i2;
                    return;
                }
                android.view.ViewGroup.LayoutParams layoutParams = uqVar.getLayoutParams();
                if (!(layoutParams instanceof android.view.ViewGroup.MarginLayoutParams)) {
                    android.util.Log.w(a.vq.z, "Unable to apply gesture inset because layout params are not MarginLayoutParams");
                    return;
                }
                int i3 = vqVar.p;
                vqVar.q = i3;
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.bottomMargin = (i3 - height2) + marginLayoutParams.bottomMargin;
                uqVar.requestLayout();
                return;
            case 1:
                vqVar.b();
                return;
            default:
                a.uq uqVar2 = vqVar.i;
                if (uqVar2 == null) {
                    return;
                }
                android.view.ViewParent parent = uqVar2.getParent();
                a.uq uqVar3 = vqVar.i;
                if (parent != null) {
                    uqVar3.setVisibility(0);
                }
                if (uqVar3.getAnimationMode() == 1) {
                    android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat.setInterpolator(vqVar.d);
                    ofFloat.addUpdateListener(new a.lq(vqVar, 0));
                    android.animation.ValueAnimator ofFloat2 = android.animation.ValueAnimator.ofFloat(0.8f, 1.0f);
                    ofFloat2.setInterpolator(vqVar.f);
                    ofFloat2.addUpdateListener(new a.lq(vqVar, 1));
                    android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
                    animatorSet.playTogether(ofFloat, ofFloat2);
                    animatorSet.setDuration(vqVar.f639a);
                    animatorSet.addListener(new a.mq(vqVar, 1));
                    animatorSet.start();
                    return;
                }
                int height3 = uqVar3.getHeight();
                android.view.ViewGroup.LayoutParams layoutParams2 = uqVar3.getLayoutParams();
                if (layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams) {
                    height3 += ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
                }
                uqVar3.setTranslationY(height3);
                android.animation.ValueAnimator valueAnimator = new android.animation.ValueAnimator();
                valueAnimator.setIntValues(height3, 0);
                valueAnimator.setInterpolator(vqVar.e);
                valueAnimator.setDuration(vqVar.c);
                valueAnimator.addListener(new a.mq(vqVar, 0));
                valueAnimator.addUpdateListener(new a.nq(vqVar, height3));
                valueAnimator.start();
                return;
        }
    }
}
