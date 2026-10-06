package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class qe0 extends a.wv {
    public static boolean a2(java.io.File file) {
        a.le0 le0Var = new a.le0(new a.ne0(file));
        while (true) {
            boolean z = true;
            while (le0Var.hasNext()) {
                java.io.File file2 = (java.io.File) le0Var.next();
                if (file2.delete() || !file2.exists()) {
                    if (z) {
                        break;
                    }
                }
                z = false;
            }
            return z;
        }
    }
}
