package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class cc0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f66a;

    public cc0(android.app.Activity activity) {
        a.wv.w(activity, "ctx");
        this.f66a = activity;
    }

    public static final java.lang.String a(a.cc0 cc0Var, int i) {
        java.lang.String string = cc0Var.f66a.getString(i);
        a.wv.v(string, "ctx.getString(id)");
        return string;
    }
}
