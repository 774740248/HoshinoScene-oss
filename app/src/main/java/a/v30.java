package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class v30 {

    /* renamed from: a, reason: collision with root package name */
    public final android.app.Activity f620a;
    public final java.lang.String b = "screen_dpi";
    public final java.lang.String c = "screen_ratio";
    public final java.lang.String d = "screen_width";
    public final float e = 1.7777778f;
    public final int f = 320;
    public final int g = 720;

    public v30(a.kk0 kk0Var) {
        this.f620a = kk0Var;
    }

    public final void a(android.graphics.Point point, android.util.DisplayMetrics displayMetrics, boolean z) {
        a.cp cpVar = com.omarea.Scene.c;
        android.content.SharedPreferences D = a.fs1.D();
        java.lang.String str = this.c;
        if (z || !D.contains(str)) {
            D.edit().putFloat(str, point.y / point.x).commit();
        }
        java.lang.String str2 = this.d;
        java.lang.String str3 = this.b;
        if (!z && D.contains(str3) && D.contains(str2)) {
            return;
        }
        D.edit().putInt(str3, displayMetrics.densityDpi).commit();
        D.edit().putInt(str2, point.x).commit();
    }

    public final int b(int i) {
        a.cp cpVar = com.omarea.Scene.c;
        android.content.SharedPreferences D = a.fs1.D();
        int i2 = (D.getInt(this.b, this.f) * i) / D.getInt(this.d, this.g);
        if (i2 > 960) {
            return 960;
        }
        if (i2 < 160) {
            return 160;
        }
        return i2;
    }

    public final int c(int i) {
        a.cp cpVar = com.omarea.Scene.c;
        return (int) (a.fs1.D().getFloat(this.c, this.e) * i);
    }

    public final void d(android.view.Display display, a.kk0 kk0Var) {
        android.view.View inflate = android.view.LayoutInflater.from(kk0Var).inflate(2131558496, (android.view.ViewGroup) null);
        android.view.View findViewById = inflate.findViewById(2131362392);
        a.wv.v(findViewById, "dialog.findViewById(R.id…ialog_addin_dpi_dpiinput)");
        final android.widget.EditText editText = (android.widget.EditText) findViewById;
        android.view.View findViewById2 = inflate.findViewById(2131362395);
        a.wv.v(findViewById2, "dialog.findViewById(R.id.dialog_addin_dpi_width)");
        final android.widget.EditText editText2 = (android.widget.EditText) findViewById2;
        android.view.View findViewById3 = inflate.findViewById(2131362393);
        a.wv.v(findViewById3, "dialog.findViewById(R.id.dialog_addin_dpi_height)");
        final android.widget.EditText editText3 = (android.widget.EditText) findViewById3;
        android.view.View findViewById4 = inflate.findViewById(2131362394);
        a.wv.v(findViewById4, "dialog.findViewById(R.id…og_addin_dpi_quickchange)");
        android.widget.CheckBox checkBox = (android.widget.CheckBox) findViewById4;
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        display.getMetrics(displayMetrics);
        android.graphics.Point point = new android.graphics.Point();
        display.getRealSize(point);
        a(point, displayMetrics, false);
        editText.setText(java.lang.String.valueOf(displayMetrics.densityDpi));
        editText2.setText(java.lang.String.valueOf(point.x));
        editText3.setText(java.lang.String.valueOf(point.y));
        checkBox.setChecked(true);
        a.q10 q10Var = a.q10.f457a;
        if (a.wv.e(a.q10.t(), "adb")) {
            checkBox.setEnabled(false);
        }
        ((android.widget.Button) inflate.findViewById(2131362408)).setOnClickListener(new a.bf(editText2, this, editText3, editText, displayMetrics, point, 1));
        final int i = 0;
        ((android.widget.Button) inflate.findViewById(2131362405)).setOnClickListener(new a.s30());
        final int i2 = 1;
        ((android.widget.Button) inflate.findViewById(2131362406)).setOnClickListener(new a.s30());
        final int i3 = 2;
        ((android.widget.Button) inflate.findViewById(2131362407)).setOnClickListener(new a.s30());
        int i4 = a.x60.f681a;
        java.lang.String string = kk0Var.getString(2131951834);
        a.wv.v(string, "context.getString(R.string.addin_dpi)");
        ((android.widget.Button) inflate.findViewById(2131362409)).setOnClickListener(new a.x8(a.fs1.h(kk0Var, string, "", inflate, new a.t1(editText, editText2, editText3, checkBox, kk0Var, this, 3), new a.hs(15)), (java.lang.Object) this, (java.lang.Object) display, (java.lang.Object) point, (java.lang.Object) displayMetrics, 5));
    }
}
