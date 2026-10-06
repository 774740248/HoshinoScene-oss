package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class wc1 extends a.xc1 implements java.util.Iterator {
    public a.uc1 c;
    public a.uc1 d;

    @Override // a.xc1
    public final void a(a.uc1 uc1Var) {
        a.uc1 uc1Var2;
        a.uc1 uc1Var3;
        a.uc1 uc1Var4 = null;
        if (this.c == uc1Var && uc1Var == this.d) {
            this.d = null;
            this.c = null;
        }
        a.uc1 uc1Var5 = this.c;
        if (uc1Var5 == uc1Var) {
            switch (((a.tc1) this).e) {
                case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                    uc1Var3 = uc1Var5.f;
                    break;
                default:
                    uc1Var3 = uc1Var5.e;
                    break;
            }
            this.c = uc1Var3;
        }
        a.uc1 uc1Var6 = this.d;
        if (uc1Var6 == uc1Var) {
            a.uc1 uc1Var7 = this.c;
            if (uc1Var6 != uc1Var7 && uc1Var7 != null) {
                switch (((a.tc1) this).e) {
                    case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                        uc1Var2 = uc1Var6.e;
                        break;
                    default:
                        uc1Var2 = uc1Var6.f;
                        break;
                }
                uc1Var4 = uc1Var2;
            }
            this.d = uc1Var4;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.d != null;
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        a.uc1 uc1Var;
        a.uc1 uc1Var2 = this.d;
        a.uc1 uc1Var3 = this.c;
        if (uc1Var2 != uc1Var3 && uc1Var3 != null) {
            switch (((a.tc1) this).e) {
                case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                    uc1Var = uc1Var2.e;
                    break;
                default:
                    uc1Var = uc1Var2.f;
                    break;
            }
        } else {
            uc1Var = null;
        }
        this.d = uc1Var;
        return uc1Var2;
    }
}
