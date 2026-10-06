package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class nn0 {
    public static void d(android.view.View view, java.util.List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (list.get(i) == view) {
                return;
            }
        }
        java.util.WeakHashMap weakHashMap = a.jq1.f264a;
        if (a.xp1.k(view) != null) {
            list.add(view);
        }
        for (int i2 = size; i2 < list.size(); i2++) {
            android.view.View view2 = (android.view.View) list.get(i2);
            if (view2 instanceof android.view.ViewGroup) {
                android.view.ViewGroup viewGroup = (android.view.ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    android.view.View childAt = viewGroup.getChildAt(i3);
                    int i4 = 0;
                    while (true) {
                        if (i4 < size) {
                            if (list.get(i4) == childAt) {
                                break;
                            } else {
                                i4++;
                            }
                        } else if (a.xp1.k(childAt) != null) {
                            list.add(childAt);
                        }
                    }
                }
            }
        }
    }

    public static void g(android.view.View view, android.graphics.Rect rect) {
        java.util.WeakHashMap weakHashMap = a.jq1.f264a;
        if (a.up1.b(view)) {
            android.graphics.RectF rectF = new android.graphics.RectF();
            rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
            view.getMatrix().mapRect(rectF);
            rectF.offset(view.getLeft(), view.getTop());
            java.lang.Object parent = view.getParent();
            while (parent instanceof android.view.View) {
                android.view.View view2 = (android.view.View) parent;
                rectF.offset(-view2.getScrollX(), -view2.getScrollY());
                view2.getMatrix().mapRect(rectF);
                rectF.offset(view2.getLeft(), view2.getTop());
                parent = view2.getParent();
            }
            int[] iArr = new int[2];
            view.getRootView().getLocationOnScreen(iArr);
            rectF.offset(iArr[0], iArr[1]);
            rect.set(java.lang.Math.round(rectF.left), java.lang.Math.round(rectF.top), java.lang.Math.round(rectF.right), java.lang.Math.round(rectF.bottom));
        }
    }

    public static boolean h(java.util.List list) {
        return list == null || list.isEmpty();
    }

    public static java.util.ArrayList k(java.util.ArrayList arrayList) {
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            android.view.View view = (android.view.View) arrayList.get(i);
            java.util.WeakHashMap weakHashMap = a.jq1.f264a;
            arrayList2.add(a.xp1.k(view));
            a.xp1.v(view, null);
        }
        return arrayList2;
    }

    public static void q(android.view.ViewGroup viewGroup, java.util.ArrayList arrayList, java.util.ArrayList arrayList2, java.util.ArrayList arrayList3, a.kp kpVar) {
        int size = arrayList2.size();
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        for (int i = 0; i < size; i++) {
            android.view.View view = (android.view.View) arrayList.get(i);
            java.util.WeakHashMap weakHashMap = a.jq1.f264a;
            java.lang.String k = a.xp1.k(view);
            arrayList4.add(k);
            if (k != null) {
                a.xp1.v(view, null);
                java.lang.String str = (java.lang.String) kpVar.getOrDefault(k, null);
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        break;
                    }
                    if (str.equals(arrayList3.get(i2))) {
                        a.xp1.v((android.view.View) arrayList2.get(i2), k);
                        break;
                    }
                    i2++;
                }
            }
        }
        a.k31.a(viewGroup, new a.mn0(size, arrayList2, arrayList3, arrayList, arrayList4));
    }

    public abstract void a(android.view.View view, java.lang.Object obj);

    public abstract void b(java.lang.Object obj, java.util.ArrayList arrayList);

    public abstract void c(android.view.ViewGroup viewGroup, java.lang.Object obj);

    public abstract boolean e(java.lang.Object obj);

    public abstract java.lang.Object f(java.lang.Object obj);

    public abstract java.lang.Object i(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3);

    public abstract java.lang.Object j(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3);

    public abstract void l(java.lang.Object obj, android.view.View view, java.util.ArrayList arrayList);

    public abstract void m(java.lang.Object obj, java.lang.Object obj2, java.util.ArrayList arrayList, java.lang.Object obj3, java.util.ArrayList arrayList2, java.lang.Object obj4, java.util.ArrayList arrayList3);

    public abstract void n(android.view.View view, java.lang.Object obj);

    public abstract void o(java.lang.Object obj, android.graphics.Rect rect);

    public void p(java.lang.Object obj, java.lang.Runnable runnable) {
        runnable.run();
    }

    public abstract void r(java.lang.Object obj, android.view.View view, java.util.ArrayList arrayList);

    public abstract void s(java.lang.Object obj, java.util.ArrayList arrayList, java.util.ArrayList arrayList2);

    public abstract java.lang.Object t(java.lang.Object obj);
}
