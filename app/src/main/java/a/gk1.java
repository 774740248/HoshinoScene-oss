package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class gk1 implements a.mr1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f179a;
    public int b;
    public int c;

    public gk1(com.google.android.material.tabs.TabLayout tabLayout) {
        this.f179a = new java.lang.ref.WeakReference(tabLayout);
    }

    public final void a(float f, int i) {
        com.google.android.material.tabs.TabLayout tabLayout = (com.google.android.material.tabs.TabLayout) this.f179a.get();
        if (tabLayout != null) {
            int i2 = this.INDICATOR_ANIMATION_MODE_FADE;
            tabLayout.setScrollPosition(i, f, i2 != 2 || this.b == 1, (i2 == 2 && this.b == 0) ? false : true, false);
        }
    }

    public final void b(int i) {
        com.google.android.material.tabs.TabLayout tabLayout = (com.google.android.material.tabs.TabLayout) this.f179a.get();
        if (tabLayout == null || tabLayout.getSelectedTabPosition() == i || i >= tabLayout.getTabCount()) {
            return;
        }
        int i2 = this.INDICATOR_ANIMATION_MODE_FADE;
        tabLayout.selectTab(tabLayout.getTabAt(i), i2 == 0 || (i2 == 2 && this.b == 0));
    }
}
