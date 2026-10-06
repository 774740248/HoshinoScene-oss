package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class y10 implements a.os {
    public static final android.os.Parcelable.Creator<a.y10> CREATOR = new a.me(18);
    public final long c;

    public y10(long j) {
        this.c = j;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a.y10) && this.c == ((a.y10) obj).c;
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{java.lang.Long.valueOf(this.c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeLong(this.c);
    }
}
