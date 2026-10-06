package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ln0 extends a.nn0 {

    public ln0() {
    }

    public static boolean u(android.transition.Transition transition) {
        return (a.nn0.h(transition.getTargetIds()) && a.nn0.h(transition.getTargetNames()) && a.nn0.h(transition.getTargetTypes())) ? false : true;
    }

    @Override // a.nn0
    public final void a(android.view.View view, java.lang.Object obj) {
        if (obj != null) {
            ((android.transition.Transition) obj).addTarget(view);
        }
    }

    @Override // a.nn0
    public final void b(java.lang.Object obj, java.util.ArrayList arrayList) {
        android.transition.Transition transition = (android.transition.Transition) obj;
        if (transition == null) {
            return;
        }
        int i = 0;
        if (transition instanceof android.transition.TransitionSet) {
            android.transition.TransitionSet transitionSet = (android.transition.TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i < transitionCount) {
                b(transitionSet.getTransitionAt(i), arrayList);
                i++;
            }
            return;
        }
        if (u(transition) || !a.nn0.h(transition.getTargets())) {
            return;
        }
        int size = arrayList.size();
        while (i < size) {
            transition.addTarget((android.view.View) arrayList.get(i));
            i++;
        }
    }

    @Override // a.nn0
    public final void c(android.view.ViewGroup viewGroup, java.lang.Object obj) {
        android.transition.TransitionManager.beginDelayedTransition(viewGroup, (android.transition.Transition) obj);
    }

    @Override // a.nn0
    public final boolean e(java.lang.Object obj) {
        return obj instanceof android.transition.Transition;
    }

    @Override // a.nn0
    public final java.lang.Object f(java.lang.Object obj) {
        if (obj != null) {
            return ((android.transition.Transition) obj).clone();
        }
        return null;
    }

    @Override // a.nn0
    public final java.lang.Object i(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        android.transition.Transition transition = (android.transition.Transition) obj;
        android.transition.Transition transition2 = (android.transition.Transition) obj2;
        android.transition.Transition transition3 = (android.transition.Transition) obj3;
        if (transition != null && transition2 != null) {
            transition = new android.transition.TransitionSet().addTransition(transition).addTransition(transition2).setOrdering(1);
        } else if (transition == null) {
            transition = transition2 != null ? transition2 : null;
        }
        if (transition3 == null) {
            return transition;
        }
        android.transition.TransitionSet transitionSet = new android.transition.TransitionSet();
        if (transition != null) {
            transitionSet.addTransition(transition);
        }
        transitionSet.addTransition(transition3);
        return transitionSet;
    }

    @Override // a.nn0
    public final java.lang.Object j(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        android.transition.TransitionSet transitionSet = new android.transition.TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((android.transition.Transition) obj);
        }
        if (obj2 != null) {
            transitionSet.addTransition((android.transition.Transition) obj2);
        }
        if (obj3 != null) {
            transitionSet.addTransition((android.transition.Transition) obj3);
        }
        return transitionSet;
    }

    @Override // a.nn0
    public final void l(java.lang.Object obj, android.view.View view, java.util.ArrayList arrayList) {
        ((android.transition.Transition) obj).addListener(new a.in0(view, arrayList));
    }

    @Override // a.nn0
    public final void m(java.lang.Object obj, java.lang.Object obj2, java.util.ArrayList arrayList, java.lang.Object obj3, java.util.ArrayList arrayList2, java.lang.Object obj4, java.util.ArrayList arrayList3) {
        ((android.transition.Transition) obj).addListener(new a.jn0(this, obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // a.nn0
    public final void n(android.view.View view, java.lang.Object obj) {
        if (view != null) {
            android.graphics.Rect rect = new android.graphics.Rect();
            a.nn0.g(view, rect);
            ((android.transition.Transition) obj).setEpicenterCallback(new a.hn0(rect, 0));
        }
    }

    @Override // a.nn0
    public final void o(java.lang.Object obj, android.graphics.Rect rect) {
        if (obj != null) {
            ((android.transition.Transition) obj).setEpicenterCallback(new a.hn0(rect, 1));
        }
    }

    @Override // a.nn0
    public final void p(java.lang.Object obj, java.lang.Runnable runnable) {
        ((android.transition.Transition) obj).addListener(new a.kn0(runnable));
    }

    @Override // a.nn0
    public final void r(java.lang.Object obj, android.view.View view, java.util.ArrayList arrayList) {
        android.transition.TransitionSet transitionSet = (android.transition.TransitionSet) obj;
        java.util.List<android.view.View> targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            a.nn0.d((android.view.View) arrayList.get(i), targets);
        }
        targets.add(view);
        arrayList.add(view);
        b(transitionSet, arrayList);
    }

    @Override // a.nn0
    public final void s(java.lang.Object obj, java.util.ArrayList arrayList, java.util.ArrayList arrayList2) {
        android.transition.TransitionSet transitionSet = (android.transition.TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            v(transitionSet, arrayList, arrayList2);
        }
    }

    @Override // a.nn0
    public final java.lang.Object t(java.lang.Object obj) {
        if (obj == null) {
            return null;
        }
        android.transition.TransitionSet transitionSet = new android.transition.TransitionSet();
        transitionSet.addTransition((android.transition.Transition) obj);
        return transitionSet;
    }

    public final void v(java.lang.Object obj, java.util.ArrayList arrayList, java.util.ArrayList arrayList2) {
        java.util.List<android.view.View> targets;
        android.transition.Transition transition = (android.transition.Transition) obj;
        int i = 0;
        if (transition instanceof android.transition.TransitionSet) {
            android.transition.TransitionSet transitionSet = (android.transition.TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i < transitionCount) {
                v(transitionSet.getTransitionAt(i), arrayList, arrayList2);
                i++;
            }
            return;
        }
        if (u(transition) || (targets = transition.getTargets()) == null || targets.size() != arrayList.size() || !targets.containsAll(arrayList)) {
            return;
        }
        int size = arrayList2 == null ? 0 : arrayList2.size();
        while (i < size) {
            transition.addTarget((android.view.View) arrayList2.get(i));
            i++;
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            transition.removeTarget((android.view.View) arrayList.get(size2));
        }
    }
}
