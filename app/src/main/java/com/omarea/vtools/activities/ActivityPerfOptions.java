package com.omarea.vtools.activities;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ActivityPerfOptions extends a.p5 implements android.view.View.OnClickListener {
    public static final a.fa0 f;
    public static final /* synthetic */ a.gu0[] g;
    public final a.yq1 d = a.b20.i(this, 2131362969);
    public java.lang.String e;

    static {
        a.d81 d81Var = new a.d81(com.omarea.vtools.activities.ActivityPerfOptions.class, "perf_options", "getPerf_options()Lcom/omarea/sysmbol/PerfOptionsRender;");
        a.na1.f375a.getClass();
        g = new a.gu0[]{d81Var};
        f = new a.fa0(11, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:123:0x018f, code lost:
    
        if (r6.equals("number") == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0168, code lost:
    
        if (r6.equals("decimal") == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x019a, code lost:
    
        r3.h = a.pm.q(r14, "max", 0.0d);
        r3.g = a.pm.q(r14, "min", 999999.99d);
        r3.i = a.pm.q(r14, "step", 0.0d);
     */
    /* JADX WARN: Removed duplicated region for block: B:139:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x03dd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0390 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v33, types: [a.uj1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v10, types: [a.uj1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v9, types: [a.uj1, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList o(java.lang.String r30) {
        /*
            Method dump skipped, instructions count: 1002
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.omarea.vtools.activities.ActivityPerfOptions.o(java.lang.String):java.util.ArrayList");
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        if (view != null) {
            view.getId();
        }
    }

    @Override // a.p5, a.kk0, androidx.activity.ComponentActivity, a.nw, android.app.Activity
    public final void onCreate(android.os.Bundle bundle) {
        android.os.Bundle extras;
        android.os.Bundle extras2;
        super.onCreate(bundle);
        setContentView(2131558464);
        setBackArrow();
        android.content.Intent intent = getIntent();
        setTitle((intent == null || (extras2 = intent.getExtras()) == null || !extras2.containsKey("title")) ? "" : getIntent().getStringExtra("title"));
        android.content.Intent intent2 = getIntent();
        this.e = (intent2 == null || (extras = intent2.getExtras()) == null || !extras.containsKey("store")) ? null : getIntent().getStringExtra("store");
        a.wv.M0(a.wv.b(a.z80.b), null, new a.uc(this, null), 3);
    }
}
