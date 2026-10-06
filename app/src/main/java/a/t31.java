package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
/*
 * The original dex shipped its own copy of androidx.viewpager.widget.PagerAdapter
 * (repackaged as `a.t31`, with methods renamed by R8).  In this recovered source
 * tree the real androidx PagerAdapter is available, and ViewPager#setAdapter
 * requires that concrete type, so we subclass it here and delegate the abstract
 * contract to the recovered obfuscated methods (a/b/c/d) that carry the logic.
 */
public abstract class t31 extends androidx.viewpager.widget.PagerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final android.database.DataSetObservable f547a = new android.database.DataSetObservable();
    public android.database.DataSetObserver b;

    public abstract void a(a.gk0 gk0Var);

    public abstract void b();

    public abstract int c();

    public abstract void d(android.view.ViewGroup viewGroup);

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return c();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void startUpdate(android.view.ViewGroup viewGroup) {
        d(viewGroup);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void notifyDataSetChanged() {
        b();
        f547a.notifyChanged();
        android.database.DataSetObserver dataSetObserver = this.b;
        if (dataSetObserver != null) {
            dataSetObserver.onChanged();
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public boolean isViewFromObject(android.view.View view, java.lang.Object obj) {
        return view == obj;
    }
}
