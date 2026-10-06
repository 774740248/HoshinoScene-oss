package com.omarea.ui.files;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class BreadcrumbView extends android.widget.HorizontalScrollView {
    public static final /* synthetic */ int e = 0;
    public a.bp0 c;
    public final android.widget.LinearLayout d;

    public BreadcrumbView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        this.d = linearLayout;
        setHorizontalScrollBarEnabled(false);
        addView(linearLayout, new android.widget.FrameLayout.LayoutParams(-2, -1));
    }

    public static final void setPath$lambda$2(com.omarea.ui.files.BreadcrumbView breadcrumbView) {
        a.wv.w(breadcrumbView, "this$0");
        breadcrumbView.fullScroll(66);
    }

    public final void b(java.lang.String str, java.lang.String str2, boolean z) {
        android.widget.TextView textView = new android.widget.TextView(getContext());
        textView.setText(str);
        textView.setTextSize(14.0f);
        textView.setSingleLine(true);
        textView.setTextColor(c(z ? android.R.attr.textColorPrimary : android.R.attr.textColorSecondary));
        int i = (int) (textView.getResources().getDisplayMetrics().density * 8);
        textView.setPadding(i, 0, i, 0);
        if (z) {
            textView.setTypeface(android.graphics.Typeface.DEFAULT_BOLD);
        } else {
            android.util.TypedValue typedValue = new android.util.TypedValue();
            textView.getContext().getTheme().resolveAttribute(android.R.attr.selectableItemBackground, typedValue, true);
            textView.setBackgroundResource(typedValue.resourceId);
            textView.setOnClickListener(new a.wi(this, 10, str2));
        }
        textView.setOnLongClickListener(new a.ni(textView, 2, str2));
        this.d.addView(textView);
    }

    public final int c(int i) {
        android.util.TypedValue typedValue = new android.util.TypedValue();
        getContext().getTheme().resolveAttribute(i, typedValue, true);
        int i2 = typedValue.type;
        if (i2 >= 28 && i2 <= 31) {
            return typedValue.data;
        }
        android.content.Context context = getContext();
        int i3 = typedValue.resourceId;
        java.lang.Object obj = a.zx.f748a;
        return a.yx.a(context, i3);
    }

    public final a.bp0 getOnNavigate() {
        return this.c;
    }

    public final void setOnNavigate(a.bp0 bp0Var) {
        this.c = bp0Var;
    }

    public final void setPath(java.lang.String str) {
        a.wv.w(str, "path");
        if (str.length() > 1) {
            str = a.yi1.H2(str, '/');
        }
        android.widget.LinearLayout linearLayout = this.d;
        linearLayout.removeAllViews();
        java.util.List y2 = a.yi1.y2(str, new java.lang.String[]{"/"});
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : y2) {
            if (((java.lang.String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        b("/", "/", arrayList.isEmpty());
        java.util.Iterator it = arrayList.iterator();
        java.lang.String str2 = "";
        int i = 0;
        while (it.hasNext()) {
            int i2 = i + 1;
            java.lang.String str3 = (java.lang.String) it.next();
            str2 = a.ii1.f(str2, "/", str3);
            android.widget.TextView textView = new android.widget.TextView(getContext());
            textView.setText("›");
            textView.setTextSize(14.0f);
            textView.setTextColor(c(android.R.attr.textColorSecondary));
            linearLayout.addView(textView);
            b(str3, str2, i == a.b20.d0(arrayList));
            i = i2;
        }
        post(new a.fw(21, this));
    }
}
