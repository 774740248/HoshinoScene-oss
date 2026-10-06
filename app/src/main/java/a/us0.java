package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class us0 implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<a.us0> CREATOR = new a.me(1);
    public final android.content.IntentSender c;
    public final android.content.Intent d;
    public final int e;
    public final int f;

    public us0(android.content.IntentSender intentSender, android.content.Intent intent, int i, int i2) {
        this.c = intentSender;
        this.d = intent;
        this.e = i;
        this.f = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeParcelable(this.c, i);
        parcel.writeParcelable(this.d, i);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
    }

    public us0(android.os.Parcel parcel) {
        this.c = (android.content.IntentSender) parcel.readParcelable(android.content.IntentSender.class.getClassLoader());
        this.d = (android.content.Intent) parcel.readParcelable(android.content.Intent.class.getClassLoader());
        this.e = parcel.readInt();
        this.f = parcel.readInt();
    }
}
