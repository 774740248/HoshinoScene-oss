package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class i0 extends a.h0 {
    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final android.view.accessibility.AccessibilityNodeInfo findFocus(int i) {
        a.g0 g = this.f196a.g(i);
        if (g == null) {
            return null;
        }
        return g.f165a;
    }
}
