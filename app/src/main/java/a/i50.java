package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class i50 {

    /* renamed from: a, reason: collision with root package name */
    public final android.app.Activity f225a;
    public final a.c50 b;
    public final a.b81 c;

    public i50(android.app.Activity activity, a.c50 c50Var, a.b81 b81Var) {
        a.wv.w(activity, "activity");
        a.wv.w(c50Var, "exchangeHandler");
        a.wv.w(b81Var, "progressBarDialog");
        this.f225a = activity;
        this.b = c50Var;
        this.c = b81Var;
    }

    public static final void a(a.i50 i50Var, a.v60 v60Var, java.lang.String str, com.omarea.model.ExchangeResponse exchangeResponse) {
        java.lang.String string;
        i50Var.getClass();
        boolean exchanged = exchangeResponse.getExchanged();
        int i = 3;
        android.app.Activity activity = i50Var.f225a;
        if (exchanged) {
            java.lang.String codeStr = exchangeResponse.getCodeStr();
            if (codeStr.length() <= 0) {
                i50Var.f(true);
                v60Var.a();
                int i2 = a.x60.f681a;
                java.lang.String string2 = activity.getString(2131953679);
                a.wv.v(string2, "activity.getString(R.string.user_exchange_ok)");
                a.fs1.G(activity, string2, new a.b50(i50Var, i));
                return;
            }
            a.q10 q10Var = a.q10.f457a;
            java.lang.String g = a.q10.g(codeStr);
            if (a.yi1.g2(g, "success")) {
                a.cp cpVar = com.omarea.Scene.c;
                a.fs1.D().edit().putString("random_id2", codeStr).apply();
                a.wv.M0(a.wv.b(a.z80.b), null, new a.e50(i50Var, null), 3);
                v60Var.a();
                int i3 = a.x60.f681a;
                java.lang.String string3 = activity.getString(2131953679);
                a.wv.v(string3, "activity.getString(R.string.user_exchange_ok)");
                a.fs1.F(activity, string3, i50Var.b(exchangeResponse), new a.b50(i50Var, 2));
                return;
            }
            int i4 = a.x60.f681a;
            java.lang.String string4 = activity.getString(2131952229);
            a.wv.v(string4, "activity.getString(R.string.execute_fail)");
            a.fs1.Z(activity, string4, activity.getString(2131953680) + "\n\nResponse:\n" + exchangeResponse.getDetail() + "\n\n" + g, null, new a.hs(16), 8);
            return;
        }
        int i5 = 4;
        if (exchangeResponse.getActivated()) {
            java.lang.String codeStr2 = exchangeResponse.getCodeStr();
            a.q10 q10Var2 = a.q10.f457a;
            java.lang.String g2 = a.q10.g(codeStr2);
            if (a.yi1.g2(g2, "success")) {
                a.cp cpVar2 = com.omarea.Scene.c;
                a.fs1.D().edit().putString("random_id2", codeStr2).apply();
                a.wv.M0(a.wv.b(a.z80.b), null, new a.f50(i50Var, null), 3);
                v60Var.a();
                int i6 = a.x60.f681a;
                java.lang.String string5 = activity.getString(2131953679);
                a.wv.v(string5, "activity.getString(R.string.user_exchange_ok)");
                java.lang.String string6 = activity.getString(2131953681);
                a.wv.v(string6, "activity.getString(R.string.user_exchange_ok_old)");
                a.fs1.F(activity, string5, string6, new a.b50(i50Var, i5));
                return;
            }
            int i7 = a.x60.f681a;
            java.lang.String string7 = activity.getString(2131953676);
            a.wv.v(string7, "activity.getString(R.string.user_exchange_fail)");
            a.fs1.a(activity, string7, activity.getString(2131953682) + "\n\nResponse:\n" + exchangeResponse.getDetail() + "\n\n" + g2, new a.hs(17));
            return;
        }
        if (!exchangeResponse.getFound()) {
            if (exchangeResponse.getFound()) {
                int i8 = a.x60.f681a;
                if (exchangeResponse.getError().length() > 0) {
                    string = exchangeResponse.getError();
                } else {
                    string = activity.getString(2131953676);
                    a.wv.v(string, "activity.getString(R.string.user_exchange_fail)");
                }
                a.fs1.a(activity, string, a.ii1.f(activity.getString(2131953684), "\n\n", exchangeResponse.getDetail()), null);
                return;
            }
            int i9 = a.x60.f681a;
            java.lang.String string8 = activity.getString(2131953676);
            a.wv.v(string8, "activity.getString(R.string.user_exchange_fail)");
            java.lang.String string9 = activity.getString(2131953677);
            a.wv.v(string9, "activity.getString(R.str…er_exchange_invalid_desc)");
            a.fs1.a(activity, string8, string9, null);
            return;
        }
        if (exchangeResponse.getNumber() > exchangeResponse.getUsed()) {
            int i10 = a.x60.f681a;
            java.lang.String string10 = activity.getString(2131953685);
            a.wv.v(string10, "activity.getString(R.string.user_exchange_valid)");
            java.lang.String b = i50Var.b(exchangeResponse);
            java.lang.String string11 = activity.getString(2131953678);
            a.wv.v(string11, "activity.getString(R.string.user_exchange_now)");
            a.u60 u60Var = new a.u60(string11, new a.ua0(i50Var, v60Var, str, 22), 4);
            java.lang.String string12 = activity.getString(2131952076);
            a.wv.v(string12, "activity.getString(R.string.btn_cancel)");
            a.fs1.f(activity, string10, b, u60Var, new a.u60(string12, (java.lang.Runnable) null, 6)).b(false);
            return;
        }
        if (exchangeResponse.getError().length() > 0 && exchangeResponse.getDevices().length() == 0) {
            int i11 = a.x60.f681a;
            java.lang.String string13 = activity.getString(2131953676);
            a.wv.v(string13, "activity.getString(R.string.user_exchange_fail)");
            a.fs1.a(activity, string13, exchangeResponse.getError(), null);
            return;
        }
        int i12 = a.x60.f681a;
        java.lang.String string14 = activity.getString(2131953673);
        a.wv.v(string14, "activity.getString(R.string.user_exchange_exhaust)");
        a.fs1.a(activity, string14, activity.getString(2131953675) + i50Var.b(exchangeResponse), null);
    }

    public final java.lang.String b(com.omarea.model.ExchangeResponse exchangeResponse) {
        if (exchangeResponse.getNumber() <= 0) {
            return "";
        }
        java.lang.String string = this.f225a.getString(2131953674);
        a.wv.v(string, "activity.getString(R.str…er_exchange_exhaust_desc)");
        return a.ii1.f(a.ai1.l(new java.lang.Object[]{java.lang.Integer.valueOf(exchangeResponse.getNumber()), java.lang.Integer.valueOf(exchangeResponse.getUsed())}, 2, string, "format(this, *args)"), "\n", exchangeResponse.getDevices());
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, a.ma1] */
    public final void c() {
        android.app.Activity activity = this.f225a;
        android.view.View inflate = android.view.LayoutInflater.from(activity).inflate(2131558534, (android.view.ViewGroup) null);
        android.widget.EditText editText = (android.widget.EditText) inflate.findViewById(2131362413);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(2131361900);
        android.view.View findViewById = inflate.findViewById(2131362751);
        android.view.View findViewById2 = inflate.findViewById(2131362962);
        a.cp cpVar = com.omarea.Scene.c;
        java.lang.String E = a.fs1.E("order_id", "");
        if (E != null && E.length() != 0) {
            editText.setText(E);
        }
        textView.setText("• " + a.fs1.D().getString("user_name", ""));
        a.ma1 obj = new a.ma1();
        int i = a.x60.f681a;
        java.lang.String string = activity.getString(2131953727);
        a.wv.v(string, "activity.getString(R.string.user_verify)");
        a.v60 j = a.fs1.j(activity, inflate, new a.u60(string, (java.lang.Runnable) new a.ua0(editText, this, obj, 21), false));
        obj.c = j;
        j.b(false);
        findViewById.setOnClickListener(new a.z40(this, (a.ma1) obj));
        findViewById2.setOnClickListener(new a.z40((a.ma1) obj, this));
    }

    public final void d() {
        try {
            android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse("https://fa.hsfaka.net/orderquery"));
            intent.addFlags(268435456);
            this.f225a.startActivity(intent);
        } catch (java.lang.Exception unused) {
        }
    }

    public final void e(boolean z) {
        a.cp cpVar = com.omarea.Scene.c;
        a.fs1.L(new a.u4(this, z));
    }

    public final void f(boolean z) {
        if (a.tg1.f().length() > 0) {
            e(true);
            a.cp cpVar = com.omarea.Scene.c;
            a.wv.M0(a.wv.b(a.z80.b), null, new a.g50(this, a.fs1.D().getString("random_id2", ""), z, null), 3);
            return;
        }
        int i = a.x60.f681a;
        android.app.Activity activity = this.f225a;
        java.lang.String string = activity.getString(2131953713);
        a.wv.v(string, "activity.getString(R.string.user_sn_null)");
        java.lang.String string2 = activity.getString(2131953715);
        a.wv.v(string2, "activity.getString(R.string.user_sn_root2)");
        a.fs1.a(activity, string, string2, null);
    }
}
