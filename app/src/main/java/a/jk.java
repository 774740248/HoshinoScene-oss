package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class jk extends a.e91 {
    public final android.content.Context f;
    public final long g;
    public final a.v01 h;
    public final java.util.List i;
    public final android.text.style.StyleSpan j;
    public final a.eu k;

    public jk(android.content.Context context, long j, java.util.List list, a.v01 v01Var) {
        a.wv.w(context, "context");
        this.f = context;
        this.g = j;
        this.h = v01Var;
        this.i = a.qv.s2(list, new a.py(16));
        this.j = new android.text.style.StyleSpan(1);
        this.k = new a.eu();
    }

    @Override // a.e91
    public final int c() {
        return this.i.size();
    }

    @Override // a.e91
    public final long d(int i) {
        return i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.e91
    public final void i(a.da1 da1Var, int i) {
        java.lang.String str;
        a.ik ikVar = (a.ik) da1Var;
        a.bm1 bm1Var = (a.bm1) this.i.get(i);
        android.widget.TextView textView = ikVar.v;
        if (textView == null) {
            a.wv.M1("threadID");
            throw null;
        }
        textView.setText(java.lang.String.valueOf(bm1Var.f46a));
        android.widget.TextView textView2 = ikVar.w;
        if (textView2 == null) {
            a.wv.M1("threadDuration");
            throw null;
        }
        a.ai1.v(new java.lang.Object[]{java.lang.Double.valueOf(bm1Var.c), java.lang.Double.valueOf(bm1Var.e)}, 2, "AVG:%.1f%% MAX:%.1f%%", "format(format, *args)", textView2);
        com.omarea.ui.fps.ThreadCPUView threadCPUView = ikVar.x;
        if (threadCPUView == null) {
            a.wv.M1("threadTime");
            throw null;
        }
        a.v01 v01Var = this.h;
        a.wv.w(v01Var, "timeRange");
        threadCPUView.j = this.g;
        threadCPUView.k = bm1Var;
        threadCPUView.l = v01Var;
        threadCPUView.o = null;
        threadCPUView.invalidate();
        android.widget.TextView textView3 = ikVar.u;
        if (textView3 == null) {
            a.wv.M1("threadName");
            throw null;
        }
        if (bm1Var.b > (v01Var.b - v01Var.f616a) / 2) {
            android.text.SpannableString spannableString = new android.text.SpannableString(bm1Var.a());
            spannableString.setSpan(this.j, 0, bm1Var.a().length(), 33);
            str = (String) spannableString;
        } else {
            str = bm1Var.a();
        }
        textView3.setText(str);
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [a.ik, a.da1, java.lang.Object] */
    @Override // a.e91
    public final a.da1 k(androidx.recyclerview.widget.RecyclerView recyclerView, int i) {
        a.wv.w(recyclerView, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(this.f).inflate(2131558657, (android.view.ViewGroup) null);
        a.wv.v(inflate, "convertView");
        a.ik da1Var = (ik) new a.da1(inflate);
        android.view.View findViewById = inflate.findViewById(2131363280);
        a.wv.v(findViewById, "convertView.findViewById(R.id.threadID)");
        da1Var.v = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = inflate.findViewById(2131363281);
        a.wv.v(findViewById2, "convertView.findViewById(R.id.threadName)");
        da1Var.u = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = inflate.findViewById(2131363279);
        a.wv.v(findViewById3, "convertView.findViewById(R.id.threadDuration)");
        da1Var.w = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = inflate.findViewById(2131363282);
        a.wv.v(findViewById4, "convertView.findViewById(R.id.threadTime)");
        da1Var.x = (com.omarea.ui.fps.ThreadCPUView) findViewById4;
        android.widget.TextView textView = da1Var.u;
        if (textView != null) {
            textView.setOnLongClickListener(new a.ni(this, 3, da1Var));
            return da1Var;
        }
        a.wv.M1("threadName");
        throw null;
    }

    @Override // a.e91
    public final void m(a.da1 da1Var) {
        com.omarea.ui.fps.ThreadCPUView threadCPUView = ((a.ik) da1Var).x;
        if (threadCPUView != null) {
            threadCPUView.setTooltipGroup(this.k);
        } else {
            a.wv.M1("threadTime");
            throw null;
        }
    }

    @Override // a.e91
    public final void n(a.da1 da1Var) {
        com.omarea.ui.fps.ThreadCPUView threadCPUView = ((a.ik) da1Var).x;
        if (threadCPUView != null) {
            threadCPUView.setTooltipGroup(null);
        } else {
            a.wv.M1("threadTime");
            throw null;
        }
    }
}
