package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class bl1 extends a.u {
    public final com.google.android.material.textfield.TextInputLayout d;

    public bl1(com.google.android.material.textfield.TextInputLayout textInputLayout) {
        this.d = textInputLayout;
    }

    @Override // a.u
    public final void d(android.view.View view, a.g0 g0Var) {
        android.view.View.AccessibilityDelegate accessibilityDelegate = this.f573a;
        android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo = g0Var.f165a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        com.google.android.material.textfield.TextInputLayout textInputLayout = this.d;
        android.widget.EditText editText = textInputLayout.getEditText();
        android.text.Editable text = editText != null ? editText.getText() : null;
        java.lang.CharSequence hint = textInputLayout.getHint();
        java.lang.CharSequence error = textInputLayout.getError();
        java.lang.CharSequence placeholderText = textInputLayout.getPlaceholderText();
        int counterMaxLength = textInputLayout.getCounterMaxLength();
        java.lang.CharSequence counterOverflowDescription = textInputLayout.getCounterOverflowDescription();
        boolean isEmpty = android.text.TextUtils.isEmpty(text);
        boolean z = !isEmpty;
        boolean z2 = true;
        boolean z3 = !android.text.TextUtils.isEmpty(hint);
        boolean z4 = !textInputLayout.expandedHintEnabled;
        boolean z5 = !android.text.TextUtils.isEmpty(error);
        if (!z5 && android.text.TextUtils.isEmpty(counterOverflowDescription)) {
            z2 = false;
        }
        java.lang.String charSequence = z3 ? hint.toString() : "";
        a.si1 si1Var = textInputLayout.boxLabelCutoutPaddingPx;
        a.vn vnVar = si1Var.d;
        if (vnVar.getVisibility() == 0) {
            accessibilityNodeInfo.setLabelFor(vnVar);
            accessibilityNodeInfo.setTraversalAfter(vnVar);
        } else {
            accessibilityNodeInfo.setTraversalAfter(si1Var.f);
        }
        if (z) {
            accessibilityNodeInfo.setText(text);
        } else if (!android.text.TextUtils.isEmpty(charSequence)) {
            accessibilityNodeInfo.setText(charSequence);
            if (z4 && placeholderText != null) {
                accessibilityNodeInfo.setText(charSequence + ", " + ((java.lang.Object) placeholderText));
            }
        } else if (placeholderText != null) {
            accessibilityNodeInfo.setText(placeholderText);
        }
        if (!android.text.TextUtils.isEmpty(charSequence)) {
            accessibilityNodeInfo.setHintText(charSequence);
            accessibilityNodeInfo.setShowingHintText(isEmpty);
        }
        if (text == null || text.length() != counterMaxLength) {
            counterMaxLength = -1;
        }
        accessibilityNodeInfo.setMaxTextLength(counterMaxLength);
        if (z2) {
            if (!z5) {
                error = counterOverflowDescription;
            }
            accessibilityNodeInfo.setError(error);
        }
        a.vn vnVar2 = textInputLayout.tmpBoundsRect.y;
        if (vnVar2 != null) {
            accessibilityNodeInfo.setLabelFor(vnVar2);
        }
        textInputLayout.tmpRect.b().n(g0Var);
    }

    @Override // a.u
    public final void e(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        super.e(view, accessibilityEvent);
        this.d.originalEditTextEndDrawable.b().o(accessibilityEvent);
    }
}
