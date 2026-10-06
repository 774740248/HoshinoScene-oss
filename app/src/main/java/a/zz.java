package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class zz extends a.wb0 {
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zz(a.vb0 vb0Var, int i) {
        super(vb0Var);
        this.e = i;
    }

    @Override // a.wb0
    public final void r() {
        switch (this.e) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.vb0 vb0Var = this.b;
                vb0Var.q = null;
                com.google.android.material.internal.CheckableImageButton checkableImageButton = vb0Var.i;
                checkableImageButton.setOnLongClickListener(null);
                a.b20.i1(checkableImageButton, null);
                return;
            default:
                return;
        }
    }
}
