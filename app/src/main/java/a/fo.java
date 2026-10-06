package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public class fo {
    public static final java.lang.Class[] b = {android.content.Context.class, android.util.AttributeSet.class};
    public static final int[] c = {android.R.attr.onClick};
    public static final int[] d = {android.R.attr.accessibilityHeading};
    public static final int[] e = {android.R.attr.accessibilityPaneTitle};
    public static final int[] f = {android.R.attr.screenReaderFocusable};
    public static final java.lang.String[] g = {"android.widget.", "android.view.", "android.webkit."};
    public static final a.rh1 h = new a.rh1();

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object[] f154a = new java.lang.Object[2];

    public a.nl a(android.content.Context context, android.util.AttributeSet attributeSet) {
        return new a.nl(context, attributeSet);
    }

    public a.pl b(android.content.Context context, android.util.AttributeSet attributeSet) {
        return new a.pl(context, attributeSet, 2130968716);
    }

    public a.rl c(android.content.Context context, android.util.AttributeSet attributeSet) {
        return new a.rl(context, attributeSet, 2130968734);
    }

    public a.wm d(android.content.Context context, android.util.AttributeSet attributeSet) {
        return new a.wm(context, attributeSet);
    }

    public a.vn e(android.content.Context context, android.util.AttributeSet attributeSet) {
        return new a.vn(context, attributeSet);
    }

    public final android.view.View f(android.content.Context context, java.lang.String str, java.lang.String str2) {
        java.lang.String concat;
        a.rh1 rh1Var = h;
        java.lang.reflect.Constructor constructor = (java.lang.reflect.Constructor) rh1Var.getOrDefault(str, null);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    concat = str2.concat(str);
                } catch (java.lang.Exception unused) {
                    return null;
                }
            } else {
                concat = str;
            }
            constructor = java.lang.Class.forName(concat, false, context.getClassLoader()).asSubclass(android.view.View.class).getConstructor(b);
            rh1Var.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (android.view.View) constructor.newInstance(this.f154a);
    }

    public final void g(android.widget.TextView textView, java.lang.String str) {
        if (textView != null) {
            return;
        }
        throw new java.lang.IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
    }
}
