package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class ms1 extends android.widget.ImageButton {
    public int c;

    public final void a(int i, boolean z) {
        super.setVisibility(i);
        if (z) {
            this.c = i;
        }
    }

    public final int getUserSetVisibility() {
        return this.c;
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i) {
        a(i, true);
    }
}
