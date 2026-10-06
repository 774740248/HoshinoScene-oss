package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class yl implements java.lang.Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ a.km d;

    public /* synthetic */ yl(a.km kmVar, int i) {
        this.c = i;
        this.d = kmVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
    
        if (a.up1.c(r1) != false) goto L15;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r6 = this;
            r0 = 1
            int r1 = r6.c
            r2 = 0
            a.km r3 = r6.d
            switch(r1) {
                case 0: goto L54;
                default: goto L9;
            }
        L9:
            android.widget.PopupWindow r1 = r3.y
            androidx.appcompat.widget.ActionBarContextView r4 = r3.x
            r5 = 55
            r1.showAtLocation(r4, r5, r2, r2)
            a.sr1 r1 = r3.A
            if (r1 == 0) goto L19
            r1.b()
        L19:
            boolean r1 = r3.B
            if (r1 == 0) goto L2a
            android.view.ViewGroup r1 = r3.C
            if (r1 == 0) goto L2a
            java.util.WeakHashMap r4 = a.jq1.f264a
            boolean r1 = a.up1.c(r1)
            if (r1 == 0) goto L2a
            goto L2b
        L2a:
            r0 = r2
        L2b:
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto L49
            androidx.appcompat.widget.ActionBarContextView r0 = r3.x
            r4 = 0
            r0.setAlpha(r4)
            androidx.appcompat.widget.ActionBarContextView r0 = r3.x
            a.sr1 r0 = a.jq1.a(r0)
            r0.a(r1)
            r3.A = r0
            a.am r1 = new a.am
            r1.<init>(r2, r6)
            r0.initTitle(r1)
            goto L53
        L49:
            androidx.appcompat.widget.ActionBarContextView r0 = r3.x
            r0.setAlpha(r1)
            androidx.appcompat.widget.ActionBarContextView r0 = r3.x
            r0.setVisibility(r2)
        L53:
            return
        L54:
            int r1 = r3.b0
            r0 = r0 & r1
            if (r0 == 0) goto L5c
            r3.y(r2)
        L5c:
            int r0 = r3.b0
            r0 = r0 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L67
            r0 = 108(0x6c, float:1.51E-43)
            r3.y(r0)
        L67:
            r3.a0 = r2
            r3.b0 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a.yl.run():void");
    }
}
