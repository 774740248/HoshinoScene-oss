package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class x90 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.reflect.Field f683a;

    static {
        java.lang.reflect.Field field = null;
        try {
            field = android.widget.AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            field.setAccessible(true);
        } catch (java.lang.NoSuchFieldException e) {
            e.printStackTrace();
        }
        f683a = field;
    }
}
