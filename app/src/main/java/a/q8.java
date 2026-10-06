package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class q8 extends a.uu0 implements a.bp0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ com.omarea.vtools.activities.ActivityFilesTreemap e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q8(com.omarea.vtools.activities.ActivityFilesTreemap activityFilesTreemap, int i) {
        super(1);
        this.d = i;
        this.e = activityFilesTreemap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object] */
    public final void a(java.lang.String str) {
        a.vn1 vn1Var;
        int i = this.d;
        com.omarea.vtools.activities.ActivityFilesTreemap activityFilesTreemap = this.e;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.wv.w(str, "path");
                java.lang.String name = new java.io.File(str).getName();
                if (name == null) {
                    name = "";
                }
                activityFilesTreemap.setTitle(name);
                ((com.omarea.ui.files.BreadcrumbView) activityFilesTreemap.d.a(com.omarea.vtools.activities.ActivityFilesTreemap.h[0])).setPath("/".concat(str));
                return;
            default:
                a.wv.w(str, "path");
                a.gu0[] gu0VarArr = com.omarea.vtools.activities.ActivityFilesTreemap.h;
                com.omarea.ui.TreemapView o = activityFilesTreemap.o();
                a.vn1 vn1Var2 = o.e;
                if (vn1Var2 == null) {
                    return;
                }
                java.util.List y2 = a.yi1.y2(str, new java.lang.String[]{"/"});
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj : y2) {
                    if (((java.lang.String) obj).length() > 0) {
                        arrayList.add(obj);
                    }
                }
                boolean isEmpty = arrayList.isEmpty();
                java.util.ArrayList arrayList2 = o.f;
                if (!isEmpty) {
                    int size = arrayList.size();
                    java.lang.String str2 = vn1Var2.f637a;
                    if (size != 1 || !a.wv.e(arrayList.get(0), str2)) {
                        if (a.wv.e(arrayList.get(0), str2)) {
                            java.util.ArrayList arrayList3 = new java.util.ArrayList();
                            int size2 = arrayList.size();
                            for (int i2 = 1; i2 < size2; i2++) {
                                java.util.ArrayList arrayList4 = vn1Var2.c;
                                if (arrayList4 == null) {
                                    return;
                                }
                                java.util.Iterator it = arrayList4.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        vn1Var = (vn1) it.next();
                                        if (a.wv.e(((a.vn1) vn1Var).f637a, arrayList.get(i2))) {
                                        }
                                    } else {
                                        vn1Var = null;
                                    }
                                }
                                vn1Var2 = vn1Var;
                                if (vn1Var2 == null) {
                                    return;
                                }
                                arrayList3.add(vn1Var2);
                            }
                            arrayList2.clear();
                            arrayList2.addAll(arrayList3);
                            o.i++;
                            a.bp0 bp0Var = o.A;
                            if (bp0Var != null) {
                                bp0Var.i(o.getCurrentPath());
                            }
                            o.invalidate();
                            a.vn1 a2 = o.a();
                            if (a2 != null) {
                                o.b(a2);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
                if (!arrayList2.isEmpty()) {
                    arrayList2.clear();
                    o.i++;
                    a.bp0 bp0Var2 = o.A;
                    if (bp0Var2 != null) {
                        bp0Var2.i(o.getCurrentPath());
                    }
                    o.invalidate();
                    return;
                }
                return;
        }
    }

    @Override // a.bp0
    public final java.lang.Object i(java.lang.Object obj) {
        a.no1 no1Var = a.no1.f387a;
        switch (this.d) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a((java.lang.String) obj);
                return no1Var;
            case 1:
                a((java.lang.String) obj);
                return no1Var;
            default:
                a.vn1 vn1Var = (a.vn1) obj;
                a.wv.w(vn1Var, "node");
                java.lang.Object obj2 = vn1Var.e;
                a.mc1 mc1Var = obj2 instanceof a.mc1 ? (a.mc1) obj2 : null;
                if (mc1Var != null) {
                    com.omarea.vtools.activities.ActivityFilesTreemap activityFilesTreemap = this.e;
                    new a.f60(activityFilesTreemap, new a.cd1(22, activityFilesTreemap), null).d(mc1Var);
                }
                return no1Var;
        }
    }
}
