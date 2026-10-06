package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class lb0 implements android.text.method.TransformationMethod {

    /* renamed from: a, reason: collision with root package name */
    public final android.text.method.TransformationMethod f314a;

    public lb0(android.text.method.TransformationMethod transformationMethod) {
        this.f314a = transformationMethod;
    }

    @Override // android.text.method.TransformationMethod
    public final java.lang.CharSequence getTransformation(java.lang.CharSequence charSequence, android.view.View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        android.text.method.TransformationMethod transformationMethod = this.f314a;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        if (charSequence == null || a.ta0.a().b() != 1) {
            return charSequence;
        }
        a.ta0 a2 = a.ta0.a();
        a2.getClass();
        return a2.f(0, charSequence.length(), charSequence);
    }

    @Override // android.text.method.TransformationMethod
    public final void onFocusChanged(android.view.View view, java.lang.CharSequence charSequence, boolean z, int i, android.graphics.Rect rect) {
        android.text.method.TransformationMethod transformationMethod = this.f314a;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z, i, rect);
        }
    }
}
