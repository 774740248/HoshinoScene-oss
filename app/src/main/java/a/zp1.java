package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class zp1 {
    public static void a(android.view.View view) {
        view.cancelDragAndDrop();
    }

    public static void b(android.view.View view) {
        view.dispatchFinishTemporaryDetach();
    }

    public static void c(android.view.View view) {
        view.dispatchStartTemporaryDetach();
    }

    public static void d(android.view.View view, android.view.PointerIcon pointerIcon) {
        view.setPointerIcon(pointerIcon);
    }

    public static boolean e(android.view.View view, android.content.ClipData clipData, android.view.View.DragShadowBuilder dragShadowBuilder, java.lang.Object obj, int i) {
        return view.startDragAndDrop(clipData, dragShadowBuilder, obj, i);
    }

    public static void f(android.view.View view, android.view.View.DragShadowBuilder dragShadowBuilder) {
        view.updateDragShadow(dragShadowBuilder);
    }
}
