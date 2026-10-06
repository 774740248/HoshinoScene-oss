package com.omarea.krscript.model;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ParamInfoFilter implements android.text.InputFilter {
    private final com.omarea.krscript.model.ActionParamInfo paramInfo;

    public ParamInfoFilter(com.omarea.krscript.model.ActionParamInfo actionParamInfo) {
        a.wv.w(actionParamInfo, "paramInfo");
        this.paramInfo = actionParamInfo;
    }

    @Override // android.text.InputFilter
    public java.lang.CharSequence filter(java.lang.CharSequence charSequence, int i, int i2, android.text.Spanned spanned, int i3, int i4) {
        a.wv.w(spanned, "dest");
        if (this.paramInfo.getMaxLength() >= 0 && this.paramInfo.getMaxLength() - (spanned.length() - (i4 - i3)) <= 0) {
            return "";
        }
        if (this.paramInfo.getType() == null || a.wv.e(this.paramInfo.getType(), "") || charSequence == null) {
            return null;
        }
        if (a.wv.e(this.paramInfo.getType(), "int")) {
            if (java.util.regex.Pattern.compile("^[0-9]{0,}$").matcher(charSequence.toString()).matches()) {
                return null;
            }
            return "";
        }
        if (!a.wv.e(this.paramInfo.getType(), "number") || java.util.regex.Pattern.compile("^[\\-.,0-9]{0,}$").matcher(charSequence.toString()).matches()) {
            return null;
        }
        return "";
    }
}
