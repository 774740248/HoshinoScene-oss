package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class r20 extends a.j91 {

    public r20() {
    }

    public static android.animation.TimeInterpolator s;
    public boolean g;
    public java.util.ArrayList h;
    public java.util.ArrayList i;
    public java.util.ArrayList j;
    public java.util.ArrayList k;
    public java.util.ArrayList l;
    public java.util.ArrayList m;
    public java.util.ArrayList n;
    public java.util.ArrayList o;
    public java.util.ArrayList p;
    public java.util.ArrayList q;
    public java.util.ArrayList r;

    public static void h(java.util.ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((a.da1) arrayList.get(size)).f91a.animate().cancel();
        }
    }

    /* JADX WARN: Type inference failed for: r12v4, types: [java.lang.Object, a.p20] */
    @Override // a.j91
    public final boolean a(a.da1 da1Var, a.da1 da1Var2, a.i91 i91Var, a.i91 i91Var2) {
        int i;
        int i2;
        int i3 = i91Var.f227a;
        int i4 = i91Var.b;
        if (da1Var2.s()) {
            int i5 = i91Var.f227a;
            i2 = i91Var.b;
            i = i5;
        } else {
            i = i91Var2.f227a;
            i2 = i91Var2.b;
        }
        if (da1Var == da1Var2) {
            return g(da1Var, i3, i4, i, i2);
        }
        android.view.View view = da1Var.f91a;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        l(da1Var);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        l(da1Var2);
        float f = -((int) ((i - i3) - translationX));
        android.view.View view2 = da1Var2.f91a;
        view2.setTranslationX(f);
        view2.setTranslationY(-((int) ((i2 - i4) - translationY)));
        view2.setAlpha(0.0f);
        java.util.ArrayList arrayList = this.k;
        a.p20 obj = new a.p20();
        obj.f429a = da1Var;
        obj.b = da1Var2;
        obj.c = i3;
        obj.d = i4;
        obj.e = i;
        obj.f = i2;
        arrayList.add(obj);
        return true;
    }

    @Override // a.j91
    public final void d(a.da1 da1Var) {
        android.view.View view = da1Var.f91a;
        view.animate().cancel();
        java.util.ArrayList arrayList = this.j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((a.q20) arrayList.get(size)).f459a == da1Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                c(da1Var);
                arrayList.remove(size);
            }
        }
        j(da1Var, this.k);
        if (this.h.remove(da1Var)) {
            view.setAlpha(1.0f);
            c(da1Var);
        }
        if (this.i.remove(da1Var)) {
            view.setAlpha(1.0f);
            c(da1Var);
        }
        java.util.ArrayList arrayList2 = this.n;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            java.util.ArrayList arrayList3 = (java.util.ArrayList) arrayList2.get(size2);
            j(da1Var, arrayList3);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        java.util.ArrayList arrayList4 = this.m;
        for (int size3 = arrayList4.size() - 1; size3 >= 0; size3--) {
            java.util.ArrayList arrayList5 = (java.util.ArrayList) arrayList4.get(size3);
            int size4 = arrayList5.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                if (((a.q20) arrayList5.get(size4)).f459a == da1Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    c(da1Var);
                    arrayList5.remove(size4);
                    if (arrayList5.isEmpty()) {
                        arrayList4.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        java.util.ArrayList arrayList6 = this.l;
        for (int size5 = arrayList6.size() - 1; size5 >= 0; size5--) {
            java.util.ArrayList arrayList7 = (java.util.ArrayList) arrayList6.get(size5);
            if (arrayList7.remove(da1Var)) {
                view.setAlpha(1.0f);
                c(da1Var);
                if (arrayList7.isEmpty()) {
                    arrayList6.remove(size5);
                }
            }
        }
        this.q.remove(da1Var);
        this.o.remove(da1Var);
        this.r.remove(da1Var);
        this.p.remove(da1Var);
        i();
    }

    @Override // a.j91
    public final void e() {
        java.util.ArrayList arrayList = this.j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            a.q20 q20Var = (a.q20) arrayList.get(size);
            android.view.View view = q20Var.f459a.f91a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            c(q20Var.f459a);
            arrayList.remove(size);
        }
        java.util.ArrayList arrayList2 = this.h;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            c((a.da1) arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        java.util.ArrayList arrayList3 = this.i;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            a.da1 da1Var = (a.da1) arrayList3.get(size3);
            da1Var.f91a.setAlpha(1.0f);
            c(da1Var);
            arrayList3.remove(size3);
        }
        java.util.ArrayList arrayList4 = this.k;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            a.p20 p20Var = (a.p20) arrayList4.get(size4);
            a.da1 da1Var2 = p20Var.f429a;
            if (da1Var2 != null) {
                k(p20Var, da1Var2);
            }
            a.da1 da1Var3 = p20Var.b;
            if (da1Var3 != null) {
                k(p20Var, da1Var3);
            }
        }
        arrayList4.clear();
        if (f()) {
            java.util.ArrayList arrayList5 = this.m;
            for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
                java.util.ArrayList arrayList6 = (java.util.ArrayList) arrayList5.get(size5);
                for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
                    a.q20 q20Var2 = (a.q20) arrayList6.get(size6);
                    android.view.View view2 = q20Var2.f459a.f91a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    c(q20Var2.f459a);
                    arrayList6.remove(size6);
                    if (arrayList6.isEmpty()) {
                        arrayList5.remove(arrayList6);
                    }
                }
            }
            java.util.ArrayList arrayList7 = this.l;
            for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
                java.util.ArrayList arrayList8 = (java.util.ArrayList) arrayList7.get(size7);
                for (int size8 = arrayList8.size() - 1; size8 >= 0; size8--) {
                    a.da1 da1Var4 = (a.da1) arrayList8.get(size8);
                    da1Var4.f91a.setAlpha(1.0f);
                    c(da1Var4);
                    arrayList8.remove(size8);
                    if (arrayList8.isEmpty()) {
                        arrayList7.remove(arrayList8);
                    }
                }
            }
            java.util.ArrayList arrayList9 = this.n;
            for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
                java.util.ArrayList arrayList10 = (java.util.ArrayList) arrayList9.get(size9);
                for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                    a.p20 p20Var2 = (a.p20) arrayList10.get(size10);
                    a.da1 da1Var5 = p20Var2.f429a;
                    if (da1Var5 != null) {
                        k(p20Var2, da1Var5);
                    }
                    a.da1 da1Var6 = p20Var2.b;
                    if (da1Var6 != null) {
                        k(p20Var2, da1Var6);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList9.remove(arrayList10);
                    }
                }
            }
            h(this.q);
            h(this.p);
            h(this.o);
            h(this.r);
            java.util.ArrayList arrayList11 = this.b;
            if (arrayList11.size() > 0) {
                a.ai1.t(arrayList11.get(0));
                throw null;
            }
            arrayList11.clear();
        }
    }

    @Override // a.j91
    public final boolean f() {
        return (this.i.isEmpty() && this.k.isEmpty() && this.j.isEmpty() && this.h.isEmpty() && this.p.isEmpty() && this.q.isEmpty() && this.o.isEmpty() && this.r.isEmpty() && this.m.isEmpty() && this.l.isEmpty() && this.n.isEmpty()) ? false : true;
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, a.q20] */
    public final boolean g(a.da1 da1Var, int i, int i2, int i3, int i4) {
        android.view.View view = da1Var.f91a;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) da1Var.f91a.getTranslationY());
        l(da1Var);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            c(da1Var);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX(-i5);
        }
        if (i6 != 0) {
            view.setTranslationY(-i6);
        }
        java.util.ArrayList arrayList = this.j;
        a.q20 obj = new a.q20();
        obj.f459a = da1Var;
        obj.b = translationX;
        obj.c = translationY;
        obj.d = i3;
        obj.e = i4;
        arrayList.add(obj);
        return true;
    }

    public final void i() {
        if (f()) {
            return;
        }
        java.util.ArrayList arrayList = this.b;
        if (arrayList.size() <= 0) {
            arrayList.clear();
        } else {
            a.ai1.t(arrayList.get(0));
            throw null;
        }
    }

    public final void j(a.da1 da1Var, java.util.ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            a.p20 p20Var = (a.p20) arrayList.get(size);
            if (k(p20Var, da1Var) && p20Var.f429a == null && p20Var.b == null) {
                arrayList.remove(p20Var);
            }
        }
    }

    public final boolean k(a.p20 p20Var, a.da1 da1Var) {
        if (p20Var.b == da1Var) {
            p20Var.b = null;
        } else {
            if (p20Var.f429a != da1Var) {
                return false;
            }
            p20Var.f429a = null;
        }
        da1Var.f91a.setAlpha(1.0f);
        android.view.View view = da1Var.f91a;
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        c(da1Var);
        return true;
    }

    public final void l(a.da1 da1Var) {
        if (s == null) {
            s = new android.animation.ValueAnimator().getInterpolator();
        }
        da1Var.f91a.animate().setInterpolator(s);
        d(da1Var);
    }
}
