package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class kp extends a.rh1 implements java.util.Map {
    public a.jp j;

    public kp(a.kp kpVar) {
        if (kpVar != null) {
            int i = kpVar.e;
            b(i);
            if (this.e != 0) {
                for (int i2 = 0; i2 < i; i2++) {
                    put(kpVar.h(i2), kpVar.j(i2));
                }
            } else if (i > 0) {
                java.lang.System.arraycopy(kpVar.c, 0, this.c, 0, i);
                java.lang.System.arraycopy(kpVar.d, 0, this.d, 0, i << 1);
                this.e = i;
            }
        }
    }

    @Override // java.util.Map
    public final java.util.Set entrySet() {
        int i = 0;
        if (this.j == null) {
            this.j = new a.jp(i, this);
        }
        a.jp jpVar = this.j;
        if (((a.dy0) jpVar.b) == null) {
            jpVar.b = new a.dy0(jpVar, i);
        }
        return (a.dy0) jpVar.b;
    }

    @Override // java.util.Map
    public final java.util.Set keySet() {
        if (this.j == null) {
            this.j = new a.jp(0, this);
        }
        a.jp jpVar = this.j;
        if (((a.dy0) jpVar.c) == null) {
            jpVar.c = new a.dy0(jpVar, 1);
        }
        return (a.dy0) jpVar.c;
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map map) {
        b(map.size() + this.e);
        for (java.util.Map.Entry entry : (Iterable<java.util.Map.Entry>) map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final java.util.Collection values() {
        if (this.j == null) {
            this.j = new a.jp(0, this);
        }
        a.jp jpVar = this.j;
        if (((a.fy0) jpVar.d) == null) {
            jpVar.d = new a.fy0(jpVar);
        }
        return (a.fy0) jpVar.d;
    }
}
