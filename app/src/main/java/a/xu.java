package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class xu extends a.pc0 {
    public final /* synthetic */ com.google.android.material.chip.Chip q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xu(com.google.android.material.chip.Chip chip, com.google.android.material.chip.Chip chip2) {
        super(chip2);
        this.q = chip;
    }

    @Override // a.pc0
    public final void l(java.util.ArrayList arrayList) {
        boolean z = false;
        arrayList.add(0);
        android.graphics.Rect rect = com.google.android.material.chip.Chip.y;
        com.google.android.material.chip.Chip chip = this.q;
        if (chip.hasCloseIcon()) {
            a.zu zuVar = chip.insetBackgroundDrawable;
            if (zuVar != null && zuVar.M) {
                z = true;
            }
            if (!z || chip.onCloseIconClickListener == null) {
                return;
            }
            arrayList.add(1);
        }
    }

    @Override // a.pc0
    public final void o(int i, a.g0 g0Var) {
        android.graphics.Rect closeIconTouchBoundsInt;
        android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo = g0Var.f165a;
        if (i != 1) {
            accessibilityNodeInfo.setContentDescription("");
            accessibilityNodeInfo.setBoundsInParent(com.google.android.material.chip.Chip.y);
            return;
        }
        com.google.android.material.chip.Chip chip = this.q;
        java.lang.CharSequence closeIconContentDescription = chip.getCloseIconContentDescription();
        if (closeIconContentDescription != null) {
            accessibilityNodeInfo.setContentDescription(closeIconContentDescription);
        } else {
            java.lang.CharSequence text = chip.getText();
            android.content.Context context = chip.getContext();
            java.lang.Object[] objArr = new java.lang.Object[1];
            objArr[0] = android.text.TextUtils.isEmpty(text) ? "" : text;
            accessibilityNodeInfo.setContentDescription(context.getString(2131953021, objArr).trim());
        }
        closeIconTouchBoundsInt = chip.getCloseIconTouchBoundsInt();
        accessibilityNodeInfo.setBoundsInParent(closeIconTouchBoundsInt);
        g0Var.b(a.e0.g);
        accessibilityNodeInfo.setEnabled(chip.isEnabled());
    }
}
