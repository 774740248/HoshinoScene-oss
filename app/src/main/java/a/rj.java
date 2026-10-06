package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class rj extends android.widget.BaseAdapter {
    public static final /* synthetic */ int o = 0;
    public final android.content.Context c;
    public java.util.ArrayList d;
    public final java.lang.String e;
    public final int f;
    public int g;
    public final a.mo h;
    public final android.graphics.drawable.Drawable i;
    public final android.graphics.drawable.Drawable j;
    public final android.content.pm.PackageManager k;
    public java.util.ArrayList l;
    public final android.content.SharedPreferences m;
    public final a.ab1 n;

    public rj(android.content.Context context) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.c = context;
        this.d = arrayList;
        this.e = "";
        this.f = 4;
        this.g = 32;
        this.h = new a.mo(context, 100, 48);
        java.lang.Object obj = a.zx.f748a;
        this.i = a.xx.b(context, 2131231235);
        this.j = a.xx.b(context, 2131231236);
        this.k = context.getPackageManager();
        this.l = new java.util.ArrayList();
        this.m = context.getSharedPreferences("ProcessNameCache", 0);
        c();
        a.wv.M0(a.wv.b(a.z80.b), null, new a.oj(this, null), 3);
        this.n = new a.ab1(".*\\..*");
    }

    public static java.lang.String d(com.omarea.model.ProcessInfo processInfo) {
        java.lang.String str = processInfo.name;
        if (str == null) {
            return "";
        }
        if (!a.yi1.g2(str, ":")) {
            java.lang.String str2 = processInfo.name;
            a.wv.v(str2, "processInfo.name");
            return str2;
        }
        java.lang.String str3 = processInfo.name;
        a.wv.v(str3, "processInfo.name");
        java.lang.String str4 = processInfo.name;
        a.wv.v(str4, "processInfo.name");
        java.lang.String substring = str3.substring(0, a.yi1.m2(str4, ":", 0, false, 6));
        a.wv.v(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0014, code lost:
    
        if (r2.m.contains(d(r3)) == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(com.omarea.model.ProcessInfo r3) {
        /*
            r2 = this;
            java.lang.String r0 = r3.name
            if (r0 == 0) goto L16
            int r0 = r0.length()
            if (r0 <= 0) goto L16
            java.lang.String r0 = d(r3)
            android.content.SharedPreferences r1 = r2.m
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L34
        L16:
            java.lang.String r0 = r3.command
            java.lang.String r1 = "processInfo.command"
            a.wv.v(r0, r1)
            java.lang.String r1 = "app_process"
            boolean r0 = a.yi1.g2(r0, r1)
            if (r0 == 0) goto L36
            java.lang.String r3 = r3.name
            java.lang.String r0 = "processInfo.name"
            a.wv.v(r3, r0)
            a.ab1 r0 = r2.n
            boolean r3 = r0.c(r3)
            if (r3 == 0) goto L36
        L34:
            r3 = 1
            goto L37
        L36:
            r3 = 0
        L37:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: a.rj.a(com.omarea.model.ProcessInfo):boolean");
    }

    public final void b() {
        android.content.pm.PackageManager packageManager = this.k;
        java.util.Iterator it = this.d.iterator();
        android.content.SharedPreferences.Editor editor = null;
        while (it.hasNext()) {
            com.omarea.model.ProcessInfo processInfo = (com.omarea.model.ProcessInfo) it.next();
            a.wv.v(processInfo, "item");
            if (a(processInfo)) {
                java.lang.String d = d(processInfo);
                java.lang.String str = processInfo.name;
                android.content.SharedPreferences sharedPreferences = this.m;
                java.lang.String string = sharedPreferences.getString(str, null);
                if (string == null) {
                    string = sharedPreferences.getString(d, null);
                }
                if (string != null) {
                    processInfo.friendlyName = string;
                } else {
                    try {
                        android.content.pm.ApplicationInfo applicationInfo = packageManager.getApplicationInfo(d, 0);
                        a.wv.v(applicationInfo, "pm.getApplicationInfo(key, 0)");
                        java.lang.CharSequence loadLabel = applicationInfo.loadLabel(packageManager);
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        sb.append((java.lang.Object) loadLabel);
                        processInfo.friendlyName = sb.toString();
                    } catch (java.lang.Exception unused) {
                        processInfo.friendlyName = d;
                    }
                    if (editor == null) {
                        editor = sharedPreferences.edit();
                    }
                    editor.putString(processInfo.name, processInfo.friendlyName);
                    if (d.length() > 0) {
                        editor.putString(d, processInfo.friendlyName);
                    }
                }
            } else {
                processInfo.friendlyName = processInfo.name;
            }
        }
        if (editor != null) {
            editor.apply();
        }
    }

    public final void c() {
        int i;
        java.lang.String str;
        java.util.ArrayList arrayList = this.d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : arrayList) {
            com.omarea.model.ProcessInfo processInfo = (com.omarea.model.ProcessInfo) obj;
            int i2 = this.g;
            if (i2 == 1 || i2 != 32 || a(processInfo)) {
                arrayList2.add(obj);
            }
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList(arrayList2);
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.Iterator it = arrayList3.iterator();
        while (true) {
            i = 6;
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            com.omarea.model.ProcessInfo processInfo2 = (com.omarea.model.ProcessInfo) next;
            java.lang.String str2 = processInfo2.name;
            a.wv.v(str2, "it.name");
            if (a.yi1.g2(str2, ":") && a(processInfo2)) {
                java.lang.String str3 = processInfo2.name;
                a.wv.v(str3, "it.name");
                java.lang.String str4 = processInfo2.name;
                a.wv.v(str4, "it.name");
                str = str3.substring(0, a.yi1.m2(str4, ":", 0, false, 6));
                a.wv.v(str, "this as java.lang.String…ing(startIndex, endIndex)");
            } else {
                str = processInfo2.name;
            }
            java.lang.Object obj2 = linkedHashMap.get(str);
            if (obj2 == null) {
                obj2 = new java.util.ArrayList();
                linkedHashMap.put(str, obj2);
            }
            ((java.util.List) obj2).add(next);
        }
        java.util.ArrayList arrayList4 = new java.util.ArrayList(linkedHashMap.size());
        for (java.util.Map.Entry entry : (Iterable<java.util.Map.Entry>) linkedHashMap.entrySet()) {
            com.omarea.model.ProcessInfo processInfo3 = (com.omarea.model.ProcessInfo) a.qv.e2((java.util.List) entry.getValue());
            java.util.Iterator it2 = ((java.lang.Iterable) entry.getValue()).iterator();
            float f = 0.0f;
            while (it2.hasNext()) {
                f += ((com.omarea.model.ProcessInfo) it2.next()).cpu;
            }
            processInfo3.cpu = f;
            arrayList4.add(processInfo3);
        }
        java.util.List s2 = a.qv.s2(arrayList4, new a.u61(i, this));
        if (s2.size() > 30) {
            s2 = s2.subList(0, 30);
        }
        this.l = new java.util.ArrayList(s2);
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.l.size();
    }

    @Override // android.widget.Adapter
    public final java.lang.Object getItem(int i) {
        java.lang.Object obj = this.l.get(i);
        a.wv.v(obj, "list[position]");
        return (com.omarea.model.ProcessInfo) obj;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return ((com.omarea.model.ProcessInfo) this.l.get(i)).pid;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.widget.Adapter
    public final android.view.View getView(int i, android.view.View view, android.view.ViewGroup viewGroup) {
        a.pj pjVar;
        a.wv.w(viewGroup, "parent");
        android.graphics.drawable.Drawable drawable = null;
        if (view == null) {
            view = android.view.View.inflate(this.c, 2131558650, null);
            a.wv.v(view, "inflate(context, R.layou…item_process_small, null)");
            pjVar = new a.pj(view);
            view.setTag(pjVar);
        } else {
            java.lang.Object tag = view.getTag();
            a.wv.t(tag, "null cannot be cast to non-null type com.omarea.ui.procs.AdapterProcessMini.ProcessHolder");
            pjVar = (a.pj) tag;
        }
        java.lang.Object obj = this.l.get(i);
        a.wv.v(obj, "list[position]");
        com.omarea.model.ProcessInfo processInfo = (com.omarea.model.ProcessInfo) obj;
        java.lang.String str = processInfo.friendlyName;
        a.wv.v(str, "processInfo.friendlyName");
        java.lang.String str2 = this.e;
        if (str2.length() != 0 && str.length() != 0) {
            java.util.Locale locale = java.util.Locale.ROOT;
            java.lang.String lowerCase = str.toLowerCase(locale);
            a.wv.v(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            java.lang.String lowerCase2 = str2.toLowerCase(locale);
            a.wv.v(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            int m2 = a.yi1.m2(lowerCase, lowerCase2, 0, false, 6);
            if (m2 >= 0) {
                android.text.SpannableString spannableString = new android.text.SpannableString(str);
                spannableString.setSpan(new android.text.style.ForegroundColorSpan(android.graphics.Color.parseColor("#0094ff")), m2, str2.length() + m2, 33);
                str = (String) spannableString;
            }
        }
        pjVar.b.setText(str);
        pjVar.c.setText(a.ai1.l(new java.lang.Object[]{java.lang.Float.valueOf(processInfo.cpu)}, 1, "%.1f%%", "format(format, *args)"));
        java.lang.String d = a(processInfo) ? d(processInfo) : ":linux";
        android.widget.ImageView imageView = pjVar.f438a;
        if (!a.wv.e(imageView.getTag(2131361842), d)) {
            imageView.setTag(2131361842, d);
            if (a.wv.e(d, ":linux")) {
                drawable = this.j;
            } else {
                try {
                    drawable = this.h.M1(d);
                } catch (java.lang.Exception unused) {
                }
                if (drawable == null) {
                    drawable = this.i;
                }
            }
            imageView.setImageDrawable(drawable);
        }
        return view;
    }
}
