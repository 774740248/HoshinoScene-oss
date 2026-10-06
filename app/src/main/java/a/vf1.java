package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class vf1 extends a.uu0 implements a.qo0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ com.omarea.ui.SearchInput e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vf1(com.omarea.ui.SearchInput searchInput, int i) {
        super(0);
        this.d = i;
        this.e = searchInput;
    }

    public final void a() {
        int i = this.d;
        com.omarea.ui.SearchInput searchInput = this.e;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                com.omarea.ui.SearchInputEditText searchInputEditText = searchInput.l;
                if (searchInputEditText == null) {
                    a.wv.M1("editText");
                    throw null;
                }
                searchInputEditText.setVisibility(8);
                searchInput.setBackground(null);
                return;
            default:
                com.omarea.ui.SearchInputEditText searchInputEditText2 = searchInput.l;
                if (searchInputEditText2 == null) {
                    a.wv.M1("editText");
                    throw null;
                }
                searchInputEditText2.requestFocus();
                com.omarea.ui.SearchInputEditText searchInputEditText3 = searchInput.l;
                if (searchInputEditText3 == null) {
                    a.wv.M1("editText");
                    throw null;
                }
                searchInputEditText3.setSelection(searchInputEditText3.getText().length());
                searchInput.d();
                return;
        }
    }

    @Override // a.qo0
    public final java.lang.Object b() {
        boolean z;
        a.no1 no1Var = a.no1.f387a;
        switch (this.d) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a();
                return no1Var;
            case 1:
                a();
                return no1Var;
            default:
                com.omarea.ui.SearchInput searchInput = this.e;
                if (searchInput.i) {
                    searchInput.b();
                    z = true;
                } else {
                    z = false;
                }
                return java.lang.Boolean.valueOf(z);
        }
    }
}
