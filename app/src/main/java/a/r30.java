package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class r30 extends java.lang.RuntimeException {
    public final transient a.ty c;

    public r30(a.ty tyVar) {
        this.c = tyVar;
    }

    @Override // java.lang.Throwable
    public final java.lang.Throwable fillInStackTrace() {
        setStackTrace(new java.lang.StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final java.lang.String getLocalizedMessage() {
        return this.c.toString();
    }
}
