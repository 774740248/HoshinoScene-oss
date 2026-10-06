package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class yo1 extends a.xo1 {

    /* renamed from: a, reason: collision with root package name */
    public a.s41[] f714a;
    public java.lang.String b;
    public int c;
    public final int d;

    public yo1() {
        this.f714a = null;
        this.c = 0;
    }

    public a.s41[] getPathData() {
        return this.f714a;
    }

    public java.lang.String getPathName() {
        return this.b;
    }

    public void setPathData(a.s41[] s41VarArr) {
        if (!a.wv.n(this.f714a, s41VarArr)) {
            this.f714a = a.wv.P(s41VarArr);
            return;
        }
        a.s41[] s41VarArr2 = this.f714a;
        for (int i = 0; i < s41VarArr.length; i++) {
            s41VarArr2[i].f515a = s41VarArr[i].f515a;
            int i2 = 0;
            while (true) {
                float[] fArr = s41VarArr[i].b;
                if (i2 < fArr.length) {
                    s41VarArr2[i].b[i2] = fArr[i2];
                    i2++;
                }
            }
        }
    }

    public yo1(a.yo1 yo1Var) {
        this.f714a = null;
        this.c = 0;
        this.b = yo1Var.b;
        this.d = yo1Var.d;
        this.f714a = a.wv.P(yo1Var.f714a);
    }
}
