package com.google.android.material.timepicker;
import a.ol1;


/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class a extends ol1 {
    public final /* synthetic */ com.google.android.material.timepicker.ChipTextInputComboView c;

    public a(com.google.android.material.timepicker.ChipTextInputComboView chipTextInputComboView) {
        this.c = chipTextInputComboView;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(android.text.Editable editable) {
        boolean isEmpty = android.text.TextUtils.isEmpty(editable);
        com.google.android.material.timepicker.ChipTextInputComboView chipTextInputComboView = this.c;
        if (isEmpty) {
            chipTextInputComboView.chip.setText(com.google.android.material.timepicker.ChipTextInputComboView.a(chipTextInputComboView, "00"));
            return;
        }
        java.lang.String a2 = com.google.android.material.timepicker.ChipTextInputComboView.a(chipTextInputComboView, editable);
        com.google.android.material.chip.Chip chip = chipTextInputComboView.chip;
        if (android.text.TextUtils.isEmpty(a2)) {
            a2 = com.google.android.material.timepicker.ChipTextInputComboView.a(chipTextInputComboView, "00");
        }
        chip.setText(a2);
    }
}
