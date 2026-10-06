package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class hn extends a.vw0 implements a.jn {
    public java.lang.CharSequence E;
    public android.widget.ListAdapter F;
    public final android.graphics.Rect G;
    public int H;
    public final /* synthetic */ a.kn I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hn(a.kn knVar, android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet, 2130969525, 0);
        this.I = knVar;
        this.G = new android.graphics.Rect();
        this.q = knVar;
        this.A = true;
        this.B.setFocusable(true);
        this.r = new a.ok(this, 1, knVar);
    }

    @Override // a.jn
    public final void e(int i, int i2) {
        android.view.ViewTreeObserver viewTreeObserver;
        a.um umVar = this.B;
        boolean isShowing = umVar.isShowing();
        s();
        this.B.setInputMethodMode(2);
        f();
        a.y90 y90Var = this.e;
        y90Var.setChoiceMode(1);
        a.cn.d(y90Var, i);
        a.cn.c(y90Var, i2);
        a.kn knVar = this.I;
        int selectedItemPosition = knVar.getSelectedItemPosition();
        a.y90 y90Var2 = this.e;
        if (umVar.isShowing() && y90Var2 != null) {
            y90Var2.setListSelectionHidden(false);
            y90Var2.setSelection(selectedItemPosition);
            if (y90Var2.getChoiceMode() != 0) {
                y90Var2.setItemChecked(selectedItemPosition, true);
            }
        }
        if (isShowing || (viewTreeObserver = knVar.getViewTreeObserver()) == null) {
            return;
        }
        a.ft ftVar = new a.ft(3, this);
        viewTreeObserver.addOnGlobalLayoutListener(ftVar);
        this.B.setOnDismissListener(new a.gn(this, ftVar));
    }

    @Override // a.jn
    public final java.lang.CharSequence j() {
        return this.E;
    }

    @Override // a.jn
    public final void l(java.lang.CharSequence charSequence) {
        this.E = charSequence;
    }

    @Override // a.vw0, a.jn
    public final void o(android.widget.ListAdapter listAdapter) {
        super.o(listAdapter);
        this.F = listAdapter;
    }

    @Override // a.jn
    public final void p(int i) {
        this.H = i;
    }

    public final void s() {
        int i;
        a.um umVar = this.B;
        android.graphics.drawable.Drawable background = umVar.getBackground();
        a.kn knVar = this.I;
        if (background != null) {
            background.getPadding(knVar.j);
            boolean a2 = a.zr1.a(knVar);
            android.graphics.Rect rect = knVar.j;
            i = a2 ? rect.right : -rect.left;
        } else {
            android.graphics.Rect rect2 = knVar.j;
            rect2.right = 0;
            rect2.left = 0;
            i = 0;
        }
        int paddingLeft = knVar.getPaddingLeft();
        int paddingRight = knVar.getPaddingRight();
        int width = knVar.getWidth();
        int i2 = knVar.i;
        if (i2 == -2) {
            int a3 = knVar.a((android.widget.SpinnerAdapter) this.F, umVar.getBackground());
            int i3 = knVar.getContext().getResources().getDisplayMetrics().widthPixels;
            android.graphics.Rect rect3 = knVar.j;
            int i4 = (i3 - rect3.left) - rect3.right;
            if (a3 > i4) {
                a3 = i4;
            }
            r(java.lang.Math.max(a3, (width - paddingLeft) - paddingRight));
        } else if (i2 == -1) {
            r((width - paddingLeft) - paddingRight);
        } else {
            r(i2);
        }
        this.h = a.zr1.a(knVar) ? (((width - paddingRight) - this.g) - this.H) + i : paddingLeft + this.H + i;
    }
}
