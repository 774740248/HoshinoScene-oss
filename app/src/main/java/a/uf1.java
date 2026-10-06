package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final /* synthetic */ class uf1 implements android.widget.TextView.OnEditorActionListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f591a;
    public final /* synthetic */ android.view.KeyEvent.Callback b;

    public /* synthetic */ uf1(android.view.KeyEvent.Callback callback, int i) {
        this.f591a = i;
        this.b = callback;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(android.widget.TextView textView, int i, android.view.KeyEvent keyEvent) {
        int i2 = this.f591a;
        android.view.KeyEvent.Callback callback = this.b;
        switch (i2) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                com.omarea.ui.SearchInput searchInput = (com.omarea.ui.SearchInput) callback;
                int i3 = com.omarea.ui.SearchInput.m;
                a.wv.w(searchInput, "this$0");
                searchInput.c();
                com.omarea.ui.SearchInputEditText searchInputEditText = searchInput.l;
                if (searchInputEditText == null) {
                    a.wv.M1("editText");
                    throw null;
                }
                searchInputEditText.clearFocus();
                a.bp0 bp0Var = searchInput.h;
                if (bp0Var != null) {
                    com.omarea.ui.SearchInputEditText searchInputEditText2 = searchInput.l;
                    if (searchInputEditText2 == null) {
                        a.wv.M1("editText");
                        throw null;
                    }
                    bp0Var.i(searchInputEditText2.getText().toString());
                }
                return true;
            case 1:
                com.omarea.vtools.activities.ActivityAppActivities activityAppActivities = (com.omarea.vtools.activities.ActivityAppActivities) callback;
                a.gu0[] gu0VarArr = com.omarea.vtools.activities.ActivityAppActivities.f;
                a.wv.w(activityAppActivities, "this$0");
                if (i == 3 || i == 5 || i == 6) {
                    android.text.Editable text = activityAppActivities.p().getText();
                    a.wv.v(text, "apps_search_box.text");
                    activityAppActivities.q(text);
                }
                return true;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                com.omarea.vtools.activities.ActivityAppComponents activityAppComponents = (com.omarea.vtools.activities.ActivityAppComponents) callback;
                a.gu0[] gu0VarArr2 = com.omarea.vtools.activities.ActivityAppComponents.f;
                a.wv.w(activityAppComponents, "this$0");
                if (i == 3 || i == 5 || i == 6) {
                    android.text.Editable text2 = activityAppComponents.p().getText();
                    a.wv.v(text2, "apps_search_box.text");
                    java.lang.String obj = text2.toString();
                    android.widget.ListAdapter adapter = activityAppComponents.o().getAdapter();
                    a.wv.t(adapter, "null cannot be cast to non-null type com.omarea.ui.contents.AdapterComponents");
                    a.ki kiVar = (a.ki) adapter;
                    a.wv.w(obj, "text");
                    kiVar.f = obj;
                    kiVar.h = kiVar.a(obj, kiVar.d);
                    kiVar.notifyDataSetChanged();
                }
                return true;
            case 3:
                com.omarea.vtools.activities.ActivityAppConfig2 activityAppConfig2 = (com.omarea.vtools.activities.ActivityAppConfig2) callback;
                a.gu0[] gu0VarArr3 = com.omarea.vtools.activities.ActivityAppConfig2.s;
                a.wv.w(activityAppConfig2, "this$0");
                if (i != 3 && i != 6) {
                    return false;
                }
                com.omarea.vtools.activities.ActivityAppConfig2.t(activityAppConfig2);
                return true;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_READ_ERROR /* 4 */:
                com.omarea.vtools.activities.ActivityAppContents activityAppContents = (com.omarea.vtools.activities.ActivityAppContents) callback;
                a.gu0[] gu0VarArr4 = com.omarea.vtools.activities.ActivityAppContents.q;
                a.wv.w(activityAppContents, "this$0");
                if (i == 3 || i == 5 || i == 6) {
                    java.lang.String obj2 = activityAppContents.p().getText().toString();
                    a.wv.w(obj2, "value");
                    if (!a.wv.e(activityAppContents.p, obj2)) {
                        activityAppContents.p = obj2;
                        activityAppContents.r(activityAppContents.o, activityAppContents.o());
                    }
                }
                return true;
            case 5:
                com.omarea.vtools.activities.ActivityAppXposedConfig activityAppXposedConfig = (com.omarea.vtools.activities.ActivityAppXposedConfig) callback;
                a.gu0[] gu0VarArr5 = com.omarea.vtools.activities.ActivityAppXposedConfig.o;
                a.wv.w(activityAppXposedConfig, "this$0");
                if (i != 3 && i != 6) {
                    return false;
                }
                com.omarea.vtools.activities.ActivityAppXposedConfig.q(activityAppXposedConfig);
                return true;
            default:
                com.omarea.vtools.activities.ActivityProcess activityProcess = (com.omarea.vtools.activities.ActivityProcess) callback;
                a.gu0[] gu0VarArr6 = com.omarea.vtools.activities.ActivityProcess.x;
                a.wv.w(activityProcess, "this$0");
                if (i != 3) {
                    return false;
                }
                java.lang.String obj3 = textView.getText().toString();
                activityProcess.o = obj3;
                if (activityProcess.n) {
                    activityProcess.u().i(obj3);
                } else {
                    a.nj njVar = activityProcess.m;
                    if (njVar != null) {
                        a.wv.w(obj3, "keywords");
                        njVar.h = obj3;
                        njVar.s();
                    }
                }
                return true;
        }
    }
}
