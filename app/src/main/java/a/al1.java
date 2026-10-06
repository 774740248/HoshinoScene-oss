package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class al1 implements java.lang.Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ com.google.android.material.textfield.TextInputLayout d;

    public /* synthetic */ al1(com.google.android.material.textfield.TextInputLayout textInputLayout, int i) {
        this.c = i;
        this.d = textInputLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        com.google.android.material.textfield.TextInputLayout textInputLayout = this.d;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                com.google.android.material.internal.CheckableImageButton checkableImageButton = textInputLayout.tmpRect.i;
                checkableImageButton.performClick();
                checkableImageButton.jumpDrawablesToCurrentState();
                return;
            default:
                textInputLayout.editText.requestLayout();
                return;
        }
    }
}
