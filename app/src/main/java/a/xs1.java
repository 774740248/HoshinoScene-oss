package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class xs1 {
    public static boolean a(android.view.Window.Callback callback, android.view.SearchEvent searchEvent) {
        return callback.onSearchRequested(searchEvent);
    }

    public static android.view.ActionMode b(android.view.Window.Callback callback, android.view.ActionMode.Callback callback2, int i) {
        return callback.onWindowStartingActionMode(callback2, i);
    }
}
