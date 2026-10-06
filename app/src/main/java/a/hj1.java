package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class hj1 implements android.view.MenuItem.OnMenuItemClickListener {
    public static final java.lang.Class[] c = {android.view.MenuItem.class};

    /* renamed from: a, reason: collision with root package name */
    public java.lang.Object f207a;
    public java.lang.reflect.Method b;

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem menuItem) {
        java.lang.reflect.Method method = this.b;
        try {
            java.lang.Class<?> returnType = method.getReturnType();
            java.lang.Class<?> cls = java.lang.Boolean.TYPE;
            java.lang.Object obj = this.f207a;
            if (returnType == cls) {
                return ((java.lang.Boolean) method.invoke(obj, menuItem)).booleanValue();
            }
            method.invoke(obj, menuItem);
            return true;
        } catch (java.lang.Exception e) {
            throw new java.lang.RuntimeException(e);
        }
    }
}
