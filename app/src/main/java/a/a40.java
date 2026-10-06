package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class a40 extends a.n60 {
    public static final /* synthetic */ int t0 = 0;
    public final java.util.ArrayList o0;
    public final boolean p0;
    public final a.x30 q0;
    public boolean r0;
    public java.lang.String[] s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a40(boolean z, java.util.ArrayList arrayList, boolean z2, a.x30 x30Var) {
        super(2131558501, z);
        a.wv.w(arrayList, "packages");
        this.o0 = arrayList;
        this.p0 = z2;
        this.q0 = x30Var;
        this.r0 = true;
        this.s0 = new java.lang.String[0];
    }

    @Override // a.n60, a.gk0
    public final void C(android.view.View view, android.os.Bundle bundle) {
        char c;
        a.wv.w(view, "view");
        super.C(view, bundle);
        android.widget.AbsListView absListView = (android.widget.AbsListView) view.findViewById(2131361998);
        a.wv.v(absListView, "absListView");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = this.o0;
        java.util.Iterator it = arrayList2.iterator();
        while (true) {
            c = 1;
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (true ^ a.op.K1(this.s0, ((a.tg) next).getPackageName())) {
                arrayList.add(next);
            }
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList(arrayList);
        android.content.Context context = absListView.getContext();
        a.wv.v(context, "listVIew.context");
        boolean z = this.p0;
        absListView.setAdapter((android.widget.ListAdapter) new a.xg(context, arrayList3, z));
        view.findViewById(2131362097).setOnClickListener(new a.gv(3, this));
        view.findViewById(2131362098).setOnClickListener(new a.wi(this, (c != 0) ? 1 : 0, absListView));
        android.widget.CompoundButton compoundButton = (android.widget.CompoundButton) view.findViewById(2131363073);
        int i = 8;
        int i2 = 0;
        if (compoundButton != null) {
            if (z) {
                a.xg xgVar = (a.xg) absListView.getAdapter();
                compoundButton.setVisibility(0);
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                for (java.lang.Object obj : arrayList2) {
                    if (((a.tg) obj).getSelected()) {
                        arrayList4.add(obj);
                    }
                }
                compoundButton.setChecked(arrayList4.size() == arrayList2.size());
                compoundButton.setOnClickListener(new a.gv(4, xgVar));
                if (xgVar != null) {
                    xgVar.f = new a.y30(compoundButton, this);
                }
                if (!this.r0) {
                    compoundButton.setVisibility(8);
                }
            } else {
                compoundButton.setVisibility(8);
            }
        }
        android.view.View findViewById = view.findViewById(2131363045);
        android.widget.EditText editText = (android.widget.EditText) view.findViewById(2131363044);
        editText.addTextChangedListener(new a.z30(findViewById, i2, absListView));
        android.text.Editable text = editText.getText();
        if (text != null && text.length() != 0) {
            i = 0;
        }
        findViewById.setVisibility(i);
        findViewById.setOnClickListener(new a.w30(editText, 0));
    }
}
