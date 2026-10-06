package com.omarea.krscript.model;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ActionNode extends com.omarea.krscript.model.RunnableNode {
    private java.util.ArrayList<com.omarea.krscript.model.ActionParamInfo> params;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActionNode(java.lang.String str) {
        super(str);
        a.wv.w(str, "currentConfigXml");
    }

    public final java.util.ArrayList<com.omarea.krscript.model.ActionParamInfo> getParams() {
        return this.params;
    }

    public final void setParams(java.util.ArrayList<com.omarea.krscript.model.ActionParamInfo> arrayList) {
        this.params = arrayList;
    }
}
