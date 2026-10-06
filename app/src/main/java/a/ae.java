package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ae extends a.lj1 implements a.fp0 {
    public final /* synthetic */ com.omarea.model.ProcessInfo g;
    public final /* synthetic */ com.omarea.vtools.activities.ActivityProcess h;
    public final /* synthetic */ android.widget.ImageView i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ae(com.omarea.model.ProcessInfo processInfo, com.omarea.vtools.activities.ActivityProcess activityProcess, android.widget.ImageView imageView, a.ey eyVar) {
        super(2, eyVar);
        this.g = processInfo;
        this.h = activityProcess;
        this.i = imageView;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.ae(this.g, this.h, this.i, eyVar);
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, a.ma1] */
    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        java.lang.Runnable runnable;
        java.lang.Runnable runnable2;
        final int i;
        android.graphics.drawable.Drawable loadIcon;
        final com.omarea.vtools.activities.ActivityProcess activityProcess = this.h;
        final android.widget.ImageView imageView = this.i;
        a.b20.q1(obj);
        a.ma1 obj2 = new a.ma1();
        final int i2 = 1;
        try {
            java.lang.String str = this.g.name;
            a.wv.v(str, "item.name");
            i = 0;
            java.lang.String str2 = (java.lang.String) a.qv.e2(a.yi1.y2(str, new java.lang.String[]{":"}));
            a.gu0[] gu0VarArr = com.omarea.vtools.activities.ActivityProcess.x;
            android.content.pm.ApplicationInfo applicationInfo = activityProcess.r().getPackageInfo(str2, 0).applicationInfo;
            loadIcon = applicationInfo != null ? applicationInfo.loadIcon(activityProcess.r()) : null;
            obj2.c = loadIcon;
        } catch (java.lang.Exception unused) {
            if (obj2.c != null) {
                runnable2 = new a.yd();
            } else {
                runnable = new a.zd();
            }
        } catch (java.lang.Throwable th) {
            final int i3 = 2;
            if (obj2.c != null) {
                imageView.post(new a.yd());
            } else {
                imageView.post(new a.zd());
            }
            throw th;
        }
        if (loadIcon != null) {
            runnable2 = new a.yd();
            imageView.post(runnable2);
            return a.no1.f387a;
        }
        runnable = new a.zd();
        imageView.post(runnable);
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        a.ae aeVar = (a.ae) a((a.cz) obj, (a.ey) obj2);
        a.no1 no1Var = a.no1.f387a;
        aeVar.e(no1Var);
        return no1Var;
    }
}
