package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ea1 extends a.u {
    public final a.fa1 d;
    public final java.util.WeakHashMap e = new java.util.WeakHashMap();

    public ea1(a.fa1 fa1Var) {
        this.d = fa1Var;
    }

    @Override // a.u
    public final boolean a(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        a.u uVar = (a.u) this.e.get(view);
        return uVar != null ? uVar.a(view, accessibilityEvent) : this.f573a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // a.u
    public final a.pe b(android.view.View view) {
        a.u uVar = (a.u) this.e.get(view);
        return uVar != null ? uVar.b(view) : super.b(view);
    }

    @Override // a.u
    public final void c(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        a.u uVar = (a.u) this.e.get(view);
        if (uVar != null) {
            uVar.c(view, accessibilityEvent);
        } else {
            super.c(view, accessibilityEvent);
        }
    }

    @Override // a.u
    public final void d(android.view.View view, a.g0 g0Var) {
        a.fa1 fa1Var = this.d;
        boolean P = fa1Var.d.P();
        android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo = g0Var.f165a;
        android.view.View.AccessibilityDelegate accessibilityDelegate = this.f573a;
        if (!P) {
            androidx.recyclerview.widget.RecyclerView recyclerView = fa1Var.d;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().g0(view, g0Var);
                a.u uVar = (a.u) this.e.get(view);
                if (uVar != null) {
                    uVar.d(view, g0Var);
                    return;
                } else {
                    accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                    return;
                }
            }
        }
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
    }

    @Override // a.u
    public final void e(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        a.u uVar = (a.u) this.e.get(view);
        if (uVar != null) {
            uVar.e(view, accessibilityEvent);
        } else {
            super.e(view, accessibilityEvent);
        }
    }

    @Override // a.u
    public final boolean f(android.view.ViewGroup viewGroup, android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        a.u uVar = (a.u) this.e.get(viewGroup);
        return uVar != null ? uVar.f(viewGroup, view, accessibilityEvent) : this.f573a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // a.u
    public final boolean g(android.view.View view, int i, android.os.Bundle bundle) {
        a.fa1 fa1Var = this.d;
        if (!fa1Var.d.P()) {
            androidx.recyclerview.widget.RecyclerView recyclerView = fa1Var.d;
            if (recyclerView.getLayoutManager() != null) {
                a.u uVar = (a.u) this.e.get(view);
                if (uVar != null) {
                    if (uVar.g(view, i, bundle)) {
                        return true;
                    }
                } else if (super.g(view, i, bundle)) {
                    return true;
                }
                a.t91 t91Var = recyclerView.getLayoutManager().d.e;
                return false;
            }
        }
        return super.g(view, i, bundle);
    }

    @Override // a.u
    public final void h(android.view.View view, int i) {
        a.u uVar = (a.u) this.e.get(view);
        if (uVar != null) {
            uVar.h(view, i);
        } else {
            super.h(view, i);
        }
    }

    @Override // a.u
    public final void i(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        a.u uVar = (a.u) this.e.get(view);
        if (uVar != null) {
            uVar.i(view, accessibilityEvent);
        } else {
            super.i(view, accessibilityEvent);
        }
    }
}
