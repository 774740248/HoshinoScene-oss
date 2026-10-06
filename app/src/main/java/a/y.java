package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class y implements android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final a.x f699a;

    public y(a.x xVar) {
        this.f699a = xVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a.y) {
            return this.f699a.equals(((a.y) obj).f699a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f699a.hashCode();
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        a.ca0 ca0Var = (a.ca0) ((a.m6) this.f699a).c;
        android.widget.AutoCompleteTextView autoCompleteTextView = ca0Var.h;
        if (autoCompleteTextView == null || autoCompleteTextView.getInputType() != 0) {
            return;
        }
        int i = z ? 2 : 1;
        java.util.WeakHashMap weakHashMap = a.jq1.f264a;
        a.rp1.s(ca0Var.d, i);
    }
}
