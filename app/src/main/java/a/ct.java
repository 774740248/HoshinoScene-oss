package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ct {

    public ct() {
    }


    /* renamed from: a, reason: collision with root package name */
    public boolean f81a;
    public a.bt b;
    public boolean c;

    public final void a() {
        synchronized (this) {
            try {
                if (this.f81a) {
                    return;
                }
                this.f81a = true;
                this.c = true;
                a.bt btVar = this.b;
                if (btVar != null) {
                    try {
                        btVar.d();
                    } catch (java.lang.Throwable th) {
                        synchronized (this) {
                            this.c = false;
                            notifyAll();
                            throw th;
                        }
                    }
                }
                synchronized (this) {
                    this.c = false;
                    notifyAll();
                }
            } catch (java.lang.Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b(a.bt btVar) {
        synchronized (this) {
            while (this.c) {
                try {
                    try {
                        wait();
                    } catch (java.lang.InterruptedException unused) {
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
            if (this.b == btVar) {
                return;
            }
            this.b = btVar;
            if (this.f81a) {
                btVar.d();
            }
        }
    }
}
