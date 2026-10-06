package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class jh1 implements a.u10 {

    public jh1() {
    }


    /* renamed from: a, reason: collision with root package name */
    public com.omarea.krscript.model.ShellHandlerBase f254a;
    public java.lang.Runnable b;
    public boolean c;
    public int d;

    @Override // a.u10
    public final void a(java.nio.channels.SocketChannel socketChannel) {
    }

    @Override // a.u10
    public final void b(java.lang.String str, java.lang.String str2) {
        java.lang.String concat = str2.concat("\n");
        com.omarea.krscript.model.ShellHandlerBase shellHandlerBase = this.f254a;
        shellHandlerBase.sendMessage(shellHandlerBase.obtainMessage(2, concat));
    }

    @Override // a.u10
    public final void c(java.nio.channels.SocketChannel socketChannel, a.n00 n00Var) {
        a.g2 g2Var = this.c ? new a.g2(this, 12, n00Var) : null;
        com.omarea.krscript.model.ShellHandlerBase shellHandlerBase = this.f254a;
        shellHandlerBase.onStart((java.lang.Runnable) g2Var);
        shellHandlerBase.obtainMessage(0, "shell@daemon:\n");
    }

    @Override // a.u10
    public final void d(java.nio.channels.SocketChannel socketChannel) {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(this.d);
        com.omarea.krscript.model.ShellHandlerBase shellHandlerBase = this.f254a;
        shellHandlerBase.sendMessage(shellHandlerBase.obtainMessage(-2, valueOf));
        java.lang.Runnable runnable = this.b;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // a.u10
    public final void e(java.lang.String str, java.lang.String str2) {
        java.lang.String concat = str2.concat("\n");
        com.omarea.krscript.model.ShellHandlerBase shellHandlerBase = this.f254a;
        shellHandlerBase.sendMessage(shellHandlerBase.obtainMessage(4, concat));
    }

    @Override // a.u10
    public final void f(int i) {
        this.d = i;
    }
}
