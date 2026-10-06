package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class os0 {

    /* renamed from: a, reason: collision with root package name */
    public android.view.WindowInsets f420a;
    public final android.view.View b;
    public int c;
    public int d;
    public final int[] e = new int[2];

    public os0(android.view.View view) {
        this.b = view;
    }

    public final void a(a.du1 du1Var, java.util.List list) {
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            if ((((a.ot1) it.next()).f423a.c() & 8) != 0) {
                this.b.setTranslationY(a.el.c(r3.f423a.b(), this.d, 0));
                return;
            }
        }
    }
}
