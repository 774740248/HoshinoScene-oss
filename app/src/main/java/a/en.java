package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class en implements a.jn, android.content.DialogInterface.OnClickListener {
    public final /* synthetic */ int c = 0;
    public java.lang.Object d;
    public java.lang.Object e;
    public java.lang.CharSequence f;
    public final /* synthetic */ java.lang.Object g;

    public en(a.qs1 qs1Var, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.g = qs1Var;
        this.d = str;
        this.e = str2;
        this.f = str3;
    }

    @Override // a.jn
    public final boolean b() {
        java.lang.Object obj = this.d;
        if (((a.uk) obj) != null) {
            return ((a.uk) obj).isShowing();
        }
        return false;
    }

    @Override // a.jn
    public final void c(int i) {
        android.util.Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // a.jn
    public final int d() {
        return 0;
    }

    @Override // a.jn
    public final void dismiss() {
        java.lang.Object obj = this.d;
        if (((a.uk) obj) != null) {
            ((a.uk) obj).dismiss();
            this.d = null;
        }
    }

    @Override // a.jn
    public final void e(int i, int i2) {
        if (((android.widget.ListAdapter) this.e) == null) {
            return;
        }
        a.kn knVar = (a.kn) this.g;
        a.tk tkVar = new a.tk(knVar.getPopupContext());
        java.lang.CharSequence charSequence = this.f;
        if (charSequence != null) {
            ((a.pk) tkVar.e).d = charSequence;
        }
        android.widget.ListAdapter listAdapter = (android.widget.ListAdapter) this.e;
        int selectedItemPosition = knVar.getSelectedItemPosition();
        a.pk pkVar = (a.pk) tkVar.e;
        pkVar.g = listAdapter;
        pkVar.h = this;
        pkVar.j = selectedItemPosition;
        pkVar.i = true;
        a.uk a2 = tkVar.a();
        this.d = a2;
        androidx.appcompat.app.AlertController.RecycleListView alertController$RecycleListView = a2.g.e;
        a.cn.d(alertController$RecycleListView, i);
        a.cn.c(alertController$RecycleListView, i2);
        ((a.uk) this.d).show();
    }

    @Override // a.jn
    public final int g() {
        return 0;
    }

    @Override // a.jn
    public final android.graphics.drawable.Drawable i() {
        return null;
    }

    @Override // a.jn
    public final java.lang.CharSequence j() {
        return this.f;
    }

    @Override // a.jn
    public final void l(java.lang.CharSequence charSequence) {
        this.f = charSequence;
    }

    @Override // a.jn
    public final void m(android.graphics.drawable.Drawable drawable) {
        android.util.Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // a.jn
    public final void n(int i) {
        android.util.Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // a.jn
    public final void o(android.widget.ListAdapter listAdapter) {
        this.e = listAdapter;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i) {
        int i2 = this.c;
        java.lang.Object obj = this.g;
        switch (i2) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.kn knVar = (a.kn) obj;
                knVar.setSelection(i);
                if (knVar.getOnItemClickListener() != null) {
                    knVar.performItemClick(null, i, ((android.widget.ListAdapter) this.e).getItemId(i));
                }
                dismiss();
                return;
            default:
                new a.f90((android.content.Context) ((a.qs1) obj).b.e).a((java.lang.String) this.d, (java.lang.String) this.e, (java.lang.String) this.f, java.util.UUID.randomUUID().toString(), null);
                return;
        }
    }

    @Override // a.jn
    public final void p(int i) {
        android.util.Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    public en(a.kn knVar) {
        this.g = knVar;
    }
}
