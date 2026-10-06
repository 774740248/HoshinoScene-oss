package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public interface cr1 {
    default a.zq1 b(java.lang.Class cls) {
        throw new java.lang.UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
    }

    default a.zq1 d(java.lang.Class cls, a.r11 r11Var) {
        return b(cls);
    }
}
