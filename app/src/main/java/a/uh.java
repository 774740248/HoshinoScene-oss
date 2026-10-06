package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class uh extends a.vh {

    /* renamed from: a, reason: collision with root package name */
    public final com.omarea.model.PowerStatAVG f594a;

    public uh(com.omarea.model.PowerStatAVG powerStatAVG) {
        a.wv.w(powerStatAVG, "data");
        this.f594a = powerStatAVG;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a.uh) && a.wv.e(this.f594a, ((a.uh) obj).f594a);
    }

    public final int hashCode() {
        return this.f594a.hashCode();
    }

    public final java.lang.String toString() {
        return "Item(data=" + this.f594a + ")";
    }
}
