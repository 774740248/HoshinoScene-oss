package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class yd1 extends android.content.res.Resources {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.res.Resources f706a;
    public final a.nb1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yd1(android.content.res.Resources resources, a.nb1 nb1Var) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        a.wv.w(nb1Var, "override");
        this.f706a = resources;
        this.b = nb1Var;
    }

    @Override // android.content.res.Resources
    public final java.lang.String getString(int i) {
        android.content.res.Resources resources = this.f706a;
        java.lang.String resourceEntryName = resources.getResourceEntryName(i);
        a.wv.v(resourceEntryName, "original.getResourceEntryName(id)");
        java.lang.String str = (java.lang.String) this.b.b.get(resourceEntryName);
        if (str != null) {
            return str;
        }
        java.lang.String string = resources.getString(i);
        a.wv.v(string, "original.getString(id)");
        return string;
    }

    @Override // android.content.res.Resources
    public final java.lang.String[] getStringArray(int i) {
        android.content.res.Resources resources = this.f706a;
        java.lang.String resourceEntryName = resources.getResourceEntryName(i);
        a.wv.v(resourceEntryName, "original.getResourceEntryName(id)");
        java.lang.String[] strArr = (java.lang.String[]) this.b.c.get(resourceEntryName);
        if (strArr != null) {
            return strArr;
        }
        java.lang.String[] stringArray = resources.getStringArray(i);
        a.wv.v(stringArray, "original.getStringArray(id)");
        return stringArray;
    }
}
