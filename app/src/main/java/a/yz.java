package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class yz implements java.io.FilenameFilter {

    public yz() {
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(java.io.File file, java.lang.String str) {
        return str != null && a.yi1.h2(str, ".sh", false);
    }
}
