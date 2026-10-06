package com.omarea.krscript.model;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class PickerNode extends com.omarea.krscript.model.RunnableNode {
    private java.lang.String getState;
    private boolean multiple;
    private java.lang.String name;
    private java.util.ArrayList<a.ng1> options;
    private java.lang.String optionsSh;
    private java.lang.String separator;
    private java.lang.String value;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PickerNode(java.lang.String str) {
        super(str);
        a.wv.w(str, "currentConfigXml");
        this.optionsSh = "";
        this.name = "";
        this.separator = "\n";
    }

    public final java.lang.String getGetState() {
        return this.getState;
    }

    public final boolean getMultiple() {
        return this.multiple;
    }

    public final java.lang.String getName() {
        return this.name;
    }

    public final java.util.ArrayList<a.ng1> getOptions() {
        return this.options;
    }

    public final java.lang.String getOptionsSh() {
        return this.optionsSh;
    }

    public final java.lang.String getSeparator() {
        return this.separator;
    }

    public final java.lang.String getValue() {
        return this.value;
    }

    public final void setGetState(java.lang.String str) {
        this.getState = str;
    }

    public final void setMultiple(boolean z) {
        this.multiple = z;
    }

    public final void setName(java.lang.String str) {
        a.wv.w(str, "<set-?>");
        this.name = str;
    }

    public final void setOptions(java.util.ArrayList<a.ng1> arrayList) {
        this.options = arrayList;
    }

    public final void setOptionsSh(java.lang.String str) {
        a.wv.w(str, "<set-?>");
        this.optionsSh = str;
    }

    public final void setSeparator(java.lang.String str) {
        a.wv.w(str, "<set-?>");
        this.separator = str;
    }

    public final void setValue(java.lang.String str) {
        this.value = str;
    }
}
