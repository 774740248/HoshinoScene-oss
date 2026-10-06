package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class cp extends a.b11 implements a.wr0 {
    public static final /* synthetic */ int E = 0;
    public final a.me1 A;
    public java.util.Timer B;
    public final a.ej1 C;
    public a.qi1 D;
    public java.lang.String s;
    public java.lang.String t;
    public java.lang.String u;
    public final android.content.SharedPreferences v;
    public final android.content.SharedPreferences w;
    public final java.util.ArrayList x;
    public boolean y;
    public long z;

    public cp(android.content.Context context) {
        a.wv.w(context, "context");
        this.t = "com.android.systemui";
        this.u = "";
        a.cp cpVar = com.omarea.Scene.c;
        this.v = a.fs1.t().getSharedPreferences("powercfg", 0);
        this.w = a.fs1.t().getSharedPreferences("scene_black_list_spf", 0);
        this.x = new java.util.ArrayList();
        a.tg1 tg1Var = a.me1.m;
        a.au auVar = new a.au(a.fs1.t(), 2);
        a.me1 me1Var = a.me1.p;
        if (me1Var != null) {
            me1Var.c = "com.android.systemui";
            me1Var.k();
            me1Var.l();
            me1Var.i = null;
            me1Var.f.v();
            a.me1.p = null;
        }
        a.me1 me1Var2 = new a.me1(context, auVar);
        a.me1.p = me1Var2;
        this.A = me1Var2;
        this.C = new a.ej1(a.fs1.t(), 11);
        this.C = new a.ej1(a.fs1.t(), 11);
        if (this.y) {
            a.wk.b(true);
        }
        a.ty tyVar = a.z80.b;
        a.xo xoVar = new a.xo(this, null);
        int i = 2 & 1;
        a.ty tyVar2 = a.ob0.c;
        tyVar = i != 0 ? tyVar2 : tyVar;
        int i2 = (2 & 2) != 0 ? 1 : 0;
        a.ty W = a.wv.W(tyVar2, tyVar, true);
        a.u20 u20Var = a.z80.f728a;
        if (W != u20Var && W.g(a.gy.c) == null) {
            W = W.c(u20Var);
        }
        a.f av0Var = i2 == 2 ? new a.av0(W, xoVar) : new a.f(W, true);
        av0Var.S(i2, av0Var, xoVar);
        java.util.ArrayList arrayList = a.dc0.f93a;
        a.dc0.c(this);
    }

    public static boolean g() {
        a.cp cpVar = com.omarea.Scene.c;
        return a.fs1.D().getBoolean("dynamic_control", false) && !a.fs1.D().getBoolean("daemon_auto", true);
    }

    @Override // a.wr0
    public final boolean eventFilter(a.kc0 kc0Var) {
        int ordinal = kc0Var.ordinal();
        return ordinal == 0 || ordinal == 1 || ordinal == 7 || ordinal == 8 || ordinal == 9 || ordinal == 18 || ordinal == 19;
    }

    public final void f(java.lang.String str) {
        java.lang.String str2;
        a.lv b;
        if (str == null || a.wv.e(str, this.t)) {
            return;
        }
        this.t = str;
        if (g()) {
            a.lv b2 = a.b11.b();
            if (b2 != null && b2.b) {
                a.cp cpVar = com.omarea.Scene.c;
                if (a.fs1.D().getBoolean("pedestal_mode", false)) {
                    str2 = a.b11.m;
                    if (!a.wv.e(str2, a.b11.o) && (!a.wv.e(this.u, str2) || (b = a.b11.b()) == null || b.f332a)) {
                        this.u = str2;
                        e(str2, str, "dynamic");
                        return;
                    }
                }
            }
            android.content.SharedPreferences sharedPreferences = this.v;
            java.lang.String string = sharedPreferences.getString(str, null);
            if (string == null) {
                str2 = sharedPreferences.getString("*", a.b11.l);
                a.wv.s(str2);
            } else {
                str2 = string;
            }
            if (!a.wv.e(str2, a.b11.o)) {
                this.u = str2;
                e(str2, str, "dynamic");
                return;
            }
        }
        a.cp cpVar2 = com.omarea.Scene.c;
        if (a.fs1.D().getBoolean("daemon_auto", true)) {
            return;
        }
        a.nk nkVar = a.b11.c;
        nkVar.getClass();
        nkVar.e = str;
        java.util.ArrayList arrayList = a.dc0.f93a;
        a.dc0.b(a.kc0.t);
    }

    public final void h() {
        a.cp cpVar = com.omarea.Scene.c;
        android.content.res.Resources resources = a.fs1.t().getResources();
        a.pm pmVar = new a.pm(21);
        java.util.ArrayList arrayList = this.x;
        arrayList.clear();
        java.lang.String[] stringArray = resources.getStringArray(2130903053);
        a.wv.v(stringArray, "res.getStringArray(R.arr…ig_powercfg_force_igoned)");
        a.pv.a2(arrayList, stringArray);
        arrayList.addAll(new a.l1(a.fs1.t(), 6).c());
        if (this.v.getAll().isEmpty()) {
            pmVar.y();
        }
        if (a.fs1.D().getBoolean("dynamic_control", false)) {
            if (!a.b11.d()) {
                a.fs1.D().edit().putBoolean("dynamic_control", false).apply();
            } else {
                a.tg1.p();
                c();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [a.fp0, a.lj1] */
    public final void i() {
        this.z = java.lang.System.currentTimeMillis();
        this.A.o();
        if (a.me1.n.length() > 0) {
            a.wv.M0(a.wv.b(a.z80.b), null, new a.lj1(2, null), 3);
        }
        a.qi1 qi1Var = this.D;
        if (qi1Var != null) {
            a.wv.p(qi1Var);
        }
        if (!this.y) {
            this.y = true;
            j();
        }
        if (!g() || this.u.length() <= 0) {
            return;
        }
        this.s = null;
        this.t = null;
        java.util.ArrayList arrayList = a.dc0.f93a;
        a.dc0.b(a.kc0.r);
    }

    @Override // a.wr0
    public final boolean isAsync() {
        return false;
    }

    public final void j() {
        if (this.B == null && this.y && !this.C.r()) {
            java.util.Timer timer = new java.util.Timer("ProcessPolling", true);
            timer.schedule(new a.bp(timer, this), 1000L, 6 * 1000);
            this.B = timer;
        }
    }

    public final void k() {
        try {
            java.util.Timer timer = this.B;
            if (timer != null) {
                a.wv.s(timer);
                timer.cancel();
                java.util.Timer timer2 = this.B;
                a.wv.s(timer2);
                timer2.purge();
                this.B = null;
            }
        } catch (java.lang.Exception unused) {
        }
    }

    @Override // a.wr0
    public final void onReceive(a.kc0 kc0Var, java.util.HashMap hashMap) {
        int ordinal = kc0Var.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            java.lang.String str = this.t;
            this.t = "com.android.systemui";
            f(str);
            return;
        }
        if (ordinal == 7) {
            i();
            return;
        }
        a.me1 me1Var = this.A;
        if (ordinal == 8) {
            a.cp cpVar = com.omarea.Scene.c;
            if (new a.ej1(a.fs1.t(), 11).r()) {
                long currentTimeMillis = java.lang.System.currentTimeMillis() - this.z;
                if (0 > currentTimeMillis || currentTimeMillis >= 100) {
                    this.y = false;
                    this.z = java.lang.System.currentTimeMillis();
                    me1Var.f.v();
                    this.D = a.wv.M0(a.wv.b(a.z80.b), null, new a.zo(this, null), 3);
                    return;
                }
                return;
            }
            return;
        }
        if (ordinal == 9) {
            a.vj1 vj1Var = a.oq0.c;
            java.lang.String b = a.oq0.b();
            if (!this.y && !this.C.r()) {
                i();
            }
            if (a.wv.e(this.s, b) || this.x.contains(b) || this.w.contains(b)) {
                return;
            }
            if (this.s == null) {
                this.s = "com.android.systemui";
            }
            f(b);
            a.tg1 tg1Var = a.me1.m;
            me1Var.g(b, false);
            this.s = b;
            return;
        }
        if (ordinal == 18) {
            a.wv.M0(a.wv.b(a.z80.b), null, new a.yo(this, null), 3);
            return;
        }
        if (ordinal == 19 && hashMap != null && hashMap.containsKey("app")) {
            if (g() && this.y && hashMap.containsKey("mode")) {
                java.lang.Object obj = hashMap.get("mode");
                java.lang.String obj2 = obj != null ? obj.toString() : null;
                java.lang.Object obj3 = hashMap.get("app");
                java.lang.String obj4 = obj3 != null ? obj3.toString() : null;
                if (obj2 != null && obj4 != null && a.wv.e(obj4, this.t)) {
                    this.u = obj2;
                    e(obj2, obj4, "dynamic");
                }
            }
            if (me1Var.c.length() > 0) {
                me1Var.g(me1Var.c, true);
            }
        }
    }

    @Override // a.wr0
    public final void onSubscribe() {
    }

    @Override // a.wr0
    public final void onUnsubscribe() {
        a.me1 me1Var = this.A;
        me1Var.c = "com.android.systemui";
        me1Var.k();
        me1Var.l();
        me1Var.i = null;
        me1Var.f.v();
        a.me1.p = null;
        a.wk wkVar = a.wk.c;
        if (a.wk.e != null) {
            a.wk.i.cancel(256);
            a.wk.e = null;
        }
        k();
    }
}
