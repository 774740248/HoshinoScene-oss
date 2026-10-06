package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ne implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<a.ne> CREATOR = new a.me(0);
    public final int c;
    public final android.content.Intent d;

    public ne(android.content.Intent intent, int i) {
        this.c = i;
        this.d = intent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ActivityResult{resultCode=");
        int i = this.c;
        sb.append(i != -1 ? i != 0 ? java.lang.String.valueOf(i) : "RESULT_CANCELED" : "RESULT_OK");
        sb.append(", data=");
        sb.append(this.d);
        sb.append('}');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeInt(this.c);
        android.content.Intent intent = this.d;
        parcel.writeInt(intent == null ? 0 : 1);
        if (intent != null) {
            intent.writeToParcel(parcel, i);
        }
    }

    public ne(android.os.Parcel parcel) {
        this.c = parcel.readInt();
        this.d = parcel.readInt() == 0 ? null : (android.content.Intent) android.content.Intent.CREATOR.createFromParcel(parcel);
    }
}
