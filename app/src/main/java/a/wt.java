package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class wt implements a.wr0 {
    public static int g;
    public final a.au c;
    public java.lang.Long d;
    public long e;
    public final a.nk f;

    public wt(android.content.Context context) {
        long j;
        a.wv.w(context, "context");
        a.au e = a.au.e();
        this.c = e;
        g = e.h();
        e.m();
        android.database.Cursor rawQuery = ((android.database.sqlite.SQLiteDatabase) e.d).rawQuery("select time from records order by time desc limit 1", new java.lang.String[0]);
        try {
            if (rawQuery.moveToNext()) {
                j = java.lang.Long.valueOf(rawQuery.getLong(0));
                rawQuery.close();
            } else {
                rawQuery.close();
                j = 0L;
            }
            this.d = j;
            this.f = new a.nk("Analyser-Charge", new a.vt(0, this));
        } catch (java.lang.Throwable th) {
            if (rawQuery != null) {
                try {
                    rawQuery.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // a.wr0
    public final boolean eventFilter(a.kc0 kc0Var) {
        int ordinal = kc0Var.ordinal();
        return ordinal == 0 || ordinal == 1 || ordinal == 4 || ordinal == 5;
    }

    @Override // a.wr0
    public final boolean isAsync() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0064, code lost:
    
        if ((r2 - r12.longValue()) <= 60000) goto L28;
     */
    @Override // a.wr0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onReceive(a.kc0 r11, java.util.HashMap r12) {
        /*
            r10 = this;
            int r11 = r11.ordinal()
            r0 = 5000(0x1388, double:2.4703E-320)
            if (r11 == 0) goto L32
            r12 = 1
            a.nk r2 = r10.f
            if (r11 == r12) goto L1f
            r12 = 4
            if (r11 == r12) goto L14
            r12 = 5
            if (r11 == r12) goto L1f
            goto L77
        L14:
            int r11 = a.oq0.i
            r12 = 2
            if (r11 != r12) goto L77
            r11 = 1000(0x3e8, double:4.94E-321)
            r2.R(r0, r11)
            goto L77
        L1f:
            long r11 = java.lang.System.currentTimeMillis()
            r10.e = r11
            java.lang.Object r11 = r2.f
            java.util.Timer r11 = (java.util.Timer) r11
            if (r11 == 0) goto L2e
            r11.cancel()
        L2e:
            r11 = 0
            r2.f = r11
            goto L77
        L32:
            a.au r11 = r10.c
            int r12 = r11.g()
            long r2 = java.lang.System.currentTimeMillis()
            int r4 = a.oq0.f
            r5 = -1
            if (r4 == r5) goto L43
            if (r4 != r12) goto L71
        L43:
            java.lang.Long r12 = r10.d
            r4 = 0
            if (r12 != 0) goto L4a
            goto L52
        L4a:
            long r6 = r12.longValue()
            int r12 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r12 == 0) goto L66
        L52:
            java.lang.Long r12 = r10.d
            java.lang.String r6 = "lastUpdate"
            a.wv.v(r12, r6)
            long r6 = r12.longValue()
            long r6 = r2 - r6
            r8 = 60000(0xea60, double:2.9644E-319)
            int r12 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r12 > 0) goto L71
        L66:
            long r6 = r10.e
            int r12 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r12 == 0) goto L77
            long r2 = r2 - r6
            int r12 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r12 <= 0) goto L77
        L71:
            int r11 = r11.l()
            a.wt.g = r11
        L77:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a.wt.onReceive(a.kc0, java.util.HashMap):void");
    }

    @Override // a.wr0
    public final void onSubscribe() {
    }

    @Override // a.wr0
    public final void onUnsubscribe() {
    }
}
