package a;

import android.widget.AutoCompleteTextView;

/* loaded from: /tmp/jadx-9051527860862319108.dex */
public final /* synthetic */ class ba0 implements AutoCompleteTextView.OnDismissListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ca0 f1a;

    @Override // android.widget.AutoCompleteTextView.OnDismissListener
    public final void onDismiss() {
        ca0 ca0Var = this.f1a;
        ca0Var.m = true;
        ca0Var.o = System.currentTimeMillis();
        ca0Var.t(false);
    }
}
