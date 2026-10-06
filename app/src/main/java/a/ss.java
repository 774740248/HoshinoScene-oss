package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class ss implements a.au0, java.io.Serializable {
    public transient a.au0 c;
    public final java.lang.Object d;
    public final java.lang.Class e;
    public final java.lang.String f;
    public final java.lang.String g;
    public final boolean h;

    public ss(java.lang.Object obj, java.lang.Class cls, java.lang.String str, java.lang.String str2, boolean z) {
        this.d = obj;
        this.e = cls;
        this.f = str;
        this.g = str2;
        this.h = z;
    }

    public abstract a.au0 a();

    public final a.av c() {
        a.av bvVar;
        java.lang.Class cls = this.e;
        if (cls == null) {
            return null;
        }
        if (this.h) {
            a.na1.f375a.getClass();
            bvVar = new a.o31(cls);
        } else {
            a.na1.f375a.getClass();
            bvVar = new a.bv(cls);
        }
        return bvVar;
    }
}
