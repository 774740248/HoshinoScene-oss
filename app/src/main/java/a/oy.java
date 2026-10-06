package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class oy extends a.c {
    public static final android.os.Parcelable.Creator<a.oy> CREATOR = new a.ig1(2);
    public android.util.SparseArray e;

    public oy(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        int[] iArr = new int[readInt];
        parcel.readIntArray(iArr);
        android.os.Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
        this.e = new android.util.SparseArray(readInt);
        for (int i = 0; i < readInt; i++) {
            this.e.append(iArr[i], readParcelableArray[i]);
        }
    }

    @Override // a.c, android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeParcelable(this.c, i);
        android.util.SparseArray sparseArray = this.e;
        int size = sparseArray != null ? sparseArray.size() : 0;
        parcel.writeInt(size);
        int[] iArr = new int[size];
        android.os.Parcelable[] parcelableArr = new android.os.Parcelable[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr[i2] = this.e.keyAt(i2);
            parcelableArr[i2] = (android.os.Parcelable) this.e.valueAt(i2);
        }
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i);
    }
}
