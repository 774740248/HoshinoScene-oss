package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class l8 extends a.uu0 implements a.bp0 {
    public final /* synthetic */ a.ab1 d;
    public final /* synthetic */ com.omarea.vtools.activities.ActivityFiles e;
    public final /* synthetic */ boolean f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l8(a.ab1 ab1Var, com.omarea.vtools.activities.ActivityFiles activityFiles, boolean z) {
        super(1);
        this.d = ab1Var;
        this.e = activityFiles;
        this.f = z;
    }

    @Override // a.bp0
    public final java.lang.Object i(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        a.wv.w(str, "value");
        if (str.length() == 0) {
            return java.lang.Boolean.FALSE;
        }
        boolean c = this.d.c(str);
        com.omarea.vtools.activities.ActivityFiles activityFiles = this.e;
        boolean z = false;
        if (c) {
            a.cp cpVar = com.omarea.Scene.c;
            java.lang.String string = activityFiles.getString(2131952422);
            a.wv.v(string, "getString(R.string.fs_invalid_file_name)");
            a.fs1.X(string, 0);
        } else if (str.length() > 256) {
            a.cp cpVar2 = com.omarea.Scene.c;
            java.lang.String string2 = activityFiles.getString(2131952434);
            a.wv.v(string2, "getString(R.string.fs_name_too_long)");
            a.fs1.X(string2, 0);
        } else {
            a.gu0[] gu0VarArr = com.omarea.vtools.activities.ActivityFiles.C;
            a.xj t = activityFiles.t();
            a.wv.s(t);
            java.lang.String r = t.r();
            if (r == null) {
                r = "";
            }
            java.lang.String f = a.ii1.f(r, "/", str);
            if (this.f) {
                a.wv.w(f, "path");
                try {
                    new java.io.File(f).mkdirs();
                } catch (java.lang.Exception unused) {
                    a.q10 q10Var = a.q10.f457a;
                    a.wv.e(a.q10.L("path-create", f, null), "true");
                }
            } else {
                byte[] bArr = new byte[0];
                a.wv.w(f, "path");
                try {
                    a.wv.V1(new java.io.File(f), bArr);
                } catch (java.lang.Exception unused2) {
                    java.lang.String encodeToString = android.util.Base64.encodeToString(bArr, 11);
                    a.q10 q10Var2 = a.q10.f457a;
                    a.wv.e(a.q10.L("write-bytes", a.ii1.f(f, ":", encodeToString), 20000L), "error");
                }
            }
            a.xj t2 = activityFiles.t();
            a.wv.s(t2);
            t2.w();
            z = true;
        }
        return java.lang.Boolean.valueOf(z);
    }
}
