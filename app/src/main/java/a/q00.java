package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class q00 extends a.lj1 implements a.fp0 {
    public final /* synthetic */ java.lang.String g;
    public final /* synthetic */ byte[] h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q00(java.lang.String str, byte[] bArr, a.ey eyVar) {
        super(2, eyVar);
        this.g = str;
        this.h = bArr;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.q00(this.g, this.h, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.b20.q1(obj);
        a.rd1 rd1Var = a.q10.g;
        if (rd1Var != null) {
            byte[] bArr = this.h;
            a.wv.v(bArr, "result");
            java.lang.String str = new java.lang.String(bArr, a.bu.f53a);
            java.lang.String str2 = this.g;
            a.wv.w(str2, "taskId");
            a.cp cpVar = com.omarea.Scene.c;
            java.lang.String string = a.fs1.t().getString(2131953077);
            a.wv.v(string, "context.getString(R.string.notice_channel_task)");
            rd1Var.a(string, "#TASK " + str2 + "\n" + str);
        }
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        a.q00 q00Var = (a.q00) a((a.cz) obj, (a.ey) obj2);
        a.no1 no1Var = a.no1.f387a;
        q00Var.e(no1Var);
        return no1Var;
    }
}
