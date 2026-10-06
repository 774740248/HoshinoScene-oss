package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class sb1 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.res.Resources f524a;
    public final android.content.res.Resources.Theme b;

    public sb1(android.content.res.Resources resources, android.content.res.Resources.Theme theme) {
        this.f524a = resources;
        this.b = theme;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.sb1.class != obj.getClass()) {
            return false;
        }
        a.sb1 sb1Var = (a.sb1) obj;
        return this.f524a.equals(sb1Var.f524a) && a.x21.a(this.b, sb1Var.b);
    }

    public final int hashCode() {
        return a.x21.b(this.f524a, this.b);
    }
}
