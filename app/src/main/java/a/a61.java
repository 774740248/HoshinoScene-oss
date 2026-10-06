package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public class a61 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3a;
    public final java.lang.Object[] b;
    public int c;

    public a61(int i, int i2) {
        this.f3a = i2;
        if (i2 != 1) {
            if (i <= 0) {
                throw new java.lang.IllegalArgumentException("The max pool size must be > 0");
            }
            this.b = new java.lang.Object[i];
        } else {
            if (i <= 0) {
                throw new java.lang.IllegalArgumentException("The max pool size must be > 0");
            }
            this.b = new java.lang.Object[i];
        }
    }

    public java.lang.Object a() {
        int i = this.f3a;
        java.lang.Object[] objArr = this.b;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                int i2 = this.c;
                if (i2 <= 0) {
                    return null;
                }
                int i3 = i2 - 1;
                java.lang.Object obj = objArr[i3];
                objArr[i3] = null;
                this.c = i3;
                return obj;
            default:
                int i4 = this.c;
                if (i4 <= 0) {
                    return null;
                }
                int i5 = i4 - 1;
                java.lang.Object obj2 = objArr[i5];
                objArr[i5] = null;
                this.c = i5;
                return obj2;
        }
    }

    public boolean b(java.lang.Object obj) {
        int i = this.f3a;
        java.lang.Object[] objArr = this.b;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                int i2 = this.c;
                if (i2 >= objArr.length) {
                    return false;
                }
                objArr[i2] = obj;
                this.c = i2 + 1;
                return true;
            default:
                int i3 = 0;
                while (true) {
                    int i4 = this.c;
                    if (i3 >= i4) {
                        if (i4 >= objArr.length) {
                            return false;
                        }
                        objArr[i4] = obj;
                        this.c = i4 + 1;
                        return true;
                    }
                    if (objArr[i3] == obj) {
                        throw new java.lang.IllegalStateException("Already in the pool!");
                    }
                    i3++;
                }
        }
    }
}
