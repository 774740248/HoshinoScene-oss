package androidx.appcompat.widget;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class d implements java.lang.Runnable {
    public final /* synthetic */ androidx.appcompat.widget.SearchView.SearchAutoComplete c;

    public d(androidx.appcompat.widget.SearchView.SearchAutoComplete searchAutoComplete) {
        this.c = searchAutoComplete;
    }

    @Override // java.lang.Runnable
    public final void run() {
        androidx.appcompat.widget.SearchView.SearchAutoComplete searchAutoComplete = this.c;
        if (searchAutoComplete.mHasPendingShowSoftInputRequest) {
            ((android.view.inputmethod.InputMethodManager) searchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchAutoComplete, 0);
            searchAutoComplete.mHasPendingShowSoftInputRequest = false;
        }
    }
}
