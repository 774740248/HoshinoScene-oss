package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class w60 {

    /* renamed from: a, reason: collision with root package name */
    public final a.v60 f654a;
    public final android.widget.TextView b;

    public w60(a.v60 v60Var, android.widget.TextView textView) {
        this.f654a = v60Var;
        this.b = textView;
    }

    public final void a() {
        try {
            this.b.post(new a.fw(10, this));
        } catch (java.lang.Exception unused) {
        }
    }
}
