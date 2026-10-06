package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class dk extends a.e91 {
    public final android.content.Context f;
    public final java.util.ArrayList g;
    public int h;
    public boolean i;
    public java.util.ArrayList j;
    public final java.text.SimpleDateFormat k;
    public final java.text.SimpleDateFormat l;
    public final a.qm1 m;
    public final a.gy n;
    public a.bk o;
    public a.bk p;

    /* JADX WARN: Type inference failed for: r2v5, types: [a.gy, java.lang.Object] */
    public dk(android.content.Context context, java.util.ArrayList arrayList) {
        a.wv.w(context, "context");
        a.wv.w(arrayList, "list");
        this.f = context;
        this.g = arrayList;
        this.h = -1;
        this.j = arrayList;
        this.k = new java.text.SimpleDateFormat("yyyy-MM-dd");
        this.l = new java.text.SimpleDateFormat("HH:mm:ss");
        this.m = new a.qm1(0);
        this.n = new a.gy();
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
        java.lang.String substring;
        a.ck ckVar = (a.ck) da1Var;
        ckVar.f91a.setOnClickListener(new a.xh(this, i, ckVar, 3));
        android.widget.ImageButton imageButton = ckVar.F;
        final int i2 = 0;
        if (imageButton != null) {
            imageButton.setOnClickListener(new a.ak(this));
        }
        android.widget.ImageButton imageButton2 = ckVar.D;
        final int i3 = 1;
        if (imageButton2 != null) {
            imageButton2.setOnClickListener(new a.ak(this));
        }
        a.gy obj = (gy) this.j.get(i);
        a.wv.v(obj, "filterResult[position]");
        com.omarea.model.FpsWatchSession fpsWatchSession = (com.omarea.model.FpsWatchSession) obj;
        android.widget.TextView textView = ckVar.w;
        if (textView != null) {
            textView.setText(fpsWatchSession.appName);
        }
        android.widget.ImageView imageView = ckVar.u;
        if (imageView != null) {
            imageView.setImageDrawable(fpsWatchSession.appIcon);
        }
        android.widget.TextView textView2 = ckVar.B;
        if (textView2 != null) {
            a.ai1.v(new java.lang.Object[]{java.lang.Double.valueOf(fpsWatchSession.avgFPS), java.lang.Double.valueOf(fpsWatchSession.avgPower)}, 2, "%.2f  %.2fW", "format(format, *args)", textView2);
        }
        android.widget.TextView textView3 = ckVar.y;
        if (textView3 != null) {
            this.n.getClass();
            textView3.setText(a.gy.o(fpsWatchSession.duration / 60.0d));
        }
        android.view.View view = ckVar.A;
        if (view != null) {
            java.lang.String str = fpsWatchSession.mode;
            if (str == null || str.length() == 0 || a.yi1.h2(str, "#", false)) {
                view.setAlpha(0.0f);
                view.setBackground(null);
            } else if (a.yi1.g2(str, "#")) {
                int m2 = a.yi1.m2(str, "#", 0, false, 6);
                java.lang.String substring2 = str.substring(0, m2);
                a.wv.v(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                if (a.yi1.y2(str, new java.lang.String[]{"#"}).size() > 2) {
                    substring = str.substring(m2 + 1, a.yi1.q2(str, "#", 6));
                    a.wv.v(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                } else {
                    substring = str.substring(m2 + 1);
                    a.wv.v(substring, "this as java.lang.String).substring(startIndex)");
                }
                a.nk nkVar = a.b11.c;
                view.setBackground(a.tg1.l(substring));
                if (a.wv.e(substring2, "SOURCE_SCENE_ONLINE")) {
                    view.setAlpha(1.0f);
                } else {
                    view.setAlpha(0.3f);
                }
            } else {
                view.setAlpha(0.0f);
                view.setBackground(null);
            }
        }
        android.widget.ImageView imageView2 = ckVar.E;
        if (imageView2 != null) {
            java.lang.String str2 = fpsWatchSession.cloudId;
            imageView2.setVisibility((str2 == null || str2.length() == 0) ? 8 : 0);
        }
        java.lang.String str3 = fpsWatchSession.sessionDesc;
        if (str3 == null || str3.length() == 0) {
            android.widget.TextView textView4 = ckVar.x;
            if (textView4 != null) {
                textView4.setText((java.lang.CharSequence) null);
                textView4.setVisibility(8);
            }
        } else {
            android.widget.TextView textView5 = ckVar.x;
            if (textView5 != null) {
                textView5.setText(fpsWatchSession.sessionDesc);
                textView5.setVisibility(0);
            }
        }
        java.lang.Long l = fpsWatchSession.beginTime;
        a.wv.v(l, "item.beginTime");
        long longValue = l.longValue();
        this.m.getClass();
        if (a.qm1.d(longValue)) {
            android.view.View view2 = ckVar.v;
            if (view2 != null) {
                view2.setVisibility(0);
            }
            android.widget.TextView textView6 = ckVar.z;
            if (textView6 != null) {
                java.text.SimpleDateFormat simpleDateFormat = this.l;
                java.lang.Long l2 = fpsWatchSession.beginTime;
                a.wv.v(l2, "item.beginTime");
                textView6.setText(simpleDateFormat.format(new java.util.Date(l2.longValue())));
            }
        } else {
            android.view.View view3 = ckVar.v;
            if (view3 != null) {
                view3.setVisibility(8);
            }
            android.widget.TextView textView7 = ckVar.z;
            if (textView7 != null) {
                java.text.SimpleDateFormat simpleDateFormat2 = this.k;
                java.lang.Long l3 = fpsWatchSession.beginTime;
                a.wv.v(l3, "item.beginTime");
                textView7.setText(simpleDateFormat2.format(new java.util.Date(l3.longValue())));
            }
        }
        if (i == this.h) {
            android.view.View view4 = ckVar.C;
            if (view4 != null) {
                view4.setAlpha(0.7f);
            }
        } else {
            android.view.View view5 = ckVar.C;
            if (view5 != null) {
                view5.setAlpha(0.0f);
            }
        }
        if (this.i && this.h == i) {
            android.widget.ImageButton imageButton3 = ckVar.D;
            if (imageButton3 != null) {
                imageButton3.setVisibility(8);
            }
            android.widget.ImageButton imageButton4 = ckVar.F;
            if (imageButton4 == null) {
                return;
            }
            imageButton4.setVisibility(0);
            return;
        }
        android.widget.ImageButton imageButton5 = ckVar.D;
        if (imageButton5 != null) {
            imageButton5.setVisibility(this.p == null ? 8 : 0);
        }
        android.widget.ImageButton imageButton6 = ckVar.F;
        if (imageButton6 == null) {
            return;
        }
        imageButton6.setVisibility(8);
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [a.ck, a.da1] */
    @Override // a.e91
    public final a.da1 k(androidx.recyclerview.widget.RecyclerView recyclerView, int i) {
        a.wv.w(recyclerView, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(this.f).inflate(2131558644, (android.view.ViewGroup) recyclerView, false);
        a.wv.v(inflate, "convertView");
        a.ck da1Var = (ck) new a.da1(inflate);
        da1Var.u = (android.widget.ImageView) inflate.findViewById(2131361811);
        da1Var.v = inflate.findViewById(2131361831);
        da1Var.w = (android.widget.TextView) inflate.findViewById(2131361825);
        da1Var.z = (android.widget.TextView) inflate.findViewById(2131361824);
        da1Var.A = inflate.findViewById(2131361812);
        da1Var.B = (android.widget.TextView) inflate.findViewById(2131361821);
        da1Var.x = (android.widget.TextView) inflate.findViewById(2131361806);
        da1Var.y = (android.widget.TextView) inflate.findViewById(2131361807);
        da1Var.D = (android.widget.ImageButton) inflate.findViewById(2131362351);
        da1Var.E = (android.widget.ImageView) inflate.findViewById(2131361803);
        da1Var.F = (android.widget.ImageButton) inflate.findViewById(2131362252);
        da1Var.C = inflate.findViewById(2131361862);
        return da1Var;
    }

    public final void p(int i, boolean z) {
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
