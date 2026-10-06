package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class as extends a.oq1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.google.android.material.bottomsheet.BottomSheetBehavior f24a;

    public as(com.google.android.material.bottomsheet.BottomSheetBehavior bottomSheetBehavior) {
        this.f24a = bottomSheetBehavior;
    }

    @Override // a.oq1
    public final int d(android.view.View view, int i) {
        return view.getLeft();
    }

    @Override // a.oq1
    public final int e(android.view.View view, int i) {
        return a.wv.y(i, this.f24a.getMaxHeight(), g());
    }

    @Override // a.oq1
    public final int g() {
        com.google.android.material.bottomsheet.BottomSheetBehavior bottomSheetBehavior = this.f24a;
        return bottomSheetBehavior.I ? bottomSheetBehavior.T : bottomSheetBehavior.DEFAULT_SIGNIFICANT_VEL_THRESHOLD;
    }

    @Override // a.oq1
    public final void k(int i) {
        if (i == 1) {
            com.google.android.material.bottomsheet.BottomSheetBehavior bottomSheetBehavior = this.f24a;
            if (bottomSheetBehavior.K) {
                bottomSheetBehavior.B(1);
            }
        }
    }

    @Override // a.oq1
    public final void l(android.view.View view, int i, int i2) {
        this.f24a.dispatchOnSlide(i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0019, code lost:
    
        if (r7 > r4.STATE_EXPANDED) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0069, code lost:
    
        if (java.lang.Math.abs(r6.getTop() - r4.getExpandedOffset()) < java.lang.Math.abs(r6.getTop() - r4.STATE_EXPANDED)) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0097, code lost:
    
        if (java.lang.Math.abs(r7 - r4.STATE_EXPANDED) < java.lang.Math.abs(r7 - r4.DEFAULT_SIGNIFICANT_VEL_THRESHOLD)) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b1, code lost:
    
        if (java.lang.Math.abs(r7 - r4.STATE_SETTLING) < java.lang.Math.abs(r7 - r4.DEFAULT_SIGNIFICANT_VEL_THRESHOLD)) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c1, code lost:
    
        if (r7 < java.lang.Math.abs(r7 - r4.DEFAULT_SIGNIFICANT_VEL_THRESHOLD)) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d2, code lost:
    
        if (java.lang.Math.abs(r7 - r8) < java.lang.Math.abs(r7 - r4.DEFAULT_SIGNIFICANT_VEL_THRESHOLD)) goto L50;
     */
    @Override // a.oq1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(android.view.View r6, float r7, float r8) {
        /*
            r5 = this;
            r0 = 0
            int r1 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            r2 = 6
            r3 = 3
            com.google.android.material.bottomsheet.BottomSheetBehavior r4 = r5.f24a
            if (r1 >= 0) goto L1d
            boolean r7 = r4.updateImportantForAccessibilityOnSiblings
            if (r7 == 0) goto L10
        Ld:
            r2 = r3
            goto Ld4
        L10:
            int r7 = r6.getTop()
            java.lang.System.currentTimeMillis()
            int r8 = r4.STATE_EXPANDED
            if (r7 <= r8) goto Ld
            goto Ld4
        L1d:
            boolean r1 = r4.I
            if (r1 == 0) goto L6c
            boolean r1 = r4.shouldHide(r6, r8)
            if (r1 == 0) goto L6c
            float r7 = java.lang.Math.abs(r7)
            float r0 = java.lang.Math.abs(r8)
            int r7 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r7 >= 0) goto L3a
            int r7 = r4.significantVelocityThreshold
            float r7 = (float) r7
            int r7 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r7 > 0) goto L49
        L3a:
            int r7 = r6.getTop()
            int r8 = r4.T
            int r0 = r4.getExpandedOffset()
            int r0 = r0 + r8
            int r0 = r0 / 2
            if (r7 <= r0) goto L4c
        L49:
            r2 = 5
            goto Ld4
        L4c:
            boolean r7 = r4.updateImportantForAccessibilityOnSiblings
            if (r7 == 0) goto L51
            goto Ld
        L51:
            int r7 = r6.getTop()
            int r8 = r4.getExpandedOffset()
            int r7 = r7 - r8
            int r7 = java.lang.Math.abs(r7)
            int r8 = r6.getTop()
            int r0 = r4.STATE_EXPANDED
            int r8 = r8 - r0
            int r8 = java.lang.Math.abs(r8)
            if (r7 >= r8) goto Ld4
            goto Ld
        L6c:
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            r1 = 4
            if (r0 == 0) goto L9a
            float r7 = java.lang.Math.abs(r7)
            float r8 = java.lang.Math.abs(r8)
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 <= 0) goto L7e
            goto L9a
        L7e:
            boolean r7 = r4.updateImportantForAccessibilityOnSiblings
            if (r7 == 0) goto L84
        L82:
            r2 = r1
            goto Ld4
        L84:
            int r7 = r6.getTop()
            int r8 = r4.STATE_EXPANDED
            int r8 = r7 - r8
            int r8 = java.lang.Math.abs(r8)
            int r0 = r4.DEFAULT_SIGNIFICANT_VEL_THRESHOLD
            int r7 = r7 - r0
            int r7 = java.lang.Math.abs(r7)
            if (r8 >= r7) goto L82
            goto Ld4
        L9a:
            int r7 = r6.getTop()
            boolean r8 = r4.updateImportantForAccessibilityOnSiblings
            if (r8 == 0) goto Lb5
            int r8 = r4.STATE_SETTLING
            int r8 = r7 - r8
            int r8 = java.lang.Math.abs(r8)
            int r0 = r4.DEFAULT_SIGNIFICANT_VEL_THRESHOLD
            int r7 = r7 - r0
            int r7 = java.lang.Math.abs(r7)
            if (r8 >= r7) goto L82
            goto Ld
        Lb5:
            int r8 = r4.STATE_EXPANDED
            if (r7 >= r8) goto Lc5
            int r8 = r4.DEFAULT_SIGNIFICANT_VEL_THRESHOLD
            int r8 = r7 - r8
            int r8 = java.lang.Math.abs(r8)
            if (r7 >= r8) goto Ld4
            goto Ld
        Lc5:
            int r8 = r7 - r8
            int r8 = java.lang.Math.abs(r8)
            int r0 = r4.DEFAULT_SIGNIFICANT_VEL_THRESHOLD
            int r7 = r7 - r0
            int r7 = java.lang.Math.abs(r7)
            if (r8 >= r7) goto L82
        Ld4:
            r4.getClass()
            r7 = 1
            r4.startSettling(r6, r2, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a.as.m(android.view.View, float, float):void");
    }

    @Override // a.oq1
    public final boolean n(android.view.View view, int i) {
        com.google.android.material.bottomsheet.BottomSheetBehavior bottomSheetBehavior = this.f24a;
        int i2 = bottomSheetBehavior.L;
        if (i2 == 1 || bottomSheetBehavior.fitToContents) {
            return false;
        }
        if (i2 == 3 && bottomSheetBehavior.VIEW_INDEX_BOTTOM_SHEET == i) {
            java.lang.ref.WeakReference weakReference = bottomSheetBehavior.V;
            android.view.View view2 = weakReference != null ? (android.view.View) weakReference.get() : null;
            if (view2 != null && view2.canScrollVertically(-1)) {
                return false;
            }
        }
        java.lang.System.currentTimeMillis();
        java.lang.ref.WeakReference weakReference2 = bottomSheetBehavior.U;
        return weakReference2 != null && weakReference2.get() == view;
    }
    public void a() {
        throw new UnsupportedOperationException("Method not decompiled: as.a");
    }
}
