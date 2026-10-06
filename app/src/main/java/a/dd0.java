package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class dd0 extends a.ln1 {
    public static final java.lang.String[] A = {"android:visibility:visibility", "android:visibility:parent"};
    public int z;

    public dd0(int i) {
        this.z = 3;
        if ((i & (-4)) != 0) {
            throw new java.lang.IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        }
        this.z = i;
    }

    public static void H(a.sn1 sn1Var) {
        int visibility = sn1Var.b.getVisibility();
        java.util.HashMap hashMap = sn1Var.f532a;
        hashMap.put("android:visibility:visibility", java.lang.Integer.valueOf(visibility));
        android.view.View view = sn1Var.b;
        hashMap.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        hashMap.put("android:visibility:screenLocation", iArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0059 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0035  */
    /* JADX WARN: Type inference failed for: r0v0, types: [a.ls1, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static a.ls1 J(a.sn1 r8, a.sn1 r9) {
        /*
            a.ls1 r0 = new a.ls1
            r0.<init>()
            r1 = 0
            r0.f327a = r1
            r0.b = r1
            r2 = 0
            r3 = -1
            java.lang.String r4 = "android:visibility:parent"
            java.lang.String r5 = "android:visibility:visibility"
            if (r8 == 0) goto L2f
            java.util.HashMap r6 = r8.f532a
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L2f
            a.ls1 r7 = r6.get(r5)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r0.c = r7
            a.ls1 r6 = r6.get(r4)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r0.e = r6
            goto L33
        L2f:
            r0.c = r3
            r0.e = r2
        L33:
            if (r9 == 0) goto L52
            java.util.HashMap r6 = r9.f532a
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L52
            a.ls1 r2 = r6.get(r5)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.d = r2
            java.lang.Object r2 = r6.get(r4)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.f = r2
            goto L56
        L52:
            r0.d = r3
            r0.f = r2
        L56:
            r2 = 1
            if (r8 == 0) goto L8a
            if (r9 == 0) goto L8a
            int r8 = r0.c
            int r9 = r0.d
            if (r8 != r9) goto L68
            android.view.ViewGroup r3 = r0.e
            android.view.ViewGroup r4 = r0.f
            if (r3 != r4) goto L68
            goto L9f
        L68:
            if (r8 == r9) goto L78
            if (r8 != 0) goto L71
            r0.b = r1
            r0.f327a = r2
            goto L9f
        L71:
            if (r9 != 0) goto L9f
            r0.b = r2
            r0.f327a = r2
            goto L9f
        L78:
            android.view.ViewGroup r8 = r0.f
            if (r8 != 0) goto L81
            r0.b = r1
            r0.f327a = r2
            goto L9f
        L81:
            android.view.ViewGroup r8 = r0.e
            if (r8 != 0) goto L9f
            r0.b = r2
            r0.f327a = r2
            goto L9f
        L8a:
            if (r8 != 0) goto L95
            int r8 = r0.d
            if (r8 != 0) goto L95
            r0.b = r2
            r0.f327a = r2
            goto L9f
        L95:
            if (r9 != 0) goto L9f
            int r8 = r0.c
            if (r8 != 0) goto L9f
            r0.b = r1
            r0.f327a = r2
        L9f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a.dd0.J(a.sn1, a.sn1):a.ls1");
    }

    public final android.animation.ObjectAnimator I(android.view.View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        a.yr1.f718a.b0(view, f);
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(view, a.yr1.b, f2);
        ofFloat.addListener(new a.ld0(view));
        a(new a.cd0(this, 0, view));
        return ofFloat;
    }

    @Override // a.ln1
    public final void d(a.sn1 sn1Var) {
        H(sn1Var);
    }

    @Override // a.ln1
    public final void g(a.sn1 sn1Var) {
        H(sn1Var);
        sn1Var.f532a.put("android:fade:transitionAlpha", java.lang.Float.valueOf(a.yr1.f718a.a0(sn1Var.b)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0043, code lost:
    
        if (J(n(r3, false), q(r3, false)).f327a != false) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01f3  */
    @Override // a.ln1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.animation.Animator k(android.view.ViewGroup r23, a.sn1 r24, a.sn1 r25) {
        /*
            Method dump skipped, instructions count: 742
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.dd0.k(android.view.ViewGroup, a.sn1, a.sn1):android.animation.Animator");
    }

    @Override // a.ln1
    public final /* bridge */ /* synthetic */ java.lang.String[] p() {
        return A;
    }

    @Override // a.ln1
    public final boolean r(a.sn1 sn1Var, a.sn1 sn1Var2) {
        if (sn1Var == null && sn1Var2 == null) {
            return false;
        }
        if (sn1Var != null && sn1Var2 != null && sn1Var2.f532a.containsKey("android:visibility:visibility") != sn1Var.f532a.containsKey("android:visibility:visibility")) {
            return false;
        }
        a.ls1 J = J(sn1Var, sn1Var2);
        if (J.f327a) {
            return J.c == 0 || J.d == 0;
        }
        return false;
    }
}
