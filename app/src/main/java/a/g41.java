package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class g41 implements android.widget.SeekBar.OnSeekBarChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.widget.SeekBar f169a;
    public final /* synthetic */ android.widget.SeekBar b;
    public final /* synthetic */ android.widget.SeekBar c;
    public final /* synthetic */ android.widget.SeekBar d;
    public final /* synthetic */ android.widget.Button e;

    public g41(android.widget.SeekBar seekBar, android.widget.SeekBar seekBar2, android.widget.SeekBar seekBar3, android.widget.SeekBar seekBar4, android.widget.Button button) {
        this.f169a = seekBar;
        this.b = seekBar2;
        this.c = seekBar3;
        this.d = seekBar4;
        this.e = button;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(android.widget.SeekBar seekBar, int i, boolean z) {
        a.wv.w(seekBar, "seekBar");
        this.e.setBackgroundColor(android.graphics.Color.argb(this.f169a.getProgress(), this.b.getProgress(), this.c.getProgress(), this.d.getProgress()));
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(android.widget.SeekBar seekBar) {
        a.wv.w(seekBar, "seekBar");
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(android.widget.SeekBar seekBar) {
        a.wv.w(seekBar, "seekBar");
    }
}
