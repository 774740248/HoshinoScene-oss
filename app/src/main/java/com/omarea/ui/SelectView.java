package com.omarea.ui;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class SelectView extends android.widget.FrameLayout {
    public static final /* synthetic */ int k = 0;
    public a.fp0 c;
    public int d;
    public java.util.List e;
    public int f;
    public android.widget.PopupWindow g;
    public final android.widget.TextView h;
    public final android.widget.ImageView i;
    public long j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        a.wv.w(context, "context");
        this.e = a.qb0.c;
        this.f = -1;
        android.view.LayoutInflater.from(getContext()).inflate(2131558727, (android.view.ViewGroup) this, true);
        android.view.View findViewById = findViewById(2131363077);
        a.wv.v(findViewById, "findViewById(R.id.select_label)");
        this.h = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = findViewById(2131363075);
        a.wv.v(findViewById2, "findViewById(R.id.select_arrow)");
        this.i = (android.widget.ImageView) findViewById2;
        setOnTouchListener(new a.aa0(1, this));
        setOnClickListener(new a.gv(13, this));
        d();
        if (attributeSet == null) {
            return;
        }
        android.content.res.TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, a.k81.e);
        a.wv.v(obtainStyledAttributes, "context.obtainStyledAttr…, R.styleable.SelectView)");
        this.d = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        android.content.res.TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(attributeSet, new int[]{android.R.attr.enabled});
        a.wv.v(obtainStyledAttributes2, "context.obtainStyledAttr…(android.R.attr.enabled))");
        boolean z = obtainStyledAttributes2.getBoolean(0, true);
        obtainStyledAttributes2.recycle();
        setEnabled(z);
    }

    public final void a(boolean z) {
        float f = z ? 180.0f : 0.0f;
        android.widget.ImageView imageView = this.i;
        if (imageView.getRotation() == f) {
            return;
        }
        android.animation.ObjectAnimator.ofFloat(imageView, android.view.View.ROTATION, imageView.getRotation(), f).setDuration(200L).start();
    }

    public final void b() {
        android.widget.PopupWindow popupWindow = this.g;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
        this.g = null;
    }

    public final int c(int i) {
        return (int) ((i * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public final void d() {
        a.mg1 selectedItem = getSelectedItem();
        android.widget.TextView textView = this.h;
        if (selectedItem == null) {
            textView.setText((java.lang.CharSequence) null);
        } else {
            textView.setText(selectedItem.f350a);
        }
    }

    public final a.fp0 getOnItemSelected() {
        return this.c;
    }

    public final java.lang.CharSequence getPlaceholder() {
        return this.h.getHint();
    }

    public final int getPopupWidth() {
        return this.d;
    }

    public final a.mg1 getSelectedItem() {
        return (a.mg1) a.qv.h2(this.e, this.f);
    }

    public final java.lang.String getValue() {
        a.mg1 mg1Var = (a.mg1) a.qv.h2(this.e, this.f);
        if (mg1Var != null) {
            return mg1Var.b;
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        b();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        setAlpha(z ? 1.0f : 0.5f);
        setClickable(z);
        setFocusable(z);
        this.h.setEnabled(z);
        this.i.setEnabled(z);
        if (z) {
            return;
        }
        b();
    }

    public final void setItems(java.util.List<a.mg1> list) {
        a.wv.w(list, "items");
        java.lang.String value = getValue();
        this.e = list;
        int i = -1;
        if (value != null) {
            java.util.Iterator<a.mg1> it = list.iterator();
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (a.wv.e(it.next().b, value)) {
                    i = i2;
                    break;
                }
                i2++;
            }
        }
        this.f = i;
        d();
    }

    public final void setOnItemSelected(a.fp0 fp0Var) {
        this.c = fp0Var;
    }

    public final void setPlaceholder(java.lang.CharSequence charSequence) {
        this.h.setHint(charSequence);
    }

    public final void setPopupWidth(int i) {
        this.d = i;
    }

    public final void setValue(java.lang.String str) {
        int i = -1;
        if (str != null) {
            java.util.Iterator it = this.e.iterator();
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (a.wv.e(((a.mg1) it.next()).b, str)) {
                    i = i2;
                    break;
                }
                i2++;
            }
        }
        this.f = i;
        d();
    }
}
