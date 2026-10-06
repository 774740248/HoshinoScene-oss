package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class ea0 {
    public static android.widget.EdgeEffect a(android.content.Context context, android.util.AttributeSet attributeSet) {
        try {
            return new android.widget.EdgeEffect(context, attributeSet);
        } catch (java.lang.Throwable unused) {
            return new android.widget.EdgeEffect(context);
        }
    }

    public static float b(android.widget.EdgeEffect edgeEffect) {
        try {
            return edgeEffect.getDistance();
        } catch (java.lang.Throwable unused) {
            return 0.0f;
        }
    }

    public static float c(android.widget.EdgeEffect edgeEffect, float f, float f2) {
        try {
            return edgeEffect.onPullDistance(f, f2);
        } catch (java.lang.Throwable unused) {
            edgeEffect.onPull(f, f2);
            return 0.0f;
        }
    }
}
