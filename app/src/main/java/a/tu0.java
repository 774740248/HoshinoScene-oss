package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class tu0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f565a;

    public tu0(com.omarea.vtools.activities.ActivitySwap activitySwap) {
        this.f565a = activitySwap;
    }

    public static final java.lang.String a(a.tu0 tu0Var, int i) {
        java.lang.String string = tu0Var.f565a.getString(i);
        a.wv.v(string, "ctx.getString(id)");
        return string;
    }
}
