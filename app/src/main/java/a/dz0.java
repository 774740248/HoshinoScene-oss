package a;

import android.app.Dialog;
/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class dz0<S> extends a.m60 {
    public android.widget.TextView A0;
    public com.google.android.material.internal.CheckableImageButton B0;
    public a.gz0 C0;
    public android.widget.Button D0;
    public boolean E0;
    public java.lang.CharSequence F0;
    public java.lang.CharSequence G0;
    public final java.util.LinkedHashSet m0;
    public final java.util.LinkedHashSet n0;
    public int o0;
    public a.t51 p0;
    public a.ps q0;
    public a.wy0 r0;
    public int s0;
    public java.lang.CharSequence t0;
    public boolean u0;
    public int v0;
    public int w0;
    public java.lang.CharSequence x0;
    public int y0;
    public java.lang.CharSequence z0;

    public dz0() {
        new java.util.LinkedHashSet();
        new java.util.LinkedHashSet();
        this.m0 = new java.util.LinkedHashSet();
        this.n0 = new java.util.LinkedHashSet();
    }

    public static int X(android.content.Context context) {
        android.content.res.Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(2131165795);
        java.util.Calendar c = a.so1.c();
        c.set(5, 1);
        java.util.Calendar b = a.so1.b(c);
        b.get(2);
        b.get(1);
        int maximum = b.getMaximum(7);
        b.getActualMaximum(5);
        b.getTimeInMillis();
        int dimensionPixelSize = resources.getDimensionPixelSize(2131165801) * maximum;
        return ((maximum - 1) * resources.getDimensionPixelOffset(2131165815)) + dimensionPixelSize + (dimensionPixelOffset * 2);
    }

    public static boolean Y(android.content.Context context, int i) {
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(a.wv.q1(2130969294, context, a.wy0.class.getCanonicalName()).data, new int[]{i});
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v15, types: [a.z21, a.ts0, java.lang.Object] */
    @Override // a.m60, a.gk0
    public final void A() {
        a.t51 t51Var;
        a.fu1 fu1Var;
        a.fu1 fu1Var2;
        android.view.WindowInsetsController insetsController;
        android.view.WindowInsetsController insetsController2;
        super.A();
        android.app.Dialog dialog = this.h0;
        if (dialog == null) {
            throw new java.lang.IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
        }
        android.view.Window window = dialog.getWindow();
        if (this.u0) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.C0);
            if (!this.E0) {
                android.view.View findViewById = M().findViewById(2131362533);
                java.lang.Integer valueOf = findViewById.getBackground() instanceof android.graphics.drawable.ColorDrawable ? java.lang.Integer.valueOf(((android.graphics.drawable.ColorDrawable) findViewById.getBackground()).getColor()) : null;
                int i = android.os.Build.VERSION.SDK_INT;
                boolean z = false;
                boolean z2 = valueOf == null || valueOf.intValue() == 0;
                int Z = a.wv.Z(window.getContext(), android.R.attr.colorBackground, -16777216);
                if (z2) {
                    valueOf = java.lang.Integer.valueOf(Z);
                }
                java.lang.Integer valueOf2 = java.lang.Integer.valueOf(Z);
                if (i >= 30) {
                    a.bt1.a(window, false);
                } else {
                    a.at1.a(window, false);
                }
                window.getContext();
                int d = i < 27 ? a.sv.d(a.wv.Z(window.getContext(), android.R.attr.navigationBarColor, -16777216), 128) : 0;
                window.setStatusBarColor(0);
                window.setNavigationBarColor(d);
                boolean z3 = a.wv.G0(0) || a.wv.G0(valueOf.intValue());
                android.view.View decorView = window.getDecorView();
                if (android.os.Build.VERSION.SDK_INT >= 30) {
                    insetsController2 = window.getInsetsController();
                    a.iu1 iu1Var = new a.iu1(insetsController2);
                    iu1Var.f = window;
                    fu1Var = (fu1) iu1Var;
                } else {
                    fu1Var = new a.hu1(window, decorView);
                }
                fu1Var.C(z3);
                boolean G0 = a.wv.G0(valueOf2.intValue());
                if (a.wv.G0(d) || (d == 0 && G0)) {
                    z = true;
                }
                android.view.View decorView2 = window.getDecorView();
                if (android.os.Build.VERSION.SDK_INT >= 30) {
                    insetsController = window.getInsetsController();
                    a.iu1 iu1Var2 = new a.iu1(insetsController);
                    iu1Var2.f = window;
                    fu1Var2 = (fu1) iu1Var2;
                } else {
                    fu1Var2 = new a.hu1(window, decorView2);
                }
                fu1Var2.B(z);
                int paddingTop = findViewById.getPaddingTop();
                int i2 = findViewById.getLayoutParams().height;
                ts0 obj = new ts0();
                /* TODO: jadx type unresolved, defaulted to Object */
                obj.f = this;
                obj.c = i2;
                obj.e = findViewById;
                obj.d = paddingTop;
                java.util.WeakHashMap weakHashMap = a.jq1.f264a;
                a.xp1.u(findViewById, obj);
                this.E0 = true;
            }
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = j().getDimensionPixelOffset(2131165803);
            android.graphics.Rect rect = new android.graphics.Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new android.graphics.drawable.InsetDrawable((android.graphics.drawable.Drawable) this.C0, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            android.view.View decorView3 = window.getDecorView();
            android.app.Dialog dialog2 = this.h0;
            if (dialog2 == null) {
                throw new java.lang.IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
            }
            decorView3.setOnTouchListener(new a.ls0(dialog2, rect));
        }
        L();
        int i3 = this.o0;
        if (i3 == 0) {
            W();
            throw null;
        }
        W();
        a.ps psVar = this.q0;
        a.wy0 wy0Var = new a.wy0();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i3);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", psVar);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", psVar.f);
        wy0Var.P(bundle);
        this.r0 = wy0Var;
        boolean isChecked = this.B0.isChecked();
        if (isChecked) {
            W();
            a.ps psVar2 = this.q0;
            t51Var = new a.hz0();
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putInt("THEME_RES_ID_KEY", i3);
            bundle2.putParcelable("DATE_SELECTOR_KEY", null);
            bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", psVar2);
            t51Var.P(bundle2);
        } else {
            t51Var = this.r0;
        }
        this.p0 = t51Var;
        this.A0.setText((isChecked && j().getConfiguration().orientation == 2) ? this.G0 : this.F0);
        W();
        f();
        throw null;
    }

    @Override // a.m60, a.gk0
    public final void B() {
        this.p0.W.clear();
        super.B();
    }

    @Override // a.m60
    public final android.app.Dialog T() {
        android.content.Context L = L();
        L();
        int i = this.o0;
        if (i == 0) {
            W();
            throw null;
        }
        android.app.Dialog dialog = new android.app.Dialog(L, i);
        android.content.Context context = dialog.getContext();
        this.u0 = Y(context, android.R.attr.windowFullscreen);
        int i2 = a.wv.q1(2130968838, context, a.dz0.class.getCanonicalName()).data;
        a.gz0 gz0Var = new a.gz0(context, null, 2130969294, 2132018225);
        this.C0 = gz0Var;
        gz0Var.j(context);
        this.C0.l(android.content.res.ColorStateList.valueOf(i2));
        a.gz0 gz0Var2 = this.C0;
        android.view.View decorView = dialog.getWindow().getDecorView();
        java.util.WeakHashMap weakHashMap = a.jq1.f264a;
        gz0Var2.k(a.xp1.i(decorView));
        return dialog;
    }

    public final void W() {
        a.ai1.s(this.i.getParcelable("DATE_SELECTOR_KEY"));
    }

    @Override // a.m60, android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        java.util.Iterator it = this.m0.iterator();
        while (it.hasNext()) {
            ((android.content.DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
    }

    @Override // a.m60, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(android.content.DialogInterface dialogInterface) {
        java.util.Iterator it = this.n0.iterator();
        while (it.hasNext()) {
            ((android.content.DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) this.H;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // a.m60, a.gk0
    public final void r(android.os.Bundle bundle) {
        super.r(bundle);
        if (bundle == null) {
            bundle = this.i;
        }
        this.o0 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        a.ai1.s(bundle.getParcelable("DATE_SELECTOR_KEY"));
        this.q0 = (a.ps) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        a.ai1.s(bundle.getParcelable("DAY_VIEW_DECORATOR_KEY"));
        this.s0 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.t0 = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.v0 = bundle.getInt("INPUT_MODE_KEY");
        this.w0 = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.x0 = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.y0 = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.z0 = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        java.lang.CharSequence charSequence = this.t0;
        if (charSequence == null) {
            charSequence = L().getResources().getText(this.s0);
        }
        this.F0 = charSequence;
        if (charSequence != null) {
            java.lang.CharSequence[] split = android.text.TextUtils.split(java.lang.String.valueOf(charSequence), "\n");
            if (split.length > 1) {
                charSequence = split[0];
            }
        } else {
            charSequence = null;
        }
        this.G0 = charSequence;
    }

    @Override // a.gk0
    public final android.view.View s(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup) {
        android.view.View inflate = layoutInflater.inflate(this.u0 ? 2131558700 : 2131558699, viewGroup);
        android.content.Context context = inflate.getContext();
        if (this.u0) {
            inflate.findViewById(2131362856).setLayoutParams(new android.widget.LinearLayout.LayoutParams(X(context), -2));
        } else {
            inflate.findViewById(2131362857).setLayoutParams(new android.widget.LinearLayout.LayoutParams(X(context), -1));
        }
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(2131362868);
        java.util.WeakHashMap weakHashMap = a.jq1.f264a;
        a.up1.f(textView, 1);
        this.B0 = (com.google.android.material.internal.CheckableImageButton) inflate.findViewById(2131362870);
        this.A0 = (android.widget.TextView) inflate.findViewById(2131362874);
        this.B0.setTag("TOGGLE_BUTTON_TAG");
        com.google.android.material.internal.CheckableImageButton checkableImageButton = this.B0;
        android.graphics.drawable.StateListDrawable stateListDrawable = new android.graphics.drawable.StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_checked}, a.b20.Y(context, 2131231136));
        stateListDrawable.addState(new int[0], a.b20.Y(context, 2131231138));
        checkableImageButton.setImageDrawable(stateListDrawable);
        this.B0.setChecked(this.v0 != 0);
        a.jq1.o(this.B0, null);
        com.google.android.material.internal.CheckableImageButton checkableImageButton2 = this.B0;
        this.B0.setContentDescription(checkableImageButton2.isChecked() ? checkableImageButton2.getContext().getString(2131953057) : checkableImageButton2.getContext().getString(2131953059));
        this.B0.setOnClickListener(new a.cz0(this));
        this.D0 = (android.widget.Button) inflate.findViewById(2131362253);
        W();
        throw null;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, a.ns] */
    @Override // a.m60, a.gk0
    public final void z(android.os.Bundle bundle) {
        super.z(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.o0);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        a.ps psVar = this.q0;
        a.ns obj = new a.ns();
        int i = a.ns.b;
        int i2 = a.ns.b;
        long j = psVar.c.h;
        long j2 = psVar.d.h;
        obj.f390a = java.lang.Long.valueOf(psVar.f.h);
        int i3 = psVar.g;
        a.wy0 wy0Var = this.r0;
        a.n11 n11Var = wy0Var == null ? null : wy0Var.Z;
        if (n11Var != null) {
            obj.f390a = java.lang.Long.valueOf(n11Var.h);
        }
        android.os.Bundle bundle2 = new android.os.Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", psVar.e);
        a.n11 s = a.n11.s(j);
        a.n11 s2 = a.n11.s(j2);
        a.os osVar = (a.os) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        java.lang.Long l = obj.f390a;
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new a.ps(s, s2, osVar, l == null ? null : a.n11.s(l.longValue()), i3));
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.s0);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.t0);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.w0);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.x0);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.y0);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.z0);
    }
}
