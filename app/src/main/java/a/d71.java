package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class d71 extends a.e91 {
    public java.util.ArrayList f = new java.util.ArrayList();
    public final /* synthetic */ com.omarea.ui.procs.ProcessGroupView g;

    public d71(com.omarea.ui.procs.ProcessGroupView processGroupView) {
        this.g = processGroupView;
        o();
    }

    @Override // a.e91
    public final int c() {
        return this.f.size();
    }

    @Override // a.e91
    public final long d(int i) {
        a.z61 z61Var = (a.z61) this.f.get(i);
        if (z61Var.f726a) {
            return (z61Var.b.hashCode() & 2147483647L) | 4611686018427387904L;
        }
        a.wv.s(z61Var.e);
        return r5.pid;
    }

    @Override // a.e91
    public final int e(int i) {
        return !((a.z61) this.f.get(i)).f726a ? 1 : 0;
    }

    @Override // a.e91
    public final void i(a.da1 da1Var, int i) {
        java.lang.Object obj = this.f.get(i);
        a.wv.v(obj, "rows[position]");
        a.z61 z61Var = (a.z61) obj;
        android.graphics.drawable.Drawable drawable = null;
        if (da1Var instanceof a.b71) {
            a.b71 b71Var = (a.b71) da1Var;
            b71Var.u.setRotation(z61Var.i ? 0.0f : -90.0f);
            android.widget.TextView textView = b71Var.w;
            com.omarea.ui.procs.ProcessGroupView processGroupView = b71Var.A.g;
            textView.setText(com.omarea.ui.procs.ProcessGroupView.d(processGroupView, com.omarea.ui.procs.ProcessGroupView.c(processGroupView, z61Var)));
            b71Var.x.setVisibility(8);
            com.omarea.ui.procs.ProcessGroupView processGroupView2 = b71Var.A.g;
            android.widget.ImageView imageView = b71Var.v;
            java.lang.String str = z61Var.d;
            processGroupView2.getClass();
            if (str == null || str.length() == 0) {
                imageView.setImageResource(2131230868);
            } else {
                try {
                    drawable = processGroupView2.m.M1(str);
                } catch (java.lang.Exception unused) {
                }
                if (drawable == null) {
                    android.content.Context context = processGroupView2.getContext();
                    java.lang.Object obj2 = a.zx.f748a;
                    drawable = a.xx.b(context, 2131230868);
                }
                imageView.setImageDrawable(drawable);
            }
            b71Var.u(z61Var);
            return;
        }
        if (da1Var instanceof a.c71) {
            a.c71 c71Var = (a.c71) da1Var;
            com.omarea.model.ProcessInfo processInfo = z61Var.e;
            a.wv.s(processInfo);
            boolean e = a.wv.e(processInfo.friendlyName, processInfo.name);
            android.widget.TextView textView2 = c71Var.v;
            android.widget.TextView textView3 = c71Var.w;
            a.d71 d71Var = c71Var.A;
            if (e) {
                com.omarea.ui.procs.ProcessGroupView processGroupView3 = d71Var.g;
                java.lang.String str2 = processInfo.friendlyName;
                if (str2 == null) {
                    str2 = "";
                }
                textView2.setText(com.omarea.ui.procs.ProcessGroupView.d(processGroupView3, str2));
                textView3.setVisibility(8);
                textView3.setText("");
            } else {
                com.omarea.ui.procs.ProcessGroupView processGroupView4 = d71Var.g;
                java.lang.String str3 = processInfo.friendlyName;
                if (str3 == null) {
                    str3 = "";
                }
                textView2.setText(com.omarea.ui.procs.ProcessGroupView.d(processGroupView4, str3));
                textView3.setVisibility(0);
                com.omarea.ui.procs.ProcessGroupView processGroupView5 = d71Var.g;
                java.lang.String str4 = processInfo.name;
                textView3.setText(com.omarea.ui.procs.ProcessGroupView.d(processGroupView5, str4 != null ? str4 : ""));
            }
            c71Var.x.setText(com.omarea.ui.procs.ProcessGroupView.d(d71Var.g, java.lang.String.valueOf(processInfo.pid)));
            c71Var.u(processInfo);
            com.omarea.ui.procs.ProcessGroupView processGroupView6 = d71Var.g;
            if (processGroupView6.e(processInfo)) {
                try {
                    a.mo moVar = processGroupView6.m;
                    java.lang.String str5 = processInfo.name;
                    a.wv.v(str5, "item.name");
                    drawable = moVar.M1((java.lang.String) a.qv.e2(a.yi1.y2(str5, new java.lang.String[]{":"})));
                } catch (java.lang.Exception unused2) {
                }
                if (drawable == null) {
                    drawable = processGroupView6.n;
                }
            } else {
                drawable = processGroupView6.o;
            }
            c71Var.u.setImageDrawable(drawable);
        }
    }

    @Override // a.e91
    public final void j(a.da1 da1Var, int i, java.util.List list) {
        a.wv.w(list, "payloads");
        if (!list.contains(1)) {
            i(da1Var, i);
            return;
        }
        java.lang.Object obj = this.f.get(i);
        a.wv.v(obj, "rows[position]");
        a.z61 z61Var = (a.z61) obj;
        if (da1Var instanceof a.b71) {
            ((a.b71) da1Var).u(z61Var);
        } else if (da1Var instanceof a.c71) {
            com.omarea.model.ProcessInfo processInfo = z61Var.e;
            a.wv.s(processInfo);
            ((a.c71) da1Var).u(processInfo);
        }
    }

    @Override // a.e91
    public final a.da1 k(androidx.recyclerview.widget.RecyclerView recyclerView, int i) {
        a.wv.w(recyclerView, "parent");
        android.view.LayoutInflater from = android.view.LayoutInflater.from(recyclerView.getContext());
        com.omarea.ui.procs.ProcessGroupView processGroupView = this.g;
        if (i == 0) {
            android.view.View inflate = from.inflate(2131558647, (android.view.ViewGroup) recyclerView, false);
            a.wv.v(inflate, "view");
            a.b71 b71Var = new a.b71(this, inflate);
            inflate.setOnClickListener(new a.sg(b71Var, processGroupView, this, 7));
            return b71Var;
        }
        android.view.View inflate2 = from.inflate(2131558648, (android.view.ViewGroup) recyclerView, false);
        a.wv.v(inflate2, "view");
        a.c71 c71Var = new a.c71(this, inflate2);
        inflate2.setOnClickListener(new a.sg(c71Var, this, processGroupView, 8));
        return c71Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b8, code lost:
    
        if (r9[(r7 + 1) + r10] > r9[(r7 - 1) + r10]) goto L30;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:127:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f9  */
    /* JADX WARN: Type inference failed for: r0v45, types: [java.lang.Object, a.u80] */
    /* JADX WARN: Type inference failed for: r6v30, types: [java.lang.Object, a.u80] */
    /* JADX WARN: Type inference failed for: r7v0, types: [a.t80, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(java.util.ArrayList r23) {
        /*
            Method dump skipped, instructions count: 931
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.d71.p(java.util.ArrayList):void");
    }
}
