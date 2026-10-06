package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class f81 extends a.b20 {
    public static final java.lang.String E = "com.qualcomm.qti.IPerfManager";
    public static final java.lang.String F = "vendor.perfservice";
    public static final java.util.HashMap G = new java.util.HashMap();

    public static void I1() {
        try {
            android.os.IBinder n0 = a.b20.n0(F);
            if (n0 == null) {
                return;
            }
            android.os.Parcel obtain = android.os.Parcel.obtain();
            android.os.Parcel obtain2 = android.os.Parcel.obtain();
            try {
                obtain.writeInterfaceToken(E);
                n0.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                obtain2.readInt();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }

    public static void J1(int i, int i2) {
        int i3;
        if (i == 0) {
            i3 = 1082130688;
        } else if (i == 1) {
            i3 = 1082130432;
        } else if (i != 2) {
            return;
        } else {
            i3 = 1082130944;
        }
        K1(i3, i2 / 1000);
    }

    public static void K1(int i, int i2) {
        android.os.Parcel obtain;
        android.os.Parcel obtain2;
        java.util.HashMap hashMap = G;
        java.lang.Integer num = (java.lang.Integer) hashMap.get(java.lang.Integer.valueOf(i));
        java.lang.String str = E;
        java.lang.String str2 = F;
        if (num != null) {
            try {
                android.os.IBinder n0 = a.b20.n0(str2);
                if (n0 != null) {
                    obtain = android.os.Parcel.obtain();
                    obtain2 = android.os.Parcel.obtain();
                    try {
                        obtain.writeInterfaceToken(str);
                        obtain.writeInt(i);
                        n0.transact(2, obtain, obtain2, 0);
                        obtain2.readException();
                        obtain2.readInt();
                        obtain2.recycle();
                        obtain.recycle();
                    } finally {
                    }
                }
            } catch (java.lang.Exception e) {
                e.printStackTrace();
            }
        }
        int[] iArr = {i, i2};
        int i3 = -1;
        try {
            android.os.IBinder n02 = a.b20.n0(str2);
            if (n02 != null) {
                obtain = android.os.Parcel.obtain();
                obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(str);
                    obtain.writeInt(i);
                    obtain.writeInt(2);
                    obtain.writeIntArray(iArr);
                    n02.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    int readInt = obtain2.readInt();
                    obtain2.recycle();
                    obtain.recycle();
                    i3 = readInt;
                } finally {
                }
            }
        } catch (java.lang.Exception e2) {
            e2.printStackTrace();
        }
        hashMap.put(java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i3));
    }
}
