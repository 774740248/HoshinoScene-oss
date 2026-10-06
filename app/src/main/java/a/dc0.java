package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class dc0 {

    /* renamed from: a */
    public static final java.util.ArrayList f93a = new java.util.ArrayList();

    public static void a(a.kc0 kc0Var, java.util.HashMap hashMap) {
        java.util.ArrayList arrayList = f93a;
        if (arrayList.size() > 0) {
            java.util.Iterator it = new java.util.ArrayList(arrayList).iterator();
            while (it.hasNext()) {
                a.wr0 wr0Var = (a.wr0) it.next();
                try {
                    if (wr0Var.eventFilter(kc0Var)) {
                        if (wr0Var.isAsync()) {
                            new a.ja(wr0Var, kc0Var, hashMap).start();
                        } else {
                            wr0Var.onReceive(kc0Var, hashMap);
                        }
                    }
                } catch (java.lang.Exception e) {
                    android.util.Log.e("SceneEventBus", e.getMessage());
                }
            }
        }
    }

    public static void c(a.wr0 wr0Var) {
        a.wv.w(wr0Var, "eventReceiver");
        java.util.ArrayList arrayList = f93a;
        if (arrayList.contains(wr0Var)) {
            return;
        }
        arrayList.add(wr0Var);
        wr0Var.onSubscribe();
    }

    public static void d(a.wr0 wr0Var) {
        a.wv.w(wr0Var, "eventReceiver");
        java.util.ArrayList arrayList = f93a;
        if (arrayList.contains(wr0Var)) {
            arrayList.remove(wr0Var);
            wr0Var.onUnsubscribe();
        }
    }
}
