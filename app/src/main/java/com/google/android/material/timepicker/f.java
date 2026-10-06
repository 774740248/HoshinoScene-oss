package com.google.android.material.timepicker;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class f extends android.view.GestureDetector.SimpleOnGestureListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.google.android.material.timepicker.TimePickerView f763a;

    public f(com.google.android.material.timepicker.TimePickerView timePickerView) {
        this.f763a = timePickerView;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(android.view.MotionEvent motionEvent) {
        int i = com.google.android.material.timepicker.TimePickerView.s;
        this.f763a.getClass();
        return false;
    }
}
