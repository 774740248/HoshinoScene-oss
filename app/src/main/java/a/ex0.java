package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ex0 extends a.cx0 {

    /* renamed from: a, reason: collision with root package name */
    public final a.mv0 f141a;

    public ex0(a.mv0 mv0Var, a.er1 er1Var) {
        this.f141a = mv0Var;
        a.nk nkVar = new a.nk(er1Var, a.dx0.e, 0);
        java.lang.String canonicalName = a.dx0.class.getCanonicalName();
        if (canonicalName == null) {
            throw new java.lang.IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
    }

    public final java.lang.String toString() {
        int lastIndexOf;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)));
        sb.append(" in ");
        a.mv0 mv0Var = this.f141a;
        if (mv0Var == null) {
            sb.append("null");
        } else {
            java.lang.String simpleName = mv0Var.getClass().getSimpleName();
            if (simpleName.length() <= 0 && (lastIndexOf = (simpleName = mv0Var.getClass().getName()).lastIndexOf(46)) > 0) {
                simpleName = simpleName.substring(lastIndexOf + 1);
            }
            sb.append(simpleName);
            sb.append('{');
            sb.append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(mv0Var)));
        }
        sb.append("}}");
        return sb.toString();
    }
}
