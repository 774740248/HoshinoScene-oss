package com.omarea.model;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ActivatedStateModel {
    private boolean activated;
    private boolean permanent;
    private java.lang.String text = "";
    private java.lang.String type = "";
    private java.lang.String typeName = "";

    public final boolean getActivated() {
        return this.activated;
    }

    public final boolean getPermanent() {
        return this.permanent;
    }

    public final java.lang.String getText() {
        return this.text;
    }

    public final java.lang.String getType() {
        return this.type;
    }

    public final java.lang.String getTypeName() {
        return this.typeName;
    }

    public final void setActivated(boolean z) {
        this.activated = z;
    }

    public final void setPermanent(boolean z) {
        this.permanent = z;
    }

    public final void setText(java.lang.String str) {
        a.wv.w(str, "<set-?>");
        this.text = str;
    }

    public final void setType(java.lang.String str) {
        a.wv.w(str, "<set-?>");
        this.type = str;
    }

    public final void setTypeName(java.lang.String str) {
        a.wv.w(str, "<set-?>");
        this.typeName = str;
    }
}
