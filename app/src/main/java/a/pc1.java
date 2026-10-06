package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class pc1 extends android.view.ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    public final float f433a;

    public pc1(float f) {
        this.f433a = f;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(android.view.View view, android.graphics.Outline outline) {
        a.wv.w(view, "view");
        a.wv.w(outline, "outline");
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.f433a);
    }
}
