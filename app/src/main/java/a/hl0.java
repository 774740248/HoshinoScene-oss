package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class hl0 extends a.lj1 implements a.fp0 {
    public int g;
    public final /* synthetic */ a.pl0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hl0(a.pl0 pl0Var, a.ey eyVar) {
        super(2, eyVar);
        this.h = pl0Var;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.hl0(this.h, eyVar);
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [a.fp0, a.lj1] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, a.ma1] */
    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        java.lang.Object S1;
        java.lang.String str;
        a.dz dzVar = a.dz.c;
        int i = this.g;
        if (i == 0) {
            a.b20.q1(obj);
            a.k20 k20Var = a.z80.b;
            a.ma1 lj1Var = (ma1) new a.lj1(2, null);
            this.g = 1;
            S1 = a.wv.S1(k20Var, (fp0) lj1Var, this);
            if (S1 == dzVar) {
                return dzVar;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a.b20.q1(obj);
            S1 = obj;
        }
        final a.tq0 tq0Var = (a.tq0) S1;
        final a.pl0 pl0Var = this.h;
        android.content.Context L = pl0Var.L();
        int i2 = android.os.Build.VERSION.SDK_INT;
        android.content.pm.PackageManager packageManager = L.getPackageManager();
        if (i2 >= 29) {
            try {
                for (android.content.pm.FeatureInfo featureInfo : packageManager.getSystemAvailableFeatures()) {
                    if ("android.hardware.vulkan.version".equals(featureInfo.name)) {
                        int i3 = featureInfo.version;
                        str = "Vulkan " + (i3 >>> 22) + "." + ((i3 >> 12) & 1023) + "." + (i3 & 4095);
                        break;
                    }
                }
            } catch (java.lang.Exception unused) {
            }
        }
        str = packageManager.hasSystemFeature("android.hardware.vulkan.level") ? "Vulkan 1.0" : "";
        final java.lang.String str2 = str;
        final java.lang.Object obj2 = new java.lang.Object();
        a.gu0[] gu0VarArr = a.pl0.W0;
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) pl0Var.q0.a(gu0VarArr[20]);
        a.rq0 rq0Var = new a.fl0();
        android.opengl.GLSurfaceView gLSurfaceView = new android.opengl.GLSurfaceView(frameLayout.getContext());
        gLSurfaceView.setEGLContextClientVersion(2);
        gLSurfaceView.setEGLConfigChooser(8, 8, 8, 8, 0, 0);
        gLSurfaceView.setRenderer(new a.qq0(new a.ej1(gLSurfaceView, frameLayout, gLSurfaceView, rq0Var)));
        frameLayout.addView(gLSurfaceView);
        frameLayout.removeAllViews();
        frameLayout.addView(gLSurfaceView);
        ((android.widget.LinearLayout) pl0Var.n0.a(gu0VarArr[17])).setOnClickListener(new a.d41(this.h, obj2, tq0Var, str2, 9));
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        return ((a.hl0) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
