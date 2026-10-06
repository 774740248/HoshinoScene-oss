package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class e71 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f117a;
    public final java.util.List b;

    public e71(java.util.ArrayList arrayList, java.util.ArrayList arrayList2) {
        this.f117a = arrayList;
        this.b = arrayList2;
    }

    public final boolean a(int i, int i2) {
        a.z61 z61Var = (a.z61) this.f117a.get(i);
        a.z61 z61Var2 = (a.z61) this.b.get(i2);
        if (z61Var.f726a) {
            return z61Var.i == z61Var2.i && z61Var.f == z61Var2.f && z61Var.g == z61Var2.g && z61Var.h == z61Var2.h && a.wv.e(z61Var.c, z61Var2.c) && a.wv.e(z61Var.d, z61Var2.d);
        }
        com.omarea.model.ProcessInfo processInfo = z61Var.e;
        a.wv.s(processInfo);
        com.omarea.model.ProcessInfo processInfo2 = z61Var2.e;
        a.wv.s(processInfo2);
        return a.wv.e(processInfo.name, processInfo2.name) && a.wv.e(processInfo.friendlyName, processInfo2.friendlyName) && processInfo.getCpu() == processInfo2.getCpu() && processInfo.res == processInfo2.res;
    }

    public final boolean b(int i, int i2) {
        a.z61 z61Var = (a.z61) this.f117a.get(i);
        a.z61 z61Var2 = (a.z61) this.b.get(i2);
        boolean z = z61Var.f726a;
        if (!z && !z61Var2.f726a) {
            com.omarea.model.ProcessInfo processInfo = z61Var.e;
            a.wv.s(processInfo);
            int i3 = processInfo.pid;
            com.omarea.model.ProcessInfo processInfo2 = z61Var2.e;
            a.wv.s(processInfo2);
            if (i3 != processInfo2.pid) {
                return false;
            }
        } else if (!z || !z61Var2.f726a || !a.wv.e(z61Var.b, z61Var2.b)) {
            return false;
        }
        return true;
    }

    public final java.lang.Integer c(int i, int i2) {
        a.z61 z61Var = (a.z61) this.f117a.get(i);
        a.z61 z61Var2 = (a.z61) this.b.get(i2);
        if (z61Var.f726a) {
            return (z61Var.i == z61Var2.i && (a.wv.e(z61Var.c, z61Var2.c) && a.wv.e(z61Var.d, z61Var2.d))) ? 1 : null;
        }
        com.omarea.model.ProcessInfo processInfo = z61Var.e;
        a.wv.s(processInfo);
        com.omarea.model.ProcessInfo processInfo2 = z61Var2.e;
        a.wv.s(processInfo2);
        return (a.wv.e(processInfo.name, processInfo2.name) && a.wv.e(processInfo.friendlyName, processInfo2.friendlyName)) ? 1 : null;
    }
}
