package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class rr {
    public static final byte[] e = new byte[1792];

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.CharSequence f502a;
    public final int b;
    public int c;
    public char d;

    static {
        for (int i = 0; i < 1792; i++) {
            e[i] = java.lang.Character.getDirectionality(i);
        }
    }

    public rr(java.lang.CharSequence charSequence) {
        this.f502a = charSequence;
        this.b = charSequence.length();
    }

    public final byte a() {
        int i = this.c - 1;
        java.lang.CharSequence charSequence = this.f502a;
        char charAt = charSequence.charAt(i);
        this.d = charAt;
        if (java.lang.Character.isLowSurrogate(charAt)) {
            int codePointBefore = java.lang.Character.codePointBefore(charSequence, this.c);
            this.c -= java.lang.Character.charCount(codePointBefore);
            return java.lang.Character.getDirectionality(codePointBefore);
        }
        this.c--;
        char c = this.d;
        return c < 1792 ? e[c] : java.lang.Character.getDirectionality(c);
    }
}
