package a;

import android.view.View;
import android.widget.AdapterView;
import com.omarea.model.AppInfo;
import com.omarea.vtools.activities.ActivityAppConfig2;

/* loaded from: /tmp/jadx-9051527860862319108.dex */
public final /* synthetic */ class u3 implements AdapterView.OnItemLongClickListener {

    public u3(ActivityAppConfig2 p0) {
        this(p0, 0);
    }

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14a;
    public final /* synthetic */ ActivityAppConfig2 b;

    public /* synthetic */ u3(ActivityAppConfig2 activityAppConfig2, int i) {
        this.f14a = i;
        this.b = activityAppConfig2;
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public final boolean onItemLongClick(AdapterView adapterView, View view, int i, long j) {
        int i2 = this.f14a;
        ActivityAppConfig2 activityAppConfig2 = this.b;
        switch (i2) {
            case 0:
                gu0[] gu0VarArr = ActivityAppConfig2.s;
                wv.w(activityAppConfig2, "this$0");
                Object item = adapterView.getAdapter().getItem(i);
                wv.t(item, "null cannot be cast to non-null type com.omarea.model.AppInfo");
                AppInfo appInfo = (AppInfo) item;
                String packageName = appInfo.getPackageName();
                String string = activityAppConfig2.s().getString(packageName, "");
                wv.s(string);
                nk.N(new nk(activityAppConfig2, string, new y3(activityAppConfig2, appInfo, adapterView, i, view, packageName)));
                return true;
            default:
                gu0[] gu0VarArr2 = ActivityAppConfig2.s;
                wv.w(activityAppConfig2, "this$0");
                int i3 = x60.f681a;
                String string2 = activityAppConfig2.getString(2131952148);
                wv.v(string2, "getString(R.string.detail_dynamic_required)");
                fs1.G(activityAppConfig2, string2, (Runnable) null);
                return true;
        }
    }
}
