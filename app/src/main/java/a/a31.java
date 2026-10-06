package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class a31 extends androidx.activity.OnBackPressedCallback {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2a;
    public final java.util.concurrent.CopyOnWriteArrayList b = new java.util.concurrent.CopyOnWriteArrayList();
    public a.lx c;

    public a31(boolean z) {
        super(z);
        this.f2a = z;
    }

    public abstract void a();

    @Override // androidx.activity.OnBackPressedCallback
    public void handleOnBackPressed() {
        a();
    }

    public final void b(boolean z) {
        this.f2a = z;
        a.lx lxVar = this.c;
        if (lxVar != null) {
            lxVar.a(java.lang.Boolean.valueOf(z));
        }
    }
}
