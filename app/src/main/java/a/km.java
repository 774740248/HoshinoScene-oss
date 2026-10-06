package a;

import android.view.View;
import android.app.Dialog;
import android.app.Activity;
/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class km extends a.xl implements a.nz0, android.view.LayoutInflater.Factory2 {
    public static final a.rh1 j0 = new a.rh1();
    public static final int[] k0 = {android.R.attr.windowBackground};
    public static final boolean l0 = !"robolectric".equals(android.os.Build.FINGERPRINT);
    public static final boolean m0 = true;
    public boolean B;
    public android.view.ViewGroup C;
    public android.widget.TextView D;
    public android.view.View E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public a.jm[] N;
    public a.jm O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public android.content.res.Configuration T;
    public int U;
    public int V;
    public int W;
    public boolean X;
    public a.fm Y;
    public a.fm Z;
    public boolean a0;
    public int b0;
    public boolean d0;
    public android.graphics.Rect e0;
    public android.graphics.Rect f0;
    public a.fo g0;
    public android.window.OnBackInvokedDispatcher h0;
    public android.window.OnBackInvokedCallback i0;
    public final java.lang.Object l;
    public final android.content.Context m;
    public android.view.Window n;
    public a.em o;
    public final a.ql p;
    public a.d1 q;
    public a.jj1 r;
    public java.lang.CharSequence s;
    public a.c20 t;
    public a.zl u;
    public a.zl v;
    public a.o2 w;
    public androidx.appcompat.widget.ActionBarContextView x;
    public android.widget.PopupWindow y;
    public a.yl z;
    public a.sr1 A = null;
    public final a.yl c0 = new a.yl(this, 0);

    public km(android.content.Context context, android.view.Window window, a.ql qlVar, java.lang.Object obj) {
        a.ml mlVar;
        this.U = -100;
        this.m = context;
        this.p = qlVar;
        this.l = obj;
        if (obj instanceof android.app.Dialog) {
            while (context != null) {
                if (!(context instanceof a.ml)) {
                    if (!(context instanceof android.content.ContextWrapper)) {
                        break;
                    } else {
                        context = ((android.content.ContextWrapper) context).getBaseContext();
                    }
                } else {
                    mlVar = (a.ml) context;
                    break;
                }
            }
            mlVar = null;
            if (mlVar != null) {
                this.U = ((a.km) mlVar.getDelegate()).U;
            }
        }
        if (this.U == -100) {
            a.rh1 rh1Var = j0;
            java.lang.Integer num = (java.lang.Integer) rh1Var.getOrDefault(this.l.getClass().getName(), null);
            if (num != null) {
                this.U = num.intValue();
                rh1Var.remove(this.l.getClass().getName());
            }
        }
        if (window != null) {
            q(window);
        }
        a.nm.d();
    }

    public static a.hx0 s(android.content.Context context) {
        a.hx0 hx0Var;
        a.hx0 hx0Var2;
        if (android.os.Build.VERSION.SDK_INT >= 33 || (hx0Var = a.xl.e) == null) {
            return null;
        }
        a.hx0 b = a.cm.b(context.getApplicationContext().getResources().getConfiguration());
        a.ix0 ix0Var = hx0Var.f221a;
        if (((a.jx0) ix0Var).f274a.isEmpty()) {
            hx0Var2 = a.hx0.b;
        } else {
            java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
            int i = 0;
            while (i < ((a.jx0) b.f221a).f274a.size() + ((a.jx0) ix0Var).f274a.size()) {
                java.util.Locale locale = i < ((a.jx0) ix0Var).f274a.size() ? ((a.jx0) ix0Var).f274a.get(i) : ((a.jx0) b.f221a).f274a.get(i - ((a.jx0) ix0Var).f274a.size());
                if (locale != null) {
                    linkedHashSet.add(locale);
                }
                i++;
            }
            hx0Var2 = new a.hx0(new a.jx0(a.gx0.a((java.util.Locale[]) linkedHashSet.toArray(new java.util.Locale[linkedHashSet.size()]))));
        }
        return ((a.jx0) hx0Var2.f221a).f274a.isEmpty() ? b : hx0Var2;
    }

    public static android.content.res.Configuration w(android.content.Context context, int i, a.hx0 hx0Var, android.content.res.Configuration configuration, boolean z) {
        int i2 = i != 1 ? i != 2 ? z ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        android.content.res.Configuration configuration2 = new android.content.res.Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i2 | (configuration2.uiMode & (-49));
        if (hx0Var != null) {
            a.cm.d(configuration2, hx0Var);
        }
        return configuration2;
    }

    public final void A() {
        if (this.n == null) {
            java.lang.Object obj = this.l;
            if (obj instanceof android.app.Activity) {
                q(((android.app.Activity) obj).getWindow());
            }
        }
        if (this.n == null) {
            throw new java.lang.IllegalStateException("We have not been given a Window");
        }
    }

    public final a.hm B(android.content.Context context) {
        if (this.Y == null) {
            if (a.nk.g == null) {
                android.content.Context applicationContext = context.getApplicationContext();
                a.nk.g = new a.nk(applicationContext, (android.location.LocationManager) applicationContext.getSystemService("location"));
            }
            this.Y = new a.fm(this, a.nk.g);
        }
        return this.Y;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0006, code lost:
    
        if (r2 <= r5) goto L6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, a.jm] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final a.jm C(int r5) {
        /*
            r4 = this;
            a.jm[] r0 = r4.N
            r1 = 0
            if (r0 == 0) goto L8
            int r2 = r0.length
            if (r2 > r5) goto L15
        L8:
            int r2 = r5 + 1
            a.jm[] r2 = new a.jm[r2]
            if (r0 == 0) goto L12
            int r3 = r0.length
            java.lang.System.arraycopy(r0, r1, r2, r1, r3)
        L12:
            r4.N = r2
            r0 = r2
        L15:
            r2 = r0[r5]
            if (r2 != 0) goto L24
            a.jm r2 = new a.jm
            r2.<init>()
            r2.f259a = r5
            r2.n = r1
            r0[r5] = r2
        L24:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: a.km.C(int):a.jm");
    }

    public final void D() {
        z();
        if (this.H && this.q == null) {
            java.lang.Object obj = this.l;
            if ((Activity) obj instanceof android.app.Activity) {
                this.q = new a.et1((android.app.Activity) obj, this.I);
            } else if ((Dialog) obj instanceof android.app.Dialog) {
                this.q = new a.et1((android.app.Dialog) obj);
            }
            a.d1 d1Var = this.q;
            if (d1Var != null) {
                d1Var.l(this.d0);
            }
        }
    }

    public final void E(int i) {
        this.b0 = (1 << i) | this.b0;
        if (this.a0) {
            return;
        }
        android.view.View decorView = this.n.getDecorView();
        java.util.WeakHashMap weakHashMap = a.jq1.f264a;
        a.rp1.m(decorView, this.c0);
        this.a0 = true;
    }

    public final int F(android.content.Context context, int i) {
        if (i == -100) {
            return -1;
        }
        if (i != -1) {
            if (i == 0) {
                if (((android.app.UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                    return -1;
                }
                return B(context).d();
            }
            if (i != 1 && i != 2) {
                if (i != 3) {
                    throw new java.lang.IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                }
                if (this.Z == null) {
                    this.Z = new a.fm(this, context);
                }
                return this.Z.d();
            }
        }
        return i;
    }

    public final boolean G() {
        boolean z = this.P;
        this.P = false;
        a.jm C = C(0);
        if (C.m) {
            if (!z) {
                v(C, true);
            }
            return true;
        }
        a.o2 o2Var = this.w;
        if (o2Var != null) {
            o2Var.a();
            return true;
        }
        D();
        a.d1 d1Var = this.q;
        return d1Var != null && d1Var.b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x0173, code lost:
    
        if (r3.h.getCount() > 0) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0153, code lost:
    
        if (r3 != null) goto L77;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void H(a.jm r18, android.view.KeyEvent r19) {
        /*
            Method dump skipped, instructions count: 472
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.km.H(a.jm, android.view.KeyEvent):void");
    }

    public final boolean I(a.jm jmVar, int i, android.view.KeyEvent keyEvent) {
        a.pz0 pz0Var;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((jmVar.k || J(jmVar, keyEvent)) && (pz0Var = jmVar.h) != null) {
            return pz0Var.performShortcut(i, keyEvent, 1);
        }
        return false;
    }

    public final boolean J(a.jm jmVar, android.view.KeyEvent keyEvent) {
        a.c20 c20Var;
        a.c20 c20Var2;
        android.content.res.Resources.Theme theme;
        a.c20 c20Var3;
        a.c20 c20Var4;
        if (this.S) {
            return false;
        }
        if (jmVar.k) {
            return true;
        }
        a.jm jmVar2 = this.O;
        if (jmVar2 != null && jmVar2 != jmVar) {
            v(jmVar2, false);
        }
        android.view.Window.Callback callback = this.n.getCallback();
        int i = jmVar.f259a;
        if (callback != null) {
            jmVar.g = callback.onCreatePanelView(i);
        }
        boolean z = i == 0 || i == 108;
        if (z && (c20Var4 = this.t) != null) {
            androidx.appcompat.widget.ActionBarOverlayLayout actionBarOverlayLayout = (androidx.appcompat.widget.ActionBarOverlayLayout) c20Var4;
            actionBarOverlayLayout.setMenuPrepared();
            ((a.bn1) actionBarOverlayLayout.mDecorToolbar).l = true;
        }
        if (jmVar.g == null && (!z || !(this.q instanceof a.an1))) {
            a.pz0 pz0Var = jmVar.h;
            if (pz0Var == null || jmVar.o) {
                if (pz0Var == null) {
                    android.content.Context context = this.m;
                    if ((i == 0 || i == 108) && this.t != null) {
                        android.util.TypedValue typedValue = new android.util.TypedValue();
                        android.content.res.Resources.Theme theme2 = context.getTheme();
                        theme2.resolveAttribute(2130968585, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            theme = context.getResources().newTheme();
                            theme.setTo(theme2);
                            theme.applyStyle(typedValue.resourceId, true);
                            theme.resolveAttribute(2130968586, typedValue, true);
                        } else {
                            theme2.resolveAttribute(2130968586, typedValue, true);
                            theme = null;
                        }
                        if (typedValue.resourceId != 0) {
                            if (theme == null) {
                                theme = context.getResources().newTheme();
                                theme.setTo(theme2);
                            }
                            theme.applyStyle(typedValue.resourceId, true);
                        }
                        if (theme != null) {
                            a.dy dyVar = new a.dy(context, 0);
                            dyVar.getTheme().setTo(theme);
                            context = dyVar;
                        }
                    }
                    a.pz0 pz0Var2 = new a.pz0(context);
                    pz0Var2.e = this;
                    a.pz0 pz0Var3 = jmVar.h;
                    if (pz0Var2 != pz0Var3) {
                        if (pz0Var3 != null) {
                            pz0Var3.r(jmVar.i);
                        }
                        jmVar.h = pz0Var2;
                        a.nw0 nw0Var = jmVar.i;
                        if (nw0Var != null) {
                            pz0Var2.b(nw0Var, pz0Var2.f455a);
                        }
                    }
                    if (jmVar.h == null) {
                        return false;
                    }
                }
                if (z && (c20Var2 = this.t) != null) {
                    if (this.u == null) {
                        this.u = new a.zl(this, 4);
                    }
                    ((androidx.appcompat.widget.ActionBarOverlayLayout) c20Var2).setMenu(jmVar.h, this.u);
                }
                jmVar.h.x();
                if (!callback.onCreatePanelMenu(i, jmVar.h)) {
                    a.pz0 pz0Var4 = jmVar.h;
                    if (pz0Var4 != null) {
                        if (pz0Var4 != null) {
                            pz0Var4.r(jmVar.i);
                        }
                        jmVar.h = null;
                    }
                    if (z && (c20Var = this.t) != null) {
                        ((androidx.appcompat.widget.ActionBarOverlayLayout) c20Var).setMenu(null, this.u);
                    }
                    return false;
                }
                jmVar.o = false;
            }
            jmVar.h.x();
            android.os.Bundle bundle = jmVar.p;
            if (bundle != null) {
                jmVar.h.s(bundle);
                jmVar.p = null;
            }
            if (!callback.onPreparePanel(0, jmVar.g, jmVar.h)) {
                if (z && (c20Var3 = this.t) != null) {
                    ((androidx.appcompat.widget.ActionBarOverlayLayout) c20Var3).setMenu(null, this.u);
                }
                jmVar.h.w();
                return false;
            }
            jmVar.h.setQwertyMode(android.view.KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
            jmVar.h.w();
        }
        jmVar.k = true;
        jmVar.l = false;
        this.O = jmVar;
        return true;
    }

    public final void K() {
        if (this.B) {
            throw new android.util.AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void L() {
        android.window.OnBackInvokedCallback onBackInvokedCallback;
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            boolean z = false;
            if (this.h0 != null && (C(0).m || this.w != null)) {
                z = true;
            }
            if (z && this.i0 == null) {
                this.i0 = a.dm.b(this.h0, this);
            } else {
                if (z || (onBackInvokedCallback = this.i0) == null) {
                    return;
                }
                a.dm.c(this.h0, onBackInvokedCallback);
            }
        }
    }

    public final int M(a.du1 du1Var, android.graphics.Rect rect) {
        boolean r5;
        boolean z;
        boolean z2;
        int a2;
        int d = du1Var != null ? du1Var.d() : rect != null ? rect.top : 0;
        androidx.appcompat.widget.ActionBarContextView actionBarContextView = this.x;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof android.view.ViewGroup.MarginLayoutParams)) {
            z = false;
        } else {
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) this.x.getLayoutParams();
            if (this.x.isShown()) {
                if (this.e0 == null) {
                    this.e0 = new android.graphics.Rect();
                    this.f0 = new android.graphics.Rect();
                }
                android.graphics.Rect rect2 = this.e0;
                android.graphics.Rect rect3 = this.f0;
                if (du1Var == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(du1Var.b(), du1Var.d(), du1Var.c(), du1Var.a());
                }
                android.view.ViewGroup viewGroup = this.C;
                java.lang.reflect.Method method = a.zr1.f744a;
                if (method != null) {
                    try {
                        method.invoke(viewGroup, rect2, rect3);
                    } catch (java.lang.Exception e) {
                        android.util.Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e);
                    }
                }
                int i = rect2.top;
                int i2 = rect2.left;
                int i3 = rect2.right;
                android.view.ViewGroup viewGroup2 = this.C;
                java.util.WeakHashMap weakHashMap = a.jq1.f264a;
                a.du1 a3 = a.yp1.a(viewGroup2);
                int b = a3 == null ? 0 : a3.b();
                int c = a3 == null ? 0 : a3.c();
                if (marginLayoutParams.topMargin == i && marginLayoutParams.leftMargin == i2 && marginLayoutParams.rightMargin == i3) {
                    z2 = false;
                } else {
                    marginLayoutParams.topMargin = i;
                    marginLayoutParams.leftMargin = i2;
                    marginLayoutParams.rightMargin = i3;
                    z2 = true;
                }
                android.content.Context context = this.m;
                if (i <= 0 || this.E != null) {
                    android.view.View view = this.E;
                    if (view != null) {
                        android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = (android.view.ViewGroup.MarginLayoutParams) view.getLayoutParams();
                        int i4 = marginLayoutParams2.height;
                        int i5 = marginLayoutParams.topMargin;
                        if (i4 != i5 || marginLayoutParams2.leftMargin != b || marginLayoutParams2.rightMargin != c) {
                            marginLayoutParams2.height = i5;
                            marginLayoutParams2.leftMargin = b;
                            marginLayoutParams2.rightMargin = c;
                            this.E.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    android.view.View view2 = new android.view.View(context);
                    this.E = view2;
                    view2.setVisibility(8);
                    android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = b;
                    layoutParams.rightMargin = c;
                    this.C.addView(this.E, -1, layoutParams);
                }
                android.view.View view3 = this.E;
                r5 = view3 != null;
                if (r5 && view3.getVisibility() != 0) {
                    android.view.View view4 = this.E;
                    if ((a.rp1.g(view4) & 8192) != 0) {
                        java.lang.Object obj = a.zx.f748a;
                        a2 = a.yx.a(context, 2131099654);
                    } else {
                        java.lang.Object obj2 = a.zx.f748a;
                        a2 = a.yx.a(context, 2131099653);
                    }
                    view4.setBackgroundColor(a2);
                }
                if (!this.J && r5) {
                    d = 0;
                }
                z = r5;
                r5 = z2;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z = false;
            } else {
                z = false;
                r5 = false;
            }
            if (r5) {
                this.x.setLayoutParams(marginLayoutParams);
            }
        }
        android.view.View view5 = this.E;
        if (view5 != null) {
            view5.setVisibility(z ? 0 : 8);
        }
        return d;
    }

    @Override // a.xl
    public final void a() {
        android.view.LayoutInflater from = android.view.LayoutInflater.from(this.m);
        if (from.getFactory() == null) {
            from.setFactory2(this);
        } else {
            if (from.getFactory2() instanceof a.km) {
                return;
            }
            android.util.Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // a.xl
    public final void b() {
        if (this.q != null) {
            D();
            if (this.q.f()) {
                return;
            }
            E(0);
        }
    }

    @Override // a.xl
    public final void d() {
        java.lang.String str;
        this.Q = true;
        p(false, true);
        A();
        java.lang.Object obj = this.l;
        if (obj instanceof android.app.Activity) {
            try {
                android.app.Activity activity = (android.app.Activity) obj;
                try {
                    str = a.b20.j0(activity, activity.getComponentName());
                } catch (android.content.pm.PackageManager.NameNotFoundException e) {
                    throw new java.lang.IllegalArgumentException(e);
                }
            } catch (java.lang.IllegalArgumentException unused) {
                str = null;
            }
            if (str != null) {
                a.d1 d1Var = this.q;
                if (d1Var == null) {
                    this.d0 = true;
                } else {
                    d1Var.l(true);
                }
            }
            synchronized (a.xl.j) {
                a.xl.h(this);
                a.xl.i.add(new java.lang.ref.WeakReference(this));
            }
        }
        this.T = new android.content.res.Configuration(this.m.getResources().getConfiguration());
        this.R = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    @Override // a.xl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.l
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L11
            java.lang.Object r0 = a.xl.j
            monitor-enter(r0)
            a.xl.h(r3)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            goto L11
        Le:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r1
        L11:
            boolean r0 = r3.a0
            if (r0 == 0) goto L20
            android.view.Window r0 = r3.n
            android.view.View r0 = r0.getDecorView()
            a.yl r1 = r3.c0
            r0.removeCallbacks(r1)
        L20:
            r0 = 1
            r3.S = r0
            int r0 = r3.U
            r1 = -100
            if (r0 == r1) goto L4d
            java.lang.Object r0 = r3.l
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L4d
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L4d
            a.rh1 r0 = a.km.j0
            java.lang.Object r1 = r3.l
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.U
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L5c
        L4d:
            a.rh1 r0 = a.km.j0
            java.lang.Object r1 = r3.l
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L5c:
            a.d1 r0 = r3.q
            if (r0 == 0) goto L63
            r0.peekMenu()
        L63:
            a.fm r0 = r3.Y
            if (r0 == 0) goto L6a
            r0.a()
        L6a:
            a.fm r0 = r3.Z
            if (r0 == 0) goto L71
            r0.a()
        L71:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a.km.e():void");
    }

    @Override // a.xl
    public final void f() {
        D();
        a.d1 d1Var = this.q;
        if (d1Var != null) {
            d1Var.o(true);
        }
    }

    @Override // a.nz0
    public final boolean g(a.pz0 pz0Var, android.view.MenuItem menuItem) {
        a.jm jmVar;
        android.view.Window.Callback callback = this.n.getCallback();
        if (callback != null && !this.S) {
            a.pz0 k = pz0Var.k();
            a.jm[] jmVarArr = this.N;
            int length = jmVarArr != null ? jmVarArr.length : 0;
            int i = 0;
            while (true) {
                if (i < length) {
                    jmVar = jmVarArr[i];
                    if (jmVar != null && jmVar.h == k) {
                        break;
                    }
                    i++;
                } else {
                    jmVar = null;
                    break;
                }
            }
            if (jmVar != null) {
                return callback.onMenuItemSelected(jmVar.f259a, menuItem);
            }
        }
        return false;
    }

    @Override // a.xl
    public final boolean i(int i) {
        if (i == 8) {
            android.util.Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i = 108;
        } else if (i == 9) {
            android.util.Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i = 109;
        }
        if (this.L && i == 108) {
            return false;
        }
        if (this.H && i == 1) {
            this.H = false;
        }
        if (i == 1) {
            K();
            this.L = true;
            return true;
        }
        if (i == 2) {
            K();
            this.F = true;
            return true;
        }
        if (i == 5) {
            K();
            this.G = true;
            return true;
        }
        if (i == 10) {
            K();
            this.J = true;
            return true;
        }
        if (i == 108) {
            K();
            this.H = true;
            return true;
        }
        if (i != 109) {
            return this.n.requestFeature(i);
        }
        K();
        this.I = true;
        return true;
    }

    @Override // a.xl
    public final void j(int i) {
        z();
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) this.C.findViewById(android.R.id.content);
        viewGroup.removeAllViews();
        android.view.LayoutInflater.from(this.m).inflate(i, viewGroup);
        this.o.a(this.n.getCallback());
    }

    @Override // a.xl
    public final void k(android.view.View view) {
        z();
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) this.C.findViewById(android.R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.o.a(this.n.getCallback());
    }

    @Override // a.xl
    public final void l(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        z();
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) this.C.findViewById(android.R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.o.a(this.n.getCallback());
    }

    @Override // a.xl
    public final void n(java.lang.CharSequence charSequence) {
        this.s = charSequence;
        a.c20 c20Var = this.t;
        if (c20Var != null) {
            c20Var.setWindowTitle(charSequence);
            return;
        }
        a.d1 d1Var = this.q;
        if (d1Var != null) {
            d1Var.p(charSequence);
            return;
        }
        android.widget.TextView textView = this.D;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0174  */
    /* JADX WARN: Type inference failed for: r2v6, types: [a.pi1, java.lang.Object, a.nz0, a.o2] */
    @Override // a.xl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final a.o2 o(a.n2 r9) {
        /*
            Method dump skipped, instructions count: 453
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.km.o(a.n2):a.o2");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x010d, code lost:
    
        if (r10.equals("ImageButton") == false) goto L24;
     */
    @Override // android.view.LayoutInflater.Factory2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onCreateView(android.view.View r9, java.lang.String r10, android.content.Context r11, android.util.AttributeSet r12) {
        /*
            Method dump skipped, instructions count: 736
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.km.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0168 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0183  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean p(boolean r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 422
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.km.p(boolean, boolean):boolean");
    }

    public final void q(android.view.Window window) {
        android.graphics.drawable.Drawable drawable;
        android.window.OnBackInvokedDispatcher onBackInvokedDispatcher;
        android.window.OnBackInvokedCallback onBackInvokedCallback;
        int resourceId;
        if (this.n != null) {
            throw new java.lang.IllegalStateException("AppCompat has already installed itself into the Window");
        }
        android.view.Window.Callback callback = window.getCallback();
        if (callback instanceof a.em) {
            throw new java.lang.IllegalStateException("AppCompat has already installed itself into the Window");
        }
        a.em emVar = new a.em(this, callback);
        this.o = emVar;
        window.setCallback(emVar);
        int[] iArr = k0;
        android.content.Context context = this.m;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes((android.util.AttributeSet) null, iArr);
        if (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) {
            drawable = null;
        } else {
            a.nm a2 = a.nm.a();
            synchronized (a2) {
                drawable = a2.f384a.e(resourceId, context, true);
            }
        }
        if (drawable != null) {
            window.setBackgroundDrawable(drawable);
        }
        obtainStyledAttributes.recycle();
        this.n = window;
        if (android.os.Build.VERSION.SDK_INT < 33 || (onBackInvokedDispatcher = this.h0) != null) {
            return;
        }
        if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.i0) != null) {
            a.dm.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.i0 = null;
        }
        java.lang.Object obj = this.l;
        if (obj instanceof android.app.Activity) {
            android.app.Activity activity = (android.app.Activity) obj;
            if (activity.getWindow() != null) {
                this.h0 = a.dm.a(activity);
                L();
            }
        }
        this.h0 = null;
        L();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0048, code lost:
    
        if (r6.getChildTop() != false) goto L20;
     */
    @Override // a.nz0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r(a.pz0 r6) {
        /*
            r5 = this;
            a.c20 r6 = r5.t
            r0 = 1
            r1 = 0
            if (r6 == 0) goto Ld3
            androidx.appcompat.widget.ActionBarOverlayLayout r6 = (androidx.appcompat.widget.ActionBarOverlayLayout) r6
            r6.haltActionBarHideOffsetAnimations()
            a.d20 r6 = r6.mDecorToolbar
            a.bn1 r6 = (a.bn1) r6
            androidx.appcompat.widget.Toolbar r6 = r6.f47a
            int r2 = r6.getVisibility()
            if (r2 != 0) goto Ld3
            androidx.appcompat.widget.ActionMenuView r6 = r6.c
            if (r6 == 0) goto Ld3
            boolean r6 = r6.mReserveOverflow
            if (r6 == 0) goto Ld3
            android.content.Context r6 = r5.m
            android.view.ViewConfiguration r6 = android.view.ViewConfiguration.get(r6)
            boolean r6 = r6.hasPermanentMenuKey()
            if (r6 == 0) goto L4a
            a.c20 r6 = r5.t
            androidx.appcompat.widget.ActionBarOverlayLayout r6 = (androidx.appcompat.widget.ActionBarOverlayLayout) r6
            r6.haltActionBarHideOffsetAnimations()
            a.d20 r6 = r6.mDecorToolbar
            a.bn1 r6 = (a.bn1) r6
            androidx.appcompat.widget.Toolbar r6 = r6.f47a
            androidx.appcompat.widget.ActionMenuView r6 = r6.c
            if (r6 == 0) goto Ld3
            a.j2 r6 = r6.mPresenter
            if (r6 == 0) goto Ld3
            a.g2 r2 = r6.mActionMenuPresenterCallback
            if (r2 != 0) goto L4a
            boolean r6 = r6.getChildTop()
            if (r6 == 0) goto Ld3
        L4a:
            android.view.Window r6 = r5.n
            android.view.Window$Callback r6 = r6.getCallback()
            a.c20 r2 = r5.t
            androidx.appcompat.widget.ActionBarOverlayLayout r2 = (androidx.appcompat.widget.ActionBarOverlayLayout) r2
            r2.haltActionBarHideOffsetAnimations()
            a.d20 r2 = r2.mDecorToolbar
            a.bn1 r2 = (a.bn1) r2
            androidx.appcompat.widget.Toolbar r2 = r2.f47a
            boolean r2 = r2.q()
            r3 = 108(0x6c, float:1.51E-43)
            if (r2 == 0) goto L8c
            a.c20 r0 = r5.t
            androidx.appcompat.widget.ActionBarOverlayLayout r0 = (androidx.appcompat.widget.ActionBarOverlayLayout) r0
            r0.haltActionBarHideOffsetAnimations()
            a.d20 r0 = r0.mDecorToolbar
            a.bn1 r0 = (a.bn1) r0
            androidx.appcompat.widget.Toolbar r0 = r0.f47a
            androidx.appcompat.widget.ActionMenuView r0 = r0.c
            if (r0 == 0) goto L7e
            a.j2 r0 = r0.mPresenter
            if (r0 == 0) goto L7e
            boolean r0 = r0.f()
        L7e:
            boolean r0 = r5.S
            if (r0 != 0) goto Le0
            a.jm r0 = r5.C(r1)
            a.pz0 r0 = r0.h
            r6.onPanelClosed(r3, r0)
            goto Le0
        L8c:
            if (r6 == 0) goto Le0
            boolean r2 = r5.S
            if (r2 != 0) goto Le0
            boolean r2 = r5.a0
            if (r2 == 0) goto La9
            int r2 = r5.b0
            r0 = r0 & r2
            if (r0 == 0) goto La9
            android.view.Window r0 = r5.n
            android.view.View r0 = r0.getDecorView()
            a.yl r2 = r5.c0
            r0.removeCallbacks(r2)
            r2.run()
        La9:
            a.jm r0 = r5.C(r1)
            a.pz0 r2 = r0.h
            if (r2 == 0) goto Le0
            boolean r4 = r0.o
            if (r4 != 0) goto Le0
            android.view.View r4 = r0.g
            boolean r1 = r6.onPreparePanel(r1, r4, r2)
            if (r1 == 0) goto Le0
            a.pz0 r0 = r0.h
            r6.onMenuOpened(r3, r0)
            a.c20 r6 = r5.t
            androidx.appcompat.widget.ActionBarOverlayLayout r6 = (androidx.appcompat.widget.ActionBarOverlayLayout) r6
            r6.haltActionBarHideOffsetAnimations()
            a.d20 r6 = r6.mDecorToolbar
            a.bn1 r6 = (a.bn1) r6
            androidx.appcompat.widget.Toolbar r6 = r6.f47a
            r6.w()
            goto Le0
        Ld3:
            a.jm r6 = r5.C(r1)
            r6.mTitleTextAppearance = r0
            r5.v(r6, r1)
            r0 = 0
            r5.H(r6, r0)
        Le0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a.km.r(a.pz0):void");
    }

    public final void t(int i, a.jm jmVar, a.pz0 pz0Var) {
        if (pz0Var == null) {
            if (jmVar == null && i >= 0) {
                a.jm[] jmVarArr = this.N;
                if (i < jmVarArr.length) {
                    jmVar = jmVarArr[i];
                }
            }
            if (jmVar != null) {
                pz0Var = jmVar.h;
            }
        }
        if ((jmVar == null || jmVar.m) && !this.S) {
            a.em emVar = this.o;
            android.view.Window.Callback callback = this.n.getCallback();
            emVar.getClass();
            try {
                emVar.g = true;
                callback.onPanelClosed(i, pz0Var);
            } finally {
                emVar.g = false;
            }
        }
    }

    public final void u(a.pz0 pz0Var) {
        a.j2 j2Var;
        if (this.M) {
            return;
        }
        this.M = true;
        androidx.appcompat.widget.ActionBarOverlayLayout actionBarOverlayLayout = (androidx.appcompat.widget.ActionBarOverlayLayout) this.t;
        actionBarOverlayLayout.haltActionBarHideOffsetAnimations();
        androidx.appcompat.widget.ActionMenuView actionMenuView = ((a.bn1) actionBarOverlayLayout.mDecorToolbar).f47a.mMenuView;
        if (actionMenuView != null && (j2Var = actionMenuView.mPresenter) != null) {
            j2Var.f();
            a.e2 e2Var = j2Var.v;
            if (e2Var != null && e2Var.b()) {
                e2Var.j.dismiss();
            }
        }
        android.view.Window.Callback callback = this.n.getCallback();
        if (callback != null && !this.S) {
            callback.onPanelClosed(108, pz0Var);
        }
        this.M = false;
    }

    public final void v(a.jm jmVar, boolean z) {
        a.im imVar;
        a.c20 c20Var;
        if (z && jmVar.f259a == 0 && (c20Var = this.t) != null) {
            androidx.appcompat.widget.ActionBarOverlayLayout actionBarOverlayLayout = (androidx.appcompat.widget.ActionBarOverlayLayout) c20Var;
            actionBarOverlayLayout.haltActionBarHideOffsetAnimations();
            if (((a.bn1) actionBarOverlayLayout.mDecorToolbar).f47a.isOverflowMenuShowing()) {
                u(jmVar.h);
                return;
            }
        }
        android.view.WindowManager windowManager = (android.view.WindowManager) this.m.getSystemService("window");
        if (windowManager != null && jmVar.m && (imVar = jmVar.e) != null) {
            windowManager.removeView(imVar);
            if (z) {
                t(jmVar.f259a, jmVar, null);
            }
        }
        jmVar.k = false;
        jmVar.l = false;
        jmVar.m = false;
        jmVar.f = null;
        jmVar.n = true;
        if (this.O == jmVar) {
            this.O = null;
        }
        if (jmVar.f259a == 0) {
            L();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean x(android.view.KeyEvent r7) {
        /*
            Method dump skipped, instructions count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.km.x(android.view.KeyEvent):boolean");
    }

    public final void y(int i) {
        a.jm C = C(i);
        if (C.h != null) {
            android.os.Bundle bundle = new android.os.Bundle();
            C.h.t(bundle);
            if (bundle.size() > 0) {
                C.p = bundle;
            }
            C.h.x();
            C.h.clear();
        }
        C.o = true;
        C.n = true;
        if ((i == 108 || i == 0) && this.t != null) {
            a.jm C2 = C(0);
            C2.k = false;
            J(C2, null);
        }
    }

    public final void z() {
        android.view.ViewGroup viewGroup;
        if (this.B) {
            return;
        }
        int[] iArr = a.u81.j;
        android.content.Context context = this.m;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (!obtainStyledAttributes.hasValue(117)) {
            obtainStyledAttributes.recycle();
            throw new java.lang.IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        int i = 0;
        if (obtainStyledAttributes.getBoolean(126, false)) {
            i(1);
        } else if (obtainStyledAttributes.getBoolean(117, false)) {
            i(108);
        }
        if (obtainStyledAttributes.getBoolean(118, false)) {
            i(109);
        }
        if (obtainStyledAttributes.getBoolean(119, false)) {
            i(10);
        }
        this.K = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        A();
        this.n.getDecorView();
        android.view.LayoutInflater from = android.view.LayoutInflater.from(context);
        int i2 = 2;
        if (this.L) {
            viewGroup = this.J ? (android.view.ViewGroup) from.inflate(2131558422, (android.view.ViewGroup) null) : (android.view.ViewGroup) from.inflate(2131558421, (android.view.ViewGroup) null);
        } else if (this.K) {
            viewGroup = (android.view.ViewGroup) from.inflate(2131558412, (android.view.ViewGroup) null);
            this.I = false;
            this.H = false;
        } else if (this.H) {
            android.util.TypedValue typedValue = new android.util.TypedValue();
            context.getTheme().resolveAttribute(2130968585, typedValue, true);
            viewGroup = (android.view.ViewGroup) android.view.LayoutInflater.from(typedValue.resourceId != 0 ? new a.dy(context, typedValue.resourceId) : context).inflate(2131558423, (android.view.ViewGroup) null);
            a.c20 c20Var = (a.c20) viewGroup.findViewById(2131362349);
            this.t = c20Var;
            c20Var.setWindowCallback(this.n.getCallback());
            if (this.I) {
                ((androidx.appcompat.widget.ActionBarOverlayLayout) this.t).setActionBarHideOffset(109);
            }
            if (this.F) {
                ((androidx.appcompat.widget.ActionBarOverlayLayout) this.t).setActionBarHideOffset(2);
            }
            if (this.G) {
                ((androidx.appcompat.widget.ActionBarOverlayLayout) this.t).setActionBarHideOffset(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new java.lang.IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.H + ", windowActionBarOverlay: " + this.I + ", android:windowIsFloating: " + this.K + ", windowActionModeOverlay: " + this.J + ", windowNoTitle: " + this.L + " }");
        }
        a.zl zlVar = new a.zl(this, i);
        java.util.WeakHashMap weakHashMap = a.jq1.f264a;
        a.xp1.u(viewGroup, zlVar);
        if (this.t == null) {
            this.D = (android.widget.TextView) viewGroup.findViewById(2131363290);
        }
        java.lang.reflect.Method method = a.zr1.f744a;
        try {
            java.lang.reflect.Method method2 = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", new java.lang.Class[0]);
            if (!method2.isAccessible()) {
                method2.setAccessible(true);
            }
            method2.invoke(viewGroup, new java.lang.Object[0]);
        } catch (java.lang.IllegalAccessException e) {
            android.util.Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e);
        } catch (java.lang.NoSuchMethodException unused) {
            android.util.Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
        } catch (java.lang.reflect.InvocationTargetException e2) {
            android.util.Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e2);
        }
        androidx.appcompat.widget.ContentFrameLayout contentFrameLayout = (androidx.appcompat.widget.ContentFrameLayout) viewGroup.findViewById(2131361904);
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) this.n.findViewById(android.R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                android.view.View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(android.R.id.content);
            if (viewGroup2 instanceof android.widget.FrameLayout) {
                ((android.widget.FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.n.setContentView(viewGroup);
        contentFrameLayout.setAttachListener((androidx.appcompat.widget.ContentFrameLayout.OnAttachListener) new a.zl(this, i2));
        this.C = viewGroup;
        java.lang.Object obj = this.l;
        java.lang.CharSequence title = obj instanceof android.app.Activity ? ((android.app.Activity) obj).getTitle() : this.s;
        if (!android.text.TextUtils.isEmpty(title)) {
            a.c20 c20Var2 = this.t;
            if (c20Var2 != null) {
                c20Var2.setWindowTitle(title);
            } else {
                a.d1 d1Var = this.q;
                if (d1Var != null) {
                    d1Var.p(title);
                } else {
                    android.widget.TextView textView = this.D;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        androidx.appcompat.widget.ContentFrameLayout contentFrameLayout2 = (androidx.appcompat.widget.ContentFrameLayout) this.C.findViewById(android.R.id.content);
        android.view.View decorView = this.n.getDecorView();
        contentFrameLayout2.mDecorPadding.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        java.util.WeakHashMap weakHashMap2 = a.jq1.f264a;
        if (a.up1.c((View) contentFrameLayout2)) {
            contentFrameLayout2.requestLayout();
        }
        android.content.res.TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(iArr);
        obtainStyledAttributes2.getValue(124, contentFrameLayout2.getMinWidthMajor());
        obtainStyledAttributes2.getValue(125, contentFrameLayout2.getMinWidthMinor());
        if (obtainStyledAttributes2.hasValue(122)) {
            obtainStyledAttributes2.getValue(122, contentFrameLayout2.getFixedWidthMajor());
        }
        if (obtainStyledAttributes2.hasValue(123)) {
            obtainStyledAttributes2.getValue(123, contentFrameLayout2.getFixedWidthMinor());
        }
        if (obtainStyledAttributes2.hasValue(120)) {
            obtainStyledAttributes2.getValue(120, contentFrameLayout2.getFixedHeightMajor());
        }
        if (obtainStyledAttributes2.hasValue(121)) {
            obtainStyledAttributes2.getValue(121, contentFrameLayout2.getFixedHeightMinor());
        }
        obtainStyledAttributes2.recycle();
        contentFrameLayout2.requestLayout();
        this.B = true;
        a.jm C = C(0);
        if (this.S || C.h != null) {
            return;
        }
        E(108);
    }

    @Override // android.view.LayoutInflater.Factory
    public final android.view.View onCreateView(java.lang.String str, android.content.Context context, android.util.AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
