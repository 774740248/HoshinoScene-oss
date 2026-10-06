package a;

import android.app.Activity;
import androidx.activity.contextaware.OnContextAvailableListener;
/* loaded from: /tmp/jadx-10340276197810293799.dex */
public class kk0 extends androidx.activity.ComponentActivity implements a.k6, a.l6 {
    static final java.lang.String FRAGMENTS_TAG = "android:support:fragments";
    boolean mCreated;
    boolean mResumed;
    final a.wk0 mFragments = new a.wk0(new a.jk0(this));
    final androidx.lifecycle.a mFragmentLifecycleRegistry = new androidx.lifecycle.a((mv0) this);
    boolean mStopped = true;

    public kk0() {
        getSavedStateRegistry().c(FRAGMENTS_TAG, new a.hk0(this));
        addOnContextAvailableListener((OnContextAvailableListener) new a.ik0(this));
    }

    public static boolean g(a.am0 am0Var) {
        boolean z = false;
        for (a.gk0 gk0Var : (Iterable<a.gk0>) am0Var.c.f()) {
            if (gk0Var != null) {
                a.jk0 jk0Var = gk0Var.v;
                if ((jk0Var == null ? null : jk0Var.a0) != null) {
                    z |= g(gk0Var.e());
                }
                a.ko0 ko0Var = gk0Var.R;
                a.fv0 fv0Var = a.fv0.f;
                if (ko0Var != null) {
                    ko0Var.b();
                    if (ko0Var.d.d.compareTo(fv0Var) >= 0) {
                        gk0Var.R.d.g();
                        z = true;
                    }
                }
                if (gk0Var.Q.d.compareTo(fv0Var) >= 0) {
                    gk0Var.Q.g();
                    z = true;
                }
            }
        }
        return z;
    }

    public final android.view.View dispatchFragmentsOnCreateView(android.view.View view, java.lang.String str, android.content.Context context, android.util.AttributeSet attributeSet) {
        return this.mFragments.f666a.Z.f.onCreateView(view, str, context, attributeSet);
    }

