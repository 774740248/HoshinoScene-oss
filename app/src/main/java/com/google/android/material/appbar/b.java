package com.google.android.material.appbar;
import a.g0;
import a.u;


/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class b extends u {
    public final /* synthetic */ com.google.android.material.appbar.AppBarLayout.BaseBehavior d;

    public b(com.google.android.material.appbar.AppBarLayout.BaseBehavior baseBehavior) {
        this.d = baseBehavior;
    }

    @Override // u
    public final void d(android.view.View view, g0 g0Var) {
        this.f573a.onInitializeAccessibilityNodeInfo(view, g0Var.f165a);
        g0Var.h(this.d.o);
        g0Var.g(android.widget.ScrollView.class.getName());
    }
}
