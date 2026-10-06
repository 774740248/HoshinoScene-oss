package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class sn0 extends a.lj1 implements a.fp0 {
    public final /* synthetic */ a.jo0 g;
    public final /* synthetic */ com.omarea.model.AccountPointsResponse h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sn0(a.jo0 jo0Var, com.omarea.model.AccountPointsResponse accountPointsResponse, a.ey eyVar) {
        super(2, eyVar);
        this.g = jo0Var;
        this.h = accountPointsResponse;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.sn0(this.g, this.h, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        java.lang.String str;
        a.b20.q1(obj);
        a.gu0[] gu0VarArr = a.jo0.v0;
        a.jo0 jo0Var = this.g;
        jo0Var.U().a();
        if (!jo0Var.C) {
            com.omarea.model.AccountPointsResponse accountPointsResponse = this.h;
            if (accountPointsResponse != null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(jo0Var.m(2131953702) + accountPointsResponse.getTotal() + "\n");
                sb.append(jo0Var.m(2131953704) + accountPointsResponse.getConsume() + "\n");
                sb.append(jo0Var.m(2131953701) + accountPointsResponse.getFree() + "\n\n");
                sb.append(jo0Var.m(2131953699) + "\n");
                com.omarea.model.AccountPoints[] records = accountPointsResponse.getRecords();
                int length = records.length;
                for (int i = 0; i < length; i++) {
                    com.omarea.model.AccountPoints accountPoints = records[i];
                    sb.append(accountPoints.getRemark());
                    sb.append("\t\t");
                    sb.append(accountPoints.getIntegral() > 0 ? a.ii1.d("+", accountPoints.getIntegral()) : java.lang.String.valueOf(accountPoints.getIntegral()));
                    sb.append("\t\t");
                    java.lang.String format = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new java.util.Date(accountPoints.getTime()));
                    a.wv.v(format, "simpleDateFormat.format(Date(timestamp))");
                    java.lang.String substring = format.substring(0, 10);
                    a.wv.v(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    sb.append(substring);
                    java.lang.String[] strArr = {accountPoints.getSerial_id(), accountPoints.getSerial_no(), accountPoints.getDevice_id()};
                    int i2 = 0;
                    while (true) {
                        if (i2 >= 3) {
                            str = null;
                            break;
                        }
                        str = strArr[i2];
                        if (!(str == null || str.length() == 0)) {
                            break;
                        }
                        i2++;
                    }
                    if (str != null) {
                        sb.append("    ");
                        sb.append(str);
                        sb.append("");
                    }
                    sb.append("\n");
                }
                int i3 = a.x60.f681a;
                a.kk0 K = jo0Var.K();
                java.lang.String m = jo0Var.m(2131953669);
                a.wv.v(m, "getString(R.string.user_current_account)");
                java.lang.String sb2 = sb.toString();
                a.wv.v(sb2, "str.toString()");
                java.lang.String m2 = jo0Var.m(2131952077);
                a.wv.v(m2, "getString(R.string.btn_confirm)");
                a.u60 u60Var = new a.u60(m2, new a.wa0(1), 4);
                java.lang.String m3 = jo0Var.m(2131953687);
                a.wv.v(m3, "getString(R.string.user_log_out)");
                a.fs1.f(K, m, sb2, u60Var, new a.u60(m3, new a.hw(17, jo0Var), 4));
            } else {
                a.cp cpVar = com.omarea.Scene.c;
                java.lang.String m4 = jo0Var.m(2131953700);
                a.wv.v(m4, "getString(R.string.user_points_failure)");
                a.fs1.X(m4, 0);
            }
        }
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        a.sn0 sn0Var = (a.sn0) a((a.cz) obj, (a.ey) obj2);
        a.no1 no1Var = a.no1.f387a;
        sn0Var.e(no1Var);
        return no1Var;
    }
}
