package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ez0 extends a.wm {
    public static final int[][] i = {new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};
    public android.content.res.ColorStateList g;
    public boolean h;

    private android.content.res.ColorStateList getMaterialThemeColorsTintList() {
        if (this.g == null) {
            int a0 = a.wv.a0(this, 2130968797);
            int a02 = a.wv.a0(this, 2130968816);
            int a03 = a.wv.a0(this, 2130968838);
            this.g = new android.content.res.ColorStateList(i, new int[]{a.wv.N0(1.0f, a03, a0), a.wv.N0(0.54f, a03, a02), a.wv.N0(0.38f, a03, a02), a.wv.N0(0.38f, a03, a02)});
        }
        return this.g;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.h && a.pw.a(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.h = z;
        if (z) {
            a.pw.c(this, getMaterialThemeColorsTintList());
        } else {
            a.pw.c(this, null);
        }
    }
}
