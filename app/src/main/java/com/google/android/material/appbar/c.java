package com.google.android.material.appbar;
import a.z0;


/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class c implements z0 {
    public final /* synthetic */ androidx.coordinatorlayout.widget.CoordinatorLayout c;
    public final /* synthetic */ com.google.android.material.appbar.AppBarLayout d;
    public final /* synthetic */ android.view.View e;
    public final /* synthetic */ int f;
    public final /* synthetic */ com.google.android.material.appbar.AppBarLayout.BaseBehavior g;

    public c(com.google.android.material.appbar.AppBarLayout.BaseBehavior baseBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, com.google.android.material.appbar.AppBarLayout appBarLayout, android.view.View view, int i) {
        this.g = baseBehavior;
        this.c = coordinatorLayout;
        this.d = appBarLayout;
        this.e = view;
        this.f = i;
    }

    @Override // z0
    public final boolean d(android.view.View view) {
        this.g.A(this.c, this.d, this.e, this.f, new int[]{0, 0});
        return true;
    }
}
