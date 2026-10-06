package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class se extends a.qe {

    public se() {
    }

    @Override // a.qe
    public final android.content.Intent a(androidx.activity.ComponentActivity componentActivity, java.lang.Object obj) {
        android.content.Intent intent = (android.content.Intent) obj;
        a.wv.w(componentActivity, "context");
        a.wv.w(intent, "input");
        return intent;
    }

    @Override // a.qe
    public final java.lang.Object c(android.content.Intent intent, int i) {
        return new a.ne(intent, i);
    }
}
