package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class nq1 implements android.view.animation.Interpolator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f389a;

    public nq1(int i) {
        this.f389a = i;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        switch (this.f389a) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                float f2 = f - 1.0f;
                return (f2 * f2 * f2 * f2 * f2) + 1.0f;
            case 1:
                return f * f * f * f * f;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                float f3 = f - 1.0f;
                return (f3 * f3 * f3 * f3 * f3) + 1.0f;
            case 3:
                float f4 = f - 1.0f;
                return (f4 * f4 * f4 * f4 * f4) + 1.0f;
            default:
                float f5 = f - 1.0f;
                return (f5 * f5 * f5 * f5 * f5) + 1.0f;
        }
    }
}
