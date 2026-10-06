package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class nw0 implements a.o01, android.widget.AdapterView.OnItemClickListener {
    public android.content.Context c;
    public android.view.LayoutInflater d;
    public a.pz0 e;
    public androidx.appcompat.view.menu.ExpandedMenuView f;
    public a.n01 g;
    public a.mw0 h;

    public nw0(android.content.Context context) {
        this.c = context;
        this.d = android.view.LayoutInflater.from(context);
    }

    @Override // a.o01
    public final void a(a.pz0 pz0Var, boolean z) {
        a.n01 n01Var = this.g;
        if (n01Var != null) {
            n01Var.a(pz0Var, z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.content.DialogInterface.OnClickListener, android.content.DialogInterface$OnKeyListener, a.qz0, java.lang.Object, android.content.DialogInterface$OnDismissListener, a.n01] */
    @Override // a.o01
    public final boolean c(a.zi1 zi1Var) {
        if (!zi1Var.hasVisibleItems()) {
            return false;
        }
        qz0 obj = new qz0();
        obj.c = zi1Var;
        android.content.Context context = zi1Var.f455a;
        a.tk tkVar = new a.tk(context);
        a.nw0 nw0Var = new a.nw0(((a.pk) tkVar.e).f440a);
        obj.e = nw0Var;
        nw0Var.g = obj;
        zi1Var.b(nw0Var, context);
        a.nw0 nw0Var2 = obj.e;
        if (nw0Var2.h == null) {
            nw0Var2.h = new a.mw0(nw0Var2);
        }
        a.mw0 mw0Var = nw0Var2.h;
        java.lang.Object obj2 = tkVar.e;
        a.pk pkVar = (a.pk) obj2;
        pkVar.g = mw0Var;
        pkVar.h = obj;
        android.view.View view = zi1Var.o;
        if (view != null) {
            pkVar.e = view;
        } else {
            pkVar.c = zi1Var.n;
            ((a.pk) obj2).d = zi1Var.m;
        }
        ((a.pk) obj2).f = obj;
        a.uk a2 = tkVar.a();
        obj.d = a2;
        a2.setOnDismissListener(obj);
        android.view.WindowManager.LayoutParams attributes = obj.d.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        obj.d.show();
        a.n01 n01Var = this.g;
        if (n01Var == null) {
            return true;
        }
        n01Var.o(zi1Var);
        return true;
    }

    @Override // a.o01
    public final boolean d() {
        return false;
    }

    @Override // a.o01
    public final void e(a.n01 n01Var) {
        this.g = n01Var;
    }

    @Override // a.o01
    public final void g() {
        a.mw0 mw0Var = this.h;
        if (mw0Var != null) {
            mw0Var.notifyDataSetChanged();
        }
    }

    @Override // a.o01
    public final void h(android.content.Context context, a.pz0 pz0Var) {
        if (this.c != null) {
            this.c = context;
            if (this.d == null) {
                this.d = android.view.LayoutInflater.from(context);
            }
        }
        this.e = pz0Var;
        a.mw0 mw0Var = this.h;
        if (mw0Var != null) {
            mw0Var.notifyDataSetChanged();
        }
    }

    @Override // a.o01
    public final boolean i(a.xz0 xz0Var) {
        return false;
    }

    @Override // a.o01
    public final boolean j(a.xz0 xz0Var) {
        return false;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i, long j) {
        this.e.q(this.h.b(i), this, 0);
    }
}
