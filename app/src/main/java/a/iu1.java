package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class iu1 extends a.fa0 {
    public final android.view.WindowInsetsController e;
    public android.view.Window f;

    public iu1(android.view.WindowInsetsController windowInsetsController) {
        super(5, (java.lang.Object) null);
        this.e = windowInsetsController;
    }

    @Override // a.fa0
    public final void B(boolean z) {
        android.view.Window window = this.f;
        android.view.WindowInsetsController windowInsetsController = this.e;
        if (z) {
            if (window != null) {
                android.view.View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            }
            windowInsetsController.setSystemBarsAppearance(16, 16);
            return;
        }
        if (window != null) {
            android.view.View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
        }
        windowInsetsController.setSystemBarsAppearance(0, 16);
    }

    @Override // a.fa0
    public final void C(boolean z) {
        android.view.Window window = this.f;
        android.view.WindowInsetsController windowInsetsController = this.e;
        if (z) {
            if (window != null) {
                android.view.View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            }
            windowInsetsController.setSystemBarsAppearance(8, 8);
            return;
        }
        if (window != null) {
            android.view.View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
        }
        windowInsetsController.setSystemBarsAppearance(0, 8);
    }

    @Override // a.fa0
    public final void E(int i) {
        android.view.Window window = this.f;
        if (window != null && (i & 8) != 0 && android.os.Build.VERSION.SDK_INT < 33) {
            ((android.view.inputmethod.InputMethodManager) window.getContext().getSystemService("input_method")).isActive();
        }
        this.e.show(i);
    }

    @Override // a.fa0
    public final void v(int i) {
        this.e.hide(i);
    }
}
