package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ie0 extends a.he0 {
    public boolean b;
    public java.io.File[] c;
    public int d;
    public boolean e;
    public final /* synthetic */ a.le0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ie0(a.le0 le0Var, java.io.File file) {
        super(file);
        a.wv.w(file, "rootDir");
        this.f = le0Var;
    }

    @Override // a.me0
    public final java.io.File a() {
        boolean z = this.e;
        java.io.File file = this.f347a;
        a.le0 le0Var = this.f;
        if (!z && this.c == null) {
            le0Var.f.getClass();
            java.io.File[] listFiles = file.listFiles();
            this.c = listFiles;
            if (listFiles == null) {
                le0Var.f.getClass();
                this.e = true;
            }
        }
        java.io.File[] fileArr = this.c;
        if (fileArr != null) {
            int i = this.d;
            a.wv.s(fileArr);
            if (i < fileArr.length) {
                java.io.File[] fileArr2 = this.c;
                a.wv.s(fileArr2);
                int i2 = this.d;
                this.d = i2 + 1;
                return fileArr2[i2];
            }
        }
        if (this.b) {
            le0Var.f.getClass();
            return null;
        }
        this.b = true;
        return file;
    }
}
