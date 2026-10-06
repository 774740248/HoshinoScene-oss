package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class iw0 extends android.text.style.ClickableSpan {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a.kw0 f241a;
    public final /* synthetic */ com.omarea.krscript.model.TextNode.TextRow b;

    public iw0(com.omarea.krscript.model.TextNode.TextRow textRow, a.kw0 kw0Var) {
        this.f241a = kw0Var;
        this.b = textRow;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(android.view.View view) {
        a.wv.w(view, "widget");
        new a.w21(this.f241a.g, this.b.getActivity$krscript_release_mini()).j();
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(android.text.TextPaint textPaint) {
        a.wv.w(textPaint, "ds");
        com.omarea.krscript.model.TextNode.TextRow textRow = this.b;
        textPaint.setColor(textRow.getColor$krscript_release_mini() != 1 ? textPaint.linkColor : textRow.getColor$krscript_release_mini());
        textPaint.setUnderlineText(textRow.getUnderline$krscript_release_mini());
    }
}
