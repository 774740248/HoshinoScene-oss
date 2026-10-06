package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class x11 extends android.view.View.BaseSavedState {

    public x11() {
        super(android.os.Parcel.obtain());
    }
    public static final android.os.Parcelable.Creator<a.x11> CREATOR = new a.me(3);
    public int c;

    public final java.lang.String toString() {
        return "HorizontalScrollView.SavedState{" + java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)) + " scrollPosition=" + this.c + "}";
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.c);
    }
}
