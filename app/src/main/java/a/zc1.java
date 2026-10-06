package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final /* synthetic */ class zc1 implements a.hd1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f732a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ zc1(int i, java.lang.Object obj) {
        this.f732a = i;
        this.b = obj;
    }

    @Override // a.hd1
    public final android.os.Bundle a() {
        int i = this.f732a;
        java.lang.Object obj = this.b;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                return a.ad1.a((a.ad1) obj);
            case 1:
                return a.ad1.a((a.ad1) obj);
            default:
                return androidx.activity.ComponentActivity.e((androidx.activity.ComponentActivity) obj);
        }
    }
}
