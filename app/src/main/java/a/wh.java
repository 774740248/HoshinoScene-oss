package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class wh extends a.e91 {
    public final android.content.Context f;
    public final java.util.List g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public java.util.List m;
    public final a.mo n;
    public final a.yi o;
    public final java.util.HashMap p;
    public final long q;
    public final a.gy r;

    /* JADX WARN: Type inference failed for: r3v3, types: [a.gy, java.lang.Object] */
    public wh(android.content.Context context, java.util.ArrayList arrayList) {
        a.wv.w(context, "context");
        this.f = context;
        this.g = arrayList;
        this.h = true;
        a.cp cpVar = com.omarea.Scene.c;
        int i = 0;
        this.k = a.fs1.s("pu_group_games_collapsed", false);
        this.l = a.fs1.s("pu_group_apps_collapsed", false);
        this.m = a.qb0.c;
        this.n = new a.mo(context, i, 6, i);
        this.o = new a.yi(context);
        this.p = new java.util.HashMap();
        this.q = 3L;
        this.r = new a.gy();
        s();
    }

    public static com.omarea.model.PowerStatAVG r(java.util.ArrayList arrayList) {
        java.util.Iterator it = arrayList.iterator();
        double d = 0.0d;
        int i = 0;
        int i2 = Integer.MIN_VALUE;
        int i3 = Integer.MAX_VALUE;
        int i4 = 0;
        int i5 = 0;
        while (it.hasNext()) {
            com.omarea.model.PowerStatAVG powerStatAVG = (com.omarea.model.PowerStatAVG) it.next();
            int i6 = powerStatAVG.count;
            i += i6;
            d += i6 * powerStatAVG.power;
            i2 = java.lang.Math.max(powerStatAVG.maxTemperature, i2);
            i3 = java.lang.Math.min(powerStatAVG.minTemperature, i3);
            int i7 = powerStatAVG.current;
            int i8 = powerStatAVG.count;
            i5 += i7 * i8;
            i4 += i8 * powerStatAVG.avgTemperature;
        }
        com.omarea.model.PowerStatAVG powerStatAVG2 = new com.omarea.model.PowerStatAVG();
        powerStatAVG2.packageName = "Others";
        powerStatAVG2.count = i;
        powerStatAVG2.power = d / i;
        powerStatAVG2.maxTemperature = i2;
        powerStatAVG2.minTemperature = i3;
        powerStatAVG2.avgTemperature = i4 / i;
        powerStatAVG2.mode = "";
        powerStatAVG2.current = i5 / i;
        return powerStatAVG2;
    }

    @Override // a.e91
    public final int c() {
        return this.m.size();
    }

    @Override // a.e91
    public final long d(int i) {
        return i;
    }

    @Override // a.e91
    public final int e(int i) {
        return this.m.get(i) instanceof a.th ? 1 : 0;
    }

    @Override // a.e91
    public final void i(a.da1 da1Var, int i) {
        a.vh vhVar = (a.vh) this.m.get(i);
        if (vhVar instanceof a.th) {
            a.ph phVar = (a.ph) da1Var;
            a.th thVar = (a.th) vhVar;
            a.wv.w(thVar, "row");
            phVar.v.setText(thVar.b);
            phVar.w.setText(thVar.c);
            phVar.x.setText(thVar.d);
            phVar.u.setRotation(thVar.e ? -90.0f : 0.0f);
            return;
        }
        if (vhVar instanceof a.uh) {
            a.sh shVar = (a.sh) da1Var;
            com.omarea.model.PowerStatAVG powerStatAVG = ((a.uh) vhVar).f594a;
            a.wv.w(powerStatAVG, "batteryStats");
            android.view.View view = shVar.y;
            if (view == null) {
                a.wv.M1("itemModeDot");
                throw null;
            }
            java.lang.String str = powerStatAVG.mode;
            a.wv.v(str, "batteryStats.mode");
            view.setVisibility(str.length() == 0 ? 8 : 0);
            android.view.View view2 = shVar.y;
            if (view2 == null) {
                a.wv.M1("itemModeDot");
                throw null;
            }
            a.nk nkVar = a.b11.c;
            java.lang.String str2 = powerStatAVG.mode;
            a.wv.v(str2, "batteryStats.mode");
            view2.setBackground(a.tg1.l(str2));
            a.wh whVar = shVar.B;
            if (whVar.i) {
                android.widget.TextView textView = shVar.w;
                if (textView == null) {
                    a.wv.M1("itemAvg");
                    throw null;
                }
                a.ai1.v(new java.lang.Object[]{java.lang.Double.valueOf((-powerStatAVG.power) / 1000), java.lang.Integer.valueOf(powerStatAVG.avgTemperature)}, 2, "%.2fW, %d℃", "format(format, *args)", textView);
            } else {
                android.widget.TextView textView2 = shVar.w;
                if (textView2 == null) {
                    a.wv.M1("itemAvg");
                    throw null;
                }
                a.ai1.v(new java.lang.Object[]{java.lang.Integer.valueOf(-powerStatAVG.current), java.lang.Integer.valueOf(powerStatAVG.avgTemperature)}, 2, "%dmA, %d℃", "format(format, *args)", textView2);
            }
            android.widget.TextView textView3 = shVar.x;
            if (textView3 == null) {
                a.wv.M1("itemMax");
                throw null;
            }
            a.ai1.v(new java.lang.Object[]{java.lang.Integer.valueOf(powerStatAVG.maxTemperature)}, 1, "%d℃", "format(format, *args)", textView3);
            android.widget.TextView textView4 = shVar.z;
            if (textView4 == null) {
                a.wv.M1("itemTimes");
                throw null;
            }
            whVar.r.getClass();
            textView4.setText(a.gy.o((whVar.q * powerStatAVG.count) / 60.0d));
            java.lang.String str3 = powerStatAVG.packageName;
            a.wv.v(str3, "app");
            if (str3.length() > 0) {
                shVar.A = str3;
                a.wv.M0(a.wv.b(a.z80.b), null, new a.rh(whVar, str3, shVar, null), 3);
                return;
            }
            android.widget.TextView textView5 = shVar.u;
            if (textView5 == null) {
                a.wv.M1("itemTitle");
                throw null;
            }
            textView5.setText(whVar.f.getString(2131953754));
            android.widget.ImageView imageView = shVar.v;
            if (imageView != null) {
                imageView.setImageDrawable((android.graphics.drawable.Drawable) whVar.n.G.a());
            } else {
                a.wv.M1("itemIcon");
                throw null;
            }
        }
    }

    @Override // a.e91
    public final a.da1 k(androidx.recyclerview.widget.RecyclerView recyclerView, int i) {
        a.wv.w(recyclerView, "parent");
        android.view.LayoutInflater from = android.view.LayoutInflater.from(this.f);
        if (i == 1) {
            android.view.View inflate = from.inflate(2131558637, (android.view.ViewGroup) recyclerView, false);
            a.wv.v(inflate, "inflater.inflate(R.layou…ery_group, parent, false)");
            return new a.ph(this, inflate);
        }
        android.view.View inflate2 = from.inflate(2131558638, (android.view.ViewGroup) recyclerView, false);
        a.wv.v(inflate2, "convertView");
        a.sh shVar = new a.sh(this, inflate2);
        android.view.View findViewById = inflate2.findViewById(2131362657);
        a.wv.v(findViewById, "convertView.findViewById(R.id.itemAvgIO)");
        shVar.w = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = inflate2.findViewById(2131362661);
        a.wv.v(findViewById2, "convertView.findViewById(R.id.itemModeDot)");
        shVar.y = findViewById2;
        android.view.View findViewById3 = inflate2.findViewById(2131362665);
        a.wv.v(findViewById3, "convertView.findViewById(R.id.itemTemperature)");
        shVar.x = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = inflate2.findViewById(2131362658);
        a.wv.v(findViewById4, "convertView.findViewById(R.id.itemCounts)");
        shVar.z = (android.widget.TextView) findViewById4;
        android.view.View findViewById5 = inflate2.findViewById(2131362666);
        a.wv.v(findViewById5, "convertView.findViewById(R.id.itemTitle)");
        shVar.u = (android.widget.TextView) findViewById5;
        android.view.View findViewById6 = inflate2.findViewById(2131362660);
        a.wv.v(findViewById6, "convertView.findViewById(R.id.itemIcon)");
        shVar.v = (android.widget.ImageView) findViewById6;
        return shVar;
    }

    public final void p(java.util.ArrayList arrayList, boolean z, java.util.ArrayList arrayList2, boolean z2) {
        java.lang.String l;
        long j = 0;
        while (arrayList2.iterator().hasNext()) {
            j += ((com.omarea.model.PowerStatAVG) r2.next()).count;
        }
        this.r.getClass();
        java.lang.String o = a.gy.o((this.q * j) / 60.0d);
        if (j <= 0) {
            l = this.i ? "--W" : "--mA";
        } else {
            double d = 0.0d;
            if (this.i) {
                java.util.Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    d += ((com.omarea.model.PowerStatAVG) it.next()).power * r9.count;
                }
                l = a.ai1.l(new java.lang.Object[]{java.lang.Double.valueOf((-(d / j)) / 1000)}, 1, "%.2fW", "format(format, *args)");
            } else {
                java.util.Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    com.omarea.model.PowerStatAVG powerStatAVG = (com.omarea.model.PowerStatAVG) it2.next();
                    d += powerStatAVG.current * powerStatAVG.count;
                }
                l = a.ai1.l(new java.lang.Object[]{java.lang.Integer.valueOf(-((int) (d / j)))}, 1, "%dmA", "format(format, *args)");
            }
        }
        java.lang.String str = l;
        java.lang.String string = this.f.getString(z ? 2131953228 : 2131953227);
        a.wv.v(string, "context.getString(\n     …up_apps\n                )");
        arrayList.add(new a.th(z, string, str, o, z2));
        if (z2) {
            return;
        }
        java.util.Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            arrayList.add(new a.uh((com.omarea.model.PowerStatAVG) it3.next()));
        }
    }

    public final boolean q(java.lang.String str) {
        java.util.HashMap hashMap = this.p;
        java.lang.Object obj = hashMap.get(str);
        if (obj == null) {
            obj = java.lang.Boolean.valueOf(a.wv.e(this.o.c(str), java.lang.Boolean.TRUE));
            hashMap.put(str, obj);
        }
        return ((java.lang.Boolean) obj).booleanValue();
    }

    public final void s() {
        java.util.ArrayList arrayList;
        boolean z = this.h;
        java.util.List list = this.g;
        java.util.List<com.omarea.model.PowerStatAVG> s2 = z ? a.qv.s2(list, new a.py(17)) : this.i ? a.qv.s2(list, new a.py(18)) : a.qv.s2(list, new a.py(19));
        if (this.j) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            for (com.omarea.model.PowerStatAVG powerStatAVG : s2) {
                java.lang.String str = powerStatAVG.packageName;
                a.wv.v(str, "item.packageName");
                if (q(str)) {
                    if (powerStatAVG.count >= 20) {
                        arrayList2.add(powerStatAVG);
                    } else {
                        arrayList4.add(powerStatAVG);
                    }
                } else if (powerStatAVG.count >= 20) {
                    arrayList3.add(powerStatAVG);
                } else {
                    arrayList5.add(powerStatAVG);
                }
            }
            if (arrayList5.size() > 0) {
                arrayList3.add(r(arrayList5));
            }
            if (arrayList4.size() > 0) {
                arrayList2.add(r(arrayList4));
            }
            java.util.ArrayList arrayList6 = new java.util.ArrayList(s2.size() + 2);
            p(arrayList6, true, arrayList2, this.k);
            p(arrayList6, false, arrayList3, this.l);
            arrayList = arrayList6;
        } else {
            arrayList = new java.util.ArrayList(a.op.J1(s2, 10));
            java.util.Iterator it = s2.iterator();
            while (it.hasNext()) {
                arrayList.add(new a.uh((com.omarea.model.PowerStatAVG) it.next()));
            }
        }
        this.m = arrayList;
    }
}
