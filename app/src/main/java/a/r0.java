package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class r0 extends a.lj1 implements a.fp0 {
    public final /* synthetic */ android.view.accessibility.AccessibilityWindowInfo g;
    public final /* synthetic */ long h;
    public final /* synthetic */ com.omarea.vtools.AccessibilitySceneMode i;
    public final /* synthetic */ int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(android.view.accessibility.AccessibilityWindowInfo accessibilityWindowInfo, long j, com.omarea.vtools.AccessibilitySceneMode accessibilitySceneMode, int i, a.ey eyVar) {
        super(2, eyVar);
        this.g = accessibilityWindowInfo;
        this.h = j;
        this.i = accessibilitySceneMode;
        this.j = i;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.r0(this.g, this.h, this.i, this.j, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        java.lang.CharSequence packageName;
        com.omarea.vtools.AccessibilitySceneMode accessibilitySceneMode = this.i;
        a.b20.q1(obj);
        java.lang.CharSequence charSequence = null;
        try {
            android.view.accessibility.AccessibilityNodeInfo root = this.g.getRoot();
            if (root != null && (packageName = root.getPackageName()) != null) {
                accessibilitySceneMode.v.put(new java.lang.Integer(this.j), packageName.toString());
                charSequence = packageName;
            }
        } catch (java.lang.Exception unused) {
        }
        if (com.omarea.vtools.AccessibilitySceneMode.D == this.h && charSequence != null) {
            accessibilitySceneMode.c(charSequence.toString());
        }
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        a.r0 r0Var = (a.r0) a((a.cz) obj, (a.ey) obj2);
        a.no1 no1Var = a.no1.f387a;
        r0Var.e(no1Var);
        return no1Var;
    }
}
