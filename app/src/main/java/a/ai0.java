package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ai0 implements android.animation.TypeEvaluator {

    public ai0() {
    }


    /* renamed from: a, reason: collision with root package name */
    public android.animation.FloatEvaluator f12a;

    @Override // android.animation.TypeEvaluator
    public final java.lang.Object evaluate(float f, java.lang.Object obj, java.lang.Object obj2) {
        float floatValue = this.f12a.evaluate(f, (java.lang.Number) obj, (java.lang.Number) obj2).floatValue();
        if (floatValue < 0.1f) {
            floatValue = 0.0f;
        }
        return java.lang.Float.valueOf(floatValue);
    }
}
