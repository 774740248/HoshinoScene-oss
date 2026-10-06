package androidx.appcompat.widget;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class c {
    public static void a(android.widget.AutoCompleteTextView autoCompleteTextView) {
        autoCompleteTextView.refreshAutoCompleteResults();
    }

    public static void b(androidx.appcompat.widget.SearchView.SearchAutoComplete searchAutoComplete, int i) {
        searchAutoComplete.setInputMethodMode(i);
    }
}
