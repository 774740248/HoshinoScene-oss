package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class rr0 implements a.tr0 {

    /* renamed from: a, reason: collision with root package name */
    public android.os.IBinder f503a;

    public final boolean a(java.lang.String str) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.omarea.vaddin.IAppConfigAidlInterface");
            obtain.writeString(str);
            obtain.writeInt(0);
            this.f503a.transact(7, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt() != 0;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final android.os.IBinder asBinder() {
        return this.f503a;
    }

    public final java.lang.String b(java.lang.String str) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.omarea.vaddin.IAppConfigAidlInterface");
            obtain.writeString(str);
            obtain.writeString("{}");
            this.f503a.transact(9, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readString();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final boolean c(java.lang.String str, boolean z) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.omarea.vaddin.IAppConfigAidlInterface");
            obtain.writeString(str);
            obtain.writeInt(z ? 1 : 0);
            this.f503a.transact(4, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt() != 0;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final boolean d(java.lang.String str, java.lang.String str2) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.omarea.vaddin.IAppConfigAidlInterface");
            obtain.writeString(str);
            obtain.writeString(str2);
            this.f503a.transact(5, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt() != 0;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
