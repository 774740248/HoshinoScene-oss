package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public class wt0 implements a.nt0, a.su, a.p41 {

    public wt0() {
        this(false);
    }
    public static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater c = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(a.wt0.class, java.lang.Object.class, "_state");
    public static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater d = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(a.wt0.class, java.lang.Object.class, "_parentHandle");
    private volatile java.lang.Object _parentHandle;
    private volatile java.lang.Object _state;

    public wt0(boolean z) {
        this._state = z ? a.wv.w : a.wv.v;
    }

    public static a.pu K(a.lx0 lx0Var) {
        while (lx0Var.m()) {
            a.lx0 h = lx0Var.h();
            if (h == null) {
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a.lx0.d;
                java.lang.Object obj = atomicReferenceFieldUpdater.get(lx0Var);
                while (true) {
                    lx0Var = (a.lx0) obj;
                    if (!lx0Var.m()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(lx0Var);
                }
            } else {
                lx0Var = h;
            }
        }
        while (true) {
            lx0Var = lx0Var.l();
            if (!lx0Var.m()) {
                if (lx0Var instanceof a.pu) {
                    return (a.pu) lx0Var;
                }
                if (lx0Var instanceof a.d21) {
                    return null;
                }
            }
        }
    }

    public static java.lang.String Q(java.lang.Object obj) {
        if (!(obj instanceof a.ut0)) {
            return obj instanceof a.as0 ? ((a.as0) obj).a() ? "Active" : "New" : obj instanceof a.dw ? "Cancelled" : "Completed";
        }
        a.ut0 ut0Var = (a.ut0) obj;
        return ut0Var.d() ? "Cancelling" : ut0Var.e() ? "Completing" : "Active";
    }

    public boolean A() {
        return this instanceof a.aw;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [a.lx0, a.d21] */
    public final a.d21 B(a.as0 as0Var) {
        a.d21 f = as0Var.f();
        if (f != null) {
            return f;
        }
        if (as0Var instanceof a.mb0) {
            return new a.lx0();
        }
        if (as0Var instanceof a.rt0) {
            O((a.rt0) as0Var);
            return null;
        }
        throw new java.lang.IllegalStateException(("State should have list: " + as0Var).toString());
    }

    public final java.lang.Object C() {
        while (true) {
            java.lang.Object obj = c.get(this);
            if (!(obj instanceof a.l31)) {
                return obj;
            }
            ((a.l31) obj).a(this);
        }
    }

    public boolean D(java.lang.Throwable th) {
        return false;
    }

    public void E(a.fk0 fk0Var) {
        throw fk0Var;
    }

    public final void F(a.nt0 nt0Var) {
        int P;
        a.e21 e21Var = a.e21.c;
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d;
        if (nt0Var == null) {
            atomicReferenceFieldUpdater.set(this, e21Var);
            return;
        }
        a.wt0 wt0Var = (a.wt0) nt0Var;
        do {
            P = wt0Var.P(wt0Var.C());
            if (P == 0) {
                break;
            }
        } while (P != 1);
        a.ou ouVar = (a.ou) a.wv.C0(wt0Var, true, new a.pu(this), 2);
        atomicReferenceFieldUpdater.set(this, ouVar);
        if (!(C() instanceof a.as0)) {
            ouVar.c();
            atomicReferenceFieldUpdater.set(this, e21Var);
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [a.lx0, a.d21] */
    public final a.c90 G(boolean z, boolean z2, a.rt0 rt0Var) {
        a.rt0 rt0Var2;
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        java.lang.Throwable th;
        if (z) {
            rt0Var2 = rt0Var instanceof a.pt0 ? (a.pt0) rt0Var : null;
            if (rt0Var2 == null) {
                rt0Var2 = new a.xs0(rt0Var);
            }
        } else {
            rt0Var2 = rt0Var;
        }
        rt0Var2.f = this;
        while (true) {
            java.lang.Object C = C();
            if (C instanceof a.mb0) {
                a.mb0 mb0Var = (a.mb0) C;
                if (mb0Var.c) {
                    java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = c;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, C, rt0Var2)) {
                        if (atomicReferenceFieldUpdater2.get(this) != C) {
                            break;
                        }
                    }
                    return rt0Var2;
                }
                a.lx0 lx0Var = new a.lx0();
                a.zr0 zr0Var = mb0Var.c ? lx0Var : new a.zr0((d21) lx0Var);
                do {
                    atomicReferenceFieldUpdater = c;
                    if (atomicReferenceFieldUpdater.compareAndSet(this, mb0Var, zr0Var)) {
                        break;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == mb0Var);
            } else {
                if (!(C instanceof a.as0)) {
                    if (z2) {
                        a.dw dwVar = C instanceof a.dw ? (a.dw) C : null;
                        rt0Var.i(dwVar != null ? dwVar.f110a : null);
                    }
                    return a.e21.c;
                }
                a.d21 f = ((a.as0) C).f();
                if (f == null) {
                    a.wv.t(C, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    O((a.rt0) C);
                } else {
                    a.c90 c90Var = a.e21.c;
                    if (z && (C instanceof a.ut0)) {
                        synchronized (C) {
                            try {
                                th = ((a.ut0) C).c();
                                if (th != null) {
                                    if ((rt0Var instanceof a.pu) && !((a.ut0) C).e()) {
                                    }
                                }
                                if (l(C, f, rt0Var2)) {
                                    if (th == null) {
                                        return rt0Var2;
                                    }
                                    c90Var = rt0Var2;
                                }
                            } catch (java.lang.Throwable th2) {
                                throw th2;
                            }
                        }
                    } else {
                        th = null;
                    }
                    if (th != null) {
                        if (z2) {
                            rt0Var.i(th);
                        }
                        return c90Var;
                    }
                    if (l(C, f, rt0Var2)) {
                        return rt0Var2;
                    }
                }
            }
        }
    }

    public boolean H() {
        return this instanceof a.tr;
    }

    public final java.lang.Object I(java.lang.Object obj) {
        java.lang.Object R;
        do {
            R = R(C(), obj);
            if (R == a.wv.q) {
                java.lang.String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                a.dw dwVar = obj instanceof a.dw ? (a.dw) obj : null;
                throw new java.lang.IllegalStateException(str, dwVar != null ? dwVar.f110a : null);
            }
        } while (R == a.wv.s);
        return R;
    }

    public java.lang.String J() {
        return getClass().getSimpleName();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Throwable, a.fk0] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.RuntimeException] */
    /* JADX WARN: Type inference failed for: r1v5 */
    public final void L(a.d21 d21Var, java.lang.Throwable th) {
        java.lang.RuntimeException k = (RuntimeException) d21Var.k();
        a.wv.t(k, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        a.lx0 lx0Var = (a.lx0) k;
        a.fk0 fk0Var = null;
        while (!a.wv.e(lx0Var, d21Var)) {
            if (lx0Var instanceof a.pt0) {
                a.rt0 rt0Var = (a.rt0) lx0Var;
                try {
                    rt0Var.o(th);
                } catch (java.lang.Throwable th2) {
                    if (fk0Var != null) {
                        a.b20.b(fk0Var, th2);
                    } else {
                        fk0Var = (fk0) new java.lang.RuntimeException("Exception in completion handler " + rt0Var + " for " + this, th2);
                    }
                }
            }
            lx0Var = lx0Var.l();
            fk0Var = fk0Var;
        }
        if (fk0Var != null) {
            E(fk0Var);
        }
        q(th);
    }

    public void M(java.lang.Object obj) {
    }

    public void N() {
    }

    public final void O(a.rt0 rt0Var) {
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        a.lx0 lx0Var = new a.lx0();
        rt0Var.getClass();
        a.lx0.d.lazySet(lx0Var, rt0Var);
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = a.lx0.c;
        atomicReferenceFieldUpdater2.lazySet(lx0Var, rt0Var);
        loop0: while (true) {
            if (rt0Var.k() != rt0Var) {
                break;
            }
            while (!atomicReferenceFieldUpdater2.compareAndSet(rt0Var, rt0Var, lx0Var)) {
                if (atomicReferenceFieldUpdater2.get(rt0Var) != rt0Var) {
                    break;
                }
            }
            lx0Var.j(rt0Var);
        }
        a.lx0 l = rt0Var.l();
        do {
            atomicReferenceFieldUpdater = c;
            if (atomicReferenceFieldUpdater.compareAndSet(this, rt0Var, l)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == rt0Var);
    }

    public final int P(java.lang.Object obj) {
        boolean z = obj instanceof a.mb0;
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c;
        if (z) {
            if (((a.mb0) obj).c) {
                return 0;
            }
            a.mb0 mb0Var = a.wv.w;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, mb0Var)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            N();
            return 1;
        }
        if (!(obj instanceof a.zr0)) {
            return 0;
        }
        a.d21 d21Var = ((a.zr0) obj).c;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, d21Var)) {
            if (atomicReferenceFieldUpdater.get(this) != obj) {
                return -1;
            }
        }
        N();
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00cb, code lost:
    
        if (r2 != null) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00db, code lost:
    
        if (a.wv.C0(r2.g, false, new a.tt0(r6, r1, r2, r8), 1) == a.e21.c) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00e0, code lost:
    
        r2 = K(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00e4, code lost:
    
        if (r2 != null) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:?, code lost:
    
        return a.wv.r;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00ea, code lost:
    
        return v(r1, r8);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object R(java.lang.Object r7, java.lang.Object r8) {
        /*
            Method dump skipped, instructions count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.wt0.R(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    @Override // a.nt0
    public boolean a() {
        java.lang.Object C = C();
        return (C instanceof a.as0) && ((a.as0) C).a();
    }

    @Override // a.ty
    public final a.ty c(a.ty tyVar) {
        a.wv.w(tyVar, "context");
        return a.wv.Z0(this, tyVar);
    }

    @Override // a.ty
    public final a.ty d(a.sy syVar) {
        return a.wv.R0(this, syVar);
    }

    public java.lang.Object e() {
        return x();
    }

    @Override // a.ty
    public final a.ry g(a.sy syVar) {
        return a.wv.Y(this, syVar);
    }

    @Override // a.ry
    public final a.sy getKey() {
        return a.gy.f;
    }

    public java.lang.Object i(a.ey eyVar) {
        return o(eyVar);
    }

    @Override // a.ty
    public final java.lang.Object k(java.lang.Object obj, a.fp0 fp0Var) {
        return fp0Var.g(obj, this);
    }

    public final boolean l(java.lang.Object obj, a.d21 d21Var, a.rt0 rt0Var) {
        char c2;
        a.vt0 vt0Var = new a.vt0(rt0Var, this, obj);
        do {
            a.lx0 h = d21Var.h();
            if (h == null) {
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a.lx0.d;
                java.lang.Object obj2 = atomicReferenceFieldUpdater.get(d21Var);
                while (true) {
                    h = (a.lx0) obj2;
                    if (!h.m()) {
                        break;
                    }
                    obj2 = atomicReferenceFieldUpdater.get(h);
                }
            }
            a.lx0.d.lazySet(rt0Var, h);
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = a.lx0.c;
            atomicReferenceFieldUpdater2.lazySet(rt0Var, d21Var);
            vt0Var.c = d21Var;
            while (true) {
                if (atomicReferenceFieldUpdater2.compareAndSet(h, d21Var, vt0Var)) {
                    c2 = vt0Var.a(h) == null ? (char) 1 : (char) 2;
                } else if (atomicReferenceFieldUpdater2.get(h) != d21Var) {
                    c2 = 0;
                    break;
                }
            }
            if (c2 == 1) {
                return true;
            }
        } while (c2 != 2);
        return false;
    }

    public void m(java.lang.Object obj) {
    }

    public void n(java.lang.Object obj) {
        m(obj);
    }

    public final java.lang.Object o(a.ey eyVar) {
        java.lang.Object C;
        do {
            C = C();
            if (!(C instanceof a.as0)) {
                if (C instanceof a.dw) {
                    throw ((a.dw) C).f110a;
                }
                return a.wv.P1(C);
            }
        } while (P(C) < 0);
        a.st0 st0Var = new a.st0(a.wv.B0(eyVar), this);
        st0Var.p();
        st0Var.r(new a.d90(0, G(false, true, new a.e90(2, st0Var))));
        return st0Var.o();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0032, code lost:
    
        r0 = a.wv.q;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
    
        if (r0 != a.wv.r) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0038, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0020, code lost:
    
        r0 = R(r0, new a.dw(u(r10), false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
    
        if (r0 == a.wv.s) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003b, code lost:
    
        if (r0 != a.wv.q) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003d, code lost:
    
        r0 = null;
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003f, code lost:
    
        r4 = C();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0045, code lost:
    
        if ((r4 instanceof a.ut0) == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008e, code lost:
    
        if ((r4 instanceof a.as0) == false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0090, code lost:
    
        if (r1 != null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0092, code lost:
    
        r1 = u(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0096, code lost:
    
        r5 = (a.as0) r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2:0x0008, code lost:
    
        if (A() != false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x009d, code lost:
    
        if (r5.a() == false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c1, code lost:
    
        r5 = R(r4, new a.dw(r1, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00cc, code lost:
    
        if (r5 == a.wv.q) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d0, code lost:
    
        if (r5 == a.wv.s) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d2, code lost:
    
        r0 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000a, code lost:
    
        r0 = C();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00eb, code lost:
    
        throw new java.lang.IllegalStateException(("Cannot happen in " + r4).toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x009f, code lost:
    
        r6 = B(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a3, code lost:
    
        if (r6 != null) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a6, code lost:
    
        r7 = new a.ut0(r6, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ab, code lost:
    
        r4 = a.wt0.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b1, code lost:
    
        if (r4.compareAndSet(r9, r5, r7) == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
    
        if ((r0 instanceof a.as0) == false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00bd, code lost:
    
        if (r4.get(r9) == r5) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00b3, code lost:
    
        L(r6, r1);
        r10 = a.wv.q;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0058, code lost:
    
        r0 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00ec, code lost:
    
        r10 = a.wv.t;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0047, code lost:
    
        monitor-enter(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0053, code lost:
    
        if (a.ut0.f.get((a.ut0) r4) != a.wv.u) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0055, code lost:
    
        r10 = a.wv.t;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0057, code lost:
    
        monitor-exit(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x005b, code lost:
    
        r5 = ((a.ut0) r4).d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0062, code lost:
    
        if (r1 != null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0064, code lost:
    
        r1 = u(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0014, code lost:
    
        if ((r0 instanceof a.ut0) == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x006b, code lost:
    
        ((a.ut0) r4).b(r1);
        r10 = ((a.ut0) r4).c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x007a, code lost:
    
        if ((!r5) == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x007c, code lost:
    
        r0 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x007d, code lost:
    
        monitor-exit(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x007e, code lost:
    
        if (r0 == null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0080, code lost:
    
        L(((a.ut0) r4).c, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0087, code lost:
    
        r10 = a.wv.q;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0069, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x008b, code lost:
    
        throw r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00f2, code lost:
    
        if (r0 != a.wv.q) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0104, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x00f8, code lost:
    
        if (r0 != a.wv.r) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x00fd, code lost:
    
        if (r0 != a.wv.t) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0100, code lost:
    
        m(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        if (((a.ut0) r0).e() == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:?, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean p(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.wt0.p(java.lang.Object):boolean");
    }

    public final boolean q(java.lang.Throwable th) {
        if (H()) {
            return true;
        }
        boolean z = th instanceof java.util.concurrent.CancellationException;
        a.ou ouVar = (a.ou) d.get(this);
        return (ouVar == null || ouVar == a.e21.c) ? z : ouVar.e(th) || z;
    }

    public java.lang.String r() {
        return "Job was cancelled";
    }

    public boolean s(java.lang.Throwable th) {
        if (th instanceof java.util.concurrent.CancellationException) {
            return true;
        }
        return p(th) && z();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [a.fk0, java.lang.RuntimeException] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Throwable, a.fk0] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.RuntimeException] */
    /* JADX WARN: Type inference failed for: r1v8 */
    public final void t(a.as0 as0Var, java.lang.Object obj) {
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d;
        a.ou ouVar = (a.ou) atomicReferenceFieldUpdater.get(this);
        if (ouVar != null) {
            ouVar.c();
            atomicReferenceFieldUpdater.set(this, a.e21.c);
        }
        a.fk0 fk0Var = null;
        a.dw dwVar = obj instanceof a.dw ? (a.dw) obj : null;
        java.lang.Throwable th = dwVar != null ? dwVar.f110a : null;
        if (as0Var instanceof a.rt0) {
            try {
                ((a.rt0) as0Var).o(th);
                return;
            } catch (java.lang.Throwable th2) {
                E((fk0) new java.lang.RuntimeException("Exception in completion handler " + as0Var + " for " + this, th2));
                return;
            }
        }
        a.d21 f = as0Var.f();
        if (f != null) {
            java.lang.RuntimeException k = (RuntimeException) f.k();
            a.wv.t(k, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            a.lx0 lx0Var = (a.lx0) k;
            while (!a.wv.e(lx0Var, f)) {
                if (lx0Var instanceof a.rt0) {
                    a.rt0 rt0Var = (a.rt0) lx0Var;
                    try {
                        rt0Var.o(th);
                    } catch (java.lang.Throwable th3) {
                        if (fk0Var != null) {
                            a.b20.b(fk0Var, th3);
                        } else {
                            fk0Var = (fk0) new java.lang.RuntimeException("Exception in completion handler " + rt0Var + " for " + this, th3);
                        }
                    }
                }
                lx0Var = lx0Var.l();
                fk0Var = fk0Var;
            }
            if (fk0Var != null) {
                E(fk0Var);
            }
        }
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(J() + '{' + Q(C()) + '}');
        sb.append('@');
        sb.append(a.b20.b0(this));
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Throwable] */
    public final java.lang.Throwable u(java.lang.Object obj) {
        java.util.concurrent.CancellationException cancellationException;
        if (obj instanceof java.lang.Throwable) {
            return (java.lang.Throwable) obj;
        }
        a.wt0 wt0Var = (a.wt0) ((a.p41) obj);
        java.lang.Throwable C = (Throwable) wt0Var.C();
        if ((ut0) C instanceof a.ut0) {
            cancellationException = (ut0) ((a.ut0) C).c();
        } else if ((dw) C instanceof a.dw) {
            cancellationException = (dw) ((a.dw) C).f110a;
        } else {
            if (C instanceof a.as0) {
                throw new java.lang.IllegalStateException(("Cannot be cancelling child in this state: " + C).toString());
            }
            cancellationException = null;
        }
        java.util.concurrent.CancellationException cancellationException2 = cancellationException instanceof java.util.concurrent.CancellationException ? cancellationException : null;
        if (cancellationException2 == null) {
            cancellationException2 = new a.ot0("Parent job is ".concat(Q(C)), cancellationException, wt0Var);
        }
        return cancellationException2;
    }

    public final java.lang.Object v(a.ut0 ut0Var, java.lang.Object obj) {
        java.lang.Throwable y;
        a.dw dwVar = obj instanceof a.dw ? (a.dw) obj : null;
        java.lang.Throwable th = dwVar != null ? dwVar.f110a : null;
        synchronized (ut0Var) {
            ut0Var.d();
            java.util.ArrayList<java.lang.Throwable> g = ut0Var.g(th);
            y = y(ut0Var, g);
            if (y != null && g.size() > 1) {
                java.util.Set newSetFromMap = java.util.Collections.newSetFromMap(new java.util.IdentityHashMap(g.size()));
                for (java.lang.Throwable th2 : g) {
                    if (th2 != y && th2 != y && !(th2 instanceof java.util.concurrent.CancellationException) && newSetFromMap.add(th2)) {
                        a.b20.b(y, th2);
                    }
                }
            }
        }
        if (y != null && y != th) {
            obj = new a.dw(y, false);
        }
        if (y != null && (q(y) || D(y))) {
            a.wv.t(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            a.dw.b.compareAndSet((a.dw) obj, 0, 1);
        }
        M(obj);
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c;
        java.lang.Object bs0Var = obj instanceof a.as0 ? new a.bs0((a.as0) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, ut0Var, bs0Var) && atomicReferenceFieldUpdater.get(this) == ut0Var) {
        }
        t(ut0Var, obj);
        return obj;
    }

    public final java.util.concurrent.CancellationException w() {
        java.util.concurrent.CancellationException cancellationException;
        java.lang.Object C = C();
        if (!(C instanceof a.ut0)) {
            if (C instanceof a.as0) {
                throw new java.lang.IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (!(C instanceof a.dw)) {
                return new a.ot0(getClass().getSimpleName().concat(" has completed normally"), null, this);
            }
            java.lang.Throwable th = ((a.dw) C).f110a;
            cancellationException = th instanceof java.util.concurrent.CancellationException ? (java.util.concurrent.CancellationException) th : null;
            return cancellationException == null ? new a.ot0(r(), th, this) : cancellationException;
        }
        java.lang.Throwable c2 = ((a.ut0) C).c();
        if (c2 == null) {
            throw new java.lang.IllegalStateException(("Job is still new or active: " + this).toString());
        }
        java.lang.String concat = getClass().getSimpleName().concat(" is cancelling");
        cancellationException = c2 instanceof java.util.concurrent.CancellationException ? (java.util.concurrent.CancellationException) c2 : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        if (concat == null) {
            concat = r();
        }
        return new a.ot0(concat, c2, this);
    }

    public final java.lang.Object x() {
        java.lang.Object C = C();
        if (!(!(C instanceof a.as0))) {
            throw new java.lang.IllegalStateException("This job has not completed yet".toString());
        }
        if (C instanceof a.dw) {
            throw ((a.dw) C).f110a;
        }
        return a.wv.P1(C);
    }

    public final java.lang.Throwable y(a.ut0 ut0Var, java.util.ArrayList arrayList) {
        java.lang.Object obj;
        java.lang.Object obj2 = null;
        if (arrayList.isEmpty()) {
            if (ut0Var.d()) {
                return new a.ot0(r(), null, this);
            }
            return null;
        }
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (!(((java.lang.Throwable) obj) instanceof java.util.concurrent.CancellationException)) {
                break;
            }
        }
        java.lang.Throwable th = (java.lang.Throwable) obj;
        if (th != null) {
            return th;
        }
        java.lang.Throwable th2 = (java.lang.Throwable) arrayList.get(0);
        if (th2 instanceof a.jm1) {
            java.util.Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                java.lang.Object next = it2.next();
                java.lang.Throwable th3 = (java.lang.Throwable) next;
                if (th3 != th2 && (th3 instanceof a.jm1)) {
                    obj2 = next;
                    break;
                }
            }
            java.lang.Throwable th4 = (java.lang.Throwable) obj2;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    public boolean z() {
        return true;
    }
}
