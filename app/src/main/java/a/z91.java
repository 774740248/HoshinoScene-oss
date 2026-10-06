package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class z91 {

    public z91() {
    }


    /* renamed from: a, reason: collision with root package name */
    public int f730a;
    public int b;
    public int c;
    public int d;
    public int e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public int l;
    public long m;
    public int n;

    public final void a(int i) {
        if ((this.d & i) != 0) {
            return;
        }
        throw new java.lang.IllegalStateException("Layout state should be one of " + java.lang.Integer.toBinaryString(i) + " but it is " + java.lang.Integer.toBinaryString(this.d));
    }

    public final int b() {
        return this.g ? this.b - this.c : this.e;
    }

    public final java.lang.String toString() {
        return "State{mTargetPosition=" + this.f730a + ", mData=null, mItemCount=" + this.e + ", mIsMeasuring=" + this.i + ", mPreviousLayoutItemCount=" + this.b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.c + ", mStructureChanged=" + this.f + ", mInPreLayout=" + this.g + ", mRunSimpleAnimations=" + this.j + ", mRunPredictiveAnimations=" + this.k + '}';
    }
}
