package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class my extends android.view.ViewGroup.MarginLayoutParams {

    /* renamed from: a, reason: collision with root package name */
    public a.jy f364a;
    public boolean b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public android.view.View k;
    public android.view.View l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public final android.graphics.Rect q;

    public my() {
        super(-2, -2);
        this.b = false;
        this.c = 0;
        this.d = 0;
        this.e = -1;
        this.f = -1;
        this.g = 0;
        this.h = 0;
        this.q = new android.graphics.Rect();
    }

    public final boolean a(int i) {
        if (i == 0) {
            return this.n;
        }
        if (i != 1) {
            return false;
        }
        return this.o;
    }

    public final void b(a.jy jyVar) {
        a.jy jyVar2 = this.f364a;
        if (jyVar2 != jyVar) {
            if (jyVar2 != null) {
                jyVar2.f();
            }
            this.f364a = jyVar;
            this.b = true;
            if (jyVar != null) {
                jyVar.c(this);
            }
        }
    }

    public my(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        a.jy jyVar;
        this.b = false;
        this.c = 0;
        this.d = 0;
        this.e = -1;
        this.f = -1;
        this.g = 0;
        this.h = 0;
        this.q = new android.graphics.Rect();
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.n81.b);
        this.c = obtainStyledAttributes.getInteger(0, 0);
        this.f = obtainStyledAttributes.getResourceId(1, -1);
        this.d = obtainStyledAttributes.getInteger(2, 0);
        this.e = obtainStyledAttributes.getInteger(6, -1);
        this.g = obtainStyledAttributes.getInt(5, 0);
        this.h = obtainStyledAttributes.getInt(4, 0);
        boolean hasValue = obtainStyledAttributes.hasValue(3);
        this.b = hasValue;
        if (hasValue) {
            java.lang.String string = obtainStyledAttributes.getString(3);
            java.lang.String str = androidx.coordinatorlayout.widget.CoordinatorLayout.v;
            if (android.text.TextUtils.isEmpty(string)) {
                jyVar = null;
            } else {
                if (string.startsWith(".")) {
                    string = context.getPackageName() + string;
                } else if (string.indexOf(46) < 0) {
                    java.lang.String str2 = androidx.coordinatorlayout.widget.CoordinatorLayout.v;
                    if (!android.text.TextUtils.isEmpty(str2)) {
                        string = str2 + '.' + string;
                    }
                }
                try {
                    java.lang.ThreadLocal threadLocal = androidx.coordinatorlayout.widget.CoordinatorLayout.x;
                    java.util.Map map = (java.util.Map) threadLocal.get();
                    if (map == null) {
                        map = new java.util.HashMap();
                        threadLocal.set(map);
                    }
                    java.lang.reflect.Constructor<?> constructor = (java.lang.reflect.Constructor) map.get(string);
                    if (constructor == null) {
                        constructor = java.lang.Class.forName(string, false, context.getClassLoader()).getConstructor(androidx.coordinatorlayout.widget.CoordinatorLayout.w);
                        constructor.setAccessible(true);
                        map.put(string, constructor);
                    }
                    jyVar = (a.jy) constructor.newInstance(context, attributeSet);
                } catch (java.lang.Exception e) {
                    throw new java.lang.RuntimeException(a.ai1.g("Could not inflate Behavior subclass ", string), e);
                }
            }
            this.f364a = jyVar;
        }
        obtainStyledAttributes.recycle();
        a.jy jyVar2 = this.f364a;
        if (jyVar2 != null) {
            jyVar2.c(this);
        }
    }

    public my(a.my myVar) {
        super((android.view.ViewGroup.MarginLayoutParams) myVar);
        this.b = false;
        this.c = 0;
        this.d = 0;
        this.e = -1;
        this.f = -1;
        this.g = 0;
        this.h = 0;
        this.q = new android.graphics.Rect();
    }

    public my(android.view.ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.b = false;
        this.c = 0;
        this.d = 0;
        this.e = -1;
        this.f = -1;
        this.g = 0;
        this.h = 0;
        this.q = new android.graphics.Rect();
    }

    public my(android.view.ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.b = false;
        this.c = 0;
        this.d = 0;
        this.e = -1;
        this.f = -1;
        this.g = 0;
        this.h = 0;
        this.q = new android.graphics.Rect();
    }
}
