package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class bd implements a.y60 {
    public final /* synthetic */ int c;
    public final /* synthetic */ com.omarea.vtools.activities.ActivityPowerBench d;

    public /* synthetic */ bd(com.omarea.vtools.activities.ActivityPowerBench activityPowerBench, int i) {
        this.c = i;
        this.d = activityPowerBench;
    }

    @Override // a.y60
    public final void a(java.util.ArrayList arrayList, boolean[] zArr) {
        int i = this.c;
        com.omarea.vtools.activities.ActivityPowerBench activityPowerBench = this.d;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.ng1 ng1Var = (a.ng1) a.qv.e2(arrayList);
                a.gu0[] gu0VarArr = com.omarea.vtools.activities.ActivityPowerBench.U;
                a.i61 F = activityPowerBench.F();
                java.lang.String str = ng1Var.c;
                a.wv.s(str);
                java.util.ArrayList b = F.b(java.lang.Long.parseLong(str));
                java.lang.Object obj = ng1Var.e;
                a.wv.t(obj, "null cannot be cast to non-null type com.omarea.store.PowerBenchStore.StatSession");
                com.omarea.vtools.activities.ActivityPowerBench.o(activityPowerBench, (a.h61) obj, b);
                return;
            default:
                a.qs0 qs0Var = new a.qs0(0, zArr.length - 1, 1);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                a.rs0 it = qs0Var.iterator();
                while (it.e) {
                    java.lang.Object next = it.next();
                    if (zArr[((java.lang.Number) next).intValue()]) {
                        arrayList2.add(next);
                    }
                }
                if (arrayList2.isEmpty()) {
                    android.widget.Toast.makeText(activityPowerBench.getContext(), activityPowerBench.getString(2131953145), 0).show();
                    return;
                }
                activityPowerBench.S = zArr;
                activityPowerBench.u().setProgress(arrayList.size());
                activityPowerBench.H();
                return;
        }
    }
}
