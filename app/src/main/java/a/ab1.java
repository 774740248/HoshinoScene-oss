package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ab1 implements java.io.Serializable {
    public final java.util.regex.Pattern c;

    public ab1(java.lang.String str) {
        java.util.regex.Pattern compile = java.util.regex.Pattern.compile(str);
        a.wv.v(compile, "compile(pattern)");
        this.c = compile;
    }

    public static a.hq0 b(a.ab1 ab1Var, java.lang.CharSequence charSequence) {
        a.wv.w(charSequence, "input");
        if (charSequence.length() >= 0) {
            a.ya1 ya1Var = new a.ya1(ab1Var, charSequence, 0);
            a.za1 za1Var = a.za1.k;
            return new a.hq0(ya1Var);
        }
        throw new java.lang.IndexOutOfBoundsException("Start index out of bounds: 0, input length: " + charSequence.length());
    }

    public final a.jy0 a(int i, java.lang.CharSequence charSequence) {
        a.wv.w(charSequence, "input");
        java.util.regex.Matcher matcher = this.c.matcher(charSequence);
        a.wv.v(matcher, "nativePattern.matcher(input)");
        if (matcher.find(i)) {
            return new a.jy0(matcher, charSequence);
        }
        return null;
    }

    public final boolean c(java.lang.CharSequence charSequence) {
        a.wv.w(charSequence, "input");
        return this.c.matcher(charSequence).matches();
    }

    public final java.util.List d(java.lang.CharSequence charSequence) {
        a.wv.w(charSequence, "input");
        int i = 0;
        a.yi1.w2(0);
        java.util.regex.Matcher matcher = this.c.matcher(charSequence);
        if (!matcher.find()) {
            return a.b20.y0(charSequence.toString());
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(10);
        do {
            arrayList.add(charSequence.subSequence(i, matcher.start()).toString());
            i = matcher.end();
        } while (matcher.find());
        arrayList.add(charSequence.subSequence(i, charSequence.length()).toString());
        return arrayList;
    }

    public final java.lang.String toString() {
        java.lang.String pattern = this.c.toString();
        a.wv.v(pattern, "nativePattern.toString()");
        return pattern;
    }

    public ab1(java.lang.String str, int i) {
        a.ai1.n(i, "option");
        int b = a.ai1.b(i);
        java.util.regex.Pattern compile = java.util.regex.Pattern.compile(str, (b & 2) != 0 ? b | 64 : b);
        a.wv.v(compile, "compile(pattern, ensureUnicodeCase(option.value))");
        this.c = compile;
    }
}
