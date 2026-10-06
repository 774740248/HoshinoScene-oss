package androidx.lifecycle;
import a.ai1;
import a.bx0;
import a.ep;
import a.m60;
import a.mv0;
import a.uc1;
import a.vc1;
import a.w1;
import a.yc1;


/* loaded from: /tmp/jadx-10340276197810293799.dex */
public class b {
    public static final java.lang.Object j = new java.lang.Object();

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f755a;
    public final yc1 b = new yc1();
    public int c = 0;
    public boolean d;
    public volatile java.lang.Object e;
    public volatile java.lang.Object f;
    public int g;
    public boolean h;
    public boolean i;

    public b() {
        java.lang.Object obj = j;
        this.f = obj;
        this.e = obj;
        this.g = -1;
    }

    public static void a(java.lang.String str) {
        if (!ep.I1().E.I1()) {
            throw new java.lang.IllegalStateException(ai1.h("Cannot invoke ", str, " on a background thread"));
        }
    }

    public final void b(bx0 bx0Var) {
        if (bx0Var.d) {
            if (!bx0Var.e()) {
                bx0Var.b(false);
                return;
            }
            int i = bx0Var.e;
            int i2 = this.g;
            if (i >= i2) {
                return;
            }
            bx0Var.e = i2;
            w1 w1Var = bx0Var.c;
            java.lang.Object obj = this.e;
            w1Var.getClass();
            if (((mv0) obj) != null) {
                m60 m60Var = (m60) w1Var.d;
                if (m60Var.d0) {
                    android.view.View M = m60Var.M();
                    if (M.getParent() != null) {
                        throw new java.lang.IllegalStateException("DialogFragment can not be attached to a container view");
                    }
                    if (m60Var.h0 != null) {
                        if (android.util.Log.isLoggable("FragmentManager", 3)) {
                            android.util.Log.d("FragmentManager", "DialogFragment " + w1Var + " setting the content view on " + m60Var.h0);
                        }
                        m60Var.h0.setContentView(M);
                    }
                }
            }
        }
    }

    public final void c(bx0 bx0Var) {
        if (this.h) {
            this.i = true;
            return;
        }
        this.h = true;
        do {
            this.i = false;
            if (bx0Var != null) {
                b(bx0Var);
                bx0Var = null;
            } else {
                yc1 yc1Var = this.b;
                yc1Var.getClass();
                vc1 vc1Var = new vc1(yc1Var);
                yc1Var.e.put(vc1Var, java.lang.Boolean.FALSE);
                while (vc1Var.hasNext()) {
                    b((bx0) ((java.util.Map.Entry) vc1Var.next()).getValue());
                    if (this.i) {
                        break;
                    }
                }
            }
        } while (this.i);
        this.h = false;
    }

    public final void d(w1 w1Var) {
        java.lang.Object obj;
        a("observeForever");
        bx0 bx0Var = new bx0(this, w1Var);
        yc1 yc1Var = this.b;
        uc1 a2 = yc1Var.a(w1Var);
        if (a2 != null) {
            obj = a2.d;
        } else {
            uc1 uc1Var = new uc1(w1Var, bx0Var);
            yc1Var.f++;
            uc1 uc1Var2 = yc1Var.d;
            if (uc1Var2 == null) {
                yc1Var.c = uc1Var;
                yc1Var.d = uc1Var;
            } else {
                uc1Var2.e = uc1Var;
                uc1Var.f = uc1Var2;
                yc1Var.d = uc1Var;
            }
            obj = null;
        }
        bx0 bx0Var2 = (bx0) obj;
        if ((LiveData.LifecycleBoundObserver) bx0Var2 instanceof androidx.lifecycle.LiveData.LifecycleBoundObserver) {
            throw new java.lang.IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (bx0Var2 != null) {
            return;
        }
        bx0Var.b(true);
    }

    public final void e(java.lang.Object obj) {
        a("setValue");
        this.g++;
        this.e = obj;
        c(null);
    }
}
