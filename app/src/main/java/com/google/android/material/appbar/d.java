package com.google.android.material.appbar;
import a.z0;


/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class d implements z0 {
    public final /* synthetic */ com.google.android.material.appbar.AppBarLayout c;
    public final /* synthetic */ boolean d;

    public d(com.google.android.material.appbar.AppBarLayout appBarLayout, boolean z) {
        this.c = appBarLayout;
        this.d = z;
    }

    @Override // z0
    public final boolean d(android.view.View view) {
        this.c.setExpanded(this.d);
        return true;
    }
}
