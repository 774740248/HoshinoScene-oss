package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class gp1 extends a.fp1 {
    public final android.util.SparseIntArray d;
    public final android.os.Parcel e;
    public final int f;
    public final int g;
    public final java.lang.String h;
    public int i;
    public int j;
    public int k;

    /* JADX WARN: Type inference failed for: r5v0, types: [a.rh1, a.kp] */
    /* JADX WARN: Type inference failed for: r6v0, types: [a.rh1, a.kp] */
    /* JADX WARN: Type inference failed for: r7v0, types: [a.rh1, a.kp] */
    public gp1(android.os.Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", (kp) new a.rh1(), (kp) new a.rh1(), (kp) new a.rh1());
    }

    @Override // a.fp1
    public final a.gp1 a() {
        android.os.Parcel parcel = this.e;
        int dataPosition = parcel.dataPosition();
        int i = this.j;
        if (i == this.f) {
            i = this.g;
        }
        return new a.gp1(parcel, dataPosition, i, a.ai1.j(new java.lang.StringBuilder(), this.h, "  "), this.f155a, this.b, this.c);
    }

    @Override // a.fp1
    public final boolean e(int i) {
        while (this.j < this.g) {
            int i2 = this.k;
            if (i2 == i) {
                return true;
            }
            if (java.lang.String.valueOf(i2).compareTo(java.lang.String.valueOf(i)) > 0) {
                return false;
            }
            int i3 = this.j;
            android.os.Parcel parcel = this.e;
            parcel.setDataPosition(i3);
            int readInt = parcel.readInt();
            this.k = parcel.readInt();
            this.j += readInt;
        }
        return this.k == i;
    }

    @Override // a.fp1
    public final void h(int i) {
        int i2 = this.i;
        android.util.SparseIntArray sparseIntArray = this.d;
        android.os.Parcel parcel = this.e;
        if (i2 >= 0) {
            int i3 = sparseIntArray.get(i2);
            int dataPosition = parcel.dataPosition();
            parcel.setDataPosition(i3);
            parcel.writeInt(dataPosition - i3);
            parcel.setDataPosition(dataPosition);
        }
        this.i = i;
        sparseIntArray.put(i, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i);
    }

    public gp1(android.os.Parcel parcel, int i, int i2, java.lang.String str, a.kp kpVar, a.kp kpVar2, a.kp kpVar3) {
        super(kpVar, kpVar2, kpVar3);
        this.d = new android.util.SparseIntArray();
        this.i = -1;
        this.k = -1;
        this.e = parcel;
        this.f = i;
        this.g = i2;
        this.j = i;
        this.h = str;
    }
}
