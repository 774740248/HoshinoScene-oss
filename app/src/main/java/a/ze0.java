package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ze0 extends a.n91 implements a.te0 {
    public static final android.os.Parcelable.Creator<a.ze0> CREATOR = new a.me(13);
    public float g;
    public float h;
    public int i;
    public float j;
    public int k;
    public int l;
    public int m;
    public int n;
    public boolean o;

    @Override // a.te0
    public final int a() {
        return ((android.view.ViewGroup.MarginLayoutParams) this).rightMargin;
    }

    @Override // a.te0
    public final int b() {
        return this.l;
    }

    @Override // a.te0
    public final int c() {
        return this.k;
    }

    @Override // a.te0
    public final void d(int i) {
        this.l = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // a.te0
    public final boolean e() {
        return this.o;
    }

    @Override // a.te0
    public final float f() {
        return this.g;
    }

    @Override // a.te0
    public final int g() {
        return ((android.view.ViewGroup.MarginLayoutParams) this).width;
    }

    @Override // a.te0
    public final int getOrder() {
        return 1;
    }

    @Override // a.te0
    public final int h() {
        return ((android.view.ViewGroup.MarginLayoutParams) this).height;
    }

    @Override // a.te0
    public final int i() {
        return this.n;
    }

    @Override // a.te0
    public final void j(int i) {
        this.k = i;
    }

    @Override // a.te0
    public final int k() {
        return ((android.view.ViewGroup.MarginLayoutParams) this).bottomMargin;
    }

    @Override // a.te0
    public final float l() {
        return this.j;
    }

    @Override // a.te0
    public final int m() {
        return ((android.view.ViewGroup.MarginLayoutParams) this).leftMargin;
    }

    @Override // a.te0
    public final int n() {
        return this.i;
    }

    @Override // a.te0
    public final float o() {
        return this.h;
    }

    @Override // a.te0
    public final int p() {
        return this.m;
    }

    @Override // a.te0
    public final int q() {
        return ((android.view.ViewGroup.MarginLayoutParams) this).topMargin;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeFloat(this.g);
        parcel.writeFloat(this.h);
        parcel.writeInt(this.i);
        parcel.writeFloat(this.j);
        parcel.writeInt(this.k);
        parcel.writeInt(this.l);
        parcel.writeInt(this.m);
        parcel.writeInt(this.n);
        parcel.writeByte(this.o ? (byte) 1 : (byte) 0);
        parcel.writeInt(((android.view.ViewGroup.MarginLayoutParams) this).bottomMargin);
        parcel.writeInt(((android.view.ViewGroup.MarginLayoutParams) this).leftMargin);
        parcel.writeInt(((android.view.ViewGroup.MarginLayoutParams) this).rightMargin);
        parcel.writeInt(((android.view.ViewGroup.MarginLayoutParams) this).topMargin);
        parcel.writeInt(((android.view.ViewGroup.MarginLayoutParams) this).height);
        parcel.writeInt(((android.view.ViewGroup.MarginLayoutParams) this).width);
    }
}
