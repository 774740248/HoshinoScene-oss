package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class aq0 implements java.util.Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22a;
    public final /* synthetic */ java.util.List b;
    public final /* synthetic */ int c;

    public /* synthetic */ aq0(java.util.List list, int i, int i2) {
        this.f22a = i2;
        this.b = list;
        this.c = i;
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.f22a;
        int i2 = this.c;
        java.util.List list = this.b;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                java.lang.String str = (java.lang.String) obj;
                java.lang.Integer valueOf = java.lang.Integer.valueOf(list.contains(str) ? list.indexOf(str) : i2);
                java.lang.String str2 = (java.lang.String) obj2;
                if (list.contains(str2)) {
                    i2 = list.indexOf(str2);
                }
                return a.wv.D(valueOf, java.lang.Integer.valueOf(i2));
            default:
                java.lang.String str3 = (java.lang.String) obj;
                java.lang.Integer valueOf2 = java.lang.Integer.valueOf(list.contains(str3) ? list.indexOf(str3) : i2);
                java.lang.String str4 = (java.lang.String) obj2;
                if (list.contains(str4)) {
                    i2 = list.indexOf(str4);
                }
                return a.wv.D(valueOf2, java.lang.Integer.valueOf(i2));
        }
    }
}
