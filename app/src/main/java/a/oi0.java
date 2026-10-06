package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final /* synthetic */ class oi0 implements java.util.Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f409a;

    public /* synthetic */ oi0(int i) {
        this.f409a = i;
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        int i;
        java.lang.Integer valueOf;
        switch (this.f409a) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i2 = 0; i2 < bArr.length; i2++) {
                    byte b = bArr[i2];
                    byte b2 = bArr2[i2];
                    if (b != b2) {
                        return b - b2;
                    }
                }
                return 0;
            case 1:
                com.omarea.model.AppInfo appInfo = (com.omarea.model.AppInfo) obj;
                com.omarea.model.AppInfo appInfo2 = (com.omarea.model.AppInfo) obj2;
                int i3 = a.rg.h;
                java.lang.String obj3 = appInfo.stateTags.toString();
                java.lang.String obj4 = appInfo2.stateTags.toString();
                if (obj3.compareTo(obj4) < 0) {
                    return -1;
                }
                if (obj3.compareTo(obj4) <= 0) {
                    java.lang.String str = appInfo.getPackageName().toString();
                    java.lang.String str2 = appInfo2.getPackageName().toString();
                    if (str.compareTo(str2) < 0) {
                        return -1;
                    }
                    if (str.compareTo(str2) <= 0) {
                        return 0;
                    }
                }
                return 1;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                com.omarea.model.AppInfo appInfo3 = (com.omarea.model.AppInfo) obj;
                com.omarea.model.AppInfo appInfo4 = (com.omarea.model.AppInfo) obj2;
                int i4 = a.nh.j;
                java.lang.String obj5 = appInfo3.stateTags.toString();
                java.lang.String obj6 = appInfo4.stateTags.toString();
                if (obj5.compareTo(obj6) < 0) {
                    return -1;
                }
                if (obj5.compareTo(obj6) <= 0) {
                    java.lang.String str3 = appInfo3.getPackageName().toString();
                    java.lang.String str4 = appInfo4.getPackageName().toString();
                    if (str3.compareTo(str4) < 0) {
                        return -1;
                    }
                    if (str3.compareTo(str4) <= 0) {
                        return 0;
                    }
                }
                return 1;
            case 3:
                a.r71 r71Var = (a.r71) obj;
                a.r71 r71Var2 = (a.r71) obj2;
                int compare = java.lang.Float.compare(r71Var2.c, r71Var.c);
                return compare != 0 ? compare : r71Var.f485a.compareTo(r71Var2.f485a);
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_READ_ERROR /* 4 */:
                a.r71 r71Var3 = (a.r71) obj;
                a.r71 r71Var4 = (a.r71) obj2;
                long j = r71Var4.d;
                long j2 = r71Var3.d;
                i = j >= j2 ? j == j2 ? 0 : 1 : -1;
                return i != 0 ? i : r71Var3.f485a.compareTo(r71Var4.f485a);
            case 5:
                a.r71 r71Var5 = (a.r71) obj;
                a.r71 r71Var6 = (a.r71) obj2;
                java.util.Iterator it = r71Var5.b.iterator();
                java.lang.Integer num = null;
                if (it.hasNext()) {
                    valueOf = java.lang.Integer.valueOf(((com.omarea.model.ProcessInfo) it.next()).pid);
                    while (it.hasNext()) {
                        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(((com.omarea.model.ProcessInfo) it.next()).pid);
                        if (valueOf.compareTo(valueOf2) < 0) {
                            valueOf = valueOf2;
                        }
                    }
                } else {
                    valueOf = null;
                }
                int intValue = valueOf != null ? valueOf.intValue() : 0;
                java.util.Iterator it2 = r71Var6.b.iterator();
                if (it2.hasNext()) {
                    num = java.lang.Integer.valueOf(((com.omarea.model.ProcessInfo) it2.next()).pid);
                    while (it2.hasNext()) {
                        java.lang.Integer valueOf3 = java.lang.Integer.valueOf(((com.omarea.model.ProcessInfo) it2.next()).pid);
                        if (num.compareTo(valueOf3) < 0) {
                            num = valueOf3;
                        }
                    }
                }
                int C = a.wv.C(num != null ? num.intValue() : 0, intValue);
                return C != 0 ? C : r71Var5.f485a.compareTo(r71Var6.f485a);
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_WRITE /* 6 */:
                a.r71 r71Var7 = (a.r71) obj;
                a.r71 r71Var8 = (a.r71) obj2;
                java.util.HashMap hashMap = a.q71.f;
                int C2 = a.wv.C(a.gy.U(r71Var7.f485a), a.gy.U(r71Var8.f485a));
                return C2 != 0 ? C2 : r71Var7.f485a.compareTo(r71Var8.f485a);
            case 7:
                return ((a.r71) obj).f485a.compareTo(((a.r71) obj2).f485a);
            case 8:
                com.omarea.model.ProcessInfo processInfo = (com.omarea.model.ProcessInfo) obj;
                com.omarea.model.ProcessInfo processInfo2 = (com.omarea.model.ProcessInfo) obj2;
                int compare2 = java.lang.Float.compare(processInfo2.getCpu(), processInfo.getCpu());
                return compare2 != 0 ? compare2 : a.wv.C(processInfo.pid, processInfo2.pid);
            case 9:
                com.omarea.model.ProcessInfo processInfo3 = (com.omarea.model.ProcessInfo) obj;
                com.omarea.model.ProcessInfo processInfo4 = (com.omarea.model.ProcessInfo) obj2;
                long j3 = processInfo4.res;
                long j4 = processInfo3.res;
                i = j3 >= j4 ? j3 == j4 ? 0 : 1 : -1;
                return i != 0 ? i : a.wv.C(processInfo3.pid, processInfo4.pid);
            case 10:
                return a.wv.C(((com.omarea.model.ProcessInfo) obj2).pid, ((com.omarea.model.ProcessInfo) obj).pid);
            case 11:
                com.omarea.model.ProcessInfo processInfo5 = (com.omarea.model.ProcessInfo) obj;
                com.omarea.model.ProcessInfo processInfo6 = (com.omarea.model.ProcessInfo) obj2;
                java.util.HashMap hashMap2 = a.q71.f;
                int C3 = a.wv.C(a.gy.U(processInfo5.user), a.gy.U(processInfo6.user));
                return C3 != 0 ? C3 : a.wv.C(processInfo5.pid, processInfo6.pid);
            default:
                return a.wv.C(((com.omarea.model.ProcessInfo) obj).pid, ((com.omarea.model.ProcessInfo) obj2).pid);
        }
    }
}
