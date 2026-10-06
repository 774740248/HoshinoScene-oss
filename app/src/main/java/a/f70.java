package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class f70 extends a.n60 {
    public static final /* synthetic */ int u0 = 0;
    public final java.util.List o0;
    public final java.util.List p0;
    public final boolean q0;
    public final a.k4 r0;
    public java.lang.String s0;
    public final java.lang.String t0;

    public f70(boolean z, java.util.List list, java.util.List list2, boolean z2, a.k4 k4Var) {
        super(list.size() > 7 ? 2131558532 : 2131558533, z);
        this.o0 = list;
        this.p0 = list2;
        this.q0 = z2;
        this.r0 = k4Var;
        this.s0 = "";
        this.t0 = "";
    }

    @Override // a.n60, a.gk0
    public final void C(android.view.View view, android.os.Bundle bundle) {
        android.widget.TextView textView;
        a.wv.w(view, "view");
        super.C(view, bundle);
        java.util.List list = this.o0;
        if (list.isEmpty()) {
            S(false, false);
            return;
        }
        android.view.View findViewById = view.findViewById(2131362671);
        a.wv.v(findViewById, "absListView");
        android.content.Context context = findViewById.getContext();
        a.wv.v(context, "gridView.context");
        a.b20.g1(findViewById, new a.zi(context, list, this.p0, this.q0));
        view.findViewById(2131362097).setOnClickListener(new a.gv(8, this));
        view.findViewById(2131362098).setOnClickListener(new a.wi(this, 4, findViewById));
        android.widget.CompoundButton compoundButton = (android.widget.CompoundButton) view.findViewById(2131363073);
        if (compoundButton != null) {
            compoundButton.setVisibility(8);
        }
        if (list.size() > 5) {
            android.view.View findViewById2 = view.findViewById(2131363045);
            android.widget.EditText editText = (android.widget.EditText) view.findViewById(2131363044);
            editText.addTextChangedListener(new a.a70(findViewById2, findViewById, 2));
            android.text.Editable text = editText.getText();
            findViewById2.setVisibility((text == null || text.length() == 0) ? 8 : 0);
            findViewById2.setOnClickListener(new a.w30(editText, 3));
        }
        W();
        android.view.View view2 = this.H;
        if (view2 == null || (textView = (android.widget.TextView) view2.findViewById(2131362404)) == null) {
            return;
        }
        java.lang.String str = this.t0;
        textView.setText(str);
        textView.setVisibility(str.length() <= 0 ? 8 : 0);
    }

    public final void W() {
        android.widget.TextView textView;
        android.view.View view = this.H;
        if (view == null || (textView = (android.widget.TextView) view.findViewById(2131362414)) == null) {
            return;
        }
        textView.setText(this.s0);
        textView.setVisibility(this.s0.length() > 0 ? 0 : 8);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public f70() {
        /*
            r6 = this;
            r1 = 0
            a.qb0 r3 = a.qb0.c
            r4 = 0
            r5 = 0
            r0 = r6
            r2 = r3
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a.f70.<init>():void");
    }
}
