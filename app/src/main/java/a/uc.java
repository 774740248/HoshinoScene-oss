package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class uc extends a.lj1 implements a.fp0 {
    public int g;
    public final /* synthetic */ com.omarea.vtools.activities.ActivityPerfOptions h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uc(com.omarea.vtools.activities.ActivityPerfOptions activityPerfOptions, a.ey eyVar) {
        super(2, eyVar);
        this.h = activityPerfOptions;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.uc(this.h, eyVar);
    }

    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object, a.ma1] */
    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.dz dzVar = a.dz.c;
        int i = this.g;
        if (i == 0) {
            a.b20.q1(obj);
            a.ma1 obj2 = new a.ma1();
            com.omarea.vtools.activities.ActivityPerfOptions activityPerfOptions = this.h;
            android.content.Intent intent = activityPerfOptions.getIntent();
            if (intent == null || !intent.hasExtra("dir")) {
                android.content.Intent intent2 = activityPerfOptions.getIntent();
                if (intent2 == null || !intent2.hasExtra("configJson")) {
                    android.content.Intent intent3 = activityPerfOptions.getIntent();
                    if (intent3 != null && intent3.hasExtra("config")) {
                        obj2.c = activityPerfOptions.o(a.b20.m0(activityPerfOptions, activityPerfOptions.getIntent().getIntExtra("config", 2131886089)));
                    }
                } else {
                    java.lang.String stringExtra = activityPerfOptions.getIntent().getStringExtra("configJson");
                    a.wv.s(stringExtra);
                    obj2.c = activityPerfOptions.o(stringExtra);
                }
            } else {
                java.lang.String stringExtra2 = activityPerfOptions.getIntent().getStringExtra("dir");
                a.wv.s(stringExtra2);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                a.sj1 sj1Var = new a.sj1();
                java.util.ArrayList I = a.gy.I(stringExtra2, false);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (java.lang.Object obj3 : I) {
                    a.mc1 mc1Var = (a.mc1) obj3;
                    if (!mc1Var.f343a && !a.wv.e(mc1Var.b, "uevent")) {
                        arrayList2.add(obj3);
                    }
                }
                sj1Var.f526a = stringExtra2;
                java.util.Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    a.mc1 mc1Var2 = (a.mc1) it.next();
                    java.util.ArrayList arrayList3 = sj1Var.c;
                    a.tj1 tj1Var = new a.tj1();
                    tj1Var.f559a = mc1Var2.b;
                    java.lang.String str = mc1Var2.c;
                    a.wv.w(str, "<set-?>");
                    tj1Var.c = str;
                    arrayList3.add(tj1Var);
                }
                arrayList.add(sj1Var);
                obj2.c = arrayList;
            }
            a.u20 u20Var = a.z80.f728a;
            a.zx0 zx0Var = a.by0.f57a;
            a.tc tcVar = new a.tc(activityPerfOptions, obj2, null);
            this.g = 1;
            if (a.wv.S1(zx0Var, tcVar, this) == dzVar) {
                return dzVar;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a.b20.q1(obj);
        }
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        return ((a.uc) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
