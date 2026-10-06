package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class ow extends android.app.Dialog implements a.mv0, a.f31 {

    public ow() {
        this(null, 0);
    }
    public androidx.lifecycle.a c;
    public final androidx.activity.a d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ow(android.content.Context context, int i) {
        super(context, i);
        a.wv.w(context, "context");
        this.d = new androidx.activity.a(new a.fw(1, this));
    }

    public static void a(a.ow owVar) {
        a.wv.w(owVar, "this$0");
        super.onBackPressed();
    }

    public final androidx.lifecycle.a b() {
        androidx.lifecycle.a aVar = this.c;
        if (aVar != null) {
            return aVar;
        }
        androidx.lifecycle.a aVar2 = new androidx.lifecycle.a(this);
        this.c = aVar2;
        return aVar2;
    }

    @Override // a.mv0
    public final a.gv0 getLifecycle() {
        return b();
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.d.b();
    }

    @Override // android.app.Dialog
    public void onCreate(android.os.Bundle bundle) {
        android.window.OnBackInvokedDispatcher onBackInvokedDispatcher;
        super.onCreate(bundle);
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            androidx.activity.a aVar = this.d;
            aVar.e = onBackInvokedDispatcher;
            aVar.c();
        }
        b().e(a.ev0.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        b().e(a.ev0.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        b().e(a.ev0.ON_DESTROY);
        this.c = null;
        super.onStop();
    }
}
