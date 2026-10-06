package com.omarea.ui;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class SearchInput extends com.omarea.ui.BlurViewLinearLayout {
    public static final /* synthetic */ int m = 0;
    public int f;
    public a.bp0 g;
    public a.bp0 h;
    public boolean i;
    public boolean j;
    public int k;
    public final com.omarea.ui.SearchInputEditText l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchInput(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        a.wv.w(context, "context");
        a.wv.w(attributeSet, "attrs");
        this.f = -1;
        int i = 0;
        setOrientation(0);
        setGravity(16);
        android.view.View.inflate(getContext(), 2131558725, this);
        android.view.View findViewById = findViewById(2131363051);
        a.wv.v(findViewById, "findViewById(R.id.search_input_edit)");
        this.l = (com.omarea.ui.SearchInputEditText) findViewById;
        ((android.widget.ImageView) findViewById(2131363050)).setOnClickListener(new a.gv(12, this));
        com.omarea.ui.SearchInputEditText searchInputEditText = this.l;
        if (searchInputEditText == null) {
            a.wv.M1("editText");
            throw null;
        }
        searchInputEditText.setOnFocusChangeListener(new a.hv(2, this));
        com.omarea.ui.SearchInputEditText searchInputEditText2 = this.l;
        if (searchInputEditText2 == null) {
            a.wv.M1("editText");
            throw null;
        }
        searchInputEditText2.addTextChangedListener(new a.yf1(4, this));
        com.omarea.ui.SearchInputEditText searchInputEditText3 = this.l;
        if (searchInputEditText3 == null) {
            a.wv.M1("editText");
            throw null;
        }
        searchInputEditText3.setOnEditorActionListener(new a.uf1(this, i));
        com.omarea.ui.SearchInputEditText searchInputEditText4 = this.l;
        if (searchInputEditText4 != null) {
            searchInputEditText4.setOnBackPressed(new a.vf1(this, 2));
        } else {
            a.wv.M1("editText");
            throw null;
        }
    }

    public final void a(int i, int i2, a.vf1 vf1Var) {
        this.j = true;
        android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(i, i2);
        ofInt.setDuration(250L);
        ofInt.addUpdateListener(new a.z90(2, this));
        ofInt.addListener(new a.in1(this, vf1Var));
        ofInt.start();
    }

    public final void b() {
        if (!this.i || this.j) {
            return;
        }
        this.i = false;
        c();
        int width = getWidth();
        int i = this.k;
        if (i <= 0) {
            i = (int) ((40 * getResources().getDisplayMetrics().density) + 0.5f);
        }
        a(width, i, new a.vf1(this, 0));
    }

    public final void c() {
        java.lang.Object systemService = getContext().getSystemService("input_method");
        a.wv.t(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) systemService;
        com.omarea.ui.SearchInputEditText searchInputEditText = this.l;
        if (searchInputEditText != null) {
            inputMethodManager.hideSoftInputFromWindow(searchInputEditText.getWindowToken(), 0);
        } else {
            a.wv.M1("editText");
            throw null;
        }
    }

    public final void d() {
        java.lang.Object systemService = getContext().getSystemService("input_method");
        a.wv.t(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) systemService;
        com.omarea.ui.SearchInputEditText searchInputEditText = this.l;
        if (searchInputEditText != null) {
            inputMethodManager.showSoftInput(searchInputEditText, 1);
        } else {
            a.wv.M1("editText");
            throw null;
        }
    }

    public final int getExpandedWidthDp() {
        return this.f;
    }

    public final java.lang.CharSequence getHint() {
        com.omarea.ui.SearchInputEditText searchInputEditText = this.l;
        if (searchInputEditText != null) {
            return searchInputEditText.getHint();
        }
        a.wv.M1("editText");
        throw null;
    }

    public final a.bp0 getOnKeywordChanged() {
        return this.g;
    }

    public final a.bp0 getOnSubmit() {
        return this.h;
    }

    @Override // com.omarea.ui.BlurViewLinearLayout, android.widget.LinearLayout, android.view.View
    public final void onDraw(android.graphics.Canvas canvas) {
        a.wv.w(canvas, "canvas");
        android.graphics.Bitmap bitmap = a.wr.f;
        setBorderRadius((getHeight() / 2.0f) - a.wr.k.getStrokeWidth());
        super.onDraw(canvas);
    }

    @Override // com.omarea.ui.BlurViewLinearLayout, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        setOutlineProvider(new a.pc1(i2 / 2.0f));
        super.onSizeChanged(i, i2, i3, i4);
    }

    public final void setExpandedWidthDp(int i) {
        this.f = i;
    }

    public final void setHint(java.lang.CharSequence charSequence) {
        com.omarea.ui.SearchInputEditText searchInputEditText = this.l;
        if (searchInputEditText != null) {
            searchInputEditText.setHint(charSequence);
        } else {
            a.wv.M1("editText");
            throw null;
        }
    }

    public final void setKeyword(java.lang.String str) {
        a.wv.w(str, "value");
        com.omarea.ui.SearchInputEditText searchInputEditText = this.l;
        if (searchInputEditText == null) {
            a.wv.M1("editText");
            throw null;
        }
        searchInputEditText.setText(str);
        com.omarea.ui.SearchInputEditText searchInputEditText2 = this.l;
        if (searchInputEditText2 != null) {
            searchInputEditText2.setSelection(str.length());
        } else {
            a.wv.M1("editText");
            throw null;
        }
    }

    public final void setOnKeywordChanged(a.bp0 bp0Var) {
        this.g = bp0Var;
    }

    public final void setOnSubmit(a.bp0 bp0Var) {
        this.h = bp0Var;
    }
}
