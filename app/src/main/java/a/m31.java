package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class m31 extends a.n31 {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m31(androidx.recyclerview.widget.a aVar, int i) {
        super(aVar);
        this.d = i;
    }

    @Override // a.n31
    public final int d(android.view.View view) {
        int i = this.d;
        androidx.recyclerview.widget.a aVar = this.f369a;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.n91 n91Var = (a.n91) view.getLayoutParams();
                aVar.getClass();
                return androidx.recyclerview.widget.a.M(view) + ((android.view.ViewGroup.MarginLayoutParams) n91Var).rightMargin;
            default:
                a.n91 n91Var2 = (a.n91) view.getLayoutParams();
                aVar.getClass();
                return androidx.recyclerview.widget.a.J(view) + ((android.view.ViewGroup.MarginLayoutParams) n91Var2).bottomMargin;
        }
    }

    @Override // a.n31
    public final int e(android.view.View view) {
        int i = this.d;
        androidx.recyclerview.widget.a aVar = this.f369a;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.n91 n91Var = (a.n91) view.getLayoutParams();
                aVar.getClass();
                android.graphics.Rect rect = ((a.n91) view.getLayoutParams()).d;
                return view.getMeasuredWidth() + rect.left + rect.right + ((android.view.ViewGroup.MarginLayoutParams) n91Var).leftMargin + ((android.view.ViewGroup.MarginLayoutParams) n91Var).rightMargin;
            default:
                a.n91 n91Var2 = (a.n91) view.getLayoutParams();
                aVar.getClass();
                android.graphics.Rect rect2 = ((a.n91) view.getLayoutParams()).d;
                return view.getMeasuredHeight() + rect2.top + rect2.bottom + ((android.view.ViewGroup.MarginLayoutParams) n91Var2).topMargin + ((android.view.ViewGroup.MarginLayoutParams) n91Var2).bottomMargin;
        }
    }

    @Override // a.n31
    public final int f(android.view.View view) {
        int i = this.d;
        androidx.recyclerview.widget.a aVar = this.f369a;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.n91 n91Var = (a.n91) view.getLayoutParams();
                aVar.getClass();
                return androidx.recyclerview.widget.a.L(view) - ((android.view.ViewGroup.MarginLayoutParams) n91Var).leftMargin;
            default:
                a.n91 n91Var2 = (a.n91) view.getLayoutParams();
                aVar.getClass();
                return androidx.recyclerview.widget.a.N(view) - ((android.view.ViewGroup.MarginLayoutParams) n91Var2).topMargin;
        }
    }

    @Override // a.n31
    public final int g() {
        int i = this.d;
        androidx.recyclerview.widget.a aVar = this.f369a;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                return aVar.p;
            default:
                return aVar.q;
        }
    }

    @Override // a.n31
    public final int h() {
        int i = this.d;
        androidx.recyclerview.widget.a aVar = this.f369a;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                return aVar.p - aVar.getPaddingRight();
            default:
                return aVar.q - aVar.getPaddingBottom();
        }
    }

    @Override // a.n31
    public final int i() {
        int i = this.d;
        androidx.recyclerview.widget.a aVar = this.f369a;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                return aVar.getPaddingLeft();
            default:
                return aVar.getPaddingTop();
        }
    }

    @Override // a.n31
    public final int j() {
        int i = this.d;
        androidx.recyclerview.widget.a aVar = this.f369a;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                return (aVar.p - aVar.getPaddingLeft()) - aVar.getPaddingRight();
            default:
                return (aVar.q - aVar.getPaddingTop()) - aVar.getPaddingBottom();
        }
    }

    @Override // a.n31
    public final int l(android.view.View view) {
        int i = this.d;
        android.graphics.Rect rect = this.c;
        androidx.recyclerview.widget.a aVar = this.f369a;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                aVar.T(view, rect);
                return rect.right;
            default:
                aVar.T(view, rect);
                return rect.bottom;
        }
    }

    @Override // a.n31
    public final int m(android.view.View view) {
        int i = this.d;
        android.graphics.Rect rect = this.c;
        androidx.recyclerview.widget.a aVar = this.f369a;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                aVar.T(view, rect);
                return rect.left;
            default:
                aVar.T(view, rect);
                return rect.top;
        }
    }

    @Override // a.n31
    public final void n(int i) {
        int i2 = this.d;
        androidx.recyclerview.widget.a aVar = this.f369a;
        switch (i2) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                aVar.X(i);
                return;
            default:
                aVar.Y(i);
                return;
        }
    }

    public final int o(android.view.View view) {
        int i = this.d;
        androidx.recyclerview.widget.a aVar = this.f369a;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.n91 n91Var = (a.n91) view.getLayoutParams();
                aVar.getClass();
                android.graphics.Rect rect = ((a.n91) view.getLayoutParams()).d;
                return view.getMeasuredHeight() + rect.top + rect.bottom + ((android.view.ViewGroup.MarginLayoutParams) n91Var).topMargin + ((android.view.ViewGroup.MarginLayoutParams) n91Var).bottomMargin;
            default:
                a.n91 n91Var2 = (a.n91) view.getLayoutParams();
                aVar.getClass();
                android.graphics.Rect rect2 = ((a.n91) view.getLayoutParams()).d;
                return view.getMeasuredWidth() + rect2.left + rect2.right + ((android.view.ViewGroup.MarginLayoutParams) n91Var2).leftMargin + ((android.view.ViewGroup.MarginLayoutParams) n91Var2).rightMargin;
        }
    }
}
