package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class x91 {

    public x91() {
    }


    /* renamed from: a, reason: collision with root package name */
    public int f684a;
    public int b;
    public int c;
    public int d;
    public android.view.animation.Interpolator e;
    public boolean f;
    public int g;

    public final void a(androidx.recyclerview.widget.RecyclerView recyclerView) {
        int i = this.d;
        if (i >= 0) {
            this.d = -1;
            recyclerView.R(i);
            this.f = false;
            return;
        }
        if (!this.f) {
            this.g = 0;
            return;
        }
        android.view.animation.Interpolator interpolator = this.e;
        if (interpolator != null && this.c < 1) {
            throw new java.lang.IllegalStateException("If you provide an interpolator, you must set a positive duration");
        }
        int i2 = this.c;
        if (i2 < 1) {
            throw new java.lang.IllegalStateException("Scroll duration must be a positive number");
        }
        recyclerView.g0.c(this.f684a, this.b, i2, interpolator);
        int i3 = this.g + 1;
        this.g = i3;
        if (i3 > 10) {
            android.util.Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
        }
        this.f = false;
    }
}
