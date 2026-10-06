package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ro1 implements android.text.Spannable {
    public boolean c = false;
    public android.text.Spannable d;

    public ro1(android.text.Spannable spannable) {
        this.d = spannable;
    }

    public final void a() {
        android.text.Spannable spannable = this.d;
        if (!this.c) {
            java.lang.Object obj = null;
            int i = 11;
            if ((android.os.Build.VERSION.SDK_INT < 28 ? new a.fa0(i, obj) : new a.fa0(i, obj)).x(spannable)) {
                this.d = new android.text.SpannableString(spannable);
            }
        }
        this.c = true;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.d.charAt(i);
    }

    @Override // java.lang.CharSequence
    public final java.util.stream.IntStream chars() {
        return this.d.chars();
    }

    @Override // java.lang.CharSequence
    public final java.util.stream.IntStream codePoints() {
        return this.d.codePoints();
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(java.lang.Object obj) {
        return this.d.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(java.lang.Object obj) {
        return this.d.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(java.lang.Object obj) {
        return this.d.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final java.lang.Object[] getSpans(int i, int i2, java.lang.Class cls) {
        return this.d.getSpans(i, i2, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.d.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i, int i2, java.lang.Class cls) {
        return this.d.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(java.lang.Object obj) {
        a();
        this.d.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(java.lang.Object obj, int i, int i2, int i3) {
        a();
        this.d.setSpan(obj, i, i2, i3);
    }

    @Override // java.lang.CharSequence
    public final java.lang.CharSequence subSequence(int i, int i2) {
        return this.d.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public final java.lang.String toString() {
        return this.d.toString();
    }

    public ro1(java.lang.CharSequence charSequence) {
        this.d = new android.text.SpannableString(charSequence);
    }
}
