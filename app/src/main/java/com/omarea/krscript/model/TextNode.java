package com.omarea.krscript.model;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class TextNode extends com.omarea.krscript.model.NodeInfoBase {
    private final java.util.ArrayList<com.omarea.krscript.model.TextNode.TextRow> rows;

    /* loaded from: /tmp/jadx-10340276197810293799.dex */
    public static final class TextRow {
        private boolean bold;
        private boolean breakRow;
        private boolean italic;
        private boolean underline;
        private int size = -1;
        private int color = -1;
        private int bgColor = -1;
        private android.text.Layout.Alignment align = android.text.Layout.Alignment.ALIGN_NORMAL;
        private java.lang.String link = "";
        private java.lang.String activity = "";
        private java.lang.String text = "";
        private java.lang.String dynamicTextSh = "";
        private java.lang.String onClickScript = "";

        public final java.lang.String getActivity$krscript_release_mini() {
            return this.activity;
        }

        public final android.text.Layout.Alignment getAlign$krscript_release_mini() {
            return this.align;
        }

        public final int getBgColor$krscript_release_mini() {
            return this.bgColor;
        }

        public final boolean getBold$krscript_release_mini() {
            return this.bold;
        }

        public final boolean getBreakRow$krscript_release_mini() {
            return this.breakRow;
        }

        public final int getColor$krscript_release_mini() {
            return this.color;
        }

        public final java.lang.String getDynamicTextSh$krscript_release_mini() {
            return this.dynamicTextSh;
        }

        public final boolean getItalic$krscript_release_mini() {
            return this.italic;
        }

        public final java.lang.String getLink$krscript_release_mini() {
            return this.link;
        }

        public final java.lang.String getOnClickScript$krscript_release_mini() {
            return this.onClickScript;
        }

        public final int getSize$krscript_release_mini() {
            return this.size;
        }

        public final java.lang.String getText$krscript_release_mini() {
            return this.text;
        }

        public final boolean getUnderline$krscript_release_mini() {
            return this.underline;
        }

        public final void setActivity$krscript_release_mini(java.lang.String str) {
            a.wv.w(str, "<set-?>");
            this.activity = str;
        }

        public final void setAlign$krscript_release_mini(android.text.Layout.Alignment alignment) {
            a.wv.w(alignment, "<set-?>");
            this.align = alignment;
        }

        public final void setBgColor$krscript_release_mini(int i) {
            this.bgColor = i;
        }

        public final void setBold$krscript_release_mini(boolean z) {
            this.bold = z;
        }

        public final void setBreakRow$krscript_release_mini(boolean z) {
            this.breakRow = z;
        }

        public final void setColor$krscript_release_mini(int i) {
            this.color = i;
        }

        public final void setDynamicTextSh$krscript_release_mini(java.lang.String str) {
            a.wv.w(str, "<set-?>");
            this.dynamicTextSh = str;
        }

        public final void setItalic$krscript_release_mini(boolean z) {
            this.italic = z;
        }

        public final void setLink$krscript_release_mini(java.lang.String str) {
            a.wv.w(str, "<set-?>");
            this.link = str;
        }

        public final void setOnClickScript$krscript_release_mini(java.lang.String str) {
            a.wv.w(str, "<set-?>");
            this.onClickScript = str;
        }

        public final void setSize$krscript_release_mini(int i) {
            this.size = i;
        }

        public final void setText$krscript_release_mini(java.lang.String str) {
            a.wv.w(str, "<set-?>");
            this.text = str;
        }

        public final void setUnderline$krscript_release_mini(boolean z) {
            this.underline = z;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextNode(java.lang.String str) {
        super(str);
        a.wv.w(str, "currentPageConfigPath");
        this.rows = new java.util.ArrayList<>();
    }

    public final java.util.ArrayList<com.omarea.krscript.model.TextNode.TextRow> getRows() {
        return this.rows;
    }
}
