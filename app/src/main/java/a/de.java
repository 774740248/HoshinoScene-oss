package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class de extends a.lj1 implements a.fp0 {
    public final /* synthetic */ com.omarea.model.ProcessInfo g;
    public final /* synthetic */ com.omarea.vtools.activities.ActivityProcess h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public de(com.omarea.model.ProcessInfo processInfo, com.omarea.vtools.activities.ActivityProcess activityProcess, a.ey eyVar) {
        super(2, eyVar);
        this.g = processInfo;
        this.h = activityProcess;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.de(this.g, this.h, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.b20.q1(obj);
        com.omarea.vtools.activities.ActivityProcess activityProcess = this.h;
        com.omarea.model.ProcessInfo processInfo = this.g;
        if (processInfo != null) {
            try {
                com.omarea.vtools.activities.ActivityProcess.p(activityProcess, processInfo);
            } catch (java.lang.Throwable th) {
                a.b20.I(th);
            }
        } else {
            android.widget.Toast.makeText(activityProcess, activityProcess.getString(2131953274), 0).show();
        }
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        a.de deVar = (a.de) a((a.cz) obj, (a.ey) obj2);
        a.no1 no1Var = a.no1.f387a;
        deVar.e(no1Var);
        return no1Var;
    }
}
