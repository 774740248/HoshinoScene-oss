package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class de0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f96a;
    public final java.util.HashMap b = new java.util.HashMap();

    public de0(java.lang.String str) {
        this.f96a = str;
    }

    public final java.io.File a(android.net.Uri uri) {
        java.lang.String encodedPath = uri.getEncodedPath();
        int indexOf = encodedPath.indexOf(47, 1);
        java.lang.String decode = android.net.Uri.decode(encodedPath.substring(1, indexOf));
        java.lang.String decode2 = android.net.Uri.decode(encodedPath.substring(indexOf + 1));
        java.io.File file = (java.io.File) this.b.get(decode);
        if (file == null) {
            throw new java.lang.IllegalArgumentException("Unable to find configured root for " + uri);
        }
        java.io.File file2 = new java.io.File(file, decode2);
        try {
            java.io.File canonicalFile = file2.getCanonicalFile();
            if (canonicalFile.getPath().startsWith(file.getPath())) {
                return canonicalFile;
            }
            throw new java.lang.SecurityException("Resolved path jumped beyond configured root");
        } catch (java.io.IOException unused) {
            throw new java.lang.IllegalArgumentException("Failed to resolve canonical path for " + file2);
        }
    }
}