    @Override // android.app.Activity
    public void dump(java.lang.String str, java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)));
        printWriter.println(" State:");
        java.lang.String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.mCreated);
        printWriter.print(" mResumed=");
        printWriter.print(this.mResumed);
        printWriter.print(" mStopped=");
        printWriter.print(this.mStopped);
        if (getApplication() != null) {
            a.nk nkVar = new a.nk(getViewModelStore(), a.dx0.e, 0);
            java.lang.String canonicalName = a.dx0.class.getCanonicalName();
            if (canonicalName == null) {
                throw new java.lang.IllegalArgumentException("Local and anonymous classes can not be ViewModels");
            }
            a.fi1 fi1Var = ((a.dx0) nkVar.f(a.dx0.class, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName))).d;
            if (fi1Var.e > 0) {
                printWriter.print(str2);
                printWriter.println("Loaders:");
                if (fi1Var.e > 0) {
                    a.ai1.t(fi1Var.d[0]);
                    printWriter.print(str2);
                    printWriter.print("  #");
                    printWriter.print(fi1Var.c[0]);
                    printWriter.print(": ");
                    throw null;
                }
            }
        }
        this.mFragments.f666a.Z.r(str, fileDescriptor, printWriter, strArr);
    }

    public a.am0 getSupportFragmentManager() {
        return this.mFragments.f666a.Z;
    }

    @java.lang.Deprecated
    public a.cx0 getSupportLoaderManager() {
        return new a.ex0((mv0) this, getViewModelStore());
    }

    public void markFragmentsCreated() {
        do {
        } while (g(getSupportFragmentManager()));
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, android.content.Intent intent) {
        this.mFragments.a();
        super.onActivityResult(i, i2, intent);
    }

    @java.lang.Deprecated
    public void onAttachFragment(a.gk0 gk0Var) {
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        this.mFragments.a();
        super.onConfigurationChanged(configuration);
        this.mFragments.f666a.Z.h(configuration);
    }

    @Override // androidx.activity.ComponentActivity, a.nw, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.mFragmentLifecycleRegistry.e(a.ev0.ON_CREATE);
        a.bm0 bm0Var = this.mFragments.f666a.Z;
        bm0Var.B = false;
        bm0Var.C = false;
        bm0Var.I.i = false;
        bm0Var.p(1);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i, android.view.Menu menu) {
        if (i != 0) {
            super.onCreatePanelMenu(i, menu);
            return true;
        }
        super.onCreatePanelMenu(i, menu);
        a.wk0 wk0Var = this.mFragments;
        getMenuInflater();
        return wk0Var.f666a.Z.j() | true;
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public android.view.View onCreateView(android.view.View view, java.lang.String str, android.content.Context context, android.util.AttributeSet attributeSet) {
        android.view.View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(view, str, context, attributeSet);
        return dispatchFragmentsOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : dispatchFragmentsOnCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.mFragments.f666a.Z.k();
        this.mFragmentLifecycleRegistry.e(a.ev0.ON_DESTROY);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        for (a.gk0 gk0Var : (Iterable<a.gk0>) this.mFragments.f666a.Z.c.f()) {
            if (gk0Var != null) {
                gk0Var.G();
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, android.view.MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            return this.mFragments.f666a.Z.l();
        }
        if (i != 6) {
            return false;
        }
        return this.mFragments.f666a.Z.i();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onMultiWindowModeChanged(boolean z) {
        for (a.gk0 gk0Var : (Iterable<a.gk0>) this.mFragments.f666a.Z.c.f()) {
            if (gk0Var != null) {
                gk0Var.H(z);
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(@android.annotation.SuppressLint({"UnknownNullness"}) android.content.Intent intent) {
        this.mFragments.a();
        super.onNewIntent(intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, android.view.Menu menu) {
        if (i == 0) {
            this.mFragments.f666a.Z.m();
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.mResumed = false;
        this.mFragments.f666a.Z.p(5);
        this.mFragmentLifecycleRegistry.e(a.ev0.ON_PAUSE);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onPictureInPictureModeChanged(boolean z) {
        for (a.gk0 gk0Var : (Iterable<a.gk0>) this.mFragments.f666a.Z.c.f()) {
            if (gk0Var != null) {
                gk0Var.I(z);
            }
        }
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        onResumeFragments();
    }

    @java.lang.Deprecated
    public boolean onPrepareOptionsPanel(android.view.View view, android.view.Menu menu) {
        super.onPreparePanel(0, view, menu);
        return true;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i, android.view.View view, android.view.Menu menu) {
        if (i == 0) {
            return onPrepareOptionsPanel(view, menu) | this.mFragments.f666a.Z.o();
        }
        super.onPreparePanel(i, view, menu);
        return true;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, a.k6
    public void onRequestPermissionsResult(int i, java.lang.String[] strArr, int[] iArr) {
        this.mFragments.a();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        this.mFragments.a();
        super.onResume();
        this.mResumed = true;
        this.mFragments.f666a.Z.u(true);
    }

    public void onResumeFragments() {
        this.mFragmentLifecycleRegistry.e(a.ev0.ON_RESUME);
        a.bm0 bm0Var = this.mFragments.f666a.Z;
        bm0Var.B = false;
        bm0Var.C = false;
        bm0Var.I.i = false;
        bm0Var.p(7);
    }

    @Override // android.app.Activity
    public void onStart() {
        this.mFragments.a();
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            a.bm0 bm0Var = this.mFragments.f666a.Z;
            bm0Var.B = false;
            bm0Var.C = false;
            bm0Var.I.i = false;
            bm0Var.p(4);
        }
        this.mFragments.f666a.Z.u(true);
        this.mFragmentLifecycleRegistry.e(a.ev0.ON_START);
        a.bm0 bm0Var2 = this.mFragments.f666a.Z;
        bm0Var2.B = false;
        bm0Var2.C = false;
        bm0Var2.I.i = false;
        bm0Var2.p(5);
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.mFragments.a();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.mStopped = true;
        markFragmentsCreated();
        a.bm0 bm0Var = this.mFragments.f666a.Z;
        bm0Var.C = true;
        bm0Var.I.i = true;
        bm0Var.p(4);
        this.mFragmentLifecycleRegistry.e(a.ev0.ON_STOP);
    }

    public void setEnterSharedElementCallback(a.ih1 ih1Var) {
        int i = a.n6.b;
        a.i6.c(this, null);
    }

    public void setExitSharedElementCallback(a.ih1 ih1Var) {
        int i = a.n6.b;
        a.i6.d(this, null);
    }

    public void startActivityFromFragment(a.gk0 gk0Var, @android.annotation.SuppressLint({"UnknownNullness"}) android.content.Intent intent, int i) {
        startActivityFromFragment(gk0Var, intent, i, (android.os.Bundle) null);
    }

    @java.lang.Deprecated
    public void startIntentSenderFromFragment(a.gk0 gk0Var, @android.annotation.SuppressLint({"UnknownNullness"}) android.content.IntentSender intentSender, int i, android.content.Intent intent, int i2, int i3, int i4, android.os.Bundle bundle) {
        android.content.Intent intent2 = intent;
        if (i == -1) {
            int i5 = a.n6.b;
            a.h6.c(this, intentSender, i, intent, i2, i3, i4, bundle);
            return;
        }
        if (gk0Var.v == null) {
            throw new java.lang.IllegalStateException(a.ai1.f("Fragment ", gk0Var, " not attached to Activity"));
        }
        if (android.util.Log.isLoggable("FragmentManager", 2)) {
            android.util.Log.v("FragmentManager", "Fragment " + gk0Var + " received the following in startIntentSenderForResult() requestCode: " + i + " IntentSender: " + intentSender + " fillInIntent: " + intent2 + " options: " + bundle);
        }
        a.am0 h = gk0Var.h();
        if (h.x == null) {
            a.jk0 jk0Var = h.q;
            if (i != -1) {
                jk0Var.getClass();
                throw new java.lang.IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
            }
            android.app.Activity activity = jk0Var.W;
            int i6 = a.n6.b;
            a.h6.c(activity, intentSender, i, intent, i2, i3, i4, bundle);
            return;
        }
        if (bundle != null) {
            if (intent2 == null) {
                intent2 = new android.content.Intent();
                intent2.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
            }
            if (android.util.Log.isLoggable("FragmentManager", 2)) {
                android.util.Log.v("FragmentManager", "ActivityOptions " + bundle + " were added to fillInIntent " + intent2 + " for fragment " + gk0Var);
            }
            intent2.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        }
        a.us0 us0Var = new a.us0(intentSender, intent2, i2, i3);
        h.z.addLast(new a.xl0(gk0Var.h, i));
        if (android.util.Log.isLoggable("FragmentManager", 2)) {
            android.util.Log.v("FragmentManager", "Fragment " + gk0Var + "is launching an IntentSender for result ");
        }
        h.x.a(us0Var);
    }

    public void supportFinishAfterTransition() {
        int i = a.n6.b;
        a.i6.a(this);
    }

    public void supportPostponeEnterTransition() {
        int i = a.n6.b;
        a.i6.b(this);
    }

    public void supportStartPostponedEnterTransition() {
        int i = a.n6.b;
        a.i6.e(this);
    }

    @Override // a.l6
    @java.lang.Deprecated
    public final void validateRequestPermissionsRequestCode(int i) {
    }

    public void startActivityFromFragment(a.gk0 gk0Var, @android.annotation.SuppressLint({"UnknownNullness"}) android.content.Intent intent, int i, android.os.Bundle bundle) {
        if (i == -1) {
            int i2 = a.n6.b;
            a.h6.b(this, intent, -1, bundle);
            return;
        }
        if (gk0Var.v != null) {
            a.am0 h = gk0Var.h();
            if (h.w != null) {
                h.z.addLast(new a.xl0(gk0Var.h, i));
                if (intent != null && bundle != null) {
                    intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
                }
                h.w.a(intent);
                return;
            }
            a.jk0 jk0Var = h.q;
            jk0Var.getClass();
            if (i == -1) {
                java.lang.Object obj = a.zx.f748a;
                a.vx.b(jk0Var.X, intent, bundle);
                return;
            }
            throw new java.lang.IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        throw new java.lang.IllegalStateException(a.ai1.f("Fragment ", gk0Var, " not attached to Activity"));
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public android.view.View onCreateView(java.lang.String str, android.content.Context context, android.util.AttributeSet attributeSet) {
        android.view.View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(null, str, context, attributeSet);
        return dispatchFragmentsOnCreateView == null ? super.onCreateView(str, context, attributeSet) : dispatchFragmentsOnCreateView;
    }
}
