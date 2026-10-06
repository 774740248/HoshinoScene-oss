package a;

import android.view.View.OnLongClickListener;
/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class kw0 extends a.lw0 {
    public final android.content.Context g;
    public final android.widget.TextView h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v7, types: [android.view.View$OnLongClickListener, java.lang.Object] */
    public kw0(android.content.Context context, int i, com.omarea.krscript.model.TextNode textNode) {
        super(context, i, textNode);
        a.wv.w(context, "context");
        this.g = context;
        android.widget.TextView textView = (android.widget.TextView) this.c.findViewById(2131362717);
        this.h = textView;
        if (textNode.getRows().size() <= 0 || textView == null) {
            if (textView == null) {
                return;
            }
            textView.setVisibility(8);
            return;
        }
        textView.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        textView.setVisibility(0);
        java.util.Iterator<com.omarea.krscript.model.TextNode.TextRow> it = textNode.getRows().iterator();
        while (it.hasNext()) {
            com.omarea.krscript.model.TextNode.TextRow next = it.next();
            if (next.getBreakRow$krscript_release_mini() || next.getAlign$krscript_release_mini() != android.text.Layout.Alignment.ALIGN_NORMAL) {
                this.h.append("\n");
            }
            java.lang.String text$krscript_release_mini = next.getText$krscript_release_mini();
            int length = text$krscript_release_mini.length();
            android.text.SpannableString spannableString = new android.text.SpannableString(text$krscript_release_mini);
            if (next.getUnderline$krscript_release_mini()) {
                spannableString.setSpan(new android.text.style.UnderlineSpan(), 0, length, 33);
            }
            if (next.getLink$krscript_release_mini().length() > 0) {
                spannableString.setSpan(new a.hw0(next, this), 0, length, 33);
            }
            if (next.getActivity$krscript_release_mini().length() > 0) {
                spannableString.setSpan(new a.iw0(next, this), 0, length, 33);
            }
            if (next.getOnClickScript$krscript_release_mini().length() > 0) {
                spannableString.setSpan(new a.jw0(this, next, textNode), 0, length, 33);
            }
            if (next.getColor$krscript_release_mini() != -1) {
                spannableString.setSpan(new android.text.style.ForegroundColorSpan(next.getColor$krscript_release_mini()), 0, length, 33);
            }
            if (next.getBgColor$krscript_release_mini() != -1) {
                spannableString.setSpan(new android.text.style.BackgroundColorSpan(next.getBgColor$krscript_release_mini()), 0, length, 33);
            }
            if (next.getBold$krscript_release_mini() && next.getItalic$krscript_release_mini()) {
                spannableString.setSpan(new android.text.style.StyleSpan(3), 0, length, 33);
            } else if (next.getBold$krscript_release_mini()) {
                spannableString.setSpan(new android.text.style.StyleSpan(1), 0, length, 33);
            } else if (next.getItalic$krscript_release_mini()) {
                spannableString.setSpan(new android.text.style.StyleSpan(2), 0, length, 33);
            }
            if (next.getSize$krscript_release_mini() != -1) {
                spannableString.setSpan(new android.text.style.AbsoluteSizeSpan(next.getSize$krscript_release_mini(), true), 0, length, 33);
            }
            spannableString.setSpan(new android.text.style.AlignmentSpan.Standard(next.getAlign$krscript_release_mini()), 0, length, 33);
            this.h.append(spannableString);
        }
        this.h.setOnLongClickListener((OnLongClickListener) (new java.lang.Object()));
    }
}
