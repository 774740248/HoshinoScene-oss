package com.omarea.common.ui;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class Tags extends android.widget.LinearLayout {
    public a.x81 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Tags(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        a.wv.w(context, "context");
        android.view.LayoutInflater.from(context).inflate(2131558730, (android.view.ViewGroup) this, true);
    }

    public final a.x81 a(java.lang.String[] strArr, int i) {
        a.wv.w(strArr, "options");
        removeAllViews();
        android.view.LayoutInflater from = android.view.LayoutInflater.from(getContext());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        a.tq1 tq1Var = new a.tq1((java.util.Iterator) new a.qf0(1, strArr).b());
        int i2 = 0;
        while (tq1Var.hasNext()) {
            a.cs0 cs0Var = (a.cs0) tq1Var.next();
            android.widget.CompoundButton compoundButton = (android.widget.CompoundButton) from.inflate(2131558729, (android.view.ViewGroup) this, false).findViewById(2131363236);
            if (cs0Var.f80a > 0) {
                android.view.ViewGroup.LayoutParams layoutParams = compoundButton.getLayoutParams();
                a.wv.t(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) layoutParams;
                layoutParams2.setMarginStart((int) ((4.0f * getResources().getDisplayMetrics().density) + 0.5f));
                compoundButton.setLayoutParams(layoutParams2);
            }
            addView(compoundButton);
            compoundButton.setText((java.lang.CharSequence) cs0Var.b);
            if (i2 == i) {
                compoundButton.setChecked(true);
            }
            arrayList.add(compoundButton);
            i2++;
        }
        java.util.Iterator it = arrayList.iterator();
        a.wv.v(it, "items.iterator()");
        a.x81 x81Var = new a.x81(it);
        this.c = x81Var;
        return x81Var;
    }

    public final int getCheckedIndex() {
        a.x81 x81Var = this.c;
        a.wv.s(x81Var);
        return x81Var.c();
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        setAlpha(z ? 1.0f : 0.5f);
    }
}
