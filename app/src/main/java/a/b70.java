package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class b70 extends a.n60 {
    public static final /* synthetic */ int y0 = 0;
    public final java.util.List o0;
    public final boolean p0;
    public final a.y60 q0;
    public final int r0;
    public android.view.View s0;
    public java.lang.String t0;
    public java.lang.String u0;
    public boolean v0;
    public java.lang.Integer w0;
    public a.bp0 x0;

    public b70() {
        this(false, a.qb0.c, false, null, 7);
    }

    @Override // a.n60, a.gk0
    public final void C(android.view.View view, android.os.Bundle bundle) {
        java.lang.Object r1 = null;
        a.wv.w(view, "view");
        super.C(view, bundle);
        java.util.List list = this.o0;
        if (list.isEmpty()) {
            S(false, false);
            return;
        }
        android.view.View findViewById = view.findViewById(2131362671);
        this.s0 = findViewById;
        a.wv.v(findViewById, "absListView");
        android.content.Context context = findViewById.getContext();
        a.wv.v(context, "gridView.context");
        java.util.ArrayList arrayList = new java.util.ArrayList(list);
        boolean z = this.p0;
        a.aj ajVar = new a.aj(context, arrayList, z);
        ajVar.j = new a.lc1(this, 1, findViewById);
        ajVar.k = this.x0;
        a.b20.g1(findViewById, ajVar);
        view.findViewById(2131362097).setOnClickListener(new a.gv(5, this));
        view.findViewById(2131362098).setOnClickListener(new a.wi(this, 2, findViewById));
        android.widget.CompoundButton compoundButton = (android.widget.CompoundButton) view.findViewById(2131363073);
        int i = 8;
        if (compoundButton != null) {
            if (z) {
                a.aj ajVar2 = (a.aj) a.b20.T(findViewById);
                compoundButton.setVisibility(0);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (java.lang.Object obj : list) {
                    if (((a.ng1) obj).d) {
                        arrayList2.add(obj);
                    }
                }
                compoundButton.setChecked(arrayList2.size() == list.size());
                compoundButton.setOnClickListener(new a.gv(6, ajVar2));
                if (ajVar2 != null) {
                    ajVar2.f = new a.z60(compoundButton, this);
                }
            } else {
                compoundButton.setVisibility(8);
            }
        }
        if (list.size() <= this.r0 || list.size() <= 10) {
            view.findViewById(2131363042).setVisibility(8);
        } else {
            android.view.View findViewById2 = view.findViewById(2131363045);
            android.widget.EditText editText = (android.widget.EditText) view.findViewById(2131363044);
            editText.addTextChangedListener(new a.a70(findViewById2, findViewById, r1));
            android.text.Editable text = editText.getText();
            if (text != null && text.length() != 0) {
                i = 0;
            }
            findViewById2.setVisibility(i);
            findViewById2.setOnClickListener(new a.w30(editText, 1));
            android.view.View findViewById3 = view.findViewById(2131363042);
            java.lang.Integer num = this.w0;
            findViewById3.setVisibility(num != null ? num.intValue() : 0);
        }
        android.view.View view2 = this.H;
        if (view2 != null) {
            view2.post(new a.fw(11, this));
        }
        Y();
        X();
    }

    public final void W(android.view.View view) {
        android.widget.ListAdapter T = a.b20.T(view);
        a.wv.t(T, "null cannot be cast to non-null type com.omarea.common.ui.AdapterItemChooser");
        a.aj ajVar = (a.aj) T;
        java.util.ArrayList a2 = ajVar.a();
        java.util.ArrayList arrayList = ajVar.d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(a.op.J1(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(java.lang.Boolean.valueOf(((a.ng1) it.next()).d));
        }
        boolean[] u2 = a.qv.u2(arrayList2);
        a.y60 y60Var = this.q0;
        if (y60Var != null) {
            y60Var.a(a2, u2);
        }
        S(false, false);
    }

    public final void X() {
        android.widget.TextView textView;
        android.view.View view = this.H;
        if (view == null || (textView = (android.widget.TextView) view.findViewById(2131362404)) == null) {
            return;
        }
        textView.setText(this.u0);
        textView.setVisibility(this.u0.length() > 0 ? 0 : 8);
    }

    public final void Y() {
        android.widget.TextView textView;
        android.view.View view = this.H;
        if (view == null || (textView = (android.widget.TextView) view.findViewById(2131362414)) == null) {
            return;
        }
        textView.setText(this.t0);
        textView.setVisibility(this.t0.length() > 0 ? 0 : 8);
    }

    public /* synthetic */ b70(boolean z, java.util.List list, boolean z2, a.y60 y60Var) {
        this(z, list, z2, y60Var, 7);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b70(boolean z, java.util.List list, boolean z2, a.y60 y60Var, int i) {
        super(list.size() > i ? 2131558532 : 2131558533, z);
        a.wv.w(list, "items");
        this.o0 = list;
        this.p0 = z2;
        this.q0 = y60Var;
        this.r0 = i;
        this.t0 = "";
        this.u0 = "";
        this.v0 = true;
    }
}
