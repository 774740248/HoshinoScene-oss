package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class mn0 implements java.lang.Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ java.util.ArrayList d;
    public final /* synthetic */ java.util.ArrayList e;
    public final /* synthetic */ java.util.ArrayList f;
    public final /* synthetic */ java.util.ArrayList g;

    public mn0(int i, java.util.ArrayList arrayList, java.util.ArrayList arrayList2, java.util.ArrayList arrayList3, java.util.ArrayList arrayList4) {
        this.c = i;
        this.d = arrayList;
        this.e = arrayList2;
        this.f = arrayList3;
        this.g = arrayList4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (int i = 0; i < this.c; i++) {
            android.view.View view = (android.view.View) this.d.get(i);
            java.lang.String str = (java.lang.String) this.e.get(i);
            java.util.WeakHashMap weakHashMap = a.jq1.f264a;
            a.xp1.v(view, str);
            a.xp1.v((android.view.View) this.f.get(i), (java.lang.String) this.g.get(i));
        }
    }
}
