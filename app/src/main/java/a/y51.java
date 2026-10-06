package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class y51 {
    public static android.view.PointerIcon a(android.graphics.Bitmap bitmap, float f, float f2) {
        return android.view.PointerIcon.create(bitmap, f, f2);
    }

    public static android.view.PointerIcon b(android.content.Context context, int i) {
        return android.view.PointerIcon.getSystemIcon(context, i);
    }

    public static android.view.PointerIcon c(android.content.res.Resources resources, int i) {
        return android.view.PointerIcon.load(resources, i);
    }
}
