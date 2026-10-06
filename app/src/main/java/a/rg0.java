package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class rg0 {
    public static final a.fa0 u = new a.fa0(21, 0);
    public static int v;
    public static a.qi1 w;
    public static android.view.View x;

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f495a;
    public final android.content.SharedPreferences b;
    public final android.view.View c;
    public final android.widget.TextView d;
    public final android.view.View e;
    public final android.view.View f;
    public final android.view.View g;
    public final android.widget.TextView h;
    public final a.nk i;
    public final a.m11 j;
    public final android.os.Handler k;
    public boolean l;
    public a.am1 m;
    public java.lang.String n;
    public long o;
    public final a.hk p;
    public final android.view.WindowManager.LayoutParams q;
    public final android.view.WindowManager r;
    public java.lang.String s;
    public final a.em1 t;

    public rg0(android.content.Context context) {
        a.wv.w(context, "mContext");
        this.f495a = context;
        int i = 0;
        android.content.SharedPreferences sharedPreferences = context.getSharedPreferences("monitor", 0);
        this.b = sharedPreferences;
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(2131558581, (android.view.ViewGroup) null);
        a.wv.v(inflate, "from(mContext).inflate(R.layout.fw_threads, null)");
        this.c = inflate;
        android.view.View findViewById = inflate.findViewById(2131362581);
        a.wv.v(findViewById, "view.findViewById(R.id.fw_title)");
        this.d = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = inflate.findViewById(2131362538);
        a.wv.v(findViewById2, "view.findViewById(R.id.fw_back)");
        this.e = findViewById2;
        android.view.View findViewById3 = inflate.findViewById(2131362579);
        a.wv.v(findViewById3, "view.findViewById(R.id.fw_thread_list)");
        this.f = findViewById3;
        android.view.View findViewById4 = inflate.findViewById(2131362577);
        a.wv.v(findViewById4, "view.findViewById(R.id.fw_thread_detail)");
        this.g = findViewById4;
        android.view.View findViewById5 = inflate.findViewById(2131362578);
        a.wv.v(findViewById5, "view.findViewById(R.id.fw_thread_detail_info)");
        this.h = (android.widget.TextView) findViewById5;
        a.cp cpVar = com.omarea.Scene.c;
        this.i = new a.nk(a.fs1.t(), 14);
        this.j = new a.m11();
        this.k = new android.os.Handler(android.os.Looper.getMainLooper());
        this.n = "Threads";
        this.o = 1000L;
        a.hk hkVar = new a.hk(context, new a.b10(9, this));
        this.p = hkVar;
        android.view.WindowManager.LayoutParams layoutParams = new android.view.WindowManager.LayoutParams();
        layoutParams.height = -2;
        layoutParams.width = -2;
        layoutParams.screenOrientation = -1;
        layoutParams.gravity = 8388659;
        layoutParams.flags = 1064;
        if (context instanceof android.accessibilityservice.AccessibilityService) {
            layoutParams.type = 2032;
        } else {
            layoutParams.type = 2038;
        }
        layoutParams.format = -3;
        int i2 = android.os.Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            layoutParams.x = sharedPreferences.getInt("thread_x", 0);
            layoutParams.y = sharedPreferences.getInt("thread_y", 0);
        } else {
            layoutParams.x = 0;
            layoutParams.y = 0;
        }
        if (i2 >= 28) {
            layoutParams.layoutInDisplayCutoutMode = 1;
        }
        this.q = layoutParams;
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) inflate.findViewById(2131362580);
        recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(1));
        recyclerView.setAdapter(hkVar);
        findViewById2.setOnClickListener(new a.og0(this, i));
        java.lang.Object systemService = context.getSystemService("window");
        a.wv.t(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        this.r = (android.view.WindowManager) systemService;
        this.s = "";
        this.t = new a.em1();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, a.ma1] */
    /* JADX WARN: Type inference failed for: r1v8, types: [a.l11, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(a.rg0 r9, a.ey r10) {
        /*
            Method dump skipped, instructions count: 452
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.rg0.a(a.rg0, a.ey):java.lang.Object");
    }

    public final void b() {
        a.qi1 qi1Var = w;
        if (qi1Var != null) {
            a.wv.p(qi1Var);
        }
        w = null;
        d();
        android.view.View view = x;
        if (view != null) {
            a.l11 systemService = (l11) view.getContext().getSystemService("window");
            a.wv.t(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            ((android.view.WindowManager) systemService).removeViewImmediate(x);
            x = null;
        }
    }

    public final void c(java.lang.String str, int i) {
        a.wv.w(str, "pName");
        b();
        if (i > 0) {
            v = i;
            this.s = str;
        } else {
            v = 0;
            this.s = "";
        }
        if (u.r()) {
            return;
        }
        d();
        android.view.WindowManager.LayoutParams layoutParams = this.q;
        android.view.WindowManager windowManager = this.r;
        android.view.View view = this.c;
        windowManager.addView(view, layoutParams);
        view.setOnTouchListener(new a.uf0(this));
        view.findViewById(2131362227).setOnClickListener(new a.og0(this, 1));
        x = view;
        e();
    }

    public final void d() {
        this.m = null;
        this.l = false;
        this.g.setVisibility(8);
        this.f.setVisibility(0);
        this.e.setVisibility(8);
        this.d.setText(this.n);
        this.o = 1000L;
        e();
    }

    public final void e() {
        a.qi1 qi1Var = w;
        if (qi1Var != null) {
            a.wv.p(qi1Var);
        }
        w = null;
        w = a.wv.M0(a.wv.b(a.z80.b), null, new a.pg0(this, null), 3);
    }
}
