package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class k41 implements a.j41 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f282a;
    public final /* synthetic */ a.nk b;
    public final /* synthetic */ android.widget.EditText c;

    public k41(android.widget.TextView textView, a.nk nkVar, android.widget.EditText editText) {
        this.f282a = textView;
        this.b = nkVar;
        this.c = editText;
    }

    @Override // a.j41
    public final void a(java.lang.String str) {
        android.widget.EditText editText = this.c;
        android.widget.TextView textView = this.f282a;
        if (str != null && str.length() != 0) {
            textView.setText(str);
            editText.setText(str);
            return;
        }
        int d = d();
        a.nk nkVar = this.b;
        if (d == 1) {
            textView.setText(((android.content.Context) nkVar.e).getString(2131952718));
        } else {
            textView.setText(((android.content.Context) nkVar.e).getString(2131952717));
        }
        editText.setText("");
    }

    @Override // a.j41
    public final java.lang.String b() {
        a.nk nkVar = this.b;
        if (((com.omarea.krscript.model.ActionParamInfo) nkVar.d).getMime().length() > 0) {
            return ((com.omarea.krscript.model.ActionParamInfo) nkVar.d).getMime();
        }
        return null;
    }

    @Override // a.j41
    public final java.lang.String c() {
        a.nk nkVar = this.b;
        if (((com.omarea.krscript.model.ActionParamInfo) nkVar.d).getSuffix().length() > 0) {
            return ((com.omarea.krscript.model.ActionParamInfo) nkVar.d).getSuffix();
        }
        return null;
    }

    @Override // a.j41
    public final int d() {
        return a.wv.e(((com.omarea.krscript.model.ActionParamInfo) this.b.d).getType(), "folder") ? 1 : 0;
    }
}
