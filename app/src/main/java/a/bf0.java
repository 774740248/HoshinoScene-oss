package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class bf0 implements android.os.Parcelable {

    public bf0() {
    }

    public static final android.os.Parcelable.Creator<a.bf0> CREATOR = new a.me(14);
    public int c;
    public int d;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final java.lang.String toString() {
        return "SavedState{mAnchorPosition=" + this.c + ", mAnchorOffset=" + this.d + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
    }
}
