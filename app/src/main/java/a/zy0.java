package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class zy0 extends android.view.View.BaseSavedState {

    public zy0() {
        super(android.os.Parcel.obtain());
    }
    public static final android.os.Parcelable.Creator<a.zy0> CREATOR = new a.me(16);
    public int c;

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("MaterialCheckBox.SavedState{");
        sb.append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)));
        sb.append(" CheckedState=");
        int i = this.c;
        return a.ai1.j(sb, i != 1 ? i != 2 ? "unchecked" : "indeterminate" : "checked", "}");
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeValue(java.lang.Integer.valueOf(this.c));
    }
}
