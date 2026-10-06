package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class fu1 extends a.fa0 {
    public final android.view.Window e;
    public final android.view.View f;

    public fu1(android.view.Window window, android.view.View view) {
        super(5, (java.lang.Object) null);
        this.e = window;
        this.f = view;
    }

    @Override // a.fa0
    public final void E(int i) {
        for (int i2 = 1; i2 <= 256; i2 <<= 1) {
            if ((i & i2) != 0) {
                android.view.Window window = this.e;
                if (i2 == 1) {
                    G(4);
                    window.clearFlags(1024);
                } else if (i2 == 2) {
                    G(2);
                } else if (i2 == 8) {
                    android.view.View view = this.f;
                    if (view.isInEditMode() || view.onCheckIsTextEditor()) {
                        view.requestFocus();
                    } else {
                        view = window.getCurrentFocus();
                    }
                    if (view == null) {
                        view = window.findViewById(android.R.id.content);
                    }
                    if (view != null && view.hasWindowFocus()) {
                        view.post(new a.eu1(view, 0));
                    }
                }
            }
        }
    }

    public final void F(int i) {
        android.view.View decorView = this.e.getDecorView();
        decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
    }

    public final void G(int i) {
        android.view.View decorView = this.e.getDecorView();
        decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
    }

    @Override // a.fa0
    public final void v(int i) {
        for (int i2 = 1; i2 <= 256; i2 <<= 1) {
            if ((i & i2) != 0) {
                if (i2 == 1) {
                    F(4);
                } else if (i2 == 2) {
                    F(2);
                } else if (i2 == 8) {
                    android.view.Window window = this.e;
                    ((android.view.inputmethod.InputMethodManager) window.getContext().getSystemService("input_method")).hideSoftInputFromWindow(window.getDecorView().getWindowToken(), 0);
                }
            }
        }
    }
}
