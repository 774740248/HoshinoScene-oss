package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class gz extends a.w21 {
    public final java.lang.String c;
    public final a.vj1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gz(android.content.Context context) {
        super(context, 0);
        a.wv.w(context, "context");
        this.c = "cpuconfig.dat";
        this.d = new a.vj1(a.fz.e);
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [a.ka1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v2, types: [a.ka1, java.lang.Object] */
    public final void k() {
        a.u71 u71Var = new a.u71();
        a.vj1 vj1Var = this.d;
        a.gb0 gb0Var = new a.gb0(((java.lang.Boolean) vj1Var.a()).booleanValue());
        java.lang.String str = a.b11.i;
        com.omarea.model.CpuStatus cpuStatus = (com.omarea.model.CpuStatus) c(str);
        java.lang.String str2 = a.b11.l;
        com.omarea.model.CpuStatus cpuStatus2 = (com.omarea.model.CpuStatus) c(str2);
        java.lang.String str3 = a.b11.j;
        com.omarea.model.CpuStatus cpuStatus3 = (com.omarea.model.CpuStatus) c(str3);
        java.lang.String str4 = a.b11.k;
        com.omarea.model.CpuStatus cpuStatus4 = (com.omarea.model.CpuStatus) c(str4);
        a.lt0 lt0Var = new a.lt0();
        lt0Var.m(new a.lt0(), "alias");
        lt0Var.m(new a.lt0(), "presets");
        a.lt0 lt0Var2 = new a.lt0();
        a.lt0 lt0Var3 = new a.lt0();
        lt0Var3.m(gb0Var.b(cpuStatus), "call");
        lt0Var2.m(lt0Var3, str);
        a.lt0 lt0Var4 = new a.lt0();
        lt0Var4.m(gb0Var.b(cpuStatus2), "call");
        lt0Var2.m(lt0Var4, str2);
        a.lt0 lt0Var5 = new a.lt0();
        lt0Var5.m(gb0Var.b(cpuStatus3), "call");
        lt0Var2.m(lt0Var5, str3);
        a.lt0 lt0Var6 = new a.lt0();
        lt0Var6.m(gb0Var.b(cpuStatus4), "call");
        lt0Var2.m(lt0Var6, str4);
        java.lang.String str5 = a.b11.m;
        a.lt0 lt0Var7 = new a.lt0();
        lt0Var7.m(new a.jt0(), "call");
        lt0Var2.m(lt0Var7, str5);
        lt0Var.m(lt0Var2, "schemes");
        lt0Var.m(a.gb0.d(), "apps");
        if (gb0Var.f175a) {
            a.ka1 obj = new a.ka1();
            obj.c = 2;
            a.ka1 obj2 = new a.ka1();
            int i = 1;
            obj2.c = 1;
            java.lang.String u = a.gy.u();
            if (a.wv.e(u, "pineapple") || a.wv.e(u, "tuna")) {
                obj.c = 3;
            } else if (((java.util.ArrayList) gb0Var.b).size() == 2) {
                obj.c = 1;
                obj2.c = 0;
            }
            a.jt0 jt0Var = new a.jt0();
            a.lt0 lt0Var8 = new a.lt0();
            lt0Var8.m("All", "friendly");
            a.jt0 jt0Var2 = new a.jt0();
            jt0Var2.e("*");
            lt0Var8.m(jt0Var2, "packages");
            a.is isVar = new a.is(cpuStatus, obj, obj2, i);
            a.lt0 lt0Var9 = new a.lt0();
            isVar.i(lt0Var9);
            a.is isVar2 = new a.is(cpuStatus2, obj, obj2, 3);
            a.lt0 lt0Var10 = new a.lt0();
            isVar2.i(lt0Var10);
            a.is isVar3 = new a.is(cpuStatus3, obj, obj2, 5);
            a.lt0 lt0Var11 = new a.lt0();
            isVar3.i(lt0Var11);
            a.is isVar4 = new a.is(cpuStatus4, obj, obj2, 7);
            a.lt0 lt0Var12 = new a.lt0();
            isVar4.i(lt0Var12);
            lt0Var8.m(new a.yt0(lt0Var9, lt0Var10, lt0Var11, lt0Var12), "modes");
            jt0Var.e(lt0Var8);
            lt0Var.m(jt0Var, "games");
        } else {
            lt0Var.m(a.gb0.d(), "games");
        }
        boolean booleanValue = ((java.lang.Boolean) vj1Var.a()).booleanValue();
        u71Var.a();
        java.lang.String str6 = a.pe0.f434a;
        java.lang.String p = lt0Var.p(2);
        a.wv.v(p, "json.toString(2)");
        java.nio.charset.Charset charset = a.bu.f53a;
        byte[] bytes = p.getBytes(charset);
        a.wv.v(bytes, "this as java.lang.String).getBytes(charset)");
        android.app.Application application = u71Var.f581a;
        a.pe0.i(application, "profile.json", bytes);
        a.pe0.h(application, booleanValue ? "custom_fas.json" : "custom.json", "manifest.json");
        byte[] bytes2 = "exit 0".getBytes(charset);
        a.wv.v(bytes2, "this as java.lang.String).getBytes(charset)");
        a.pe0.i(application, "powercfg.sh", bytes2);
        a.u71.c(u71Var);
    }
}
