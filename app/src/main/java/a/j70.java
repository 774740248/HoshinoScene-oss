package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class j70 extends com.omarea.krscript.model.ShellHandlerBase {
    public static final /* synthetic */ int m = 0;

    /* renamed from: a, reason: collision with root package name */
    public final a.k70 f247a;
    public final android.widget.TextView b;
    public final android.widget.ProgressBar c;
    public final android.content.Context d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public boolean i;
    public final java.lang.StringBuffer j;
    public int k;
    public boolean l;

    public j70(a.k70 k70Var, android.widget.TextView textView, android.widget.ProgressBar progressBar) {
        this.f247a = k70Var;
        this.b = textView;
        this.c = progressBar;
        android.content.Context context = textView.getContext();
        this.d = context;
        a.wv.s(context);
        this.e = context.getColor(2131099786);
        a.wv.s(context);
        this.f = context.getColor(2131099784);
        a.wv.s(context);
        this.g = context.getColor(2131099787);
        a.wv.s(context);
        this.h = context.getColor(2131099785);
        this.j = new java.lang.StringBuffer();
        this.k = -1;
    }

    public final void a() {
        java.lang.StringBuffer stringBuffer = this.j;
        if (stringBuffer.length() > 0) {
            android.text.SpannableString spannableString = new android.text.SpannableString(stringBuffer);
            spannableString.setSpan(new android.text.style.ForegroundColorSpan(this.k), 0, stringBuffer.length(), 33);
            this.b.post(new a.h70(this, spannableString, 1));
            stringBuffer.delete(0, stringBuffer.length());
        }
    }

    @Override // com.omarea.krscript.model.ShellHandlerBase, android.os.Handler
    public final void handleMessage(android.os.Message message) {
        a.wv.w(message, "msg");
        int i = message.what;
        if (i == -2) {
            onExit(message.obj);
            return;
        }
        if (i == 0) {
            onStart(message.obj);
            return;
        }
        if (i == 2) {
            onReaderMsg(message.obj);
            return;
        }
        if (i == 4) {
            java.lang.Object obj = message.obj;
            a.wv.v(obj, "msg.obj");
            onError(obj);
        } else {
            if (i != 6) {
                return;
            }
            java.lang.Object obj2 = message.obj;
            a.wv.v(obj2, "msg.obj");
            onWrite(obj2);
        }
    }

    @Override // com.omarea.krscript.model.ShellHandlerBase
    public final void onError(java.lang.Object obj) {
        a.wv.w(obj, "msg");
        this.i = true;
        updateLog(obj, this.e);
    }

    @Override // com.omarea.krscript.model.ShellHandlerBase
    public final void onExit(java.lang.Object obj) {
        this.l = false;
        updateLog(this.d.getString(2131952732), this.h);
        a();
        a.k70 k70Var = this.f247a;
        a.l70 l70Var = k70Var.f284a;
        l70Var.t0 = false;
        java.lang.Runnable runnable = l70Var.v0;
        if (runnable == null) {
            a.wv.M1("onExit");
            throw null;
        }
        runnable.run();
        l70Var.X();
        l70Var.X().setVisibility(8);
        l70Var.W().setVisibility(0);
        ((android.widget.ProgressBar) l70Var.s0.a(a.l70.B0[8])).setVisibility(8);
        l70Var.U(true);
        if (this.i || !k70Var.b.getAutoOff()) {
            return;
        }
        a.l70 l70Var2 = k70Var.f284a;
        l70Var2.getClass();
        try {
            l70Var2.S(false, false);
        } catch (java.lang.Exception unused) {
        }
    }

    @Override // com.omarea.krscript.model.ShellHandlerBase
    public final void onProgress(int i, int i2) {
        android.widget.ProgressBar progressBar = this.c;
        if (i == -1) {
            progressBar.setVisibility(0);
            progressBar.setIndeterminate(true);
        } else {
            if (i == i2) {
                progressBar.setVisibility(8);
                return;
            }
            progressBar.setVisibility(0);
            progressBar.setIndeterminate(false);
            progressBar.setMax(i2);
            progressBar.setProgress(i);
        }
    }

    @Override // com.omarea.krscript.model.ShellHandlerBase
    public final void onReader(java.lang.Object obj) {
        a.wv.w(obj, "msg");
        updateLog(obj, this.f);
    }

    @Override // com.omarea.krscript.model.ShellHandlerBase
    public final void onStart(java.lang.Runnable runnable) {
        a.f fVar;
        a.k70 k70Var = this.f247a;
        a.l70 l70Var = k70Var.f284a;
        l70Var.t0 = true;
        if (k70Var.b.getInterruptable() && runnable != null) {
            l70Var.W().setVisibility(0);
        } else {
            l70Var.W().setVisibility(8);
        }
        k70Var.c.c = runnable;
        this.l = true;
        a.u20 u20Var = a.z80.f728a;
        a.ty tyVar = a.by0.f57a;
        a.i70 i70Var = new a.i70(this, null);
        int i = 2 & 1;
        a.ty tyVar2 = a.ob0.c;
        if (i != 0) {
            tyVar = tyVar2;
        }
        int i2 = (2 & 2) != 0 ? 1 : 0;
        a.ty W = a.wv.W(tyVar2, tyVar, true);
        a.u20 u20Var2 = a.z80.f728a;
        if (W != u20Var2 && W.g(a.gy.c) == null) {
            W = W.c(u20Var2);
        }
        if (i2 == 2) {
            fVar = new a.av0(W, i70Var);
        } else {
            fVar = new a.f(W, true);
        }
        fVar.S(i2, fVar, i70Var);
    }

    @Override // com.omarea.krscript.model.ShellHandlerBase
    public final void onWrite(java.lang.Object obj) {
        a.wv.w(obj, "msg");
        updateLog(obj, this.g);
    }

    @Override // com.omarea.krscript.model.ShellHandlerBase
    public final void updateLog(java.lang.Object obj, int i) {
        if (obj != null) {
            if (this.k != i) {
                a();
                this.k = i;
            }
            this.j.append(obj.toString());
        }
    }

    @Override // com.omarea.krscript.model.ShellHandlerBase
    public final void updateLog(android.text.SpannableString spannableString) {
        if (spannableString != null) {
            this.b.post(new a.h70(this, spannableString, 0));
        }
    }

    @Override // com.omarea.krscript.model.ShellHandlerBase
    public final void onStart(java.lang.Object obj) {
        this.b.setText("");
    }
}
