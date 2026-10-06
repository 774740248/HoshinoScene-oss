package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class a3 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f1a;
    public final a.z2 b;

    /* JADX WARN: Type inference failed for: r0v1, types: [a.z2, a.ms] */
    public a3(android.content.Context context) {
        a.wv.w(context, "context");
        this.f1a = context;
        a.cp cpVar = com.omarea.Scene.c;
        this.b = new a.ms(a.fs1.t());
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x002e. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:128:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0182 A[Catch: all -> 0x00b0, Exception -> 0x00b4, TRY_LEAVE, TryCatch #13 {Exception -> 0x00b4, all -> 0x00b0, blocks: (B:134:0x00ab, B:135:0x016e, B:139:0x0182), top: B:133:0x00ab }] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01c3 A[Catch: all -> 0x00fe, TryCatch #12 {all -> 0x00fe, blocks: (B:72:0x01e9, B:74:0x0221, B:76:0x0227, B:78:0x0231, B:81:0x023f, B:83:0x024c, B:90:0x0283, B:92:0x028b, B:94:0x0298, B:96:0x02a8, B:98:0x02b0, B:103:0x02bb, B:106:0x02c5, B:109:0x02fd, B:111:0x030c, B:113:0x0314, B:115:0x0320, B:117:0x0328, B:118:0x0337, B:120:0x033d, B:126:0x03bf, B:145:0x01b7, B:147:0x01c3, B:151:0x01f4, B:184:0x00ed, B:186:0x00f3, B:189:0x010b, B:191:0x010f, B:194:0x0124), top: B:183:0x00ed }] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01f4 A[Catch: all -> 0x00fe, TryCatch #12 {all -> 0x00fe, blocks: (B:72:0x01e9, B:74:0x0221, B:76:0x0227, B:78:0x0231, B:81:0x023f, B:83:0x024c, B:90:0x0283, B:92:0x028b, B:94:0x0298, B:96:0x02a8, B:98:0x02b0, B:103:0x02bb, B:106:0x02c5, B:109:0x02fd, B:111:0x030c, B:113:0x0314, B:115:0x0320, B:117:0x0328, B:118:0x0337, B:120:0x033d, B:126:0x03bf, B:145:0x01b7, B:147:0x01c3, B:151:0x01f4, B:184:0x00ed, B:186:0x00f3, B:189:0x010b, B:191:0x010f, B:194:0x0124), top: B:183:0x00ed }] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0362 A[Catch: all -> 0x0040, TryCatch #1 {all -> 0x0040, blocks: (B:13:0x003b, B:17:0x0045, B:24:0x035c, B:26:0x0362, B:28:0x036b, B:35:0x039a, B:38:0x03de, B:40:0x0422, B:47:0x03f7, B:49:0x03ff, B:51:0x0405, B:53:0x041a, B:64:0x026f), top: B:7:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x03de A[Catch: all -> 0x0040, TRY_ENTER, TryCatch #1 {all -> 0x0040, blocks: (B:13:0x003b, B:17:0x0045, B:24:0x035c, B:26:0x0362, B:28:0x036b, B:35:0x039a, B:38:0x03de, B:40:0x0422, B:47:0x03f7, B:49:0x03ff, B:51:0x0405, B:53:0x041a, B:64:0x026f), top: B:7:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0422 A[Catch: all -> 0x0040, TRY_LEAVE, TryCatch #1 {all -> 0x0040, blocks: (B:13:0x003b, B:17:0x0045, B:24:0x035c, B:26:0x0362, B:28:0x036b, B:35:0x039a, B:38:0x03de, B:40:0x0422, B:47:0x03f7, B:49:0x03ff, B:51:0x0405, B:53:0x041a, B:64:0x026f), top: B:7:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x026f A[Catch: all -> 0x0040, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0040, blocks: (B:13:0x003b, B:17:0x0045, B:24:0x035c, B:26:0x0362, B:28:0x036b, B:35:0x039a, B:38:0x03de, B:40:0x0422, B:47:0x03f7, B:49:0x03ff, B:51:0x0405, B:53:0x041a, B:64:0x026f), top: B:7:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0221 A[Catch: all -> 0x00fe, TryCatch #12 {all -> 0x00fe, blocks: (B:72:0x01e9, B:74:0x0221, B:76:0x0227, B:78:0x0231, B:81:0x023f, B:83:0x024c, B:90:0x0283, B:92:0x028b, B:94:0x0298, B:96:0x02a8, B:98:0x02b0, B:103:0x02bb, B:106:0x02c5, B:109:0x02fd, B:111:0x030c, B:113:0x0314, B:115:0x0320, B:117:0x0328, B:118:0x0337, B:120:0x033d, B:126:0x03bf, B:145:0x01b7, B:147:0x01c3, B:151:0x01f4, B:184:0x00ed, B:186:0x00f3, B:189:0x010b, B:191:0x010f, B:194:0x0124), top: B:183:0x00ed }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0231 A[Catch: all -> 0x00fe, TRY_LEAVE, TryCatch #12 {all -> 0x00fe, blocks: (B:72:0x01e9, B:74:0x0221, B:76:0x0227, B:78:0x0231, B:81:0x023f, B:83:0x024c, B:90:0x0283, B:92:0x028b, B:94:0x0298, B:96:0x02a8, B:98:0x02b0, B:103:0x02bb, B:106:0x02c5, B:109:0x02fd, B:111:0x030c, B:113:0x0314, B:115:0x0320, B:117:0x0328, B:118:0x0337, B:120:0x033d, B:126:0x03bf, B:145:0x01b7, B:147:0x01c3, B:151:0x01f4, B:184:0x00ed, B:186:0x00f3, B:189:0x010b, B:191:0x010f, B:194:0x0124), top: B:183:0x00ed }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0031  */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v41 */
    /* JADX WARN: Type inference failed for: r2v46 */
    /* JADX WARN: Type inference failed for: r5v20, types: [a.fp0, a.lj1] */
    /* JADX WARN: Type inference failed for: r9v8, types: [a.fp0, a.lj1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(a.lf r20, a.ey r21) {
        /*
            Method dump skipped, instructions count: 1126
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a3.a(a.lf, a.ey):java.lang.Object");
    }

    public final com.omarea.model.ActivatedStateModel b(java.lang.String str) {
        this.b.toString();
        if (a.yi1.g2("success@4102272000000", "success@")) {
            try {
                java.lang.String substring = "success@4102272000000".substring(a.yi1.l2("success@4102272000000", '@', false, 6) + 1);
                a.wv.v(substring, "this as java.lang.String).substring(startIndex)");
                long parseLong = java.lang.Long.parseLong(substring);
                if (parseLong < 1000000000000L) {
                    parseLong *= 1000;
                }
                java.lang.String format = new java.text.SimpleDateFormat("yyyy-MM-dd").format(new java.util.Date(parseLong));
                com.omarea.model.ActivatedStateModel activatedStateModel = new com.omarea.model.ActivatedStateModel();
                activatedStateModel.setActivated(true);
                activatedStateModel.setText(str + format);
                return activatedStateModel;
            } catch (java.lang.Exception unused) {
                com.omarea.model.ActivatedStateModel activatedStateModel2 = new com.omarea.model.ActivatedStateModel();
                activatedStateModel2.setActivated(false);
                activatedStateModel2.setText(str.concat("??"));
                return activatedStateModel2;
            }
        }
        boolean e = a.wv.e("success@4102272000000", "expired");
        android.content.Context context = this.f1a;
        if (e) {
            a.b20.e1(null);
            a.b20.f1(null);
            com.omarea.model.ActivatedStateModel activatedStateModel3 = new com.omarea.model.ActivatedStateModel();
            activatedStateModel3.setActivated(false);
            java.lang.String string = context.getString(2131952792);
            a.wv.v(string, "context.getString(R.string.license_state_expired)");
            activatedStateModel3.setText(string);
            return activatedStateModel3;
        }
        if (a.wv.e("success@4102272000000", "empty")) {
            com.omarea.model.ActivatedStateModel activatedStateModel4 = new com.omarea.model.ActivatedStateModel();
            activatedStateModel4.setActivated(false);
            java.lang.String string2 = context.getString(2131952794);
            a.wv.v(string2, "context.getString(R.stri…ense_state_not_activated)");
            activatedStateModel4.setText(string2);
            return activatedStateModel4;
        }
        if (a.wv.e("success@4102272000000", "invalid") || a.wv.e("success@4102272000000", "not-you")) {
            com.omarea.model.ActivatedStateModel activatedStateModel5 = new com.omarea.model.ActivatedStateModel();
            activatedStateModel5.setActivated(false);
            java.lang.String string3 = context.getString(2131952793);
            a.wv.v(string3, "context.getString(R.string.license_state_invalid)");
            activatedStateModel5.setText(string3);
            return activatedStateModel5;
        }
        com.omarea.model.ActivatedStateModel activatedStateModel6 = new com.omarea.model.ActivatedStateModel();
        activatedStateModel6.setActivated(false);
        java.lang.String string4 = context.getString(2131952795);
        a.wv.v(string4, "context.getString(R.string.license_state_unknown)");
        activatedStateModel6.setText(string4);
        return activatedStateModel6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0065, code lost:
    
        if ("perpetual".equals("trial") == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0094, code lost:
    
        r2 = r5.getString(2131952781);
        a.wv.v(r2, "context.getString(R.string.license_expiry)");
        r2 = b(r2);
        r3 = r5.getString(2131952798);
        a.wv.v(r3, "context.getString(R.string.license_trial)");
        r2.setTypeName(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0091, code lost:
    
        if ("perpetual".equals("") == false) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.omarea.model.ActivatedStateModel c() {
        /*
            r8 = this;
            a.cp r0 = com.omarea.Scene.c
            android.content.SharedPreferences r0 = a.fs1.D()
            java.lang.String r1 = "activate_v2_type"
            java.lang.String r2 = ""
            java.lang.String r0 = r0.getString(r1, r2)
            java.lang.String r0 = "perpetual"
            java.lang.String r1 = "perpetual"
            java.lang.String r3 = "context.getString(R.string.license_expiry)"
            r4 = 2131952781(0x7f13048d, float:1.9542014E38)
            android.content.Context r5 = r8.f1a
            if (r0 == 0) goto Ld8
            int r6 = r0.hashCode()
            r7 = -1177318867(0xffffffffb9d38a2d, float:-4.0348005E-4)
            if (r6 == r7) goto Laf
            if (r6 == 0) goto L8d
            r2 = 92909918(0x589b15e, float:1.2948572E-35)
            if (r6 == r2) goto L69
            r2 = 110628630(0x6980f16, float:5.719821E-35)
            if (r6 == r2) goto L5f
            r2 = 758264126(0x2d32313e, float:1.01290625E-11)
            if (r6 == r2) goto L37
            goto Ld8
        L37:
            boolean r2 = r0.equals(r1)
            if (r2 != 0) goto L3f
            goto Ld8
        L3f:
            java.lang.String r2 = r5.getString(r4)
            a.wv.v(r2, r3)
            com.omarea.model.ActivatedStateModel r2 = r8.b(r2)
            r3 = 1
            r2.setPermanent(r3)
            r3 = 2131952791(0x7f130497, float:1.9542035E38)
            java.lang.String r3 = r5.getString(r3)
            java.lang.String r4 = "context.getString(R.string.license_perpetual)"
            a.wv.v(r3, r4)
            r2.setTypeName(r3)
            goto Lf2
        L5f:
            java.lang.String r2 = "trial"
            boolean r2 = r0.equals(r2)
            if (r2 != 0) goto L94
            goto Ld8
        L69:
            java.lang.String r2 = "alpha"
            boolean r2 = r0.equals(r2)
            if (r2 != 0) goto L72
            goto Ld8
        L72:
            java.lang.String r2 = r5.getString(r4)
            a.wv.v(r2, r3)
            com.omarea.model.ActivatedStateModel r2 = r8.b(r2)
            r3 = 2131952779(0x7f13048b, float:1.954201E38)
            java.lang.String r3 = r5.getString(r3)
            java.lang.String r4 = "context.getString(R.string.license_alpha)"
            a.wv.v(r3, r4)
            r2.setTypeName(r3)
            goto Lf2
        L8d:
            boolean r2 = r0.equals(r2)
            if (r2 != 0) goto L94
            goto Ld8
        L94:
            java.lang.String r2 = r5.getString(r4)
            a.wv.v(r2, r3)
            com.omarea.model.ActivatedStateModel r2 = r8.b(r2)
            r3 = 2131952798(0x7f13049e, float:1.9542049E38)
            java.lang.String r3 = r5.getString(r3)
            java.lang.String r4 = "context.getString(R.string.license_trial)"
            a.wv.v(r3, r4)
            r2.setTypeName(r3)
            goto Lf2
        Laf:
            java.lang.String r2 = "account"
            boolean r2 = r0.equals(r2)
            if (r2 != 0) goto Lb8
            goto Ld8
        Lb8:
            r2 = 2131952789(0x7f130495, float:1.954203E38)
            java.lang.String r2 = r5.getString(r2)
            java.lang.String r3 = "context.getString(R.string.license_next_cycle)"
            a.wv.v(r2, r3)
            com.omarea.model.ActivatedStateModel r2 = r8.b(r2)
            r3 = 2131952778(0x7f13048a, float:1.9542008E38)
            java.lang.String r3 = r5.getString(r3)
            java.lang.String r4 = "context.getString(R.string.license_account)"
            a.wv.v(r3, r4)
            r2.setTypeName(r3)
            goto Lf2
        Ld8:
            java.lang.String r2 = r5.getString(r4)
            a.wv.v(r2, r3)
            com.omarea.model.ActivatedStateModel r2 = r8.b(r2)
            r3 = 2131952783(0x7f13048f, float:1.9542018E38)
            java.lang.String r3 = r5.getString(r3)
            java.lang.String r4 = "context.getString(R.string.license_free)"
            a.wv.v(r3, r4)
            r2.setTypeName(r3)
        Lf2:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            r2.setType(r3)
            boolean r0 = a.wv.e(r0, r1)
            r2.setPermanent(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a3.c():com.omarea.model.ActivatedStateModel");
    }
}
