package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class a81 {

    /* renamed from: a, reason: collision with root package name */
    public static final a.jb1 f5a = new a.jb1();
    public static final java.lang.Object b = new java.lang.Object();
    public static a.gy c = null;

    public static long a(android.content.Context context) {
        android.content.pm.PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return android.os.Build.VERSION.SDK_INT >= 33 ? a.y71.a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [a.gy, java.lang.Object] */
    public static a.gy b() {
        a.gy obj = new a.gy();
        c = obj;
        a.jb1 jb1Var = f5a;
        jb1Var.getClass();
        if (a.q.f.p(jb1Var, null, obj)) {
            a.q.b(jb1Var);
        }
        return c;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(21:14|(1:79)(1:18)|19|(1:78)(1:23)|24|25|26|(2:64|65)(1:28)|29|(8:36|(1:40)|(1:59)(1:47)|48|(2:55|56)|52|53|54)|(1:63)|(1:40)|(1:42)|59|48|(1:50)|55|56|52|53|54) */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x009d, code lost:
    
        r4 = 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void c(android.content.Context r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a81.c(android.content.Context, boolean):void");
    }
}
