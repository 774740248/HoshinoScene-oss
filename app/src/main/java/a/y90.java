package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public class y90 extends android.widget.ListView {
    public final android.graphics.Rect c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public a.w90 i;
    public boolean j;
    public final boolean k;
    public boolean l;
    public a.xw0 m;
    public a.hw n;

    public y90(android.content.Context context, boolean z) {
        super(context, null, 2130968955);
        this.c = new android.graphics.Rect();
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = 0;
        this.k = z;
        setCacheColorHint(0);
    }

    public final int a(int i, int i2) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        android.graphics.drawable.Drawable divider = getDivider();
        android.widget.ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int i3 = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i4 = 0;
        android.view.View view = null;
        for (int i5 = 0; i5 < count; i5++) {
            int itemViewType = adapter.getItemViewType(i5);
            if (itemViewType != i4) {
                view = null;
                i4 = itemViewType;
            }
            view = adapter.getView(i5, view, this);
            android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i6 = layoutParams.height;
            view.measure(i, i6 > 0 ? android.view.View.MeasureSpec.makeMeasureSpec(i6, 1073741824) : android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i5 > 0) {
                i3 += dividerHeight;
            }
            i3 += view.getMeasuredHeight();
            if (i3 >= i2) {
                return i2;
            }
        }
        return i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0147 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(android.view.MotionEvent r17, int r18) {
        /*
            Method dump skipped, instructions count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.y90.b(android.view.MotionEvent, int):boolean");
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(android.graphics.Canvas canvas) {
        android.graphics.drawable.Drawable selector;
        android.graphics.Rect rect = this.c;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.n != null) {
            return;
        }
        super.drawableStateChanged();
        a.w90 w90Var = this.i;
        if (w90Var != null) {
            w90Var.d = true;
        }
        android.graphics.drawable.Drawable selector = getSelector();
        if (selector != null && this.l && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.k || super.hasFocus();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.k || super.hasWindowFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.k || super.isFocused();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.k && this.j) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.n = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(android.view.MotionEvent motionEvent) {
        int i = android.os.Build.VERSION.SDK_INT;
        int actionMasked = motionEvent.getActionMasked();
        int i2 = 3;
        if (actionMasked == 10 && this.n == null) {
            a.hw hwVar = new a.hw(i2, this);
            this.n = hwVar;
            post(hwVar);
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (pointToPosition != -1 && pointToPosition != getSelectedItemPosition()) {
                android.view.View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    requestFocus();
                    if (i < 30 || !a.u90.d) {
                        setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                    } else {
                        try {
                            a.u90.f584a.invoke(this, java.lang.Integer.valueOf(pointToPosition), childAt, java.lang.Boolean.FALSE, -1, -1);
                            a.u90.b.invoke(this, java.lang.Integer.valueOf(pointToPosition));
                            a.u90.c.invoke(this, java.lang.Integer.valueOf(pointToPosition));
                        } catch (java.lang.IllegalAccessException e) {
                            e.printStackTrace();
                        } catch (java.lang.reflect.InvocationTargetException e2) {
                            e2.printStackTrace();
                        }
                    }
                }
                android.graphics.drawable.Drawable selector = getSelector();
                if (selector != null && this.l && isPressed()) {
                    selector.setState(getDrawableState());
                }
            }
        } else {
            setSelection(-1);
        }
        return onHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.h = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        a.hw hwVar = this.n;
        if (hwVar != null) {
            a.y90 y90Var = (a.y90) hwVar.d;
            y90Var.n = null;
            y90Var.removeCallbacks(hwVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z) {
        this.j = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [android.graphics.drawable.Drawable.Callback, a.w90, android.graphics.drawable.Drawable] */
    @Override // android.widget.AbsListView
    public void setSelector(android.graphics.drawable.Drawable drawable) {
        a.w90 w90Var = null;
        if (drawable != null) {
            w90 drawable2 = new a.w90();
            android.graphics.drawable.Drawable drawable3 = drawable2.c;
            if (drawable3 != null) {
                drawable3.setCallback(null);
            }
            drawable2.c = drawable;
            drawable.setCallback(drawable2);
            drawable2.d = true;
            w90Var = drawable2;
        }
        this.i = w90Var;
        super.setSelector(w90Var);
        android.graphics.Rect rect = new android.graphics.Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.d = rect.left;
        this.e = rect.top;
        this.f = rect.right;
        this.g = rect.bottom;
    }
}
