package com.google.android.material.timepicker;
import a.e0;
import a.g0;
import a.u;


/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class c extends u {
    public final /* synthetic */ com.google.android.material.timepicker.ClockFaceView d;

    public c(com.google.android.material.timepicker.ClockFaceView clockFaceView) {
        this.d = clockFaceView;
    }

    @Override // u
    public final void d(android.view.View view, g0 g0Var) {
        android.view.View.AccessibilityDelegate accessibilityDelegate = this.f573a;
        android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo = g0Var.f165a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        int intValue = ((java.lang.Integer) view.getTag(2131362777)).intValue();
        if (intValue > 0) {
            accessibilityNodeInfo.setTraversalAfter((android.view.View) this.d.y.get(intValue - 1));
        }
        accessibilityNodeInfo.setCollectionItemInfo(android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.obtain(0, 1, intValue, 1, false, view.isSelected()));
        accessibilityNodeInfo.setClickable(true);
        g0Var.b(e0.g);
    }

    @Override // u
    public final boolean g(android.view.View view, int i, android.os.Bundle bundle) {
        if (i != 16) {
            return super.g(view, i, bundle);
        }
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        com.google.android.material.timepicker.ClockFaceView clockFaceView = this.d;
        view.getHitRect(clockFaceView.textViewRect);
        float centerX = clockFaceView.textViewRect.centerX();
        float centerY = clockFaceView.textViewRect.centerY();
        clockFaceView.clockHandView.onTouchEvent(android.view.MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, centerX, centerY, 0));
        clockFaceView.clockHandView.onTouchEvent(android.view.MotionEvent.obtain(uptimeMillis, uptimeMillis, 1, centerX, centerY, 0));
        return true;
    }
}
