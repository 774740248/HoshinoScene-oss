package com.google.android.material.datepicker;
import a.da1;
import a.dz0;
import a.e91;
import a.n11;
import a.n91;
import a.o11;
import a.pe;
import a.ps;
import a.so1;
import a.wy0;


/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class c extends e91 {
    public final ps f;
    public final pe g;
    public final int h;

    public c(android.view.ContextThemeWrapper contextThemeWrapper, ps psVar, pe peVar) {
        n11 n11Var = psVar.c;
        n11 n11Var2 = psVar.f;
        if (n11Var.c.compareTo(n11Var2.c) > 0) {
            throw new java.lang.IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (n11Var2.c.compareTo(psVar.d.c) > 0) {
            throw new java.lang.IllegalArgumentException("currentPage cannot be after lastPage");
        }
        int i = o11.f;
        int i2 = wy0.i0;
        this.h = (contextThemeWrapper.getResources().getDimensionPixelSize(2131165797) * i) + (dz0.Y(contextThemeWrapper, android.R.attr.windowFullscreen) ? contextThemeWrapper.getResources().getDimensionPixelSize(2131165797) : 0);
        this.f = psVar;
        this.g = peVar;
        o();
    }

    @Override // e91
    public final int c() {
        return this.f.i;
    }

    @Override // e91
    public final long d(int i) {
        java.util.Calendar b = so1.b(this.f.c.c);
        b.add(2, i);
        return new n11(b).c.getTimeInMillis();
    }

    @Override // e91
    public final void i(da1 da1Var, int i) {
        com.google.android.material.datepicker.b bVar = (com.google.android.material.datepicker.b) da1Var;
        ps psVar = this.f;
        java.util.Calendar b = so1.b(psVar.c.c);
        b.add(2, i);
        n11 n11Var = new n11(b);
        bVar.u.setText(n11Var.t());
        com.google.android.material.datepicker.MaterialCalendarGridView materialCalendarGridView = (com.google.android.material.datepicker.MaterialCalendarGridView) bVar.v.findViewById(2131362844);
        if (materialCalendarGridView.getAdapter() == null || !n11Var.equals(materialCalendarGridView.getAdapter().c)) {
            new o11(n11Var, psVar);
            throw null;
        }
        materialCalendarGridView.invalidate();
        materialCalendarGridView.getAdapter().getClass();
        throw null;
    }

    @Override // e91
    public final da1 k(androidx.recyclerview.widget.RecyclerView recyclerView, int i) {
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) android.view.LayoutInflater.from(recyclerView.getContext()).inflate(2131558690, (android.view.ViewGroup) recyclerView, false);
        if (!dz0.Y(recyclerView.getContext(), android.R.attr.windowFullscreen)) {
            return new com.google.android.material.datepicker.b(linearLayout, false);
        }
        linearLayout.setLayoutParams(new n91(-1, this.h));
        return new com.google.android.material.datepicker.b(linearLayout, true);
    }
}
