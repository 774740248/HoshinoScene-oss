package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class iq1 {

    public iq1() {
    }

    public static final java.util.ArrayList d = new java.util.ArrayList();

    /* renamed from: a, reason: collision with root package name */
    public java.util.WeakHashMap f238a;
    public android.util.SparseArray b;
    public java.lang.ref.WeakReference c;

    public final android.view.View a(android.view.View view) {
        int size;
        java.util.WeakHashMap weakHashMap = this.f238a;
        if (weakHashMap != null && weakHashMap.containsKey(view)) {
            if (view instanceof android.view.ViewGroup) {
                android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
                for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                    android.view.View a2 = a(viewGroup.getChildAt(childCount));
                    if (a2 != null) {
                        return a2;
                    }
                }
            }
            java.util.ArrayList arrayList = (java.util.ArrayList) view.getTag(2131363252);
            if (arrayList != null && arrayList.size() - 1 >= 0) {
                a.ai1.t(arrayList.get(size));
                throw null;
            }
        }
        return null;
    }
}
