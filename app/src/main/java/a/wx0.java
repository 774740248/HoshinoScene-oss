package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class wx0 extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static a.wx0 f676a;

    public static boolean a(android.content.Context context, java.lang.String str, java.lang.String str2) {
        try {
            java.io.File file = new java.io.File(str2);
            if (!file.exists()) {
                return false;
            }
            java.util.zip.ZipFile zipFile = new java.util.zip.ZipFile(file);
            java.util.zip.ZipInputStream zipInputStream = new java.util.zip.ZipInputStream(new java.io.FileInputStream(file));
            java.io.File cacheDir = context.getCacheDir();
            a.wv.s(cacheDir);
            java.lang.String absolutePath = new java.io.File(cacheDir.getAbsolutePath()).getAbsolutePath();
            java.lang.String str3 = "";
            boolean z = true;
            for (java.util.zip.ZipEntry nextEntry = zipInputStream.getNextEntry(); nextEntry != null; nextEntry = zipInputStream.getNextEntry()) {
                java.lang.String name = nextEntry.getName();
                a.wv.v(name, "zipEntry.getName()");
                java.lang.String canonicalPath = new java.io.File("/data", name).getCanonicalPath();
                a.wv.v(canonicalPath, "vFile.canonicalPath");
                if (a.yi1.B2(canonicalPath, "/data")) {
                    if (z) {
                        str3 = name.substring(0, name.length() - 1);
                        a.wv.v(str3, "this as java.lang.String…ing(startIndex, endIndex)");
                        z = false;
                    }
                    java.lang.String str4 = java.io.File.separator;
                    java.io.File file2 = new java.io.File(absolutePath + str4 + name);
                    if (nextEntry.isDirectory()) {
                        new java.io.File(absolutePath + str4 + name).mkdirs();
                    } else {
                        java.io.File parentFile = file2.getParentFile();
                        if (parentFile != null && !parentFile.exists()) {
                            parentFile.mkdirs();
                        }
                        byte[] bArr = new byte[1024];
                        java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(file2);
                        java.io.InputStream inputStream = zipFile.getInputStream(nextEntry);
                        a.wv.v(inputStream, "zipFile.getInputStream(zipEntry)");
                        while (true) {
                            int read = inputStream.read(bArr);
                            if (read == -1) {
                                break;
                            }
                            fileOutputStream.write(bArr, 0, read);
                        }
                        fileOutputStream.close();
                        inputStream.close();
                    }
                } else {
                    android.util.Log.e("Scene", "Module(Zip) SecurityException EntryName: " + name);
                }
            }
            zipInputStream.close();
            java.util.zip.ZipOutputStream zipOutputStream = new java.util.zip.ZipOutputStream(new java.io.FileOutputStream(new java.io.File(str)));
            a.gy.Y(new java.io.File(absolutePath + "/" + str3), "", zipOutputStream);
            zipOutputStream.close();
            return true;
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        a.wv.w(context, "context");
        a.wv.w(intent, "intent");
        if (a.wv.e("android.intent.action.DOWNLOAD_COMPLETE", intent.getAction())) {
            try {
                long longExtra = intent.getLongExtra("extra_download_id", -1L);
                java.lang.Object systemService = context.getSystemService("download");
                a.wv.t(systemService, "null cannot be cast to non-null type android.app.DownloadManager");
                android.app.DownloadManager downloadManager = (android.app.DownloadManager) systemService;
                android.text.TextUtils.isEmpty(downloadManager.getMimeTypeForDownloadedFile(longExtra));
                android.net.Uri uriForDownloadedFile = downloadManager.getUriForDownloadedFile(longExtra);
                java.lang.String V0 = a.b20.V0(context, uriForDownloadedFile, "_display_name");
                java.io.InputStream openInputStream = context.getContentResolver().openInputStream(uriForDownloadedFile);
                byte[] c1 = openInputStream != null ? a.wv.c1(openInputStream) : null;
                android.content.SharedPreferences sharedPreferences = context.getSharedPreferences("MagiskReCompress", 0);
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(longExtra);
                if (!sharedPreferences.contains(sb.toString())) {
                    a.cp cpVar = com.omarea.Scene.c;
                    a.fs1.X(a.b20.V0(context, uriForDownloadedFile, "_display_name") + ", OK!", 1);
                    return;
                }
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                sb2.append(longExtra);
                java.lang.String string = sharedPreferences.getString(sb2.toString(), V0);
                if (string == null) {
                    string = "Scene_Download_" + longExtra;
                } else if (a.yi1.h2(string, ".zip", false)) {
                    string = string.substring(0, a.yi1.q2(string, ".", 6));
                    a.wv.v(string, "this as java.lang.String…ing(startIndex, endIndex)");
                }
                java.io.File cacheDir = context.getCacheDir();
                a.wv.s(cacheDir);
                java.io.File file = new java.io.File(cacheDir.getAbsolutePath() + "/cache_" + longExtra + ".zip");
                java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(file);
                fileOutputStream.write(c1);
                fileOutputStream.flush();
                fileOutputStream.close();
                java.io.File file2 = new java.io.File(android.os.Environment.getExternalStoragePublicDirectory(android.os.Environment.DIRECTORY_DOWNLOADS), "/" + string + ".zip");
                java.lang.String absolutePath = file2.getAbsolutePath();
                a.wv.v(absolutePath, "sdcardFile.absolutePath");
                java.lang.String absolutePath2 = file.getAbsolutePath();
                a.wv.v(absolutePath2, "fileOut.absolutePath");
                if (a(context, absolutePath, absolutePath2)) {
                    a.cp cpVar2 = com.omarea.Scene.c;
                    a.fs1.X(file2.getAbsolutePath() + ", OK!", 1);
                } else {
                    a.cp cpVar3 = com.omarea.Scene.c;
                    a.fs1.X(string + ", Unable to save!", 0);
                }
                downloadManager.remove(longExtra);
            } catch (java.lang.Exception unused) {
            }
        }
    }
}
