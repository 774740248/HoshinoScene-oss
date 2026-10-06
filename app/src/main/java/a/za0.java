package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class za0 extends android.text.Editable.Factory {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.Object f731a = new java.lang.Object();
    public static volatile a.za0 b;
    public static java.lang.Class c;

    @Override // android.text.Editable.Factory
    public final android.text.Editable newEditable(java.lang.CharSequence charSequence) {
        java.lang.Class cls = c;
        return cls != null ? new a.ei1(cls, charSequence) : super.newEditable(charSequence);
    }
}
