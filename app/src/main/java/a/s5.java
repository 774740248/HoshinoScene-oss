package a;

import android.app.TimePickerDialog;
import android.content.SharedPreferences;
import android.widget.TextView;
import android.widget.TimePicker;
import com.omarea.vtools.activities.ActivityChargeControl;
import java.util.Arrays;

/* loaded from: /tmp/jadx-9051527860862319108.dex */
public final /* synthetic */ class s5 implements TimePickerDialog.OnTimeSetListener {

    public s5() {
        this(null, 0);
    }

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12a;
    public final /* synthetic */ ActivityChargeControl b;

    public /* synthetic */ s5(ActivityChargeControl activityChargeControl, int i) {
        this.f12a = i;
        this.b = activityChargeControl;
    }

    @Override // android.app.TimePickerDialog.OnTimeSetListener
    public final void onTimeSet(TimePicker timePicker, int i, int i2) {
        int i3 = this.f12a;
        ActivityChargeControl activityChargeControl = this.b;
        switch (i3) {
            case 0:
                gu0[] gu0VarArr = ActivityChargeControl.L;
                wv.w(activityChargeControl, "this$0");
                SharedPreferences sharedPreferences = activityChargeControl.H;
                if (sharedPreferences == null) {
                    wv.M1("spf");
                    throw null;
                }
                sharedPreferences.edit().putInt("time_get_up", (i * 60) + i2).apply();
                TextView textView = (TextView) activityChargeControl.i.a(ActivityChargeControl.L[5]);
                String string = activityChargeControl.getString(2131952031);
                wv.v(string, "getString(R.string.battery_night_mode_time)");
                String format = String.format(string, Arrays.copyOf(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, 2));
                wv.v(format, "format(format, *args)");
                textView.setText(format);
                ActivityChargeControl.r();
                return;
            default:
                gu0[] gu0VarArr2 = ActivityChargeControl.L;
                wv.w(activityChargeControl, "this$0");
                SharedPreferences sharedPreferences2 = activityChargeControl.H;
                if (sharedPreferences2 == null) {
                    wv.M1("spf");
                    throw null;
                }
                sharedPreferences2.edit().putInt("time_slepp", (i * 60) + i2).apply();
                TextView textView2 = (TextView) activityChargeControl.k.a(ActivityChargeControl.L[7]);
                String string2 = activityChargeControl.getString(2131952031);
                wv.v(string2, "getString(R.string.battery_night_mode_time)");
                String format2 = String.format(string2, Arrays.copyOf(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, 2));
                wv.v(format2, "format(format, *args)");
                textView2.setText(format2);
                ActivityChargeControl.r();
                return;
        }
    }
}
