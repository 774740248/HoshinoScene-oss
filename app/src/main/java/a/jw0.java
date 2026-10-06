package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class jw0 extends android.text.style.ClickableSpan {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a.kw0 f273a;
    public final /* synthetic */ com.omarea.krscript.model.TextNode.TextRow b;
    public final /* synthetic */ com.omarea.krscript.model.TextNode c;

    public jw0(a.kw0 kw0Var, com.omarea.krscript.model.TextNode.TextRow textRow, com.omarea.krscript.model.TextNode textNode) {
        this.f273a = kw0Var;
        this.b = textRow;
        this.c = textNode;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(android.view.View view) {
        a.wv.w(view, "widget");
        a.kw0 kw0Var = this.f273a;
        java.lang.String V = a.wv.V(kw0Var.g, this.b.getOnClickScript$krscript_release_mini(), this.c);
        a.wv.v(V, "result");
        if (a.yi1.F2(V).toString().length() > 0) {
            int i = a.x60.f681a;
            android.content.Context context = kw0Var.g;
            java.lang.String string = context.getString(2131952739);
            a.wv.v(string, "context.getString(R.string.kr_slice_script_result)");
            a.fs1.F(context, string, V, null);
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(android.text.TextPaint textPaint) {
        a.wv.w(textPaint, "ds");
        com.omarea.krscript.model.TextNode.TextRow textRow = this.b;
        textPaint.setColor(textRow.getColor$krscript_release_mini() != 1 ? textPaint.linkColor : textRow.getColor$krscript_release_mini());
        textPaint.setUnderlineText(textRow.getUnderline$krscript_release_mini());
    }
}
