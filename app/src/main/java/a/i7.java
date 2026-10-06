package a;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.omarea.Scene;
import com.omarea.ui.UMExpandLayout;
import com.omarea.vtools.activities.ActivityFastShare;

/* loaded from: /tmp/jadx-9051527860862319108.dex */
public final /* synthetic */ class i7 implements View.OnClickListener {

    public i7(ActivityFastShare p0) {
        this(p0, 0);
    }
    public final /* synthetic */ int c;
    public final /* synthetic */ ActivityFastShare d;

    public /* synthetic */ i7(ActivityFastShare activityFastShare, int i) {
        this.c = i;
        this.d = activityFastShare;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.c;
        ActivityFastShare activityFastShare = this.d;
        switch (i) {
            case 0:
                gu0[] gu0VarArr = ActivityFastShare.P;
                wv.w(activityFastShare, "this$0");
                UMExpandLayout a2 = activityFastShare.u.a(ActivityFastShare.P[17]);
                if (a2.e) {
                    a2.e = false;
                    a2.a();
                    return;
                } else {
                    a2.e = true;
                    a2.a();
                    return;
                }
            case 1:
                gu0[] gu0VarArr2 = ActivityFastShare.P;
                wv.w(activityFastShare, "this$0");
                activityFastShare.y((bp0) null);
                return;
            case 2:
                gu0[] gu0VarArr3 = ActivityFastShare.P;
                wv.w(activityFastShare, "this$0");
                UMExpandLayout a3 = activityFastShare.f.a(ActivityFastShare.P[2]);
                if (a3.e) {
                    a3.e = false;
                    a3.a();
                    return;
                } else {
                    a3.e = true;
                    a3.a();
                    return;
                }
            case 3:
                gu0[] gu0VarArr4 = ActivityFastShare.P;
                wv.w(activityFastShare, "this$0");
                activityFastShare.z(new l7(activityFastShare, 0), false);
                return;
            case 4:
                gu0[] gu0VarArr5 = ActivityFastShare.P;
                wv.w(activityFastShare, "this$0");
                activityFastShare.z(new l7(activityFastShare, 1), false);
                return;
            case 5:
                gu0[] gu0VarArr6 = ActivityFastShare.P;
                wv.w(activityFastShare, "this$0");
                activityFastShare.c(activityFastShare.getString(2131952460), new w00(4, activityFastShare));
                return;
            case 6:
                gu0[] gu0VarArr7 = ActivityFastShare.P;
                wv.w(activityFastShare, "this$0");
                activityFastShare.y(new l7(activityFastShare, 2));
                return;
            case 7:
                gu0[] gu0VarArr8 = ActivityFastShare.P;
                wv.w(activityFastShare, "this$0");
                activityFastShare.w().setVisibility(8);
                wv.M0(wv.b(z80.b), (xy) null, new n7(activityFastShare, (ey) null), 3);
                return;
            case 8:
                gu0[] gu0VarArr9 = ActivityFastShare.P;
                wv.w(activityFastShare, "this$0");
                cp cpVar = Scene.c;
                String string = activityFastShare.getString(2131952405);
                wv.v(string, "getString(R.string.fs_desktop)");
                fs1.X(string, 0);
                activityFastShare.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://omarea.com/#/platform")));
                return;
            case 9:
                gu0[] gu0VarArr10 = ActivityFastShare.P;
                wv.w(activityFastShare, "this$0");
                if (activityFastShare.x().getVisibility() == 0) {
                    activityFastShare.z((bp0) null, true);
                    return;
                }
                cp cpVar2 = Scene.c;
                String string2 = fs1.D().getString("share_key", "");
                wv.s(string2);
                String string3 = activityFastShare.getString(2131952432, string2);
                wv.v(string3, "getString(R.string.fs_my_key, SpfConfig.SHARE_KEY)");
                fs1.X(string3, 0);
                return;
            default:
                gu0[] gu0VarArr11 = ActivityFastShare.P;
                wv.w(activityFastShare, "this$0");
                activityFastShare.z((bp0) null, true);
                return;
        }
    }
}
