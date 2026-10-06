package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class jj extends a.e91 {
    public final android.content.Context f;
    public final java.util.ArrayList g;
    public int h;
    public boolean i;
    public java.util.ArrayList j;
    public final java.text.SimpleDateFormat k = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm");
    public final java.text.SimpleDateFormat l = new java.text.SimpleDateFormat("HH:mm:ss");
    public final a.qm1 m = new a.qm1(0);
    public final a.gy n = new a.gy();
    public a.gj o;
    public a.gj p;

    /* JADX WARN: Type inference failed for: r1v4, types: [a.gy, java.lang.Object] */
    public jj(android.content.Context context, java.util.ArrayList arrayList, int i) {
        this.f = context;
        this.g = arrayList;
        this.h = i;
        this.j = arrayList;
    }

    @Override // a.e91
    public final int c() {
        return this.j.size();
    }

    @Override // a.e91
    public final long d(int i) {
        return i;
    }

    @Override // a.e91
    public final void i(a.da1 da1Var, final int i) {
        java.lang.String str;
        a.hj hjVar = (a.hj) da1Var;
        hjVar.f91a.setOnClickListener(new a.xh(this, i, hjVar, 2));
        android.widget.ImageButton imageButton = hjVar.B;
        final int i2 = 0;
        if (imageButton != null) {
            imageButton.setOnClickListener(new a.fj(this));
        }
        android.widget.ImageButton imageButton2 = hjVar.A;
        if (imageButton2 != null) {
            final int i3 = 1;
            imageButton2.setOnClickListener(new a.fj(this));
        }
        a.gy obj = (gy) this.j.get(i);
        a.wv.v(obj, "filterResult[position]");
        com.omarea.model.PowerStatSession powerStatSession = (com.omarea.model.PowerStatSession) obj;
        android.widget.TextView textView = hjVar.y;
        if (textView != null) {
            java.lang.Double valueOf = java.lang.Double.valueOf(powerStatSession.avgPower / (-1000));
            double d = powerStatSession.avgPower * 100.0d;
            a.vj1 vj1Var = a.oq0.c;
            a.ai1.v(new java.lang.Object[]{valueOf, java.lang.Double.valueOf(d / a.oq0.d())}, 2, "%.2fW  %.1f%%/h", "format(format, *args)", textView);
        }
        android.widget.TextView textView2 = hjVar.w;
        a.gy gyVar = this.n;
        if (textView2 != null) {
            gyVar.getClass();
            textView2.setText(a.gy.E((powerStatSession.used * 3000) / 60000.0d) + " / " + a.gy.E((powerStatSession.endTime - powerStatSession.beginTime) / 60000.0d));
        }
        if (powerStatSession.avgPower < 0.0d) {
            a.vj1 vj1Var2 = a.oq0.c;
            double d2 = (a.oq0.d() / (-powerStatSession.avgPower)) * 60 * 0.9d;
            gyVar.getClass();
            str = a.gy.E(d2);
        } else {
            str = "--";
        }
        android.widget.TextView textView3 = hjVar.x;
        if (textView3 != null) {
            textView3.setText(this.f.getString(2131953240) + ": " + str);
        }
        long j = powerStatSession.beginTime;
        this.m.getClass();
        if (a.qm1.d(j)) {
            android.view.View view = hjVar.u;
            if (view != null) {
                view.setVisibility(0);
            }
            android.widget.TextView textView4 = hjVar.v;
            if (textView4 != null) {
                textView4.setText(this.l.format(java.lang.Long.valueOf(powerStatSession.beginTime)));
            }
        } else {
            android.view.View view2 = hjVar.u;
            if (view2 != null) {
                view2.setVisibility(8);
            }
            android.widget.TextView textView5 = hjVar.v;
            if (textView5 != null) {
                textView5.setText(this.k.format(java.lang.Long.valueOf(powerStatSession.beginTime)));
            }
        }
        if (i == this.h) {
            android.view.View view3 = hjVar.z;
            if (view3 != null) {
                view3.setAlpha(0.7f);
            }
        } else {
            android.view.View view4 = hjVar.z;
            if (view4 != null) {
                view4.setAlpha(0.0f);
            }
        }
        if (this.i && this.h == i) {
            android.widget.ImageButton imageButton3 = hjVar.A;
            if (imageButton3 != null) {
                imageButton3.setVisibility(8);
            }
            android.widget.ImageButton imageButton4 = hjVar.B;
            if (imageButton4 == null) {
                return;
            }
            imageButton4.setVisibility(0);
            return;
        }
        android.widget.ImageButton imageButton5 = hjVar.A;
        if (imageButton5 != null) {
            imageButton5.setVisibility(0);
        }
        android.widget.ImageButton imageButton6 = hjVar.B;
        if (imageButton6 == null) {
            return;
        }
        imageButton6.setVisibility(8);
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [a.hj, a.da1] */
    @Override // a.e91
    public final a.da1 k(androidx.recyclerview.widget.RecyclerView recyclerView, int i) {
        a.wv.w(recyclerView, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(this.f).inflate(2131558636, (android.view.ViewGroup) recyclerView, false);
        a.wv.v(inflate, "convertView");
        a.hj da1Var = (hj) new a.da1(inflate);
        da1Var.u = inflate.findViewById(2131361831);
        da1Var.v = (android.widget.TextView) inflate.findViewById(2131361825);
        da1Var.x = (android.widget.TextView) inflate.findViewById(2131361810);
        da1Var.y = (android.widget.TextView) inflate.findViewById(2131361820);
        da1Var.w = (android.widget.TextView) inflate.findViewById(2131361800);
        da1Var.A = (android.widget.ImageButton) inflate.findViewById(2131362351);
        da1Var.B = (android.widget.ImageButton) inflate.findViewById(2131362252);
        da1Var.z = inflate.findViewById(2131361817);
        return da1Var;
    }

    public final java.util.ArrayList p(int i) {
        java.util.ArrayList arrayList = this.g;
        if (i != 0) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj : arrayList) {
                if (((com.omarea.model.PowerStatSession) obj).used * 3000 <= i) {
                    arrayList2.add(obj);
                }
            }
            arrayList = new java.util.ArrayList(arrayList2);
        }
        this.j = arrayList;
        f();
        return this.j;
    }

    public final void q(int i, boolean z) {
        int i2 = this.h;
        if (i2 == i && this.i == z) {
            return;
        }
        this.i = z;
        if (i2 != -1) {
            this.h = i;
            g(i2);
        }
        this.h = i;
        g(i);
    }
}
