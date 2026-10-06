package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class vr0 extends android.os.Binder implements android.os.IInterface {
    @Override // android.os.IInterface
    public final android.os.IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) {
        byte[] decode;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface("com.omarea.editor.service.IEditorFileService");
        }
        if (i == 1598968902) {
            parcel2.writeString("com.omarea.editor.service.IEditorFileService");
            return true;
        }
        if (i == 1) {
            java.lang.String readString = parcel.readString();
            a.wv.w(readString, "path");
            try {
                decode = a.wv.b1(new java.io.File(readString));
            } catch (java.lang.Exception unused) {
                a.q10 q10Var = a.q10.f457a;
                java.lang.String L = a.q10.L("read-bytes", readString, 20000L);
                if (a.wv.e(L, "error")) {
                    throw new java.io.IOException("Scene 守护进程不可用或无 root 权限，无法读取 ".concat(readString));
                }
                decode = android.util.Base64.decode(L, 11);
            }
            if (decode.length > 921600) {
                throw new java.io.IOException(a.ai1.e("文件过大（", decode.length, " 字节），超过单次传输上限 921600 字节"));
            }
            parcel2.writeNoException();
            parcel2.writeByteArray(decode);
        } else {
            if (i != 2) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            java.lang.String readString2 = parcel.readString();
            byte[] createByteArray = parcel.createByteArray();
            a.ga0 ga0Var = (a.ga0) this;
            a.wv.w(readString2, "path");
            a.wv.w(createByteArray, "data");
            if (createByteArray.length > 921600) {
                throw new java.io.IOException(a.ai1.e("内容过大（", createByteArray.length, " 字节），超过单次传输上限 921600 字节"));
            }
            try {
                a.wv.V1(new java.io.File(readString2), createByteArray);
            } catch (java.lang.Exception unused2) {
                java.io.File file = new java.io.File(ga0Var.f172a.getCacheDir(), "editor_proxy_write_" + java.lang.System.currentTimeMillis() + ".tmp");
                try {
                    a.wv.V1(file, createByteArray);
                    java.lang.String absolutePath = file.getAbsolutePath();
                    a.wv.v(absolutePath, "tmp.absolutePath");
                    java.lang.String a2 = a.ga0.a(absolutePath);
                    java.lang.String a3 = a.ga0.a(readString2);
                    java.lang.String absolutePath2 = file.getAbsolutePath();
                    a.wv.v(absolutePath2, "tmp.absolutePath");
                    a.wd0 l = a.gy.l("cp " + a2 + " " + a3 + " && rm " + a.ga0.a(absolutePath2));
                    if (!l.c) {
                        java.lang.String str = (java.lang.String) l.d;
                        if (str.length() == 0) {
                            str = l.b;
                        }
                        throw new java.io.IOException("写入失败：" + ((java.lang.Object) str));
                    }
                } finally {
                    file.delete();
                }
            }
            parcel2.writeNoException();
            parcel2.writeInt(1);
        }
        return true;
    }
}
