package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ff0 extends a.uu0 implements a.qo0 {
    public static final a.ff0 e = new a.ff0(0);
    public static final a.ff0 f = new a.ff0(1);
    public static final a.ff0 g = new a.ff0(2);
    public static final a.ff0 h = new a.ff0(3);
    public static final a.ff0 i = new a.ff0(4);
    public static final a.ff0 j = new a.ff0(5);
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ff0(int i2) {
        super(0);
        this.d = i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x002e, code lost:
    
        if (a.gy.G() != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Boolean a() {
        /*
            r3 = this;
            int r0 = r3.d
            java.lang.String r1 = "kernel_mem"
            r2 = 1
            switch(r0) {
                case 0: goto L49;
                case 1: goto L37;
                case 2: goto L17;
                default: goto L8;
            }
        L8:
            a.cp r0 = com.omarea.Scene.c
            android.content.SharedPreferences r0 = a.fs1.D()
            boolean r0 = r0.getBoolean(r1, r2)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L17:
            a.q10 r0 = a.q10.f457a
            java.lang.String r0 = a.q10.t()
            java.lang.String r1 = "root"
            boolean r0 = a.wv.e(r0, r1)
            if (r0 == 0) goto L31
            a.ls r0 = new a.ls
            r0.<init>()
            boolean r0 = a.gy.G()
            if (r0 == 0) goto L31
            goto L32
        L31:
            r2 = 0
        L32:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            return r0
        L37:
            a.q10 r0 = a.q10.f457a
            java.lang.String r0 = a.q10.t()
            java.lang.String r1 = "basic"
            boolean r0 = a.wv.e(r0, r1)
            r0 = r0 ^ r2
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L49:
            a.cp r0 = com.omarea.Scene.c
            android.content.SharedPreferences r0 = a.fs1.D()
            boolean r0 = r0.getBoolean(r1, r2)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a.ff0.a():java.lang.Boolean");
    }

    @Override // a.qo0
    public final java.lang.Object b() {
        switch (this.d) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                return a();
            case 1:
                return a();
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                return a();
            case 3:
                return a();
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_READ_ERROR /* 4 */:
                return new java.lang.Object();
            default:
                return a.oq0.j;
        }
    }
}
