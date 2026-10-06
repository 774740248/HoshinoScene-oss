package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class bs extends a.c {
    public static final android.os.Parcelable.Creator<a.bs> CREATOR = new a.ig1(7);
    public final int e;
    public final int f;
    public final boolean g;
    public final boolean h;
    public final boolean i;

    public bs(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
        super(parcel, classLoader);
        this.e = parcel.readInt();
        this.f = parcel.readInt();
        this.g = parcel.readInt() == 1;
        this.h = parcel.readInt() == 1;
        this.i = parcel.readInt() == 1;
    }

    @Override // a.c, android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeParcelable(this.c, i);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
        parcel.writeInt(this.g ? 1 : 0);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.i ? 1 : 0);
    }

    public bs(android.view.AbsSavedState absSavedState, com.google.android.material.bottomsheet.BottomSheetBehavior bottomSheetBehavior) {
        super(absSavedState);
        this.e = bottomSheetBehavior.L;
        this.f = bottomSheetBehavior.peekHeight;
        this.g = bottomSheetBehavior.updateImportantForAccessibilityOnSiblings;
        this.h = bottomSheetBehavior.I;
        this.i = bottomSheetBehavior.J;
    }
}
