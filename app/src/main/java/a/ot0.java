package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ot0 extends java.util.concurrent.CancellationException {
    public final transient a.nt0 c;

    public ot0(java.lang.String str, java.lang.Throwable th, a.nt0 nt0Var) {
        super(str);
        this.c = nt0Var;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj != this) {
            if (obj instanceof a.ot0) {
                a.ot0 ot0Var = (a.ot0) obj;
                if (!a.wv.e(ot0Var.getMessage(), getMessage()) || !a.wv.e(ot0Var.c, this.c) || !a.wv.e(ot0Var.getCause(), getCause())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.lang.Throwable
    public final java.lang.Throwable fillInStackTrace() {
        setStackTrace(new java.lang.StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        java.lang.String message = getMessage();
        a.wv.s(message);
        int hashCode = (this.c.hashCode() + (message.hashCode() * 31)) * 31;
        java.lang.Throwable cause = getCause();
        return hashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final java.lang.String toString() {
        return super.toString() + "; job=" + this.c;
    }
}
