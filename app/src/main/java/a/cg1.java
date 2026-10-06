package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class cg1 implements android.widget.TextView.OnEditorActionListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.widget.SearchView f70a;

    public cg1(androidx.appcompat.widget.SearchView searchView) {
        this.f70a = searchView;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(android.widget.TextView textView, int i, android.view.KeyEvent keyEvent) {
        this.f70a.onSubmitQuery();
        return true;
    }
}
