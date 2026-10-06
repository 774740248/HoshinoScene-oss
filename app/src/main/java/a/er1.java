package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class er1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.LinkedHashMap f132a = new java.util.LinkedHashMap();

    public final void a() {
        for (a.zq1 zq1Var : (Iterable<a.zq1>) this.f132a.values()) {
            zq1Var.c = true;
            java.util.HashMap hashMap = zq1Var.f742a;
            if (hashMap != null) {
                synchronized (hashMap) {
                    try {
                        java.util.Iterator it = zq1Var.f742a.values().iterator();
                        while (it.hasNext()) {
                            a.zq1.a(it.next());
                        }
                    } finally {
                    }
                }
            }
            java.util.LinkedHashSet linkedHashSet = zq1Var.b;
            if (linkedHashSet != null) {
                synchronized (linkedHashSet) {
                    try {
                        java.util.Iterator it2 = zq1Var.b.iterator();
                        while (it2.hasNext()) {
                            a.zq1.a((java.io.Closeable) it2.next());
                        }
                    } finally {
                    }
                }
            }
            zq1Var.b();
        }
        this.f132a.clear();
    }
}
