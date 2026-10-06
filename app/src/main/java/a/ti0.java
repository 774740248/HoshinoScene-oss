package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ti0 implements java.util.concurrent.Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f558a;
    public final /* synthetic */ java.lang.String b;
    public final /* synthetic */ android.content.Context c;
    public final /* synthetic */ a.ol d;
    public final /* synthetic */ int e;

    public /* synthetic */ ti0(java.lang.String str, android.content.Context context, a.ol olVar, int i, int i2) {
        this.f558a = i2;
        this.b = str;
        this.c = context;
        this.d = olVar;
        this.e = i;
    }

    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() {
        java.lang.String str = this.b;
        android.content.Context context = this.c;
        a.ol olVar = this.d;
        int i = this.e;
        int i2 = this.f558a;
        switch (i2) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                switch (i2) {
                    case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                        return a.wi0.a(str, context, olVar, i);
                    default:
                        try {
                            return a.wi0.a(str, context, olVar, i);
                        } catch (java.lang.Throwable unused) {
                            return new a.vi0(-3);
                        }
                }
            default:
                switch (i2) {
                    case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                        return a.wi0.a(str, context, olVar, i);
                    default:
                        try {
                            return a.wi0.a(str, context, olVar, i);
                        } catch (java.lang.Throwable unused2) {
                            return new a.vi0(-3);
                        }
                }
        }
    }
}
