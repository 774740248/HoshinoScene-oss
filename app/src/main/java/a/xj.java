package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class xj extends a.e91 {
    public a.ga1 B;
    public java.util.ArrayList g;
    public java.util.ArrayList i;
    public final a.bp0 j;
    public a.bp0 k;
    public a.bp0 l;
    public a.mc1 m;
    public final a.b81 n;
    public final java.lang.String o;
    public final boolean p;
    public a.bp0 q;
    public boolean r;
    public final java.lang.String s;
    public final boolean t;
    public androidx.recyclerview.widget.RecyclerView u;
    public androidx.recyclerview.widget.LinearLayoutManager v;
    public boolean z;
    public int f = 1;
    public java.lang.String h = "";
    public final java.util.HashMap w = new java.util.HashMap();
    public final a.vj1 x = new a.vj1(a.uj.d);
    public final a.ux0 y = new a.ux0(10);
    public final java.util.ArrayList A = new java.util.ArrayList();
    public final a.gy C = new a.gy();

    /* JADX WARN: Type inference failed for: r2v4, types: [a.gy, java.lang.Object] */
    public xj(a.mc1 mc1Var, a.bp0 bp0Var, a.b81 b81Var, java.lang.String str, boolean z) {
        java.lang.String str2;
        this.p = true;
        this.s = "/";
        this.t = true;
        this.t = z;
        this.p = true;
        if (a.yi1.h2(mc1Var.c, "/", false)) {
            java.lang.String str3 = mc1Var.c;
            str2 = str3.substring(0, str3.length() - 1);
            a.wv.v(str2, "this as java.lang.String…ing(startIndex, endIndex)");
        } else {
            str2 = mc1Var.c;
        }
        a.wv.w(str2, "<set-?>");
        mc1Var.c = str2;
        this.s = str2;
        this.j = bp0Var;
        this.n = b81Var;
        if (str != null) {
            if (a.yi1.B2(str, ".")) {
                this.o = str;
            } else {
                this.o = ".".concat(str);
            }
        }
        u(mc1Var);
    }

    public static java.lang.String z(long j) {
        if (j >= 1024) {
            return j < 1048576 ? a.ai1.l(new java.lang.Object[]{a.ai1.l(new java.lang.Object[]{java.lang.Double.valueOf(j / 1024.0d)}, 1, "%.2f", "format(format, *args)")}, 1, "%sKB", "format(format, *args)") : j < 1073741824 ? a.ai1.l(new java.lang.Object[]{a.ai1.l(new java.lang.Object[]{java.lang.Double.valueOf(j / 1048576.0d)}, 1, "%.2f", "format(format, *args)")}, 1, "%sMB", "format(format, *args)") : a.ai1.l(new java.lang.Object[]{a.ai1.l(new java.lang.Object[]{java.lang.Double.valueOf(j / 1.073741824E9d)}, 1, "%.2f", "format(format, *args)")}, 1, "%sGB", "format(format, *args)");
        }
        return j + "B";
    }

    public final void A(java.util.ArrayList arrayList) {
        int i = this.f;
        a.ov.Z1(arrayList, i != 1 ? i != 3 ? i != 4 ? new a.py(15) : new a.ri(new a.py(13), 2) : new a.py(14) : new a.ri(new a.py(12), 1));
    }

    @Override // a.e91
    public final int c() {
        if (this.r) {
            java.util.ArrayList arrayList = this.i;
            return (arrayList != null ? arrayList.size() : 0) + 1;
        }
        java.util.ArrayList arrayList2 = this.i;
        if (arrayList2 != null) {
            return arrayList2.size();
        }
        return 0;
    }

    @Override // a.e91
    public final int e(int i) {
        if (this.r && i == 0) {
            return 0;
        }
        return s(i).f343a ? 1 : 2;
    }

    @Override // a.e91
    public final void h(androidx.recyclerview.widget.RecyclerView recyclerView) {
        a.wv.w(recyclerView, "recyclerView");
        this.u = recyclerView;
        androidx.recyclerview.widget.a layoutManager = recyclerView.getLayoutManager();
        this.v = layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager ? (androidx.recyclerview.widget.LinearLayoutManager) layoutManager : null;
    }

    @Override // a.e91
    public final void i(a.da1 da1Var, int i) {
        a.tj tjVar = (a.tj) da1Var;
        boolean z = this.r;
        android.widget.TextView textView = tjVar.v;
        android.widget.CompoundButton compoundButton = tjVar.x;
        android.widget.TextView textView2 = tjVar.w;
        android.widget.ImageView imageView = tjVar.u;
        if (z && i == 0) {
            textView.setText("...");
            textView2.setText("");
            imageView.setImageResource(2131230938);
            compoundButton.setVisibility(8);
            return;
        }
        a.mc1 s = s(i);
        textView.setText(s.b);
        compoundButton.setVisibility(this.z ? 0 : 8);
        compoundButton.setChecked(this.A.contains(s.c));
        int e = e(i);
        a.vj1 vj1Var = this.x;
        if (e == 1) {
            textView2.setText(q(s) + tjVar.f91a.getContext().getString(2131952393, java.lang.Integer.valueOf(s.g)));
            ((a.vd0) vj1Var.a()).L1(s, imageView);
            return;
        }
        if (e != 2) {
            return;
        }
        textView2.setText(q(s) + z(s.d));
        imageView.setImageResource(2131230931);
        ((a.vd0) vj1Var.a()).L1(s, imageView);
    }

    @Override // a.e91
    public final a.da1 k(androidx.recyclerview.widget.RecyclerView recyclerView, int i) {
        a.wv.w(recyclerView, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(recyclerView.getContext()).inflate((i == 0 || i == 1) ? 2131558642 : 2131558643, (android.view.ViewGroup) recyclerView, false);
        a.wv.v(inflate, "view");
        return new a.tj(this, inflate);
    }

    @Override // a.e91
    public final void l(androidx.recyclerview.widget.RecyclerView recyclerView) {
        a.wv.w(recyclerView, "recyclerView");
        if (this.u == recyclerView) {
            this.u = null;
            this.v = null;
        }
    }

    public final void p() {
        java.util.ArrayList arrayList = this.g;
        if (arrayList != null && this.h.length() != 0) {
            java.lang.String str = this.h;
            java.util.Locale locale = java.util.Locale.getDefault();
            a.wv.v(locale, "getDefault()");
            java.lang.String lowerCase = str.toLowerCase(locale);
            a.wv.v(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj : arrayList) {
                java.lang.String str2 = ((a.mc1) obj).b;
                java.util.Locale locale2 = java.util.Locale.getDefault();
                a.wv.v(locale2, "getDefault()");
                java.lang.String lowerCase2 = str2.toLowerCase(locale2);
                a.wv.v(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
                if (a.yi1.g2(lowerCase2, lowerCase)) {
                    arrayList2.add(obj);
                }
            }
            arrayList = new java.util.ArrayList(arrayList2);
        }
        this.i = arrayList;
    }

    public final java.lang.String q(a.mc1 mc1Var) {
        java.lang.String str = mc1Var.f;
        if (str != null && str.length() != 0) {
            return a.ai1.j(new java.lang.StringBuilder("-> "), mc1Var.f, "   ");
        }
        int i = this.f;
        if (i == 2) {
            return a.ii1.e(z(mc1Var.d), "   ");
        }
        if (i != 3) {
            return "";
        }
        long j = mc1Var.h;
        this.C.getClass();
        return a.gy.g(j).concat("   ");
    }

    public final java.lang.String r() {
        a.mc1 mc1Var = this.m;
        if (mc1Var != null) {
            return mc1Var.c;
        }
        return null;
    }

    public final a.mc1 s(int i) {
        if (!this.r) {
            java.util.ArrayList arrayList = this.i;
            a.wv.s(arrayList);
            java.lang.Object obj = arrayList.get(i);
            a.wv.v(obj, "{\n            filteredFiles!![position]\n        }");
            return (a.mc1) obj;
        }
        if (i == 0) {
            a.mc1 mc1Var = this.m;
            a.wv.s(mc1Var);
            return a.fs1.r(mc1Var.a());
        }
        java.util.ArrayList arrayList2 = this.i;
        a.wv.s(arrayList2);
        java.lang.Object obj2 = arrayList2.get(i - 1);
        a.wv.v(obj2, "{\n                filter…sition - 1]\n            }");
        return (a.mc1) obj2;
    }

    public final boolean t() {
        if (!this.r) {
            return false;
        }
        a.mc1 mc1Var = this.m;
        a.wv.s(mc1Var);
        u(a.fs1.r(mc1Var.a()));
        this.w.remove(mc1Var.c);
        return true;
    }

    public final void u(a.mc1 mc1Var) {
        a.mc1 mc1Var2;
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager;
        androidx.recyclerview.widget.RecyclerView recyclerView = this.u;
        if (recyclerView != null && (mc1Var2 = this.m) != null && (linearLayoutManager = this.v) != null) {
            android.view.View childAt = recyclerView.getChildAt(0);
            int top = childAt != null ? childAt.getTop() : 0;
            int W0 = linearLayoutManager.W0();
            if (W0 >= 0) {
                this.w.put(mc1Var2.c, new a.y31(java.lang.Integer.valueOf(W0), java.lang.Integer.valueOf(top)));
            }
        }
        this.h = "";
        this.A.clear();
        this.i = new java.util.ArrayList();
        this.r = false;
        f();
        if (mc1Var.g > 2000) {
            a.cp cpVar = com.omarea.Scene.c;
            java.lang.String string = a.fs1.t().getString(2131952488);
            a.wv.v(string, "Scene.context.getString(…string.fs_too_many_files)");
            a.fs1.X(string, 0);
        }
        if (this.f == 2) {
            if (this.y.a(mc1Var.c) == null) {
                a.b81 b81Var = this.n;
                a.wv.s(b81Var);
                a.cp cpVar2 = com.omarea.Scene.c;
                java.lang.String string2 = a.fs1.t().getString(2131952840);
                a.wv.v(string2, "Scene.context.getString(R.string.loading)");
                b81Var.b(string2);
            }
        }
        a.wv.M0(a.wv.b(a.z80.b), null, new a.wj(mc1Var, this, null), 3);
    }

    public final void v(a.mc1 mc1Var) {
        a.wv.w(mc1Var, "file");
        this.y.c(-1);
        this.w.clear();
        u(a.fs1.r(mc1Var.c));
    }

    public final void w() {
        this.y.c(-1);
        a.mc1 mc1Var = this.m;
        if (mc1Var != null) {
            a.wv.s(mc1Var);
            u(mc1Var);
        }
    }

    public final void x(int i, boolean z) {
        if (this.z) {
            if (this.r && i == 0) {
                return;
            }
            a.mc1 s = s(i);
            java.util.ArrayList arrayList = this.A;
            if (!z) {
                arrayList.remove(s.c);
            } else {
                if (arrayList.contains(s.c)) {
                    return;
                }
                arrayList.add(s.c);
            }
        }
    }

    public final void y(int i) {
        this.y.c(-1);
        this.f = i;
        if (i == 2) {
            a.mc1 mc1Var = this.m;
            a.wv.s(mc1Var);
            u(mc1Var);
        } else {
            java.util.ArrayList arrayList = this.g;
            if (arrayList != null) {
                a.wv.s(arrayList);
                A(arrayList);
                f();
            }
        }
    }
}
