package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class f40 implements a.u10 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f144a;
    public final a.v60 b;
    public final a.a5 c;
    public final android.widget.TextView d;
    public final java.lang.StringBuilder e;
    public int f;

    public f40(android.app.Activity activity, android.view.View view, a.v60 v60Var, a.a5 a5Var) {
        a.wv.w(activity, "context");
        a.wv.w(a5Var, "handler");
        this.f144a = activity;
        this.b = v60Var;
        this.c = a5Var;
        android.view.View findViewById = view.findViewById(2131362413);
        a.wv.v(findViewById, "dialog.findViewById(R.id.dialog_text)");
        android.widget.TextView textView = (android.widget.TextView) findViewById;
        this.d = textView;
        this.e = new java.lang.StringBuilder();
        this.f = -1;
        textView.setText("正在获取权限");
    }

    @Override // a.u10
    public final void a(java.nio.channels.SocketChannel socketChannel) {
    }

    @Override // a.u10
    public final void b(java.lang.String str, java.lang.String str2) {
        if (!a.yi1.g2(str2, "[operation completed]")) {
            g(str2);
            return;
        }
        a.cp cpVar = com.omarea.Scene.c;
        com.omarea.Scene.d.postDelayed(new a.e40(this, 0), 1200L);
        this.c.a();
    }

    @Override // a.u10
    public final void c(java.nio.channels.SocketChannel socketChannel, a.n00 n00Var) {
        java.lang.String string = this.f144a.getString(2131951942);
        a.wv.v(string, "context.getString(R.string.apps_op_ongoing)");
        g(string);
    }

    @Override // a.u10
    public final void d(java.nio.channels.SocketChannel socketChannel) {
        a.wv.w(socketChannel, "socketChannel");
        int i = this.f;
        android.content.Context context = this.f144a;
        if (i == 0) {
            java.lang.String string = context.getString(2131951906);
            a.wv.v(string, "context.getString(R.string.apps_op_completed)");
            g(string);
        } else {
            g(context.getString(2131951928) + this.f);
        }
        a.cp cpVar = com.omarea.Scene.c;
        com.omarea.Scene.d.postDelayed(new a.e40(this, 1), 2000L);
    }

    @Override // a.u10
    public final void e(java.lang.String str, java.lang.String str2) {
        java.lang.StringBuilder sb = this.e;
        sb.append(str2);
        sb.append("\n");
    }

    @Override // a.u10
    public final void f(int i) {
        this.f = i;
    }

    public final void g(java.lang.String str) {
        this.d.post(new a.xa(str, 11, this));
    }
}
