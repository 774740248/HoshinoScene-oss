package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class db0 implements android.text.method.KeyListener {

    /* renamed from: a, reason: collision with root package name */
    public final android.text.method.KeyListener f92a;
    public final a.fa0 b;

    public db0(android.text.method.KeyListener keyListener) {
        a.fa0 fa0Var = new a.fa0(15, (java.lang.Object) null);
        this.f92a = keyListener;
        this.b = fa0Var;
    }

    @Override // android.text.method.KeyListener
    public final void clearMetaKeyState(android.view.View view, android.text.Editable editable, int i) {
        this.f92a.clearMetaKeyState(view, editable, i);
    }

    @Override // android.text.method.KeyListener
    public final int getInputType() {
        return this.f92a.getInputType();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    @Override // android.text.method.KeyListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onKeyDown(android.view.View r4, android.text.Editable r5, int r6, android.view.KeyEvent r7) {
        /*
            r3 = this;
            a.fa0 r0 = r3.b
            r0.getClass()
            java.lang.Object r0 = a.ta0.i
            r0 = 67
            r1 = 1
            r2 = 0
            if (r6 == r0) goto L17
            r0 = 112(0x70, float:1.57E-43)
            if (r6 == r0) goto L12
            goto L21
        L12:
            boolean r0 = a.gb0.c(r5, r7, r1)
            goto L1b
        L17:
            boolean r0 = a.gb0.c(r5, r7, r2)
        L1b:
            if (r0 == 0) goto L21
            android.text.method.MetaKeyKeyListener.adjustMetaAfterKeypress(r5)
            goto L2b
        L21:
            android.text.method.KeyListener r0 = r3.f92a
            boolean r4 = r0.onKeyDown(r4, r5, r6, r7)
            if (r4 == 0) goto L2a
            goto L2b
        L2a:
            r1 = r2
        L2b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: a.db0.onKeyDown(android.view.View, android.text.Editable, int, android.view.KeyEvent):boolean");
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyOther(android.view.View view, android.text.Editable editable, android.view.KeyEvent keyEvent) {
        return this.f92a.onKeyOther(view, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyUp(android.view.View view, android.text.Editable editable, int i, android.view.KeyEvent keyEvent) {
        return this.f92a.onKeyUp(view, editable, i, keyEvent);
    }
}
