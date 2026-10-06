package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class tu extends android.util.Property {

    /* renamed from: a, reason: collision with root package name */
    public static final a.tu f564a = new android.util.Property(java.lang.Float.class, "childrenAlpha");

    @Override // android.util.Property
    public final java.lang.Object get(java.lang.Object obj) {
        java.lang.Float f = (java.lang.Float) ((android.view.ViewGroup) obj).getTag(2131362864);
        return f != null ? f : java.lang.Float.valueOf(1.0f);
    }

    @Override // android.util.Property
    public final void set(java.lang.Object obj, java.lang.Object obj2) {
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) obj;
        float floatValue = ((java.lang.Float) obj2).floatValue();
        viewGroup.setTag(2131362864, java.lang.Float.valueOf(floatValue));
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            viewGroup.getChildAt(i).setAlpha(floatValue);
        }
    }
}
