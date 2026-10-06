package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class at0 {
    public static final a.nq1 b = new a.nq1(1);
    public static final a.nq1 c = new a.nq1(2);

    /* renamed from: a, reason: collision with root package name */
    public int f25a;

    public static int b(int i, int i2) {
        int i3;
        int i4 = i & 3158064;
        if (i4 == 0) {
            return i;
        }
        int i5 = i & (~i4);
        if (i2 == 0) {
            i3 = i4 >> 2;
        } else {
            int i6 = i4 >> 1;
            i5 |= (-3158065) & i6;
            i3 = (i6 & 3158064) >> 2;
        }
        return i5 | i3;
    }

    public static int c(int i, int i2) {
        int i3;
        int i4 = i & 789516;
        if (i4 == 0) {
            return i;
        }
        int i5 = i & (~i4);
        if (i2 == 0) {
            i3 = i4 << 2;
        } else {
            int i6 = i4 << 1;
            i5 |= (-789517) & i6;
            i3 = (i6 & 789516) << 2;
        }
        return i5 | i3;
    }

    public static void f(androidx.recyclerview.widget.RecyclerView recyclerView, a.da1 da1Var, float f, float f2, boolean z) {
        android.view.View view = da1Var.f91a;
        if (z && view.getTag(2131362672) == null) {
            java.util.WeakHashMap weakHashMap = a.jq1.f264a;
            java.lang.Float valueOf = java.lang.Float.valueOf(a.xp1.i(view));
            int childCount = recyclerView.getChildCount();
            float f3 = 0.0f;
            for (int i = 0; i < childCount; i++) {
                android.view.View childAt = recyclerView.getChildAt(i);
                if (childAt != view) {
                    java.util.WeakHashMap weakHashMap2 = a.jq1.f264a;
                    float i2 = a.xp1.i(childAt);
                    if (i2 > f3) {
                        f3 = i2;
                    }
                }
            }
            a.xp1.s(view, f3 + 1.0f);
            view.setTag(2131362672, valueOf);
        }
        view.setTranslationX(f);
        view.setTranslationY(f2);
    }

    public abstract void a(androidx.recyclerview.widget.RecyclerView recyclerView, a.da1 da1Var);

    public abstract int d(androidx.recyclerview.widget.RecyclerView recyclerView, a.da1 da1Var);

    public final int e(androidx.recyclerview.widget.RecyclerView recyclerView, int i, int i2, long j) {
        if (this.f25a == -1) {
            this.f25a = recyclerView.getResources().getDimensionPixelSize(2131165346);
        }
        int interpolation = (int) (b.getInterpolation(j <= 2000 ? ((float) j) / 2000.0f : 1.0f) * ((int) (c.getInterpolation(java.lang.Math.min(1.0f, (java.lang.Math.abs(i2) * 1.0f) / i)) * ((int) java.lang.Math.signum(i2)) * this.f25a)));
        return interpolation == 0 ? i2 > 0 ? 1 : -1 : interpolation;
    }
}
