package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class gu1 extends a.fu1 {
    public gu1(android.view.Window window, android.view.View view) {
        super(window, view);
    }

    @Override // a.fa0
    public final void C(boolean z) {
        if (!z) {
            G(8192);
            return;
        }
        android.view.Window window = this.e;
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        F(8192);
    }
}
