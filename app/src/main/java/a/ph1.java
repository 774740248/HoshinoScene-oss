package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ph1 extends a.oq1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.google.android.material.sidesheet.SideSheetBehavior f436a;

    public ph1(com.google.android.material.sidesheet.SideSheetBehavior sideSheetBehavior) {
        this.f436a = sideSheetBehavior;
    }

    @Override // a.oq1
    public final int d(android.view.View view, int i) {
        com.google.android.material.sidesheet.SideSheetBehavior sideSheetBehavior = this.f436a;
        return a.wv.y(i, sideSheetBehavior.f761a.h(), sideSheetBehavior.parentInnerEdge);
    }

    @Override // a.oq1
    public final int e(android.view.View view, int i) {
        return view.getTop();
    }

    @Override // a.oq1
    public final int f(android.view.View view) {
        return this.f436a.m;
    }

    @Override // a.oq1
    public final void k(int i) {
        if (i == 1) {
            com.google.android.material.sidesheet.SideSheetBehavior sideSheetBehavior = this.f436a;
            if (sideSheetBehavior.draggable) {
                sideSheetBehavior.setState(1);
            }
        }
    }

    @Override // a.oq1
    public final void l(android.view.View view, int i, int i2) {
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams;
        com.google.android.material.sidesheet.SideSheetBehavior sideSheetBehavior = this.f436a;
        java.lang.ref.WeakReference weakReference = sideSheetBehavior.coplanarSiblingViewRef;
        android.view.View view2 = weakReference != null ? (android.view.View) weakReference.get() : null;
        if (view2 != null && (marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) view2.getLayoutParams()) != null) {
            a.pe peVar = sideSheetBehavior.f761a;
            int left = view.getLeft();
            view.getRight();
            int i3 = ((com.google.android.material.sidesheet.SideSheetBehavior) peVar.c).parentInnerEdge;
            if (left <= i3) {
                marginLayoutParams.rightMargin = i3 - left;
            }
            view2.setLayoutParams(marginLayoutParams);
        }
        java.util.LinkedHashSet linkedHashSet = sideSheetBehavior.callbacks;
        if (linkedHashSet.isEmpty()) {
            return;
        }
        a.pe peVar2 = sideSheetBehavior.f761a;
        peVar2.i();
        peVar2.h();
        java.util.Iterator it = linkedHashSet.iterator();
        if (it.hasNext()) {
            a.ai1.t(it.next());
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0058, code lost:
    
        if (r7.getLeft() > ((r1.i() - r1.h()) / 2)) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0084, code lost:
    
        if (java.lang.Math.abs(r8 - r1.h()) < java.lang.Math.abs(r8 - r1.i())) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0046, code lost:
    
        if (r9 > 500) goto L14;
     */
    @Override // a.oq1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(android.view.View r7, float r8, float r9) {
        /*
            r6 = this;
            com.google.android.material.sidesheet.SideSheetBehavior r0 = r6.f436a
            a.pe r1 = r0.f761a
            r1.getClass()
            r2 = 0
            int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            r4 = 3
            if (r3 >= 0) goto Lf
            goto L86
        Lf:
            int r3 = r7.getRight()
            float r3 = (float) r3
            com.google.android.material.sidesheet.SideSheetBehavior r5 = r1.c
            com.google.android.material.sidesheet.SideSheetBehavior r5 = (com.google.android.material.sidesheet.SideSheetBehavior) r5
            float r5 = r5.hideFriction
            float r5 = r5 * r8
            float r5 = r5 + r3
            float r3 = java.lang.Math.abs(r5)
            com.google.android.material.sidesheet.SideSheetBehavior r5 = r1.c
            com.google.android.material.sidesheet.SideSheetBehavior r5 = (com.google.android.material.sidesheet.SideSheetBehavior) r5
            r5.getClass()
            r5 = 1056964608(0x3f000000, float:0.5)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            r5 = 5
            if (r3 <= 0) goto L5c
            float r8 = java.lang.Math.abs(r8)
            float r2 = java.lang.Math.abs(r9)
            int r8 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r8 <= 0) goto L49
            java.lang.Object r8 = r1.c
            com.google.android.material.sidesheet.SideSheetBehavior r8 = (com.google.android.material.sidesheet.SideSheetBehavior) r8
            r8.getClass()
            r8 = 500(0x1f4, float:7.0E-43)
            float r8 = (float) r8
            int r8 = (r9 > r8 ? 1 : (r9 == r8 ? 0 : -1))
            if (r8 <= 0) goto L49
            goto L5a
        L49:
            int r8 = r7.getLeft()
            int r9 = r1.i()
            int r1 = r1.h()
            int r9 = r9 - r1
            int r9 = r9 / 2
            if (r8 <= r9) goto L86
        L5a:
            r4 = r5
            goto L86
        L5c:
            int r2 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r2 == 0) goto L6d
            float r8 = java.lang.Math.abs(r8)
            float r9 = java.lang.Math.abs(r9)
            int r8 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r8 <= 0) goto L6d
            goto L5a
        L6d:
            int r8 = r7.getLeft()
            int r9 = r1.h()
            int r9 = r8 - r9
            int r9 = java.lang.Math.abs(r9)
            int r1 = r1.i()
            int r8 = r8 - r1
            int r8 = java.lang.Math.abs(r8)
            if (r9 >= r8) goto L5a
        L86:
            r8 = 1
            r0.startSettling(r7, r4, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a.ph1.m(android.view.View, float, float):void");
    }

    @Override // a.oq1
    public final boolean n(android.view.View view, int i) {
        java.lang.ref.WeakReference weakReference;
        com.google.android.material.sidesheet.SideSheetBehavior sideSheetBehavior = this.f436a;
        return (sideSheetBehavior.state == 1 || (weakReference = sideSheetBehavior.viewRef) == null || weakReference.get() != view) ? false : true;
    }
    public void a() {
        throw new UnsupportedOperationException("Method not decompiled: ph1.a");
    }
}
