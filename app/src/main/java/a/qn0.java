package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public class qn0 extends a.nn0 {
    @Override // a.nn0
    public final void a(android.view.View view, java.lang.Object obj) {
        if (obj != null) {
            ((a.ln1) obj).b(view);
        }
    }

    @Override // a.nn0
    public final void b(java.lang.Object obj, java.util.ArrayList arrayList) {
        a.ln1 ln1Var = (a.ln1) obj;
        if (ln1Var == null) {
            return;
        }
        int i = 0;
        if (ln1Var instanceof a.qn1) {
            a.qn1 qn1Var = (a.qn1) ln1Var;
            int size = qn1Var.z.size();
            while (i < size) {
                b((i < 0 || i >= qn1Var.z.size()) ? null : (a.ln1) qn1Var.z.get(i), arrayList);
                i++;
            }
            return;
        }
        if (a.nn0.h(ln1Var.g) && a.nn0.h(null) && a.nn0.h(null) && a.nn0.h(ln1Var.h)) {
            int size2 = arrayList.size();
            while (i < size2) {
                ln1Var.b((android.view.View) arrayList.get(i));
                i++;
            }
        }
    }

    @Override // a.nn0
    public final void c(android.view.ViewGroup viewGroup, java.lang.Object obj) {
        a.on1.a(viewGroup, (a.ln1) obj);
    }

    @Override // a.nn0
    public final boolean e(java.lang.Object obj) {
        return obj instanceof a.ln1;
    }

    @Override // a.nn0
    public final java.lang.Object f(java.lang.Object obj) {
        if (obj != null) {
            return ((a.ln1) obj).clone();
        }
        return null;
    }

    @Override // a.nn0
    public final java.lang.Object i(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        a.ln1 ln1Var = (a.ln1) obj;
        a.ln1 ln1Var2 = (a.ln1) obj2;
        a.ln1 ln1Var3 = (a.ln1) obj3;
        if (ln1Var != null && ln1Var2 != null) {
            a.qn1 qn1Var = new a.qn1();
            qn1Var.H(ln1Var);
            qn1Var.H(ln1Var2);
            qn1Var.A = false;
            ln1Var = qn1Var;
        } else if (ln1Var == null) {
            ln1Var = ln1Var2 != null ? ln1Var2 : null;
        }
        if (ln1Var3 == null) {
            return ln1Var;
        }
        a.qn1 qn1Var2 = new a.qn1();
        if (ln1Var != null) {
            qn1Var2.H(ln1Var);
        }
        qn1Var2.H(ln1Var3);
        return qn1Var2;
    }

    @Override // a.nn0
    public final java.lang.Object j(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        a.qn1 qn1Var = new a.qn1();
        if (obj != null) {
            qn1Var.H((a.ln1) obj);
        }
        if (obj2 != null) {
            qn1Var.H((a.ln1) obj2);
        }
        if (obj3 != null) {
            qn1Var.H((a.ln1) obj3);
        }
        return qn1Var;
    }

    @Override // a.nn0
    public final void l(java.lang.Object obj, android.view.View view, java.util.ArrayList arrayList) {
        ((a.ln1) obj).a(new a.on0(view, arrayList));
    }

    @Override // a.nn0
    public final void m(java.lang.Object obj, java.lang.Object obj2, java.util.ArrayList arrayList, java.lang.Object obj3, java.util.ArrayList arrayList2, java.lang.Object obj4, java.util.ArrayList arrayList3) {
        ((a.ln1) obj).a(new a.pn0(this, obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, a.b20] */
    @Override // a.nn0
    public final void n(android.view.View view, java.lang.Object obj) {
        if (view != null) {
            a.nn0.g(view, new android.graphics.Rect());
            ((a.ln1) obj).A((b20) (new java.lang.Object()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, a.b20] */
    @Override // a.nn0
    public final void o(java.lang.Object obj, android.graphics.Rect rect) {
        if (obj != null) {
            ((a.ln1) obj).A((b20) (new java.lang.Object()));
        }
    }

    @Override // a.nn0
    public final void r(java.lang.Object obj, android.view.View view, java.util.ArrayList arrayList) {
        a.qn1 qn1Var = (a.qn1) obj;
        java.util.ArrayList arrayList2 = qn1Var.h;
        arrayList2.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            a.nn0.d((android.view.View) arrayList.get(i), arrayList2);
        }
        arrayList2.add(view);
        arrayList.add(view);
        b(qn1Var, arrayList);
    }

    @Override // a.nn0
    public final void s(java.lang.Object obj, java.util.ArrayList arrayList, java.util.ArrayList arrayList2) {
        a.qn1 qn1Var = (a.qn1) obj;
        if (qn1Var != null) {
            java.util.ArrayList arrayList3 = qn1Var.h;
            arrayList3.clear();
            arrayList3.addAll(arrayList2);
            u(qn1Var, arrayList, arrayList2);
        }
    }

    @Override // a.nn0
    public final java.lang.Object t(java.lang.Object obj) {
        if (obj == null) {
            return null;
        }
        a.qn1 qn1Var = new a.qn1();
        qn1Var.H((a.ln1) obj);
        return qn1Var;
    }

    public final void u(java.lang.Object obj, java.util.ArrayList arrayList, java.util.ArrayList arrayList2) {
        a.ln1 ln1Var = (a.ln1) obj;
        int i = 0;
        if (ln1Var instanceof a.qn1) {
            a.qn1 qn1Var = (a.qn1) ln1Var;
            int size = qn1Var.z.size();
            while (i < size) {
                u((i < 0 || i >= qn1Var.z.size()) ? null : (a.ln1) qn1Var.z.get(i), arrayList, arrayList2);
                i++;
            }
            return;
        }
        if (a.nn0.h(ln1Var.g) && a.nn0.h(null) && a.nn0.h(null)) {
            java.util.ArrayList arrayList3 = ln1Var.h;
            if (arrayList3.size() == arrayList.size() && arrayList3.containsAll(arrayList)) {
                int size2 = arrayList2 == null ? 0 : arrayList2.size();
                while (i < size2) {
                    ln1Var.b((android.view.View) arrayList2.get(i));
                    i++;
                }
                for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                    ln1Var.w((android.view.View) arrayList.get(size3));
                }
            }
        }
    }
}
