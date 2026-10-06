package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ew0 extends a.lw0 {
    public final boolean g;
    public final java.util.ArrayList h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ew0(android.content.Context context, boolean z, com.omarea.krscript.model.GroupNode groupNode) {
        super(context, z ? 2131558592 : 2131558591, groupNode);
        a.wv.w(context, "context");
        this.g = z;
        this.h = new java.util.ArrayList();
        c(groupNode.getTitle());
    }

    public final boolean e(java.lang.String str) {
        java.util.Iterator it = this.h.iterator();
        while (it.hasNext()) {
            a.lw0 lw0Var = (a.lw0) it.next();
            if ((lw0Var instanceof a.dw0) && lw0Var.b.getKey().equals(str)) {
                a.dw0 dw0Var = (a.dw0) lw0Var;
                a.s31 s31Var = dw0Var.g;
                if (s31Var != null) {
                    s31Var.a(dw0Var);
                }
                return true;
            }
            if ((lw0Var instanceof a.ew0) && ((a.ew0) lw0Var).e(str)) {
                return true;
            }
        }
        return false;
    }

    public final void f() {
        java.util.Iterator it = this.h.iterator();
        while (it.hasNext()) {
            a.lw0 lw0Var = (a.lw0) it.next();
            if (lw0Var instanceof a.ew0) {
                ((a.ew0) lw0Var).f();
            } else {
                lw0Var.d();
            }
        }
    }

    public final void g(java.lang.String[] strArr) {
        for (java.lang.String str : strArr) {
            if (str.equals(this.b.getKey())) {
                f();
            } else {
                java.util.Iterator it = this.h.iterator();
                while (it.hasNext()) {
                    a.lw0 lw0Var = (a.lw0) it.next();
                    if (lw0Var instanceof a.ew0) {
                        ((a.ew0) lw0Var).g(strArr);
                    } else if (lw0Var.b.getKey().equals(str)) {
                        lw0Var.d();
                    }
                }
            }
        }
    }
}
