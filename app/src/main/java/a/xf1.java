package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class xf1 implements android.text.TextWatcher {
    public final java.lang.Runnable c;
    public final android.os.Handler d = new android.os.Handler(android.os.Looper.getMainLooper());
    public long e;

    public xf1(java.lang.Runnable runnable) {
        this.c = runnable;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(android.text.Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        if (charSequence != null) {
            final long currentTimeMillis = java.lang.System.currentTimeMillis();
            this.e = currentTimeMillis;
            this.d.postDelayed(new a.wf1(), 300L);
        }
    }
}
