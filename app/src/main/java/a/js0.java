package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class js0 extends android.view.inputmethod.InputConnectionWrapper {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a.m6 f266a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ js0(android.view.inputmethod.InputConnection inputConnection, a.m6 m6Var) {
        super(inputConnection, false);
        this.f266a = m6Var;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(android.view.inputmethod.InputContentInfo inputContentInfo, int i, android.os.Bundle bundle) {
        android.os.Bundle bundle2;
        a.vu0 vu0Var = inputContentInfo == null ? null : new a.vu0(18, new a.vu0(inputContentInfo));
        android.view.View view = (android.view.View) this.f266a.c;
        if ((i & 1) != 0) {
            try {
                vu0Var.b();
                android.view.inputmethod.InputContentInfo inputContentInfo2 = (android.view.inputmethod.InputContentInfo) ((a.ks0) vu0Var.d).s();
                bundle2 = bundle == null ? new android.os.Bundle() : new android.os.Bundle(bundle);
                bundle2.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", inputContentInfo2);
            } catch (java.lang.Exception e) {
                android.util.Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e);
            }
        } else {
            bundle2 = bundle;
        }
        android.content.ClipData clipData = new android.content.ClipData(vu0Var.p(), new android.content.ClipData.Item(vu0Var.t()));
        a.px oxVar = android.os.Build.VERSION.SDK_INT >= 31 ? new a.ox(clipData, 2) : new a.qx(clipData, 2);
        oxVar.d(vu0Var.e());
        oxVar.b(bundle2);
        if (a.jq1.k(view, oxVar.a()) == null) {
            return true;
        }
        return super.commitContent(inputContentInfo, i, bundle);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(java.lang.String str, android.os.Bundle bundle) {
        return super.performPrivateCommand(str, bundle);
    }
}
