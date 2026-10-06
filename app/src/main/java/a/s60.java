package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class s60 implements android.view.ViewTreeObserver.OnWindowFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f518a;
    public final /* synthetic */ java.lang.Runnable b;

    public s60(android.widget.EditText editText, a.fw fwVar) {
        this.f518a = editText;
        this.b = fwVar;
    }

    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
    public final void onWindowFocusChanged(boolean z) {
        if (z) {
            android.widget.EditText editText = this.f518a;
            editText.getViewTreeObserver().removeOnWindowFocusChangeListener(this);
            editText.post(this.b);
        }
    }
}
