package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class qh1 extends a.c {
    public static final android.os.Parcelable.Creator<a.qh1> CREATOR = new a.ig1(10);
    public final int e;

    public qh1(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
        super(parcel, classLoader);
        this.e = parcel.readInt();
    }

    @Override // a.c, android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeParcelable(this.c, i);
        parcel.writeInt(this.e);
    }

    public qh1(android.view.AbsSavedState absSavedState, com.google.android.material.sidesheet.SideSheetBehavior sideSheetBehavior) {
        super(absSavedState);
        this.e = sideSheetBehavior.state;
    }
}
