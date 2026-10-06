package androidx.activity;
import a.a31;
import a.b31;
import a.d31;
import a.es;
import a.fv0;
import a.fw;
import a.gv0;
import a.lx;
import a.mv0;


/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Runnable f750a;
    public final b31 c;
    public final android.window.OnBackInvokedCallback d;
    public android.window.OnBackInvokedDispatcher e;
    public final java.util.ArrayDeque b = new java.util.ArrayDeque();
    public boolean f = false;

    /* JADX WARN: Type inference failed for: r2v2, types: [b31] */
    public a(java.lang.Runnable runnable) {
        this.f750a = runnable;
        if (es.a()) {
            // [修复] 从 smali 还原：原为 new a.b31(this)，jadx 内联成匿名 lx 导致字段类型不符
            this.c = new b31(this);
            this.d = d31.a(new fw(2, this));
        }
    }

    public final void a(mv0 mv0Var, a31 a31Var) {
        gv0 lifecycle = mv0Var.getLifecycle();
        if (((androidx.lifecycle.a) lifecycle).d == fv0.c) {
            return;
        }
        a31Var.b.add(new androidx.activity.OnBackPressedDispatcher$LifecycleOnBackPressedCancellable(this, lifecycle, a31Var));
        if (es.a()) {
            c();
            a31Var.c = this.c;
        }
    }

    public final void b() {
        java.util.Iterator descendingIterator = this.b.descendingIterator();
        while (descendingIterator.hasNext()) {
            a31 a31Var = (a31) descendingIterator.next();
            if (a31Var.f2a) {
                a31Var.a();
                return;
            }
        }
        java.lang.Runnable runnable = this.f750a;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void c() {
        boolean z;
        java.util.Iterator descendingIterator = this.b.descendingIterator();
        while (true) {
            if (!descendingIterator.hasNext()) {
                z = false;
                break;
            } else if (((a31) descendingIterator.next()).f2a) {
                z = true;
                break;
            }
        }
        android.window.OnBackInvokedDispatcher onBackInvokedDispatcher = this.e;
        if (onBackInvokedDispatcher != null) {
            android.window.OnBackInvokedCallback onBackInvokedCallback = this.d;
            if (z && !this.f) {
                d31.b(onBackInvokedDispatcher, 0, onBackInvokedCallback);
                this.f = true;
            } else {
                if (z || !this.f) {
                    return;
                }
                d31.c(onBackInvokedDispatcher, onBackInvokedCallback);
                this.f = false;
            }
        }
    }
}
