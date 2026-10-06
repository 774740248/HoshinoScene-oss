package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class p30 extends a.kk {
    public static final /* synthetic */ int g = 0;
    public final a.p5 f;

    /* [修复] 从 smali 还原：两个分支 super(p5Var,null) 相同，去重 */
    public p30(a.p5 p5Var, int i) {
        super(p5Var, null);
        this.f = p5Var;
    }

    public final void d() {
        final int i = 0;
        if (com.omarea.vtools.services.CompileService.i) {
            a.p5 p5Var = this.f;
            android.widget.Toast.makeText(p5Var, p5Var.getString(2131952167), 0).show();
            return;
        }
        android.view.View inflate = this.f.getLayoutInflater().inflate(2131558494, (android.view.ViewGroup) null);
        int i2 = a.x60.f681a;
        a.p5 p5Var2 = this.f;
        a.wv.v(inflate, "view");
        final int i3 = 1;
        final a.v60 m = a.fs1.m(p5Var2, inflate, true);
        inflate.findViewById(2131362806).setOnClickListener(new a.o30());
        inflate.findViewById(2131362805).setOnClickListener(new a.o30());
        final int i4 = 2;
        inflate.findViewById(2131362793).setOnClickListener(new a.o30());
        final int i5 = 3;
        inflate.findViewById(2131362801).setOnClickListener(new a.o30());
        android.view.View findViewById = inflate.findViewById(2131362790);
        if (android.os.Build.VERSION.SDK_INT > 28) {
            findViewById.setOnClickListener(new a.sg(m, this, findViewById, 17));
        } else {
            findViewById.setVisibility(8);
        }
        final int i6 = 4;
        inflate.findViewById(2131362476).setOnClickListener(new a.o30());
    }

    public final void e(java.lang.String str) {
        if (com.omarea.vtools.services.CompileService.i) {
            a.p5 p5Var = this.f;
            android.widget.Toast.makeText(p5Var, p5Var.getString(2131952167), 0).show();
            return;
        }
        try {
            android.content.Intent intent = new android.content.Intent(this.f, (java.lang.Class<?>) com.omarea.vtools.services.CompileService.class);
            intent.setAction(str);
            this.f.startService(intent);
            a.p5 p5Var2 = this.f;
            android.widget.Toast.makeText(p5Var2, p5Var2.getString(2131952180), 0).show();
        } catch (java.lang.Exception unused) {
            a.p5 p5Var3 = this.f;
            android.widget.Toast.makeText(p5Var3, p5Var3.getString(2131952179), 0).show();
        }
    }
}
