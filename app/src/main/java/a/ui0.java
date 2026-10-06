package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ui0 implements a.lx {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f597a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ ui0(int i, java.lang.Object obj) {
        this.f597a = i;
        this.b = obj;
    }

    @Override // a.lx
    public final /* bridge */ /* synthetic */ void a(java.lang.Object obj) {
        switch (this.f597a) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                b((a.vi0) obj);
                return;
            default:
                b((a.vi0) obj);
                return;
        }
    }

    public final void b(a.vi0 vi0Var) {
        switch (this.f597a) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                if (vi0Var == null) {
                    vi0Var = new a.vi0(-3);
                }
                ((a.pm) this.b).C(vi0Var);
                return;
            default:
                synchronized (a.wi0.c) {
                    try {
                        a.rh1 rh1Var = a.wi0.d;
                        java.util.ArrayList arrayList = (java.util.ArrayList) rh1Var.getOrDefault((java.lang.String) this.b, null);
                        if (arrayList == null) {
                            return;
                        }
                        rh1Var.remove((java.lang.String) this.b);
                        for (int i = 0; i < arrayList.size(); i++) {
                            ((a.lx) arrayList.get(i)).a(vi0Var);
                        }
                        return;
                    } finally {
                    }
                }
        }
    }
}
