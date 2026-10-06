package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class a30 extends a.ji1 {
    public static void i(java.util.ArrayList arrayList, android.view.View view) {
        if (!(view instanceof android.view.ViewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
        if (a.qq1.b(viewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(viewGroup);
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            android.view.View childAt = viewGroup.getChildAt(i);
            if (childAt.getVisibility() == 0) {
                i(arrayList, childAt);
            }
        }
    }

    public static void j(a.kp kpVar, android.view.View view) {
        java.util.WeakHashMap weakHashMap = a.jq1.f264a;
        java.lang.String k = a.xp1.k(view);
        if (k != null) {
            kpVar.put(k, view);
        }
        if (view instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                android.view.View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    j(kpVar, childAt);
                }
            }
        }
    }

    public static void k(a.kp kpVar, java.util.Collection collection) {
        java.util.Iterator it = ((a.dy0) kpVar.entrySet()).iterator();
        while (it.hasNext()) {
            android.view.View view = (android.view.View) ((java.util.Map.Entry) it.next()).getValue();
            java.util.WeakHashMap weakHashMap = a.jq1.f264a;
            if (!collection.contains(a.xp1.k(view))) {
                it.remove();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:255:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x046b  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x045b  */
    /* JADX WARN: Type inference failed for: r12v27, types: [a.rh1, java.util.Map, a.kp] */
    /* JADX WARN: Type inference failed for: r12v38, types: [a.y20, java.lang.Object, a.hm] */
    /* JADX WARN: Type inference failed for: r13v13, types: [a.rh1, java.util.Map, a.kp] */
    /* JADX WARN: Type inference failed for: r2v21, types: [a.ct, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v22, types: [a.ct, java.lang.Object] */
    @Override // a.ji1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(java.util.ArrayList r34, boolean r35) {
        /*
            Method dump skipped, instructions count: 1691
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a30.b(java.util.ArrayList, boolean):void");
    }
}
