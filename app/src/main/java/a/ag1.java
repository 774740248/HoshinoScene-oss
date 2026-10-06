package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ag1 implements android.view.View.OnFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.widget.SearchView f10a;

    public ag1(androidx.appcompat.widget.SearchView searchView) {
        this.f10a = searchView;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(android.view.View view, boolean z) {
        androidx.appcompat.widget.SearchView searchView = this.f10a;
        android.view.View.OnFocusChangeListener onFocusChangeListener = searchView.mOnQueryTextFocusChangeListener;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(searchView, z);
        }
    }
}
