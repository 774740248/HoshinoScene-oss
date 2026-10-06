package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class bw {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f55a;
    public final a.ws b;
    public final a.bp0 c;
    public final java.lang.Object d;
    public final java.lang.Throwable e;

    public bw(java.lang.Object obj, a.ws wsVar, a.bp0 bp0Var, java.lang.Object obj2, java.lang.Throwable th) {
        this.f55a = obj;
        this.b = wsVar;
        this.c = bp0Var;
        this.d = obj2;
        this.e = th;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Throwable] */
    public static a.bw a(a.bw bwVar, a.ws wsVar, java.util.concurrent.CancellationException cancellationException, int i) {
        java.lang.Throwable obj = (i & 1) != 0 ? bwVar.f55a : null;
        if ((i & 2) != 0) {
            wsVar = bwVar.b;
        }
        a.ws wsVar2 = wsVar;
        a.bp0 bp0Var = (i & 4) != 0 ? bwVar.c : null;
        java.lang.Throwable obj2 = (i & 8) != 0 ? bwVar.d : null;
        java.util.concurrent.CancellationException cancellationException2 = cancellationException;
        if ((i & 16) != 0) {
            cancellationException2 = (java.util.concurrent.CancellationException) bwVar.e;
        }
        bwVar.getClass();
        return new a.bw(obj, wsVar2, bp0Var, obj2, cancellationException2);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a.bw)) {
            return false;
        }
        a.bw bwVar = (a.bw) obj;
        return a.wv.e(this.f55a, bwVar.f55a) && a.wv.e(this.b, bwVar.b) && a.wv.e(this.c, bwVar.c) && a.wv.e(this.d, bwVar.d) && a.wv.e(this.e, bwVar.e);
    }

    public final int hashCode() {
        java.lang.Object obj = this.f55a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        a.ws wsVar = this.b;
        int hashCode2 = (hashCode + (wsVar == null ? 0 : wsVar.hashCode())) * 31;
        a.bp0 bp0Var = this.c;
        int hashCode3 = (hashCode2 + (bp0Var == null ? 0 : bp0Var.hashCode())) * 31;
        java.lang.Object obj2 = this.d;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        java.lang.Throwable th = this.e;
        return hashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "CompletedContinuation(result=" + this.f55a + ", cancelHandler=" + this.b + ", onCancellation=" + this.c + ", idempotentResume=" + this.d + ", cancelCause=" + this.e + ')';
    }

    public /* synthetic */ bw(java.lang.Object obj, a.ws wsVar, a.bp0 bp0Var, java.util.concurrent.CancellationException cancellationException, int i) {
        this(obj, (i & 2) != 0 ? null : wsVar, (i & 4) != 0 ? null : bp0Var, (java.lang.Object) null, (i & 16) != 0 ? null : cancellationException);
    }
}
