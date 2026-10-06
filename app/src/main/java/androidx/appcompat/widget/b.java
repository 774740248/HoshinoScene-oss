package androidx.appcompat.widget;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class b implements android.view.View.OnKeyListener {
    public final /* synthetic */ androidx.appcompat.widget.SearchView c;

    public b(androidx.appcompat.widget.SearchView searchView) {
        this.c = searchView;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(android.view.View view, int i, android.view.KeyEvent keyEvent) {
        androidx.appcompat.widget.SearchView searchView = this.c;
        if (searchView.mSearchable == null) {
            return false;
        }
        androidx.appcompat.widget.SearchView.SearchAutoComplete searchAutoComplete = searchView.mSearchSrcTextView;
        if (!searchAutoComplete.isPopupShowing() || searchAutoComplete.getListSelection() == -1) {
            if (android.text.TextUtils.getTrimmedLength(searchAutoComplete.getText()) == 0 || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i != 66) {
                return false;
            }
            view.cancelLongPress();
            searchView.getContext().startActivity(searchView.createIntent("android.intent.action.SEARCH", null, null, searchAutoComplete.getText().toString()));
            return true;
        }
        if (searchView.mSearchable == null || searchView.Q == null || keyEvent.getAction() != 0 || !keyEvent.hasNoModifiers()) {
            return false;
        }
        if (i == 66 || i == 84 || i == 61) {
            searchView.p(searchAutoComplete.getListSelection());
        } else {
            if (i != 21 && i != 22) {
                if (i != 19) {
                    return false;
                }
                searchAutoComplete.getListSelection();
                return false;
            }
            searchAutoComplete.setSelection(i == 21 ? 0 : searchAutoComplete.length());
            searchAutoComplete.setListSelection(0);
            searchAutoComplete.clearListSelection();
            searchAutoComplete.a();
        }
        return true;
    }
}
