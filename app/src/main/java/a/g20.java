package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class g20 extends a.f20 {
    @Override // a.fa0
    public final android.content.pm.Signature[] s(android.content.pm.PackageManager packageManager, java.lang.String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }
}
