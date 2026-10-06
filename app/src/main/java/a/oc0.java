package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class oc0 extends a.pe {
    public final /* synthetic */ a.pc0 d;

    public oc0(a.pc0 pc0Var) {
        this.d = pc0Var;
    }

    @Override // a.pe
    public final a.g0 f(int i) {
        return new a.g0(android.view.accessibility.AccessibilityNodeInfo.obtain(this.d.n(i).f165a));
    }

    @Override // a.pe
    public final a.g0 g(int i) {
        a.pc0 pc0Var = this.d;
        int i2 = i == 2 ? pc0Var.k : pc0Var.l;
        if (i2 == Integer.MIN_VALUE) {
            return null;
        }
        return f(i2);
    }

    @Override // a.pe
    public final boolean j(int i, int i2, android.os.Bundle bundle) {
        int i3;
        a.pc0 pc0Var = this.d;
        android.view.View view = pc0Var.i;
        if (i == -1) {
            java.util.WeakHashMap weakHashMap = a.jq1.f264a;
            return a.rp1.j(view, i2, bundle);
        }
        boolean z = true;
        if (i2 == 1) {
            return pc0Var.p(i);
        }
        if (i2 == 2) {
            return pc0Var.j(i);
        }
        boolean z2 = false;
        if (i2 == 64) {
            android.view.accessibility.AccessibilityManager accessibilityManager = pc0Var.h;
            if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled() && (i3 = pc0Var.k) != i) {
                if (i3 != Integer.MIN_VALUE) {
                    pc0Var.k = Integer.MIN_VALUE;
                    pc0Var.i.invalidate();
                    pc0Var.q(i3, 65536);
                }
                pc0Var.k = i;
                view.invalidate();
                pc0Var.q(i, 32768);
            }
            z = false;
        } else {
            if (i2 != 128) {
                a.xu xuVar = (a.xu) pc0Var;
                if (i2 != 16) {
                    return false;
                }
                com.google.android.material.chip.Chip chip = xuVar.q;
                if (i == 0) {
                    return chip.performClick();
                }
                if (i != 1) {
                    return false;
                }
                chip.playSoundEffect(0);
                android.view.View.OnClickListener onClickListener = chip.onCloseIconClickListener;
                if (onClickListener != null) {
                    onClickListener.onClick(chip);
                    z2 = true;
                }
                if (!chip.touchHelperEnabled) {
                    return z2;
                }
                chip.touchHelper.q(1, 1);
                return z2;
            }
            if (pc0Var.k == i) {
                pc0Var.k = Integer.MIN_VALUE;
                view.invalidate();
                pc0Var.q(i, 65536);
            }
            z = false;
        }
        return z;
    }
}
