package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class n41 implements android.widget.SeekBar.OnSeekBarChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f371a;
    public final /* synthetic */ android.widget.TextView b;
    public final /* synthetic */ java.lang.Object c;

    public /* synthetic */ n41(android.widget.TextView textView, java.lang.Object obj, int i) {
        this.f371a = i;
        this.b = textView;
        this.c = obj;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(android.widget.SeekBar seekBar, int i, boolean z) {
        int i2 = this.f371a;
        android.widget.TextView textView = this.b;
        java.lang.Object obj = this.c;
        switch (i2) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                textView.setText(java.lang.String.valueOf(((a.c41) obj).b.getMin() + i));
                return;
            default:
                textView.setText((java.lang.CharSequence) ((a.bp0) obj).i(java.lang.Integer.valueOf(i)));
                return;
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(android.widget.SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(android.widget.SeekBar seekBar) {
    }
}
