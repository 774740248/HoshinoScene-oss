package androidx.fragment.app;
import a.ai1;
import a.am0;
import a.bm0;
import a.cn0;
import a.dm0;
import a.dn0;
import a.ek0;
import a.er1;
import a.ev0;
import a.fr1;
import a.fv0;
import a.gk0;
import a.gm0;
import a.hi1;
import a.ii1;
import a.jd1;
import a.ji1;
import a.jk0;
import a.jq1;
import a.kv0;
import a.mv0;
import a.pm;
import a.ql0;
import a.ul0;
import a.up1;
import a.vp1;


/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final pm f754a;
    public final dn0 b;
    public final gk0 c;
    public boolean d = false;
    public int e = -1;

    public a(pm pmVar, dn0 dn0Var, gk0 gk0Var) {
        this.f754a = pmVar;
        this.b = dn0Var;
        this.c = gk0Var;
    }

    public final void a() {
        boolean isLoggable = android.util.Log.isLoggable("FragmentManager", 3);
        gk0 gk0Var = this.c;
        if (isLoggable) {
            android.util.Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + gk0Var);
        }
        android.os.Bundle bundle = gk0Var.d;
        gk0Var.w.H();
        gk0Var.c = 3;
        gk0Var.F = false;
        gk0Var.o();
        if (!gk0Var.F) {
            throw new android.util.AndroidRuntimeException(ai1.f("Fragment ", gk0Var, " did not call through to super.onActivityCreated()"));
        }
        if (android.util.Log.isLoggable("FragmentManager", 3)) {
            android.util.Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + gk0Var);
        }
        android.view.View view = gk0Var.H;
        if (view != null) {
            android.os.Bundle bundle2 = gk0Var.d;
            android.util.SparseArray<android.os.Parcelable> sparseArray = gk0Var.e;
            if (sparseArray != null) {
                view.restoreHierarchyState(sparseArray);
                gk0Var.e = null;
            }
            if (gk0Var.H != null) {
                gk0Var.R.e.b(gk0Var.f);
                gk0Var.f = null;
            }
            gk0Var.F = false;
            gk0Var.D(bundle2);
            if (!gk0Var.F) {
                throw new android.util.AndroidRuntimeException(ai1.f("Fragment ", gk0Var, " did not call through to super.onViewStateRestored()"));
            }
            if (gk0Var.H != null) {
                gk0Var.R.a(ev0.ON_CREATE);
            }
        }
        gk0Var.d = null;
        bm0 bm0Var = gk0Var.w;
        bm0Var.B = false;
        bm0Var.C = false;
        bm0Var.I.i = false;
        bm0Var.p(4);
        this.f754a.a(false);
    }

    public final void b() {
        android.view.View view;
        android.view.View view2;
        dn0 dn0Var = this.b;
        dn0Var.getClass();
        gk0 gk0Var = this.c;
        android.view.ViewGroup viewGroup = gk0Var.G;
        int i = -1;
        if (viewGroup != null) {
            java.util.ArrayList arrayList = dn0Var.f101a;
            int indexOf = arrayList.indexOf(gk0Var);
            int i2 = indexOf - 1;
            while (true) {
                if (i2 < 0) {
                    while (true) {
                        indexOf++;
                        if (indexOf >= arrayList.size()) {
                            break;
                        }
                        gk0 gk0Var2 = (gk0) arrayList.get(indexOf);
                        if (gk0Var2.G == viewGroup && (view = gk0Var2.H) != null) {
                            i = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    gk0 gk0Var3 = (gk0) arrayList.get(i2);
                    if (gk0Var3.G == viewGroup && (view2 = gk0Var3.H) != null) {
                        i = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i2--;
                }
            }
        }
        gk0Var.G.addView(gk0Var.H, i);
    }

    public final void c() {
        androidx.fragment.app.a aVar;
        boolean isLoggable = android.util.Log.isLoggable("FragmentManager", 3);
        gk0 gk0Var = this.c;
        if (isLoggable) {
            android.util.Log.d("FragmentManager", "moveto ATTACHED: " + gk0Var);
        }
        gk0 gk0Var2 = gk0Var.j;
        dn0 dn0Var = this.b;
        if (gk0Var2 != null) {
            aVar = (androidx.fragment.app.a) dn0Var.b.get(gk0Var2.h);
            if (aVar == null) {
                throw new java.lang.IllegalStateException("Fragment " + gk0Var + " declared target fragment " + gk0Var.j + " that does not belong to this FragmentManager!");
            }
            gk0Var.k = gk0Var.j.h;
            gk0Var.j = null;
        } else {
            java.lang.String str = gk0Var.k;
            if (str != null) {
                aVar = (androidx.fragment.app.a) dn0Var.b.get(str);
                if (aVar == null) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Fragment ");
                    sb.append(gk0Var);
                    sb.append(" declared target fragment ");
                    throw new java.lang.IllegalStateException(ai1.j(sb, gk0Var.k, " that does not belong to this FragmentManager!"));
                }
            } else {
                aVar = null;
            }
        }
        if (aVar != null) {
            aVar.k();
        }
        am0 am0Var = gk0Var.u;
        gk0Var.v = am0Var.q;
        gk0Var.x = am0Var.s;
        pm pmVar = this.f754a;
        pmVar.h(false);
        java.util.ArrayList arrayList = gk0Var.U;
        java.util.Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            ai1.t(it.next());
            throw null;
        }
        arrayList.clear();
        gk0Var.w.b(gk0Var.v, gk0Var.a(), gk0Var);
        gk0Var.c = 0;
        gk0Var.F = false;
        gk0Var.q(gk0Var.v.X);
        if (!gk0Var.F) {
            throw new android.util.AndroidRuntimeException(ai1.f("Fragment ", gk0Var, " did not call through to super.onAttach()"));
        }
        java.util.Iterator it2 = gk0Var.u.o.iterator();
        while (it2.hasNext()) {
            ((gm0) it2.next()).a(gk0Var);
        }
        bm0 bm0Var = gk0Var.w;
        bm0Var.B = false;
        bm0Var.C = false;
        bm0Var.I.i = false;
        bm0Var.p(0);
        pmVar.b(false);
    }

    public final int d() {
        hi1 hi1Var;
        gk0 gk0Var = this.c;
        if (gk0Var.u == null) {
            return gk0Var.c;
        }
        int i = this.e;
        int ordinal = gk0Var.P.ordinal();
        if (ordinal == 1) {
            i = java.lang.Math.min(i, 0);
        } else if (ordinal == 2) {
            i = java.lang.Math.min(i, 1);
        } else if (ordinal == 3) {
            i = java.lang.Math.min(i, 5);
        } else if (ordinal != 4) {
            i = java.lang.Math.min(i, -1);
        }
        if (gk0Var.p) {
            if (gk0Var.q) {
                i = java.lang.Math.max(this.e, 2);
                android.view.View view = gk0Var.H;
                if (view != null && view.getParent() == null) {
                    i = java.lang.Math.min(i, 2);
                }
            } else {
                i = this.e < 4 ? java.lang.Math.min(i, gk0Var.c) : java.lang.Math.min(i, 1);
            }
        }
        if (!gk0Var.n) {
            i = java.lang.Math.min(i, 1);
        }
        int r6 = 0;
        android.view.ViewGroup viewGroup = gk0Var.G;
        if (viewGroup != null) {
            ji1 f = ji1.f(viewGroup, gk0Var.h().A());
            f.getClass();
            hi1 d = f.d(gk0Var);
            r6 = d != null ? d.b : 0;
            java.util.Iterator it = f.c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    hi1Var = null;
                    break;
                }
                hi1Var = (hi1) it.next();
                if (hi1Var.c.equals(gk0Var) && !hi1Var.f) {
                    break;
                }
            }
            if (hi1Var != null && (r6 == 0 || r6 == 1)) {
                r6 = hi1Var.b;
            }
        }
        if (r6 == 2) {
            i = java.lang.Math.min(i, 6);
        } else if (r6 == 3) {
            i = java.lang.Math.max(i, 3);
        } else if (gk0Var.o) {
            i = gk0Var.t > 0 ? java.lang.Math.min(i, 1) : java.lang.Math.min(i, -1);
        }
        if (gk0Var.I && gk0Var.c < 5) {
            i = java.lang.Math.min(i, 4);
        }
        if (android.util.Log.isLoggable("FragmentManager", 2)) {
            android.util.Log.v("FragmentManager", "computeExpectedState() of " + i + " for " + gk0Var);
        }
        return i;
    }

    public final void e() {
        boolean isLoggable = android.util.Log.isLoggable("FragmentManager", 3);
        final gk0 gk0Var = this.c;
        if (isLoggable) {
            android.util.Log.d("FragmentManager", "moveto CREATED: " + gk0Var);
        }
        if (gk0Var.O) {
            gk0Var.N(gk0Var.d);
            gk0Var.c = 1;
            return;
        }
        pm pmVar = this.f754a;
        pmVar.i(false);
        android.os.Bundle bundle = gk0Var.d;
        gk0Var.w.H();
        gk0Var.c = 1;
        gk0Var.F = false;
        gk0Var.Q.a(new kv0() { // from class: androidx.fragment.app.Fragment$5
            @Override // kv0
            public final void c(mv0 mv0Var, ev0 ev0Var) {
                android.view.View view;
                if (ev0Var != ev0.ON_STOP || (view = gk0.this.H) == null) {
                    return;
                }
                view.cancelPendingInputEvents();
            }
        });
        gk0Var.T.b(bundle);
        gk0Var.r(bundle);
        gk0Var.O = true;
        if (!gk0Var.F) {
            throw new android.util.AndroidRuntimeException(ai1.f("Fragment ", gk0Var, " did not call through to super.onCreate()"));
        }
        gk0Var.Q.e(ev0.ON_CREATE);
        pmVar.c(false);
    }

    public final void f() {
        java.lang.String str;
        gk0 gk0Var = this.c;
        if (gk0Var.p) {
            return;
        }
        if (android.util.Log.isLoggable("FragmentManager", 3)) {
            android.util.Log.d("FragmentManager", "moveto CREATE_VIEW: " + gk0Var);
        }
        android.view.LayoutInflater w = gk0Var.w(gk0Var.d);
        gk0Var.N = w;
        android.view.ViewGroup viewGroup = gk0Var.G;
        if (viewGroup == null) {
            int i = gk0Var.z;
            if (i == 0) {
                viewGroup = null;
            } else {
                if (i == -1) {
                    throw new java.lang.IllegalArgumentException(ai1.f("Cannot create fragment ", gk0Var, " for a container view with no id"));
                }
                viewGroup = (android.view.ViewGroup) gk0Var.u.r.V0(i);
                if (viewGroup == null && !gk0Var.r) {
                    try {
                        str = gk0Var.j().getResourceName(gk0Var.z);
                    } catch (android.content.res.Resources.NotFoundException unused) {
                        str = "unknown";
                    }
                    throw new java.lang.IllegalArgumentException("No view found for id 0x" + java.lang.Integer.toHexString(gk0Var.z) + " (" + str + ") for fragment " + gk0Var);
                }
            }
        }
        gk0Var.G = viewGroup;
        gk0Var.E(w, viewGroup, gk0Var.d);
        android.view.View view = gk0Var.H;
        if (view != null) {
            view.setSaveFromParentEnabled(false);
            gk0Var.H.setTag(2131362518, gk0Var);
            if (viewGroup != null) {
                b();
            }
            if (gk0Var.B) {
                gk0Var.H.setVisibility(8);
            }
            android.view.View view2 = gk0Var.H;
            java.util.WeakHashMap weakHashMap = jq1.f264a;
            if (up1.b(view2)) {
                vp1.c(gk0Var.H);
            } else {
                android.view.View view3 = gk0Var.H;
                view3.addOnAttachStateChangeListener(new ql0(this, view3));
            }
            gk0Var.C(gk0Var.H, gk0Var.d);
            gk0Var.w.p(2);
            this.f754a.n(false);
            int visibility = gk0Var.H.getVisibility();
            gk0Var.c().n = gk0Var.H.getAlpha();
            if (gk0Var.G != null && visibility == 0) {
                android.view.View findFocus = gk0Var.H.findFocus();
                if (findFocus != null) {
                    gk0Var.c().o = findFocus;
                    if (android.util.Log.isLoggable("FragmentManager", 2)) {
                        android.util.Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + gk0Var);
                    }
                }
                gk0Var.H.setAlpha(0.0f);
            }
        }
        gk0Var.c = 2;
    }

    public final void g() {
        gk0 b;
        boolean isLoggable = android.util.Log.isLoggable("FragmentManager", 3);
        gk0 gk0Var = this.c;
        if (isLoggable) {
            android.util.Log.d("FragmentManager", "movefrom CREATED: " + gk0Var);
        }
        boolean z = true;
        boolean z2 = gk0Var.o && gk0Var.t <= 0;
        dn0 dn0Var = this.b;
        if (!z2) {
            dm0 dm0Var = dn0Var.c;
            if (dm0Var.d.containsKey(gk0Var.h) && dm0Var.g && !dm0Var.h) {
                java.lang.String str = gk0Var.k;
                if (str != null && (b = dn0Var.b(str)) != null && b.D) {
                    gk0Var.j = b;
                }
                gk0Var.c = 0;
                return;
            }
        }
        jk0 jk0Var = gk0Var.v;
        if (jk0Var instanceof fr1) {
            z = dn0Var.c.h;
        } else {
            android.content.Context context = jk0Var.X;
            if (context instanceof android.app.Activity) {
                z = true ^ ((android.app.Activity) context).isChangingConfigurations();
            }
        }
        if (z2 || z) {
            dm0 dm0Var2 = dn0Var.c;
            dm0Var2.getClass();
            if (android.util.Log.isLoggable("FragmentManager", 3)) {
                android.util.Log.d("FragmentManager", "Clearing non-config state for " + gk0Var);
            }
            java.util.HashMap hashMap = dm0Var2.e;
            dm0 dm0Var3 = (dm0) hashMap.get(gk0Var.h);
            if (dm0Var3 != null) {
                dm0Var3.b();
                hashMap.remove(gk0Var.h);
            }
            java.util.HashMap hashMap2 = dm0Var2.f;
            er1 er1Var = (er1) hashMap2.get(gk0Var.h);
            if (er1Var != null) {
                er1Var.a();
                hashMap2.remove(gk0Var.h);
            }
        }
        gk0Var.w.k();
        gk0Var.Q.e(ev0.ON_DESTROY);
        gk0Var.c = 0;
        gk0Var.F = false;
        gk0Var.O = false;
        gk0Var.t();
        if (!gk0Var.F) {
            throw new android.util.AndroidRuntimeException(ai1.f("Fragment ", gk0Var, " did not call through to super.onDestroy()"));
        }
        this.f754a.e(false);
        java.util.Iterator it = dn0Var.d().iterator();
        while (it.hasNext()) {
            androidx.fragment.app.a aVar = (androidx.fragment.app.a) it.next();
            if (aVar != null) {
                java.lang.String str2 = gk0Var.h;
                gk0 gk0Var2 = aVar.c;
                if (str2.equals(gk0Var2.k)) {
                    gk0Var2.j = gk0Var;
                    gk0Var2.k = null;
                }
            }
        }
        java.lang.String str3 = gk0Var.k;
        if (str3 != null) {
            gk0Var.j = dn0Var.b(str3);
        }
        dn0Var.h(this);
    }

    public final void h() {
        android.view.View view;
        boolean isLoggable = android.util.Log.isLoggable("FragmentManager", 3);
        gk0 gk0Var = this.c;
        if (isLoggable) {
            android.util.Log.d("FragmentManager", "movefrom CREATE_VIEW: " + gk0Var);
        }
        android.view.ViewGroup viewGroup = gk0Var.G;
        if (viewGroup != null && (view = gk0Var.H) != null) {
            viewGroup.removeView(view);
        }
        gk0Var.F();
        this.f754a.o(false);
        gk0Var.G = null;
        gk0Var.H = null;
        gk0Var.R = null;
        gk0Var.S.e(null);
        gk0Var.q = false;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [bm0, am0] */
    /* JADX WARN: Type inference failed for: r6v6, types: [bm0, am0] */
    public final void i() {
        boolean isLoggable = android.util.Log.isLoggable("FragmentManager", 3);
        gk0 gk0Var = this.c;
        if (isLoggable) {
            android.util.Log.d("FragmentManager", "movefrom ATTACHED: " + gk0Var);
        }
        gk0Var.c = -1;
        gk0Var.F = false;
        gk0Var.v();
        gk0Var.N = null;
        if (!gk0Var.F) {
            throw new android.util.AndroidRuntimeException(ai1.f("Fragment ", gk0Var, " did not call through to super.onDetach()"));
        }
        bm0 bm0Var = gk0Var.w;
        if (!bm0Var.D) {
            bm0Var.k();
            gk0Var.w = new bm0();
        }
        this.f754a.f(false);
        gk0Var.c = -1;
        gk0Var.v = null;
        gk0Var.x = null;
        gk0Var.u = null;
        if (!gk0Var.o || gk0Var.t > 0) {
            dm0 dm0Var = this.b.c;
            if (dm0Var.d.containsKey(gk0Var.h) && dm0Var.g && !dm0Var.h) {
                return;
            }
        }
        if (android.util.Log.isLoggable("FragmentManager", 3)) {
            android.util.Log.d("FragmentManager", "initState called for fragment: " + gk0Var);
        }
        gk0Var.Q = new androidx.lifecycle.a(gk0Var);
        gk0Var.T = new jd1(gk0Var);
        gk0Var.h = java.util.UUID.randomUUID().toString();
        gk0Var.n = false;
        gk0Var.o = false;
        gk0Var.p = false;
        gk0Var.q = false;
        gk0Var.r = false;
        gk0Var.t = 0;
        gk0Var.u = null;
        gk0Var.w = new bm0();
        gk0Var.v = null;
        gk0Var.y = 0;
        gk0Var.z = 0;
        gk0Var.A = null;
        gk0Var.B = false;
        gk0Var.C = false;
    }

    public final void j() {
        gk0 gk0Var = this.c;
        if (gk0Var.p && gk0Var.q && !gk0Var.s) {
            if (android.util.Log.isLoggable("FragmentManager", 3)) {
                android.util.Log.d("FragmentManager", "moveto CREATE_VIEW: " + gk0Var);
            }
            android.view.LayoutInflater w = gk0Var.w(gk0Var.d);
            gk0Var.N = w;
            gk0Var.E(w, null, gk0Var.d);
            android.view.View view = gk0Var.H;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                gk0Var.H.setTag(2131362518, gk0Var);
                if (gk0Var.B) {
                    gk0Var.H.setVisibility(8);
                }
                gk0Var.C(gk0Var.H, gk0Var.d);
                gk0Var.w.p(2);
                this.f754a.n(false);
                gk0Var.c = 2;
            }
        }
    }

    public final void k() {
        android.view.ViewGroup viewGroup;
        android.view.ViewGroup viewGroup2;
        android.view.ViewGroup viewGroup3;
        boolean z = this.d;
        gk0 gk0Var = this.c;
        if (z) {
            if (android.util.Log.isLoggable("FragmentManager", 2)) {
                android.util.Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + gk0Var);
                return;
            }
            return;
        }
        try {
            this.d = true;
            while (true) {
                int d = d();
                int i = gk0Var.c;
                if (d == i) {
                    if (gk0Var.L) {
                        if (gk0Var.H != null && (viewGroup = gk0Var.G) != null) {
                            ji1 f = ji1.f(viewGroup, gk0Var.h().A());
                            if (gk0Var.B) {
                                f.getClass();
                                if (android.util.Log.isLoggable("FragmentManager", 2)) {
                                    android.util.Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + gk0Var);
                                }
                                f.a(3, 1, this);
                            } else {
                                f.getClass();
                                if (android.util.Log.isLoggable("FragmentManager", 2)) {
                                    android.util.Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + gk0Var);
                                }
                                f.a(2, 1, this);
                            }
                        }
                        am0 am0Var = gk0Var.u;
                        if (am0Var != null && gk0Var.n && am0.C(gk0Var)) {
                            am0Var.A = true;
                        }
                        gk0Var.L = false;
                    }
                    this.d = false;
                    return;
                }
                if (d <= i) {
                    switch (i - 1) {
                        case -1:
                            i();
                            break;
                        case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                            g();
                            break;
                        case 1:
                            h();
                            gk0Var.c = 1;
                            break;
                        case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                            gk0Var.q = false;
                            gk0Var.c = 2;
                            break;
                        case 3:
                            if (android.util.Log.isLoggable("FragmentManager", 3)) {
                                android.util.Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + gk0Var);
                            }
                            if (gk0Var.H != null && gk0Var.e == null) {
                                o();
                            }
                            if (gk0Var.H != null && (viewGroup3 = gk0Var.G) != null) {
                                ji1 f2 = ji1.f(viewGroup3, gk0Var.h().A());
                                f2.getClass();
                                if (android.util.Log.isLoggable("FragmentManager", 2)) {
                                    android.util.Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + gk0Var);
                                }
                                f2.a(1, 3, this);
                            }
                            gk0Var.c = 3;
                            break;
                        case com.omarea.krscript.model.ShellHandlerBase.EVENT_READ_ERROR /* 4 */:
                            q();
                            break;
                        case 5:
                            gk0Var.c = 5;
                            break;
                        case com.omarea.krscript.model.ShellHandlerBase.EVENT_WRITE /* 6 */:
                            l();
                            break;
                    }
                } else {
                    switch (i + 1) {
                        case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                            c();
                            break;
                        case 1:
                            e();
                            break;
                        case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                            j();
                            f();
                            break;
                        case 3:
                            a();
                            break;
                        case com.omarea.krscript.model.ShellHandlerBase.EVENT_READ_ERROR /* 4 */:
                            if (gk0Var.H != null && (viewGroup2 = gk0Var.G) != null) {
                                ji1 f3 = ji1.f(viewGroup2, gk0Var.h().A());
                                int b = ii1.b(gk0Var.H.getVisibility());
                                f3.getClass();
                                if (android.util.Log.isLoggable("FragmentManager", 2)) {
                                    android.util.Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + gk0Var);
                                }
                                f3.a(b, 2, this);
                            }
                            gk0Var.c = 4;
                            break;
                        case 5:
                            p();
                            break;
                        case com.omarea.krscript.model.ShellHandlerBase.EVENT_WRITE /* 6 */:
                            gk0Var.c = 6;
                            break;
                        case 7:
                            n();
                            break;
                    }
                }
            }
        } catch (java.lang.Throwable th) {
            this.d = false;
            throw th;
        }
    }

    public final void l() {
        boolean isLoggable = android.util.Log.isLoggable("FragmentManager", 3);
        gk0 gk0Var = this.c;
        if (isLoggable) {
            android.util.Log.d("FragmentManager", "movefrom RESUMED: " + gk0Var);
        }
        gk0Var.w.p(5);
        if (gk0Var.H != null) {
            gk0Var.R.a(ev0.ON_PAUSE);
        }
        gk0Var.Q.e(ev0.ON_PAUSE);
        gk0Var.c = 6;
        gk0Var.F = false;
        gk0Var.x();
        if (!gk0Var.F) {
            throw new android.util.AndroidRuntimeException(ai1.f("Fragment ", gk0Var, " did not call through to super.onPause()"));
        }
        this.f754a.g(false);
    }

    public final void m(java.lang.ClassLoader classLoader) {
        gk0 gk0Var = this.c;
        android.os.Bundle bundle = gk0Var.d;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        gk0Var.e = gk0Var.d.getSparseParcelableArray("android:view_state");
        gk0Var.f = gk0Var.d.getBundle("android:view_registry_state");
        gk0Var.k = gk0Var.d.getString("android:target_state");
        if (gk0Var.k != null) {
            gk0Var.l = gk0Var.d.getInt("android:target_req_state", 0);
        }
        java.lang.Boolean bool = gk0Var.g;
        if (bool != null) {
            gk0Var.J = bool.booleanValue();
            gk0Var.g = null;
        } else {
            gk0Var.J = gk0Var.d.getBoolean("android:user_visible_hint", true);
        }
        if (gk0Var.J) {
            return;
        }
        gk0Var.I = true;
    }

    public final void n() {
        boolean isLoggable = android.util.Log.isLoggable("FragmentManager", 3);
        gk0 gk0Var = this.c;
        if (isLoggable) {
            android.util.Log.d("FragmentManager", "moveto RESUMED: " + gk0Var);
        }
        ek0 ek0Var = gk0Var.K;
        android.view.View view = ek0Var == null ? null : ek0Var.o;
        if (view != null) {
            if (view != gk0Var.H) {
                for (android.view.ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                    if (parent != gk0Var.H) {
                    }
                }
            }
            boolean requestFocus = view.requestFocus();
            if (android.util.Log.isLoggable("FragmentManager", 2)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("requestFocus: Restoring focused view ");
                sb.append(view);
                sb.append(" ");
                sb.append(requestFocus ? "succeeded" : "failed");
                sb.append(" on Fragment ");
                sb.append(gk0Var);
                sb.append(" resulting in focused view ");
                sb.append(gk0Var.H.findFocus());
                android.util.Log.v("FragmentManager", sb.toString());
            }
        }
        gk0Var.c().o = null;
        gk0Var.w.H();
        gk0Var.w.u(true);
        gk0Var.c = 7;
        gk0Var.F = false;
        gk0Var.y();
        if (!gk0Var.F) {
            throw new android.util.AndroidRuntimeException(ai1.f("Fragment ", gk0Var, " did not call through to super.onResume()"));
        }
        androidx.lifecycle.a aVar = gk0Var.Q;
        ev0 ev0Var = ev0.ON_RESUME;
        aVar.e(ev0Var);
        if (gk0Var.H != null) {
            gk0Var.R.d.e(ev0Var);
        }
        bm0 bm0Var = gk0Var.w;
        bm0Var.B = false;
        bm0Var.C = false;
        bm0Var.I.i = false;
        bm0Var.p(7);
        this.f754a.j(false);
        gk0Var.d = null;
        gk0Var.e = null;
        gk0Var.f = null;
    }

    public final void o() {
        gk0 gk0Var = this.c;
        if (gk0Var.H == null) {
            return;
        }
        android.util.SparseArray<android.os.Parcelable> sparseArray = new android.util.SparseArray<>();
        gk0Var.H.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            gk0Var.e = sparseArray;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        gk0Var.R.e.c(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        gk0Var.f = bundle;
    }

    public final void p() {
        boolean isLoggable = android.util.Log.isLoggable("FragmentManager", 3);
        gk0 gk0Var = this.c;
        if (isLoggable) {
            android.util.Log.d("FragmentManager", "moveto STARTED: " + gk0Var);
        }
        gk0Var.w.H();
        gk0Var.w.u(true);
        gk0Var.c = 5;
        gk0Var.F = false;
        gk0Var.A();
        if (!gk0Var.F) {
            throw new android.util.AndroidRuntimeException(ai1.f("Fragment ", gk0Var, " did not call through to super.onStart()"));
        }
        androidx.lifecycle.a aVar = gk0Var.Q;
        ev0 ev0Var = ev0.ON_START;
        aVar.e(ev0Var);
        if (gk0Var.H != null) {
            gk0Var.R.d.e(ev0Var);
        }
        bm0 bm0Var = gk0Var.w;
        bm0Var.B = false;
        bm0Var.C = false;
        bm0Var.I.i = false;
        bm0Var.p(5);
        this.f754a.l(false);
    }

    public final void q() {
        boolean isLoggable = android.util.Log.isLoggable("FragmentManager", 3);
        gk0 gk0Var = this.c;
        if (isLoggable) {
            android.util.Log.d("FragmentManager", "movefrom STARTED: " + gk0Var);
        }
        bm0 bm0Var = gk0Var.w;
        bm0Var.C = true;
        bm0Var.I.i = true;
        bm0Var.p(4);
        if (gk0Var.H != null) {
            gk0Var.R.a(ev0.ON_STOP);
        }
        gk0Var.Q.e(ev0.ON_STOP);
        gk0Var.c = 4;
        gk0Var.F = false;
        gk0Var.B();
        if (!gk0Var.F) {
            throw new android.util.AndroidRuntimeException(ai1.f("Fragment ", gk0Var, " did not call through to super.onStop()"));
        }
        this.f754a.m(false);
    }

    public a(pm pmVar, dn0 dn0Var, java.lang.ClassLoader classLoader, ul0 ul0Var, cn0 cn0Var) {
        this.f754a = pmVar;
        this.b = dn0Var;
        gk0 a2 = ul0Var.a(cn0Var.c);
        this.c = a2;
        android.os.Bundle bundle = cn0Var.l;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        a2.P(bundle);
        a2.h = cn0Var.d;
        a2.p = cn0Var.e;
        a2.r = true;
        a2.y = cn0Var.f;
        a2.z = cn0Var.g;
        a2.A = cn0Var.h;
        a2.D = cn0Var.i;
        a2.o = cn0Var.j;
        a2.C = cn0Var.k;
        a2.B = cn0Var.m;
        a2.P = fv0.values()[cn0Var.n];
        android.os.Bundle bundle2 = cn0Var.o;
        if (bundle2 != null) {
            a2.d = bundle2;
        } else {
            a2.d = new android.os.Bundle();
        }
        if (android.util.Log.isLoggable("FragmentManager", 2)) {
            android.util.Log.v("FragmentManager", "Instantiated fragment " + a2);
        }
    }

    public a(pm pmVar, dn0 dn0Var, gk0 gk0Var, cn0 cn0Var) {
        this.f754a = pmVar;
        this.b = dn0Var;
        this.c = gk0Var;
        gk0Var.e = null;
        gk0Var.f = null;
        gk0Var.t = 0;
        gk0Var.q = false;
        gk0Var.n = false;
        gk0 gk0Var2 = gk0Var.j;
        gk0Var.k = gk0Var2 != null ? gk0Var2.h : null;
        gk0Var.j = null;
        android.os.Bundle bundle = cn0Var.o;
        if (bundle != null) {
            gk0Var.d = bundle;
        } else {
            gk0Var.d = new android.os.Bundle();
        }
    }
}
