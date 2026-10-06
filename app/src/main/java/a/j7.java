package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class j7 extends a.lj1 implements a.fp0 {
    public int g;
    public final /* synthetic */ a.tg h;
    public final /* synthetic */ com.omarea.vtools.activities.ActivityFastShare i;
    public final /* synthetic */ int j;
    public final /* synthetic */ int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j7(a.tg tgVar, com.omarea.vtools.activities.ActivityFastShare activityFastShare, int i, int i2, a.ey eyVar) {
        super(2, eyVar);
        this.h = tgVar;
        this.i = activityFastShare;
        this.j = i;
        this.k = i2;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.j7(this.h, this.i, this.j, this.k, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.dz dzVar = a.dz.c;
        int i = this.g;
        if (i == 0) {
            a.b20.q1(obj);
            java.lang.String packageName = this.h.getPackageName();
            a.gu0[] gu0VarArr = com.omarea.vtools.activities.ActivityFastShare.P;
            com.omarea.vtools.activities.ActivityFastShare activityFastShare = this.i;
            activityFastShare.getClass();
            a.gu0[] gu0VarArr2 = com.omarea.vtools.activities.ActivityFastShare.P;
            java.lang.String value = ((com.omarea.ui.SelectView) activityFastShare.B.a(gu0VarArr2[24])).getValue();
            if (value == null) {
                value = "direct";
            }
            boolean z = !a.wv.e(value, "lan");
            a.cp cpVar = com.omarea.Scene.c;
            java.lang.String string = a.fs1.D().getString("share_key", "");
            a.wv.s(string);
            java.lang.String str = ((android.widget.Switch) activityFastShare.C.a(gu0VarArr2[25])).isChecked() ? "wpa3" : "wpa2";
            int i2 = this.j;
            int i3 = this.k;
            this.g = 1;
            a.ge0 ge0Var = new a.ge0(packageName, z, 0, i2, i3, string, str, 0);
            a.lt0 lt0Var = new a.lt0();
            ge0Var.i(lt0Var);
            a.q10 q10Var = a.q10.f457a;
            java.lang.String lt0Var2 = lt0Var.toString();
            a.wv.v(lt0Var2, "request.toString()");
            if (a.q10.K(q10Var, "share-start", lt0Var2, null, this, 12) == dzVar) {
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
        return ((a.j7) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
