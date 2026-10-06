package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class ov extends a.op {
    public static void Z1(java.util.List list, java.util.Comparator comparator) {
        a.wv.w(list, "<this>");
        if (list.size() > 1) {
            java.util.Collections.sort(list, comparator);
        }
    }
}
