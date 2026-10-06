package a;

import android.view.View;
import android.widget.Button;

/* loaded from: /tmp/jadx-9051527860862319108.dex */
public final /* synthetic */ class bj implements View.OnLongClickListener {

    public bj(Button p0, int p1) {
        this((ej) p0, p1, 0);
    }

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ej f2a;
    public final /* synthetic */ Button b;

    public /* synthetic */ bj(ej ejVar, Button button, int i) {
        this.f2a = ejVar;
        this.b = button;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        wv.w(this.f2a, "this$0");
        wv.w(this.b, "$this_run");
        return true;
    }
}
