package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class o11 extends android.widget.BaseAdapter {
    public static final int f = a.so1.d(null).getMaximum(4);
    public static final int g = (a.so1.d(null).getMaximum(7) + a.so1.d(null).getMaximum(5)) - 1;
    public final a.n11 c;
    public a.qs d;
    public final a.ps e;

    public o11(a.n11 n11Var, a.ps psVar) {
        this.c = n11Var;
        this.e = psVar;
        throw null;
    }

    public final int a() {
        int i = this.e.g;
        a.n11 n11Var = this.c;
        java.util.Calendar calendar = n11Var.c;
        int i2 = calendar.get(7);
        if (i <= 0) {
            i = calendar.getFirstDayOfWeek();
        }
        int i3 = i2 - i;
        return i3 < 0 ? i3 + n11Var.f : i3;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final java.lang.Long getItem(int i) {
        if (i < a() || i > c()) {
            return null;
        }
        int a2 = (i - a()) + 1;
        java.util.Calendar b = a.so1.b(this.c.c);
        b.set(5, a2);
        return java.lang.Long.valueOf(b.getTimeInMillis());
    }

    public final int c() {
        return (a() + this.c.g) - 1;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return g;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i / this.c.f;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006c  */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View getView(int r5, android.view.View r6, android.view.ViewGroup r7) {
        /*
            r4 = this;
            android.content.Context r0 = r7.getContext()
            a.qs r1 = r4.d
            if (r1 != 0) goto Lf
            a.qs r1 = new a.qs
            r1.<init>(r0)
            r4.d = r1
        Lf:
            r0 = r6
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r6 != 0) goto L27
            android.content.Context r6 = r7.getContext()
            android.view.LayoutInflater r6 = android.view.LayoutInflater.from(r6)
            r0 = 2131558685(0x7f0d011d, float:1.8742693E38)
            android.view.View r6 = r6.inflate(r0, r7, r1)
            r0 = r6
            android.widget.TextView r0 = (android.widget.TextView) r0
        L27:
            int r6 = r4.a()
            int r6 = r5 - r6
            if (r6 < 0) goto L5d
            a.n11 r7 = r4.c
            int r2 = r7.g
            if (r6 < r2) goto L36
            goto L5d
        L36:
            r2 = 1
            int r6 = r6 + r2
            r0.setTag(r7)
            android.content.res.Resources r7 = r0.getResources()
            android.content.res.Configuration r7 = r7.getConfiguration()
            java.util.Locale r7 = r7.locale
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object[] r6 = new java.lang.Object[]{r6}
            java.lang.String r3 = "%d"
            java.lang.String r6 = java.lang.String.format(r7, r3, r6)
            r0.setText(r6)
            r0.setVisibility(r1)
            r0.setEnabled(r2)
            goto L65
        L5d:
            r6 = 8
            r0.setVisibility(r6)
            r0.setEnabled(r1)
        L65:
            java.lang.Long r5 = r4.getItem(r5)
            if (r5 != 0) goto L6c
            goto L71
        L6c:
            r5.longValue()
            if (r0 != 0) goto L72
        L71:
            return r0
        L72:
            r0.getContext()
            java.util.Calendar r5 = a.so1.c()
            r5.getTimeInMillis()
            r5 = 0
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a.o11.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }
}
