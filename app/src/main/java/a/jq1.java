package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class jq1 {

    /* renamed from: a, reason: collision with root package name */
    public static java.util.WeakHashMap f264a;
    public static java.lang.reflect.Field b;
    public static boolean c;
    public static final int[] d;
    public static final a.mp1 e;
    public static final a.op1 f;

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, a.mp1] */
    static {
        new java.util.concurrent.atomic.AtomicInteger(1);
        f264a = null;
        c = false;
        d = new int[]{2131361868, 2131361869, 2131361880, 2131361891, 2131361894, 2131361895, 2131361896, 2131361897, 2131361898, 2131361899, 2131361870, 2131361871, 2131361872, 2131361873, 2131361874, 2131361875, 2131361876, 2131361877, 2131361878, 2131361879, 2131361881, 2131361882, 2131361883, 2131361884, 2131361885, 2131361886, 2131361887, 2131361888, 2131361889, 2131361890, 2131361892, 2131361893};
        e = new a.mp1();
        f = new a.op1();
    }

    public static a.sr1 a(android.view.View view) {
        if (f264a == null) {
            f264a = new java.util.WeakHashMap();
        }
        a.sr1 sr1Var = (a.sr1) f264a.get(view);
        if (sr1Var != null) {
            return sr1Var;
        }
        a.sr1 sr1Var2 = new a.sr1(view);
        f264a.put(view, sr1Var2);
        return sr1Var2;
    }

    public static a.du1 b(android.view.View view, a.du1 du1Var) {
        android.view.WindowInsets g = du1Var.g();
        if (g != null) {
            android.view.WindowInsets a2 = a.vp1.a(view, g);
            if (!a2.equals(g)) {
                return a.du1.h(view, a2);
            }
        }
        return du1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [a.iq1, java.lang.Object] */
    public static boolean c(android.view.View view, android.view.KeyEvent keyEvent) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        java.util.ArrayList arrayList = a.iq1.d;
        a.iq1 iq1Var = (a.iq1) view.getTag(2131363251);
        a.iq1 iq1Var2 = iq1Var;
        if (iq1Var == null) {
            a.iq1 obj = new a.iq1();
            obj.f238a = null;
            obj.b = null;
            obj.c = null;
            view.setTag(2131363251, obj);
            iq1Var2 = obj;
        }
        if (keyEvent.getAction() == 0) {
            java.util.WeakHashMap weakHashMap = iq1Var2.f238a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            java.util.ArrayList arrayList2 = a.iq1.d;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    try {
                        if (iq1Var2.f238a == null) {
                            iq1Var2.f238a = new java.util.WeakHashMap();
                        }
                        for (int size = arrayList2.size() - 1; size >= 0; size--) {
                            java.util.ArrayList arrayList3 = a.iq1.d;
                            android.view.View view2 = (android.view.View) ((java.lang.ref.WeakReference) arrayList3.get(size)).get();
                            if (view2 == null) {
                                arrayList3.remove(size);
                            } else {
                                iq1Var2.f238a.put(view2, java.lang.Boolean.TRUE);
                                for (android.view.ViewParent parent = view2.getParent(); parent instanceof android.view.View; parent = parent.getParent()) {
                                    iq1Var2.f238a.put((android.view.View) parent, java.lang.Boolean.TRUE);
                                }
                            }
                        }
                    } finally {
                    }
                }
            }
        }
        android.view.View a2 = iq1Var2.a(view);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (a2 != null && !android.view.KeyEvent.isModifierKey(keyCode)) {
                if (iq1Var2.b == null) {
                    iq1Var2.b = new android.util.SparseArray();
                }
                iq1Var2.b.put(keyCode, new java.lang.ref.WeakReference(a2));
            }
        }
        return a2 != null;
    }

    public static android.view.View.AccessibilityDelegate d(android.view.View view) {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            return a.dq1.a(view);
        }
        if (c) {
            return null;
        }
        if (b == null) {
            try {
                java.lang.reflect.Field declaredField = android.view.View.class.getDeclaredField("mAccessibilityDelegate");
                b = declaredField;
                declaredField.setAccessible(true);
            } catch (java.lang.Throwable unused) {
                c = true;
                return null;
            }
        }
        try {
            java.lang.Object obj = b.get(view);
            if (obj instanceof android.view.View.AccessibilityDelegate) {
                return (android.view.View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (java.lang.Throwable unused2) {
            c = true;
            return null;
        }
    }

    public static java.lang.CharSequence e(android.view.View view) {
        java.lang.Object tag;
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            tag = a.cq1.b(view);
        } else {
            tag = view.getTag(2131363240);
            if (!java.lang.CharSequence.class.isInstance(tag)) {
                tag = null;
            }
        }
        return (java.lang.CharSequence) tag;
    }

    public static java.util.ArrayList f(android.view.View view) {
        java.util.ArrayList arrayList = (java.util.ArrayList) view.getTag(2131363237);
        if (arrayList != null) {
            return arrayList;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        view.setTag(2131363237, arrayList2);
        return arrayList2;
    }

    public static java.lang.String[] g(android.view.View view) {
        return android.os.Build.VERSION.SDK_INT >= 31 ? a.fq1.a(view) : (java.lang.String[]) view.getTag(2131363247);
    }

    public static a.ju1 h(android.view.View view) {
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            return a.eq1.b(view);
        }
        for (android.content.Context context = view.getContext(); context instanceof android.content.ContextWrapper; context = ((android.content.ContextWrapper) context).getBaseContext()) {
            if (context instanceof android.app.Activity) {
                android.view.Window window = ((android.app.Activity) context).getWindow();
                if (window != null) {
                    return new a.ju1(window, view);
                }
                return null;
            }
        }
        return null;
    }

    public static void i(android.view.View view, int i) {
        android.view.accessibility.AccessibilityManager accessibilityManager = (android.view.accessibility.AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z = e(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (a.up1.a(view) != 0 || z) {
                android.view.accessibility.AccessibilityEvent obtain = android.view.accessibility.AccessibilityEvent.obtain();
                obtain.setEventType(z ? 32 : 2048);
                a.up1.g(obtain, i);
                if (z) {
                    obtain.getText().add(e(view));
                    if (a.rp1.c(view) == 0) {
                        a.rp1.s(view, 1);
                    }
                    android.view.ViewParent parent = view.getParent();
                    while (true) {
                        if (!(parent instanceof android.view.View)) {
                            break;
                        }
                        if (a.rp1.c((android.view.View) parent) == 4) {
                            a.rp1.s(view, 2);
                            break;
                        }
                        parent = parent.getParent();
                    }
                }
                view.sendAccessibilityEventUnchecked(obtain);
                return;
            }
            if (i != 32) {
                if (view.getParent() != null) {
                    try {
                        a.up1.e(view.getParent(), view, view, i);
                        return;
                    } catch (java.lang.AbstractMethodError e2) {
                        android.util.Log.e("ViewCompat", view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e2);
                        return;
                    }
                }
                return;
            }
            android.view.accessibility.AccessibilityEvent obtain2 = android.view.accessibility.AccessibilityEvent.obtain();
            view.onInitializeAccessibilityEvent(obtain2);
            obtain2.setEventType(32);
            a.up1.g(obtain2, i);
            obtain2.setSource(view);
            view.onPopulateAccessibilityEvent(obtain2);
            obtain2.getText().add(e(view));
            accessibilityManager.sendAccessibilityEvent(obtain2);
        }
    }

    public static a.du1 j(android.view.View view, a.du1 du1Var) {
        android.view.WindowInsets g = du1Var.g();
        if (g != null) {
            android.view.WindowInsets b2 = a.vp1.b(view, g);
            if (!b2.equals(g)) {
                return a.du1.h(view, b2);
            }
        }
        return du1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static a.sx k(android.view.View view, a.sx sxVar) {
        if (android.util.Log.isLoggable("ViewCompat", 3)) {
            android.util.Log.d("ViewCompat", "performReceiveContent: " + sxVar + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            return a.fq1.b(view, sxVar);
        }
        a.i31 i31Var = (a.i31) view.getTag(2131363246);
        a.j31 j31Var = e;
        if (i31Var == null) {
            if (view instanceof a.j31) {
                j31Var = (a.j31) view;
            }
            return j31Var.a(sxVar);
        }
        a.sx a2 = ((a.nl1) i31Var).a(view, sxVar);
        if (a2 == null) {
            return null;
        }
        if (view instanceof a.j31) {
            j31Var = (a.j31) view;
        }
        return j31Var.a(a2);
    }

    public static void l(android.view.View view, int i) {
        java.util.ArrayList f2 = f(view);
        for (int i2 = 0; i2 < f2.size(); i2++) {
            if (((a.e0) f2.get(i2)).a() == i) {
                f2.remove(i2);
                return;
            }
        }
    }

    public static void m(android.view.View view, a.e0 e0Var, a.z0 z0Var) {
        if (z0Var == null) {
            l(view, e0Var.a());
            i(view, 0);
            return;
        }
        a.e0 e0Var2 = new a.e0(null, e0Var.b, null, z0Var, e0Var.c);
        android.view.View.AccessibilityDelegate d2 = d(view);
        a.u uVar = d2 == null ? null : d2 instanceof a.s ? ((a.s) d2).f510a : new a.u(d2);
        if (uVar == null) {
            uVar = new a.u();
        }
        o(view, uVar);
        l(view, e0Var2.a());
        f(view).add(e0Var2);
        i(view, 0);
    }

    public static void n(android.view.View view, android.content.Context context, int[] iArr, android.util.AttributeSet attributeSet, android.content.res.TypedArray typedArray, int i) {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            a.dq1.c(view, context, iArr, attributeSet, typedArray, i, 0);
        }
    }

    public static void o(android.view.View view, a.u uVar) {
        if (uVar == null && (d(view) instanceof a.s)) {
            uVar = new a.u();
        }
        view.setAccessibilityDelegate(uVar == null ? null : uVar.b);
    }

    public static void p(android.view.View view, java.lang.CharSequence charSequence) {
        new a.np1(2131363240, 8, 28, 1).b(view, charSequence);
        a.op1 op1Var = f;
        if (charSequence == null) {
            op1Var.c.remove(view);
            view.removeOnAttachStateChangeListener(op1Var);
            a.rp1.o(view.getViewTreeObserver(), op1Var);
        } else {
            op1Var.c.put(view, java.lang.Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(op1Var);
            if (a.up1.b(view)) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(op1Var);
            }
        }
    }
}
