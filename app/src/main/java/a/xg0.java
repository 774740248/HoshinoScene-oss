package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class xg0 extends a.uu0 implements a.qo0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ a.dh0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xg0(a.dh0 dh0Var, int i) {
        super(0);
        this.d = i;
        this.e = dh0Var;
    }

    public final java.lang.Boolean a() {
        int i = this.d;
        boolean z = true;
        a.dh0 dh0Var = this.e;
        switch (i) {
            case 1:
                a.vj1 vj1Var = a.ql1.f470a;
                return java.lang.Boolean.valueOf(a.ql1.d(dh0Var.f98a));
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
            default:
                android.content.Context context = dh0Var.f98a;
                a.wv.w(context, "context");
                java.lang.Object systemService = context.getSystemService("accessibility");
                a.wv.t(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
                java.util.Iterator<android.accessibilityservice.AccessibilityServiceInfo> it = ((android.view.accessibility.AccessibilityManager) systemService).getEnabledAccessibilityServiceList(-1).iterator();
                while (true) {
                    if (it.hasNext()) {
                        java.lang.String id = it.next().getId();
                        a.wv.v(id, "serviceInfo.id");
                        if (a.yi1.h2(id, "AccessibilitySceneMode", false)) {
                        }
                    } else {
                        z = false;
                    }
                }
                return java.lang.Boolean.valueOf(z);
            case 3:
                a.cp cpVar = com.omarea.Scene.c;
                if (!a.fs1.D().getBoolean("dynamic_control", false) || (!a.fs1.D().getBoolean("daemon_auto", true) && !((java.lang.Boolean) dh0Var.e.a()).booleanValue())) {
                    z = false;
                }
                return java.lang.Boolean.valueOf(z);
        }
    }

    @Override // a.qo0
    public final java.lang.Object b() {
        int i = this.d;
        a.dh0 dh0Var = this.e;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                if (!((java.lang.Boolean) dh0Var.e.a()).booleanValue()) {
                    a.cp cpVar = com.omarea.Scene.c;
                    if (!a.fs1.D().getBoolean("daemon_auto", true)) {
                        a.vj1 vj1Var = a.oq0.c;
                        return a.oq0.b();
                    }
                }
                return a.b11.c.y();
            case 1:
                return a();
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                return java.lang.Float.valueOf(((java.lang.Boolean) dh0Var.l.a()).booleanValue() ? 0.38f : 0.25f);
            case 3:
                return a();
            default:
                return a();
        }
    }
}
