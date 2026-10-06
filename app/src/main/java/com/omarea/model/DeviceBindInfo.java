package com.omarea.model;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class DeviceBindInfo {
    private boolean current;
    public java.lang.String id;
    public a.lt0 item;
    public java.lang.String name;

    public final boolean getCurrent() {
        return this.current;
    }

    public final java.lang.String getId() {
        java.lang.String str = this.id;
        if (str != null) {
            return str;
        }
        a.wv.M1("id");
        throw null;
    }

    public final a.lt0 getItem() {
        a.lt0 lt0Var = this.item;
        if (lt0Var != null) {
            return lt0Var;
        }
        a.wv.M1("item");
        throw null;
    }

    public final java.lang.String getName() {
        java.lang.String str = this.name;
        if (str != null) {
            return str;
        }
        a.wv.M1("name");
        throw null;
    }

    public final void setCurrent(boolean z) {
        this.current = z;
    }

    public final void setId(java.lang.String str) {
        a.wv.w(str, "<set-?>");
        this.id = str;
    }

    public final void setItem(a.lt0 lt0Var) {
        a.wv.w(lt0Var, "<set-?>");
        this.item = lt0Var;
    }

    public final void setName(java.lang.String str) {
        a.wv.w(str, "<set-?>");
        this.name = str;
    }
}
