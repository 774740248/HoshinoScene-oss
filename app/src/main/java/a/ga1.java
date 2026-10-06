package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ga1 {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.recyclerview.widget.RecyclerView f173a;
    public final int b;
    public final a.qo0 c;
    public final a.fp0 d;
    public final int e;
    public final float f;
    public final float g;
    public boolean h;
    public boolean i;
    public int j;
    public final int[] k;
    public float l;
    public final a.hw m;

    public ga1(androidx.recyclerview.widget.RecyclerView recyclerView, a.n8 n8Var, a.m8 m8Var) {
        a.wv.w(recyclerView, "recyclerView");
        this.f173a = recyclerView;
        this.b = 2131361817;
        this.c = n8Var;
        this.d = m8Var;
        this.e = android.view.ViewConfiguration.get(recyclerView.getContext()).getScaledTouchSlop();
        float f = recyclerView.getResources().getDisplayMetrics().density;
        this.f = 56 * f;
        this.g = 16 * f;
        this.j = -1;
        this.k = new int[2];
        this.m = new a.hw(13, this);
    }

    public final void a(int i) {
        androidx.recyclerview.widget.RecyclerView recyclerView;
        androidx.recyclerview.widget.a layoutManager;
        android.view.View B;
        android.widget.CompoundButton compoundButton;
        if (i == -1 || i == this.j || (layoutManager = (recyclerView = this.f173a).getLayoutManager()) == null || (B = layoutManager.B(i)) == null || (compoundButton = (android.widget.CompoundButton) B.findViewById(this.b)) == null || compoundButton.getVisibility() != 0) {
            return;
        }
        this.j = i;
        boolean isChecked = compoundButton.isChecked();
        boolean z = this.i;
        if (isChecked != z) {
            compoundButton.setChecked(z);
            recyclerView.performHapticFeedback(4);
        }
        this.d.g(java.lang.Integer.valueOf(i), java.lang.Boolean.valueOf(this.i));
    }
}
