package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class e70 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f116a;
    public final java.util.List b;
    public final java.util.List c;
    public final boolean d;
    public final int e;
    public android.view.View f;
    public android.view.View g;
    public android.view.View h;
    public a.v60 i;
    public java.lang.String j;
    public java.lang.String k;
    public a.c70 l;
    public final boolean m;

    public e70(android.content.Context context, java.util.List list, java.util.List list2, boolean z) {
        a.wv.w(context, "context");
        this.f116a = context;
        this.b = list;
        this.c = list2;
        this.d = z;
        this.e = 2131558533;
        this.j = "";
        this.k = "";
        this.m = true;
    }

    public final void a(a.be0 be0Var) {
        this.l = be0Var;
    }

    public final void b(java.lang.String str) {
        this.j = str;
        e();
    }

    public final void c() {
        a.v60 v60Var = this.i;
        int i = 1;
        if (v60Var == null || !v60Var.f625a.isShowing()) {
            android.view.View view = this.f;
            android.content.Context context = this.f116a;
            if (view == null) {
                view = android.view.LayoutInflater.from(context).inflate(this.e, (android.view.ViewGroup) null);
                this.f = view;
                this.g = view.findViewById(2131362097);
                this.h = view.findViewById(2131362098);
            }
            android.view.View findViewById = view.findViewById(2131362671);
            a.wv.v(findViewById, "absListView");
            android.content.Context context2 = findViewById.getContext();
            a.wv.v(context2, "gridView.context");
            java.util.List list = this.b;
            a.zi ziVar = new a.zi(context2, list, this.c, this.d);
            ziVar.j = new a.lc1(this, 2, findViewById);
            a.b20.g1(findViewById, ziVar);
            android.view.View view2 = this.g;
            if (view2 != null) {
                view2.setOnClickListener(new a.gv(7, this));
            }
            android.view.View view3 = this.h;
            if (view3 != null) {
                view3.setOnClickListener(new a.wi(this, 3, findViewById));
            }
            if (list.size() > 5) {
                android.view.View findViewById2 = view.findViewById(2131363045);
                android.widget.EditText editText = (android.widget.EditText) view.findViewById(2131363044);
                editText.addTextChangedListener(new a.a70(findViewById2, findViewById, i));
                android.text.Editable text = editText.getText();
                findViewById2.setVisibility((text == null || text.length() == 0) ? 8 : 0);
                findViewById2.setOnClickListener(new a.w30(editText, 2));
            }
            android.view.View view4 = this.f;
            if (view4 != null) {
                view4.post(new a.fw(12, this));
            }
            e();
            d();
            int i2 = a.x60.f681a;
            android.view.View view5 = this.f;
            a.wv.s(view5);
            this.i = a.fs1.m(context, view5, true);
        }
        a.wv.s(this.i);
    }

    public final void d() {
        android.view.View view = this.f;
        if (view != null) {
            android.widget.TextView textView = (android.widget.TextView) view.findViewById(2131362404);
            textView.setText(this.k);
            textView.setVisibility(this.k.length() > 0 ? 0 : 8);
        }
    }

    public final void e() {
        android.view.View view = this.f;
        if (view != null) {
            android.widget.TextView textView = (android.widget.TextView) view.findViewById(2131362414);
            textView.setText(this.j);
            textView.setVisibility(this.j.length() > 0 ? 0 : 8);
        }
    }
}
