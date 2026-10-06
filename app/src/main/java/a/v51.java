package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public class v51 {

    public v51() {
    }

    public void a(java.lang.Throwable th, java.lang.Throwable th2) {
        a.wv.w(th, "cause");
        a.wv.w(th2, "exception");
        java.lang.reflect.Method method = a.u51.f577a;
        if (method != null) {
            method.invoke(th, th2);
        }
    }

    public a.z81 b() {
        return new a.fd0();
    }
}
