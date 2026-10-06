package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class s31 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a.mm f513a;

    public /* synthetic */ s31(a.mm mmVar) {
        this.f513a = mmVar;
    }

    public void a(a.dw0 dw0Var) {
        a.mm mmVar = this.f513a;
        java.lang.String index = dw0Var.b.getIndex();
        try {
            com.omarea.krscript.model.NodeInfoBase d = a.mm.d(index, (java.util.ArrayList) mmVar.b);
            if (d != null) {
                a.mm.a(mmVar, d, dw0Var);
                return;
            }
            android.util.Log.e("onItemClick", "找不到指定ID的项 index: " + index);
        } catch (java.lang.Exception unused) {
        }
    }
}
