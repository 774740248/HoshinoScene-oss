package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class wu extends android.view.ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.google.android.material.chip.Chip f675a;

    public wu(com.google.android.material.chip.Chip chip) {
        this.f675a = chip;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(android.view.View view, android.graphics.Outline outline) {
        a.zu zuVar = this.f675a.g;
        if (zuVar != null) {
            zuVar.getOutline(outline);
        } else {
            outline.setAlpha(0.0f);
        }
    }
}
