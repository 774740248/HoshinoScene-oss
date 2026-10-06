package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class m00 extends a.lj1 implements a.fp0 {
    public /* synthetic */ java.lang.Object g;
    public final /* synthetic */ java.nio.channels.SocketChannel h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m00(java.nio.channels.SocketChannel socketChannel, a.ey eyVar) {
        super(2, eyVar);
        this.h = socketChannel;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        a.m00 m00Var = new a.m00(this.h, eyVar);
        m00Var.g = obj;
        return m00Var;
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.b20.q1(obj);
        java.nio.channels.SocketChannel socketChannel = this.h;
        try {
            a.q10 q10Var = a.q10.f457a;
            byte[] bytes = "@signal:exit".getBytes(a.bu.f53a);
            a.wv.v(bytes, "this as java.lang.String).getBytes(charset)");
            java.nio.ByteBuffer put = java.nio.ByteBuffer.allocate(bytes.length + 4).put(a.b20.v0(bytes.length)).put(bytes);
            put.flip();
            socketChannel.write(put);
            java.nio.charset.Charset defaultCharset = java.nio.charset.Charset.defaultCharset();
            a.wv.v(defaultCharset, "defaultCharset()");
            byte[] bytes2 = ";".getBytes(defaultCharset);
            a.wv.v(bytes2, "this as java.lang.String).getBytes(charset)");
            new java.lang.Integer(socketChannel.write(java.nio.ByteBuffer.wrap(bytes2)));
        } catch (java.lang.Throwable th) {
            a.b20.I(th);
        }
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        a.m00 m00Var = (a.m00) a((a.cz) obj, (a.ey) obj2);
        a.no1 no1Var = a.no1.f387a;
        m00Var.e(no1Var);
        return no1Var;
    }
}
