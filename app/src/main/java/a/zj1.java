package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class zj1 {

    /* renamed from: a, reason: collision with root package name */
    public final com.google.android.material.tabs.TabLayout f738a;
    public final android.app.Activity b;
    public final int c;
    public final java.util.ArrayList d;
    public final java.util.ArrayList e;
    public boolean f;
    public final a.yj1 g;

    public zj1(com.google.android.material.tabs.TabLayout tabLayout, androidx.viewpager.widget.ViewPager viewPager, android.app.Activity activity, a.am0 am0Var, int i) {
        a.wv.w(activity, "activity");
        this.f738a = tabLayout;
        this.b = activity;
        this.c = i;
        this.d = new java.util.ArrayList();
        this.e = new java.util.ArrayList();
        this.g = new a.yj1(this, am0Var);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.addOnTabSelectedListener(new a.jk1(1, this));
    }

    public final void a(java.lang.String str, android.graphics.drawable.Drawable drawable, a.gk0 gk0Var) {
        a.wv.w(gk0Var, "fragment");
        android.view.View inflate = android.view.LayoutInflater.from(this.b).inflate(this.c, (android.view.ViewGroup) null);
        android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(2131361811);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(2131361825);
        this.e.size();
        textView.setText(str);
        if (this.e.size() != 0) {
            inflate.setAlpha(0.3f);
        }
        imageView.setImageDrawable(drawable);
        this.e.add(inflate);
        this.d.add(gk0Var);
        a.yj1 yj1Var = this.g;
        synchronized (yj1Var) {
            try {
                android.database.DataSetObserver dataSetObserver = yj1Var.b;
                if (dataSetObserver != null) {
                    dataSetObserver.onChanged();
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        yj1Var.f547a.notifyChanged();
        this.f = false;
    }
}
