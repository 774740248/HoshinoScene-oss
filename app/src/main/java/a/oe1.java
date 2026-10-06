package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class oe1 extends a.qr0 {
    public final int e = 10000;
    public final int f = 10000;

    @Override // a.qr0
    public final int c() {
        return this.e;
    }

    @Override // a.qr0
    public final int d() {
        return this.f;
    }

    public final void m(java.lang.String str) {
        a.wv.w(str, "id");
        try {
            java.lang.String concat = a.tg1.i().concat("/pvp/user-report-delete");
            a.ne1 ne1Var = new a.ne1(str, 0);
            a.lt0 lt0Var = new a.lt0();
            ne1Var.i(lt0Var);
            java.lang.String lt0Var2 = lt0Var.toString();
            a.wv.v(lt0Var2, "id: String): String? {\n …\n            }.toString()");
            k(concat, lt0Var2);
        } catch (java.lang.Exception e) {
            e.getMessage();
        }
    }

    public final java.lang.String n(java.lang.String str, java.lang.String str2) {
        a.wv.w(str, "id1");
        a.wv.w(str2, "id2");
        try {
            java.lang.String concat = a.tg1.i().concat("/pvp/user-report-pk-url");
            a.jc1 jc1Var = new a.jc1(1, str, str2);
            a.lt0 lt0Var = new a.lt0();
            jc1Var.i(lt0Var);
            java.lang.String lt0Var2 = lt0Var.toString();
            a.wv.v(lt0Var2, "id1: String, id2: String…\n            }.toString()");
            return k(concat, lt0Var2);
        } catch (java.lang.Exception e) {
            e.getMessage();
            return null;
        }
    }

    public final a.y31 o(java.lang.String str) {
        try {
            if (!a.yi1.g2(k(a.tg1.i().concat("/pvp/user-report-allowed"), "{}"), "true")) {
                return null;
            }
            try {
                java.lang.String concat = a.tg1.i().concat("/pvp/user-report-put");
                byte[] bytes = str.getBytes(a.bu.f53a);
                a.wv.v(bytes, "this as java.lang.String).getBytes(charset)");
                a.lt0 lt0Var = new a.lt0(a.qr0.j(this, concat, bytes));
                if (a.wv.e(lt0Var.h("status"), "ok")) {
                    return new a.y31(lt0Var.h("id"), lt0Var.h("url"));
                }
                return null;
            } catch (java.lang.Exception e) {
                e.getMessage();
                return null;
            }
        } catch (java.lang.Exception e2) {
            e2.getMessage();
            return null;
        }
    }
}
