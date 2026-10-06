package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class pp1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f446a;
    public final java.lang.Class b;
    public final int c;
    public final int d;

    public pp1(int i, java.lang.Class cls, int i2, int i3) {
        this.f446a = i;
        this.b = cls;
        this.d = i2;
        this.c = i3;
    }

    public final java.lang.Object a(android.view.View view) {
        if (android.os.Build.VERSION.SDK_INT < this.c) {
            java.lang.Object tag = view.getTag(this.f446a);
            if (this.b.isInstance(tag)) {
                return tag;
            }
            return null;
        }
        int i = ((a.np1) this).e;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                switch (i) {
                    case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                        return java.lang.Boolean.valueOf(a.cq1.d(view));
                    default:
                        return java.lang.Boolean.valueOf(a.cq1.c(view));
                }
            case 1:
                switch (i) {
                    case 1:
                        return a.cq1.b(view);
                    default:
                        return a.eq1.a(view);
                }
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                switch (i) {
                    case 1:
                        return a.cq1.b(view);
                    default:
                        return a.eq1.a(view);
                }
            default:
                switch (i) {
                    case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                        return java.lang.Boolean.valueOf(a.cq1.d(view));
                    default:
                        return java.lang.Boolean.valueOf(a.cq1.c(view));
                }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0103, code lost:
    
        if (r0 == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0086, code lost:
    
        if (r0 == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0088, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00a3, code lost:
    
        if (r0 == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x00ea, code lost:
    
        if (r0 == r1) goto L37;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:31:0x0065. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(android.view.View r6, java.lang.Object r7) {
        /*
            Method dump skipped, instructions count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.pp1.b(android.view.View, java.lang.Object):void");
    }
}
