package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class jg1 extends a.c {
    public static final android.os.Parcelable.Creator<a.jg1> CREATOR = new a.ig1(0);
    public boolean e;

    public jg1(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
        super(parcel, classLoader);
        this.e = ((java.lang.Boolean) parcel.readValue(null)).booleanValue();
    }

    public final java.lang.String toString() {
        return "SearchView.SavedState{" + java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)) + " isIconified=" + this.e + "}";
    }

    @Override // a.c, android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeParcelable(this.c, i);
        parcel.writeValue(java.lang.Boolean.valueOf(this.e));
    }
}
