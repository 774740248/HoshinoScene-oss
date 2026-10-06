package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class uk extends a.ow implements android.content.DialogInterface, a.ql {
    public a.km e;
    public final a.lm f;
    public final a.sk g;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r0v1, types: [a.lm] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public uk(android.content.Context r2, int r3) {
        /*
            r1 = this;
            int r3 = l(r2, r3)
            int r0 = h(r2, r3)
            r1.<init>(r2, r0)
            a.lm r0 = new a.lm
            r0.<init>()
            r1.f = r0
            a.xl r0 = r1.g()
            int r2 = h(r2, r3)
            r3 = r0
            a.km r3 = (a.km) r3
            r3.V = r2
            r0.d()
            a.sk r2 = new a.sk
            android.content.Context r3 = r1.getContext()
            android.view.Window r0 = r1.getWindow()
            r2.<init>(r3, r1, r0)
            r1.g = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a.uk.<init>(android.content.Context, int):void");
    }

    public static int h(android.content.Context context, int i) {
        if (i != 0) {
            return i;
        }
        android.util.TypedValue typedValue = new android.util.TypedValue();
        context.getTheme().resolveAttribute(2130968925, typedValue, true);
        return typedValue.resourceId;
    }

    public static int l(android.content.Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        android.util.TypedValue typedValue = new android.util.TypedValue();
        context.getTheme().resolveAttribute(2130968617, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // android.app.Dialog
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void addContentView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        a.km kmVar = (a.km) g();
        kmVar.z();
        ((android.view.ViewGroup) kmVar.C.findViewById(android.R.id.content)).addView(view, layoutParams);
        kmVar.o.a(kmVar.n.getCallback());
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final void dismiss() {
        super.dismiss();
        g().e();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        return a.wv.S(this.f, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // android.app.Dialog
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final android.view.View findViewById(int i) {
        a.km kmVar = (a.km) g();
        kmVar.z();
        return kmVar.n.findViewById(i);
    }

    public final a.xl g() {
        if (this.e == null) {
            a.to toVar = a.xl.c;
            this.e = new a.km(getContext(), getWindow(), this, this);
        }
        return this.e;
    }

    @Override // android.app.Dialog
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final void invalidateOptionsMenu() {
        g().b();
    }

    public final void j(android.os.Bundle bundle) {
        g().a();
        super.onCreate(bundle);
        g().d();
    }

    @Override // a.ow, android.app.Dialog
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final void onStop() {
        super.onStop();
        a.km kmVar = (a.km) g();
        kmVar.D();
        a.d1 d1Var = kmVar.q;
        if (d1Var != null) {
            d1Var.o(false);
        }
    }

    @Override // android.app.Dialog
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final void setContentView(int i) {
        g().j(i);
    }

    @Override // android.app.Dialog
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public final void setContentView(android.view.View view) {
        g().k(view);
    }

    @Override // android.app.Dialog
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public final void setContentView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        g().l(view, layoutParams);
    }

    @Override // a.ow, android.app.Dialog
    public final void onCreate(android.os.Bundle bundle) {
        int i;
        android.widget.ListAdapter listAdapter;
        android.view.View findViewById;
        j(bundle);
        a.sk skVar = this.g;
        skVar.b.setContentView(skVar.r);
        android.view.Window window = skVar.c;
        android.view.View findViewById2 = window.findViewById(2131362952);
        android.view.View findViewById3 = findViewById2.findViewById(2131363298);
        android.view.View findViewById4 = findViewById2.findViewById(2131362259);
        android.view.View findViewById5 = findViewById2.findViewById(2131362123);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) findViewById2.findViewById(2131362327);
        window.setFlags(131072, 131072);
        viewGroup.setVisibility(8);
        android.view.View findViewById6 = viewGroup.findViewById(2131363298);
        android.view.View findViewById7 = viewGroup.findViewById(2131362259);
        android.view.View findViewById8 = viewGroup.findViewById(2131362123);
        android.view.ViewGroup b = a.sk.b(findViewById6, findViewById3);
        android.view.ViewGroup b2 = a.sk.b(findViewById7, findViewById4);
        android.view.ViewGroup b3 = a.sk.b(findViewById8, findViewById5);
        androidx.core.widget.NestedScrollView nestedScrollView = (androidx.core.widget.NestedScrollView) window.findViewById(2131363039);
        skVar.i = nestedScrollView;
        nestedScrollView.setFocusable(false);
        skVar.i.setNestedScrollingEnabled(false);
        android.widget.TextView textView = (android.widget.TextView) b2.findViewById(android.R.id.message);
        skVar.n = textView;
        if (textView != null) {
            textView.setVisibility(8);
            skVar.i.removeView(skVar.n);
            if (skVar.e != null) {
                android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) skVar.i.getParent();
                int indexOfChild = viewGroup2.indexOfChild(skVar.i);
                viewGroup2.removeViewAt(indexOfChild);
                viewGroup2.addView(skVar.e, indexOfChild, new android.view.ViewGroup.LayoutParams(-1, -1));
            } else {
                b2.setVisibility(8);
            }
        }
        android.widget.Button button = (android.widget.Button) b3.findViewById(android.R.id.button1);
        skVar.f = button;
        a.mk mkVar = skVar.x;
        button.setOnClickListener(mkVar);
        if (android.text.TextUtils.isEmpty(null)) {
            skVar.f.setVisibility(8);
            i = 0;
        } else {
            skVar.f.setText((java.lang.CharSequence) null);
            skVar.f.setVisibility(0);
            i = 1;
        }
        android.widget.Button button2 = (android.widget.Button) b3.findViewById(android.R.id.button2);
        skVar.g = button2;
        button2.setOnClickListener(mkVar);
        if (android.text.TextUtils.isEmpty(null)) {
            skVar.g.setVisibility(8);
        } else {
            skVar.g.setText((java.lang.CharSequence) null);
            skVar.g.setVisibility(0);
            i |= 2;
        }
        android.widget.Button button3 = (android.widget.Button) b3.findViewById(android.R.id.button3);
        skVar.h = button3;
        button3.setOnClickListener(mkVar);
        if (android.text.TextUtils.isEmpty(null)) {
            skVar.h.setVisibility(8);
        } else {
            skVar.h.setText((java.lang.CharSequence) null);
            skVar.h.setVisibility(0);
            i |= 4;
        }
        android.util.TypedValue typedValue = new android.util.TypedValue();
        skVar.f527a.getTheme().resolveAttribute(2130968615, typedValue, true);
        if (typedValue.data != 0) {
            if (i == 1) {
                android.widget.Button button4 = skVar.f;
                android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) button4.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button4.setLayoutParams(layoutParams);
            } else if (i == 2) {
                android.widget.Button button5 = skVar.g;
                android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) button5.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button5.setLayoutParams(layoutParams2);
            } else if (i == 4) {
                android.widget.Button button6 = skVar.h;
                android.widget.LinearLayout.LayoutParams layoutParams3 = (android.widget.LinearLayout.LayoutParams) button6.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button6.setLayoutParams(layoutParams3);
            }
        }
        if (i == 0) {
            b3.setVisibility(8);
        }
        if (skVar.o != null) {
            b.addView(skVar.o, 0, new android.view.ViewGroup.LayoutParams(-1, -2));
            window.findViewById(2131363292).setVisibility(8);
        } else {
            skVar.l = (android.widget.ImageView) window.findViewById(android.R.id.icon);
            if ((!android.text.TextUtils.isEmpty(skVar.d)) && skVar.v) {
                android.widget.TextView textView2 = (android.widget.TextView) window.findViewById(2131361957);
                skVar.m = textView2;
                textView2.setText(skVar.d);
                int i2 = skVar.j;
                if (i2 != 0) {
                    skVar.l.setImageResource(i2);
                } else {
                    android.graphics.drawable.Drawable drawable = skVar.k;
                    if (drawable != null) {
                        skVar.l.setImageDrawable(drawable);
                    } else {
                        skVar.m.setPadding(skVar.l.getPaddingLeft(), skVar.l.getPaddingTop(), skVar.l.getPaddingRight(), skVar.l.getPaddingBottom());
                        skVar.l.setVisibility(8);
                    }
                }
            } else {
                window.findViewById(2131363292).setVisibility(8);
                skVar.l.setVisibility(8);
                b.setVisibility(8);
            }
        }
        boolean z = viewGroup.getVisibility() != 8;
        int i3 = (b == null || b.getVisibility() == 8) ? 0 : 1;
        boolean z2 = b3.getVisibility() != 8;
        if (!z2 && (findViewById = b2.findViewById(2131363259)) != null) {
            findViewById.setVisibility(0);
        }
        if (i3 != 0) {
            androidx.core.widget.NestedScrollView nestedScrollView2 = skVar.i;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            android.view.View findViewById9 = skVar.e != null ? b.findViewById(2131363291) : null;
            if (findViewById9 != null) {
                findViewById9.setVisibility(0);
            }
        } else {
            android.view.View findViewById10 = b2.findViewById(2131363260);
            if (findViewById10 != null) {
                findViewById10.setVisibility(0);
            }
        }
        androidx.appcompat.app.AlertController.RecycleListView alertController$RecycleListView = skVar.e;
        if (alertController$RecycleListView instanceof androidx.appcompat.app.AlertController.RecycleListView) {
            alertController$RecycleListView.getClass();
            if (!z2 || i3 == 0) {
                alertController$RecycleListView.setPadding(alertController$RecycleListView.getPaddingLeft(), i3 != 0 ? alertController$RecycleListView.getPaddingTop() : alertController$RecycleListView.mPaddingTopNoTitle, alertController$RecycleListView.getPaddingRight(), z2 ? alertController$RecycleListView.getPaddingBottom() : alertController$RecycleListView.mPaddingBottomNoButtons);
            }
        }
        if (!z) {
            android.view.View view = skVar.e;
            if (view == null) {
                view = skVar.i;
            }
            if (view != null) {
                int i4 = i3 | (z2 ? 2 : 0);
                android.view.View findViewById11 = window.findViewById(2131363038);
                android.view.View findViewById12 = window.findViewById(2131363037);
                java.util.WeakHashMap weakHashMap = a.jq1.f264a;
                a.yp1.d(view, i4, 3);
                if (findViewById11 != null) {
                    b2.removeView(findViewById11);
                }
                if (findViewById12 != null) {
                    b2.removeView(findViewById12);
                }
            }
        }
        androidx.appcompat.app.AlertController.RecycleListView alertController$RecycleListView2 = skVar.e;
        if (alertController$RecycleListView2 == null || (listAdapter = skVar.p) == null) {
            return;
        }
        alertController$RecycleListView2.setAdapter(listAdapter);
        int i5 = skVar.q;
        if (i5 > -1) {
            alertController$RecycleListView2.setItemChecked(i5, true);
            alertController$RecycleListView2.setSelection(i5);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, android.view.KeyEvent keyEvent) {
        androidx.core.widget.NestedScrollView nestedScrollView = this.g.i;
        if (nestedScrollView == null || !nestedScrollView.executeKeyEvent(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, android.view.KeyEvent keyEvent) {
        androidx.core.widget.NestedScrollView nestedScrollView = this.g.i;
        if (nestedScrollView == null || !nestedScrollView.executeKeyEvent(keyEvent)) {
            return super.onKeyUp(i, keyEvent);
        }
        return true;
    }

    @Override // a.ql
    public final /* bridge */ /* synthetic */ void onSupportActionModeFinished(a.o2 o2Var) {
    }

    @Override // a.ql
    public final /* bridge */ /* synthetic */ void onSupportActionModeStarted(a.o2 o2Var) {
    }

    @Override // a.ql
    public final /* bridge */ /* synthetic */ a.o2 onWindowStartingSupportActionMode(a.n2 n2Var) {
        return null;
    }

    @Override // android.app.Dialog
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public final void setTitle(int i) {
        super.setTitle(i);
        g().n(getContext().getString(i));
    }

    public final void q(java.lang.CharSequence charSequence) {
        super.setTitle(charSequence);
        g().n(charSequence);
    }

    public final boolean r(android.view.KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog
    public final void setTitle(java.lang.CharSequence charSequence) {
        q(charSequence);
        a.sk skVar = this.g;
        skVar.d = charSequence;
        android.widget.TextView textView = skVar.m;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
