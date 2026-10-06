package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public class vu0 implements a.wz0, a.n01, a.nz0, a.tn, a.z21, a.rx, a.iq0, a.ks0, a.z0, a.s71 {
    public final /* synthetic */ int c;
    public final java.lang.Object d;

    public /* synthetic */ vu0(int i, java.lang.Object obj) {
        this.c = i;
        this.d = obj;
    }

    public static java.lang.Object z(java.lang.Object[] objArr, int i, a.fa0 fa0Var) {
        int i2;
        boolean z;
        int i3 = (i & 1) == 0 ? 400 : 700;
        boolean z2 = (i & 2) != 0;
        java.lang.Object obj = null;
        int i4 = Integer.MAX_VALUE;
        for (java.lang.Object obj2 : objArr) {
            int i5 = fa0Var.c;
            switch (i5) {
                case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                    i2 = ((a.cj0) obj2).c;
                    break;
                default:
                    i2 = ((a.aj0) obj2).b;
                    break;
            }
            int abs = java.lang.Math.abs(i2 - i3) * 2;
            switch (i5) {
                case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                    z = ((a.cj0) obj2).d;
                    break;
                default:
                    z = ((a.aj0) obj2).c;
                    break;
            }
            int i6 = abs + (z == z2 ? 0 : 1);
            if (obj == null || i4 > i6) {
                obj = obj2;
                i4 = i6;
            }
        }
        return obj;
    }

    public a.cj0 A(int i, a.cj0[] cj0VarArr) {
        return (a.cj0) z(cj0VarArr, i, new a.fa0(0));
    }

    public final boolean B(android.view.MotionEvent motionEvent) {
        switch (this.c) {
            case 13:
                return ((android.view.GestureDetector) this.d).onTouchEvent(motionEvent);
            default:
                return ((a.vu0) ((a.iq0) this.d)).B(motionEvent);
        }
    }

    public final long C() {
        return ((java.nio.ByteBuffer) this.d).getInt() & 4294967295L;
    }

    public final void D(int i) {
        java.lang.Object obj = this.d;
        ((java.nio.ByteBuffer) obj).position(((java.nio.ByteBuffer) obj).position() + i);
    }

    @Override // a.n01
    public final void a(a.pz0 pz0Var, boolean z) {
        if (pz0Var instanceof a.zi1) {
            pz0Var.k().c(false);
        }
        a.n01 n01Var = ((a.j2) this.d).g;
        if (n01Var != null) {
            n01Var.a(pz0Var, z);
        }
    }

    @Override // a.ks0
    public final void b() {
        switch (this.c) {
            case 17:
                ((android.view.inputmethod.InputContentInfo) this.d).requestPermission();
                return;
            default:
                ((a.ks0) this.d).b();
                return;
        }
    }

    @Override // a.rx
    public final android.content.ClipData c() {
        android.content.ClipData clip;
        clip = ((android.view.ContentInfo) this.d).getClip();
        return clip;
    }

    @Override // a.z0
    public final boolean d(android.view.View view) {
        ((androidx.drawerlayout.widget.DrawerLayout) this.d).getClass();
        if (!androidx.drawerlayout.widget.DrawerLayout.isDrawerOpen(view) || ((androidx.drawerlayout.widget.DrawerLayout) this.d).g(view) == 2) {
            return false;
        }
        ((androidx.drawerlayout.widget.DrawerLayout) this.d).b(view);
        return true;
    }

    @Override // a.ks0
    public final android.net.Uri e() {
        switch (this.c) {
            case 17:
                return ((android.view.inputmethod.InputContentInfo) this.d).getLinkUri();
            default:
                return ((a.ks0) this.d).e();
        }
    }

    @Override // a.rx
    public final int f() {
        int flags;
        flags = ((android.view.ContentInfo) this.d).getFlags();
        return flags;
    }

    @Override // a.nz0
    public final boolean g(a.pz0 pz0Var, android.view.MenuItem menuItem) {
        switch (this.c) {
            case 5:
                a.m2 m2Var = ((androidx.appcompat.widget.ActionMenuView) this.d).C;
                if (m2Var == null) {
                    return false;
                }
                androidx.appcompat.widget.Toolbar toolbar = ((a.sm1) m2Var).c;
                java.util.Iterator it = toolbar.I.b.iterator();
                if (it.hasNext()) {
                    a.ai1.t(it.next());
                    throw null;
                }
                a.wm1 wm1Var = toolbar.K;
                return wm1Var != null && ((a.ym1) wm1Var).c.b.onMenuItemSelected(0, menuItem);
            default:
                a.c61 c61Var = ((a.d61) this.d).c;
                if (c61Var != null) {
                    return c61Var.onMenuItemClick(menuItem);
                }
                return false;
        }
    }

    @Override // a.wz0
    public final void h(a.pz0 pz0Var, a.xz0 xz0Var) {
        ((a.kt) this.d).i.removeCallbacksAndMessages(null);
        int size = ((a.kt) this.d).k.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (pz0Var == ((a.jt) ((a.kt) this.d).k.get(i)).b) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        int i2 = i + 1;
        ((a.kt) this.d).i.postAtTime(new a.ht(this, i2 < ((a.kt) this.d).k.size() ? (a.jt) ((a.kt) this.d).k.get(i2) : null, xz0Var, pz0Var, 0), pz0Var, android.os.SystemClock.uptimeMillis() + 200);
    }

    @Override // a.s71
    public final void i() {
        android.util.Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // a.rx
    public final android.view.ContentInfo j() {
        return (android.view.ContentInfo) this.d;
    }

    @Override // a.s71
    public final void k(int i, java.lang.Object obj) {
        java.lang.String str;
        switch (i) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_READ_ERROR /* 4 */:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_WRITE /* 6 */:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i == 6 || i == 7 || i == 8) {
            android.util.Log.e("ProfileInstaller", str, (java.lang.Throwable) obj);
        } else {
            android.util.Log.d("ProfileInstaller", str);
        }
        ((androidx.profileinstaller.ProfileInstallReceiver) this.d).setResultCode(i);
    }

    public void l(int i) {
    }

    public void m(int i) {
    }

    @Override // a.rx
    public final int n() {
        int source;
        source = ((android.view.ContentInfo) this.d).getSource();
        return source;
    }

    @Override // a.n01
    public final boolean o(a.pz0 pz0Var) {
        java.lang.Object obj = this.d;
        if (pz0Var == ((a.j2) obj).e) {
            return false;
        }
        ((a.zi1) pz0Var).A.getClass();
        ((a.j2) obj).getClass();
        a.n01 n01Var = ((a.j2) this.d).g;
        if (n01Var != null) {
            return n01Var.o(pz0Var);
        }
        return false;
    }

    @Override // a.ks0
    public final android.content.ClipDescription p() {
        switch (this.c) {
            case 17:
                return ((android.view.inputmethod.InputContentInfo) this.d).getDescription();
            default:
                return ((a.ks0) this.d).p();
        }
    }

    @Override // a.wz0
    public final void q(a.pz0 pz0Var, android.view.MenuItem menuItem) {
        ((a.kt) this.d).i.removeCallbacksAndMessages(pz0Var);
    }

    @Override // a.nz0
    public final void r(a.pz0 pz0Var) {
        switch (this.c) {
            case 5:
                a.nz0 nz0Var = ((androidx.appcompat.widget.ActionMenuView) this.d).mMenuBuilderCallback;
                if (nz0Var != null) {
                    nz0Var.r(pz0Var);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // a.ks0
    public final java.lang.Object s() {
        return (android.view.inputmethod.InputContentInfo) this.d;
    }

    @Override // a.ks0
    public final android.net.Uri t() {
        switch (this.c) {
            case 17:
                return ((android.view.inputmethod.InputContentInfo) this.d).getContentUri();
            default:
                return ((a.ks0) this.d).t();
        }
    }

    public final java.lang.String toString() {
        switch (this.c) {
            case 12:
                return "ContentInfoCompat{" + ((android.view.ContentInfo) this.d) + "}";
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.z21
    public final a.du1 u(android.view.View view, a.du1 du1Var) {
        int i = 0;
        switch (this.c) {
            case 8:
                androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout = (androidx.coordinatorlayout.widget.CoordinatorLayout) this.d;
                if (!a.x21.a(coordinatorLayout.mLastInsets, du1Var)) {
                    coordinatorLayout.mLastInsets = du1Var;
                    boolean z = du1Var.d() > 0;
                    coordinatorLayout.mDrawStatusBarBackground = z;
                    coordinatorLayout.setWillNotDraw(!z && coordinatorLayout.getBackground() == null);
                    a.au1 au1Var = du1Var.f107a;
                    if (!au1Var.m()) {
                        int childCount = coordinatorLayout.getChildCount();
                        while (i < childCount) {
                            android.view.View childAt = coordinatorLayout.getChildAt(i);
                            java.util.WeakHashMap weakHashMap = a.jq1.f264a;
                            if (!a.rp1.b(childAt) || ((a.my) childAt.getLayoutParams()).f364a == null || !au1Var.m()) {
                                i++;
                            }
                        }
                    }
                    coordinatorLayout.requestLayout();
                }
                return du1Var;
            default:
                com.google.android.material.appbar.AppBarLayout appBarLayout = (com.google.android.material.appbar.AppBarLayout) this.d;
                appBarLayout.getClass();
                java.util.WeakHashMap weakHashMap2 = a.jq1.f264a;
                a.du1 du1Var2 = a.rp1.b(appBarLayout) ? du1Var : null;
                if (!a.x21.a(appBarLayout.lastInsets, du1Var2)) {
                    appBarLayout.lastInsets = du1Var2;
                    if (appBarLayout.statusBarForeground != null && appBarLayout.getTopInset() > 0) {
                        i = 1;
                    }
                    appBarLayout.setWillNotDraw((i ^ 1) != 0);
                    appBarLayout.requestLayout();
                }
                return du1Var;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.graphics.Typeface v(android.content.Context r10, a.zi0 r11, android.content.res.Resources r12, int r13) {
        /*
            r9 = this;
            a.fa0 r0 = new a.fa0
            r1 = 1
            r0.<init>(r1)
            a.aj0[] r2 = r11.f737a
            java.lang.Object r0 = z(r2, r13, r0)
            a.aj0 r0 = (a.aj0) r0
            if (r0 != 0) goto L12
            r10 = 0
            return r10
        L12:
            int r8 = r0.f
            java.lang.String r0 = r0.f13a
            a.vu0 r2 = a.do1.f102a
            r3 = r10
            r4 = r12
            r5 = r8
            r6 = r0
            r7 = r13
            android.graphics.Typeface r10 = r2.y(r3, r4, r5, r6, r7)
            if (r10 == 0) goto L2d
            r2 = 0
            java.lang.String r12 = a.do1.b(r12, r8, r0, r2, r13)
            a.ux0 r13 = a.do1.b
            r13.b(r12, r10)
        L2d:
            java.lang.String r12 = "Could not retrieve font from family."
            java.lang.String r13 = "TypefaceCompatBaseImpl"
            r2 = 0
            if (r10 != 0) goto L37
        L35:
            r12 = r2
            goto L59
        L37:
            java.lang.Class<android.graphics.Typeface> r0 = android.graphics.Typeface.class
            java.lang.String r4 = "native_instance"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r4)     // Catch: java.lang.IllegalAccessException -> L4d java.lang.NoSuchFieldException -> L4f
            r0.setAccessible(r1)     // Catch: java.lang.IllegalAccessException -> L4d java.lang.NoSuchFieldException -> L4f
            java.lang.Object r0 = r0.get(r10)     // Catch: java.lang.IllegalAccessException -> L4d java.lang.NoSuchFieldException -> L4f
            java.lang.Number r0 = (java.lang.Number) r0     // Catch: java.lang.IllegalAccessException -> L4d java.lang.NoSuchFieldException -> L4f
            long r12 = r0.longValue()     // Catch: java.lang.IllegalAccessException -> L4d java.lang.NoSuchFieldException -> L4f
            goto L59
        L4d:
            r0 = move-exception
            goto L51
        L4f:
            r0 = move-exception
            goto L55
        L51:
            android.util.Log.e(r13, r12, r0)
            goto L35
        L55:
            android.util.Log.e(r13, r12, r0)
            goto L35
        L59:
            int r0 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r0 == 0) goto L68
            java.lang.Object r0 = r9.d
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0
            java.lang.Long r12 = java.lang.Long.valueOf(r12)
            r0.put(r12, r11)
        L68:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: a.vu0.v(android.content.Context, a.zi0, android.content.res.Resources, int):android.graphics.Typeface");
    }

    public android.graphics.Typeface w(android.content.Context context, a.cj0[] cj0VarArr, int i) {
        java.lang.Throwable th;
        java.io.InputStream inputStream;
        java.io.InputStream inputStream2 = null;
        if (cj0VarArr.length < 1) {
            return null;
        }
        try {
            inputStream = context.getContentResolver().openInputStream(A(i, cj0VarArr).f73a);
            try {
                android.graphics.Typeface x = x(context, inputStream);
                a.wv.A(inputStream);
                return x;
            } catch (java.io.IOException unused) {
                a.wv.A(inputStream);
                return null;
            } catch (java.lang.Throwable th) {
                th = th;
                inputStream2 = inputStream;
                a.wv.A(inputStream2);
                throw th;
            }
        } catch (java.io.IOException unused2) {
            inputStream = null;
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
    }

    public android.graphics.Typeface x(android.content.Context context, java.io.InputStream inputStream) {
        java.io.File t0 = a.wv.t0(context);
        if (t0 == null) {
            return null;
        }
        try {
            if (a.wv.H(t0, inputStream)) {
                return android.graphics.Typeface.createFromFile(t0.getPath());
            }
            return null;
        } catch (java.lang.RuntimeException unused) {
            return null;
        } finally {
            t0.delete();
        }
    }

    public android.graphics.Typeface y(android.content.Context context, android.content.res.Resources resources, int i, java.lang.String str, int i2) {
        java.io.File t0 = a.wv.t0(context);
        if (t0 == null) {
            return null;
        }
        try {
            if (a.wv.G(t0, resources, i)) {
                return android.graphics.Typeface.createFromFile(t0.getPath());
            }
            return null;
        } catch (java.lang.RuntimeException unused) {
            return null;
        } finally {
            t0.delete();
        }
    }

    public vu0(a.b20 b20Var) {
        this.c = 9;
        this.d = b20Var;
    }

    public vu0() {
        this.c = 10;
        this.d = new java.util.concurrent.ConcurrentHashMap();
    }

    public vu0(android.widget.TextView textView) {
        this.c = 23;
        if (textView != null) {
            this.d = new a.ib0(textView);
            return;
        }
        throw new java.lang.NullPointerException("textView cannot be null");
    }

    public vu0(java.lang.Object obj) {
        this.c = 17;
        this.d = (android.view.inputmethod.InputContentInfo) obj;
    }

    public vu0(java.nio.ByteBuffer byteBuffer) {
        this.c = 22;
        this.d = byteBuffer;
        byteBuffer.order(java.nio.ByteOrder.BIG_ENDIAN);
    }

    public vu0(android.view.ContentInfo contentInfo) {
        this.c = 12;
        contentInfo.getClass();
        this.d = a.nx.f(contentInfo);
    }

    public vu0(android.content.Context context, a.bt0 bt0Var, int i) {
        this.c = i;
        if (i != 14) {
            this.d = new android.view.GestureDetector(context, bt0Var, null);
        } else {
            this.d = new a.vu0(context, bt0Var, 13);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public vu0(android.content.Context context, a.bt0 bt0Var) {
        this(context, bt0Var, 14);
        this.c = 14;
    }
}
