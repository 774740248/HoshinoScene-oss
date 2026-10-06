package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class zg1 extends a.fh1 {
    public final /* synthetic */ java.util.List c;
    public final /* synthetic */ android.graphics.Matrix d;

    public zg1(java.util.ArrayList arrayList, android.graphics.Matrix matrix) {
        this.c = arrayList;
        this.d = matrix;
    }

    @Override // a.fh1
    public final void a(android.graphics.Matrix matrix, a.ug1 ug1Var, int i, android.graphics.Canvas canvas) {
        java.util.Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((a.fh1) it.next()).a(this.d, ug1Var, i, canvas);
        }
    }
}
