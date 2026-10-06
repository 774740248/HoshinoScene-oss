package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class fq1 {
    public static java.lang.String[] a(android.view.View view) {
        return view.getReceiveContentMimeTypes();
    }

    public static a.sx b(android.view.View view, a.sx sxVar) {
        android.view.ContentInfo j = sxVar.f543a.j();
        java.util.Objects.requireNonNull(j);
        android.view.ContentInfo f = a.nx.f(j);
        android.view.ContentInfo performReceiveContent = view.performReceiveContent(f);
        if (performReceiveContent == null) {
            return null;
        }
        return performReceiveContent == f ? sxVar : new a.sx(new a.vu0(performReceiveContent));
    }

    public static void c(android.view.View view, java.lang.String[] strArr, a.i31 i31Var) {
        if (i31Var == null) {
            view.setOnReceiveContentListener(strArr, null);
        } else {
            view.setOnReceiveContentListener(strArr, new a.gq1(i31Var));
        }
    }
}
