package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ay implements a.cz {
    public final a.ty c;

    public ay(a.ty tyVar) {
        this.c = tyVar;
    }

    @Override // a.cz
    public final a.ty b() {
        return this.c;
    }

    public final java.lang.String toString() {
        return "CoroutineScope(coroutineContext=" + this.c + ')';
    }
}
