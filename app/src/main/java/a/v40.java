package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class v40 {

    /* renamed from: a, reason: collision with root package name */
    public final a.p5 f622a;
    public final java.lang.String b = "persist.vtools.device.backuped";
    public final java.lang.String c = "persist.vtools.brand";
    public final java.lang.String d = "persist.vtools.model";
    public final java.lang.String e = "persist.vtools.product";
    public final java.lang.String f = "persist.vtools.device";
    public final java.lang.String g = "persist.vtools.manufacturer";
    public final java.lang.String h = "ro.product.brand";
    public final java.lang.String i = "ro.product.name";
    public final java.lang.String j = "ro.product.model";
    public final java.lang.String k = "ro.product.manufacturer";
    public final java.lang.String l = "ro.product.device";
    public android.widget.EditText m;
    public android.widget.EditText n;
    public android.widget.EditText o;
    public android.widget.EditText p;
    public android.widget.EditText q;

    public v40(com.omarea.vtools.activities.ActivityAddin activityAddin) {
        this.f622a = activityAddin;
    }

    public static java.lang.String a(java.lang.String str, java.lang.String str2) {
        java.lang.String obj;
        java.lang.String property;
        a.wv.w(str, "prop");
        try {
            property = java.lang.System.getProperty(str);
        } catch (java.lang.Exception unused) {
        }
        if (property != null && property.length() != 0) {
            obj = a.yi1.G2(property).toString();
            return (!a.wv.e(obj, "null") || a.wv.e(obj, "")) ? str2 : obj;
        }
        a.q10 q10Var = a.q10.f457a;
        java.lang.String L = a.q10.L("get-prop", str, null);
        obj = a.wv.e(L, "error") ? "" : a.yi1.G2(L).toString();
        if (a.wv.e(obj, "null")) {
        }
    }

    public final void b(java.lang.String str) {
        java.util.regex.Pattern compile = java.util.regex.Pattern.compile("^.*@.*@.*@.*@.*$");
        a.wv.v(compile, "compile(pattern)");
        if (compile.matcher(str).matches()) {
            java.util.List y2 = a.yi1.y2(str, new java.lang.String[]{"@"});
            android.widget.EditText editText = this.m;
            if (editText == null) {
                a.wv.M1("editModel");
                throw null;
            }
            editText.setText((java.lang.CharSequence) y2.get(0));
            android.widget.EditText editText2 = this.n;
            if (editText2 == null) {
                a.wv.M1("editBrand");
                throw null;
            }
            editText2.setText((java.lang.CharSequence) y2.get(1));
            android.widget.EditText editText3 = this.q;
            if (editText3 == null) {
                a.wv.M1("editManufacturer");
                throw null;
            }
            editText3.setText((java.lang.CharSequence) y2.get(2));
            android.widget.EditText editText4 = this.o;
            if (editText4 == null) {
                a.wv.M1("editProductName");
                throw null;
            }
            editText4.setText((java.lang.CharSequence) y2.get(3));
            android.widget.EditText editText5 = this.p;
            if (editText5 != null) {
                editText5.setText((java.lang.CharSequence) y2.get(4));
            } else {
                a.wv.M1("editDevice");
                throw null;
            }
        }
    }
}
