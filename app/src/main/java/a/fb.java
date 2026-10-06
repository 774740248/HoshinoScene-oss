package a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.provider.Settings;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import com.omarea.vtools.activities.ActivityMain;
import com.omarea.vtools.activities.ActivityOtherSettings;

/* loaded from: /tmp/jadx-9051527860862319108.dex */
public final /* synthetic */ class fb implements View.OnClickListener {

    public fb(ActivityMain p0) {
        this(p0, 0);
    }
    public final /* synthetic */ int c;
    public final /* synthetic */ ActivityMain d;

    public /* synthetic */ fb(ActivityMain activityMain, int i) {
        this.c = i;
        this.d = activityMain;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.c;
        final int i2 = 0;
        final int i3 = 1;
        ActivityMain activityMain = this.d;
        switch (i) {
            case 0:
                gu0[] gu0VarArr = ActivityMain.i;
                wv.w(activityMain, "this$0");
                q10 q10Var = q10.f457a;
                if (!op.K1(new String[]{"adb", "root"}, q10.t())) {
                    Toast.makeText((Context) activityMain, (CharSequence) activityMain.getString(2131953083), 0).show();
                    return;
                }
                if (Settings.canDrawOverlays(activityMain)) {
                    new u70(activityMain, 0).a();
                    return;
                }
                Intent intent = new Intent();
                intent.addFlags(268435456);
                intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent.setData(Uri.fromParts("package", activityMain.getPackageName(), null));
                Toast.makeText(activityMain.getApplicationContext(), activityMain.getString(2131953205), 1).show();
                return;
            case 1:
                gu0[] gu0VarArr2 = ActivityMain.i;
                wv.w(activityMain, "this$0");
                final u70 u70Var = new u70(activityMain, 1);
                View inflate = u70Var.b.getLayoutInflater().inflate(2131558546, (ViewGroup) null);
                int i4 = x60.f681a;
                Activity activity = u70Var.b;
                wv.v(inflate, "view");
                final v60 m = fs1.m(activity, inflate, true);
                inflate.findViewById(2131362985).setOnClickListener(new View.OnClickListener() { // from class: a.h80
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i5 = i2;
                        u70 u70Var2 = u70Var;
                        v60 v60Var = m;
                        switch (i5) {
                            case 0:
                                wv.w(v60Var, "$dialog");
                                wv.w(u70Var2, "this$0");
                                v60Var.a();
                                String string = u70Var2.b.getString(2131952132);
                                wv.v(string, "context.getString(R.string.cmd_power_shutdown)");
                                q10 q10Var2 = q10.f457a;
                                q10.k(2000L, string);
                                return;
                            case 1:
                                wv.w(v60Var, "$dialog");
                                wv.w(u70Var2, "this$0");
                                v60Var.a();
                                String string2 = u70Var2.b.getString(2131952130);
                                wv.v(string2, "context.getString(R.string.cmd_power_reboot)");
                                q10 q10Var3 = q10.f457a;
                                q10.k(2000L, string2);
                                return;
                            case 2:
                                wv.w(v60Var, "$dialog");
                                wv.w(u70Var2, "this$0");
                                v60Var.a();
                                String string3 = u70Var2.b.getString(2131952129);
                                wv.v(string3, "context.getString(R.string.cmd_power_hot_reboot)");
                                q10 q10Var4 = q10.f457a;
                                q10.k(2000L, string3);
                                return;
                            case 3:
                                wv.w(v60Var, "$dialog");
                                wv.w(u70Var2, "this$0");
                                v60Var.a();
                                String string4 = u70Var2.b.getString(2131952131);
                                wv.v(string4, "context.getString(R.string.cmd_power_recovery)");
                                q10 q10Var5 = q10.f457a;
                                q10.k(2000L, string4);
                                return;
                            case 4:
                                wv.w(v60Var, "$dialog");
                                wv.w(u70Var2, "this$0");
                                v60Var.a();
                                String string5 = u70Var2.b.getString(2131952128);
                                wv.v(string5, "context.getString(R.string.cmd_power_fastboot)");
                                q10 q10Var6 = q10.f457a;
                                q10.k(2000L, string5);
                                return;
                            default:
                                wv.w(v60Var, "$dialog");
                                wv.w(u70Var2, "this$0");
                                v60Var.a();
                                String string6 = u70Var2.b.getString(2131952127);
                                wv.v(string6, "context.getString(R.string.cmd_power_emergency)");
                                q10 q10Var7 = q10.f457a;
                                q10.k(2000L, string6);
                                return;
                        }
                    }
                });
                inflate.findViewById(2131362983).setOnClickListener(new View.OnClickListener() { // from class: a.h80
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i5 = i3;
                        u70 u70Var2 = u70Var;
                        v60 v60Var = m;
                        switch (i5) {
                            case 0:
                                wv.w(v60Var, "$dialog");
                                wv.w(u70Var2, "this$0");
                                v60Var.a();
                                String string = u70Var2.b.getString(2131952132);
                                wv.v(string, "context.getString(R.string.cmd_power_shutdown)");
                                q10 q10Var2 = q10.f457a;
                                q10.k(2000L, string);
                                return;
                            case 1:
                                wv.w(v60Var, "$dialog");
                                wv.w(u70Var2, "this$0");
                                v60Var.a();
                                String string2 = u70Var2.b.getString(2131952130);
                                wv.v(string2, "context.getString(R.string.cmd_power_reboot)");
                                q10 q10Var3 = q10.f457a;
                                q10.k(2000L, string2);
                                return;
                            case 2:
                                wv.w(v60Var, "$dialog");
                                wv.w(u70Var2, "this$0");
                                v60Var.a();
                                String string3 = u70Var2.b.getString(2131952129);
                                wv.v(string3, "context.getString(R.string.cmd_power_hot_reboot)");
                                q10 q10Var4 = q10.f457a;
                                q10.k(2000L, string3);
                                return;
                            case 3:
                                wv.w(v60Var, "$dialog");
                                wv.w(u70Var2, "this$0");
                                v60Var.a();
                                String string4 = u70Var2.b.getString(2131952131);
                                wv.v(string4, "context.getString(R.string.cmd_power_recovery)");
                                q10 q10Var5 = q10.f457a;
                                q10.k(2000L, string4);
                                return;
                            case 4:
                                wv.w(v60Var, "$dialog");
                                wv.w(u70Var2, "this$0");
                                v60Var.a();
                                String string5 = u70Var2.b.getString(2131952128);
                                wv.v(string5, "context.getString(R.string.cmd_power_fastboot)");
                                q10 q10Var6 = q10.f457a;
                                q10.k(2000L, string5);
                                return;
                            default:
                                wv.w(v60Var, "$dialog");
                                wv.w(u70Var2, "this$0");
                                v60Var.a();
                                String string6 = u70Var2.b.getString(2131952127);
                                wv.v(string6, "context.getString(R.string.cmd_power_emergency)");
                                q10 q10Var7 = q10.f457a;
                                q10.k(2000L, string6);
                                return;
                        }
                    }
                });
                final int i5 = 2;
                inflate.findViewById(2131362978).setOnClickListener(new View.OnClickListener() { // from class: a.h80
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i52 = i5;
                        u70 u70Var2 = u70Var;
                        v60 v60Var = m;
                        switch (i52) {
                            case 0:
                                wv.w(v60Var, "$dialog");
                                wv.w(u70Var2, "this$0");
                                v60Var.a();
                                String string = u70Var2.b.getString(2131952132);
                                wv.v(string, "context.getString(R.string.cmd_power_shutdown)");
                                q10 q10Var2 = q10.f457a;
                                q10.k(2000L, string);
                                return;
                            case 1:
                                wv.w(v60Var, "$dialog");
                                wv.w(u70Var2, "this$0");
                                v60Var.a();
                                String string2 = u70Var2.b.getString(2131952130);
                                wv.v(string2, "context.getString(R.string.cmd_power_reboot)");
                                q10 q10Var3 = q10.f457a;
                                q10.k(2000L, string2);
                                return;
                            case 2:
                                wv.w(v60Var, "$dialog");
                                wv.w(u70Var2, "this$0");
                                v60Var.a();
                                String string3 = u70Var2.b.getString(2131952129);
                                wv.v(string3, "context.getString(R.string.cmd_power_hot_reboot)");
                                q10 q10Var4 = q10.f457a;
                                q10.k(2000L, string3);
                                return;
                            case 3:
                                wv.w(v60Var, "$dialog");
                                wv.w(u70Var2, "this$0");
                                v60Var.a();
                                String string4 = u70Var2.b.getString(2131952131);
                                wv.v(string4, "context.getString(R.string.cmd_power_recovery)");
                                q10 q10Var5 = q10.f457a;
                                q10.k(2000L, string4);
                                return;
                            case 4:
                                wv.w(v60Var, "$dialog");
                                wv.w(u70Var2, "this$0");
                                v60Var.a();
                                String string5 = u70Var2.b.getString(2131952128);
                                wv.v(string5, "context.getString(R.string.cmd_power_fastboot)");
                                q10 q10Var6 = q10.f457a;
                                q10.k(2000L, string5);
                                return;
                            default:
                                wv.w(v60Var, "$dialog");
                                wv.w(u70Var2, "this$0");
                                v60Var.a();
                                String string6 = u70Var2.b.getString(2131952127);
                                wv.v(string6, "context.getString(R.string.cmd_power_emergency)");
                                q10 q10Var7 = q10.f457a;
                                q10.k(2000L, string6);
                                return;
                        }
                    }
                });
                final int i6 = 3;
                inflate.findViewById(2131362984).setOnClickListener(new View.OnClickListener() { // from class: a.h80
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i52 = i6;
                        u70 u70Var2 = u70Var;
                        v60 v60Var = m;
                        switch (i52) {
                            case 0:
                                wv.w(v60Var, "$dialog");
                                wv.w(u70Var2, "this$0");
                                v60Var.a();
                                String string = u70Var2.b.getString(2131952132);
                                wv.v(string, "context.getString(R.string.cmd_power_shutdown)");
                                q10 q10Var2 = q10.f457a;
                                q10.k(2000L, string);
                                return;
                            case 1:
                                wv.w(v60Var, "$dialog");
                                wv.w(u70Var2, "this$0");
                                v60Var.a();
                                String string2 = u70Var2.b.getString(2131952130);
                                wv.v(string2, "context.getString(R.string.cmd_power_reboot)");
                                q10 q10Var3 = q10.f457a;
                                q10.k(2000L, string2);
                                return;
                            case 2:
                                wv.w(v60Var, "$dialog");
                                wv.w(u70Var2, "this$0");
                                v60Var.a();
                                String string3 = u70Var2.b.getString(2131952129);
                                wv.v(string3, "context.getString(R.string.cmd_power_hot_reboot)");
                                q10 q10Var4 = q10.f457a;
                                q10.k(2000L, string3);
                                return;
                            case 3:
                                wv.w(v60Var, "$dialog");
                                wv.w(u70Var2, "this$0");
                                v60Var.a();
                                String string4 = u70Var2.b.getString(2131952131);
                                wv.v(string4, "context.getString(R.string.cmd_power_recovery)");
                                q10 q10Var5 = q10.f457a;
                                q10.k(2000L, string4);
                                return;
                            case 4:
                                wv.w(v60Var, "$dialog");
                                wv.w(u70Var2, "this$0");
                                v60Var.a();
                                String string5 = u70Var2.b.getString(2131952128);
                                wv.v(string5, "context.getString(R.string.cmd_power_fastboot)");
                                q10 q10Var6 = q10.f457a;
                                q10.k(2000L, string5);
                                return;
                            default:
                                wv.w(v60Var, "$dialog");
                                wv.w(u70Var2, "this$0");
                                v60Var.a();
                                String string6 = u70Var2.b.getString(2131952127);
                                wv.v(string6, "context.getString(R.string.cmd_power_emergency)");
                                q10 q10Var7 = q10.f457a;
                                q10.k(2000L, string6);
                                return;
                        }
                    }
                });
                final int i7 = 4;
                inflate.findViewById(2131362977).setOnClickListener(new View.OnClickListener() { // from class: a.h80
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i52 = i7;
                        u70 u70Var2 = u70Var;
                        v60 v60Var = m;
                        switch (i52) {
                            case 0:
                                wv.w(v60Var, "$dialog");
                                wv.w(u70Var2, "this$0");
                                v60Var.a();
                                String string = u70Var2.b.getString(2131952132);
                                wv.v(string, "context.getString(R.string.cmd_power_shutdown)");
                                q10 q10Var2 = q10.f457a;
                                q10.k(2000L, string);
                                return;
                            case 1:
                                wv.w(v60Var, "$dialog");
                                wv.w(u70Var2, "this$0");
                                v60Var.a();
                                String string2 = u70Var2.b.getString(2131952130);
                                wv.v(string2, "context.getString(R.string.cmd_power_reboot)");
                                q10 q10Var3 = q10.f457a;
                                q10.k(2000L, string2);
                                return;
                            case 2:
                                wv.w(v60Var, "$dialog");
                                wv.w(u70Var2, "this$0");
                                v60Var.a();
                                String string3 = u70Var2.b.getString(2131952129);
                                wv.v(string3, "context.getString(R.string.cmd_power_hot_reboot)");
                                q10 q10Var4 = q10.f457a;
                                q10.k(2000L, string3);
                                return;
                            case 3:
                                wv.w(v60Var, "$dialog");
                                wv.w(u70Var2, "this$0");
                                v60Var.a();
                                String string4 = u70Var2.b.getString(2131952131);
                                wv.v(string4, "context.getString(R.string.cmd_power_recovery)");
                                q10 q10Var5 = q10.f457a;
                                q10.k(2000L, string4);
                                return;
                            case 4:
                                wv.w(v60Var, "$dialog");
                                wv.w(u70Var2, "this$0");
                                v60Var.a();
                                String string5 = u70Var2.b.getString(2131952128);
                                wv.v(string5, "context.getString(R.string.cmd_power_fastboot)");
                                q10 q10Var6 = q10.f457a;
                                q10.k(2000L, string5);
                                return;
                            default:
                                wv.w(v60Var, "$dialog");
                                wv.w(u70Var2, "this$0");
                                v60Var.a();
                                String string6 = u70Var2.b.getString(2131952127);
                                wv.v(string6, "context.getString(R.string.cmd_power_emergency)");
                                q10 q10Var7 = q10.f457a;
                                q10.k(2000L, string6);
                                return;
                        }
                    }
                });
                final int i8 = 5;
                inflate.findViewById(2131362976).setOnClickListener(new View.OnClickListener() { // from class: a.h80
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i52 = i8;
                        u70 u70Var2 = u70Var;
                        v60 v60Var = m;
                        switch (i52) {
                            case 0:
                                wv.w(v60Var, "$dialog");
                                wv.w(u70Var2, "this$0");
                                v60Var.a();
                                String string = u70Var2.b.getString(2131952132);
                                wv.v(string, "context.getString(R.string.cmd_power_shutdown)");
                                q10 q10Var2 = q10.f457a;
                                q10.k(2000L, string);
                                return;
                            case 1:
                                wv.w(v60Var, "$dialog");
                                wv.w(u70Var2, "this$0");
                                v60Var.a();
                                String string2 = u70Var2.b.getString(2131952130);
                                wv.v(string2, "context.getString(R.string.cmd_power_reboot)");
                                q10 q10Var3 = q10.f457a;
                                q10.k(2000L, string2);
                                return;
                            case 2:
                                wv.w(v60Var, "$dialog");
                                wv.w(u70Var2, "this$0");
                                v60Var.a();
                                String string3 = u70Var2.b.getString(2131952129);
                                wv.v(string3, "context.getString(R.string.cmd_power_hot_reboot)");
                                q10 q10Var4 = q10.f457a;
                                q10.k(2000L, string3);
                                return;
                            case 3:
                                wv.w(v60Var, "$dialog");
                                wv.w(u70Var2, "this$0");
                                v60Var.a();
                                String string4 = u70Var2.b.getString(2131952131);
                                wv.v(string4, "context.getString(R.string.cmd_power_recovery)");
                                q10 q10Var5 = q10.f457a;
                                q10.k(2000L, string4);
                                return;
                            case 4:
                                wv.w(v60Var, "$dialog");
                                wv.w(u70Var2, "this$0");
                                v60Var.a();
                                String string5 = u70Var2.b.getString(2131952128);
                                wv.v(string5, "context.getString(R.string.cmd_power_fastboot)");
                                q10 q10Var6 = q10.f457a;
                                q10.k(2000L, string5);
                                return;
                            default:
                                wv.w(v60Var, "$dialog");
                                wv.w(u70Var2, "this$0");
                                v60Var.a();
                                String string6 = u70Var2.b.getString(2131952127);
                                wv.v(string6, "context.getString(R.string.cmd_power_emergency)");
                                q10 q10Var7 = q10.f457a;
                                q10.k(2000L, string6);
                                return;
                        }
                    }
                });
                return;
            default:
                gu0[] gu0VarArr3 = ActivityMain.i;
                wv.w(activityMain, "this$0");
                activityMain.startActivity(new Intent(activityMain.getApplicationContext(), (Class<?>) ActivityOtherSettings.class));
                return;
        }
    }
}
