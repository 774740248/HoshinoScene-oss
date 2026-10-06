package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class hu1 extends a.gu1 {
    public hu1(android.view.Window window, android.view.View view) {
        super(window, view);
    }

    @Override // a.fa0
    public final void B(boolean z) {
        if (!z) {
            G(16);
            return;
        }
        android.view.Window window = this.e;
        window.clearFlags(134217728);
        window.addFlags(Integer.MIN_VALUE);
        F(16);
    }
}
