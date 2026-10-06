package com.omarea.krscript.model;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ActionParamInfo {
    private java.lang.String desc;
    private boolean editable;
    private java.lang.String label;
    private boolean multiple;
    private java.lang.String name;
    private java.util.ArrayList<a.ng1> options;
    private java.util.ArrayList<a.ng1> optionsFromShell;
    private boolean readonly;
    private boolean required;
    private java.lang.String title;
    private java.lang.String type;
    private java.lang.String value;
    private java.lang.String valueFromShell;
    private java.lang.String valueShell;
    private int maxLength = -1;
    private int max = Integer.MAX_VALUE;
    private int min = Integer.MIN_VALUE;
    private java.lang.String optionsSh = "";
    private boolean supported = true;
    private java.lang.String placeholder = "";
    private java.lang.String mime = "";
    private java.lang.String suffix = "";
    private java.lang.String separator = "\n";

    public final java.lang.String getDesc() {
        return this.desc;
    }

    public final boolean getEditable() {
        return this.editable;
    }

    public final java.lang.String getLabel() {
        return this.label;
    }

    public final int getMax() {
        return this.max;
    }

    public final int getMaxLength() {
        return this.maxLength;
    }

    public final java.lang.String getMime() {
        return this.mime;
    }

    public final int getMin() {
        return this.min;
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

    public final java.util.ArrayList<a.ng1> getOptionsFromShell() {
        return this.optionsFromShell;
    }

    public final java.lang.String getOptionsSh() {
        return this.optionsSh;
    }

    public final java.lang.String getPlaceholder() {
        return this.placeholder;
    }

    public final boolean getReadonly() {
        return this.readonly;
    }

    public final boolean getRequired() {
        return this.required;
    }

    public final java.lang.String getSeparator() {
        return this.separator;
    }

    public final java.lang.String getSuffix() {
        return this.suffix;
    }

    public final boolean getSupported() {
        return this.supported;
    }

    public final java.lang.String getTitle() {
        return this.title;
    }

    public final java.lang.String getType() {
        return this.type;
    }

    public final java.lang.String getValue() {
        return this.value;
    }

    public final java.lang.String getValueFromShell() {
        return this.valueFromShell;
    }

    public final java.lang.String getValueShell() {
        return this.valueShell;
    }

    public final void setDesc(java.lang.String str) {
        this.desc = str;
    }

    public final void setEditable(boolean z) {
        this.editable = z;
    }

    public final void setLabel(java.lang.String str) {
        this.label = str;
    }

    public final void setMax(int i) {
        this.max = i;
    }

    public final void setMaxLength(int i) {
        this.maxLength = i;
    }

    public final void setMime(java.lang.String str) {
        a.wv.w(str, "<set-?>");
        this.mime = str;
    }

    public final void setMin(int i) {
        this.min = i;
    }

    public final void setMultiple(boolean z) {
        this.multiple = z;
    }

    public final void setName(java.lang.String str) {
        this.name = str;
    }

    public final void setOptions(java.util.ArrayList<a.ng1> arrayList) {
        this.options = arrayList;
    }

    public final void setOptionsFromShell(java.util.ArrayList<a.ng1> arrayList) {
        this.optionsFromShell = arrayList;
    }

    public final void setOptionsSh(java.lang.String str) {
        a.wv.w(str, "<set-?>");
        this.optionsSh = str;
    }

    public final void setPlaceholder(java.lang.String str) {
        a.wv.w(str, "<set-?>");
        this.placeholder = str;
    }

    public final void setReadonly(boolean z) {
        this.readonly = z;
    }

    public final void setRequired(boolean z) {
        this.required = z;
    }

    public final void setSeparator(java.lang.String str) {
        a.wv.w(str, "<set-?>");
        this.separator = str;
    }

    public final void setSuffix(java.lang.String str) {
        a.wv.w(str, "<set-?>");
        this.suffix = str;
    }

    public final void setSupported(boolean z) {
        this.supported = z;
    }

    public final void setTitle(java.lang.String str) {
        this.title = str;
    }

    public final void setType(java.lang.String str) {
        this.type = str;
    }

    public final void setValue(java.lang.String str) {
        this.value = str;
    }

    public final void setValueFromShell(java.lang.String str) {
        this.valueFromShell = str;
    }

    public final void setValueShell(java.lang.String str) {
        this.valueShell = str;
    }
}
