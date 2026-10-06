package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class yb1 extends a.iq {
    public yb1(a.ey eyVar) {
        super(eyVar);
        if (eyVar != null && eyVar.h() != a.ob0.c) {
            throw new java.lang.IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext".toString());
        }
    }

    @Override // a.ey
    public final a.ty h() {
        return a.ob0.c;
    }
}
