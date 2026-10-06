package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class jy0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.regex.Matcher f275a;
    public final java.lang.CharSequence b;
    public final a.iy0 c;

    public jy0(java.util.regex.Matcher matcher, java.lang.CharSequence charSequence) {
        a.wv.w(charSequence, "input");
        this.f275a = matcher;
        this.b = charSequence;
        this.c = new a.iy0(this);
    }

    public final java.lang.String a() {
        java.lang.String group = this.f275a.group();
        a.wv.v(group, "matchResult.group()");
        return group;
    }
}
