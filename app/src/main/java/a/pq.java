package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class pq implements android.os.Handler.Callback {

    public pq() {
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message message) {
        java.util.List<android.accessibilityservice.AccessibilityServiceInfo> enabledAccessibilityServiceList;
        int i = message.what;
        int i2 = 1;
        int i3 = 0;
        if (i == 0) {
            a.vq vqVar = (a.vq) message.obj;
            a.uq uqVar = vqVar.i;
            if (uqVar.getParent() == null) {
                android.view.ViewGroup.LayoutParams layoutParams = uqVar.getLayoutParams();
                if (layoutParams instanceof a.my) {
                    a.my myVar = (a.my) layoutParams;
                    com.google.android.material.snackbar.BaseTransientBottomBar.Behavior baseTransientBottomBar$Behavior = new com.google.android.material.snackbar.BaseTransientBottomBar.Behavior();
                    a.pe peVar = baseTransientBottomBar$Behavior.j;
                    peVar.getClass();
                    peVar.c = vqVar.t;
                    baseTransientBottomBar$Behavior.b = new a.rq(vqVar);
                    myVar.b((jy) baseTransientBottomBar$Behavior);
                    myVar.g = 80;
                }
                uqVar.m = true;
                vqVar.g.addView(uqVar);
                uqVar.m = false;
                vqVar.e();
                uqVar.setVisibility(4);
            }
            java.util.WeakHashMap weakHashMap = a.jq1.f264a;
            if (a.up1.c(uqVar)) {
                vqVar.d();
            } else {
                vqVar.r = true;
            }
            return true;
        }
        if (i != 1) {
            return false;
        }
        a.vq vqVar2 = (a.vq) message.obj;
        int i4 = message.arg1;
        android.view.accessibility.AccessibilityManager accessibilityManager = vqVar2.s;
        if (accessibilityManager == null || ((enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1)) != null && enabledAccessibilityServiceList.isEmpty())) {
            a.uq uqVar2 = vqVar2.i;
            if (uqVar2.getVisibility() == 0) {
                if (uqVar2.getAnimationMode() == 1) {
                    android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(1.0f, 0.0f);
                    ofFloat.setInterpolator(vqVar2.d);
                    ofFloat.addUpdateListener(new a.lq(vqVar2, 0));
                    ofFloat.setDuration(vqVar2.b);
                    ofFloat.addListener(new a.kq(vqVar2, i4, i3));
                    ofFloat.start();
                } else {
                    android.animation.ValueAnimator valueAnimator = new android.animation.ValueAnimator();
                    int height = uqVar2.getHeight();
                    android.view.ViewGroup.LayoutParams layoutParams2 = uqVar2.getLayoutParams();
                    if (layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams) {
                        height += ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
                    }
                    valueAnimator.setIntValues(0, height);
                    valueAnimator.setInterpolator(vqVar2.e);
                    valueAnimator.setDuration(vqVar2.c);
                    valueAnimator.addListener(new a.kq(vqVar2, i4, i2));
                    valueAnimator.addUpdateListener(new a.oq(vqVar2));
                    valueAnimator.start();
                }
                return true;
            }
        }
        vqVar2.b();
        return true;
    }
}
