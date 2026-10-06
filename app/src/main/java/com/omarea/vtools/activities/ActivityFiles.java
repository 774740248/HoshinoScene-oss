package com.omarea.vtools.activities;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ActivityFiles extends a.p5 implements a.c61, a.ni0 {
    public static final /* synthetic */ a.gu0[] C;
    public a.bp0 B;
    public a.ga1 y;
    public final a.yq1 d = a.b20.i(this, 2131363299);
    public final a.yq1 e = a.b20.i(this, 2131362089);
    public final a.yq1 f = a.b20.i(this, 2131362095);
    public final a.yq1 g = a.b20.i(this, 2131362107);
    public final a.yq1 h = a.b20.i(this, 2131362101);
    public final a.yq1 i = a.b20.i(this, 2131362099);
    public final a.yq1 j = a.b20.i(this, 2131362108);
    public final a.yq1 k = a.b20.i(this, 2131362104);
    public final a.yq1 l = a.b20.i(this, 2131362119);
    public final a.yq1 m = a.b20.i(this, 2131362482);
    public final a.yq1 n = a.b20.i(this, 2131362110);
    public final a.yq1 o = a.b20.i(this, 2131362485);
    public final a.yq1 p = a.b20.i(this, 2131362486);
    public final a.yq1 q = a.b20.i(this, 2131362487);
    public final a.yq1 r = a.b20.i(this, 2131362741);
    public final a.yq1 s = a.b20.i(this, 2131363042);
    public final a.yq1 t = a.b20.i(this, 2131363232);
    public final a.yq1 u = a.b20.i(this, 2131363293);
    public final a.yq1 v = a.b20.i(this, 2131363294);
    public final java.util.ArrayList w = new java.util.ArrayList();
    public int x = -1;
    public final a.vj1 z = new a.vj1(new a.n8(this, 1));
    public final int A = 65401;

    static {
        a.d81 d81Var = new a.d81(com.omarea.vtools.activities.ActivityFiles.class, "top_bar", "getTop_bar()Landroid/widget/LinearLayout;");
        a.na1.f375a.getClass();
        C = new a.gu0[]{d81Var, new a.d81(com.omarea.vtools.activities.ActivityFiles.class, "bottom_bar", "getBottom_bar()Landroid/widget/FrameLayout;"), new a.d81(com.omarea.vtools.activities.ActivityFiles.class, "breadcrumb_bar", "getBreadcrumb_bar()Lcom/omarea/ui/files/BreadcrumbView;"), new a.d81(com.omarea.vtools.activities.ActivityFiles.class, "btn_more", "getBtn_more()Landroid/widget/ImageView;"), new a.d81(com.omarea.vtools.activities.ActivityFiles.class, "btn_delete", "getBtn_delete()Landroid/widget/ImageView;"), new a.d81(com.omarea.vtools.activities.ActivityFiles.class, "btn_copy", "getBtn_copy()Landroid/widget/ImageView;"), new a.d81(com.omarea.vtools.activities.ActivityFiles.class, "btn_move", "getBtn_move()Landroid/widget/ImageView;"), new a.d81(com.omarea.vtools.activities.ActivityFiles.class, "btn_favorite", "getBtn_favorite()Landroid/widget/ImageView;"), new a.d81(com.omarea.vtools.activities.ActivityFiles.class, "btn_sort", "getBtn_sort()Landroid/widget/ImageView;"), new a.d81(com.omarea.vtools.activities.ActivityFiles.class, "file_list_container", "getFile_list_container()Lcom/omarea/ui/BlurView;"), new a.d81(com.omarea.vtools.activities.ActivityFiles.class, "btn_paste", "getBtn_paste()Landroid/widget/Button;"), new a.d81(com.omarea.vtools.activities.ActivityFiles.class, "file_paste_path", "getFile_paste_path()Landroid/widget/TextView;"), new a.d81(com.omarea.vtools.activities.ActivityFiles.class, "file_paste_preview", "getFile_paste_preview()Landroid/widget/ImageView;"), new a.d81(com.omarea.vtools.activities.ActivityFiles.class, "file_paste_summary", "getFile_paste_summary()Lcom/omarea/ui/BlurViewLinearLayout;"), new a.d81(com.omarea.vtools.activities.ActivityFiles.class, "list_files", "getList_files()Landroidx/recyclerview/widget/RecyclerView;"), new a.d81(com.omarea.vtools.activities.ActivityFiles.class, "search_bar", "getSearch_bar()Lcom/omarea/ui/SearchInput;"), new a.d81(com.omarea.vtools.activities.ActivityFiles.class, "tab_bar", "getTab_bar()Lcom/omarea/ui/TabBarView;"), new a.d81(com.omarea.vtools.activities.ActivityFiles.class, "titlebar_buttons", "getTitlebar_buttons()Landroid/widget/LinearLayout;"), new a.d81(com.omarea.vtools.activities.ActivityFiles.class, "titlebar_buttons2", "getTitlebar_buttons2()Landroid/widget/LinearLayout;")};
    }

    public static final void o(com.omarea.vtools.activities.ActivityFiles activityFiles, int i) {
        if (i < 0) {
            activityFiles.getClass();
            return;
        }
        java.util.ArrayList arrayList = activityFiles.w;
        if (i < arrayList.size()) {
            arrayList.remove(i);
            com.omarea.ui.TabBarView z = activityFiles.z();
            if (i < 0) {
                z.getClass();
            } else if (i < z.getTabCount()) {
                z.m.removeViewAt(i);
                int i2 = z.h;
                if (i == i2) {
                    z.h = -1;
                } else if (i < i2) {
                    z.h = i2 - 1;
                }
                z.f();
            }
            if (arrayList.isEmpty()) {
                activityFiles.x = -1;
                activityFiles.A(a.pe0.f434a);
                return;
            }
            int i3 = activityFiles.x;
            if (i == i3) {
                activityFiles.x = -1;
                activityFiles.E(java.lang.Math.min(i, a.b20.d0(arrayList)));
            } else if (i < i3) {
                activityFiles.x = i3 - 1;
            }
        }
    }

    public static final void p(com.omarea.vtools.activities.ActivityFiles activityFiles) {
        activityFiles.s();
        java.util.Iterator it = activityFiles.w.iterator();
        int i = 0;
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            int i2 = i + 1;
            if (i < 0) {
                a.b20.p1();
                throw null;
            }
            a.i8 i8Var = (a.i8) next;
            if (i == activityFiles.x) {
                i8Var.f226a.w();
                i8Var.c = false;
            } else {
                i8Var.c = true;
            }
            i = i2;
        }
    }

    public final void A(java.lang.String str) {
        java.util.ArrayList arrayList = this.w;
        if (arrayList.size() >= z().getMaxTabs()) {
            return;
        }
        arrayList.add(new a.i8(this, str));
        final com.omarea.ui.TabBarView z = z();
        java.lang.String F = F(str);
        if (z.getTabCount() < z.f) {
            final android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(z.getContext());
            final int i = 0;
            linearLayout.setOrientation(0);
            linearLayout.setGravity(16);
            linearLayout.setPadding(z.b(14), 0, z.b(6), 0);
            android.util.TypedValue typedValue = new android.util.TypedValue();
            final int i2 = 1;
            z.getContext().getTheme().resolveAttribute(android.R.attr.selectableItemBackground, typedValue, true);
            android.content.Context context = z.getContext();
            int i3 = typedValue.resourceId;
            java.lang.Object obj = a.zx.f748a;
            linearLayout.setBackground(a.xx.b(context, i3));
            android.widget.TextView textView = new android.widget.TextView(z.getContext());
            textView.setText(F);
            textView.setTextSize(14.0f);
            textView.setSingleLine(true);
            textView.setEllipsize(android.text.TextUtils.TruncateAt.END);
            textView.setMaxWidth(z.b(160));
            textView.setTextColor(z.c(android.R.attr.textColorSecondary));
            android.widget.ImageView imageView = new android.widget.ImageView(z.getContext());
            imageView.setImageResource(2131230909);
            imageView.setColorFilter(z.c(android.R.attr.textColorSecondary));
            imageView.setScaleType(android.widget.ImageView.ScaleType.CENTER_INSIDE);
            int b = z.b(10);
            imageView.setPadding(b, b, b, b);
            linearLayout.addView(textView, z.g == 0 ? new android.widget.LinearLayout.LayoutParams(-2, -2) : new android.widget.LinearLayout.LayoutParams(0, -2, 1.0f));
            android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(z.b(32), z.b(32));
            layoutParams.setMarginStart(z.b(4));
            linearLayout.addView(imageView, layoutParams);
            linearLayout.setOnClickListener(new a.xj1());
            imageView.setOnClickListener(new a.xj1());
            z.m.addView(linearLayout, z.d());
            z.f();
            z.post(new a.fw(18, z));
        }
        E(a.b20.d0(arrayList));
    }

    public final void B(a.mc1 mc1Var, boolean z, a.bp0 bp0Var) {
        if (mc1Var == null) {
            w().setVisibility(8);
            return;
        }
        w().animate().cancel();
        w().setTranslationX(0.0f);
        w().setAlpha(1.0f);
        w().setVisibility(0);
        a.gu0[] gu0VarArr = C;
        ((android.widget.TextView) this.o.a(gu0VarArr[11])).setText(getString(z ? 2131952448 : 2131952446, mc1Var.c));
        a.gu0 gu0Var = gu0VarArr[12];
        a.yq1 yq1Var = this.p;
        ((android.widget.ImageView) yq1Var.a(gu0Var)).setImageResource(mc1Var.f343a ? 2131230938 : 2131230931);
        new a.vd0(getContext()).L1(mc1Var, (android.widget.ImageView) yq1Var.a(gu0VarArr[12]));
        v().setOnClickListener(new a.sg(this, mc1Var, bp0Var, 9));
    }

    public final void C(final java.util.ArrayList arrayList, final boolean z) {
        w().animate().cancel();
        w().setTranslationX(0.0f);
        w().setAlpha(1.0f);
        w().setVisibility(0);
        int size = arrayList.size();
        a.gu0[] gu0VarArr = C;
        ((android.widget.TextView) this.o.a(gu0VarArr[11])).setText(getString(z ? 2131952447 : 2131952445, a.qv.e2(arrayList), java.lang.Integer.valueOf(size)));
        ((android.widget.ImageView) this.p.a(gu0VarArr[12])).setImageResource(2131230938);
        v().setOnClickListener(new a.f8());
    }

    public final void E(int i) {
        android.widget.TextView e;
        if (i == this.x || i < 0) {
            return;
        }
        java.util.ArrayList arrayList = this.w;
        if (i < arrayList.size()) {
            a.i8 i8Var = (a.i8) a.qv.h2(this.w, this.x);
            if (i8Var != null) {
                androidx.recyclerview.widget.a layoutManager = x().getLayoutManager();
                androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager ? (androidx.recyclerview.widget.LinearLayoutManager) layoutManager : null;
                if (linearLayoutManager != null) {
                    android.view.View childAt = x().getChildAt(0);
                    i8Var.b = new a.y31(java.lang.Integer.valueOf(linearLayoutManager.W0()), java.lang.Integer.valueOf(childAt != null ? childAt.getTop() : 0));
                }
            }
            this.x = i;
            com.omarea.ui.TabBarView z = z();
            if (i >= 0 && i < z.getTabCount()) {
                z.h = i;
                int tabCount = z.getTabCount();
                for (int i2 = 0; i2 < tabCount; i2++) {
                    android.view.View childAt2 = z.m.getChildAt(i2);
                    android.widget.LinearLayout linearLayout = childAt2 instanceof android.widget.LinearLayout ? (android.widget.LinearLayout) childAt2 : null;
                    if (linearLayout != null && (e = com.omarea.ui.TabBarView.e(linearLayout)) != null) {
                        android.view.View childAt3 = linearLayout.getChildAt(1);
                        android.widget.ImageView imageView = childAt3 instanceof android.widget.ImageView ? (android.widget.ImageView) childAt3 : null;
                        if (i2 == z.h) {
                            android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
                            gradientDrawable.setShape(0);
                            gradientDrawable.setCornerRadius(z.b(18));
                            gradientDrawable.setColor(z.c(android.R.attr.colorBackground));
                            linearLayout.setBackground(gradientDrawable);
                            e.setTextColor(z.c(android.R.attr.textColorPrimary));
                            e.setTypeface(android.graphics.Typeface.DEFAULT_BOLD);
                            if (imageView != null) {
                                imageView.setAlpha(1.0f);
                            }
                        } else {
                            android.util.TypedValue typedValue = new android.util.TypedValue();
                            z.getContext().getTheme().resolveAttribute(android.R.attr.selectableItemBackground, typedValue, true);
                            android.content.Context context = z.getContext();
                            int i3 = typedValue.resourceId;
                            java.lang.Object obj = a.zx.f748a;
                            linearLayout.setBackground(a.xx.b(context, i3));
                            e.setTextColor(z.c(android.R.attr.textColorSecondary));
                            e.setTypeface(android.graphics.Typeface.DEFAULT);
                            if (imageView != null) {
                                imageView.setAlpha(0.4f);
                            }
                        }
                    }
                }
                z.post(new a.tb1(i, 3, z));
            }
            java.lang.Object obj2 = arrayList.get(i);
            a.wv.v(obj2, "tabs[index]");
            a.i8 i8Var2 = (a.i8) obj2;
            androidx.recyclerview.widget.RecyclerView x = x();
            a.xj xjVar = i8Var2.f226a;
            x.setAdapter(xjVar);
            if (i8Var2.c) {
                i8Var2.c = false;
                xjVar.w();
            }
            java.lang.String r = xjVar.r();
            if (r != null) {
                u().setPath(r);
            }
            y().b();
            y().setKeyword(xjVar.h);
            a.y31 y31Var = i8Var2.b;
            if (y31Var != null) {
                x().post(new a.so(this, 24, y31Var));
            }
        }
    }

    public final java.lang.String F(java.lang.String str) {
        if (a.wv.e(str, a.pe0.f434a)) {
            java.lang.String string = getString(2131952414);
            a.wv.v(string, "getString(R.string.fs_external_storage)");
            return string;
        }
        if (str.length() > 1) {
            str = a.yi1.H2(str, '/');
        }
        java.lang.String D2 = a.yi1.D2(str, '/', str);
        return D2.length() == 0 ? "/" : D2;
    }

    @Override // a.p5
    public final void autoLayout(android.content.res.Configuration configuration) {
        super.autoLayout(configuration);
        boolean z = (configuration == null ? getResources().getConfiguration() : configuration).orientation == 2;
        int dimensionPixelSize = getResources().getDimensionPixelSize(2131165267);
        a.gu0[] gu0VarArr = C;
        a.gu0 gu0Var = gu0VarArr[1];
        a.yq1 yq1Var = this.e;
        android.view.ViewGroup.LayoutParams layoutParams = ((android.widget.FrameLayout) yq1Var.a(gu0Var)).getLayoutParams();
        a.wv.t(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) layoutParams;
        android.view.ViewGroup.LayoutParams layoutParams3 = z().getLayoutParams();
        a.wv.t(layoutParams3, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        android.widget.FrameLayout.LayoutParams layoutParams4 = (android.widget.FrameLayout.LayoutParams) layoutParams3;
        a.gu0 gu0Var2 = gu0VarArr[9];
        a.yq1 yq1Var2 = this.m;
        android.view.ViewGroup.LayoutParams layoutParams5 = ((com.omarea.ui.BlurView) yq1Var2.a(gu0Var2)).getLayoutParams();
        a.wv.t(layoutParams5, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        android.widget.RelativeLayout.LayoutParams layoutParams6 = (android.widget.RelativeLayout.LayoutParams) layoutParams5;
        android.view.ViewGroup.LayoutParams layoutParams7 = u().getLayoutParams();
        a.wv.t(layoutParams7, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        android.widget.RelativeLayout.LayoutParams layoutParams8 = (android.widget.RelativeLayout.LayoutParams) layoutParams7;
        a.gu0 gu0Var3 = gu0VarArr[0];
        a.yq1 yq1Var3 = this.d;
        android.view.ViewGroup.LayoutParams layoutParams9 = ((android.widget.LinearLayout) yq1Var3.a(gu0Var3)).getLayoutParams();
        a.wv.t(layoutParams9, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        android.widget.RelativeLayout.LayoutParams layoutParams10 = (android.widget.RelativeLayout.LayoutParams) layoutParams9;
        if (z) {
            z().setTabOrientation(1);
            layoutParams10.topMargin = 0;
            layoutParams2.width = r(160);
            layoutParams2.height = -1;
            layoutParams2.addRule(3, 2131363299);
            layoutParams2.addRule(20);
            layoutParams2.addRule(12);
            layoutParams2.setMargins(dimensionPixelSize, r(4), 0, 0);
            layoutParams4.width = -1;
            layoutParams4.height = -1;
            layoutParams6.removeRule(2);
            layoutParams6.addRule(17, 2131362089);
            layoutParams6.addRule(12);
            layoutParams8.removeRule(3);
            layoutParams8.leftMargin = r(200);
            layoutParams8.topMargin = r(16);
            layoutParams8.rightMargin = r(176);
        } else {
            z().setTabOrientation(0);
            layoutParams10.topMargin = r(28);
            layoutParams2.width = -1;
            layoutParams2.height = -2;
            layoutParams2.removeRule(3);
            layoutParams2.removeRule(20);
            layoutParams2.addRule(12);
            layoutParams2.setMargins(dimensionPixelSize, r(4), dimensionPixelSize, 0);
            layoutParams4.width = -1;
            layoutParams4.height = r(44);
            layoutParams6.removeRule(17);
            layoutParams6.removeRule(12);
            layoutParams6.addRule(2, 2131362089);
            layoutParams8.addRule(3, 2131362729);
            layoutParams8.leftMargin = r(16);
            layoutParams8.topMargin = 0;
            layoutParams8.rightMargin = r(16);
        }
        ((android.widget.LinearLayout) yq1Var3.a(gu0VarArr[0])).setLayoutParams(layoutParams10);
        ((android.widget.FrameLayout) yq1Var.a(gu0VarArr[1])).setLayoutParams(layoutParams2);
        z().setLayoutParams(layoutParams4);
        ((com.omarea.ui.BlurView) yq1Var2.a(gu0VarArr[9])).setLayoutParams(layoutParams6);
        u().setLayoutParams(layoutParams8);
    }

    @Override // a.ni0
    public final void c(java.lang.String str, a.bp0 bp0Var) {
        this.B = bp0Var;
        com.omarea.vtools.activities.ActivityFileSelector.m.getClass();
        startActivityForResult(a.fa0.j(this, str), this.A);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        a.wv.w(motionEvent, "ev");
        com.omarea.ui.SearchInput y = y();
        y.getClass();
        if (motionEvent.getAction() == 0 && y.i && !y.j) {
            android.graphics.Rect rect = new android.graphics.Rect();
            y.getGlobalVisibleRect(rect);
            if (!rect.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
                y.c();
                com.omarea.ui.SearchInputEditText searchInputEditText = y.l;
                if (searchInputEditText == null) {
                    a.wv.M1("editText");
                    throw null;
                }
                searchInputEditText.clearFocus();
                if (y.i) {
                    y.b();
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // a.kk0, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, android.content.Intent intent) {
        if (i == this.A) {
            java.lang.String stringExtra = (i2 != -1 || intent == null) ? null : intent.getStringExtra("file");
            a.bp0 bp0Var = this.B;
            if (bp0Var != null) {
                this.B = null;
                if (stringExtra != null) {
                    bp0Var.i(stringExtra);
                }
            }
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // a.p5, a.ml, a.kk0, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(android.content.res.Configuration configuration) {
        a.wv.w(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        autoLayout(configuration);
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [a.ja1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v15, types: [a.ja1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6, types: [a.ha1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, a.ma1] */
    @Override // a.p5, a.kk0, androidx.activity.ComponentActivity, a.nw, android.app.Activity
    public final void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131558450);
        setBackArrow();
        final int i = 1;
        x().setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(1));
        final int i2 = 2;
        this.y = new a.ga1(x(), new a.n8(this, i2), new a.m8(this, 2));
        final int i3 = 3;
        z().setOnTabAdded(new a.n8(this, i3));
        final int i4 = 4;
        z().setOnTabSelected(new a.k8(this, i4));
        final int i5 = 5;
        z().setOnTabClosed(new a.k8(this, i5));
        A(a.pe0.f434a);
        a.gu0[] gu0VarArr = C;
        a.gu0 gu0Var = gu0VarArr[3];
        a.yq1 yq1Var = this.g;
        final int i6 = 0;
        ((android.widget.ImageView) yq1Var.a(gu0Var)).setOnClickListener(new a.d8(this));
        ((android.widget.ImageView) yq1Var.a(gu0VarArr[3])).setOnLongClickListener(new a.e8(this));
        a.gu0 gu0Var2 = gu0VarArr[7];
        a.yq1 yq1Var2 = this.k;
        ((android.widget.ImageView) yq1Var2.a(gu0Var2)).setOnClickListener(new a.d8(this));
        ((android.widget.ImageView) yq1Var2.a(gu0VarArr[7])).setOnLongClickListener(new a.e8(this));
        ((android.widget.ImageView) this.l.a(gu0VarArr[8])).setOnClickListener(new a.d8(this));
        y().setOnKeywordChanged(new a.k8(this, i));
        y().setOnSubmit(new a.k8(this, i2));
        ((android.widget.ImageView) this.h.a(gu0VarArr[4])).setOnClickListener(new a.d8(this));
        ((android.widget.ImageView) this.i.a(gu0VarArr[5])).setOnClickListener(new a.d8(this));
        ((android.widget.ImageView) this.j.a(gu0VarArr[6])).setOnClickListener(new a.d8(this));
        u().setOnNavigate(new a.k8(this, i3));
        android.view.ViewConfiguration viewConfiguration = android.view.ViewConfiguration.get(this);
        final int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
        final int scaledMinimumFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity() * 8;
        a.ma1 obj = new a.ma1();
        a.ma1 obj2 = new a.ma1();
        a.ma1 obj3 = new a.ma1();
        final java.lang.Object obj4 = new java.lang.Object();
        /* TODO: jadx type unresolved, defaulted to Object */
        w().setOnTouchListener(new a.g8());
        a.p5.autoLayout$default(this, null, 1, null);
        getOnBackPressedDispatcher().addCallback(this, new a.tl0(this, 6));
    }

    @Override // a.c61
    public final boolean onMenuItemClick(android.view.MenuItem menuItem) {
        a.wv.w(menuItem, "item");
        int itemId = menuItem.getItemId();
        if (itemId == 2131362798) {
            a.xj t = t();
            a.wv.s(t);
            t.y(1);
        } else if (itemId == 2131362804) {
            a.xj t2 = t();
            a.wv.s(t2);
            t2.y(2);
        } else if (itemId == 2131362808) {
            a.xj t3 = t();
            a.wv.s(t3);
            t3.y(3);
        } else if (itemId == 2131362809) {
            a.xj t4 = t();
            a.wv.s(t4);
            t4.y(4);
        } else if (itemId == 2131362795 || itemId == 2131362796) {
            q(menuItem.getItemId() == 2131362796);
        } else if (itemId == 2131362807) {
            android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.omarea.vtools.activities.ActivityFilesTreemap.class);
            a.xj t5 = t();
            a.wv.s(t5);
            intent.putExtra("dir", t5.r());
            startActivity(intent);
        } else if (itemId == 2131362791) {
            a.xj t6 = t();
            a.wv.s(t6);
            java.lang.String r = t6.r();
            if (r == null) {
                r = "";
            }
            java.lang.Object systemService = getContext().getSystemService("clipboard");
            a.wv.t(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
            ((android.content.ClipboardManager) systemService).setPrimaryClip(android.content.ClipData.newPlainText(r, r));
            android.widget.Toast.makeText(getContext(), getContext().getString(2131951907) + r, 1).show();
        } else if (itemId == 2131362803) {
            a.xj t7 = t();
            if (t7 != null) {
                t7.z = true;
                t7.f();
            }
            a.gu0[] gu0VarArr = C;
            ((android.widget.LinearLayout) this.u.a(gu0VarArr[17])).setVisibility(8);
            ((android.widget.LinearLayout) this.v.a(gu0VarArr[18])).setVisibility(0);
        }
        return onContextItemSelected(menuItem);
    }

    @Override // a.p5, a.kk0, android.app.Activity
    public final void onResume() {
        super.onResume();
        setTitle(getString(2131952898));
    }

    public final void q(boolean z) {
        a.ab1 ab1Var = new a.ab1(".*[\\\\/:*?\"<>|].*");
        int i = a.x60.f681a;
        java.lang.String string = z ? getString(2131952436) : getString(2131952435);
        a.wv.v(string, "if (isFolder) {\n        …s_new_file)\n            }");
        java.lang.String string2 = getString(2131952421);
        a.wv.v(string2, "getString(R.string.fs_input_file_name)");
        a.fs1.H(this, string, string2, "", new a.l8(ab1Var, this, z));
    }

    public final int r(int i) {
        return (int) ((i * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public final void s() {
        a.xj t = t();
        if (t != null) {
            t.z = false;
            t.A.clear();
            t.f();
        }
        a.gu0[] gu0VarArr = C;
        ((android.widget.LinearLayout) this.u.a(gu0VarArr[17])).setVisibility(0);
        ((android.widget.LinearLayout) this.v.a(gu0VarArr[18])).setVisibility(8);
    }

    public final a.xj t() {
        a.i8 i8Var = (a.i8) a.qv.h2(this.w, this.x);
        if (i8Var != null) {
            return i8Var.f226a;
        }
        return null;
    }

    public final com.omarea.ui.files.BreadcrumbView u() {
        return (com.omarea.ui.files.BreadcrumbView) this.f.a(C[2]);
    }

    public final android.widget.Button v() {
        return (android.widget.Button) this.n.a(C[10]);
    }

    public final com.omarea.ui.BlurViewLinearLayout w() {
        return (com.omarea.ui.BlurViewLinearLayout) this.q.a(C[13]);
    }

    public final androidx.recyclerview.widget.RecyclerView x() {
        return (androidx.recyclerview.widget.RecyclerView) this.r.a(C[14]);
    }

    public final com.omarea.ui.SearchInput y() {
        return (com.omarea.ui.SearchInput) this.s.a(C[15]);
    }

    public final com.omarea.ui.TabBarView z() {
        return (com.omarea.ui.TabBarView) this.t.a(C[16]);
    }
}
