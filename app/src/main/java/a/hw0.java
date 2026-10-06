package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class hw0 extends android.text.style.ClickableSpan {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.omarea.krscript.model.TextNode.TextRow f219a;
    public final /* synthetic */ a.kw0 b;

    public hw0(com.omarea.krscript.model.TextNode.TextRow textRow, a.kw0 kw0Var) {
        this.f219a = textRow;
        this.b = kw0Var;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(android.view.View view) {
        a.kw0 kw0Var = this.b;
        a.wv.w(view, "widget");
        com.omarea.krscript.model.TextNode.TextRow textRow = this.f219a;
        if (textRow.getLink$krscript_release_mini().length() > 0) {
            try {
                android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(textRow.getLink$krscript_release_mini()));
                intent.addFlags(268435456);
                kw0Var.g.startActivity(intent);
            } catch (java.lang.Exception unused) {
                android.content.Context context = kw0Var.g;
                a.ai1.r(context, 2131952738, context, 0);
            }
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(android.text.TextPaint textPaint) {
        a.wv.w(textPaint, "ds");
        com.omarea.krscript.model.TextNode.TextRow textRow = this.f219a;
        textPaint.setColor(textRow.getColor$krscript_release_mini() != 1 ? textPaint.linkColor : textRow.getColor$krscript_release_mini());
        textPaint.setUnderlineText(textRow.getUnderline$krscript_release_mini());
    }
}
