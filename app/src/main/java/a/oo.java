package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final /* synthetic */ class oo implements java.io.FileFilter {
    @Override // java.io.FileFilter
    public final boolean accept(java.io.File file) {
        a.wv.v(file, "name");
        java.lang.String name = file.getName();
        a.wv.v(name, "name");
        java.lang.String lowerCase = a.yi1.D2(name, '.', "").toLowerCase(java.util.Locale.ROOT);
        a.wv.v(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return a.wv.e(lowerCase, "apk");
    }
}
