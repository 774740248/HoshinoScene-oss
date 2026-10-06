package com.omarea.krscript.model;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class SwitchNode extends com.omarea.krscript.model.RunnableNode {
    private boolean checked;
    private java.lang.String getState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwitchNode(java.lang.String str) {
        super(str);
        a.wv.w(str, "currentConfigXml");
        this.getState = "";
    }

    public final boolean getChecked() {
        return this.checked;
    }

    public final java.lang.String getGetState() {
        return this.getState;
    }

    public final void setChecked(boolean z) {
        this.checked = z;
    }

    public final void setGetState(java.lang.String str) {
        a.wv.w(str, "<set-?>");
        this.getState = str;
    }
}
