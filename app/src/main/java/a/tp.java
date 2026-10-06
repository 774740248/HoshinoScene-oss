package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class tp extends android.accessibilityservice.AccessibilityService.GestureResultCallback {
    @Override // android.accessibilityservice.AccessibilityService.GestureResultCallback
    public final void onCancelled(android.accessibilityservice.GestureDescription gestureDescription) {
        a.wv.w(gestureDescription, "gestureDescription");
        super.onCancelled(gestureDescription);
    }

    @Override // android.accessibilityservice.AccessibilityService.GestureResultCallback
    public final void onCompleted(android.accessibilityservice.GestureDescription gestureDescription) {
        a.wv.w(gestureDescription, "gestureDescription");
        super.onCompleted(gestureDescription);
    }
}
