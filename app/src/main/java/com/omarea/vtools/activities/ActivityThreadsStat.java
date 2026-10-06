package com.omarea.vtools.activities;

import android.view.View;
/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ActivityThreadsStat extends a.p5 {
    public static final /* synthetic */ a.gu0[] s;
    public final a.yq1 d;
    public final a.yq1 e;
    public final a.yq1 f;
    public final a.yq1 g;
    public final a.yq1 h;
    public final a.yq1 i;
    public final a.yq1 j;
    public final a.yq1 k;
    public final a.r51 l;
    public long m;
    public java.util.List n;
    public a.v01 o;
    public boolean p;
    public a.qo0 q;
    public final android.os.Handler r;

    static {
        a.d81 d81Var = new a.d81(com.omarea.vtools.activities.ActivityThreadsStat.class, "layout_app_bar", "getLayout_app_bar()Landroid/view/View;");
        a.na1.f375a.getClass();
        s = new a.gu0[]{d81Var, new a.d81(com.omarea.vtools.activities.ActivityThreadsStat.class, "threads_show_all", "getThreads_show_all()Landroid/widget/CheckBox;"), new a.d81(com.omarea.vtools.activities.ActivityThreadsStat.class, "export_screenshot", "getExport_screenshot()Landroid/widget/ImageView;"), new a.d81(com.omarea.vtools.activities.ActivityThreadsStat.class, "thread_stats_container", "getThread_stats_container()Landroid/view/View;"), new a.d81(com.omarea.vtools.activities.ActivityThreadsStat.class, "thread_stats", "getThread_stats()Landroidx/recyclerview/widget/RecyclerView;"), new a.d81(com.omarea.vtools.activities.ActivityThreadsStat.class, "chart_session_name", "getChart_session_name()Landroid/widget/TextView;"), new a.d81(com.omarea.vtools.activities.ActivityThreadsStat.class, "chart_session_time", "getChart_session_time()Landroid/widget/TextView;"), new a.d81(com.omarea.vtools.activities.ActivityThreadsStat.class, "chart_session_logo", "getChart_session_logo()Landroid/widget/ImageView;"), new a.d81(com.omarea.vtools.activities.ActivityThreadsStat.class, "chart_view_size", "getChart_view_size()Landroid/widget/TextView;")};
    }

    public ActivityThreadsStat() {
        a.b20.i(this, 2131362729);
        this.d = a.b20.i(this, 2131363287);
        this.e = a.b20.i(this, 2131362468);
        this.f = a.b20.i(this, 2131363286);
        this.g = a.b20.i(this, 2131363285);
        this.h = a.b20.i(this, 2131362203);
        this.i = a.b20.i(this, 2131362204);
        this.j = a.b20.i(this, 2131362202);
        this.k = a.b20.i(this, 2131362215);
        a.cp cpVar = com.omarea.Scene.c;
        this.l = new a.r51(a.fs1.t());
        this.m = -1L;
        this.n = a.qb0.c;
        this.r = new android.os.Handler(android.os.Looper.getMainLooper());
    }

    public final void o() {
        a.v01 v01Var = this.o;
        if (v01Var == null) {
            return;
        }
        androidx.recyclerview.widget.RecyclerView p = p();
        android.content.Context context = getContext();
        long j = this.m;
        java.util.List s2 = a.qv.s2(this.n, new a.py(25));
        if (!this.p && s2.size() > 20) {
            s2 = a.qv.t2(s2, 15);
        }
        p.setAdapter(new a.jk(context, j, s2, v01Var));
        ((android.widget.CheckBox) this.d.a(s[1])).setVisibility(this.n.size() > 20 ? 0 : 8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00ad, code lost:
    
        if (r10 != null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00af, code lost:
    
        r8 = r10.longValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00b3, code lost:
    
        r10 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00be, code lost:
    
        if (r1 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00c0, code lost:
    
        r8 = r1.getString("sessionName");
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00c8, code lost:
    
        if (r1 == null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00ca, code lost:
    
        r1 = r1.getString("appName");
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00d0, code lost:
    
        if (r1 != null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00d3, code lost:
    
        r9 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00db, code lost:
    
        if (r14 == null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00dd, code lost:
    
        r1 = r14.packageVersion;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00e1, code lost:
    
        if (r8 == null) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00e7, code lost:
    
        if (r8.length() != 0) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0122, code lost:
    
        if (r14 == null) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0124, code lost:
    
        r12 = r14.viewSize;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0129, code lost:
    
        if (r3 == null) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x012f, code lost:
    
        if (r3.length() != 0) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0132, code lost:
    
        a.wv.M0(a.wv.b(a.z80.f728a), null, new a.lg(r13, r3, null), 3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0140, code lost:
    
        r13.r.post(new a.gg(r13, r4, r6, r7, r8, r9, r10, r12));
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x014c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0128, code lost:
    
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00e9, code lost:
    
        if (r9 == null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ef, code lost:
    
        if (r9.length() != 0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00f2, code lost:
    
        if (r1 == null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00f8, code lost:
    
        if (r1.length() != 0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00fb, code lost:
    
        r8 = r9 + "(" + r1 + ")";
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0116, code lost:
    
        if (r9 == null) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x011c, code lost:
    
        if (r9.length() != 0) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x011f, code lost:
    
        r8 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0121, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00e0, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00d5, code lost:
    
        if (r14 == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00d7, code lost:
    
        r1 = r14.appName;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00da, code lost:
    
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00c7, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00bb, code lost:
    
        if (r10 != null) goto L23;
     */
    /* JADX WARN: Type inference failed for: r1v6, types: [a.fp0, a.lj1] */
    @Override // a.p5, a.kk0, androidx.activity.ComponentActivity, a.nw, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r14) {
        /*
            Method dump skipped, instructions count: 333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.omarea.vtools.activities.ActivityThreadsStat.onCreate(android.os.Bundle):void");
    }

    @Override // a.kk0, androidx.activity.ComponentActivity, android.app.Activity, a.k6
    public final void onRequestPermissionsResult(int i, java.lang.String[] strArr, int[] iArr) {
        a.wv.w(strArr, "permissions");
        a.wv.w(iArr, "grantResults");
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == 17) {
            a.qo0 qo0Var = this.q;
            this.q = null;
            java.lang.Integer valueOf = iArr.length != 0 ? java.lang.Integer.valueOf(iArr[0]) : null;
            if (valueOf == null || valueOf.intValue() != 0 || qo0Var == null) {
                return;
            }
            qo0Var.b();
        }
    }

    public final androidx.recyclerview.widget.RecyclerView p() {
        return (androidx.recyclerview.widget.RecyclerView) this.g.a(s[4]);
    }

    public final android.view.View q() {
        return this.f.a(s[3]);
    }
}
