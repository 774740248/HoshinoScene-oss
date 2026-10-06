package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ae0 extends a.lj1 implements a.fp0 {
    public int g;
    public final /* synthetic */ a.w21 h;
    public final /* synthetic */ java.lang.String i;
    public final /* synthetic */ java.lang.String[] j;
    public final /* synthetic */ a.w60 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ae0(a.w21 w21Var, java.lang.String str, java.lang.String[] strArr, a.w60 w60Var, a.ey eyVar) {
        super(2, eyVar);
        this.h = w21Var;
        this.i = str;
        this.j = strArr;
        this.k = w60Var;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.ae0(this.h, this.i, this.j, this.k, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.wd0 wd0Var;
        java.lang.String str;
        a.dz dzVar = a.dz.c;
        int i = this.g;
        boolean z = true;
        if (i == 0) {
            a.b20.q1(obj);
            a.w21 w21Var = this.h;
            android.content.Context context = w21Var.f649a;
            a.wv.w(context, "context");
            java.lang.String str2 = this.i;
            a.wv.w(str2, "apks");
            java.lang.String[] strArr = this.j;
            a.wv.w(strArr, "splits");
            if (strArr.length == 0) {
                wd0Var = new a.wd0();
                wd0Var.d = "error";
                java.lang.String string = context.getString(2131951866);
                a.wv.v(string, "context.getString(R.string.apks_no_split_selected)");
                wd0Var.f658a = string;
            } else {
                java.io.File file = new java.io.File(java.lang.System.getProperty("java.io.tmpdir"), "scene_apks_install");
                try {
                    try {
                        a.qe0.a2(file);
                        file.mkdirs();
                        java.util.HashSet hashSet = new java.util.HashSet(a.b20.B0(strArr.length));
                        a.op.V1(hashSet, strArr);
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.util.zip.ZipFile zipFile = new java.util.zip.ZipFile(str2);
                        try {
                            java.util.Enumeration<? extends java.util.zip.ZipEntry> entries = zipFile.entries();
                            a.wv.v(entries, "zip.entries()");
                            while (entries.hasMoreElements()) {
                                java.util.zip.ZipEntry nextElement = entries.nextElement();
                                if (!nextElement.isDirectory()) {
                                    java.lang.String name = nextElement.getName();
                                    a.wv.v(name, "entry.name");
                                    if (a.yi1.h2(name, ".apk", z)) {
                                        java.lang.String name2 = new java.io.File(nextElement.getName()).getName();
                                        a.wv.v(name2, "name");
                                        java.lang.String l = a.l1.l(name2);
                                        if (!hashSet.contains(nextElement.getName()) && !hashSet.contains(name2) && !hashSet.contains(l)) {
                                        }
                                        java.io.File file2 = new java.io.File(file, name2);
                                        java.io.InputStream inputStream = zipFile.getInputStream(nextElement);
                                        try {
                                            java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(file2);
                                            try {
                                                a.wv.v(inputStream, "input");
                                                a.wv.F(inputStream, fileOutputStream);
                                                a.wv.z(fileOutputStream, null);
                                                a.wv.z(inputStream, null);
                                                arrayList.add(file2);
                                            } finally {
                                            }
                                        } finally {
                                        }
                                    }
                                }
                                z = true;
                            }
                            a.wv.z(zipFile, null);
                            if (arrayList.isEmpty()) {
                                wd0Var = new a.wd0();
                                wd0Var.d = "error";
                                java.lang.String string2 = context.getString(2131951871);
                                a.wv.v(string2, "context.getString(R.string.apks_split_not_found)");
                                wd0Var.f658a = string2;
                            } else {
                                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                sb.append("rm -rf ");
                                sb.append(a.l1.i("/data/local/tmp/scene_apks_install"));
                                sb.append('\n');
                                sb.append("mkdir -p ");
                                sb.append(a.l1.i("/data/local/tmp/scene_apks_install"));
                                sb.append('\n');
                                java.util.Iterator it = arrayList.iterator();
                                while (it.hasNext()) {
                                    java.io.File file3 = (java.io.File) it.next();
                                    java.lang.String str3 = "/data/local/tmp/scene_apks_install/" + file3.getName();
                                    sb.append("cp ");
                                    java.lang.String absolutePath = file3.getAbsolutePath();
                                    a.wv.v(absolutePath, "file.absolutePath");
                                    sb.append(a.l1.i(absolutePath));
                                    sb.append(' ');
                                    sb.append(a.l1.i(str3));
                                    sb.append('\n');
                                    sb.append("chmod 644 ");
                                    sb.append(a.l1.i(str3));
                                    sb.append('\n');
                                }
                                sb.append("session=$(pm install-create -r -d | sed 's/.*\\[\\(.*\\)\\].*/\\1/')\n");
                                sb.append("if [ -z \"$session\" ]; then echo \"create install session failed\" >&2; exit 1; fi\n");
                                java.util.Iterator it2 = arrayList.iterator();
                                while (it2.hasNext()) {
                                    java.io.File file4 = (java.io.File) it2.next();
                                    java.lang.String str4 = "/data/local/tmp/scene_apks_install/" + file4.getName();
                                    sb.append("size=$(wc -c < ");
                                    sb.append(a.l1.i(str4));
                                    sb.append(" | tr -d ' ')\n");
                                    sb.append("pm install-write -S \"$size\" \"$session\" ");
                                    java.lang.String name3 = file4.getName();
                                    a.wv.v(name3, "file.name");
                                    sb.append(a.l1.i(name3));
                                    sb.append(' ');
                                    sb.append(a.l1.i(str4));
                                    sb.append(" || {\n");
                                    sb.append("  echo \"install-write failed\" >&2\n");
                                    sb.append("  pm install-abandon \"$session\" 2>/dev/null\n");
                                    sb.append("  exit 1\n");
                                    sb.append("}\n");
                                }
                                sb.append("pm install-commit \"$session\" || {\n");
                                sb.append("  echo \"install-commit failed\" >&2\n");
                                sb.append("  exit 1\n");
                                sb.append("}\n");
                                sb.append("rm -rf ");
                                sb.append(a.l1.i("/data/local/tmp/scene_apks_install"));
                                sb.append('\n');
                                java.lang.String sb2 = sb.toString();
                                a.wv.v(sb2, "sb.toString()");
                                wd0Var = a.gy.l(sb2);
                            }
                            try {
                                a.qe0.a2(file);
                            } catch (java.lang.Exception unused) {
                            }
                        } finally {
                        }
                    } catch (java.lang.Throwable th) {
                        try {
                            a.qe0.a2(file);
                        } catch (java.lang.Exception unused2) {
                        }
                        throw th;
                    }
                } catch (java.lang.Exception e) {
                    a.wd0 wd0Var2 = new a.wd0();
                    wd0Var2.d = "error";
                    java.lang.String message = e.getMessage();
                    if (message == null) {
                        message = context.getString(2131951865);
                        a.wv.v(message, "context.getString(R.string.apks_install_failed)");
                    }
                    wd0Var2.f658a = message;
                    try {
                        a.qe0.a2(file);
                    } catch (java.lang.Exception unused3) {
                    }
                    wd0Var = wd0Var2;
                }
            }
            if (wd0Var.c) {
                str = null;
            } else if (a.wv.e((java.lang.String) wd0Var.d, "error")) {
                str = wd0Var.f658a;
                if (str.length() == 0) {
                    str = w21Var.f649a.getString(2131952275);
                    a.wv.v(str, "context.getString(R.stri…n_install_request_failed)");
                }
            } else {
                java.lang.String str5 = wd0Var.f658a;
                str = str5.length() == 0 ? wd0Var.b : str5;
            }
            a.u20 u20Var = a.z80.f728a;
            a.zx0 zx0Var = a.by0.f57a;
            a.zd0 zd0Var = new a.zd0(w21Var, this.k, str, null);
            this.g = 1;
            if (a.wv.S1(zx0Var, zd0Var, this) == dzVar) {
                return dzVar;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a.b20.q1(obj);
        }
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        return ((a.ae0) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
