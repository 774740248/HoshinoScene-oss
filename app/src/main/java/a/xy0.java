package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class xy0 extends a.u {
    public final /* synthetic */ java.lang.Object d;

    @Override // a.u
    public final void d(android.view.View view, a.g0 g0Var) {
        android.view.View.AccessibilityDelegate accessibilityDelegate = this.f573a;
        android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo = g0Var.f165a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(null);
    }
}
