package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class el1 extends android.text.style.ClickableSpan {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a.qo0 f127a;

    public el1(a.qo0 qo0Var) {
        this.f127a = qo0Var;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(android.view.View view) {
        a.wv.w(view, "widget");
        this.f127a.b();
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(android.text.TextPaint textPaint) {
        a.wv.w(textPaint, "ds");
        textPaint.setColor(textPaint.linkColor);
        textPaint.setUnderlineText(true);
    }
}
