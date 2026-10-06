package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ri implements java.util.Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f496a;
    public final /* synthetic */ java.util.Comparator b;

    public /* synthetic */ ri(a.py pyVar, int i) {
        this.f496a = i;
        this.b = pyVar;
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.f496a;
        java.util.Comparator comparator = this.b;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                int compare = comparator.compare(obj, obj2);
                if (compare != 0) {
                    return compare;
                }
                java.io.File file = (java.io.File) obj;
                a.wv.s(file);
                java.lang.String name = file.getName();
                a.wv.v(name, "it!!.name");
                java.util.Locale locale = java.util.Locale.getDefault();
                a.wv.v(locale, "getDefault()");
                java.lang.String lowerCase = name.toLowerCase(locale);
                a.wv.v(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                java.io.File file2 = (java.io.File) obj2;
                a.wv.s(file2);
                java.lang.String name2 = file2.getName();
                a.wv.v(name2, "it!!.name");
                java.util.Locale locale2 = java.util.Locale.getDefault();
                a.wv.v(locale2, "getDefault()");
                java.lang.String lowerCase2 = name2.toLowerCase(locale2);
                a.wv.v(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
                return a.wv.D(lowerCase, lowerCase2);
            case 1:
                int compare2 = comparator.compare(obj, obj2);
                return compare2 != 0 ? compare2 : a.yi1.e2(((a.mc1) obj).b, ((a.mc1) obj2).b);
            default:
                int compare3 = comparator.compare(obj, obj2);
                if (compare3 != 0) {
                    return compare3;
                }
                a.mc1 mc1Var = (a.mc1) obj2;
                a.mc1 mc1Var2 = (a.mc1) obj;
                int e2 = a.yi1.e2(a.yi1.D2(mc1Var2.b, '.', ""), a.yi1.D2(mc1Var.b, '.', ""));
                return e2 != 0 ? e2 : a.yi1.e2(mc1Var2.b, mc1Var.b);
        }
    }
}
