package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ng1 {

    public ng1() {
    }


    /* renamed from: a, reason: collision with root package name */
    public java.lang.CharSequence f381a;
    public java.lang.CharSequence b;
    public java.lang.String c;
    public boolean d;
    public java.lang.Object e;

    public ng1(java.lang.String str, java.lang.String str2) {
        a.wv.w(str, "title");
        a.wv.w(str2, "value");
        this.f381a = str;
        this.c = str2;
    }

    public final void a(java.lang.String str) {
        this.f381a = str;
    }

    public final void b(java.lang.String str) {
        this.c = str;
    }

    public final java.lang.String toString() {
        java.lang.CharSequence charSequence = this.f381a;
        if (charSequence != null && charSequence.length() != 0) {
            java.lang.CharSequence charSequence2 = this.f381a;
            a.wv.s(charSequence2);
            return charSequence2.toString();
        }
        java.lang.String str = this.c;
        if (str == null || str.length() == 0) {
            return "";
        }
        java.lang.String str2 = this.c;
        a.wv.s(str2);
        return str2;
    }
}
