package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class g10 extends a.lj1 implements a.fp0 {
    public final /* synthetic */ java.nio.channels.SocketChannel g;
    public final /* synthetic */ java.nio.ByteBuffer h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g10(java.nio.channels.SocketChannel socketChannel, java.nio.ByteBuffer byteBuffer, a.ey eyVar) {
        super(2, eyVar);
        this.g = socketChannel;
        this.h = byteBuffer;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.g10(this.g, this.h, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.b20.q1(obj);
        java.lang.Object obj2 = a.q10.i;
        java.nio.channels.SocketChannel socketChannel = this.g;
        java.nio.ByteBuffer byteBuffer = this.h;
        synchronized (obj2) {
            try {
                socketChannel.write(byteBuffer);
            } catch (java.lang.Exception e) {
                e.printStackTrace();
            }
        }
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        a.g10 g10Var = (a.g10) a((a.cz) obj, (a.ey) obj2);
        a.no1 no1Var = a.no1.f387a;
        g10Var.e(no1Var);
        return no1Var;
    }
}
