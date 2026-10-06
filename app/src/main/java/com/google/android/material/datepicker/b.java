package com.google.android.material.datepicker;
import a.da1;
import a.jq1;
import a.np1;


/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class b extends da1 {
    public final android.widget.TextView u;
    public final com.google.android.material.datepicker.MaterialCalendarGridView v;

    public b(android.widget.LinearLayout linearLayout, boolean z) {
        super(linearLayout);
        android.widget.TextView textView = (android.widget.TextView) linearLayout.findViewById(2131362849);
        this.u = textView;
        java.util.WeakHashMap weakHashMap = jq1.f264a;
        new np1(2131363239, 3).b(textView, java.lang.Boolean.TRUE);
        this.v = (com.google.android.material.datepicker.MaterialCalendarGridView) linearLayout.findViewById(2131362844);
        if (z) {
            return;
        }
        textView.setVisibility(8);
    }
}
