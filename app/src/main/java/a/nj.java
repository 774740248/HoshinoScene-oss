package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class nj extends a.e91 {
    public final android.content.Context f;
    public java.util.ArrayList g;
    public java.lang.String h;
    public int i;
    public int j;
    public a.bp0 k;
    public final a.mo l;
    public final android.graphics.drawable.Drawable m;
    public final android.graphics.drawable.Drawable n;
    public final android.content.pm.PackageManager o;
    public java.util.ArrayList p;
    public final android.content.SharedPreferences q;
    public final a.ab1 r;

    public nj(android.content.Context context) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        a.wv.w(context, "context");
        this.f = context;
        this.g = arrayList;
        this.h = "";
        this.i = 4;
        this.j = 32;
        this.l = new a.mo(context, 256, 4, 0);
        java.lang.Object obj = a.zx.f748a;
        this.m = a.xx.b(context, 2131231235);
        this.n = a.xx.b(context, 2131231236);
        this.o = context.getPackageManager();
        this.q = context.getSharedPreferences("ProcessNameCache", 0);
        o();
        s();
        a.wv.M0(a.wv.b(a.z80.b), null, new a.kj(this, null), 3);
        a.wv.v(java.util.regex.Pattern.compile("u[0-9]+_.*"), "compile(pattern)");
        this.r = new a.ab1(".*\\..*");
    }

    public static final android.text.SpannableString p(a.nj njVar, java.lang.String str) {
        njVar.getClass();
        android.text.SpannableString spannableString = new android.text.SpannableString(str);
        if (njVar.h.length() != 0) {
            java.util.Locale locale = java.util.Locale.ROOT;
            java.lang.String lowerCase = str.toLowerCase(locale);
            a.wv.v(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            java.lang.String lowerCase2 = njVar.h.toLowerCase(locale);
            a.wv.v(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            int m2 = a.yi1.m2(lowerCase, lowerCase2, 0, false, 6);
            if (m2 >= 0) {
                spannableString.setSpan(new android.text.style.ForegroundColorSpan(android.graphics.Color.parseColor("#0094ff")), m2, njVar.h.length() + m2, 33);
            }
        }
        return spannableString;
    }

    @Override // a.e91
    public final int c() {
        java.util.ArrayList arrayList = this.p;
        if (arrayList != null) {
            return arrayList.size();
        }
        a.wv.M1("list");
        throw null;
    }

    @Override // a.e91
    public final long d(int i) {
        if (this.p != null) {
            return ((com.omarea.model.ProcessInfo) this.p.get(i)).pid;
        }
        a.wv.M1("list");
        throw null;
    }

    @Override // a.e91
    public final void i(a.da1 da1Var, int i) {
        java.lang.String str;
        a.lj ljVar = (a.lj) da1Var;
        java.util.ArrayList arrayList = this.p;
        android.graphics.drawable.Drawable drawable = null;
        if (arrayList == null) {
            a.wv.M1("list");
            throw null;
        }
        java.lang.Object obj = arrayList.get(i);
        a.wv.v(obj, "list[position]");
        com.omarea.model.ProcessInfo processInfo = (com.omarea.model.ProcessInfo) obj;
        boolean e = a.wv.e(processInfo.friendlyName, processInfo.name);
        android.widget.TextView textView = ljVar.v;
        android.widget.TextView textView2 = ljVar.w;
        a.nj njVar = ljVar.A;
        if (e) {
            java.lang.String str2 = processInfo.friendlyName;
            a.wv.v(str2, "processInfo.friendlyName");
            textView.setText(p(njVar, str2));
            textView2.setVisibility(8);
            textView2.setText("");
        } else {
            java.lang.String str3 = processInfo.friendlyName;
            a.wv.v(str3, "processInfo.friendlyName");
            textView.setText(p(njVar, str3));
            textView2.setVisibility(0);
            java.lang.String str4 = processInfo.name;
            a.wv.v(str4, "processInfo.name");
            textView2.setText(p(njVar, str4));
        }
        ljVar.x.setText(p(njVar, java.lang.String.valueOf(processInfo.pid)));
        ljVar.z.setText(processInfo.getCpu() + "%");
        long j = processInfo.res;
        if (j > 8192) {
            str = a.ai1.c((int) (j / 1024), "MB");
        } else {
            str = j + "KB";
        }
        ljVar.y.setText(str);
        if (njVar.q(processInfo)) {
            try {
                a.mo moVar = njVar.l;
                java.lang.String str5 = processInfo.name;
                a.wv.v(str5, "item.name");
                drawable = moVar.M1((java.lang.String) a.qv.e2(a.yi1.y2(str5, new java.lang.String[]{":"})));
            } catch (java.lang.Exception unused) {
            }
            if (drawable == null) {
                drawable = njVar.m;
            }
        } else {
            drawable = njVar.n;
        }
        ljVar.u.setImageDrawable(drawable);
    }

    @Override // a.e91
    public final a.da1 k(androidx.recyclerview.widget.RecyclerView recyclerView, int i) {
        a.wv.w(recyclerView, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(recyclerView.getContext()).inflate(2131558649, (android.view.ViewGroup) recyclerView, false);
        a.wv.v(inflate, "view");
        return new a.lj(this, inflate);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0040, code lost:
    
        if (r6.q.contains(r0) == false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean q(com.omarea.model.ProcessInfo r7) {
        /*
            r6 = this;
            java.lang.String r0 = r7.name
            java.lang.String r1 = "processInfo.name"
            r2 = 0
            if (r0 == 0) goto L42
            int r0 = r0.length()
            if (r0 <= 0) goto L42
            java.lang.String r0 = r7.name
            if (r0 != 0) goto L14
            java.lang.String r0 = ""
            goto L3a
        L14:
            java.lang.String r3 = ":"
            boolean r0 = a.yi1.g2(r0, r3)
            if (r0 == 0) goto L35
            java.lang.String r0 = r7.name
            a.wv.v(r0, r1)
            java.lang.String r4 = r7.name
            a.wv.v(r4, r1)
            r5 = 6
            int r3 = a.yi1.m2(r4, r3, r2, r2, r5)
            java.lang.String r0 = r0.substring(r2, r3)
            java.lang.String r3 = "this as java.lang.String…ing(startIndex, endIndex)"
            a.wv.v(r0, r3)
            goto L3a
        L35:
            java.lang.String r0 = r7.name
            a.wv.v(r0, r1)
        L3a:
            android.content.SharedPreferences r3 = r6.q
            boolean r0 = r3.contains(r0)
            if (r0 != 0) goto L5e
        L42:
            java.lang.String r0 = r7.command
            java.lang.String r3 = "processInfo.command"
            a.wv.v(r0, r3)
            java.lang.String r3 = "app_process"
            boolean r0 = a.yi1.g2(r0, r3)
            if (r0 == 0) goto L5f
            java.lang.String r7 = r7.name
            a.wv.v(r7, r1)
            a.ab1 r0 = r6.r
            boolean r7 = r0.c(r7)
            if (r7 == 0) goto L5f
        L5e:
            r2 = 1
        L5f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: a.nj.q(com.omarea.model.ProcessInfo):boolean");
    }

    public final void r() {
        java.lang.String str;
        android.content.pm.PackageManager packageManager = this.o;
        java.util.Iterator it = this.g.iterator();
        while (it.hasNext()) {
            com.omarea.model.ProcessInfo processInfo = (com.omarea.model.ProcessInfo) it.next();
            a.wv.v(processInfo, "item");
            if (q(processInfo)) {
                java.lang.String str2 = processInfo.name;
                android.content.SharedPreferences sharedPreferences = this.q;
                if (sharedPreferences.contains(str2)) {
                    java.lang.String str3 = processInfo.name;
                    processInfo.friendlyName = sharedPreferences.getString(str3, str3);
                } else {
                    java.lang.String str4 = processInfo.name;
                    a.wv.v(str4, "item.name");
                    if (a.yi1.g2(str4, ":")) {
                        java.lang.String str5 = processInfo.name;
                        a.wv.v(str5, "item.name");
                        java.lang.String str6 = processInfo.name;
                        a.wv.v(str6, "item.name");
                        str = str5.substring(0, a.yi1.m2(str6, ":", 0, false, 6));
                        a.wv.v(str, "this as java.lang.String…ing(startIndex, endIndex)");
                    } else {
                        str = processInfo.name;
                    }
                    try {
                        try {
                            android.content.pm.ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 0);
                            a.wv.v(applicationInfo, "pm.getApplicationInfo(name, 0)");
                            java.lang.CharSequence loadLabel = applicationInfo.loadLabel(packageManager);
                            java.lang.StringBuilder sb = new java.lang.StringBuilder();
                            sb.append((java.lang.Object) loadLabel);
                            processInfo.friendlyName = sb.toString();
                        } catch (java.lang.Exception unused) {
                            processInfo.friendlyName = str;
                        }
                    } finally {
                        sharedPreferences.edit().putString(processInfo.name, processInfo.friendlyName).apply();
                    }
                }
            } else {
                processInfo.friendlyName = processInfo.name;
            }
        }
    }

    public final void s() {
        java.lang.String str = this.h;
        java.util.Locale locale = java.util.Locale.ENGLISH;
        java.lang.String k = a.ai1.k(locale, "ENGLISH", str, locale, "this as java.lang.String).toLowerCase(locale)");
        boolean z = k.length() == 0;
        java.util.ArrayList arrayList = this.g;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : arrayList) {
            com.omarea.model.ProcessInfo processInfo = (com.omarea.model.ProcessInfo) obj;
            if (!z) {
                java.lang.String str2 = processInfo.friendlyName;
                a.wv.v(str2, "item.friendlyName");
                java.util.Locale locale2 = java.util.Locale.ENGLISH;
                if (!a.yi1.g2(a.ai1.k(locale2, "ENGLISH", str2, locale2, "this as java.lang.String).toLowerCase(locale)"), k)) {
                    java.lang.String str3 = processInfo.name;
                    a.wv.v(str3, "item.name");
                    java.lang.String lowerCase = str3.toLowerCase(locale2);
                    a.wv.v(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                    if (!a.yi1.g2(lowerCase, k)) {
                        java.lang.String str4 = processInfo.user;
                        a.wv.v(str4, "item.user");
                        java.lang.String lowerCase2 = str4.toLowerCase(locale2);
                        a.wv.v(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
                        if (!a.yi1.g2(lowerCase2, k)) {
                            java.lang.String str5 = processInfo.command;
                            a.wv.v(str5, "item.command");
                            java.lang.String lowerCase3 = str5.toLowerCase(locale2);
                            a.wv.v(lowerCase3, "this as java.lang.String).toLowerCase(locale)");
                            if (!a.yi1.g2(lowerCase3, k)) {
                                java.lang.String str6 = processInfo.cmdline;
                                a.wv.v(str6, "item.cmdline");
                                java.lang.String lowerCase4 = str6.toLowerCase(locale2);
                                a.wv.v(lowerCase4, "this as java.lang.String).toLowerCase(locale)");
                                if (!a.yi1.g2(lowerCase4, k) && !a.yi1.g2(java.lang.String.valueOf(processInfo.pid), k)) {
                                }
                            }
                        }
                    }
                }
            }
            int i = this.j;
            if (i != 1) {
                if (i != 4) {
                    if (i == 32 && !q(processInfo)) {
                    }
                } else if (!q(processInfo)) {
                }
            }
            arrayList2.add(obj);
        }
        this.p = new java.util.ArrayList(a.qv.s2(arrayList2, new a.u61(5, this)));
        f();
    }
}
