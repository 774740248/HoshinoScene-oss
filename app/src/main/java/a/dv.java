package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class dv {

    /* renamed from: a, reason: collision with root package name */
    public final int f108a;
    public final java.lang.reflect.Method b;

    public dv(int i, java.lang.reflect.Method method) {
        this.f108a = i;
        this.b = method;
        method.setAccessible(true);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a.dv)) {
            return false;
        }
        a.dv dvVar = (a.dv) obj;
        return this.f108a == dvVar.f108a && this.b.getName().equals(dvVar.b.getName());
    }

    public final int hashCode() {
        return this.b.getName().hashCode() + (this.f108a * 31);
    }
}
