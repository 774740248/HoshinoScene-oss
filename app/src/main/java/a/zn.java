package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public class zn extends a.bo {
    @Override // a.bo
    public void a(android.text.StaticLayout.Builder builder, android.widget.TextView textView) {
        builder.setTextDirection((android.text.TextDirectionHeuristic) a.co.e(textView, android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR, "getTextDirectionHeuristic"));
    }
}
