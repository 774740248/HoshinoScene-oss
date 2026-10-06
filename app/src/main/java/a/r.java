package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class r extends android.text.style.ClickableSpan {

    /* renamed from: a, reason: collision with root package name */
    public final int f483a;
    public final a.g0 b;
    public final int c;

    public r(int i, a.g0 g0Var, int i2) {
        this.f483a = i;
        this.b = g0Var;
        this.c = i2;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(android.view.View view) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f483a);
        this.b.f165a.performAction(this.c, bundle);
    }
}
