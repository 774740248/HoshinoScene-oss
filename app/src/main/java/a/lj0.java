package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class lj0 implements android.widget.SeekBar.OnSeekBarChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f321a;
    public final /* synthetic */ a.bp0 b;
    public final /* synthetic */ a.ij0 c;
    public final /* synthetic */ a.bp0 d;

    public lj0(android.widget.TextView textView, a.rj0 rj0Var, a.u41 u41Var, a.rj0 rj0Var2) {
        this.f321a = textView;
        this.b = rj0Var;
        this.c = u41Var;
        this.d = rj0Var2;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(android.widget.SeekBar seekBar, int i, boolean z) {
        android.widget.TextView textView = this.f321a;
        if (textView == null) {
            return;
        }
        textView.setText((java.lang.CharSequence) this.b.i(java.lang.Integer.valueOf(seekBar != null ? seekBar.getProgress() : 0)));
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(android.widget.SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(android.widget.SeekBar seekBar) {
        a.wv.s(seekBar);
        this.c.setValue(this.d.i(java.lang.Integer.valueOf(seekBar.getProgress())));
    }
}
