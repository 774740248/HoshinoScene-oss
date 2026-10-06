package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class vj0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f635a;
    public boolean b;

    public /* synthetic */ vj0() {
        this("keyboard");
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, a.ma1, java.io.Serializable] */
    public final void a(android.widget.EditText editText, a.ij0 ij0Var) {
        a.wv.w(editText, "editText");
        ma1 obj = new ma1();
        obj.c = "";
        a.wv.M0(a.wv.b(a.z80.b), null, new a.nj0(ij0Var, obj, editText, null), 3);
        editText.setOnEditorActionListener(new a.ej0(obj, ij0Var, this, editText, 1));
        int i = 0;
        editText.setOnFocusChangeListener(new a.gj0(obj, i, ij0Var));
        if (a.wv.e(this.f635a, "change")) {
            editText.addTextChangedListener(new a.z30(obj, 1, ij0Var));
        } else {
            editText.getViewTreeObserver().addOnGlobalLayoutListener(new a.hj0(editText, this, new a.oj0(editText, obj, ij0Var, i)));
        }
    }

    public vj0(java.lang.String str) {
        a.wv.w(str, "editSyncMode");
        this.f635a = str;
    }
}
