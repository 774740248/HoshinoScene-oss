package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ao extends a.zn {
    @Override // a.zn, a.bo
    public void a(android.text.StaticLayout.Builder builder, android.widget.TextView textView) {
        android.text.TextDirectionHeuristic textDirectionHeuristic;
        textDirectionHeuristic = textView.getTextDirectionHeuristic();
        builder.setTextDirection(textDirectionHeuristic);
    }

    @Override // a.bo
    public boolean b(android.widget.TextView textView) {
        boolean isHorizontallyScrollable;
        isHorizontallyScrollable = textView.isHorizontallyScrollable();
        return isHorizontallyScrollable;
    }
}
