package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class j91 {

    /* renamed from: a, reason: collision with root package name */
    public a.d91 f250a;
    public java.util.ArrayList b;
    public long c;
    public long d;
    public long e;
    public long f;

    public static void b(a.da1 da1Var) {
        int i = da1Var.j;
        if (!da1Var.j() && (i & 4) == 0) {
            da1Var.c();
        }
    }

    public abstract boolean a(a.da1 da1Var, a.da1 da1Var2, a.i91 i91Var, a.i91 i91Var2);

    /* JADX WARN: Removed duplicated region for block: B:16:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(a.da1 r10) {
        /*
            r9 = this;
            a.d91 r0 = r9.f250a
            if (r0 == 0) goto Laf
            r1 = 1
            r10.r(r1)
            a.da1 r2 = r10.h
            r3 = 0
            if (r2 == 0) goto L13
            a.da1 r2 = r10.i
            if (r2 != 0) goto L13
            r10.h = r3
        L13:
            r10.i = r3
            int r2 = r10.j
            r2 = r2 & 16
            if (r2 == 0) goto L1d
            goto Laf
        L1d:
            androidx.recyclerview.widget.RecyclerView r0 = r0.f90a
            r0.m0()
            a.ru r2 = r0.h
            a.qu r3 = r2.b
            a.d91 r4 = r2.f506a
            int r5 = r2.d
            r6 = 0
            android.view.View r7 = r10.f91a
            if (r5 != r1) goto L3d
            android.view.View r1 = r2.e
            if (r1 != r7) goto L35
        L33:
            r1 = r6
            goto L66
        L35:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "Cannot call removeViewIfHidden within removeView(At) for a different view"
            r10.<init>(r0)
            throw r10
        L3d:
            r8 = 2
            if (r5 == r8) goto La7
            r2.d = r8     // Catch: java.lang.Throwable -> L51
            androidx.recyclerview.widget.RecyclerView r5 = r4.f90a     // Catch: java.lang.Throwable -> L51
            int r5 = r5.indexOfChild(r7)     // Catch: java.lang.Throwable -> L51
            r8 = -1
            if (r5 != r8) goto L53
            r2.l(r7)     // Catch: java.lang.Throwable -> L51
        L4e:
            r2.d = r6
            goto L66
        L51:
            r10 = move-exception
            goto La4
        L53:
            boolean r8 = r3.d(r5)     // Catch: java.lang.Throwable -> L51
            if (r8 == 0) goto L63
            r3.f(r5)     // Catch: java.lang.Throwable -> L51
            r2.l(r7)     // Catch: java.lang.Throwable -> L51
            r4.h(r5)     // Catch: java.lang.Throwable -> L51
            goto L4e
        L63:
            r2.d = r6
            goto L33
        L66:
            if (r1 == 0) goto L93
            a.da1 r2 = androidx.recyclerview.widget.RecyclerView.N(r7)
            a.t91 r3 = r0.e
            r3.l(r2)
            r3.i(r2)
            boolean r2 = androidx.recyclerview.widget.RecyclerView.E0
            if (r2 == 0) goto L93
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "after removing animated view: "
            r2.<init>(r3)
            r2.append(r7)
            java.lang.String r3 = ", "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "RecyclerView"
            android.util.Log.d(r3, r2)
        L93:
            r2 = r1 ^ 1
            r0.n0(r2)
            if (r1 != 0) goto Laf
            boolean r10 = r10.n()
            if (r10 == 0) goto Laf
            r0.removeDetachedView(r7, r6)
            goto Laf
        La4:
            r2.d = r6
            throw r10
        La7:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "Cannot call removeViewIfHidden within removeViewIfHidden"
            r10.<init>(r0)
            throw r10
        Laf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a.j91.c(a.da1):void");
    }

    public abstract void d(a.da1 da1Var);

    public abstract void e();

    public abstract boolean f();
}
