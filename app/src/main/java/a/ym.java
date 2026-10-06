package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class ym {
    public static boolean a(android.view.DragEvent dragEvent, android.widget.TextView textView, android.app.Activity activity) {
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            android.text.Selection.setSelection((android.text.Spannable) textView.getText(), offsetForPosition);
            android.content.ClipData clipData = dragEvent.getClipData();
            a.jq1.k(textView, (android.os.Build.VERSION.SDK_INT >= 31 ? new a.ox(clipData, 3) : new a.qx(clipData, 3)).a());
            textView.endBatchEdit();
            return true;
        } catch (java.lang.Throwable th) {
            textView.endBatchEdit();
            throw th;
        }
    }

    public static boolean b(android.view.DragEvent dragEvent, android.view.View view, android.app.Activity activity) {
        activity.requestDragAndDropPermissions(dragEvent);
        android.content.ClipData clipData = dragEvent.getClipData();
        a.jq1.k(view, (android.os.Build.VERSION.SDK_INT >= 31 ? new a.ox(clipData, 3) : new a.qx(clipData, 3)).a());
        return true;
    }
}
