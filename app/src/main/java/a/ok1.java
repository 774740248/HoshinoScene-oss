package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ok1 implements java.lang.Iterable {
    public final java.util.ArrayList c = new java.util.ArrayList();
    public final android.content.Context d;

    public ok1(android.content.Context context) {
        this.d = context;
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
        return this.c.iterator();
    }
}
