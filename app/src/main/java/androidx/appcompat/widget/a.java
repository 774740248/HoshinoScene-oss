package androidx.appcompat.widget;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class a implements android.view.View.OnClickListener {
    public final /* synthetic */ androidx.appcompat.widget.SearchView c;

    public a(androidx.appcompat.widget.SearchView searchView) {
        this.c = searchView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        androidx.appcompat.widget.SearchView searchView = this.c;
        android.widget.ImageView imageView = searchView.mSearchButton;
        androidx.appcompat.widget.SearchView.SearchAutoComplete searchAutoComplete = searchView.mSearchSrcTextView;
        if (view == imageView) {
            searchView.updateViewsVisibility(false);
            searchAutoComplete.requestFocus();
            searchAutoComplete.setImeVisibility(true);
            android.view.View.OnClickListener onClickListener = searchView.mOnSearchClickListener;
            if (onClickListener != null) {
                onClickListener.onClick(searchView);
                return;
            }
            return;
        }
        if (view == searchView.mCloseButton) {
            searchView.updateSearchAutoComplete();
            return;
        }
        if (view == searchView.mGoButton) {
            searchView.onSubmitQuery();
            return;
        }
        if (view != searchView.mVoiceButton) {
            if (view == searchAutoComplete) {
                searchView.updateQueryHint();
                return;
            }
            return;
        }
        android.app.SearchableInfo searchableInfo = searchView.mSearchable;
        if (searchableInfo == null) {
            return;
        }
        try {
            if (!searchableInfo.getVoiceSearchLaunchWebSearch()) {
                if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                    searchView.getContext().startActivity(searchView.createVoiceAppSearchIntent(searchView.mVoiceAppSearchIntent, searchableInfo));
                }
            } else {
                android.content.Intent intent = new android.content.Intent(searchView.mVoiceWebSearchIntent);
                android.content.ComponentName searchActivity = searchableInfo.getSearchActivity();
                intent.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
                searchView.getContext().startActivity(intent);
            }
        } catch (android.content.ActivityNotFoundException unused) {
            android.util.Log.w("SearchView", "Could not find voice search activity");
        }
    }
}
