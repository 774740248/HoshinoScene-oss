package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class r7 extends a.uu0 implements a.bp0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ com.omarea.vtools.activities.ActivityFastShare e;
    public final /* synthetic */ a.bp0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r7(com.omarea.vtools.activities.ActivityFastShare activityFastShare, a.bp0 bp0Var, int i) {
        super(1);
        this.d = i;
        this.e = activityFastShare;
        this.f = bp0Var;
    }

    public final java.lang.Boolean a(java.lang.String str) {
        int length;
        int length2;
        int i = this.d;
        boolean z = false;
        a.bp0 bp0Var = this.f;
        com.omarea.vtools.activities.ActivityFastShare activityFastShare = this.e;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.wv.w(str, "value");
                java.lang.String obj = a.yi1.F2(str).toString();
                if (obj.length() != 0 && (4 > (length = obj.length()) || length >= 11)) {
                    a.cp cpVar = com.omarea.Scene.c;
                    java.lang.String string = activityFastShare.getString(2131952423);
                    a.wv.v(string, "getString(R.string.fs_key_length_invalid)");
                    a.fs1.X(string, 0);
                } else {
                    a.cp cpVar2 = com.omarea.Scene.c;
                    a.fs1.D().edit().putString("pull_key", obj).apply();
                    a.gu0[] gu0VarArr = com.omarea.vtools.activities.ActivityFastShare.P;
                    activityFastShare.getClass();
                    ((android.widget.TextView) activityFastShare.d.a(com.omarea.vtools.activities.ActivityFastShare.P[0])).setText(obj);
                    if (bp0Var != null) {
                        bp0Var.i(obj);
                    }
                    z = true;
                }
                return java.lang.Boolean.valueOf(z);
            default:
                a.wv.w(str, "value");
                java.lang.String obj2 = a.yi1.F2(str).toString();
                if (obj2.length() != 0 && (4 > (length2 = obj2.length()) || length2 >= 11)) {
                    a.cp cpVar3 = com.omarea.Scene.c;
                    java.lang.String string2 = activityFastShare.getString(2131952423);
                    a.wv.v(string2, "getString(R.string.fs_key_length_invalid)");
                    a.fs1.X(string2, 0);
                } else {
                    a.cp cpVar4 = com.omarea.Scene.c;
                    a.fs1.D().edit().putString("share_key", obj2).apply();
                    a.gu0[] gu0VarArr2 = com.omarea.vtools.activities.ActivityFastShare.P;
                    activityFastShare.getClass();
                    ((android.widget.TextView) activityFastShare.z.a(com.omarea.vtools.activities.ActivityFastShare.P[22])).setText(obj2);
                    if (bp0Var != null) {
                        bp0Var.i(obj2);
                    }
                    z = true;
                }
                return java.lang.Boolean.valueOf(z);
        }
    }

    @Override // a.bp0
    public final /* bridge */ /* synthetic */ java.lang.Object i(java.lang.Object obj) {
        switch (this.d) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                return a((java.lang.String) obj);
            default:
                return a((java.lang.String) obj);
        }
    }
}
