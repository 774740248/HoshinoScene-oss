package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class wy0<S> extends a.t51 {
    public static final /* synthetic */ int i0 = 0;
    public int X;
    public a.ps Y;
    public a.n11 Z;
    public int a0;
    public a.qs b0;
    public androidx.recyclerview.widget.RecyclerView c0;
    public androidx.recyclerview.widget.RecyclerView d0;
    public android.view.View e0;
    public android.view.View f0;
    public android.view.View g0;
    public android.view.View h0;

    public final void S(a.n11 n11Var) {
        com.google.android.material.datepicker.c cVar = (com.google.android.material.datepicker.c) this.d0.getAdapter();
        int u = cVar.f.c.u(n11Var);
        int u2 = u - cVar.f.c.u(this.Z);
        boolean z = java.lang.Math.abs(u2) > 3;
        boolean z2 = u2 > 0;
        this.Z = n11Var;
        if (z && z2) {
            this.d0.i0(u - 3);
            this.d0.post(new a.ry0(this, u));
        } else if (!z) {
            this.d0.post(new a.ry0(this, u));
        } else {
            this.d0.i0(u + 3);
            this.d0.post(new a.ry0(this, u));
        }
    }

    public final void T(int i) {
        this.a0 = i;
        if (i == 2) {
            this.c0.getLayoutManager().z0(this.Z.e - ((a.vu1) this.c0.getAdapter()).f.Y.c.e);
            this.g0.setVisibility(0);
            this.h0.setVisibility(8);
            this.e0.setVisibility(8);
            this.f0.setVisibility(8);
            return;
        }
        if (i == 1) {
            this.g0.setVisibility(8);
            this.h0.setVisibility(0);
            this.e0.setVisibility(0);
            this.f0.setVisibility(0);
            S(this.Z);
        }
    }

    @Override // a.gk0
    public final void r(android.os.Bundle bundle) {
        super.r(bundle);
        if (bundle == null) {
            bundle = this.i;
        }
        this.X = bundle.getInt("THEME_RES_ID_KEY");
        a.ai1.s(bundle.getParcelable("GRID_SELECTOR_KEY"));
        this.Y = (a.ps) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        a.ai1.s(bundle.getParcelable("DAY_VIEW_DECORATOR_KEY"));
        this.Z = (a.n11) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // a.gk0
    public final android.view.View s(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup) {
        int i;
        int i2;
        a.v31 v31Var;
        androidx.recyclerview.widget.RecyclerView recyclerView;
        androidx.recyclerview.widget.RecyclerView recyclerView2;
        android.view.ContextThemeWrapper contextThemeWrapper = new android.view.ContextThemeWrapper(f(), this.X);
        this.b0 = new a.qs(contextThemeWrapper);
        android.view.LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        a.n11 n11Var = this.Y.c;
        int i3 = 1;
        int i4 = 0;
        if (a.dz0.Y(contextThemeWrapper, android.R.attr.windowFullscreen)) {
            i = 2131558693;
            i2 = 1;
        } else {
            i = 2131558688;
            i2 = 0;
        }
        android.view.View inflate = cloneInContext.inflate(i, viewGroup, false);
        android.content.res.Resources resources = L().getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(2131165817) + resources.getDimensionPixelOffset(2131165819) + resources.getDimensionPixelSize(2131165818);
        int dimensionPixelSize = resources.getDimensionPixelSize(2131165802);
        int i5 = a.o11.f;
        inflate.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(2131165816) * (i5 - 1)) + (resources.getDimensionPixelSize(2131165797) * i5) + resources.getDimensionPixelOffset(2131165794));
        android.widget.GridView gridView = (android.widget.GridView) inflate.findViewById(2131362855);
        a.jq1.o(gridView, new a.sy0(this, i4));
        int i6 = this.Y.g;
        gridView.setAdapter((android.widget.ListAdapter) (i6 > 0 ? new a.z10(i6) : new a.z10()));
        gridView.setNumColumns(n11Var.f);
        gridView.setEnabled(false);
        this.d0 = (androidx.recyclerview.widget.RecyclerView) inflate.findViewById(2131362858);
        f();
        this.d0.setLayoutManager(new a.ty0(this, i2, i2));
        this.d0.setTag("MONTHS_VIEW_GROUP_TAG");
        com.google.android.material.datepicker.c cVar = new com.google.android.material.datepicker.c(contextThemeWrapper, this.Y, new a.pe(this));
        this.d0.setAdapter(cVar);
        int integer = contextThemeWrapper.getResources().getInteger(2131427378);
        androidx.recyclerview.widget.RecyclerView recyclerView3 = (androidx.recyclerview.widget.RecyclerView) inflate.findViewById(2131362861);
        this.c0 = recyclerView3;
        if (recyclerView3 != null) {
            recyclerView3.setHasFixedSize(true);
            this.c0.setLayoutManager(new androidx.recyclerview.widget.GridLayoutManager(integer, 0));
            this.c0.setAdapter(new a.vu1(this));
            this.c0.i(new a.uy0(this));
        }
        if (inflate.findViewById(2131362846) != null) {
            com.google.android.material.button.MaterialButton materialButton = (com.google.android.material.button.MaterialButton) inflate.findViewById(2131362846);
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            int i7 = 2;
            a.jq1.o(materialButton, new a.sy0(this, i7));
            android.view.View findViewById = inflate.findViewById(2131362848);
            this.e0 = findViewById;
            findViewById.setTag("NAVIGATION_PREV_TAG");
            android.view.View findViewById2 = inflate.findViewById(2131362847);
            this.f0 = findViewById2;
            findViewById2.setTag("NAVIGATION_NEXT_TAG");
            this.g0 = inflate.findViewById(2131362861);
            this.h0 = inflate.findViewById(2131362854);
            T(1);
            materialButton.setText(this.Z.t());
            this.d0.j(new a.vy0(this, cVar, materialButton));
            materialButton.setOnClickListener(new a.mk(i7, this));
            this.f0.setOnClickListener(new a.qy0(this, cVar, i3));
            this.e0.setOnClickListener(new a.qy0(this, cVar, i4));
        }
        if (!a.dz0.Y(contextThemeWrapper, android.R.attr.windowFullscreen) && (recyclerView2 = (v31Var = new a.v31()).f621a) != (recyclerView = this.d0)) {
            a.zh1 zh1Var = v31Var.b;
            if (recyclerView2 != null) {
                java.util.ArrayList arrayList = recyclerView2.l0;
                if (arrayList != null) {
                    arrayList.remove(zh1Var);
                }
                v31Var.f621a.setOnFlingListener(null);
            }
            v31Var.f621a = recyclerView;
            if (recyclerView != null) {
                if (recyclerView.getOnFlingListener() != null) {
                    throw new java.lang.IllegalStateException("An instance of OnFlingListener already set.");
                }
                v31Var.f621a.j(zh1Var);
                v31Var.f621a.setOnFlingListener(v31Var);
                new android.widget.Scroller(v31Var.f621a.getContext(), new android.view.animation.DecelerateInterpolator());
                v31Var.f();
            }
        }
        this.d0.i0(cVar.f.c.u(this.Z));
        a.jq1.o(this.d0, new a.sy0(this, i3));
        return inflate;
    }

    @Override // a.gk0
    public final void z(android.os.Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.X);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.Y);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.Z);
    }
}
