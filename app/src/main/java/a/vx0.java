package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class vx0 extends a.b20 {
    public static final java.lang.String E = "com.mediatek.powerhalmgr.IPowerHalMgr";
    public static final java.lang.String F = "power_hal_mgr_service";
    public static final java.util.HashMap G = new java.util.HashMap();

    public static void I1() {
        java.util.HashMap hashMap = G;
        java.util.Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            J1(((java.lang.Integer) ((java.util.Map.Entry) it.next()).getValue()).intValue());
        }
        hashMap.clear();
    }

    public static void J1(int i) {
        try {
            android.os.IBinder n0 = a.b20.n0(F);
            if (n0 == null) {
                return;
            }
            android.os.Parcel obtain = android.os.Parcel.obtain();
            android.os.Parcel obtain2 = android.os.Parcel.obtain();
            try {
                obtain.writeInterfaceToken(E);
                obtain.writeInt(i);
                n0.transact(23, obtain, obtain2, 0);
                obtain2.readException();
                obtain2.readInt();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        } catch (java.lang.Exception unused) {
        }
    }

    public static void K1(int i, int i2) {
        int i3;
        if (i == 0) {
            i3 = 4194304;
        } else if (i == 1) {
            i3 = 4194560;
        } else if (i != 2) {
            return;
        } else {
            i3 = 4194816;
        }
        L1(i3, i2);
    }

    public static void L1(int i, int i2) {
        java.util.HashMap hashMap = G;
        if (((java.lang.Integer) hashMap.get(java.lang.Integer.valueOf(i))) != null) {
            J1(i);
        }
        int[] iArr = {i, i2};
        int i3 = -1;
        try {
            android.os.IBinder n0 = a.b20.n0(F);
            if (n0 != null) {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(E);
                    obtain.writeInt(i);
                    obtain.writeInt(0);
                    obtain.writeIntArray(iArr);
                    n0.transact(22, obtain, obtain2, 0);
                    obtain2.readException();
                    int readInt = obtain2.readInt();
                    obtain2.recycle();
                    obtain.recycle();
                    i3 = readInt;
                } catch (java.lang.Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }
        } catch (java.lang.Exception unused) {
        }
        hashMap.put(java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i3));
    }
}
