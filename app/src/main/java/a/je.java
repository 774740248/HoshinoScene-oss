package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class je extends a.lj1 implements a.fp0 {
    public final /* synthetic */ com.omarea.vtools.activities.ActivityQuickStart g;
    public final /* synthetic */ android.content.Intent h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public je(android.content.Intent intent, com.omarea.vtools.activities.ActivityQuickStart activityQuickStart, a.ey eyVar) {
        super(2, eyVar);
        this.g = activityQuickStart;
        this.h = intent;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.je(this.h, this.g, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        com.omarea.vtools.activities.ActivityQuickStart activityQuickStart = this.g;
        a.b20.q1(obj);
        try {
            activityQuickStart.startActivity(this.h);
        } catch (java.lang.SecurityException unused) {
            a.q10 q10Var = a.q10.f457a;
            if (a.wv.e(a.q10.t(), "basic")) {
                android.widget.Toast.makeText(activityQuickStart.getApplicationContext(), activityQuickStart.getString(2131952285), 1).show();
            } else {
                java.lang.String i = a.ai1.i("am start -n '", activityQuickStart.a(), "/", activityQuickStart.e, "'");
                a.wv.w(i, "shell");
                a.q10.l(i);
            }
        } catch (java.lang.Exception unused2) {
            java.lang.String i2 = a.ai1.i("am start -n '", activityQuickStart.a(), "/", activityQuickStart.e, "'");
            a.wv.w(i2, "shell");
            a.q10 q10Var2 = a.q10.f457a;
            a.q10.l(i2);
        }
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        a.je jeVar = (a.je) a((a.cz) obj, (a.ey) obj2);
        a.no1 no1Var = a.no1.f387a;
        jeVar.e(no1Var);
        return no1Var;
    }
}
