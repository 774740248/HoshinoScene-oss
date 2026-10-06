package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class dl1 extends a.c {
    public static final android.os.Parcelable.Creator<a.dl1> CREATOR = new a.ig1(12);
    public java.lang.CharSequence e;
    public boolean f;

    public dl1(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
        super(parcel, classLoader);
        this.e = (java.lang.CharSequence) android.text.TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f = parcel.readInt() == 1;
    }

    public final java.lang.String toString() {
        return "TextInputLayout.SavedState{" + java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)) + " error=" + ((java.lang.Object) this.e) + "}";
    }

    @Override // a.c, android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeParcelable(this.c, i);
        android.text.TextUtils.writeToParcel(this.e, parcel, i);
        parcel.writeInt(this.f ? 1 : 0);
    }
}
