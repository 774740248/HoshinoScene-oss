package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final /* synthetic */ class za1 extends a.pp0 implements a.bp0 {
    public static final a.za1 k = new a.pp0();

    @Override // a.bp0
    public final java.lang.Object i(java.lang.Object obj) {
        a.jy0 jy0Var = (a.jy0) obj;
        a.wv.w(jy0Var, "p0");
        java.util.regex.Matcher matcher = jy0Var.f275a;
        int end = matcher.end() + (matcher.end() == matcher.start() ? 1 : 0);
        java.lang.CharSequence charSequence = jy0Var.b;
        if (end > charSequence.length()) {
            return null;
        }
        java.util.regex.Matcher matcher2 = matcher.pattern().matcher(charSequence);
        a.wv.v(matcher2, "matcher.pattern().matcher(input)");
        if (matcher2.find(end)) {
            return new a.jy0(matcher2, charSequence);
        }
        return null;
    }
}
