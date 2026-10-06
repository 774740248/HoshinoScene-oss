package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public class m60 extends a.gk0 implements android.content.DialogInterface.OnCancelListener, android.content.DialogInterface.OnDismissListener {
    public android.os.Handler W;
    public boolean f0;
    public android.app.Dialog h0;
    public boolean i0;
    public boolean j0;
    public boolean k0;
    public final a.lk0 X = new a.lk0(2, this);
    public final a.j60 Y = new a.j60(this);
    public final a.k60 Z = new a.k60(this);
    public int a0 = 0;
    public int b0 = 0;
    public boolean c0 = true;
    public boolean d0 = true;
    public int e0 = -1;
    public final a.w1 g0 = new a.w1(0, this);
    public boolean l0 = false;

    @Override // a.gk0
    public void A() {
        this.F = true;
        android.app.Dialog dialog = this.h0;
        if (dialog != null) {
            this.i0 = false;
            dialog.show();
            android.view.View decorView = this.h0.getWindow().getDecorView();
            a.wv.w(decorView, "<this>");
            decorView.setTag(2131363356, this);
            decorView.setTag(2131363359, this);
            decorView.setTag(2131363358, this);
        }
    }

    @Override // a.gk0
    public void B() {
        this.F = true;
        android.app.Dialog dialog = this.h0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // a.gk0
    public final void D(android.os.Bundle bundle) {
        android.os.Bundle bundle2;
        this.F = true;
        if (this.h0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.h0.onRestoreInstanceState(bundle2);
    }

    @Override // a.gk0
    public final void E(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        android.os.Bundle bundle2;
        super.E(layoutInflater, viewGroup, bundle);
        if (this.H != null || this.h0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.h0.onRestoreInstanceState(bundle2);
    }

    public final void S(boolean z, boolean z2) {
        if (this.j0) {
            return;
        }
        this.j0 = true;
        this.k0 = false;
        android.app.Dialog dialog = this.h0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.h0.dismiss();
            if (!z2) {
                if (android.os.Looper.myLooper() == this.W.getLooper()) {
                    onDismiss(this.h0);
                } else {
                    this.W.post(this.X);
                }
            }
        }
        this.i0 = true;
        if (this.e0 >= 0) {
            a.am0 h = h();
            int i = this.e0;
            if (i < 0) {
                throw new java.lang.IllegalArgumentException(a.ii1.d("Bad id: ", i));
            }
            h.s(new a.zl0(h, i, 1), false);
            this.e0 = -1;
            return;
        }
        a.cq cqVar = new a.cq(h());
        a.am0 am0Var = this.u;
        if (am0Var != null && am0Var != cqVar.p) {
            throw new java.lang.IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + toString() + " is already attached to a FragmentManager.");
        }
        cqVar.b(new a.en0(3, this));
        if (z) {
            cqVar.d(true);
        } else {
            cqVar.d(false);
        }
    }

    public android.app.Dialog T() {
        if (android.util.Log.isLoggable("FragmentManager", 3)) {
            android.util.Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new android.app.Dialog(L(), this.b0);
    }

    public final void U(boolean z) {
        this.c0 = z;
        android.app.Dialog dialog = this.h0;
        if (dialog != null) {
            dialog.setCancelable(z);
        }
    }

    public final void V(a.am0 am0Var, java.lang.String str) {
        this.j0 = false;
        this.k0 = true;
        am0Var.getClass();
        a.cq cqVar = new a.cq(am0Var);
        cqVar.e(0, this, str, 1);
        cqVar.d(false);
    }

    @Override // a.gk0
    public final a.wv a() {
        return new a.l60(this, new a.dk0(this));
    }

    public void onCancel(android.content.DialogInterface dialogInterface) {
    }

    public void onDismiss(android.content.DialogInterface dialogInterface) {
        if (this.i0) {
            return;
        }
        if (android.util.Log.isLoggable("FragmentManager", 3)) {
            android.util.Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        S(true, true);
    }

    @Override // a.gk0
    public final void q(android.content.Context context) {
        super.q(context);
        this.S.d(this.g0);
        if (this.k0) {
            return;
        }
        this.j0 = false;
    }

    @Override // a.gk0
    public void r(android.os.Bundle bundle) {
        super.r(bundle);
        this.W = new android.os.Handler();
        this.d0 = this.z == 0;
        if (bundle != null) {
            this.a0 = bundle.getInt("android:style", 0);
            this.b0 = bundle.getInt("android:theme", 0);
            this.c0 = bundle.getBoolean("android:cancelable", true);
            this.d0 = bundle.getBoolean("android:showsDialog", this.d0);
            this.e0 = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // a.gk0
    public final void u() {
        this.F = true;
        android.app.Dialog dialog = this.h0;
        if (dialog != null) {
            this.i0 = true;
            dialog.setOnDismissListener(null);
            this.h0.dismiss();
            if (!this.j0) {
                onDismiss(this.h0);
            }
            this.h0 = null;
            this.l0 = false;
        }
    }

    @Override // a.gk0
    public final void v() {
        this.F = true;
        if (!this.k0 && !this.j0) {
            this.j0 = true;
        }
        a.w1 w1Var = this.g0;
        androidx.lifecycle.b bVar = this.S;
        bVar.getClass();
        androidx.lifecycle.b.a("removeObserver");
        a.bx0 bx0Var = (a.bx0) bVar.b.b(w1Var);
        if (bx0Var == null) {
            return;
        }
        bx0Var.d();
        bx0Var.b(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0046 A[Catch: all -> 0x004e, TryCatch #0 {all -> 0x004e, blocks: (B:10:0x001a, B:12:0x0026, B:18:0x003e, B:20:0x0046, B:21:0x0050, B:23:0x0030, B:25:0x0036, B:26:0x003b, B:27:0x0068), top: B:9:0x001a }] */
    @Override // a.gk0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.LayoutInflater w(android.os.Bundle r8) {
        /*
            r7 = this;
            android.view.LayoutInflater r8 = super.w(r8)
            boolean r0 = r7.d0
            r1 = 2
            java.lang.String r2 = "FragmentManager"
            if (r0 == 0) goto L9a
            boolean r3 = r7.f0
            if (r3 == 0) goto L11
            goto L9a
        L11:
            if (r0 != 0) goto L14
            goto L71
        L14:
            boolean r0 = r7.l0
            if (r0 != 0) goto L71
            r0 = 0
            r3 = 1
            r7.f0 = r3     // Catch: java.lang.Throwable -> L4e
            android.app.Dialog r4 = r7.T()     // Catch: java.lang.Throwable -> L4e
            r7.h0 = r4     // Catch: java.lang.Throwable -> L4e
            boolean r5 = r7.d0     // Catch: java.lang.Throwable -> L4e
            if (r5 == 0) goto L68
            int r5 = r7.a0     // Catch: java.lang.Throwable -> L4e
            if (r5 == r3) goto L3b
            if (r5 == r1) goto L3b
            r6 = 3
            if (r5 == r6) goto L30
            goto L3e
        L30:
            android.view.Window r5 = r4.getWindow()     // Catch: java.lang.Throwable -> L4e
            if (r5 == 0) goto L3b
            r6 = 24
            r5.addFlags(r6)     // Catch: java.lang.Throwable -> L4e
        L3b:
            r4.requestWindowFeature(r3)     // Catch: java.lang.Throwable -> L4e
        L3e:
            android.content.Context r4 = r7.f()     // Catch: java.lang.Throwable -> L4e
            boolean r5 = r4 instanceof android.app.Activity     // Catch: java.lang.Throwable -> L4e
            if (r5 == 0) goto L50
            android.app.Dialog r5 = r7.h0     // Catch: java.lang.Throwable -> L4e
            android.app.Activity r4 = (android.app.Activity) r4     // Catch: java.lang.Throwable -> L4e
            r5.setOwnerActivity(r4)     // Catch: java.lang.Throwable -> L4e
            goto L50
        L4e:
            r8 = move-exception
            goto L6e
        L50:
            android.app.Dialog r4 = r7.h0     // Catch: java.lang.Throwable -> L4e
            boolean r5 = r7.c0     // Catch: java.lang.Throwable -> L4e
            r4.setCancelable(r5)     // Catch: java.lang.Throwable -> L4e
            android.app.Dialog r4 = r7.h0     // Catch: java.lang.Throwable -> L4e
            a.j60 r5 = r7.Y     // Catch: java.lang.Throwable -> L4e
            r4.setOnCancelListener(r5)     // Catch: java.lang.Throwable -> L4e
            android.app.Dialog r4 = r7.h0     // Catch: java.lang.Throwable -> L4e
            a.k60 r5 = r7.Z     // Catch: java.lang.Throwable -> L4e
            r4.setOnDismissListener(r5)     // Catch: java.lang.Throwable -> L4e
            r7.l0 = r3     // Catch: java.lang.Throwable -> L4e
            goto L6b
        L68:
            r3 = 0
            r7.h0 = r3     // Catch: java.lang.Throwable -> L4e
        L6b:
            r7.f0 = r0
            goto L71
        L6e:
            r7.f0 = r0
            throw r8
        L71:
            boolean r0 = android.util.Log.isLoggable(r2, r1)
            if (r0 == 0) goto L8d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "get layout inflater for DialogFragment "
            r0.<init>(r1)
            r0.append(r7)
            java.lang.String r1 = " from dialog context"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r2, r0)
        L8d:
            android.app.Dialog r0 = r7.h0
            if (r0 == 0) goto L99
            android.content.Context r0 = r0.getContext()
            android.view.LayoutInflater r8 = r8.cloneInContext(r0)
        L99:
            return r8
        L9a:
            boolean r0 = android.util.Log.isLoggable(r2, r1)
            if (r0 == 0) goto Ld5
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "getting layout inflater for DialogFragment "
            r0.<init>(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            boolean r1 = r7.d0
            if (r1 != 0) goto Lc4
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "mShowsDialog = false: "
            r1.<init>(r3)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            android.util.Log.d(r2, r0)
            goto Ld5
        Lc4:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "mCreatingDialog = true: "
            r1.<init>(r3)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            android.util.Log.d(r2, r0)
        Ld5:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: a.m60.w(android.os.Bundle):android.view.LayoutInflater");
    }

    @Override // a.gk0
    public void z(android.os.Bundle bundle) {
        android.app.Dialog dialog = this.h0;
        if (dialog != null) {
            android.os.Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i = this.a0;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.b0;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        boolean z = this.c0;
        if (!z) {
            bundle.putBoolean("android:cancelable", z);
        }
        boolean z2 = this.d0;
        if (!z2) {
            bundle.putBoolean("android:showsDialog", z2);
        }
        int i3 = this.e0;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }
}
