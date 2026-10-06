package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class sw0 extends android.database.DataSetObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f542a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ sw0(int i, java.lang.Object obj) {
        this.f542a = i;
        this.b = obj;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        int i = this.f542a;
        java.lang.Object obj = this.b;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.vw0 vw0Var = (a.vw0) obj;
                if (vw0Var.B.isShowing()) {
                    vw0Var.f();
                    return;
                }
                return;
            case 1:
                a.vz vzVar = (a.vz) obj;
                vzVar.c = true;
                vzVar.notifyDataSetChanged();
                return;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                ((androidx.viewpager.widget.ViewPager) obj).dataSetChanged();
                return;
            case 3:
                ((com.google.android.material.tabs.TabLayout) obj).updateAllTabs();
                return;
            default:
                int i2 = com.omarea.common.ui.AdapterLinearLayout.e;
                ((com.omarea.common.ui.AdapterLinearLayout) obj).a();
                return;
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        int i = this.f542a;
        java.lang.Object obj = this.b;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                ((a.vw0) obj).dismiss();
                return;
            case 1:
                a.vz vzVar = (a.vz) obj;
                vzVar.c = false;
                vzVar.notifyDataSetInvalidated();
                return;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                ((androidx.viewpager.widget.ViewPager) obj).dataSetChanged();
                return;
            case 3:
                ((com.google.android.material.tabs.TabLayout) obj).updateAllTabs();
                return;
            default:
                int i2 = com.omarea.common.ui.AdapterLinearLayout.e;
                ((com.omarea.common.ui.AdapterLinearLayout) obj).a();
                return;
        }
    }
}
