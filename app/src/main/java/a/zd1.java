package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class zd1 extends android.content.ContextWrapper {

    /* renamed from: a */
    public final a.vj1 f733a;

    public zd1(android.content.Context context) {
        super(context);
        this.f733a = new a.vj1(new a.cd1(1, this));
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final android.content.res.Resources getResources() {
        java.lang.Object a2 = this.f733a.a();
        a.wv.v(a2, "<get-r>(...)");
        return (android.content.res.Resources) a2;
    }
}
