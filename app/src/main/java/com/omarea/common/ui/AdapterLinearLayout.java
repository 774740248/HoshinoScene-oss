package com.omarea.common.ui;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class AdapterLinearLayout extends android.widget.LinearLayout {
    public static final /* synthetic */ int e = 0;
    public android.widget.BaseAdapter c;
    public final a.sw0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdapterLinearLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        a.wv.w(context, "context");
        this.d = new a.sw0(4, this);
        setOrientation(1);
    }

    public final void a() {
        removeAllViews();
        android.widget.BaseAdapter baseAdapter = this.c;
        if (baseAdapter == null) {
            return;
        }
        int count = baseAdapter.getCount();
        for (int i = 0; i < count; i++) {
            addView(baseAdapter.getView(i, null, this));
        }
        requestLayout();
    }

    public final android.widget.BaseAdapter getAdapter() {
        return this.c;
    }

    public final void setAdapter(android.widget.BaseAdapter baseAdapter) {
        android.widget.BaseAdapter baseAdapter2 = this.c;
        a.sw0 sw0Var = this.d;
        if (baseAdapter2 != null) {
            baseAdapter2.unregisterDataSetObserver(sw0Var);
        }
        this.c = baseAdapter;
        if (baseAdapter != null) {
            baseAdapter.registerDataSetObserver(sw0Var);
        }
        a();
    }
}
