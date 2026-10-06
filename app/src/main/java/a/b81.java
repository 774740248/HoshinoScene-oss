package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public class b81 {

    public b81() {
        this(null, null);
    }
    public static final java.util.LinkedHashMap e = new java.util.LinkedHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final android.app.Activity f33a;
    public final java.lang.String b;
    public a.v60 c;
    public android.widget.TextView d;

    public b81(android.app.Activity activity, java.lang.String str) {
        a.wv.w(activity, "context");
        this.f33a = activity;
        this.b = str;
        a();
    }

    public static /* synthetic */ void c(a.b81 b81Var) {
        java.lang.String string = b81Var.f33a.getString(2131952231);
        a.wv.v(string, "context.getString(R.string.execute_wait)");
        b81Var.b(string);
    }

    public final void a() {
        try {
            a.v60 v60Var = this.c;
            if (v60Var != null) {
                a.wv.s(v60Var);
                v60Var.a();
                this.c = null;
            }
        } catch (java.lang.Exception unused) {
        }
        java.lang.String str = this.b;
        if (str != null) {
            java.util.LinkedHashMap linkedHashMap = e;
            if (linkedHashMap.containsKey(str)) {
                linkedHashMap.remove(str);
            }
        }
    }

    public final void b(java.lang.String str) {
        a.wv.w(str, "text");
        android.widget.TextView textView = this.d;
        if (textView == null || this.c == null) {
            a();
            android.app.Activity activity = this.f33a;
            android.view.View inflate = android.view.LayoutInflater.from(activity).inflate(2131558537, (android.view.ViewGroup) null);
            android.view.View findViewById = inflate.findViewById(2131362413);
            a.wv.s(findViewById);
            android.widget.TextView textView2 = (android.widget.TextView) findViewById;
            this.d = textView2;
            textView2.setText(str);
            int i = a.x60.f681a;
            this.c = a.fs1.m(activity, inflate, false);
        } else {
            textView.setText(str);
        }
        java.lang.String str2 = this.b;
        if (str2 != null) {
            java.util.LinkedHashMap linkedHashMap = e;
            if (linkedHashMap.containsKey(str2)) {
                linkedHashMap.remove(str2);
            }
            a.v60 v60Var = this.c;
            if (v60Var != null) {
                linkedHashMap.put(str2, v60Var);
            }
        }
    }
}
