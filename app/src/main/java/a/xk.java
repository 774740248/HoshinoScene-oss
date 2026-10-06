package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class xk implements a.ay0 {
    @Override // a.ay0
    public int a() {
        return 1073741823;
    }

    @Override // a.ay0
    public java.lang.String b() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }

    @Override // a.ay0
    public a.zx0 c(java.util.List list) {
        android.os.Looper mainLooper = android.os.Looper.getMainLooper();
        if (mainLooper != null) {
            return new a.cr0(a.dr0.a(mainLooper));
        }
        throw new java.lang.IllegalStateException("The main looper is not available");
    }
}
