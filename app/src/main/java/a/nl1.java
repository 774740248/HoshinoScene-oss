package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class nl1 implements a.i31 {
    public final a.sx a(android.view.View view, a.sx sxVar) {
        java.lang.CharSequence coerceToStyledText;
        if (android.util.Log.isLoggable("ReceiveContent", 3)) {
            android.util.Log.d("ReceiveContent", "onReceive: " + sxVar);
        }
        if (sxVar.f543a.n() == 2) {
            return sxVar;
        }
        a.rx rxVar = sxVar.f543a;
        android.content.ClipData c = rxVar.c();
        int f = rxVar.f();
        android.widget.TextView textView = (android.widget.TextView) view;
        android.text.Editable editable = (android.text.Editable) textView.getText();
        android.content.Context context = textView.getContext();
        boolean z = false;
        for (int i = 0; i < c.getItemCount(); i++) {
            android.content.ClipData.Item itemAt = c.getItemAt(i);
            if ((f & 1) != 0) {
                coerceToStyledText = itemAt.coerceToText(context);
                if (coerceToStyledText instanceof android.text.Spanned) {
                    coerceToStyledText = coerceToStyledText.toString();
                }
            } else {
                coerceToStyledText = itemAt.coerceToStyledText(context);
            }
            if (coerceToStyledText != null) {
                if (z) {
                    editable.insert(android.text.Selection.getSelectionEnd(editable), "\n");
                    editable.insert(android.text.Selection.getSelectionEnd(editable), coerceToStyledText);
                } else {
                    int selectionStart = android.text.Selection.getSelectionStart(editable);
                    int selectionEnd = android.text.Selection.getSelectionEnd(editable);
                    int max = java.lang.Math.max(0, java.lang.Math.min(selectionStart, selectionEnd));
                    int max2 = java.lang.Math.max(0, java.lang.Math.max(selectionStart, selectionEnd));
                    android.text.Selection.setSelection(editable, max2);
                    editable.replace(max, max2, coerceToStyledText);
                    z = true;
                }
            }
        }
        return null;
    }
}
