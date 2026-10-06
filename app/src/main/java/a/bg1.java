package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class bg1 implements android.view.View.OnLayoutChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ bg1(int i, java.lang.Object obj) {
        this.f41a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(android.view.View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = this.f41a;
        java.lang.Object obj = this.b;
        switch (i9) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                androidx.appcompat.widget.SearchView searchView = (androidx.appcompat.widget.SearchView) obj;
                android.view.View view2 = searchView.mDropDownAnchor;
                if (view2.getWidth() > 1) {
                    android.content.res.Resources resources = searchView.getContext().getResources();
                    int paddingLeft = searchView.mSearchPlate.getPaddingLeft();
                    android.graphics.Rect rect = new android.graphics.Rect();
                    boolean a2 = a.zr1.a(searchView);
                    int dimensionPixelSize = searchView.DBG ? resources.getDimensionPixelSize(2131165228) + resources.getDimensionPixelSize(2131165227) : 0;
                    androidx.appcompat.widget.SearchView.SearchAutoComplete searchAutoComplete = searchView.mSearchSrcTextView;
                    searchAutoComplete.getDropDownBackground().getPadding(rect);
                    searchAutoComplete.setDropDownHorizontalOffset(a2 ? -rect.left : paddingLeft - (rect.left + dimensionPixelSize));
                    searchAutoComplete.setDropDownWidth((((view2.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
                    return;
                }
                return;
            default:
                ((com.google.android.material.bottomappbar.BottomAppBar.Behavior) obj).getClass();
                throw null;
        }
    }
}
