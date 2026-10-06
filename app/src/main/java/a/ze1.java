package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ze1 extends a.qr0 {
    public final android.content.Context e;
    public final java.lang.String[] f;

    public ze1(a.p5 p5Var) {
        a.wv.w(p5Var, "context");
        this.e = p5Var;
        this.f = new java.lang.String[]{"random_id2", "user_name", "activate_v2_type", "CLOUD_PROFILE_VERSION", "CLOUD_PROFILE_BRANCH", "scene_profile_source", "daemon_build_time", "daemon_version_name"};
    }

    public static final java.util.LinkedHashMap m(a.ze1 ze1Var, java.lang.String str) {
        ze1Var.getClass();
        a.cp cpVar = com.omarea.Scene.c;
        java.util.Map<java.lang.String, ?> all = a.fs1.t().getSharedPreferences(str, 0).getAll();
        a.wv.v(all, "Scene.context.getSharedP…ODE_PRIVATE\n        ).all");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.util.Map.Entry<java.lang.String, ?> entry : all.entrySet()) {
            if (entry.getValue() != null && !a.op.K1(ze1Var.f, entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    public static java.lang.Object[] n(a.jt0 jt0Var) {
        int size = jt0Var.f269a.size();
        java.lang.Object[] objArr = new java.lang.Object[size];
        for (int i = 0; i < size; i++) {
            objArr[i] = jt0Var.a(i);
        }
        return objArr;
    }
}
