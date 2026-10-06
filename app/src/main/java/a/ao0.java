package a;

import java.util.ArrayList;
/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ao0 extends a.lj1 implements a.fp0 {
    public int g;
    public final /* synthetic */ a.jo0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ao0(a.jo0 jo0Var, a.ey eyVar) {
        super(2, eyVar);
        this.h = jo0Var;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.ao0(this.h, eyVar);
    }

    /*  JADX ERROR: NullPointerException in pass: BlockProcessor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.BlockNode.getPredecessors()" because "to" is null
        	at jadx.core.dex.visitors.blocks.BlockSplitter.removeConnection(BlockSplitter.java:164)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.removeExcHandler(BlockExceptionHandler.java:324)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.lambda$prepareTryBlocks$2(BlockExceptionHandler.java:207)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.prepareTryBlocks(BlockExceptionHandler.java:207)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.process(BlockExceptionHandler.java:60)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.independentBlockTreeMod(BlockProcessor.java:325)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:51)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    /* JADX WARN: Unreachable blocks removed: 22, instructions: 52 */
    @Override // a.iq
    public final java.lang.Object e(java.lang.Object r8) {
        /*
            r7 = this;
            a.no1 r8 = a.no1.f387a
            return r8
            a.dz r0 = a.dz.c
            int r1 = r7.g
            r2 = 1
            if (r1 == 0) goto L18
            if (r1 != r2) goto L10
            a.b20.q1(r8)     // Catch: java.lang.Exception -> L76
            goto L76
        L10:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L18:
            a.b20.q1(r8)
            a.kf1 r8 = new a.kf1     // Catch: java.lang.Exception -> L76
            a.cp r1 = com.omarea.Scene.c     // Catch: java.lang.Exception -> L76
            android.app.Application r1 = a.fs1.t()     // Catch: java.lang.Exception -> L76
            r8.<init>(r1)     // Catch: java.lang.Exception -> L76
            a.cf1 r1 = new a.cf1     // Catch: java.lang.Exception -> L76
            r3 = 0
            r1.<init>(r8, r3)     // Catch: java.lang.Exception -> L76
            java.util.concurrent.FutureTask r8 = new java.util.concurrent.FutureTask     // Catch: java.lang.Exception -> L76
            r8.<init>(r1)     // Catch: java.lang.Exception -> L76
            a.k20 r1 = a.z80.b     // Catch: java.lang.Exception -> L76
            a.ay r1 = a.wv.b(r1)     // Catch: java.lang.Exception -> L76
            a.ff1 r3 = new a.ff1     // Catch: java.lang.Exception -> L76
            r4 = 0
            r3.<init>(r8, r4)     // Catch: java.lang.Exception -> L76
            r5 = 3
            a.wv.M0(r1, r4, r3, r5)     // Catch: java.lang.Exception -> L76
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Exception -> L76
            r5 = 3
            java.lang.Object r8 = r8.get(r5, r1)     // Catch: java.lang.Exception -> L76
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Exception -> L76
            if (r8 == 0) goto L56
            java.lang.CharSequence r8 = a.yi1.F2(r8)     // Catch: java.lang.Exception -> L76
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Exception -> L76
            goto L57
        L56:
            r8 = r4
        L57:
            if (r8 == 0) goto L76
            int r1 = r8.length()     // Catch: java.lang.Exception -> L76
            if (r1 != 0) goto L60
            goto L76
        L60:
            a.jo0 r1 = r7.h     // Catch: java.lang.Exception -> L76
            boolean r3 = r1.C     // Catch: java.lang.Exception -> L76
            if (r3 != 0) goto L76
            a.zx0 r3 = a.by0.f57a     // Catch: java.lang.Exception -> L76
            a.zn0 r5 = new a.zn0     // Catch: java.lang.Exception -> L76
            r5.<init>(r1, r8, r4)     // Catch: java.lang.Exception -> L76
            r7.g = r2     // Catch: java.lang.Exception -> L76
            java.lang.Object r8 = a.wv.S1(r3, r5, r7)     // Catch: java.lang.Exception -> L76
            if (r8 != r0) goto L76
            return r0
        L76:
            a.no1 r8 = a.no1.f387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: a.ao0.e(java.lang.Object):java.lang.Object");
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        return ((a.ao0) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
