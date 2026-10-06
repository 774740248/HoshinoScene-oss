package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class yf1 implements android.text.TextWatcher {
    public final /* synthetic */ int c;
    public final /* synthetic */ java.lang.Object d;

    public /* synthetic */ yf1(int i, java.lang.Object obj) {
        this.c = i;
        this.d = obj;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(android.text.Editable editable) {
        java.lang.String obj;
        java.lang.String obj2;
        java.lang.String obj3;
        int i = this.c;
        java.lang.String str = "";
        java.lang.Object obj4 = this.d;
        switch (i) {
            case 1:
                com.google.android.material.textfield.TextInputLayout textInputLayout = (com.google.android.material.textfield.TextInputLayout) obj4;
                textInputLayout.updateLabelState(!textInputLayout.z0, false);
                if (textInputLayout.m) {
                    textInputLayout.updateCounter(editable);
                }
                if (textInputLayout.hintAnimationEnabled) {
                    textInputLayout.updatePlaceholderText(editable);
                    return;
                }
                return;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                a.bp0 onTextChanged = ((com.omarea.common.ui.InputView) obj4).getOnTextChanged();
                if (onTextChanged != null) {
                    if (editable != null && (obj = editable.toString()) != null) {
                        str = obj;
                    }
                    onTextChanged.i(str);
                    return;
                }
                return;
            case 3:
                a.bp0 bp0Var = (a.bp0) obj4;
                if (editable != null && (obj2 = editable.toString()) != null) {
                    str = obj2;
                }
                bp0Var.i(str);
                return;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_READ_ERROR /* 4 */:
                a.bp0 onKeywordChanged = ((com.omarea.ui.SearchInput) obj4).getOnKeywordChanged();
                if (onKeywordChanged != null) {
                    if (editable != null && (obj3 = editable.toString()) != null) {
                        str = obj3;
                    }
                    onKeywordChanged.i(str);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        com.omarea.ui.BlurViewRecyclerView freeze_apps;
        android.widget.Filter filter;
        java.lang.String str;
        int i4 = this.c;
        java.lang.Object obj = this.d;
        switch (i4) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                androidx.appcompat.widget.SearchView searchView = (androidx.appcompat.widget.SearchView) obj;
                android.text.Editable text = searchView.mSearchSrcTextView.getText();
                searchView.mOldQueryText = text;
                boolean isEmpty = android.text.TextUtils.isEmpty(text);
                searchView.updateSubmitButton(!isEmpty);
                int i5 = 8;
                if (searchView.W && !searchView.P && isEmpty) {
                    searchView.mGoButton.setVisibility(8);
                    i5 = 0;
                }
                searchView.mVoiceButton.setVisibility(i5);
                searchView.updateCloseButton();
                searchView.onTextFocusChanged();
                charSequence.toString();
                searchView.getClass();
                return;
            case 1:
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
            case 3:
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_READ_ERROR /* 4 */:
                return;
            default:
                freeze_apps = ((com.omarea.vtools.activities.ActivityFreezeApps) obj).getFreeze_apps();
                android.widget.Filterable filterable = (android.widget.Filterable) freeze_apps.getAdapter();
                if (filterable == null || (filter = filterable.getFilter()) == null) {
                    return;
                }
                if (charSequence == null || (str = charSequence.toString()) == null) {
                    str = "";
                }
                filter.filter(str);
                return;
        }
    }
}
