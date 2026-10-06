package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class pe0 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String f434a;
    public static final java.lang.String b;

    static {
        java.lang.String str;
        java.lang.String str2;
        try {
            str = android.os.Environment.getExternalStorageDirectory().getAbsolutePath();
            a.wv.v(str, "{\n        Environment.ge…tory().absolutePath\n    }");
        } catch (java.lang.Exception unused) {
            str = "/data/media/0";
        }
        f434a = str;
        try {
            str2 = android.os.Environment.getExternalStoragePublicDirectory(android.os.Environment.DIRECTORY_DOWNLOADS).getAbsolutePath();
        } catch (java.lang.Exception unused2) {
            str2 = "/data/media/0/Downloads";
        }
        b = str2;
    }

    public static byte[] a(android.content.Context context, java.lang.String str) {
        a.wv.w(context, "context");
        a.wv.w(str, "fileName");
        try {
            java.io.InputStream open = context.getAssets().open(str);
            a.wv.v(open, "assetManager.open(fileName)");
            byte[] bArr = new byte[open.available()];
            int read = open.read(bArr);
            if (read < 0) {
                read = 0;
            }
            java.nio.charset.Charset charset = a.bu.f53a;
            java.lang.String str2 = new java.lang.String(bArr, 0, read, charset);
            java.util.regex.Pattern compile = java.util.regex.Pattern.compile("\r\n");
            a.wv.v(compile, "compile(pattern)");
            java.lang.String replaceAll = compile.matcher(str2).replaceAll("\n");
            a.wv.v(replaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
            java.util.regex.Pattern compile2 = java.util.regex.Pattern.compile("\r\t");
            a.wv.v(compile2, "compile(pattern)");
            java.lang.String replaceAll2 = compile2.matcher(replaceAll).replaceAll("\t");
            a.wv.v(replaceAll2, "nativePattern.matcher(in…).replaceAll(replacement)");
            byte[] bytes = replaceAll2.getBytes(charset);
            a.wv.v(bytes, "this as java.lang.String).getBytes(charset)");
            return bytes;
        } catch (java.lang.Exception e) {
            android.util.Log.e("script-parse", e.getMessage());
            byte[] bytes2 = "".getBytes(a.bu.f53a);
            a.wv.v(bytes2, "this as java.lang.String).getBytes(charset)");
            return bytes2;
        }
    }

    public static byte[] b(byte[] bArr) {
        a.wv.w(bArr, "bytes");
        try {
            java.nio.charset.Charset charset = a.bu.f53a;
            java.lang.String str = new java.lang.String(bArr, charset);
            java.util.regex.Pattern compile = java.util.regex.Pattern.compile("\r\n");
            a.wv.v(compile, "compile(pattern)");
            java.lang.String replaceAll = compile.matcher(str).replaceAll("\n");
            a.wv.v(replaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
            java.util.regex.Pattern compile2 = java.util.regex.Pattern.compile("\r\t");
            a.wv.v(compile2, "compile(pattern)");
            java.lang.String replaceAll2 = compile2.matcher(replaceAll).replaceAll("\t");
            a.wv.v(replaceAll2, "nativePattern.matcher(in…).replaceAll(replacement)");
            byte[] bytes = replaceAll2.getBytes(charset);
            a.wv.v(bytes, "this as java.lang.String).getBytes(charset)");
            return bytes;
        } catch (java.lang.Exception e) {
            android.util.Log.e("script-parse", e.getMessage());
            byte[] bytes2 = "".getBytes(a.bu.f53a);
            a.wv.v(bytes2, "this as java.lang.String).getBytes(charset)");
            return bytes2;
        }
    }

    public static java.lang.String c(android.content.Context context) {
        a.wv.w(context, "context");
        return a.ii1.e(context.getFilesDir().getAbsolutePath(), "/");
    }

    public static java.lang.String d(android.content.Context context, java.lang.String str) {
        a.wv.w(context, "context");
        a.wv.w(str, "outName");
        java.lang.String c = c(context);
        if (a.yi1.B2(str, "/")) {
            str = str.substring(1, str.length());
            a.wv.v(str, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        return a.ii1.e(c, str);
    }

    public static java.lang.String e(android.content.Context context, java.lang.String str) {
        a.wv.w(context, "context");
        java.io.File externalFilesDir = context.getExternalFilesDir(null);
        java.io.File parentFile = externalFilesDir != null ? externalFilesDir.getParentFile() : null;
        if (parentFile == null) {
            parentFile = new java.io.File(f434a + "/Android/data/" + context.getPackageName());
        }
        if (!parentFile.exists()) {
            parentFile.mkdirs();
        }
        java.lang.String f = a.ii1.f(parentFile.getAbsolutePath(), "/", str);
        java.io.File parentFile2 = new java.io.File(f).getParentFile();
        if (!parentFile2.exists()) {
            parentFile2.mkdirs();
        }
        return f;
    }

    public static void f(java.io.File file, byte[] bArr) {
        a.wv.w(bArr, "bytes");
        file.getParentFile().mkdirs();
        a.wv.V1(file, bArr);
    }

    public static java.lang.String g(android.content.res.AssetManager assetManager, java.lang.String str, java.lang.String str2, android.content.Context context) {
        java.io.InputStream open;
        a.wv.w(assetManager, "assetManager");
        a.wv.w(str2, "outName");
        a.wv.w(context, "context");
        try {
            if (a.yi1.B2(str, "file:///android_asset/")) {
                java.lang.String substring = str.substring(22);
                a.wv.v(substring, "this as java.lang.String).substring(startIndex)");
                open = assetManager.open(substring);
            } else {
                open = assetManager.open(str);
            }
            a.wv.v(open, "if (file.startsWith(\"fil….open(file)\n            }");
            java.io.File file = new java.io.File(c(context));
            if (!file.exists()) {
                file.mkdirs();
            }
            java.lang.String d = d(context, str2);
            java.io.File parentFile = new java.io.File(d).getParentFile();
            if (!parentFile.exists()) {
                parentFile.mkdirs();
            }
            java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(d);
            byte[] bArr = new byte[20480];
            while (true) {
                int read = open.read(bArr);
                if (read <= 0) {
                    fileOutputStream.close();
                    open.close();
                    java.io.File file2 = new java.io.File(d);
                    file2.setWritable(true, false);
                    file2.setExecutable(true, false);
                    file2.setReadable(true, false);
                    return d;
                }
                fileOutputStream.write(bArr, 0, read);
            }
        } catch (java.io.IOException e) {
            android.util.Log.e("writePrivateFile", e.getMessage(), e.getCause());
            e.printStackTrace();
            return null;
        }
    }

    public static void h(android.content.Context context, java.lang.String str, java.lang.String str2) {
        a.wv.w(context, "context");
        android.content.res.AssetManager assets = context.getAssets();
        a.wv.v(assets, "context.assets");
        g(assets, str, str2, context);
    }

    public static boolean i(android.content.Context context, java.lang.String str, byte[] bArr) {
        a.wv.w(bArr, "bytes");
        a.wv.w(str, "outName");
        a.wv.w(context, "context");
        try {
            java.io.File file = new java.io.File(c(context));
            if (!file.exists()) {
                file.mkdirs();
            }
            java.lang.String d = d(context, str);
            java.io.File parentFile = new java.io.File(d).getParentFile();
            if (!parentFile.exists()) {
                parentFile.mkdirs();
            }
            java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(d);
            fileOutputStream.write(bArr, 0, bArr.length);
            fileOutputStream.close();
            new java.io.File(d).setExecutable(true, false);
            java.io.File file2 = new java.io.File(d);
            file2.setWritable(true, false);
            file2.setExecutable(true, false);
            file2.setReadable(true, false);
            return true;
        } catch (java.io.IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static java.lang.String j(android.content.Context context, java.lang.String str, java.lang.String str2) {
        a.wv.w(str, "file");
        a.wv.w(str2, "outName");
        a.wv.w(context, "context");
        byte[] a2 = a(context, str);
        if (a2.length <= 0 || !i(context, str2, a2)) {
            return null;
        }
        return d(context, str2);
    }

    public static java.lang.String k(android.content.Context context, java.lang.String str, byte[] bArr) {
        a.wv.w(context, "context");
        try {
            java.lang.String e = e(context, str);
            java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(e);
            fileOutputStream.write(bArr, 0, bArr.length);
            fileOutputStream.close();
            java.io.File file = new java.io.File(e);
            file.setWritable(true, false);
            file.setExecutable(true, false);
            file.setReadable(true, false);
            return e;
        } catch (java.io.FileNotFoundException e2) {
            e2.printStackTrace();
            return null;
        } catch (java.io.IOException e3) {
            e3.printStackTrace();
            return null;
        }
    }
}
