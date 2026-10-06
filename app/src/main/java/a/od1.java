package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class od1 extends a.uu0 implements a.qo0 {
    public static final a.od1 e = new a.od1(0);
    public static final a.od1 f = new a.od1(1);
    public static final a.od1 g = new a.od1(2);
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ od1(int i) {
        super(0);
        this.d = i;
    }

    @Override // a.qo0
    public final java.lang.Object b() {
        switch (this.d) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                java.lang.String str = android.os.Build.MODEL;
                a.wv.v(str, "MODEL");
                java.util.regex.Pattern compile = java.util.regex.Pattern.compile(" +");
                a.wv.v(compile, "compile(pattern)");
                java.lang.String replaceAll = compile.matcher(str).replaceAll("");
                a.wv.v(replaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
                java.util.Locale locale = java.util.Locale.ENGLISH;
                return a.ai1.k(locale, "ENGLISH", replaceAll, locale, "this as java.lang.String).toLowerCase(locale)");
            case 1:
                a.cp cpVar = com.omarea.Scene.c;
                return a.fs1.t().getSharedPreferences("global", 0);
            default:
                return new a.t10();
        }
    }
}
