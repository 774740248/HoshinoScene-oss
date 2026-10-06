package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class nr1 extends a.c {
    public static final android.os.Parcelable.Creator<a.nr1> CREATOR = new a.ig1(6);
    public int e;
    public android.os.Parcelable f;

    public nr1(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
        super(parcel, classLoader);
        classLoader = classLoader == null ? a.nr1.class.getClassLoader() : classLoader;
        this.e = parcel.readInt();
        this.f = parcel.readParcelable(classLoader);
    }

    public final java.lang.String toString() {
        return "FragmentPager.SavedState{" + java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)) + " position=" + this.e + "}";
    }

    @Override // a.c, android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeParcelable(this.c, i);
        parcel.writeInt(this.e);
        parcel.writeParcelable(this.f, i);
    }
}
