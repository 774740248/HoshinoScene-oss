package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class ln1 implements java.lang.Cloneable {
    public static final int[] w = {2, 1, 3, 4};
    public static final a.fa0 x = new a.fa0(29);
    public static final java.lang.ThreadLocal y = new java.lang.ThreadLocal();
    public java.util.ArrayList m;
    public java.util.ArrayList n;
    public a.b20 u;
    public final java.lang.String c = getClass().getName();
    public long d = -1;
    public long e = -1;
    public android.animation.TimeInterpolator f = null;
    public final java.util.ArrayList g = new java.util.ArrayList();
    public final java.util.ArrayList h = new java.util.ArrayList();
    public a.ej1 i = new a.ej1(5);
    public a.ej1 j = new a.ej1(5);
    public a.qn1 k = null;
    public final int[] l = w;
    public final java.util.ArrayList o = new java.util.ArrayList();
    public int p = 0;
    public boolean q = false;
    public boolean r = false;
    public java.util.ArrayList s = null;
    public java.util.ArrayList t = new java.util.ArrayList();
    public a.fa0 v = x;

    public static void c(a.ej1 ej1Var, android.view.View view, a.sn1 sn1Var) {
        ((a.kp) ej1Var.c).put(view, sn1Var);
        int id = view.getId();
        if (id >= 0) {
            if (((android.util.SparseArray) ej1Var.d).indexOfKey(id) >= 0) {
                ((android.util.SparseArray) ej1Var.d).put(id, null);
            } else {
                ((android.util.SparseArray) ej1Var.d).put(id, view);
            }
        }
        java.util.WeakHashMap weakHashMap = a.jq1.f264a;
        java.lang.String k = a.xp1.k(view);
        if (k != null) {
            if (((a.kp) ej1Var.f).containsKey(k)) {
                ((a.kp) ej1Var.f).put(k, null);
            } else {
                ((a.kp) ej1Var.f).put(k, view);
            }
        }
        if (view.getParent() instanceof android.widget.ListView) {
            android.widget.ListView listView = (android.widget.ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                a.sx0 sx0Var = (a.sx0) ej1Var.e;
                if (sx0Var.c) {
                    sx0Var.c();
                }
                if (a.wv.m(sx0Var.d, sx0Var.f, itemIdAtPosition) < 0) {
                    a.rp1.r(view, true);
                    ((a.sx0) ej1Var.e).e(itemIdAtPosition, view);
                    return;
                }
                android.view.View view2 = (android.view.View) ((a.sx0) ej1Var.e).d(itemIdAtPosition, null);
                if (view2 != null) {
                    a.rp1.r(view2, false);
                    ((a.sx0) ej1Var.e).e(itemIdAtPosition, null);
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [a.rh1, java.lang.Object, a.kp] */
    public static a.kp o() {
        java.lang.ThreadLocal threadLocal = y;
        a.kp kpVar = (a.kp) threadLocal.get();
        if (kpVar != null) {
            return kpVar;
        }
        a.rh1 rh1Var = new a.rh1();
        threadLocal.set(rh1Var);
        return rh1Var;
    }

    public static boolean t(a.sn1 sn1Var, a.sn1 sn1Var2, java.lang.String str) {
        jn1 obj = (jn1) sn1Var.f532a.get(str);
        java.lang.Object obj2 = sn1Var2.f532a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public void A(a.b20 b20Var) {
        this.u = b20Var;
    }

    public void B(android.animation.TimeInterpolator timeInterpolator) {
        this.f = timeInterpolator;
    }

    public void C(a.fa0 fa0Var) {
        if (fa0Var == null) {
            this.v = x;
        } else {
            this.v = fa0Var;
        }
    }

    public void D() {
    }

    public void E(long j) {
        this.d = j;
    }

    public final void F() {
        if (this.p == 0) {
            java.util.ArrayList arrayList = this.s;
            if (arrayList != null && arrayList.size() > 0) {
                java.util.ArrayList arrayList2 = (java.util.ArrayList) this.s.clone();
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    ((a.kn1) arrayList2.get(i)).b();
                }
            }
            this.r = false;
        }
        this.p++;
    }

    public java.lang.String G(java.lang.String str) {
        java.lang.String str2 = str + getClass().getSimpleName() + "@" + java.lang.Integer.toHexString(hashCode()) + ": ";
        if (this.e != -1) {
            str2 = str2 + "dur(" + this.e + ") ";
        }
        if (this.d != -1) {
            str2 = str2 + "dly(" + this.d + ") ";
        }
        if (this.f != null) {
            str2 = str2 + "interp(" + this.f + ") ";
        }
        java.util.ArrayList arrayList = this.g;
        int size = arrayList.size();
        java.util.ArrayList arrayList2 = this.h;
        if (size <= 0 && arrayList2.size() <= 0) {
            return str2;
        }
        java.lang.String e = a.ii1.e(str2, "tgts(");
        if (arrayList.size() > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                if (i > 0) {
                    e = a.ii1.e(e, ", ");
                }
                e = e + arrayList.get(i);
            }
        }
        if (arrayList2.size() > 0) {
            for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                if (i2 > 0) {
                    e = a.ii1.e(e, ", ");
                }
                e = e + arrayList2.get(i2);
            }
        }
        return a.ii1.e(e, ")");
    }

    public void a(a.kn1 kn1Var) {
        if (this.s == null) {
            this.s = new java.util.ArrayList();
        }
        this.s.add(kn1Var);
    }

    public void b(android.view.View view) {
        this.h.add(view);
    }

    public abstract void d(a.sn1 sn1Var);

    public final void e(android.view.View view, boolean z) {
        if (view == null) {
            return;
        }
        view.getId();
        if (view.getParent() instanceof android.view.ViewGroup) {
            a.sn1 sn1Var = new a.sn1(view);
            if (z) {
                g(sn1Var);
            } else {
                d(sn1Var);
            }
            sn1Var.c.add(this);
            f(sn1Var);
            if (z) {
                c(this.i, view, sn1Var);
            } else {
                c(this.j, view, sn1Var);
            }
        }
        if (view instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                e(viewGroup.getChildAt(i), z);
            }
        }
    }

    public void f(a.sn1 sn1Var) {
    }

    public abstract void g(a.sn1 sn1Var);

    public final void h(android.view.ViewGroup viewGroup, boolean z) {
        i(z);
        java.util.ArrayList arrayList = this.g;
        int size = arrayList.size();
        java.util.ArrayList arrayList2 = this.h;
        if (size <= 0 && arrayList2.size() <= 0) {
            e(viewGroup, z);
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            android.view.View findViewById = viewGroup.findViewById(((java.lang.Integer) arrayList.get(i)).intValue());
            if (findViewById != null) {
                a.sn1 sn1Var = new a.sn1(findViewById);
                if (z) {
                    g(sn1Var);
                } else {
                    d(sn1Var);
                }
                sn1Var.c.add(this);
                f(sn1Var);
                if (z) {
                    c(this.i, findViewById, sn1Var);
                } else {
                    c(this.j, findViewById, sn1Var);
                }
            }
        }
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            android.view.View view = (android.view.View) arrayList2.get(i2);
            a.sn1 sn1Var2 = new a.sn1(view);
            if (z) {
                g(sn1Var2);
            } else {
                d(sn1Var2);
            }
            sn1Var2.c.add(this);
            f(sn1Var2);
            if (z) {
                c(this.i, view, sn1Var2);
            } else {
                c(this.j, view, sn1Var2);
            }
        }
    }

    public final void i(boolean z) {
        if (z) {
            ((a.kp) this.i.c).clear();
            ((android.util.SparseArray) this.i.d).clear();
            ((a.sx0) this.i.e).a();
        } else {
            ((a.kp) this.j.c).clear();
            ((android.util.SparseArray) this.j.d).clear();
            ((a.sx0) this.j.e).a();
        }
    }

    @Override // 
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public a.ln1 clone() {
        try {
            a.ln1 ln1Var = (a.ln1) super.clone();
            ln1Var.t = new java.util.ArrayList();
            ln1Var.i = new a.ej1(5);
            ln1Var.j = new a.ej1(5);
            ln1Var.m = null;
            ln1Var.n = null;
            return ln1Var;
        } catch (java.lang.CloneNotSupportedException unused) {
            return null;
        }
    }

    public android.animation.Animator k(android.view.ViewGroup viewGroup, a.sn1 sn1Var, a.sn1 sn1Var2) {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, a.jn1] */
    public void l(android.view.ViewGroup viewGroup, a.ej1 ej1Var, a.ej1 ej1Var2, java.util.ArrayList arrayList, java.util.ArrayList arrayList2) {
        android.animation.Animator k;
        int i;
        android.view.View view;
        a.sn1 sn1Var;
        android.animation.Animator animator;
        a.kp o = o();
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            a.sn1 sn1Var2 = (a.sn1) arrayList.get(i2);
            a.sn1 sn1Var3 = (a.sn1) arrayList2.get(i2);
            a.sn1 sn1Var4 = null;
            if (sn1Var2 != null && !sn1Var2.c.contains(this)) {
                sn1Var2 = null;
            }
            if (sn1Var3 != null && !sn1Var3.c.contains(this)) {
                sn1Var3 = null;
            }
            if (!(sn1Var2 == null && sn1Var3 == null) && ((sn1Var2 == null || sn1Var3 == null || r(sn1Var2, sn1Var3)) && (k = k(viewGroup, sn1Var2, sn1Var3)) != null)) {
                java.lang.String str = this.c;
                if (sn1Var3 != null) {
                    java.lang.String[] p = p();
                    view = sn1Var3.b;
                    if (p != null && p.length > 0) {
                        sn1Var = new a.sn1(view);
                        a.sn1 sn1Var5 = (a.sn1) ((a.kp) ej1Var2.c).getOrDefault(view, null);
                        i = size;
                        if (sn1Var5 != null) {
                            int i3 = 0;
                            while (i3 < p.length) {
                                java.util.HashMap hashMap = sn1Var.f532a;
                                java.lang.String str2 = p[i3];
                                hashMap.put(str2, sn1Var5.f532a.get(str2));
                                i3++;
                                p = p;
                            }
                        }
                        int i4 = o.e;
                        for (int i5 = 0; i5 < i4; i5++) {
                            animator = null;
                            a.jn1 jn1Var = (a.jn1) o.getOrDefault((android.animation.Animator) o.h(i5), null);
                            if (jn1Var.c != null && jn1Var.f261a == view && jn1Var.b.equals(str) && jn1Var.c.equals(sn1Var)) {
                                break;
                            }
                        }
                    } else {
                        i = size;
                        sn1Var = null;
                    }
                    animator = k;
                    k = animator;
                    sn1Var4 = sn1Var;
                } else {
                    i = size;
                    view = sn1Var2.b;
                }
                if (k != null) {
                    a.ds1 ds1Var = a.yr1.f718a;
                    a.ft1 ft1Var = new a.ft1(viewGroup);
                    jn1 obj = new jn1();
                    /* TODO: jadx type unresolved, defaulted to Object */
                    obj.f261a = view;
                    obj.b = str;
                    obj.c = sn1Var4;
                    obj.d = ft1Var;
                    obj.e = this;
                    o.put(k, obj);
                    this.t.add(k);
                }
            } else {
                i = size;
            }
            i2++;
            size = i;
        }
        if (sparseIntArray.size() != 0) {
            for (int i6 = 0; i6 < sparseIntArray.size(); i6++) {
                android.animation.Animator animator2 = (android.animation.Animator) this.t.get(sparseIntArray.keyAt(i6));
                animator2.setStartDelay(animator2.getStartDelay() + (sparseIntArray.valueAt(i6) - Long.MAX_VALUE));
            }
        }
    }

    public final void m() {
        int i = this.p - 1;
        this.p = i;
        if (i == 0) {
            java.util.ArrayList arrayList = this.s;
            if (arrayList != null && arrayList.size() > 0) {
                java.util.ArrayList arrayList2 = (java.util.ArrayList) this.s.clone();
                int size = arrayList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((a.kn1) arrayList2.get(i2)).d(this);
                }
            }
            for (int i3 = 0; i3 < ((a.sx0) this.i.e).f(); i3++) {
                android.view.View view = (android.view.View) ((a.sx0) this.i.e).g(i3);
                if (view != null) {
                    java.util.WeakHashMap weakHashMap = a.jq1.f264a;
                    a.rp1.r(view, false);
                }
            }
            for (int i4 = 0; i4 < ((a.sx0) this.j.e).f(); i4++) {
                android.view.View view2 = (android.view.View) ((a.sx0) this.j.e).g(i4);
                if (view2 != null) {
                    java.util.WeakHashMap weakHashMap2 = a.jq1.f264a;
                    a.rp1.r(view2, false);
                }
            }
            this.r = true;
        }
    }

    public final a.sn1 n(android.view.View view, boolean z) {
        a.qn1 qn1Var = this.k;
        if (qn1Var != null) {
            return qn1Var.n(view, z);
        }
        java.util.ArrayList arrayList = z ? this.m : this.n;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            }
            a.sn1 sn1Var = (a.sn1) arrayList.get(i);
            if (sn1Var == null) {
                return null;
            }
            if (sn1Var.b == view) {
                break;
            }
            i++;
        }
        if (i >= 0) {
            return (a.sn1) (z ? this.n : this.m).get(i);
        }
        return null;
    }

    public java.lang.String[] p() {
        return null;
    }

    public final a.sn1 q(android.view.View view, boolean z) {
        a.qn1 qn1Var = this.k;
        if (qn1Var != null) {
            return qn1Var.q(view, z);
        }
        return (a.sn1) ((a.kp) (z ? this.i : this.j).c).getOrDefault(view, null);
    }

    public boolean r(a.sn1 sn1Var, a.sn1 sn1Var2) {
        if (sn1Var == null || sn1Var2 == null) {
            return false;
        }
        java.lang.String[] p = p();
        if (p == null) {
            java.util.Iterator it = sn1Var.f532a.keySet().iterator();
            while (it.hasNext()) {
                if (t(sn1Var, sn1Var2, (java.lang.String) it.next())) {
                }
            }
            return false;
        }
        for (java.lang.String str : p) {
            if (!t(sn1Var, sn1Var2, str)) {
            }
        }
        return false;
        return true;
    }

    public final boolean s(android.view.View view) {
        int id = view.getId();
        java.util.ArrayList arrayList = this.g;
        int size = arrayList.size();
        java.util.ArrayList arrayList2 = this.h;
        return (size == 0 && arrayList2.size() == 0) || arrayList.contains(java.lang.Integer.valueOf(id)) || arrayList2.contains(view);
    }

    public final java.lang.String toString() {
        return G("");
    }

    public void u(android.view.View view) {
        if (this.r) {
            return;
        }
        a.kp o = o();
        int i = o.e;
        a.ds1 ds1Var = a.yr1.f718a;
        android.view.WindowId windowId = view.getWindowId();
        for (int i2 = i - 1; i2 >= 0; i2--) {
            a.jn1 jn1Var = (a.jn1) o.j(i2);
            if (jn1Var.f261a != null) {
                a.gt1 gt1Var = jn1Var.d;
                if ((gt1Var instanceof a.ft1) && ((a.ft1) gt1Var).f159a.equals(windowId)) {
                    ((android.animation.Animator) o.h(i2)).pause();
                }
            }
        }
        java.util.ArrayList arrayList = this.s;
        if (arrayList != null && arrayList.size() > 0) {
            java.util.ArrayList arrayList2 = (java.util.ArrayList) this.s.clone();
            int size = arrayList2.size();
            for (int i3 = 0; i3 < size; i3++) {
                ((a.kn1) arrayList2.get(i3)).c();
            }
        }
        this.q = true;
    }

    public void v(a.kn1 kn1Var) {
        java.util.ArrayList arrayList = this.s;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(kn1Var);
        if (this.s.size() == 0) {
            this.s = null;
        }
    }

    public void w(android.view.View view) {
        this.h.remove(view);
    }

    public void x(android.view.ViewGroup viewGroup) {
        if (this.q) {
            if (!this.r) {
                a.kp o = o();
                int i = o.e;
                a.ds1 ds1Var = a.yr1.f718a;
                android.view.WindowId windowId = viewGroup.getWindowId();
                for (int i2 = i - 1; i2 >= 0; i2--) {
                    a.jn1 jn1Var = (a.jn1) o.j(i2);
                    if (jn1Var.f261a != null) {
                        a.gt1 gt1Var = jn1Var.d;
                        if ((gt1Var instanceof a.ft1) && ((a.ft1) gt1Var).f159a.equals(windowId)) {
                            ((android.animation.Animator) o.h(i2)).resume();
                        }
                    }
                }
                java.util.ArrayList arrayList = this.s;
                if (arrayList != null && arrayList.size() > 0) {
                    java.util.ArrayList arrayList2 = (java.util.ArrayList) this.s.clone();
                    int size = arrayList2.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        ((a.kn1) arrayList2.get(i3)).e();
                    }
                }
            }
            this.q = false;
        }
    }

    public void y() {
        F();
        a.kp o = o();
        java.util.Iterator it = this.t.iterator();
        while (it.hasNext()) {
            android.animation.Animator animator = (android.animation.Animator) it.next();
            if (o.containsKey(animator)) {
                F();
                if (animator != null) {
                    animator.addListener(new a.in1(this, o));
                    long j = this.e;
                    if (j >= 0) {
                        animator.setDuration(j);
                    }
                    long j2 = this.d;
                    if (j2 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j2);
                    }
                    android.animation.TimeInterpolator timeInterpolator = this.f;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new a.h1(1, this));
                    animator.start();
                }
            }
        }
        this.t.clear();
        m();
    }

    public void z(long j) {
        this.e = j;
    }
}
