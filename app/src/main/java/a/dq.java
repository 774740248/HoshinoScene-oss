package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class dq implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<a.dq> CREATOR = new a.me(4);
    public final int[] c;
    public final java.util.ArrayList d;
    public final int[] e;
    public final int[] f;
    public final int g;
    public final java.lang.String h;
    public final int i;
    public final int j;
    public final java.lang.CharSequence k;
    public final int l;
    public final java.lang.CharSequence m;
    public final java.util.ArrayList n;
    public final java.util.ArrayList o;
    public final boolean p;

    public dq(a.cq cqVar) {
        int size = cqVar.f77a.size();
        this.c = new int[size * 5];
        if (cqVar.g) {
            this.d = new java.util.ArrayList(size);
            this.e = new int[size];
            this.f = new int[size];
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                a.en0 en0Var = (a.en0) cqVar.f77a.get(i2);
                int i3 = i + 1;
                this.c[i] = en0Var.f129a;
                java.util.ArrayList arrayList = this.d;
                a.gk0 gk0Var = en0Var.b;
                arrayList.add(gk0Var != null ? gk0Var.h : null);
                int[] iArr = this.c;
                iArr[i3] = en0Var.c;
                iArr[i + 2] = en0Var.d;
                int i4 = i + 4;
                iArr[i + 3] = en0Var.e;
                i += 5;
                iArr[i4] = en0Var.f;
                this.e[i2] = en0Var.g.ordinal();
                this.f[i2] = en0Var.h.ordinal();
            }
            this.g = cqVar.f;
            this.h = cqVar.h;
            this.i = cqVar.r;
            this.j = cqVar.i;
            this.k = cqVar.j;
            this.l = cqVar.k;
            this.m = cqVar.l;
            this.n = cqVar.m;
            this.o = cqVar.n;
            this.p = cqVar.o;
            return;
        }
        throw new java.lang.IllegalStateException("Not on back stack");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeIntArray(this.c);
        parcel.writeStringList(this.d);
        parcel.writeIntArray(this.e);
        parcel.writeIntArray(this.f);
        parcel.writeInt(this.g);
        parcel.writeString(this.h);
        parcel.writeInt(this.i);
        parcel.writeInt(this.j);
        android.text.TextUtils.writeToParcel(this.k, parcel, 0);
        parcel.writeInt(this.l);
        android.text.TextUtils.writeToParcel(this.m, parcel, 0);
        parcel.writeStringList(this.n);
        parcel.writeStringList(this.o);
        parcel.writeInt(this.p ? 1 : 0);
    }

    public dq(android.os.Parcel parcel) {
        this.c = parcel.createIntArray();
        this.d = parcel.createStringArrayList();
        this.e = parcel.createIntArray();
        this.f = parcel.createIntArray();
        this.g = parcel.readInt();
        this.h = parcel.readString();
        this.i = parcel.readInt();
        this.j = parcel.readInt();
        android.os.Parcelable.Creator creator = android.text.TextUtils.CHAR_SEQUENCE_CREATOR;
        this.k = (java.lang.CharSequence) creator.createFromParcel(parcel);
        this.l = parcel.readInt();
        this.m = (java.lang.CharSequence) creator.createFromParcel(parcel);
        this.n = parcel.createStringArrayList();
        this.o = parcel.createStringArrayList();
        this.p = parcel.readInt() != 0;
    }
}
