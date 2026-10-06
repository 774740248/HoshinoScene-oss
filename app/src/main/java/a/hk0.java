package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class hk0 implements a.hd1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a.kk0 f208a;

    public hk0(a.kk0 kk0Var) {
        this.f208a = kk0Var;
    }

    @Override // a.hd1
    public final android.os.Bundle a() {
        android.os.Bundle bundle = new android.os.Bundle();
        a.kk0 kk0Var = this.f208a;
        kk0Var.markFragmentsCreated();
        kk0Var.mFragmentLifecycleRegistry.e(a.ev0.ON_STOP);
        a.cm0 N = kk0Var.mFragments.f666a.Z.N();
        if (N != null) {
            bundle.putParcelable("android:support:fragments", N);
        }
        return bundle;
    }
}
