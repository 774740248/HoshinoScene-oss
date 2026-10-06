package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class xe0 extends android.view.ViewGroup.MarginLayoutParams implements a.te0 {

    public xe0() {
        super(-2, -2);
    }
    public static final android.os.Parcelable.Creator<a.xe0> CREATOR = new a.me(12);
    public int c;
    public float d;
    public float e;
    public int f;
    public float g;
    public int h;
    public int i;
    public int j;
    public int k;
    public boolean l;

    @Override // a.te0
    public final int a() {
        return ((android.view.ViewGroup.MarginLayoutParams) this).rightMargin;
    }

    @Override // a.te0
    public final int b() {
        return this.i;
    }

    @Override // a.te0
    public final int c() {
        return this.h;
    }

    @Override // a.te0
    public final void d(int i) {
        this.i = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // a.te0
    public final boolean e() {
        return this.l;
    }

    @Override // a.te0
    public final float f() {
        return this.d;
    }

    @Override // a.te0
    public final int g() {
        return ((android.view.ViewGroup.MarginLayoutParams) this).width;
    }

    @Override // a.te0
    public final int getOrder() {
        return this.c;
    }

    @Override // a.te0
    public final int h() {
        return ((android.view.ViewGroup.MarginLayoutParams) this).height;
    }

    @Override // a.te0
    public final int i() {
        return this.k;
    }

    @Override // a.te0
    public final void j(int i) {
        this.h = i;
    }

    @Override // a.te0
    public final int k() {
        return ((android.view.ViewGroup.MarginLayoutParams) this).bottomMargin;
    }

    @Override // a.te0
    public final float l() {
        return this.g;
    }

    @Override // a.te0
    public final int m() {
        return ((android.view.ViewGroup.MarginLayoutParams) this).leftMargin;
    }

    @Override // a.te0
    public final int n() {
        return this.f;
    }

    @Override // a.te0
    public final float o() {
        return this.e;
    }

    @Override // a.te0
    public final int p() {
        return this.j;
    }

    @Override // a.te0
    public final int q() {
        return ((android.view.ViewGroup.MarginLayoutParams) this).topMargin;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeInt(this.c);
        parcel.writeFloat(this.d);
        parcel.writeFloat(this.e);
        parcel.writeInt(this.f);
        parcel.writeFloat(this.g);
        parcel.writeInt(this.h);
        parcel.writeInt(this.i);
        parcel.writeInt(this.j);
        parcel.writeInt(this.k);
        parcel.writeByte(this.l ? (byte) 1 : (byte) 0);
        parcel.writeInt(((android.view.ViewGroup.MarginLayoutParams) this).bottomMargin);
        parcel.writeInt(((android.view.ViewGroup.MarginLayoutParams) this).leftMargin);
        parcel.writeInt(((android.view.ViewGroup.MarginLayoutParams) this).rightMargin);
        parcel.writeInt(((android.view.ViewGroup.MarginLayoutParams) this).topMargin);
        parcel.writeInt(((android.view.ViewGroup.MarginLayoutParams) this).height);
        parcel.writeInt(((android.view.ViewGroup.MarginLayoutParams) this).width);
    }
}
