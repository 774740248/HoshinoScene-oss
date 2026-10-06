package a;

import android.view.View;
import android.app.Activity;
/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class gk0 implements android.content.ComponentCallbacks, android.view.View.OnCreateContextMenuListener, a.mv0, a.fr1, a.er0, a.kd1 {
    public static final java.lang.Object V = new java.lang.Object();
    public java.lang.String A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean F;
    public android.view.ViewGroup G;
    public android.view.View H;
    public boolean I;
    public a.ek0 K;
    public boolean L;
    public float M;
    public android.view.LayoutInflater N;
    public boolean O;
    public androidx.lifecycle.a Q;
    public a.ko0 R;
    public a.jd1 T;
    public final java.util.ArrayList U;
    public android.os.Bundle d;
    public android.util.SparseArray e;
    public android.os.Bundle f;
    public java.lang.Boolean g;
    public android.os.Bundle i;
    public a.gk0 j;
    public int l;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public int t;
    public a.am0 u;
    public a.jk0 v;
    public a.gk0 x;
    public int y;
    public int z;
    public int c = -1;
    public java.lang.String h = java.util.UUID.randomUUID().toString();
    public java.lang.String k = null;
    public java.lang.Boolean m = null;
    public a.bm0 w = new a.bm0();
    public boolean E = true;
    public boolean J = true;
    public a.fv0 P = a.fv0.g;
    public final androidx.lifecycle.b S = new androidx.lifecycle.b();

    /* JADX WARN: Type inference failed for: r0v4, types: [a.bm0, a.am0] */
    public gk0() {
        new java.util.concurrent.atomic.AtomicInteger();
        this.U = new java.util.ArrayList();
        this.Q = new androidx.lifecycle.a(this);
        this.T = new a.jd1(this);
    }

    public void A() {
        this.F = true;
    }

    public void B() {
        this.F = true;
    }

    public void C(android.view.View view, android.os.Bundle bundle) {
    }

    public void D(android.os.Bundle bundle) {
        this.F = true;
    }

    public void E(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        this.w.H();
        this.s = true;
        this.R = new a.ko0(getViewModelStore());
        android.view.View s = s(layoutInflater, viewGroup);
        this.H = s;
        if (s == null) {
            if (this.R.d != null) {
                throw new java.lang.IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.R = null;
            return;
        }
        this.R.b();
        android.view.View view = this.H;
        a.ko0 ko0Var = this.R;
        a.wv.w(view, "<this>");
        view.setTag(2131363356, ko0Var);
        android.view.View view2 = this.H;
        a.ko0 ko0Var2 = this.R;
        a.wv.w(view2, "<this>");
        view2.setTag(2131363359, ko0Var2);
        android.view.View view3 = this.H;
        a.ko0 ko0Var3 = this.R;
        a.wv.w(view3, "<this>");
        view3.setTag(2131363358, ko0Var3);
        this.S.e(this.R);
    }

    public final void F() {
        this.w.p(1);
        if (this.H != null) {
            a.ko0 ko0Var = this.R;
            ko0Var.b();
            if (ko0Var.d.d.compareTo(a.fv0.e) >= 0) {
                this.R.a(a.ev0.ON_DESTROY);
            }
        }
        this.c = 1;
        this.F = false;
        u();
        if (!this.F) {
            throw new android.util.AndroidRuntimeException(a.ai1.f("Fragment ", this, " did not call through to super.onDestroyView()"));
        }
        a.nk nkVar = new a.nk(getViewModelStore(), a.dx0.e, 0);
        java.lang.String canonicalName = a.dx0.class.getCanonicalName();
        if (canonicalName == null) {
            throw new java.lang.IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        a.fi1 fi1Var = ((a.dx0) nkVar.f(a.dx0.class, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName))).d;
        if (fi1Var.e <= 0) {
            this.s = false;
        } else {
            a.ai1.t(fi1Var.d[0]);
            throw null;
        }
    }

    public final void G() {
        onLowMemory();
        for (a.gk0 gk0Var : (Iterable<a.gk0>) this.w.c.f()) {
            if (gk0Var != null) {
                gk0Var.G();
            }
        }
    }

    public final void H(boolean z) {
        for (a.gk0 gk0Var : (Iterable<a.gk0>) this.w.c.f()) {
            if (gk0Var != null) {
                gk0Var.H(z);
            }
        }
    }

    public final void I(boolean z) {
        for (a.gk0 gk0Var : (Iterable<a.gk0>) this.w.c.f()) {
            if (gk0Var != null) {
                gk0Var.I(z);
            }
        }
    }

    public final boolean J() {
        if (this.B) {
            return false;
        }
        return this.w.o();
    }

    public final a.kk0 K() {
        a.kk0 d = d();
        if (d != null) {
            return d;
        }
        throw new java.lang.IllegalStateException(a.ai1.f("Fragment ", this, " not attached to an activity."));
    }

    public final android.content.Context L() {
        android.content.Context f = f();
        if (f != null) {
            return f;
        }
        throw new java.lang.IllegalStateException(a.ai1.f("Fragment ", this, " not attached to a context."));
    }

    public final android.view.View M() {
        android.view.View view = this.H;
        if (view != null) {
            return view;
        }
        throw new java.lang.IllegalStateException(a.ai1.f("Fragment ", this, " did not return a View from onCreateView() or this was called before onCreateView()."));
    }

    public final void N(android.os.Bundle bundle) {
        android.os.Parcelable parcelable;
        if (bundle == null || (parcelable = bundle.getParcelable("android:support:fragments")) == null) {
            return;
        }
        this.w.M(parcelable);
        a.bm0 bm0Var = this.w;
        bm0Var.B = false;
        bm0Var.C = false;
        bm0Var.I.i = false;
        bm0Var.p(1);
    }

    public final void O(int i, int i2, int i3, int i4) {
        if (this.K == null && i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return;
        }
        c().d = i;
        c().e = i2;
        c().f = i3;
        c().g = i4;
    }

    public final void P(android.os.Bundle bundle) {
        a.am0 am0Var = this.u;
        if (am0Var != null && (am0Var.B || am0Var.C)) {
            throw new java.lang.IllegalStateException("Fragment already added and state has been saved");
        }
        this.i = bundle;
    }

    public final void Q(boolean z) {
        a.am0 am0Var;
        boolean z2 = false;
        if (!this.J && z && this.c < 5 && (am0Var = this.u) != null && this.v != null && this.n && this.O) {
            androidx.fragment.app.a f = am0Var.f(this);
            a.gk0 gk0Var = f.c;
            if (gk0Var.I) {
                if (am0Var.b) {
                    am0Var.E = true;
                } else {
                    gk0Var.I = false;
                    f.k();
                }
            }
        }
        this.J = z;
        if (this.c < 5 && !z) {
            z2 = true;
        }
        this.I = z2;
        if (this.d != null) {
            this.g = java.lang.Boolean.valueOf(z);
        }
    }

    public final void R(android.content.Intent intent) {
        a.jk0 jk0Var = this.v;
        if (jk0Var == null) {
            throw new java.lang.IllegalStateException(a.ai1.f("Fragment ", this, " not attached to Activity"));
        }
        java.lang.Object obj = a.zx.f748a;
        a.vx.b(jk0Var.X, intent, null);
    }

    public a.wv a() {
        return new a.dk0(this);
    }

    public final void b(java.lang.String str, java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr) {
        java.lang.String str2;
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(java.lang.Integer.toHexString(this.y));
        printWriter.print(" mContainerId=#");
        printWriter.print(java.lang.Integer.toHexString(this.z));
        printWriter.print(" mTag=");
        printWriter.println(this.A);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.c);
        printWriter.print(" mWho=");
        printWriter.print(this.h);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.t);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.n);
        printWriter.print(" mRemoving=");
        printWriter.print(this.o);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.p);
        printWriter.print(" mInLayout=");
        printWriter.println(this.q);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.B);
        printWriter.print(" mDetached=");
        printWriter.print(this.C);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.E);
        printWriter.print(" mHasMenu=");
        printWriter.println(false);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.D);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.J);
        if (this.u != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.u);
        }
        if (this.v != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.v);
        }
        if (this.x != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.x);
        }
        if (this.i != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.i);
        }
        if (this.d != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.d);
        }
        if (this.e != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.e);
        }
        if (this.f != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.f);
        }
        a.gk0 gk0Var = this.j;
        if (gk0Var == null) {
            a.am0 am0Var = this.u;
            gk0Var = (am0Var == null || (str2 = this.k) == null) ? null : am0Var.c.b(str2);
        }
        if (gk0Var != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(gk0Var);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.l);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        a.ek0 ek0Var = this.K;
        printWriter.println(ek0Var == null ? false : ek0Var.c);
        a.ek0 ek0Var2 = this.K;
        if (ek0Var2 != null && ek0Var2.d != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            a.ek0 ek0Var3 = this.K;
            printWriter.println(ek0Var3 == null ? 0 : ek0Var3.d);
        }
        a.ek0 ek0Var4 = this.K;
        if (ek0Var4 != null && ek0Var4.e != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            a.ek0 ek0Var5 = this.K;
            printWriter.println(ek0Var5 == null ? 0 : ek0Var5.e);
        }
        a.ek0 ek0Var6 = this.K;
        if (ek0Var6 != null && ek0Var6.f != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            a.ek0 ek0Var7 = this.K;
            printWriter.println(ek0Var7 == null ? 0 : ek0Var7.f);
        }
        a.ek0 ek0Var8 = this.K;
        if (ek0Var8 != null && ek0Var8.g != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            a.ek0 ek0Var9 = this.K;
            printWriter.println(ek0Var9 == null ? 0 : ek0Var9.g);
        }
        if (this.G != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.G);
        }
        if (this.H != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.H);
        }
        a.ek0 ek0Var10 = this.K;
        if ((ek0Var10 == null ? null : ek0Var10.f125a) != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            a.ek0 ek0Var11 = this.K;
            printWriter.println(ek0Var11 == null ? null : ek0Var11.f125a);
        }
        if (f() != null) {
            a.nk nkVar = new a.nk(getViewModelStore(), a.dx0.e, 0);
            java.lang.String canonicalName = a.dx0.class.getCanonicalName();
            if (canonicalName == null) {
                throw new java.lang.IllegalArgumentException("Local and anonymous classes can not be ViewModels");
            }
            a.fi1 fi1Var = ((a.dx0) nkVar.f(a.dx0.class, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName))).d;
            if (fi1Var.e > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                if (fi1Var.e > 0) {
                    a.ai1.t(fi1Var.d[0]);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(fi1Var.c[0]);
                    printWriter.print(": ");
                    throw null;
                }
            }
        }
        printWriter.print(str);
        printWriter.println("Child " + this.w + ":");
        this.w.r(a.ii1.e(str, "  "), fileDescriptor, printWriter, strArr);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [a.ek0, java.lang.Object] */
    public final a.ek0 c() {
        if (this.K == null) {
            a.ek0 obj = new a.ek0();
            java.lang.Object obj2 = V;
            obj.k = obj2;
            obj.l = obj2;
            obj.m = obj2;
            obj.n = 1.0f;
            obj.o = null;
            this.K = obj;
        }
        return this.K;
    }

    public final a.kk0 d() {
        a.jk0 jk0Var = this.v;
        if (jk0Var == null) {
            return null;
        }
        return (a.kk0) jk0Var.W;
    }

    public final a.am0 e() {
        if (this.v != null) {
            return this.w;
        }
        throw new java.lang.IllegalStateException(a.ai1.f("Fragment ", this, " has not been attached yet."));
    }

    public final boolean equals(java.lang.Object obj) {
        return super.equals(obj);
    }

    public final android.content.Context f() {
        a.jk0 jk0Var = this.v;
        if (jk0Var == null) {
            return null;
        }
        return jk0Var.X;
    }

    public final int g() {
        a.fv0 fv0Var = this.P;
        return (fv0Var == a.fv0.d || this.x == null) ? fv0Var.ordinal() : java.lang.Math.min(fv0Var.ordinal(), this.x.g());
    }

    @Override // a.mv0
    public final a.gv0 getLifecycle() {
        return this.Q;
    }

    @Override // a.kd1
    public final a.id1 getSavedStateRegistry() {
        return this.T.b;
    }

    @Override // a.fr1
    public final a.er1 getViewModelStore() {
        if (this.u == null) {
            throw new java.lang.IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (g() == 1) {
            throw new java.lang.IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        java.util.HashMap hashMap = this.u.I.f;
        a.er1 er1Var = (a.er1) hashMap.get(this.h);
        if (er1Var != null) {
            return er1Var;
        }
        a.er1 er1Var2 = new a.er1();
        hashMap.put(this.h, er1Var2);
        return er1Var2;
    }

    public final a.am0 h() {
        a.am0 am0Var = this.u;
        if (am0Var != null) {
            return am0Var;
        }
        throw new java.lang.IllegalStateException(a.ai1.f("Fragment ", this, " not associated with a fragment manager."));
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public final java.lang.Object i() {
        java.lang.Object obj;
        a.ek0 ek0Var = this.K;
        if (ek0Var == null || (obj = ek0Var.l) == V) {
            return null;
        }
        return obj;
    }

    public final android.content.res.Resources j() {
        return L().getResources();
    }

    public final java.lang.Object k() {
        java.lang.Object obj;
        a.ek0 ek0Var = this.K;
        if (ek0Var == null || (obj = ek0Var.k) == V) {
            return null;
        }
        return obj;
    }

    public final java.lang.Object l() {
        java.lang.Object obj;
        a.ek0 ek0Var = this.K;
        if (ek0Var == null || (obj = ek0Var.m) == V) {
            return null;
        }
        return obj;
    }

    public final java.lang.String m(int i) {
        return j().getString(i);
    }

    public final boolean n() {
        a.gk0 gk0Var = this.x;
        return gk0Var != null && (gk0Var.o || gk0Var.n());
    }

    public void o() {
        this.F = true;
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        this.F = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        K().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.F = true;
    }

    public final void p(int i, int i2, android.content.Intent intent) {
        if (android.util.Log.isLoggable("FragmentManager", 2)) {
            android.util.Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i + " resultCode: " + i2 + " data: " + intent);
        }
    }

    public void q(android.content.Context context) {
        this.F = true;
        a.jk0 jk0Var = this.v;
        if ((jk0Var == null ? null : jk0Var.W) != null) {
            this.F = true;
        }
    }

    public void r(android.os.Bundle bundle) {
        this.F = true;
        N(bundle);
        a.bm0 bm0Var = this.w;
        if (bm0Var.p >= 1) {
            return;
        }
        bm0Var.B = false;
        bm0Var.C = false;
        bm0Var.I.i = false;
        bm0Var.p(1);
    }

    public android.view.View s(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup) {
        return null;
    }

    public void t() {
        this.F = true;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.h);
        if (this.y != 0) {
            sb.append(" id=0x");
            sb.append(java.lang.Integer.toHexString(this.y));
        }
        if (this.A != null) {
            sb.append(" tag=");
            sb.append(this.A);
        }
        sb.append(")");
        return sb.toString();
    }

    public void u() {
        this.F = true;
    }

    public void v() {
        this.F = true;
    }

    public android.view.LayoutInflater w(android.os.Bundle bundle) {
        a.jk0 jk0Var = this.v;
        if (jk0Var == null) {
            throw new java.lang.IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        a.kk0 kk0Var = jk0Var.a0;
        android.view.LayoutInflater cloneInContext = kk0Var.getLayoutInflater().cloneInContext(kk0Var);
        cloneInContext.setFactory2(this.w.f);
        return cloneInContext;
    }

    public void x() {
        this.F = true;
    }

    public void y() {
        this.F = true;
    }

    public void z(android.os.Bundle bundle) {
    }
}
