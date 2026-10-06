package com.google.android.material.datepicker;
import a.o11;
import a.pe;
import a.wy0;
import a.y10;


/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class a implements android.widget.AdapterView.OnItemClickListener {
    public final /* synthetic */ com.google.android.material.datepicker.MaterialCalendarGridView c;
    public final /* synthetic */ com.google.android.material.datepicker.c d;

    public a(com.google.android.material.datepicker.c cVar, com.google.android.material.datepicker.MaterialCalendarGridView materialCalendarGridView) {
        this.d = cVar;
        this.c = materialCalendarGridView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i, long j) {
        com.google.android.material.datepicker.MaterialCalendarGridView materialCalendarGridView = this.c;
        o11 a2 = materialCalendarGridView.getAdapter();
        if (i < a2.a() || i > a2.c()) {
            return;
        }
        pe peVar = this.d.g;
        long longValue = materialCalendarGridView.getAdapter().getItem(i).longValue();
        java.lang.Object obj = peVar.c;
        if (longValue < ((y10) ((wy0) obj).Y.e).c) {
            return;
        }
        ((wy0) obj).getClass();
        throw null;
    }
}
