package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class dg0 extends a.lj1 implements a.fp0 {
    public int g;
    public final /* synthetic */ a.fg0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dg0(a.fg0 fg0Var, a.ey eyVar) {
        super(2, eyVar);
        this.h = fg0Var;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.dg0(this.h, eyVar);
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [a.ka1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object, a.ma1] */
    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.dz dzVar = a.dz.c;
        int i = this.g;
        a.no1 no1Var = a.no1.f387a;
        if (i == 0) {
            a.b20.q1(obj);
            this.g = 1;
            final a.fg0 fg0Var = this.h;
            int i2 = fg0Var.s + 1;
            fg0Var.s = i2;
            fg0Var.s = i2 % 4;
            int i3 = 0;
            if (fg0Var.l < 1) {
                fg0Var.r.getClass();
                fg0Var.l = a.ls.f();
                java.util.ArrayList d = a.ls.d();
                a.wv.v(d, "cpuFrequencyUtils.clusterInfo");
                fg0Var.m = d;
                com.omarea.ui.CpuChartBarView cpuChartBarView = fg0Var.e;
                if (cpuChartBarView != null) {
                    cpuChartBarView.setMaxHistory(fg0Var.l);
                    cpuChartBarView.setMinAlpha(225);
                    cpuChartBarView.setMaxAlpha(225);
                    cpuChartBarView.setAccentColor(cpuChartBarView.getContext().getColor(2131099706));
                }
                com.omarea.ui.CpuChartBarView cpuChartBarView2 = fg0Var.f;
                if (cpuChartBarView2 != null) {
                    cpuChartBarView2.setMaxHistory(2);
                    cpuChartBarView2.setMinAlpha(225);
                    cpuChartBarView2.setMaxAlpha(225);
                    cpuChartBarView2.setAccentColor(cpuChartBarView2.getContext().getColor(2131099706));
                }
                int i4 = fg0Var.l;
                java.lang.Integer[] numArr = new java.lang.Integer[i4];
                for (int i5 = 0; i5 < i4; i5++) {
                    numArr[i5] = new java.lang.Integer(0);
                }
                fg0Var.x = numArr;
                int size = fg0Var.m.size();
                java.lang.Integer[] numArr2 = new java.lang.Integer[size];
                for (int i6 = 0; i6 < size; i6++) {
                    numArr2[i6] = new java.lang.Integer(0);
                }
                fg0Var.y = numArr2;
            }
            fg0Var.o.getClass();
            final a.k11 b = a.m11.b();
            if (b != null) {
                java.lang.Double[] dArr = b.f278a;
                int i7 = fg0Var.l;
                int i8 = 0;
                while (true) {
                    java.lang.Throwable th = null;
                    if (i8 < i7) {
                        java.lang.Integer[] numArr3 = fg0Var.x;
                        if (numArr3 == null) {
                            a.wv.M1("coreLoads");
                            throw null;
                        }
                        numArr3[i8] = new java.lang.Integer((int) dArr[i8].doubleValue());
                        i8++;
                    } else {
                        java.util.Iterator it = fg0Var.m.iterator();
                        int i9 = 0;
                        int i10 = 0;
                        while (it.hasNext()) {
                            int i11 = i9 + 1;
                            java.lang.String[] strArr = (java.lang.String[]) it.next();
                            int length = strArr.length;
                            int i12 = i3;
                            while (i3 < length) {
                                java.lang.String str = strArr[i3];
                                java.lang.Integer[] numArr4 = fg0Var.x;
                                if (numArr4 == null) {
                                    a.wv.M1("coreLoads");
                                    throw null;
                                }
                                i12 = java.lang.Math.max(i12, numArr4[i10].intValue());
                                i10++;
                                i3++;
                                th = null;
                            }
                            java.lang.Throwable th2 = th;
                            java.lang.Integer[] numArr5 = fg0Var.y;
                            if (numArr5 == null) {
                                a.wv.M1("clustersLoad");
                                throw th2;
                            }
                            numArr5[i9] = new java.lang.Integer(i12);
                            th = th2;
                            i9 = i11;
                            i3 = 0;
                        }
                        final java.lang.Object obj2 = new java.lang.Object();
                        /* TODO: jadx type unresolved, defaulted to Object */
                        int size2 = fg0Var.m.size();
                        for (int intValue = ((java.lang.Number) fg0Var.v.a()).intValue(); intValue < size2; intValue++) {
                            if (obj2.c != 0) {
                                java.lang.Integer[] numArr6 = fg0Var.y;
                                if (numArr6 == null) {
                                    a.wv.M1("clustersLoad");
                                    throw null;
                                }
                                if (numArr6[intValue].intValue() <= 1) {
                                }
                            }
                            obj2.c = java.lang.Math.max(b.b[intValue].intValue(), obj2.c);
                        }
                        final double d2 = b.e;
                        final java.lang.Object obj3 = new java.lang.Object();
                        /* TODO: jadx type unresolved, defaulted to Object */
                        if (fg0Var.s != 0) {
                            a.vj1 vj1Var = a.oq0.c;
                            obj3.c = a.oq0.e();
                        }
                        a.oq0.g(5000L);
                        if (obj3.c == null) {
                            obj3.c = a.oq0.f417a + "℃";
                        }
                        a.cp cpVar = com.omarea.Scene.c;
                        a.fs1.L(new a.bg0());
                    }
                }
            }
            if (no1Var == dzVar) {
                return dzVar;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a.b20.q1(obj);
        }
        return no1Var;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        return ((a.dg0) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
