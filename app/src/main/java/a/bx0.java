package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class bx0 {

    public bx0() {
        this(null, null);
    }
    public final a.w1 c;
    public boolean d;
    public int e = -1;
    public final /* synthetic */ androidx.lifecycle.b f;

    public bx0(androidx.lifecycle.b bVar, a.w1 w1Var) {
        this.f = bVar;
        this.c = w1Var;
    }

    public final void b(boolean z) {
        if (z == this.d) {
            return;
        }
        this.d = z;
        int i = z ? 1 : -1;
        androidx.lifecycle.b bVar = this.f;
        int i2 = bVar.c;
        bVar.c = i + i2;
        if (!bVar.d) {
            bVar.d = true;
            while (true) {
                try {
                    int i3 = bVar.c;
                    if (i2 == i3) {
                        break;
                    } else {
                        i2 = i3;
                    }
                } finally {
                    bVar.d = false;
                }
            }
        }
        if (this.d) {
            bVar.c(this);
        }
    }

    public void d() {
    }

    public abstract boolean e();
}
