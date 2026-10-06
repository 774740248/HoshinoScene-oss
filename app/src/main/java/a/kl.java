package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class kl implements a.hd1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f296a = 1;
    public final java.lang.Object b;

    public kl(a.id1 id1Var) {
        a.wv.w(id1Var, "registry");
        this.b = new java.util.LinkedHashSet();
        id1Var.c("androidx.savedstate.Restarter", this);
    }

    @Override // a.hd1
    public final android.os.Bundle a() {
        int i = this.f296a;
        java.lang.Object obj = this.b;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                android.os.Bundle bundle = new android.os.Bundle();
                ((a.ml) obj).getDelegate().getClass();
                return bundle;
            default:
                android.os.Bundle bundle2 = new android.os.Bundle();
                bundle2.putStringArrayList("classes_to_restore", new java.util.ArrayList<>((java.util.Set) obj));
                return bundle2;
        }
    }

    public kl(a.ml mlVar) {
        this.b = mlVar;
    }
}
