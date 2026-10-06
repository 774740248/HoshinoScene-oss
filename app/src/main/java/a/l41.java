package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class l41 implements a.y60 {
    public final /* synthetic */ int c;
    public final /* synthetic */ java.lang.Object d;
    public final /* synthetic */ android.view.KeyEvent.Callback e;
    public final /* synthetic */ java.lang.Object f;
    public final /* synthetic */ java.lang.Object g;

    public /* synthetic */ l41(java.lang.Object obj, android.view.KeyEvent.Callback callback, java.lang.Object obj2, java.lang.Object obj3, int i) {
        this.c = i;
        this.d = obj;
        this.e = callback;
        this.f = obj2;
        this.g = obj3;
    }

    @Override // a.y60
    public final void a(java.util.ArrayList arrayList, boolean[] zArr) {
        int i = this.c;
        java.lang.Object obj = this.g;
        android.view.KeyEvent.Callback callback = this.e;
        java.lang.Object obj2 = this.f;
        int i2 = 0;
        java.lang.Object obj3 = this.d;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.mm mmVar = (a.mm) obj3;
                int length = zArr.length;
                int i3 = 0;
                while (i2 < length) {
                    ((boolean[]) mmVar.d)[i3] = zArr[i2];
                    i2++;
                    i3++;
                }
                mmVar.j((android.widget.TextView) callback, (android.widget.TextView) obj2, (android.widget.TextView) obj);
                return;
            default:
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.util.ArrayList arrayList3 = (java.util.ArrayList) obj3;
                a.wv.v(arrayList3, "clusters");
                int i4 = 0;
                for (java.lang.Object obj4 : arrayList3) {
                    int i5 = i4 + 1;
                    java.lang.Object obj5 = null;
                    if (i4 < 0) {
                        a.b20.p1();
                        throw null;
                    }
                    java.lang.String[] strArr = (java.lang.String[]) obj4;
                    java.util.Iterator it = arrayList.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            java.lang.Object next = it.next();
                            a.wv.v(strArr, "it");
                            if (a.op.K1(strArr, ((a.ng1) next).c)) {
                                obj5 = next;
                            }
                        }
                    }
                    if (obj5 == null) {
                        a.wv.v(strArr, "it");
                        for (java.lang.String str : strArr) {
                            a.wv.v(str, "it");
                            arrayList2.add(java.lang.Integer.valueOf(java.lang.Integer.parseInt(str)));
                        }
                    }
                    i4 = i5;
                }
                java.util.ArrayList arrayList4 = (java.util.ArrayList) obj2;
                int length2 = zArr.length;
                int i6 = 0;
                while (i2 < length2) {
                    int i7 = i6 + 1;
                    if (!zArr[i2]) {
                        java.lang.String str2 = ((a.ng1) arrayList4.get(i6)).c;
                        a.wv.s(str2);
                        arrayList2.add(java.lang.Integer.valueOf(java.lang.Integer.parseInt(str2)));
                    }
                    i2++;
                    i6 = i7;
                }
                com.omarea.vtools.activities.ActivityFpsSession activityFpsSession = (com.omarea.vtools.activities.ActivityFpsSession) callback;
                a.gu0[] gu0VarArr = com.omarea.vtools.activities.ActivityFpsSession.I0;
                com.omarea.ui.fps.CpuFrequencyView r = activityFpsSession.r();
                java.util.ArrayList arrayList5 = (java.util.ArrayList) obj;
                arrayList5.clear();
                arrayList5.addAll(arrayList2);
                r.a();
                com.omarea.ui.fps.CpuFrequencyStat s = activityFpsSession.s();
                arrayList5.clear();
                arrayList5.addAll(arrayList2);
                s.a();
                return;
        }
    }
}
