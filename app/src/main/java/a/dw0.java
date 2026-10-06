package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class dw0 extends a.lw0 {
    public a.s31 g;
    public a.s31 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public dw0(android.content.Context r6, int r7, com.omarea.krscript.model.ClickableNode r8) {
        /*
            r5 = this;
            java.lang.String r0 = "context"
            a.wv.w(r6, r0)
            r5.<init>(r6, r7, r8)
            android.view.View r7 = r5.c
            r0 = 2131362718(0x7f0a039e, float:1.8345224E38)
            android.view.View r7 = r7.findViewById(r0)
            android.view.View r0 = r5.c
            r1 = 2131362685(0x7f0a037d, float:1.8345158E38)
            android.view.View r0 = r0.findViewById(r1)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            java.lang.String r1 = r8.getTitle()
            r5.c(r1)
            java.lang.String r1 = r8.getDesc()
            r5.a(r1)
            java.lang.String r1 = r8.getSummary()
            r5.b(r1)
            android.view.View r1 = r5.c
            a.gv r2 = new a.gv
            r3 = 11
            r2.<init>(r3, r5)
            r1.setOnClickListener(r2)
            com.omarea.krscript.model.NodeInfoBase r1 = r5.b
            java.lang.String r1 = r1.getKey()
            int r1 = r1.length()
            r2 = 8
            r3 = 0
            if (r1 <= 0) goto L69
            java.lang.Boolean r1 = r8.getAllowShortcut()
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            boolean r1 = a.wv.e(r1, r4)
            if (r1 != 0) goto L69
            android.view.View r1 = r5.c
            a.cw0 r4 = new a.cw0
            r4.<init>(r3, r5)
            r1.setOnLongClickListener(r4)
            if (r7 != 0) goto L65
            goto L6f
        L65:
            r7.setVisibility(r3)
            goto L6f
        L69:
            if (r7 != 0) goto L6c
            goto L6f
        L6c:
            r7.setVisibility(r2)
        L6f:
            if (r0 == 0) goto Lbb
            r0.setVisibility(r2)
            java.lang.String r7 = r8.getIconPath()
            int r7 = r7.length()
            if (r7 <= 0) goto Lbb
            java.lang.String r7 = r8.getIconPath()
            int r7 = r7.length()
            if (r7 != 0) goto L89
            goto Lb2
        L89:
            a.ej1 r7 = new a.ej1
            java.lang.String r1 = r8.getPageConfigDir()
            java.lang.String r2 = "clickableNode.pageConfigDir"
            a.wv.v(r1, r2)
            r2 = 9
            r7.<init>(r2, r6, r1)
            java.lang.String r6 = r8.getIconPath()
            java.io.InputStream r6 = r7.t(r6)
            if (r6 == 0) goto Lb2
            android.graphics.Bitmap r6 = android.graphics.BitmapFactory.decodeStream(r6)
            java.lang.String r7 = "decodeStream(this)"
            a.wv.v(r6, r7)
            android.graphics.drawable.BitmapDrawable r7 = new android.graphics.drawable.BitmapDrawable
            r7.<init>(r6)
            goto Lb3
        Lb2:
            r7 = 0
        Lb3:
            if (r7 == 0) goto Lbb
            r0.setImageDrawable(r7)
            r0.setVisibility(r3)
        Lbb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a.dw0.<init>(android.content.Context, int, com.omarea.krscript.model.ClickableNode):void");
    }
}
