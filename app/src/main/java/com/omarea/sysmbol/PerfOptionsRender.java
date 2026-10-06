package com.omarea.sysmbol;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class PerfOptionsRender extends android.widget.LinearLayout {
    public static final /* synthetic */ int d = 0;
    public a.nk c;

    public PerfOptionsRender(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        setLayout(context);
    }

    public static final java.lang.String a(com.omarea.sysmbol.PerfOptionsRender perfOptionsRender, a.tj1 tj1Var) {
        a.nk nkVar = perfOptionsRender.c;
        if (nkVar != null) {
            return nkVar.B(tj1Var.c, tj1Var.d);
        }
        a.nu0 nu0Var = a.nu0.f395a;
        java.lang.String d2 = a.nu0.d(tj1Var.c);
        return (d2.length() != 0 || a.gy.n(tj1Var.c)) ? d2 : tj1Var.d;
    }

    public static final void b(com.omarea.sysmbol.PerfOptionsRender perfOptionsRender, java.lang.String str, java.lang.String str2) {
        perfOptionsRender.getClass();
        if (str.length() == 0) {
            return;
        }
        a.nk nkVar = perfOptionsRender.c;
        if (nkVar != null) {
            nkVar.M(str, str2);
        } else {
            a.gy.W(str, str2);
        }
    }

    public static void e(android.widget.TextView textView, java.lang.String str) {
        if (str == null || str.length() == 0) {
            textView.setVisibility(8);
        } else {
            textView.setText(str);
            textView.setVisibility(0);
        }
    }

    private final void setLayout(android.content.Context context) {
        android.view.LayoutInflater.from(context).inflate(2131558624, (android.view.ViewGroup) this, true);
    }

    public final a.u41 c(a.tj1 tj1Var) {
        a.v41 v41Var = new a.v41(tj1Var);
        java.lang.String str = tj1Var.f;
        switch (str.hashCode()) {
            case -1034364087:
                if (str.equals("number")) {
                    return new a.u41(v41Var, this, tj1Var, 0);
                }
                break;
            case 3000946:
                if (str.equals("apps")) {
                    return new a.u41(v41Var, this, tj1Var, 3);
                }
                break;
            case 64711720:
                if (str.equals("boolean")) {
                    return new a.u41(this, tj1Var, v41Var);
                }
                break;
            case 1542263633:
                if (str.equals("decimal")) {
                    return new a.u41(v41Var, this, tj1Var, 1);
                }
                break;
        }
        return new a.u41(v41Var, this, tj1Var, 4);
    }

    public final android.view.View d(int i) {
        android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(i, (android.view.ViewGroup) null, false);
        a.wv.v(inflate, "from(this.getContext()).…te(layoutId, null, false)");
        return inflate;
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        setAlpha(z ? 1.0f : 0.5f);
    }
}
