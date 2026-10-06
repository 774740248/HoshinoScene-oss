package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class fq implements android.os.Parcelable {

    public fq() {
    }

    public static final android.os.Parcelable.Creator<a.fq> CREATOR = new a.me(15);
    public int c;
    public java.lang.Integer d;
    public java.lang.Integer e;
    public java.lang.Integer f;
    public java.lang.Integer g;
    public java.lang.Integer h;
    public java.lang.Integer i;
    public java.lang.Integer j;
    public java.util.Locale n;
    public java.lang.CharSequence o;
    public int p;
    public int q;
    public java.lang.Integer r;
    public java.lang.Integer t;
    public java.lang.Integer u;
    public java.lang.Integer v;
    public java.lang.Integer w;
    public java.lang.Integer x;
    public java.lang.Integer y;
    public int k = 255;
    public int l = -2;
    public int m = -2;
    public java.lang.Boolean s = java.lang.Boolean.TRUE;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeInt(this.c);
        parcel.writeSerializable(this.d);
        parcel.writeSerializable(this.e);
        parcel.writeSerializable(this.f);
        parcel.writeSerializable(this.g);
        parcel.writeSerializable(this.h);
        parcel.writeSerializable(this.i);
        parcel.writeSerializable(this.j);
        parcel.writeInt(this.k);
        parcel.writeInt(this.l);
        parcel.writeInt(this.m);
        java.lang.CharSequence charSequence = this.o;
        parcel.writeString(charSequence == null ? null : charSequence.toString());
        parcel.writeInt(this.p);
        parcel.writeSerializable(this.r);
        parcel.writeSerializable(this.t);
        parcel.writeSerializable(this.u);
        parcel.writeSerializable(this.v);
        parcel.writeSerializable(this.w);
        parcel.writeSerializable(this.x);
        parcel.writeSerializable(this.y);
        parcel.writeSerializable(this.s);
        parcel.writeSerializable(this.n);
    }
}
