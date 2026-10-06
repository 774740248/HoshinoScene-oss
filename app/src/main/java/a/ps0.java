package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ps0 implements android.text.InputFilter {

    /* renamed from: a, reason: collision with root package name */
    public final int f450a = 3;

    @Override // android.text.InputFilter
    public final java.lang.CharSequence filter(java.lang.CharSequence charSequence, int i, int i2, android.text.Spanned spanned, int i3, int i4) {
        a.wv.w(spanned, "dest");
        if (charSequence != null && a.yi1.g2(charSequence.toString(), "\"")) {
            return "";
        }
        int i5 = this.f450a;
        if (i5 >= 0 && i5 - (spanned.length() - (i4 - i3)) <= 0) {
            return "";
        }
        if (a.wv.e("int", "") || charSequence == null) {
            return null;
        }
        if (a.wv.e("int", "int")) {
            if (java.util.regex.Pattern.compile("^[0-9]{0,}$").matcher(charSequence.toString()).matches()) {
                return null;
            }
            return "";
        }
        if (!a.wv.e("int", "number") || java.util.regex.Pattern.compile("^[\\-.,0-9]{0,}$").matcher(charSequence.toString()).matches()) {
            return null;
        }
        return "";
    }
}
