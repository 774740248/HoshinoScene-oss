package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class f90 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f146a;

    public f90(android.content.Context context) {
        a.wv.w(context, "context");
        this.f146a = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0051 A[Catch: Exception -> 0x002e, TryCatch #0 {Exception -> 0x002e, blocks: (B:3:0x000c, B:5:0x0027, B:8:0x0034, B:10:0x0051, B:11:0x0076, B:13:0x008c, B:14:0x00a2, B:18:0x0030), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x008c A[Catch: Exception -> 0x002e, TryCatch #0 {Exception -> 0x002e, blocks: (B:3:0x000c, B:5:0x0027, B:8:0x0034, B:10:0x0051, B:11:0x0076, B:13:0x008c, B:14:0x00a2, B:18:0x0030), top: B:2:0x000c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Long a(java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10) {
        /*
            r5 = this;
            android.content.Context r0 = r5.f146a
            java.lang.String r1 = "url"
            a.wv.w(r6, r1)
            java.lang.String r2 = "taskAliasId"
            a.wv.w(r9, r2)
            android.app.DownloadManager$Request r3 = new android.app.DownloadManager$Request     // Catch: java.lang.Exception -> L2e
            android.net.Uri r4 = android.net.Uri.parse(r6)     // Catch: java.lang.Exception -> L2e
            r3.<init>(r4)     // Catch: java.lang.Exception -> L2e
            r3.allowScanningByMediaScanner()     // Catch: java.lang.Exception -> L2e
            r4 = 1
            r3.setNotificationVisibility(r4)     // Catch: java.lang.Exception -> L2e
            r3.setAllowedOverMetered(r4)     // Catch: java.lang.Exception -> L2e
            r3.setVisibleInDownloadsUi(r4)     // Catch: java.lang.Exception -> L2e
            r3.setAllowedOverRoaming(r4)     // Catch: java.lang.Exception -> L2e
            if (r10 == 0) goto L30
            int r4 = r10.length()     // Catch: java.lang.Exception -> L2e
            if (r4 != 0) goto L34
            goto L30
        L2e:
            r6 = move-exception
            goto La7
        L30:
            java.lang.String r10 = android.webkit.URLUtil.guessFileName(r6, r7, r8)     // Catch: java.lang.Exception -> L2e
        L34:
            java.lang.String r7 = android.os.Environment.DIRECTORY_DOWNLOADS     // Catch: java.lang.Exception -> L2e
            r3.setDestinationInExternalPublicDir(r7, r10)     // Catch: java.lang.Exception -> L2e
            java.lang.String r7 = "download"
            java.lang.Object r7 = r0.getSystemService(r7)     // Catch: java.lang.Exception -> L2e
            java.lang.String r8 = "null cannot be cast to non-null type android.app.DownloadManager"
            a.wv.t(r7, r8)     // Catch: java.lang.Exception -> L2e
            android.app.DownloadManager r7 = (android.app.DownloadManager) r7     // Catch: java.lang.Exception -> L2e
            long r7 = r7.enqueue(r3)     // Catch: java.lang.Exception -> L2e
            int r10 = r9.length()     // Catch: java.lang.Exception -> L2e
            r3 = 0
            if (r10 <= 0) goto L76
            java.lang.String r10 = "kr_downloader"
            android.content.SharedPreferences r10 = r0.getSharedPreferences(r10, r3)     // Catch: java.lang.Exception -> L2e
            a.lt0 r4 = new a.lt0     // Catch: java.lang.Exception -> L2e
            r4.<init>()     // Catch: java.lang.Exception -> L2e
            r4.m(r6, r1)     // Catch: java.lang.Exception -> L2e
            r4.m(r9, r2)     // Catch: java.lang.Exception -> L2e
            android.content.SharedPreferences$Editor r6 = r10.edit()     // Catch: java.lang.Exception -> L2e
            java.lang.String r9 = java.lang.String.valueOf(r7)     // Catch: java.lang.Exception -> L2e
            r10 = 2
            java.lang.String r10 = r4.p(r10)     // Catch: java.lang.Exception -> L2e
            android.content.SharedPreferences$Editor r6 = r6.putString(r9, r10)     // Catch: java.lang.Exception -> L2e
            r6.apply()     // Catch: java.lang.Exception -> L2e
        L76:
            r6 = 2131952671(0x7f13041f, float:1.9541791E38)
            java.lang.String r6 = r0.getString(r6)     // Catch: java.lang.Exception -> L2e
            android.widget.Toast r6 = android.widget.Toast.makeText(r0, r6, r3)     // Catch: java.lang.Exception -> L2e
            r6.show()     // Catch: java.lang.Exception -> L2e
            android.content.Context r6 = r0.getApplicationContext()     // Catch: java.lang.Exception -> L2e
            a.g90 r9 = a.g90.f171a     // Catch: java.lang.Exception -> L2e
            if (r9 != 0) goto La2
            a.g90 r9 = new a.g90     // Catch: java.lang.Exception -> L2e
            r9.<init>()     // Catch: java.lang.Exception -> L2e
            a.g90.f171a = r9     // Catch: java.lang.Exception -> L2e
            android.content.IntentFilter r9 = new android.content.IntentFilter     // Catch: java.lang.Exception -> L2e
            r9.<init>()     // Catch: java.lang.Exception -> L2e
            java.lang.String r10 = "android.intent.action.DOWNLOAD_COMPLETE"
            r9.addAction(r10)     // Catch: java.lang.Exception -> L2e
            a.g90 r10 = a.g90.f171a     // Catch: java.lang.Exception -> L2e
            r6.registerReceiver(r10, r9)     // Catch: java.lang.Exception -> L2e
        La2:
            java.lang.Long r6 = java.lang.Long.valueOf(r7)     // Catch: java.lang.Exception -> L2e
            return r6
        La7:
            int r7 = a.x60.f681a
            android.content.Context r7 = r5.f146a
            r8 = 2131952670(0x7f13041e, float:1.954179E38)
            java.lang.String r8 = r7.getString(r8)
            java.lang.String r9 = "context.getString(R.stri….kr_download_create_fail)"
            a.wv.v(r8, r9)
            java.lang.String r6 = r6.getMessage()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r6)
            java.lang.String r6 = r9.toString()
            r9 = 0
            a.fs1.F(r7, r8, r6, r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: a.f90.a(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):java.lang.Long");
    }

    public final void b(long j, java.lang.String str) {
        java.lang.String str2;
        a.wv.w(str, "absPath");
        android.content.Context context = this.f146a;
        android.content.SharedPreferences sharedPreferences = context.getSharedPreferences("kr_downloader", 0);
        java.lang.String string = sharedPreferences.getString(java.lang.String.valueOf(j), null);
        if (string != null) {
            a.lt0 lt0Var = new a.lt0(string);
            lt0Var.m(str, "absPath");
            sharedPreferences.edit().putString(java.lang.String.valueOf(j), lt0Var.p(2)).apply();
            str2 = lt0Var.h("taskAliasId");
        } else {
            str2 = "";
        }
        try {
            java.io.File file = new java.io.File(str);
            if (file.exists() && file.canRead()) {
                java.lang.String x = a.fs1.x(file);
                a.wv.v(x, "FileMD5().getFileMD5(file)");
                java.lang.String lowerCase = x.toLowerCase(java.util.Locale.ROOT);
                a.wv.v(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                java.lang.String str3 = a.pe0.f434a;
                java.nio.charset.Charset defaultCharset = java.nio.charset.Charset.defaultCharset();
                a.wv.v(defaultCharset, "defaultCharset()");
                byte[] bytes = str.getBytes(defaultCharset);
                a.wv.v(bytes, "this as java.lang.String).getBytes(charset)");
                a.pe0.i(context, "downloader/path/".concat(lowerCase), bytes);
                java.nio.charset.Charset defaultCharset2 = java.nio.charset.Charset.defaultCharset();
                a.wv.v(defaultCharset2, "defaultCharset()");
                byte[] bytes2 = str.getBytes(defaultCharset2);
                a.wv.v(bytes2, "this as java.lang.String).getBytes(charset)");
                a.pe0.i(context, "downloader/result/" + ((java.lang.Object) str2), bytes2);
            }
        } catch (java.lang.Exception unused) {
        }
    }

    public final void c(java.lang.String str, int i) {
        java.lang.String str2 = a.pe0.f434a;
        java.lang.String valueOf = java.lang.String.valueOf(i);
        java.nio.charset.Charset defaultCharset = java.nio.charset.Charset.defaultCharset();
        a.wv.v(defaultCharset, "defaultCharset()");
        byte[] bytes = valueOf.getBytes(defaultCharset);
        a.wv.v(bytes, "this as java.lang.String).getBytes(charset)");
        a.pe0.i(this.f146a, "downloader/status/".concat(str), bytes);
    }
}
