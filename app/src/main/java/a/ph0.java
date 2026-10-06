package a;

import android.view.View.OnTouchListener;
/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ph0 {
    public static final a.fa0 i = new a.fa0(25, 0);
    public static android.view.View j;
    public static boolean k;
    public static long l;
    public static long m;
    public static java.util.Timer n;

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f435a;
    public final android.os.Handler b;
    public final a.nk c;
    public a.rj d;
    public int e;
    public int f;
    public final a.ab1 g;
    public final android.content.pm.PackageManager h;

    public ph0(android.content.Context context) {
        a.wv.w(context, "context");
        this.f435a = context;
        this.b = new android.os.Handler(android.os.Looper.getMainLooper());
        a.cp cpVar = com.omarea.Scene.c;
        this.c = new a.nk(a.fs1.t(), 14);
        this.g = new a.ab1(".*\\..*");
        this.h = context.getPackageManager();
    }

    public final void a(boolean z) {
        java.util.Timer timer = n;
        if (timer != null) {
            timer.cancel();
            n = null;
        }
        android.view.View view = j;
        if (view != null) {
            java.lang.Object systemService = view.getContext().getSystemService("window");
            a.wv.t(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            ((android.view.WindowManager) systemService).removeViewImmediate(j);
            j = null;
            this.d = null;
        }
        if (z) {
            a.cp cpVar = com.omarea.Scene.c;
            a.fs1.N("monitor_task", false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, android.view.View$OnTouchListener] */
    /* JADX WARN: Type inference failed for: r1v5, types: [a.ka1, java.lang.Object] */
    public final void b() {
        android.widget.ImageView imageView;
        if (j != null) {
            return;
        }
        a.cp cpVar = com.omarea.Scene.c;
        final int i2 = 1;
        a.fs1.N("monitor_task", true);
        final int i3 = 0;
        k = false;
        a.vj1 vj1Var = a.ql1.f470a;
        android.content.Context context = this.f435a;
        boolean d = a.ql1.d(context);
        android.content.res.Configuration configuration = new android.content.res.Configuration(context.getResources().getConfiguration());
        configuration.uiMode = (configuration.uiMode & (-49)) | (d ? 32 : 16);
        android.view.View inflate = android.view.LayoutInflater.from(new android.view.ContextThemeWrapper(context.createConfigurationContext(configuration), d ? 2132017168 : 2132017171)).inflate(2131558576, (android.view.ViewGroup) null);
        j = inflate;
        if (d && inflate != null && (imageView = (android.widget.ImageView) inflate.findViewById(2131362549)) != null) {
            imageView.setColorFilter(-1);
        }
        android.view.View view = j;
        final android.widget.ListView listView = view != null ? (android.widget.ListView) view.findViewById(2131362993) : 0;
        a.wv.s(listView);
        android.content.Context context2 = listView.getContext();
        a.wv.v(context2, "process_list.context");
        a.rj rjVar = new a.rj(context2);
        this.d = rjVar;
        listView.setAdapter((android.widget.ListAdapter) rjVar);
        listView.setOnTouchListener((OnTouchListener) (new java.lang.Object()));
        android.view.View view2 = j;
        android.widget.ImageView imageView2 = view2 != null ? (android.widget.ImageView) view2.findViewById(2131362551) : null;
        a.wv.s(imageView2);
        android.view.View view3 = j;
        android.widget.TextView textView = view3 != null ? (android.widget.TextView) view3.findViewById(2131362989) : null;
        a.wv.s(textView);
        android.view.View view4 = j;
        android.view.View findViewById = view4 != null ? view4.findViewById(2131362554) : null;
        a.wv.s(findViewById);
        a.ka1 obj = new a.ka1();
        obj.c = 32;
        textView.setOnClickListener(new a.d41(obj, listView, textView, this, 15));
        a.ka1 obj2 = new a.ka1();
        listView.setOnItemLongClickListener(new a.mh0());
        listView.setOnItemClickListener(new a.r3(listView, this, obj2, 2));
        findViewById.setOnClickListener(new a.nh0(this));
        android.view.View view5 = j;
        android.widget.ImageView imageView3 = view5 != null ? (android.widget.ImageView) view5.findViewById(2131362549) : null;
        a.wv.s(imageView3);
        imageView3.setOnClickListener(new a.nh0(this));
        imageView2.setOnClickListener(new a.x8(listView, textView, imageView3, imageView2, this, 8));
        android.content.SharedPreferences sharedPreferences = context.getSharedPreferences("monitor", 0);
        java.lang.Object systemService = context.getSystemService("window");
        a.wv.t(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        android.view.WindowManager windowManager = (android.view.WindowManager) systemService;
        android.view.WindowManager.LayoutParams layoutParams = new android.view.WindowManager.LayoutParams();
        layoutParams.type = 2003;
        int i4 = android.os.Build.VERSION.SDK_INT;
        layoutParams.type = 2038;
        layoutParams.format = -3;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.gravity = 8388659;
        this.e = sharedPreferences.getInt("process_x", 0);
        int i5 = sharedPreferences.getInt("process_y", 0);
        this.f = i5;
        layoutParams.x = this.e;
        layoutParams.y = i5;
        layoutParams.flags = 1064;
        if (i4 >= 28) {
            layoutParams.layoutInDisplayCutoutMode = 1;
        }
        windowManager.addView(j, layoutParams);
        android.view.View view6 = j;
        a.wv.s(view6);
        view6.setOnTouchListener(new a.oh0(layoutParams, windowManager, this, sharedPreferences));
        android.view.View view7 = j;
        android.view.View findViewById2 = view7 != null ? view7.findViewById(2131362554) : null;
        a.wv.s(findViewById2);
        findViewById2.setOnLongClickListener(new a.ni(layoutParams, 4, windowManager));
        c();
    }

    public final void c() {
        java.util.Timer timer = n;
        if (timer != null) {
            timer.cancel();
            n = null;
        }
        if (n == null) {
            java.util.Timer timer2 = new java.util.Timer("FloatTaskManager");
            n = timer2;
            timer2.schedule(new a.hr(9, this), 0L, 3000L);
        }
    }
}
