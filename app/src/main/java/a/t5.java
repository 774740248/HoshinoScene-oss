package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class t5 implements android.widget.SeekBar.OnSeekBarChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f549a;
    public final java.lang.Runnable b;
    public final android.content.SharedPreferences c;
    public final android.widget.TextView d;

    public t5(a.r5 r5Var, android.content.SharedPreferences sharedPreferences, android.widget.TextView textView, int i) {
        this.f549a = i;
        if (i != 1) {
            this.b = r5Var;
            this.c = sharedPreferences;
            this.d = textView;
        } else {
            this.b = r5Var;
            this.c = sharedPreferences;
            this.d = textView;
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(android.widget.SeekBar seekBar, int i, boolean z) {
        switch (this.f549a) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                this.d.setText((i * 100) + "mA");
                return;
            default:
                android.widget.TextView textView = this.d;
                java.lang.String string = textView.getContext().getString(2131952019);
                a.wv.v(string, "battery_bp_level_desc.co…string.battery_bp_status)");
                a.ai1.v(new java.lang.Object[]{java.lang.Integer.valueOf(i + 30), java.lang.Integer.valueOf(i + 10)}, 2, string, "format(format, *args)", textView);
                return;
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(android.widget.SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(android.widget.SeekBar seekBar) {
        switch (this.f549a) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.wv.s(seekBar);
                int progress = seekBar.getProgress() * 100;
                if (this.c.getInt("charge_limit_ma", 3000) == progress) {
                    return;
                }
                this.c.edit().putInt("charge_limit_ma", progress).apply();
                this.b.run();
                return;
            default:
                a.wv.s(seekBar);
                int progress2 = seekBar.getProgress() + 30;
                if (this.c.getInt("bp_level", Integer.MIN_VALUE) == progress2) {
                    return;
                }
                this.c.edit().putInt("bp_level", progress2).apply();
                this.b.run();
                return;
        }
    }
}
