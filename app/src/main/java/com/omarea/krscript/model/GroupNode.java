package com.omarea.krscript.model;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class GroupNode extends com.omarea.krscript.model.NodeInfoBase {
    private final java.util.ArrayList<com.omarea.krscript.model.NodeInfoBase> children;
    private boolean supported;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupNode(java.lang.String str) {
        super(str);
        a.wv.w(str, "currentPageConfigPath");
        this.supported = true;
        this.children = new java.util.ArrayList<>();
    }

    public final java.util.ArrayList<com.omarea.krscript.model.NodeInfoBase> getChildren() {
        return this.children;
    }

    public final boolean getSupported() {
        return this.supported;
    }

    public final void setSupported(boolean z) {
        this.supported = z;
    }
}
