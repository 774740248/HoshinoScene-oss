package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class kh0 {
    public static boolean e;

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f291a;
    public final android.view.View b;
    public final android.view.WindowManager.LayoutParams c;
    public final android.view.WindowManager d;

    public kh0(android.content.Context context) {
        a.wv.w(context, "mContext");
        this.f291a = context;
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(2131558579, (android.view.ViewGroup) null);
        a.wv.v(inflate, "from(mContext).inflate(R…t.fw_quickly_grant, null)");
        this.b = inflate;
        android.view.WindowManager.LayoutParams layoutParams = new android.view.WindowManager.LayoutParams();
        layoutParams.height = -1;
        layoutParams.width = -1;
        layoutParams.screenOrientation = -1;
        layoutParams.type = 2003;
        if (context instanceof android.accessibilityservice.AccessibilityService) {
            layoutParams.type = 2032;
        } else {
            layoutParams.type = 2038;
        }
        layoutParams.format = -3;
        layoutParams.x = 0;
        layoutParams.y = 0;
        layoutParams.flags = 1064;
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            layoutParams.layoutInDisplayCutoutMode = 1;
        }
        this.c = layoutParams;
        java.lang.Object systemService = context.getSystemService("window");
        a.wv.t(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        this.d = (android.view.WindowManager) systemService;
    }

    public final void a() {
        if (e) {
            this.d.removeView(this.b);
            e = false;
        }
    }

    public final void b(java.lang.String str, java.lang.String str2) {
        if (e) {
            return;
        }
        android.view.WindowManager.LayoutParams layoutParams = this.c;
        android.view.View view = this.b;
        this.d.addView(view, layoutParams);
        e = true;
        a.wv.M0(a.wv.b(a.z80.b), null, new a.jh0(new a.mo(this.f291a, 0, 6, 0).K1(str), str2, this, null), 3);
        view.setOnKeyListener(new a.wg0(2, this));
        view.setOnTouchListener(new a.aa0(3, this));
        view.findViewById(2131362098).setOnClickListener(new a.sg(this, str, str2, 27));
        view.findViewById(2131362097).setOnClickListener(new a.fh0(1, this));
    }
}
