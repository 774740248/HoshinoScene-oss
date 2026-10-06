package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final /* synthetic */ class w00 extends a.pp0 implements a.bp0 {
    public final /* synthetic */ int k;

    /* [修复] 从 smali 还原：super 只能调用一次，按 i 选择目标类/方法/签名 */
    public w00(int i, java.lang.Object obj) {
        super(1, obj,
            switch (i) {
                case 1 -> com.omarea.common.ui.SeekBar.class;
                case 2, 3, 4 -> com.omarea.vtools.activities.ActivityFastShare.class;
                case 5 -> com.omarea.vtools.activities.ActivityFiles.class;
                default -> a.q10.class;
            },
            switch (i) {
                case 1 -> "defaultFormatter";
                case 2, 3 -> "onAppSelected";
                case 4 -> "onFolderSelected";
                case 5 -> "open";
                default -> "onPipeOutput";
            },
            switch (i) {
                case 1 -> "defaultFormatter(I)Ljava/lang/String;";
                case 2, 3 -> "onAppSelected(Lcom/omarea/common/ui/AdapterAppChooser$AppInfo;)V";
                case 4 -> "onFolderSelected(Ljava/lang/String;)V";
                case 5 -> "open(Lcom/omarea/common/net/RootFileInfo;)V";
                default -> "onPipeOutput(Ljava/lang/String;)V";
            });
        this.k = i;
    }

    @Override // a.bp0
    public final java.lang.Object i(java.lang.Object obj) {
        a.no1 no1Var = a.no1.f387a;
        int i = this.k;
        com.omarea.vtools.activities.ActivityFastShare obj2 = (com.omarea.vtools.activities.ActivityFastShare) this.d;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                j((java.lang.String) obj);
                return no1Var;
            case 1:
                int intValue = ((java.lang.Number) obj).intValue();
                int i2 = com.omarea.common.ui.SeekBar.i;
                ((com.omarea.common.ui.SeekBar) obj2).getClass();
                return java.lang.String.valueOf(intValue);
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                a.tg tgVar = (a.tg) obj;
                switch (i) {
                    case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                        a.wv.w(tgVar, "p0");
                        com.omarea.vtools.activities.ActivityFastShare.o((com.omarea.vtools.activities.ActivityFastShare) obj2, tgVar);
                        return no1Var;
                    default:
                        a.wv.w(tgVar, "p0");
                        com.omarea.vtools.activities.ActivityFastShare.o((com.omarea.vtools.activities.ActivityFastShare) obj2, tgVar);
                        return no1Var;
                }
            case 3:
                a.tg tgVar2 = (a.tg) obj;
                switch (i) {
                    case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                        a.wv.w(tgVar2, "p0");
                        com.omarea.vtools.activities.ActivityFastShare.o((com.omarea.vtools.activities.ActivityFastShare) obj2, tgVar2);
                        return no1Var;
                    default:
                        a.wv.w(tgVar2, "p0");
                        com.omarea.vtools.activities.ActivityFastShare.o((com.omarea.vtools.activities.ActivityFastShare) obj2, tgVar2);
                        return no1Var;
                }
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_READ_ERROR /* 4 */:
                j((java.lang.String) obj);
                return no1Var;
            default:
                a.mc1 mc1Var = (a.mc1) obj;
                a.wv.w(mc1Var, "p0");
                a.gu0[] gu0VarArr = com.omarea.vtools.activities.ActivityFiles.C;
                a.xj t = ((com.omarea.vtools.activities.ActivityFiles) obj2).t();
                if (t != null) {
                    t.v(mc1Var);
                }
                return no1Var;
        }
    }

    public final void j(java.lang.String str) {
        java.lang.Integer c2;
        java.lang.Integer c22;
        int i = this.k;
        java.lang.Object obj = this.d;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.wv.w(str, "p0");
                a.q10 q10Var = a.q10.f457a;
                ((a.q10) obj).getClass();
                int m2 = a.yi1.m2(str, ":", 0, false, 6);
                java.lang.String substring = str.substring(0, m2);
                a.wv.v(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                java.lang.String substring2 = str.substring(m2 + 1);
                a.wv.v(substring2, "this as java.lang.String).substring(startIndex)");
                byte[] decode = android.util.Base64.decode(substring2, 11);
                a.wv.v(decode, "decode(content, Base64.N…DDING or Base64.URL_SAFE)");
                a.q10.w(substring, new java.lang.String(decode, a.bu.f53a));
                return;
            default:
                a.wv.w(str, "p0");
                com.omarea.vtools.activities.ActivityFastShare activityFastShare = (com.omarea.vtools.activities.ActivityFastShare) obj;
                a.gu0[] gu0VarArr = com.omarea.vtools.activities.ActivityFastShare.P;
                activityFastShare.D();
                activityFastShare.A(true);
                a.gu0[] gu0VarArr2 = com.omarea.vtools.activities.ActivityFastShare.P;
                java.lang.String value = ((com.omarea.ui.SelectView) activityFastShare.w.a(gu0VarArr2[19])).getValue();
                int intValue = (value == null || (c22 = a.wi1.c2(value)) == null) ? 5 : c22.intValue();
                java.lang.String value2 = ((com.omarea.ui.SelectView) activityFastShare.x.a(gu0VarArr2[20])).getValue();
                activityFastShare.L = a.wv.M0(a.wv.b(a.z80.b), null, new a.k7(activityFastShare, str, intValue, (value2 == null || (c2 = a.wi1.c2(value2)) == null) ? 80 : c2.intValue(), null), 3);
                return;
        }
    }
}
