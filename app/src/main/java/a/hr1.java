package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class hr1 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f214a;
    public int b;
    public int c;
    public int d;

    public hr1(android.view.View view) {
        this.f214a = view;
    }

    public final void a() {
        int i = this.d;
        android.view.View view = this.f214a;
        int top = i - (view.getTop() - this.b);
        java.util.WeakHashMap weakHashMap = a.jq1.f264a;
        view.offsetTopAndBottom(top);
        view.offsetLeftAndRight(0 - (view.getLeft() - this.c));
    }
}
