package com.omarea.ui.procs;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ProcessGroupView extends android.widget.FrameLayout {
    public static final /* synthetic */ int t = 0;
    public a.bp0 c;
    public final androidx.recyclerview.widget.RecyclerView d;
    public final a.d71 e;
    public final java.util.HashSet f;
    public final java.util.HashSet g;
    public java.util.ArrayList h;
    public java.util.ArrayList i;
    public java.lang.String j;
    public int k;
    public int l;
    public final a.mo m;
    public final android.graphics.drawable.Drawable n;
    public final android.graphics.drawable.Drawable o;
    public final android.content.SharedPreferences p;
    public final a.ab1 q;
    public final android.content.pm.PackageManager r;
    public final a.q71 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProcessGroupView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a.wv.w(context, "context");
        androidx.recyclerview.widget.RecyclerView recyclerView = new androidx.recyclerview.widget.RecyclerView(context, null);
        recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(1));
        recyclerView.setItemAnimator(null);
        recyclerView.setOverScrollMode(2);
        recyclerView.setClipToPadding(false);
        recyclerView.setHasFixedSize(false);
        this.d = recyclerView;
        a.d71 d71Var = new a.d71(this);
        this.e = d71Var;
        this.f = new java.util.HashSet(32);
        this.g = new java.util.HashSet(16);
        this.h = new java.util.ArrayList();
        this.i = new java.util.ArrayList();
        this.j = "";
        this.k = 4;
        this.l = 32;
        int i = 256;
        this.m = new a.mo(context, i, 4, 0);
        java.lang.Object obj = a.zx.f748a;
        this.n = a.xx.b(context, 2131231235);
        this.o = a.xx.b(context, 2131231236);
        this.p = context.getSharedPreferences("ProcessNameCache", 0);
        this.q = new a.ab1(".*\\..*");
        this.r = context.getPackageManager();
        this.s = new a.q71(context);
        addView(recyclerView, new android.widget.FrameLayout.LayoutParams(-1, -1));
        recyclerView.setAdapter(d71Var);
        new a.y61(recyclerView);
        a.wv.M0(a.wv.b(a.z80.b), null, new a.a71(this, null), 3);
    }

    public static final java.lang.String a(com.omarea.ui.procs.ProcessGroupView processGroupView, float f) {
        processGroupView.getClass();
        float rint = ((float) java.lang.Math.rint(f * 10.0f)) / 10.0f;
        int i = (int) rint;
        if (rint == i) {
            return a.ai1.c(i, "%");
        }
        return rint + "%";
    }

    public static final java.lang.String b(com.omarea.ui.procs.ProcessGroupView processGroupView, long j) {
        processGroupView.getClass();
        if (j > 8192) {
            return a.ai1.c((int) (j / 1024), "MB");
        }
        return j + "KB";
    }

    public static final java.lang.String c(com.omarea.ui.procs.ProcessGroupView processGroupView, a.z61 z61Var) {
        processGroupView.getClass();
        java.lang.String str = z61Var.c;
        if (str.length() == 0) {
            str = z61Var.b;
            if (str.length() == 0) {
                java.lang.String string = processGroupView.getContext().getString(2131953267);
                a.wv.v(string, "{\n            context.ge…_group_unknown)\n        }");
                str = string;
            }
        }
        return str + " (" + z61Var.f + ")";
    }

    public static final android.text.SpannableString d(com.omarea.ui.procs.ProcessGroupView processGroupView, java.lang.String str) {
        processGroupView.getClass();
        android.text.SpannableString spannableString = new android.text.SpannableString(str);
        if (processGroupView.j.length() != 0) {
            java.util.Locale locale = java.util.Locale.ENGLISH;
            java.lang.String k = a.ai1.k(locale, "ENGLISH", str, locale, "this as java.lang.String).toLowerCase(locale)");
            java.lang.String lowerCase = processGroupView.j.toLowerCase(locale);
            a.wv.v(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            int m2 = a.yi1.m2(k, lowerCase, 0, false, 6);
            if (m2 >= 0) {
                spannableString.setSpan(new android.text.style.ForegroundColorSpan(android.graphics.Color.parseColor("#0094ff")), m2, processGroupView.j.length() + m2, 33);
            }
        }
        return spannableString;
    }

    public static java.lang.String h(com.omarea.model.ProcessInfo processInfo) {
        java.lang.String str = processInfo.name;
        if (str == null) {
            return "";
        }
        int l2 = a.yi1.l2(str, ':', false, 6);
        if (l2 < 0) {
            return str;
        }
        java.lang.String substring = str.substring(0, l2);
        a.wv.v(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0014, code lost:
    
        if (r2.p.contains(h(r3)) == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean e(com.omarea.model.ProcessInfo r3) {
        /*
            r2 = this;
            java.lang.String r0 = r3.name
            if (r0 == 0) goto L16
            int r0 = r0.length()
            if (r0 <= 0) goto L16
            java.lang.String r0 = h(r3)
            android.content.SharedPreferences r1 = r2.p
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
            a.ab1 r0 = r2.q
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
        throw new UnsupportedOperationException("Method not decompiled: com.omarea.ui.procs.ProcessGroupView.e(com.omarea.model.ProcessInfo):boolean");
    }

    public final void f() {
        android.content.pm.PackageManager packageManager = this.r;
        java.util.Iterator it = this.h.iterator();
        while (it.hasNext()) {
            com.omarea.model.ProcessInfo processInfo = (com.omarea.model.ProcessInfo) it.next();
            a.wv.v(processInfo, "item");
            if (e(processInfo)) {
                java.lang.String str = processInfo.name;
                android.content.SharedPreferences sharedPreferences = this.p;
                if (sharedPreferences.contains(str)) {
                    java.lang.String str2 = processInfo.name;
                    processInfo.friendlyName = sharedPreferences.getString(str2, str2);
                } else {
                    java.lang.String h = h(processInfo);
                    try {
                        try {
                            android.content.pm.ApplicationInfo applicationInfo = packageManager.getApplicationInfo(h, 0);
                            a.wv.v(applicationInfo, "pm.getApplicationInfo(name, 0)");
                            java.lang.CharSequence loadLabel = applicationInfo.loadLabel(packageManager);
                            java.lang.StringBuilder sb = new java.lang.StringBuilder();
                            sb.append((java.lang.Object) loadLabel);
                            processInfo.friendlyName = sb.toString();
                        } catch (java.lang.Exception unused) {
                            processInfo.friendlyName = h;
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

    /* JADX WARN: Removed duplicated region for block: B:105:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0267 A[EDGE_INSN: B:141:0x0267->B:136:0x0267 BREAK  A[LOOP:4: B:121:0x0237->B:138:0x0237], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g() {
        /*
            Method dump skipped, instructions count: 969
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.omarea.ui.procs.ProcessGroupView.g():void");
    }

    public final a.bp0 getOnProcessClick() {
        return this.c;
    }

    public final void i(java.lang.String str) {
        a.wv.w(str, "keywords");
        if (a.wv.e(this.j, str)) {
            return;
        }
        this.j = str;
        this.g.clear();
        g();
    }

    public final java.util.HashSet j() {
        if (this.j.length() == 0) {
            return this.f;
        }
        java.util.HashSet hashSet = new java.util.HashSet(this.i.size() * 2);
        java.util.Iterator it = this.i.iterator();
        while (it.hasNext()) {
            a.r71 r71Var = (a.r71) it.next();
            if (!this.g.contains(r71Var.f485a)) {
                hashSet.add(r71Var.f485a);
            }
        }
        return hashSet;
    }

    public final void setList(java.util.ArrayList<com.omarea.model.ProcessInfo> arrayList) {
        a.wv.w(arrayList, "processes");
        this.h = arrayList;
        f();
        g();
    }

    public final void setOnProcessClick(a.bp0 bp0Var) {
        this.c = bp0Var;
    }
}
