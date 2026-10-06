package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class jb0 extends a.ra0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f251a;

    public jb0(android.widget.EditText editText) {
        this.f251a = new java.lang.ref.WeakReference(editText);
    }

    @Override // a.ra0
    public final void a() {
        a.kb0.a((android.widget.EditText) this.f251a.get(), 1);
    }
}
