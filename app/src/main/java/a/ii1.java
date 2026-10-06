package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract /* synthetic */ class ii1 {
    public static final void a(int i, android.view.View view) {
        if (i == 0) {
            throw null;
        }
        int i2 = i - 1;
        if (i2 == 0) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view.getParent();
            if (viewGroup != null) {
                if (android.util.Log.isLoggable("FragmentManager", 2)) {
                    android.util.Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                }
                viewGroup.removeView(view);
                return;
            }
            return;
        }
        if (i2 == 1) {
            if (android.util.Log.isLoggable("FragmentManager", 2)) {
                android.util.Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
            }
            view.setVisibility(0);
            return;
        }
        if (i2 == 2) {
            if (android.util.Log.isLoggable("FragmentManager", 2)) {
                android.util.Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
            }
            view.setVisibility(8);
            return;
        }
        if (i2 != 3) {
            return;
        }
        if (android.util.Log.isLoggable("FragmentManager", 2)) {
            android.util.Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
        }
        view.setVisibility(4);
    }

    public static int b(int i) {
        if (i == 0) {
            return 2;
        }
        if (i == 4) {
            return 4;
        }
        if (i == 8) {
            return 3;
        }
        throw new java.lang.IllegalArgumentException(d("Unknown visibility ", i));
    }

    public static int c(android.view.View view) {
        if (view.getAlpha() == 0.0f && view.getVisibility() == 0) {
            return 4;
        }
        return b(view.getVisibility());
    }

    public static java.lang.String d(java.lang.String str, int i) {
        return str + i;
    }

    public static java.lang.String e(java.lang.String str, java.lang.String str2) {
        return str + str2;
    }

    public static java.lang.String f(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        return str + str2 + str3;
    }

    public static /* synthetic */ void g(a.ry ryVar) {
        if (ryVar != null) {
            throw new java.lang.ClassCastException();
        }
    }

    public static /* synthetic */ java.lang.String h(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "INVISIBLE" : "GONE" : "VISIBLE" : "REMOVED";
    }
}
