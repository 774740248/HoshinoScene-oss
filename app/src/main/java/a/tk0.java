package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class tk0 extends a.lj1 implements a.fp0 {
    public int g;
    public final /* synthetic */ a.vk0 h;
    public final /* synthetic */ a.w60 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tk0(a.w60 w60Var, a.vk0 vk0Var, a.ey eyVar) {
        super(2, eyVar);
        this.h = vk0Var;
        this.i = w60Var;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.tk0(this.i, this.h, eyVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.io.FileFilter, java.lang.Object] */
    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        java.util.ArrayList d;
        java.io.File[] listFiles;
        android.content.pm.ApplicationInfo applicationInfo;
        long longVersionCode;
        a.dz dzVar = a.dz.c;
        int i = this.g;
        int i2 = 1;
        if (i == 0) {
            a.b20.q1(obj);
            a.q10 q10Var = a.q10.f457a;
            this.g = 1;
            if (q10Var.I(2000, this) == dzVar) {
                return dzVar;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a.b20.q1(obj);
                return a.no1.f387a;
            }
            a.b20.q1(obj);
        }
        a.vk0 vk0Var = this.h;
        int B = a.ai1.B(vk0Var.b0);
        if (B == 0) {
            a.po poVar = vk0Var.c0;
            if (poVar == null) {
                a.wv.M1("appListHelper");
                throw null;
            }
            d = poVar.d(java.lang.Boolean.FALSE, true);
        } else if (B == 1) {
            a.po poVar2 = vk0Var.c0;
            if (poVar2 == null) {
                a.wv.M1("appListHelper");
                throw null;
            }
            d = poVar2.d(java.lang.Boolean.TRUE, true);
        } else {
            if (B != 2) {
                throw new java.lang.RuntimeException();
            }
            a.po poVar3 = vk0Var.c0;
            if (poVar3 == null) {
                a.wv.M1("appListHelper");
                throw null;
            }
            android.content.pm.PackageManager packageManager = poVar3.c;
            java.lang.String str = a.vv.f643a;
            d = new java.util.ArrayList();
            java.io.File file = new java.io.File(str);
            if (file.exists()) {
                if (!file.isDirectory()) {
                    file.delete();
                    file.mkdirs();
                } else if (file.canRead() && (listFiles = file.listFiles(new java.io.FileFilter())) != null) {
                    int length = listFiles.length;
                    boolean z = false;
                    int i3 = 0;
                    while (i3 < length) {
                        java.lang.String absolutePath = listFiles[i3].getAbsolutePath();
                        try {
                            android.content.pm.PackageInfo packageArchiveInfo = packageManager.getPackageArchiveInfo(absolutePath, i2);
                            if (packageArchiveInfo != null && (applicationInfo = packageArchiveInfo.applicationInfo) != null) {
                                applicationInfo.sourceDir = absolutePath;
                                applicationInfo.publicSourceDir = absolutePath;
                                com.omarea.model.AppInfo item = com.omarea.model.AppInfo.getItem();
                                item.setSelected(z);
                                if (android.os.Build.VERSION.SDK_INT >= 28) {
                                    longVersionCode = packageArchiveInfo.getLongVersionCode();
                                    item.versionCode = (int) longVersionCode;
                                } else {
                                    item.versionCode = packageArchiveInfo.versionCode;
                                }
                                java.lang.CharSequence loadLabel = applicationInfo.loadLabel(packageManager);
                                item.setAppName(((java.lang.Object) loadLabel) + "  (" + item.versionCode + ")");
                                java.lang.String str2 = applicationInfo.packageName;
                                a.wv.v(str2, "applicationInfo.packageName");
                                item.setPackageName(str2);
                                item.path = applicationInfo.sourceDir;
                                item.stateTags = poVar3.a(packageArchiveInfo);
                                item.versionName = packageArchiveInfo.versionName;
                                item.appType = com.omarea.model.AppInfo.AppType.BACKUPFILE;
                                d.add(item);
                            }
                        } catch (java.lang.Exception unused) {
                        }
                        i3++;
                        i2 = 1;
                        z = false;
                    }
                }
            }
        }
        vk0Var.d0 = d;
        a.u20 u20Var = a.z80.f728a;
        a.zx0 zx0Var = a.by0.f57a;
        a.sk0 sk0Var = new a.sk0(this.i, vk0Var, null);
        this.g = 2;
        if (a.wv.S1(zx0Var, sk0Var, this) == dzVar) {
            return dzVar;
        }
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        return ((a.tk0) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
