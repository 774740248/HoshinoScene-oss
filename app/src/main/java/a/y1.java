package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class y1 implements a.y60 {
    public final /* synthetic */ int c;
    public final /* synthetic */ java.lang.Object d;
    public final /* synthetic */ java.lang.Object e;
    public final /* synthetic */ java.lang.Object f;

    public /* synthetic */ y1(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i) {
        this.c = i;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
    }

    /* JADX WARN: Type inference failed for: r12v22, types: [java.lang.Object, a.ma1] */
    @Override // a.y60
    public final void a(java.util.ArrayList arrayList, boolean[] zArr) {
        java.lang.String str;
        int i = this.c;
        int i2 = 0;
        java.lang.Object obj = this.f;
        java.lang.Object obj2 = this.d;
        java.lang.Object obj3 = this.e;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                com.omarea.krscript.model.PickerNode pickerNode = (com.omarea.krscript.model.PickerNode) obj2;
                if (pickerNode.getMultiple()) {
                    a.a2 a2Var = (a.a2) obj3;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList(a.op.J1(arrayList, 10));
                    java.util.Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((a.ng1) it.next()).c);
                    }
                    java.lang.String j2 = a.qv.j2(arrayList2, pickerNode.getSeparator(), null, null, null, 62);
                    java.lang.Runnable runnable = (java.lang.Runnable) obj;
                    int i3 = a.a2.d0;
                    a2Var.getClass();
                    java.lang.String setState = pickerNode.getSetState();
                    if (setState == null) {
                        return;
                    }
                    a2Var.T(pickerNode, setState, runnable, new a.z1(j2));
                    return;
                }
                if (arrayList.size() <= 0) {
                    a.a2 a2Var2 = (a.a2) obj3;
                    android.widget.Toast.makeText(a2Var2.f(), a2Var2.m(2131953208), 0).show();
                    return;
                }
                a.a2 a2Var3 = (a.a2) obj3;
                if (arrayList.size() > 0) {
                    str = ((a.ng1) arrayList.get(0)).c;
                } else {
                    str = "";
                }
                java.lang.String str2 = str;
                java.lang.Runnable runnable2 = (java.lang.Runnable) obj;
                int i4 = a.a2.d0;
                a2Var3.getClass();
                java.lang.String setState2 = pickerNode.getSetState();
                if (setState2 == null) {
                    return;
                }
                a2Var3.T(pickerNode, setState2, runnable2, new a.z1(str2));
                return;
            case 1:
                a.o41 o41Var = (a.o41) obj2;
                int length = zArr.length;
                while (true) {
                    if (i2 >= length) {
                        i2 = -1;
                    } else if (true != zArr[i2]) {
                        i2++;
                    }
                }
                o41Var.e = i2;
                o41Var.a((android.widget.TextView) obj3, (android.widget.TextView) obj);
                return;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.util.ArrayList arrayList4 = (java.util.ArrayList) obj3;
                int length2 = zArr.length;
                int i5 = 0;
                while (i2 < length2) {
                    int i6 = i5 + 1;
                    if (!zArr[i2]) {
                        java.lang.String str3 = ((a.ng1) arrayList4.get(i5)).c;
                        a.wv.s(str3);
                        arrayList3.add(java.lang.Integer.valueOf(java.lang.Integer.parseInt(str3)));
                    }
                    i2++;
                    i5 = i6;
                }
                a.gu0[] gu0VarArr = com.omarea.vtools.activities.ActivityFpsSession.I0;
                com.omarea.ui.fps.CpuLoadsView t = ((com.omarea.vtools.activities.ActivityFpsSession) obj2).t();
                java.util.ArrayList arrayList5 = (java.util.ArrayList) obj;
                arrayList5.clear();
                arrayList5.addAll(arrayList3);
                if (t.g < 1) {
                    return;
                }
                a.wv.M0(a.wv.b(a.z80.f728a), null, new a.pz(t, null), 3);
                return;
            case 3:
                if (!arrayList.isEmpty()) {
                    java.lang.String str4 = ((java.lang.String[]) obj)[((java.util.ArrayList) obj2).indexOf(a.qv.e2(arrayList))];
                    a.wv.v(str4, "values.get(this)");
                    ((a.v40) obj3).b(str4);
                    return;
                }
                return;
            default:
                if (!arrayList.isEmpty()) {
                    ma1 obj4 = new ma1();
                    /* TODO: jadx type unresolved, defaulted to Object */
                    java.util.ArrayList arrayList6 = (java.util.ArrayList) obj3;
                    int length3 = zArr.length;
                    int i7 = 0;
                    while (i2 < length3) {
                        int i8 = i7 + 1;
                        if (zArr[i2]) {
                            obj4.c = arrayList6.get(i7);
                        }
                        i2++;
                        i7 = i8;
                    }
                    new a.nk((a.p5) obj2, new a.un0((java.lang.String) obj, obj4)).O();
                    return;
                }
                return;
        }
    }
}
