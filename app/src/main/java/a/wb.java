package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class wb extends a.lj1 implements a.fp0 {
    public int g;
    public final /* synthetic */ com.omarea.model.MagiskModuleUnofficial h;
    public final /* synthetic */ com.omarea.vtools.activities.ActivityModuleUpload i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wb(com.omarea.model.MagiskModuleUnofficial magiskModuleUnofficial, com.omarea.vtools.activities.ActivityModuleUpload activityModuleUpload, a.ey eyVar) {
        super(2, eyVar);
        this.h = magiskModuleUnofficial;
        this.i = activityModuleUpload;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.wb(this.h, this.i, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.dz dzVar = a.dz.c;
        int i = this.g;
        if (i == 0) {
            a.b20.q1(obj);
            a.qr0 qr0Var = new a.qr0();
            com.omarea.model.MagiskModuleUnofficial magiskModuleUnofficial = this.h;
            a.wv.w(magiskModuleUnofficial, "moduleInfo");
            a.lt0 lt0Var = new a.lt0();
            lt0Var.m(magiskModuleUnofficial.getId(), "id");
            lt0Var.m(magiskModuleUnofficial.getDbId(), "dbId");
            lt0Var.m(magiskModuleUnofficial.getName(), "name");
            try {
                java.lang.String versionCode = magiskModuleUnofficial.getVersionCode();
                a.wv.s(versionCode);
                lt0Var.n("versionCode", java.lang.Integer.parseInt(versionCode));
            } catch (java.lang.Exception unused) {
            }
            lt0Var.m(magiskModuleUnofficial.getVersionName(), "versionName");
            lt0Var.m(magiskModuleUnofficial.getDownloadUrl(), "downloadUrl");
            lt0Var.m(magiskModuleUnofficial.getAuthor(), "author");
            lt0Var.m(magiskModuleUnofficial.getDescription(), "description");
            lt0Var.m(magiskModuleUnofficial.getDetailContent(), "detailContent");
            lt0Var.m(magiskModuleUnofficial.getUid(), "uid");
            a.lt0 h = a.qr0.h(qr0Var, a.tg1.i().concat("/scene-magisk-share"), lt0Var);
            boolean z = false;
            if (h != null && h.b("success")) {
                z = true;
            }
            a.zx0 zx0Var = a.by0.f57a;
            a.vb vbVar = new a.vb(z, this.i, null);
            this.g = 1;
            if (a.wv.S1(zx0Var, vbVar, this) == dzVar) {
                return dzVar;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a.b20.q1(obj);
        }
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        return ((a.wb) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
