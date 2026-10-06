package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class lt1 extends android.view.WindowInsetsAnimation$Callback {

    /* renamed from: a, reason: collision with root package name */
    public final a.os0 f330a;
    public java.util.List b;
    public java.util.ArrayList c;
    public final java.util.HashMap d;

    public lt1(a.os0 os0Var) {
        super(0);
        this.d = new java.util.HashMap();
        this.f330a = os0Var;
    }

    public final a.ot1 a(android.view.WindowInsetsAnimation windowInsetsAnimation) {
        a.ot1 ot1Var = (a.ot1) this.d.get(windowInsetsAnimation);
        if (ot1Var == null) {
            ot1Var = new a.ot1(0, null, 0L);
            if (android.os.Build.VERSION.SDK_INT >= 30) {
                ot1Var.f423a = new a.mt1(windowInsetsAnimation);
            }
            this.d.put(windowInsetsAnimation, ot1Var);
        }
        return ot1Var;
    }

    public final void onEnd(android.view.WindowInsetsAnimation windowInsetsAnimation) {
        a.os0 os0Var = this.f330a;
        a(windowInsetsAnimation);
        os0Var.b.setTranslationY(0.0f);
        this.d.remove(windowInsetsAnimation);
    }

    public final void onPrepare(android.view.WindowInsetsAnimation windowInsetsAnimation) {
        a.os0 os0Var = this.f330a;
        a(windowInsetsAnimation);
        android.view.View view = os0Var.b;
        int[] iArr = os0Var.e;
        view.getLocationOnScreen(iArr);
        os0Var.c = iArr[1];
    }

    public final android.view.WindowInsets onProgress(android.view.WindowInsets windowInsets, java.util.List list) {
        float fraction;
        java.util.ArrayList arrayList = this.c;
        if (arrayList == null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList(list.size());
            this.c = arrayList2;
            this.b = java.util.Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            android.view.WindowInsetsAnimation k = a.b0.k(list.get(size));
            a.ot1 a2 = a(k);
            fraction = k.getFraction();
            a2.f423a.d(fraction);
            this.c.add(a2);
        }
        a.os0 os0Var = this.f330a;
        a.du1 h = a.du1.h(null, windowInsets);
        os0Var.a(h, this.b);
        return h.g();
    }

    public final android.view.WindowInsetsAnimation.Bounds onStart(android.view.WindowInsetsAnimation windowInsetsAnimation, android.view.WindowInsetsAnimation.Bounds bounds) {
        android.graphics.Insets lowerBound;
        android.graphics.Insets upperBound;
        a.os0 os0Var = this.f330a;
        a(windowInsetsAnimation);
        lowerBound = bounds.getLowerBound();
        a.ns0 c = a.ns0.c(lowerBound);
        upperBound = bounds.getUpperBound();
        a.ns0 c2 = a.ns0.c(upperBound);
        android.view.View view = os0Var.b;
        int[] iArr = os0Var.e;
        view.getLocationOnScreen(iArr);
        int i = os0Var.c - iArr[1];
        os0Var.d = i;
        view.setTranslationY(i);
        a.b0.m();
        return a.b0.i(c.d(), c2.d());
    }
}
