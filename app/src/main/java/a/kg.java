package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class kg extends a.lj1 implements a.fp0 {
    public final /* synthetic */ com.omarea.vtools.activities.ActivityThreadsStat g;
    public final /* synthetic */ android.graphics.drawable.Drawable h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kg(com.omarea.vtools.activities.ActivityThreadsStat activityThreadsStat, android.graphics.drawable.Drawable drawable, a.ey eyVar) {
        super(2, eyVar);
        this.g = activityThreadsStat;
        this.h = drawable;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.kg(this.g, this.h, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.b20.q1(obj);
        a.gu0[] gu0VarArr = com.omarea.vtools.activities.ActivityThreadsStat.s;
        com.omarea.vtools.activities.ActivityThreadsStat activityThreadsStat = this.g;
        activityThreadsStat.getClass();
        ((android.widget.ImageView) activityThreadsStat.j.a(com.omarea.vtools.activities.ActivityThreadsStat.s[7])).setImageDrawable(this.h);
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        a.kg kgVar = (a.kg) a((a.cz) obj, (a.ey) obj2);
        a.no1 no1Var = a.no1.f387a;
        kgVar.e(no1Var);
        return no1Var;
    }
}
