package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class c implements android.os.Parcelable {
    public final android.os.Parcelable c;
    public static final a.b d = new a.c();
    public static final android.os.Parcelable.Creator<a.c> CREATOR = new a.ig1(3);

    public c() {
        this.c = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeParcelable(this.c, i);
    }

    public c(android.os.Parcelable parcelable) {
        if (parcelable == null) {
            throw new java.lang.IllegalArgumentException("superState must not be null");
        }
        this.c = parcelable == d ? null : parcelable;
    }

    public c(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
        android.os.Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.c = readParcelable == null ? d : readParcelable;
    }
}
