package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class mn extends a.b20 {
    public final /* synthetic */ int E;
    public final /* synthetic */ int F;
    public final /* synthetic */ java.lang.ref.WeakReference G;
    public final /* synthetic */ a.sn H;

    public mn(a.sn snVar, int i, int i2, java.lang.ref.WeakReference weakReference) {
        this.H = snVar;
        this.E = i;
        this.F = i2;
        this.G = weakReference;
    }

    @Override // a.b20
    public final void K0(int i) {
    }

    @Override // a.b20
    public final void L0(android.graphics.Typeface typeface) {
        int i;
        if (android.os.Build.VERSION.SDK_INT >= 28 && (i = this.E) != -1) {
            typeface = a.rn.a(typeface, i, (this.F & 2) != 0);
        }
        a.sn snVar = this.H;
        if (snVar.m) {
            snVar.l = typeface;
            android.widget.TextView textView = (android.widget.TextView) this.G.get();
            if (textView != null) {
                java.util.WeakHashMap weakHashMap = a.jq1.f264a;
                if (a.up1.b(textView)) {
                    textView.post(new a.nn(textView, typeface, snVar.j));
                } else {
                    textView.setTypeface(typeface, snVar.j);
                }
            }
        }
    }
    public boolean q(a.q p0, a.p p1, a.p p2) {
        throw new UnsupportedOperationException("Method not decompiled: mn.q");
    }
    public boolean p(a.q p0, java.lang.Object p1, java.lang.Object p2) {
        throw new UnsupportedOperationException("Method not decompiled: mn.p");
    }
    public boolean o(a.q p0, a.m p1) {
        throw new UnsupportedOperationException("Method not decompiled: mn.o");
    }
    public void U0(a.p p0, java.lang.Thread p1) {
        throw new UnsupportedOperationException("Method not decompiled: mn.U0");
    }
    public void U(float p0, float p1, a.gh1 p2) {
        throw new UnsupportedOperationException("Method not decompiled: mn.U");
    }
    public void T0(a.p p0, a.p p1) {
        throw new UnsupportedOperationException("Method not decompiled: mn.T0");
    }
    public void N0(a.ej1 p0) {
        throw new UnsupportedOperationException("Method not decompiled: mn.N0");
    }
    public void M0(android.graphics.Typeface p0, boolean p1) {
        throw new UnsupportedOperationException("Method not decompiled: mn.M0");
    }
    public void J0(java.lang.Throwable p0) {
        throw new UnsupportedOperationException("Method not decompiled: mn.J0");
    }
}
