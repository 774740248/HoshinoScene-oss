package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public class vw0 implements a.nh1 {

    public vw0() {
        this(null, null, 0, 0);
    }
    public static final java.lang.reflect.Method C;
    public static final java.lang.reflect.Method D;
    public boolean A;
    public final a.um B;
    public final android.content.Context c;
    public android.widget.ListAdapter d;
    public a.y90 e;
    public int h;
    public int i;
    public boolean k;
    public boolean l;
    public boolean m;
    public a.sw0 p;
    public android.view.View q;
    public android.widget.AdapterView.OnItemClickListener r;
    public android.widget.AdapterView.OnItemSelectedListener s;
    public final android.os.Handler x;
    public android.graphics.Rect z;
    public final int f = -2;
    public int g = -2;
    public final int j = 1002;
    public int n = 0;
    public final int o = Integer.MAX_VALUE;
    public final a.ow0 t = new a.ow0(this, 2);
    public final a.uw0 u = new a.uw0(this);
    public final a.tw0 v = new a.tw0(this);
    public final a.ow0 w = new a.ow0(this, 1);
    public final android.graphics.Rect y = new android.graphics.Rect();

    static {
        if (android.os.Build.VERSION.SDK_INT <= 28) {
            try {
                C = android.widget.PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", java.lang.Boolean.TYPE);
            } catch (java.lang.NoSuchMethodException unused) {
                android.util.Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                D = android.widget.PopupWindow.class.getDeclaredMethod("setEpicenterBounds", android.graphics.Rect.class);
            } catch (java.lang.NoSuchMethodException unused2) {
                android.util.Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v9, types: [android.widget.PopupWindow, a.um] */
    public vw0(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        int resourceId;
        this.c = context;
        this.x = new android.os.Handler(context.getMainLooper());
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.u81.o, i, i2);
        this.h = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.i = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.k = true;
        }
        obtainStyledAttributes.recycle();
        android.widget.PopupWindow popupWindow = new android.widget.PopupWindow(context, attributeSet, i, i2);
        android.content.res.TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, a.u81.s, i, i2);
        if (obtainStyledAttributes2.hasValue(2)) {
            a.f61.c(popupWindow, obtainStyledAttributes2.getBoolean(2, false));
        }
        popupWindow.setBackgroundDrawable((!obtainStyledAttributes2.hasValue(0) || (resourceId = obtainStyledAttributes2.getResourceId(0, 0)) == 0) ? obtainStyledAttributes2.getDrawable(0) : a.b20.Y(context, resourceId));
        obtainStyledAttributes2.recycle();
        this.B = (um) popupWindow;
        popupWindow.setInputMethodMode(1);
    }

    public a.y90 a(android.content.Context context, boolean z) {
        return new a.y90(context, z);
    }

    @Override // a.nh1
    public final boolean b() {
        return this.B.isShowing();
    }

    public final void c(int i) {
        this.h = i;
    }

    public final int d() {
        return this.h;
    }

    @Override // a.nh1
    public final void dismiss() {
        a.um umVar = this.B;
        umVar.dismiss();
        umVar.setContentView(null);
        this.e = null;
        this.x.removeCallbacks(this.t);
    }

    @Override // a.nh1
    public final void f() {
        int i;
        int paddingBottom;
        a.y90 y90Var;
        a.y90 y90Var2 = this.e;
        a.um umVar = this.B;
        android.content.Context context = this.c;
        if (y90Var2 == null) {
            a.y90 a2 = a(context, !this.A);
            this.e = a2;
            a2.setAdapter(this.d);
            this.e.setOnItemClickListener(this.r);
            this.e.setFocusable(true);
            this.e.setFocusableInTouchMode(true);
            this.e.setOnItemSelectedListener(new a.pw0(0, this));
            this.e.setOnScrollListener(this.v);
            android.widget.AdapterView.OnItemSelectedListener onItemSelectedListener = this.s;
            if (onItemSelectedListener != null) {
                this.e.setOnItemSelectedListener(onItemSelectedListener);
            }
            umVar.setContentView(this.e);
        }
        android.graphics.drawable.Drawable background = umVar.getBackground();
        android.graphics.Rect rect = this.y;
        if (background != null) {
            background.getPadding(rect);
            int i2 = rect.top;
            i = rect.bottom + i2;
            if (!this.k) {
                this.i = -i2;
            }
        } else {
            rect.setEmpty();
            i = 0;
        }
        int a3 = a.qw0.a(umVar, this.q, this.i, umVar.getInputMethodMode() == 2);
        int i3 = this.f;
        if (i3 == -1) {
            paddingBottom = a3 + i;
        } else {
            int i4 = this.g;
            int a4 = this.e.a(i4 != -2 ? i4 != -1 ? android.view.View.MeasureSpec.makeMeasureSpec(i4, 1073741824) : android.view.View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824) : android.view.View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE), a3);
            paddingBottom = a4 + (a4 > 0 ? this.e.getPaddingBottom() + this.e.getPaddingTop() + i : 0);
        }
        boolean z = this.B.getInputMethodMode() == 2;
        a.f61.d(umVar, this.j);
        if (umVar.isShowing()) {
            android.view.View view = this.q;
            java.util.WeakHashMap weakHashMap = a.jq1.f264a;
            if (a.up1.b(view)) {
                int i5 = this.g;
                if (i5 == -1) {
                    i5 = -1;
                } else if (i5 == -2) {
                    i5 = this.q.getWidth();
                }
                if (i3 == -1) {
                    i3 = z ? paddingBottom : -1;
                    if (z) {
                        umVar.setWidth(this.g == -1 ? -1 : 0);
                        umVar.setHeight(0);
                    } else {
                        umVar.setWidth(this.g == -1 ? -1 : 0);
                        umVar.setHeight(-1);
                    }
                } else if (i3 == -2) {
                    i3 = paddingBottom;
                }
                umVar.setOutsideTouchable(true);
                android.view.View view2 = this.q;
                int i6 = this.h;
                int i7 = this.i;
                if (i5 < 0) {
                    i5 = -1;
                }
                umVar.update(view2, i6, i7, i5, i3 < 0 ? -1 : i3);
                return;
            }
            return;
        }
        int i8 = this.g;
        if (i8 == -1) {
            i8 = -1;
        } else if (i8 == -2) {
            i8 = this.q.getWidth();
        }
        if (i3 == -1) {
            i3 = -1;
        } else if (i3 == -2) {
            i3 = paddingBottom;
        }
        umVar.setWidth(i8);
        umVar.setHeight(i3);
        if (android.os.Build.VERSION.SDK_INT <= 28) {
            java.lang.reflect.Method method = C;
            if (method != null) {
                try {
                    method.invoke(umVar, java.lang.Boolean.TRUE);
                } catch (java.lang.Exception unused) {
                    android.util.Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            a.rw0.b(umVar, true);
        }
        umVar.setOutsideTouchable(true);
        umVar.setTouchInterceptor(this.u);
        if (this.m) {
            a.f61.c(umVar, this.l);
        }
        if (android.os.Build.VERSION.SDK_INT <= 28) {
            java.lang.reflect.Method method2 = D;
            if (method2 != null) {
                try {
                    method2.invoke(umVar, this.z);
                } catch (java.lang.Exception e) {
                    android.util.Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e);
                }
            }
        } else {
            a.rw0.a(umVar, this.z);
        }
        a.e61.a(umVar, this.q, this.h, this.i, this.n);
        this.e.setSelection(-1);
        if ((!this.A || this.e.isInTouchMode()) && (y90Var = this.e) != null) {
            y90Var.setListSelectionHidden(true);
            y90Var.requestLayout();
        }
        if (this.A) {
            return;
        }
        this.x.post(this.w);
    }

    public final int g() {
        if (this.k) {
            return this.i;
        }
        return 0;
    }

    public final android.graphics.drawable.Drawable i() {
        return this.B.getBackground();
    }

    @Override // a.nh1
    public final a.y90 k() {
        return this.e;
    }

    public final void m(android.graphics.drawable.Drawable drawable) {
        this.B.setBackgroundDrawable(drawable);
    }

    public final void n(int i) {
        this.i = i;
        this.k = true;
    }

    public void o(android.widget.ListAdapter listAdapter) {
        a.sw0 sw0Var = this.p;
        if (sw0Var == null) {
            this.p = new a.sw0(0, this);
        } else {
            android.widget.ListAdapter listAdapter2 = this.d;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(sw0Var);
            }
        }
        this.d = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.p);
        }
        a.y90 y90Var = this.e;
        if (y90Var != null) {
            y90Var.setAdapter(this.d);
        }
    }

    public final void r(int i) {
        android.graphics.drawable.Drawable background = this.B.getBackground();
        if (background == null) {
            this.g = i;
            return;
        }
        android.graphics.Rect rect = this.y;
        background.getPadding(rect);
        this.g = rect.left + rect.right + i;
    }
}
