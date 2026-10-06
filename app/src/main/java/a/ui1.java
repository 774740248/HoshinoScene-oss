package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ui1 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.CharSequence f598a;
    public final android.text.TextPaint b;
    public final int c;
    public int d;
    public boolean k;
    public android.text.Layout.Alignment e = android.text.Layout.Alignment.ALIGN_NORMAL;
    public int f = Integer.MAX_VALUE;
    public float g = 0.0f;
    public float h = 1.0f;
    public int i = 1;
    public boolean j = true;
    public android.text.TextUtils.TruncateAt l = null;

    public ui1(java.lang.CharSequence charSequence, android.text.TextPaint textPaint, int i) {
        this.f598a = charSequence;
        this.b = textPaint;
        this.c = i;
        this.d = charSequence.length();
    }

    public final android.text.StaticLayout a() {
        if (this.f598a == null) {
            this.f598a = "";
        }
        int max = java.lang.Math.max(0, this.c);
        java.lang.CharSequence charSequence = this.f598a;
        int i = this.f;
        android.text.TextPaint textPaint = this.b;
        if (i == 1) {
            charSequence = android.text.TextUtils.ellipsize(charSequence, textPaint, max, this.l);
        }
        int min = java.lang.Math.min(charSequence.length(), this.d);
        this.d = min;
        if (this.k && this.f == 1) {
            this.e = android.text.Layout.Alignment.ALIGN_OPPOSITE;
        }
        android.text.StaticLayout.Builder obtain = android.text.StaticLayout.Builder.obtain(charSequence, 0, min, textPaint, max);
        obtain.setAlignment(this.e);
        obtain.setIncludePad(this.j);
        obtain.setTextDirection(this.k ? android.text.TextDirectionHeuristics.RTL : android.text.TextDirectionHeuristics.LTR);
        android.text.TextUtils.TruncateAt truncateAt = this.l;
        if (truncateAt != null) {
            obtain.setEllipsize(truncateAt);
        }
        obtain.setMaxLines(this.f);
        float f = this.g;
        if (f != 0.0f || this.h != 1.0f) {
            obtain.setLineSpacing(f, this.h);
        }
        if (this.f > 1) {
            obtain.setHyphenationFrequency(this.i);
        }
        return obtain.build();
    }
}
