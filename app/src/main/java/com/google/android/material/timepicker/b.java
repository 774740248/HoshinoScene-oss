package com.google.android.material.timepicker;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class b implements android.view.ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ com.google.android.material.timepicker.ClockFaceView c;

    public b(com.google.android.material.timepicker.ClockFaceView clockFaceView) {
        this.c = clockFaceView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        com.google.android.material.timepicker.ClockFaceView clockFaceView = this.c;
        if (!clockFaceView.isShown()) {
            return true;
        }
        clockFaceView.getViewTreeObserver().removeOnPreDrawListener(this);
        int height = ((clockFaceView.getHeight() / 2) - clockFaceView.clockHandView.f) - clockFaceView.INITIAL_CAPACITY;
        if (height != clockFaceView.s) {
            clockFaceView.s = height;
            clockFaceView.updateLayoutParams();
            int i = clockFaceView.s;
            com.google.android.material.timepicker.ClockHandView clockHandView = clockFaceView.clockHandView;
            clockHandView.circleRadius = i;
            clockHandView.invalidate();
        }
        return true;
    }
}
