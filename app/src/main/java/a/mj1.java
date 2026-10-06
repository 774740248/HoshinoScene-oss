package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class mj1 extends a.uu0 implements a.qo0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ a.pj1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mj1(a.pj1 pj1Var, int i) {
        super(0);
        this.d = i;
        this.e = pj1Var;
    }

    public final java.lang.String a() {
        int i = this.d;
        a.pj1 pj1Var = this.e;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.gy.h("/cache/force_compact.log");
                java.lang.String str = a.pe0.f434a;
                return a.pe0.j(pj1Var.f439a, "addin/force_compact.sh", "addin/force_compact.sh");
            default:
                java.lang.String str2 = a.pe0.f434a;
                return a.pe0.j(pj1Var.f439a, "addin/swap_control.sh", "addin/swap_control.sh");
        }
    }

    @Override // a.qo0
    public final java.lang.Object b() {
        java.util.List list;
        int i = this.d;
        a.pj1 pj1Var = this.e;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                return a();
            case 1:
                java.lang.String str = pj1Var.f;
                a.wv.w(str, "path");
                boolean z = true;
                if (!new java.io.File(str).exists()) {
                    a.q10 q10Var = a.q10.f457a;
                    java.lang.String L = a.q10.L("path-basic-info", str, 10000L);
                    z = a.yi1.B2(L, "dir") || a.yi1.B2(L, "file");
                }
                return java.lang.Boolean.valueOf(z);
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                return a();
            default:
                pj1Var.getClass();
                java.util.ArrayList b = a.pj1.b();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.Iterator it = b.iterator();
                while (it.hasNext()) {
                    java.lang.Object next = it.next();
                    if (a.yi1.g2((java.lang.String) next, "zram")) {
                        arrayList.add(next);
                    }
                }
                java.util.ArrayList arrayList2 = new java.util.ArrayList(a.op.J1(arrayList, 10));
                java.util.Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    java.lang.String str2 = (java.lang.String) it2.next();
                    java.lang.String substring = str2.substring(a.yi1.q2(str2, "/", 6));
                    a.wv.v(substring, "this as java.lang.String).substring(startIndex)");
                    java.util.regex.Pattern compile = java.util.regex.Pattern.compile(" +");
                    a.wv.v(compile, "compile(pattern)");
                    a.yi1.w2(0);
                    java.util.regex.Matcher matcher = compile.matcher(substring);
                    if (matcher.find()) {
                        java.util.ArrayList arrayList3 = new java.util.ArrayList(10);
                        int i2 = 0;
                        do {
                            arrayList3.add(substring.subSequence(i2, matcher.start()).toString());
                            i2 = matcher.end();
                        } while (matcher.find());
                        arrayList3.add(substring.subSequence(i2, substring.length()).toString());
                        list = arrayList3;
                    } else {
                        list = a.b20.y0(substring.toString());
                    }
                    arrayList2.add((java.lang.String) a.qv.e2(a.yi1.y2((java.lang.CharSequence) a.qv.e2(list), new java.lang.String[]{"\\"})));
                }
                return (java.lang.String[]) arrayList2.toArray(new java.lang.String[0]);
        }
    }
}
