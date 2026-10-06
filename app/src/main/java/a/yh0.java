package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class yh0 implements android.animation.TypeEvaluator {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f709a = new float[9];
    public final float[] b = new float[9];
    public final android.graphics.Matrix c = new android.graphics.Matrix();
    public final /* synthetic */ a.di0 d;

    public yh0(a.di0 di0Var) {
        this.d = di0Var;
    }

    @Override // android.animation.TypeEvaluator
    public final java.lang.Object evaluate(float f, java.lang.Object obj, java.lang.Object obj2) {
        this.d.p = f;
        float[] fArr = this.f709a;
        ((android.graphics.Matrix) obj).getValues(fArr);
        float[] fArr2 = this.b;
        ((android.graphics.Matrix) obj2).getValues(fArr2);
        for (int i = 0; i < 9; i++) {
            float f2 = fArr2[i];
            float f3 = fArr[i];
            fArr2[i] = ((f2 - f3) * f) + f3;
        }
        android.graphics.Matrix matrix = this.c;
        matrix.setValues(fArr2);
        return matrix;
    }
}
