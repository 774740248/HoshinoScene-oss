package a;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.omarea.vtools.activities.ActivityImg;
import java.util.ArrayList;

/* loaded from: /tmp/jadx-9051527860862319108.dex */
public final /* synthetic */ class wa implements View.OnClickListener {

    public wa(ActivityImg p0) {
        this(p0, 0);
    }
    public final /* synthetic */ int c;
    public final /* synthetic */ ActivityImg d;

    public /* synthetic */ wa(ActivityImg activityImg, int i) {
        this.c = i;
        this.d = activityImg;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [a.ng1, java.lang.Object] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ArrayList<mc1> arrayList;
        int i = this.c;
        ActivityImg activityImg = this.d;
        switch (i) {
            case 0:
                gu0[] gu0VarArr = ActivityImg.l;
                wv.w(activityImg, "this$0");
                activityImg.o(new ya(0, activityImg));
                return;
            case 1:
                gu0[] gu0VarArr2 = ActivityImg.l;
                wv.w(activityImg, "this$0");
                new b81(activityImg, (String) null);
                new Handler(Looper.getMainLooper());
                ArrayList k0 = wv.k0();
                if (k0 != null) {
                    arrayList = new ArrayList();
                    for (Object obj : k0) {
                        mc1 mc1Var = (mc1) obj;
                        if (!wv.e(mc1Var.b, "data") && !wv.e(mc1Var.b, "userdata")) {
                            arrayList.add((mc1) (obj));
                        }
                    }
                } else {
                    arrayList = null;
                }
                if (arrayList == null) {
                    int i2 = x60.f681a;
                    String string = activityImg.getString(2131952166);
                    wv.v(string, "getString(R.string.device_unsupport)");
                    fs1.G(activityImg, string, (Runnable) null);
                    return;
                }
                Context context = activityImg.getContext();
                boolean z = activityImg.getThemeMode().a;
                ArrayList arrayList2 = new ArrayList(op.J1(arrayList, 10));
                for (mc1 mc1Var2 : arrayList) {
                    ng1 obj2 = new ng1();
                    obj2.c = mc1Var2.c;
                    obj2.f381a = mc1Var2.b;
                    arrayList2.add(obj2);
                }
                b70 b70Var = new b70(z, new ArrayList(arrayList2), false, new w1(3, activityImg), 7);
                String string2 = context.getString(2131952526);
                wv.v(string2, "context.getString(R.string.img_choose_partition)");
                b70Var.t0 = string2;
                b70Var.Y();
                b70Var.V(activityImg.getSupportFragmentManager(), "partitions-chooser");
                return;
            default:
                gu0[] gu0VarArr3 = ActivityImg.l;
                wv.w(activityImg, "this$0");
                activityImg.o(new hw(15, activityImg));
                return;
        }
    }
}
