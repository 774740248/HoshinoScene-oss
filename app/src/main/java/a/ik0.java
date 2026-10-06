package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ik0 implements a.g31 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a.kk0 f232a;

    public ik0(a.kk0 kk0Var) {
        this.f232a = kk0Var;
    }

    @Override // a.g31
    public final void a(android.content.Context context) {
        a.kk0 kk0Var = this.f232a;
        a.jk0 jk0Var = kk0Var.mFragments.f666a;
        jk0Var.Z.b(jk0Var, jk0Var, null);
        android.os.Bundle a2 = kk0Var.getSavedStateRegistry().a("android:support:fragments");
        if (a2 != null) {
            android.os.Parcelable parcelable = a2.getParcelable("android:support:fragments");
            a.jk0 jk0Var2 = kk0Var.mFragments.f666a;
            if (!(jk0Var2 instanceof a.fr1)) {
                throw new java.lang.IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
            }
            jk0Var2.Z.M(parcelable);
        }
    }
}
