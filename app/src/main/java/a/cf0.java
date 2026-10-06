package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class cf0 implements a.wr0 {
    public final /* synthetic */ int c;
    public final /* synthetic */ java.lang.Object d;

    public /* synthetic */ cf0(int i, java.lang.Object obj) {
        this.c = i;
        this.d = obj;
    }

    @Override // a.wr0
    public final boolean eventFilter(a.kc0 kc0Var) {
        switch (this.c) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                return kc0Var == a.kc0.w;
            default:
                return kc0Var == a.kc0.l || kc0Var == a.kc0.k || kc0Var == a.kc0.j || kc0Var == a.kc0.s || kc0Var == a.kc0.c || kc0Var == a.kc0.d;
        }
    }

    @Override // a.wr0
    public final boolean isAsync() {
        return false;
    }

    @Override // a.wr0
    public final void onReceive(a.kc0 kc0Var, java.util.HashMap hashMap) {
        java.lang.String str;
        int i = this.c;
        java.lang.Object obj = this.d;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                com.omarea.ui.fps.FrameTimeView2 frameTimeView2 = (com.omarea.ui.fps.FrameTimeView2) ((a.x01) obj).d;
                java.lang.Object obj2 = hashMap != null ? hashMap.get("fps") : null;
                a.wv.t(obj2, "null cannot be cast to non-null type kotlin.Double");
                double doubleValue = ((java.lang.Double) obj2).doubleValue();
                java.lang.Object obj3 = hashMap.get("data");
                a.wv.t(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Int>");
                java.lang.Integer[] numArr = (java.lang.Integer[]) obj3;
                frameTimeView2.getClass();
                frameTimeView2.d = java.lang.Double.valueOf(doubleValue);
                java.util.ArrayList arrayList = new java.util.ArrayList(numArr.length);
                for (java.lang.Integer num : numArr) {
                    arrayList.add(java.lang.Double.valueOf(num.intValue()));
                }
                frameTimeView2.c = new java.util.ArrayList(arrayList);
                frameTimeView2.f = null;
                a.wv.M0(a.wv.b(a.z80.f728a), null, new a.oo0(frameTimeView2, null), 3);
                return;
            default:
                a.ag0 ag0Var = (a.ag0) obj;
                if (ag0Var.c <= 0 || kc0Var == a.kc0.k || kc0Var == a.kc0.j || kc0Var == a.kc0.c || kc0Var == a.kc0.d || kc0Var == a.kc0.s || a.oq0.j.length() <= 0 || (str = ag0Var.g) == null || str.length() == 0 || a.yi1.B2(a.oq0.j, str) || a.yi1.B2(str, a.oq0.j)) {
                    return;
                }
                a.cp cpVar = com.omarea.Scene.c;
                a.fs1.L(new a.xa(ag0Var, 23, kc0Var));
                return;
        }
    }

    @Override // a.wr0
    public final void onSubscribe() {
    }

    @Override // a.wr0
    public final void onUnsubscribe() {
    }
}
