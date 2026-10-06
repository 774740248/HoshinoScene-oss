package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class ln {
    public static android.view.textclassifier.TextClassifier a(android.widget.TextView textView) {
        android.view.textclassifier.TextClassificationManager textClassificationManager = (android.view.textclassifier.TextClassificationManager) textView.getContext().getSystemService(android.view.textclassifier.TextClassificationManager.class);
        return textClassificationManager != null ? textClassificationManager.getTextClassifier() : android.view.textclassifier.TextClassifier.NO_OP;
    }
}
