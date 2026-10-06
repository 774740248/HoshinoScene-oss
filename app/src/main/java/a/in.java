package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class in extends android.view.View.BaseSavedState {

    public in() {
        super(android.os.Parcel.obtain());
    }
    public static final android.os.Parcelable.Creator<a.in> CREATOR = new a.me(2);
    public boolean c;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.c ? (byte) 1 : (byte) 0);
    }
}
