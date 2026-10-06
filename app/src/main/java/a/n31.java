package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class n31 {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.recyclerview.widget.a f369a;
    public int b = Integer.MIN_VALUE;
    public final android.graphics.Rect c = new android.graphics.Rect();

    public n31(androidx.recyclerview.widget.a aVar) {
        this.f369a = aVar;
    }

    public static a.m31 a(androidx.recyclerview.widget.a aVar) {
        return new a.m31(aVar, 0);
    }

    public static a.m31 b(androidx.recyclerview.widget.a aVar, int i) {
        if (i == 0) {
            return a(aVar);
        }
        if (i == 1) {
            return c(aVar);
        }
        throw new java.lang.IllegalArgumentException("invalid orientation");
    }

    public static a.m31 c(androidx.recyclerview.widget.a aVar) {
        return new a.m31(aVar, 1);
    }

    public abstract int d(android.view.View view);

    public abstract int e(android.view.View view);

    public abstract int f(android.view.View view);

    public abstract int g();

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public final int k() {
        if (Integer.MIN_VALUE == this.b) {
            return 0;
        }
        return j() - this.b;
    }

    public abstract int l(android.view.View view);

    public abstract int m(android.view.View view);

    public abstract void n(int i);
}
