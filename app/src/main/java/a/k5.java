package a;

import android.content.SharedPreferences;
import android.view.View;
import com.omarea.Scene;
import com.omarea.model.AppInfo;
import com.omarea.vtools.activities.ActivityAutoClick;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /tmp/jadx-9051527860862319108.dex */
public final /* synthetic */ class k5 implements View.OnClickListener {

    public k5(ActivityAutoClick p0) {
        this(p0, 0);
    }
    public final /* synthetic */ int c;
    public final /* synthetic */ ActivityAutoClick d;

    public /* synthetic */ k5(ActivityAutoClick activityAutoClick, int i) {
        this.c = i;
        this.d = activityAutoClick;
    }

    /* JADX WARN: Type inference failed for: r4v8, types: [a.gy, java.lang.Object] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.c;
        final ActivityAutoClick activityAutoClick = this.d;
        switch (i) {
            case 0:
                gu0[] gu0VarArr = ActivityAutoClick.m;
                wv.w(activityAutoClick, "this$0");
                b81 b81Var = activityAutoClick.l;
                if (b81Var == null) {
                    wv.M1("processBarDialog");
                    throw null;
                }
                b81.c(b81Var);
                final int i2 = 0;
                new Thread(new Runnable() { // from class: a.l5
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i3 = i2;
                        ActivityAutoClick activityAutoClick2 = activityAutoClick;
                        switch (i3) {
                            case 0:
                                gu0[] gu0VarArr2 = ActivityAutoClick.m;
                                wv.w(activityAutoClick2, "this$0");
                                SharedPreferences sharedPreferences = activityAutoClick2.getContext().getSharedPreferences("AUTO_SKIP_BLACKLIST", 0);
                                List<AppInfo> s2 = qv.s2(new po(activityAutoClick2.getContext(), false).f(), new py(20));
                                ArrayList arrayList = new ArrayList(op.J1(s2, 10));
                                for (AppInfo appInfo : s2) {
                                    appInfo.setSelected(sharedPreferences.getBoolean(appInfo.getPackageName(), false));
                                    arrayList.add(appInfo);
                                }
                                cp cpVar = Scene.c;
                                fs1.L(new ua0(activityAutoClick2, arrayList, sharedPreferences, 15));
                                return;
                            default:
                                gu0[] gu0VarArr3 = ActivityAutoClick.m;
                                wv.w(activityAutoClick2, "this$0");
                                activityAutoClick2.p();
                                return;
                        }
                    }
                }).start();
                return;
            default:
                gu0[] gu0VarArr2 = ActivityAutoClick.m;
                wv.w(activityAutoClick, "this$0");
                final int i3 = 1;
                new Object().T(activityAutoClick, new Runnable() { // from class: a.l5
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i32 = i3;
                        ActivityAutoClick activityAutoClick2 = activityAutoClick;
                        switch (i32) {
                            case 0:
                                gu0[] gu0VarArr22 = ActivityAutoClick.m;
                                wv.w(activityAutoClick2, "this$0");
                                SharedPreferences sharedPreferences = activityAutoClick2.getContext().getSharedPreferences("AUTO_SKIP_BLACKLIST", 0);
                                List<AppInfo> s2 = qv.s2(new po(activityAutoClick2.getContext(), false).f(), new py(20));
                                ArrayList arrayList = new ArrayList(op.J1(s2, 10));
                                for (AppInfo appInfo : s2) {
                                    appInfo.setSelected(sharedPreferences.getBoolean(appInfo.getPackageName(), false));
                                    arrayList.add(appInfo);
                                }
                                cp cpVar = Scene.c;
                                fs1.L(new ua0(activityAutoClick2, arrayList, sharedPreferences, 15));
                                return;
                            default:
                                gu0[] gu0VarArr3 = ActivityAutoClick.m;
                                wv.w(activityAutoClick2, "this$0");
                                activityAutoClick2.p();
                                return;
                        }
                    }
                });
                return;
        }
    }
}
