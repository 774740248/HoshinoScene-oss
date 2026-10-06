package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class mi0 {

    /* renamed from: a, reason: collision with root package name */
    public static final a.vj1 f353a = new a.vj1(a.fz.f);

    public static void a(a.p5 p5Var, a.bp0 bp0Var) {
        a.b70 b70Var = new a.b70(p5Var.getThemeMode().f442a, c(), false, new a.w1(0, bp0Var), 0);
        b70Var.t0 = "收藏的路径";
        b70Var.Y();
        if (b70Var.v0) {
            b70Var.v0 = false;
            android.view.View view = b70Var.H;
            if (view != null) {
                view.post(new a.fw(11, b70Var));
            }
        }
        a.li0 li0Var = a.li0.d;
        b70Var.x0 = li0Var;
        a.aj ajVar = (a.aj) a.b20.T(b70Var.s0);
        if (ajVar != null) {
            ajVar.k = li0Var;
        }
        b70Var.V(p5Var.getSupportFragmentManager(), "PathFavorite");
    }

    public static android.content.SharedPreferences b() {
        java.lang.Object a2 = f353a.a();
        a.wv.v(a2, "<get-spf>(...)");
        return (android.content.SharedPreferences) a2;
    }

    public static java.util.List c() {
        java.util.Set<java.util.Map.Entry<java.lang.String, ?>> entrySet = b().getAll().entrySet();
        if (!entrySet.isEmpty()) {
            java.util.ArrayList arrayList = new java.util.ArrayList(a.op.J1(entrySet, 10));
            java.util.Iterator it = entrySet.iterator();
            while (it.hasNext()) {
                java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                java.lang.String valueOf = java.lang.String.valueOf(entry.getValue());
                java.lang.Object key = entry.getKey();
                a.wv.v(key, "it.key");
                a.ng1 ng1Var = new a.ng1(valueOf, (java.lang.String) key);
                ng1Var.b = (java.lang.CharSequence) entry.getKey();
                arrayList.add(ng1Var);
            }
            return arrayList;
        }
        android.content.SharedPreferences.Editor edit = b().edit();
        java.lang.String str = a.pe0.f434a;
        edit.putString(str, "外部存储");
        edit.putString(str + "/DCIM", "DCIM");
        edit.putString(str + "/Pictures", "Pictures");
        edit.putString(a.pe0.b, "Download");
        edit.putString(str + "/Documents", "Documents");
        edit.putString("/storage/emulated/0/Android/data/com.tencent.mobileqq/Tencent/QQfile_recv", "QQ 收到的文件");
        edit.putString("/storage/emulated/0/Android/data/com.tencent.tmgp.sgame/files/Replay", "王者荣耀 回放文件");
        edit.putString("/", "根目录");
        edit.apply();
        return c();
    }
}
