package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class hz0<S> extends a.t51 {
    public int X;
    public a.ps Y;

    @Override // a.gk0
    public final void r(android.os.Bundle bundle) {
        super.r(bundle);
        if (bundle == null) {
            bundle = this.i;
        }
        this.X = bundle.getInt("THEME_RES_ID_KEY");
        a.ai1.s(bundle.getParcelable("DATE_SELECTOR_KEY"));
        this.Y = (a.ps) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // a.gk0
    public final android.view.View s(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup) {
        layoutInflater.cloneInContext(new android.view.ContextThemeWrapper(f(), this.X));
        throw null;
    }

    @Override // a.gk0
    public final void z(android.os.Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.X);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.Y);
    }
}
