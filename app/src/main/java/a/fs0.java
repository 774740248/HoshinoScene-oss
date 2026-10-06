package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class fs0 extends android.view.View.AccessibilityDelegate {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a.gs0 f156a;

    public fs0(a.gs0 gs0Var) {
        this.f156a = gs0Var;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(android.view.View view, android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        android.widget.EditText editText = this.f156a.h.getEditText();
        if (editText != null) {
            accessibilityNodeInfo.setLabeledBy(editText);
        }
    }
}
