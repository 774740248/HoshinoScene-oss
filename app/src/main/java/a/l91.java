package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class l91 implements a.lp1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f312a;
    public final /* synthetic */ androidx.recyclerview.widget.a b;

    public /* synthetic */ l91(androidx.recyclerview.widget.a aVar, int i) {
        this.f312a = i;
        this.b = aVar;
    }

    public final int a(android.view.View view) {
        int i = this.f312a;
        androidx.recyclerview.widget.a aVar = this.b;
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

    public final int b(android.view.View view) {
        int i = this.f312a;
        androidx.recyclerview.widget.a aVar = this.b;
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
}
