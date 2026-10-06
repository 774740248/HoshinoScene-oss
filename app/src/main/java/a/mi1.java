package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class mi1 implements android.os.Parcelable {

    public mi1() {
    }

    public static final android.os.Parcelable.Creator<a.mi1> CREATOR = new a.me(9);
    public int c;
    public int d;
    public int[] e;
    public boolean f;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final java.lang.String toString() {
        return "FullSpanItem{mPosition=" + this.c + ", mGapDir=" + this.d + ", mHasUnwantedGapAfter=" + this.f + ", mGapPerSpan=" + java.util.Arrays.toString(this.e) + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.f ? 1 : 0);
        int[] iArr = this.e;
        if (iArr == null || iArr.length <= 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.e);
        }
    }
}
