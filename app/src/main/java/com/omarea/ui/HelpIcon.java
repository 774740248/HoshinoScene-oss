package com.omarea.ui;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class HelpIcon extends android.widget.RelativeLayout {
    public static final /* synthetic */ int c = 0;

    public HelpIcon(final android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        android.view.View inflate = android.view.View.inflate(context, 2131558619, this);
        a.wv.t(inflate, "null cannot be cast to non-null type android.view.View");
        a.cp cpVar = com.omarea.Scene.c;
        final int i = 1;
        if (!a.fs1.D().getBoolean("show_help_icon", true)) {
            inflate.setVisibility(8);
        }
        if (attributeSet != null) {
            int attributeCount = attributeSet.getAttributeCount();
            final int i2 = 0;
            for (int i3 = 0; i3 < attributeCount; i3++) {
                java.lang.String attributeName = attributeSet.getAttributeName(i3);
                if (a.wv.e(attributeName, "text")) {
                    java.lang.String attributeValue = attributeSet.getAttributeValue(i3);
                    a.wv.v(attributeValue, "attrValue");
                    if (a.yi1.B2(attributeValue, "@")) {
                        a.wv.s(context);
                        attributeValue = context.getString(java.lang.Integer.parseInt(a.yi1.v2(attributeValue, "@", "")));
                    }
                    ((android.widget.ImageView) inflate.findViewById(android.R.id.button1)).setOnClickListener(new a.hr0());
                } else if (a.wv.e(attributeName, "layout_res")) {
                    final java.lang.String attributeValue2 = attributeSet.getAttributeValue(i3);
                    ((android.widget.ImageView) inflate.findViewById(android.R.id.button1)).setOnClickListener(new a.hr0());
                }
            }
        }
    }
}
