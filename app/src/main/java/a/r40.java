package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class r40 extends a.n60 {
    public final /* synthetic */ int o0;
    public final android.app.Activity p0;
    public final int q0;
    public final a.bp0 r0;
    public final a.au s0;

    /* [修复] 从 smali 还原：两个分支 super 相同，去重；i2==1→au.e()，否则 au.f() */
    public r40(a.p5 p5Var, a.pl1 pl1Var, int i, a.b10 b10Var, int i2) {
        super(2131558629, pl1Var.f442a);
        this.o0 = i2;
        a.wv.w(pl1Var, "themeMode");
        this.p0 = p5Var;
        this.q0 = i;
        this.r0 = b10Var;
        this.s0 = (i2 == 1) ? a.au.e() : a.au.f();
    }

    /* JADX WARN: Type inference failed for: r11v8, types: [a.ha1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v1, types: [a.n40, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r7v5, types: [a.n40, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r9v5, types: [a.ha1, java.lang.Object] */
    @Override // a.n60, a.gk0
    public final void C(android.view.View view, android.os.Bundle bundle) {
        int i = this.o0;
        int i2 = -1;
        int i3 = this.q0;
        a.au auVar = this.s0;
        final int i4 = 1;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.wv.w(view, "view");
                super.C(view, bundle);
                java.util.ArrayList k = auVar.k();
                if (k.size() > 1) {
                    a.ov.Z1(k, new a.py(26));
                }
                view.findViewById(2131362740).setVisibility(k.isEmpty() ? 0 : 8);
                androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) view.findViewById(2131362736);
                recyclerView.getContext();
                recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(recyclerView.getContext(), 1, false));
                android.content.Context context = recyclerView.getContext();
                a.wv.v(context, "context");
                java.util.Iterator it = k.iterator();
                int i5 = 0;
                while (true) {
                    if (it.hasNext()) {
                        if (((com.omarea.model.PowerStatSession) it.next()).session == i3) {
                            i2 = i5;
                        } else {
                            i5++;
                        }
                    }
                }
                a.jj jjVar = new a.jj(context, k, i2);
                jjVar.p = new a.q40(this, jjVar, 0);
                jjVar.o = new a.q40(this, jjVar, 1);
                recyclerView.setAdapter(jjVar);
                final a.ha1 obj = new a.ha1();
                final android.view.View findViewById = view.findViewById(2131362352);
                final android.view.View findViewById2 = view.findViewById(2131362351);
                final int i6 = 0;
                // [修复] 从 smali 还原：原为 new a.n40(obj, findViewById, findViewById2, 0)，jadx 内联成匿名 Runnable
                a.n40 r14 = new a.n40(obj, findViewById, findViewById2, 0);
                com.omarea.common.ui.Tags tags = (com.omarea.common.ui.Tags) view.findViewById(2131363254);
                java.lang.String[] strArr = {m(2131953216), "≤ 1H", "≤ 3H", "≤ 5H"};
                a.x81 a2 = tags.a(strArr, 0);
                a2.b = new a.j10(a2, recyclerView, obj, this, strArr, r14, 1);
                final int i7 = 0;
                findViewById2.setOnClickListener(new a.o40());
                findViewById.setOnClickListener(new a.p40(r14, 0));
                recyclerView.setVisibility(k.isEmpty() ^ true ? 0 : 8);
                return;
            default:
                a.wv.w(view, "view");
                super.C(view, bundle);
                java.util.ArrayList k2 = auVar.k();
                if (k2.size() > 1) {
                    a.ov.Z1(k2, new a.py(27));
                }
                view.findViewById(2131362740).setVisibility(k2.isEmpty() ? 0 : 8);
                androidx.recyclerview.widget.RecyclerView recyclerView2 = (androidx.recyclerview.widget.RecyclerView) view.findViewById(2131362736);
                recyclerView2.getContext();
                recyclerView2.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(recyclerView2.getContext(), 1, false));
                android.content.Context context2 = recyclerView2.getContext();
                a.wv.v(context2, "context");
                java.util.Iterator it2 = k2.iterator();
                int i8 = 0;
                while (true) {
                    if (it2.hasNext()) {
                        if (((com.omarea.model.ChargeStatSession) it2.next()).session == i3) {
                            i2 = i8;
                        } else {
                            i8++;
                        }
                    }
                }
                a.ci ciVar = new a.ci(context2, k2, i2);
                ciVar.p = new a.s40(this, ciVar, 0);
                ciVar.o = new a.s40(this, ciVar, 1);
                recyclerView2.setAdapter(ciVar);
                final a.ha1 obj2 = new a.ha1();
                /* TODO: jadx type unresolved, defaulted to Object */
                final android.view.View findViewById3 = view.findViewById(2131362352);
                final android.view.View findViewById4 = view.findViewById(2131362351);
                // [修复] 从 smali 还原：原为 new a.n40(obj2, findViewById3, findViewById4, 1)
                a.n40 r7 = new a.n40(obj2, findViewById3, findViewById4, 1);
                com.omarea.common.ui.Tags tags2 = (com.omarea.common.ui.Tags) view.findViewById(2131363254);
                java.lang.String[] strArr2 = {m(2131953216), "≤ 20%", "≤ 50%", "≤ 80%"};
                a.x81 a3 = tags2.a(strArr2, 0);
                a3.b = new a.j10(a3, recyclerView2, obj2, this, strArr2, r7, 2);
                final int i9 = 1;
                findViewById4.setOnClickListener(new a.o40());
                findViewById3.setOnClickListener(new a.p40(r7, 1));
                recyclerView2.setVisibility(k2.isEmpty() ^ true ? 0 : 8);
                return;
        }
    }
}
