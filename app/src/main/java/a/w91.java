package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class w91 extends a.c {
    public static final android.os.Parcelable.Creator<a.w91> CREATOR = new a.ig1(5);
    public android.os.Parcelable e;

    public w91(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
        super(parcel, classLoader);
        this.e = parcel.readParcelable(classLoader == null ? androidx.recyclerview.widget.a.class.getClassLoader() : classLoader);
    }

    @Override // a.c, android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeParcelable(this.c, i);
        parcel.writeParcelable(this.e, 0);
    }
}
