package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class jp extends a.jq {
    public final /* synthetic */ int e;
    public final /* synthetic */ java.lang.Object f;

    public /* synthetic */ jp(int i, java.lang.Object obj) {
        this.e = i;
        this.f = obj;
    }

    @Override // a.jq
    public final void c() {
        int i = this.e;
        java.lang.Object obj = this.f;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                ((a.kp) obj).clear();
                return;
            default:
                ((a.np) obj).clear();
                return;
        }
    }

    @Override // a.jq
    public final java.lang.Object d(int i, int i2) {
        int i3 = this.e;
        java.lang.Object obj = this.f;
        switch (i3) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                return ((a.kp) obj).d[(i << 1) + i2];
            default:
                return ((a.np) obj).d[i];
        }
    }

    @Override // a.jq
    public final a.kp e() {
        switch (this.e) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                return (a.kp) this.f;
            default:
                throw new java.lang.UnsupportedOperationException("not a map");
        }
    }

    @Override // a.jq
    public final int f() {
        int i = this.e;
        java.lang.Object obj = this.f;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                return ((a.kp) obj).e;
            default:
                return ((a.np) obj).e;
        }
    }

    @Override // a.jq
    public final int g(java.lang.Object obj) {
        int i = this.e;
        java.lang.Object obj2 = this.f;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                return ((a.kp) obj2).e(obj);
            default:
                return ((a.np) obj2).indexOf(obj);
        }
    }

    @Override // a.jq
    public final int h(java.lang.Object obj) {
        int i = this.e;
        java.lang.Object obj2 = this.f;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                return ((a.kp) obj2).g(obj);
            default:
                return ((a.np) obj2).indexOf(obj);
        }
    }

    @Override // a.jq
    public final void i(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.e;
        java.lang.Object obj3 = this.f;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                ((a.kp) obj3).put(obj, obj2);
                return;
            default:
                ((a.np) obj3).add(obj);
                return;
        }
    }

    @Override // a.jq
    public final void j(int i) {
        int i2 = this.e;
        java.lang.Object obj = this.f;
        switch (i2) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                ((a.kp) obj).i(i);
                return;
            default:
                ((a.np) obj).e(i);
                return;
        }
    }

    @Override // a.jq
    public final java.lang.Object k(int i, java.lang.Object obj) {
        switch (this.e) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                int i2 = (i << 1) + 1;
                java.lang.Object[] objArr = ((a.kp) this.f).d;
                java.lang.Object obj2 = objArr[i2];
                objArr[i2] = obj;
                return obj2;
            default:
                throw new java.lang.UnsupportedOperationException("not a map");
        }
    }
    public java.lang.String o() {
        throw new UnsupportedOperationException("Method not decompiled: jp.o");
    }
}
