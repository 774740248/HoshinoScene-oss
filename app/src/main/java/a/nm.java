package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class nm {

    public nm() {
    }

    public static final android.graphics.PorterDuff.Mode b = android.graphics.PorterDuff.Mode.SRC_IN;
    public static a.nm c;

    /* renamed from: a, reason: collision with root package name */
    public a.lb1 f384a;

    public static synchronized a.nm a() {
        a.nm nmVar;
        synchronized (a.nm.class) {
            try {
                if (c == null) {
                    d();
                }
                nmVar = c;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return nmVar;
    }

    public static synchronized android.graphics.PorterDuffColorFilter c(int i, android.graphics.PorterDuff.Mode mode) {
        android.graphics.PorterDuffColorFilter g;
        synchronized (a.nm.class) {
            g = a.lb1.g(i, mode);
        }
        return g;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [a.nm, java.lang.Object] */
    public static synchronized void d() {
        synchronized (a.nm.class) {
            if (c == null) {
                a.nm obj = new a.nm();
                c = obj;
                obj.f384a = a.lb1.c();
                a.lb1 lb1Var = c.f384a;
                a.mm mmVar = new a.mm();
                synchronized (lb1Var) {
                    lb1Var.e = mmVar;
                }
            }
        }
    }

    public static void e(android.graphics.drawable.Drawable drawable, a.nm1 nm1Var, int[] iArr) {
        android.graphics.PorterDuff.Mode mode = a.lb1.f;
        int[] state = drawable.getState();
        int[] iArr2 = a.m90.f340a;
        if (drawable.mutate() != drawable) {
            android.util.Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof android.graphics.drawable.LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z = nm1Var.b;
        if (!z && !nm1Var.f385a) {
            drawable.clearColorFilter();
            return;
        }
        android.graphics.PorterDuffColorFilter porterDuffColorFilter = null;
        android.content.res.ColorStateList colorStateList = z ? (android.content.res.ColorStateList) nm1Var.c : null;
        android.graphics.PorterDuff.Mode mode2 = nm1Var.f385a ? (android.graphics.PorterDuff.Mode) nm1Var.d : a.lb1.f;
        if (colorStateList != null && mode2 != null) {
            porterDuffColorFilter = a.lb1.g(colorStateList.getColorForState(iArr, 0), mode2);
        }
        drawable.setColorFilter(porterDuffColorFilter);
    }

    public final synchronized android.graphics.drawable.Drawable b(android.content.Context context, int i) {
        return this.f384a.f(context, i);
    }
}
