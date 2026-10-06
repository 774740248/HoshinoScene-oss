package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class f60 {

    /* renamed from: a, reason: collision with root package name */
    public final a.ml f145a;
    public final a.qo0 b;
    public final a.bp0 c;
    public a.fp0 d;
    public a.fp0 e;
    public a.qo0 f;
    public final a.ab1 g;

    public f60(a.p5 p5Var, a.qo0 qo0Var, a.w00 w00Var) {
        a.wv.w(p5Var, "activity");
        this.f145a = p5Var;
        this.b = qo0Var;
        this.c = w00Var;
        this.g = new a.ab1(".*[\\\\/:*?\"<>|].*");
    }

    public static final java.lang.Object a(a.f60 f60Var, java.util.List list, java.lang.String str, a.ey eyVar) {
        f60Var.getClass();
        a.at atVar = new a.at(a.wv.B0(eyVar));
        atVar.p();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.lang.String str2 = (java.lang.String) it.next();
            java.lang.String f = a.ii1.f(str, "/", new java.io.File(str2).getName());
            if (!a.gy.H(f)) {
                arrayList2.add(new a.y31(str2, f));
            } else if (a.gy.H(str2)) {
                arrayList.add(new a.y31(str2, f));
            } else {
                arrayList3.add(str2);
            }
        }
        atVar.j(new a.k50(arrayList, arrayList2, arrayList3));
        return atVar.o();
    }

    public static final java.lang.Object b(a.f60 f60Var, a.ey eyVar) {
        f60Var.getClass();
        a.at atVar = new a.at(a.wv.B0(eyVar));
        atVar.p();
        a.ml mlVar = f60Var.f145a;
        android.view.View inflate = android.view.LayoutInflater.from(mlVar).inflate(2131558525, (android.view.ViewGroup) null);
        int i = a.x60.f681a;
        a.wv.v(inflate, "view");
        a.v60 m = a.fs1.m(mlVar, inflate, true);
        m.b(false);
        com.omarea.ui.SwitchOptionItemView switchOptionItemView = (com.omarea.ui.SwitchOptionItemView) inflate.findViewById(2131362491);
        com.omarea.ui.SwitchOptionItemView switchOptionItemView2 = (com.omarea.ui.SwitchOptionItemView) inflate.findViewById(2131362484);
        inflate.findViewById(2131362097).setOnClickListener(new a.f1(m, atVar));
        inflate.findViewById(2131362098).setOnClickListener(new a.eo(m, atVar, switchOptionItemView, switchOptionItemView2));
        return atVar.o();
    }

    public final boolean c(a.mc1 mc1Var, java.lang.String str) {
        java.lang.String H2 = a.yi1.H2(mc1Var.c, '/');
        java.lang.String H22 = a.yi1.H2(str, '/');
        if (!a.wv.e(H22, H2)) {
            if (!a.yi1.B2(H22, H2 + "/")) {
                return true;
            }
        }
        a.cp cpVar = com.omarea.Scene.c;
        a.ai1.o(this.f145a, 2131952406, "activity.getString(R.string.fs_dest_invalid)", 0);
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(final a.mc1 r12) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.f60.d(a.mc1):void");
    }
}
