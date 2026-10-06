package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class h0 extends android.view.accessibility.AccessibilityNodeProvider {

    public h0() {
        this(null);
    }

    /* renamed from: a, reason: collision with root package name */
    public final a.pe f196a;

    public h0(a.pe peVar) {
        this.f196a = peVar;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final android.view.accessibility.AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        a.g0 f = this.f196a.f(i);
        if (f == null) {
            return null;
        }
        return f.f165a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final java.util.List findAccessibilityNodeInfosByText(java.lang.String str, int i) {
        this.f196a.getClass();
        return null;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i, int i2, android.os.Bundle bundle) {
        return this.f196a.j(i, i2, bundle);
    }
}
