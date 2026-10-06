package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class lg1 implements android.widget.SeekBar.OnSeekBarChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.omarea.common.ui.SeekBar f319a;

    public lg1(com.omarea.common.ui.SeekBar seekBar) {
        this.f319a = seekBar;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(android.widget.SeekBar seekBar, int i, boolean z) {
        if (seekBar != null) {
            seekBar.performHapticFeedback(4);
        }
        int i2 = com.omarea.common.ui.SeekBar.i;
        com.omarea.common.ui.SeekBar seekBar2 = this.f319a;
        seekBar2.a();
        seekBar2.setProgress(i + seekBar2.h);
        android.widget.SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = seekBar2.f;
        if (onSeekBarChangeListener != null) {
            onSeekBarChangeListener.onProgressChanged(seekBar, seekBar2.getProgress(), z);
        }
        a.bp0 bp0Var = seekBar2.g;
        if (bp0Var != null) {
            bp0Var.i(java.lang.Integer.valueOf(seekBar2.getProgress()));
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(android.widget.SeekBar seekBar) {
        android.widget.SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = this.f319a.f;
        if (onSeekBarChangeListener != null) {
            onSeekBarChangeListener.onStartTrackingTouch(seekBar);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(android.widget.SeekBar seekBar) {
        android.widget.SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = this.f319a.f;
        if (onSeekBarChangeListener != null) {
            onSeekBarChangeListener.onStopTrackingTouch(seekBar);
        }
    }
}
