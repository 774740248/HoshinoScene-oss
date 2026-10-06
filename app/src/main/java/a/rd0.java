package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class rd0 {

    /* renamed from: a, reason: collision with root package name */
    public final a.pd0 f492a;
    public final a.sd0 b;
    public final java.lang.String c;
    public final a.qd0 d;
    public final a.od0 e;
    public final java.lang.String f;
    public final long g;
    public final long h;
    public final long i;

    public rd0(a.pd0 pd0Var, a.sd0 sd0Var, java.lang.String str, a.qd0 qd0Var, a.od0 od0Var, java.lang.String str2, long j, long j2, long j3) {
        this.f492a = pd0Var;
        this.b = sd0Var;
        this.c = str;
        this.d = qd0Var;
        this.e = od0Var;
        this.f = str2;
        this.g = j;
        this.h = j2;
        this.i = j3;
    }

    public final float a() {
        long j = this.g;
        if (j > 0) {
            return ((float) this.h) / ((float) j);
        }
        return 0.0f;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a.rd0)) {
            return false;
        }
        a.rd0 rd0Var = (a.rd0) obj;
        return this.f492a == rd0Var.f492a && this.b == rd0Var.b && a.wv.e(this.c, rd0Var.c) && this.d == rd0Var.d && this.e == rd0Var.e && a.wv.e(this.f, rd0Var.f) && this.g == rd0Var.g && this.h == rd0Var.h && this.i == rd0Var.i;
    }

    public final int hashCode() {
        return java.lang.Long.hashCode(this.i) + ((java.lang.Long.hashCode(this.h) + ((java.lang.Long.hashCode(this.g) + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f492a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final java.lang.String toString() {
        return "FastShareStatus(mode=" + this.f492a + ", transport=" + this.b + ", projectId=" + this.c + ", phase=" + this.d + ", exit=" + this.e + ", err=" + this.f + ", totalSize=" + this.g + ", transSize=" + this.h + ", speed=" + this.i + ")";
    }
}
