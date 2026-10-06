package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class sy0 extends a.u {
    public final /* synthetic */ int d;
    public final /* synthetic */ a.wy0 e;

    public /* synthetic */ sy0(a.wy0 wy0Var, int i) {
        this.d = i;
        this.e = wy0Var;
    }

    @Override // a.u
    public final void d(android.view.View view, a.g0 g0Var) {
        android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo = g0Var.f165a;
        int i = this.d;
        android.view.View.AccessibilityDelegate accessibilityDelegate = this.f573a;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                accessibilityNodeInfo.setCollectionInfo(null);
                return;
            case 1:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                g0Var.h(false);
                return;
            default:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                a.wy0 wy0Var = this.e;
                accessibilityNodeInfo.setHintText(wy0Var.h0.getVisibility() == 0 ? wy0Var.m(2131953060) : wy0Var.m(2131953058));
                return;
        }
    }
}
