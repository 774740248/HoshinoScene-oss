package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
/* [修复] 从 smali 还原：qr0 无抽象方法，abstract 为 R8 冗余标志，去 abstract 保编译 */
public class qr0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.net.Proxy f476a = null;
    public final byte[] b = {52, 49, 66, 55, 69, 53, 57, 52, 66, 50, 65, 66, 51, 65, 65, 51, 54, 53, 50, 68, 49, 48, 51, 50, 49, 68, 70, 55, 51, 49, 55, 49};
    public final int c = 3000;
    public final int d = 5000;

    public static byte[] b(a.re1 re1Var, java.lang.String str) {
        java.net.HttpURLConnection httpURLConnection;
        a.wv.w(str, "url");
        java.net.Proxy proxy = re1Var.f476a;
        if (proxy == null) {
            java.net.URLConnection openConnection = new java.net.URL(str).openConnection();
            a.wv.t(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
            httpURLConnection = (java.net.HttpURLConnection) openConnection;
        } else {
            java.net.URLConnection openConnection2 = new java.net.URL(str).openConnection(proxy);
            a.wv.t(openConnection2, "null cannot be cast to non-null type java.net.HttpURLConnection");
            httpURLConnection = (java.net.HttpURLConnection) openConnection2;
        }
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.setConnectTimeout(re1Var.f);
        httpURLConnection.setReadTimeout(re1Var.g);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setUseCaches(false);
        java.io.InputStream inputStream = re1Var.a(httpURLConnection).getInputStream();
        a.wv.v(inputStream, "beforeReadResponse(connection).inputStream");
        byte[] c1 = a.wv.c1(inputStream);
        httpURLConnection.disconnect();
        return c1;
    }

    public static a.lt0 h(a.qr0 qr0Var, java.lang.String str, a.lt0 lt0Var) {
        qr0Var.getClass();
        a.wv.w(str, "url");
        java.lang.String i = qr0Var.i(str, lt0Var, 5L);
        if (i == null) {
            return null;
        }
        try {
            if (i.length() > 0) {
                return new a.lt0(i);
            }
            return null;
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public static java.lang.String j(a.qr0 qr0Var, java.lang.String str, byte[] bArr) {
        qr0Var.getClass();
        a.wv.w(str, "url");
        java.net.HttpURLConnection e = qr0Var.e(str, "application/json");
        e.setRequestMethod("POST");
        e.setRequestProperty("Content-Encoding", "gzip");
        e.setDoOutput(true);
        java.io.OutputStream outputStream = e.getOutputStream();
        try {
            java.util.zip.GZIPOutputStream gZIPOutputStream = new java.util.zip.GZIPOutputStream(outputStream);
            try {
                gZIPOutputStream.write(bArr);
                a.wv.z(gZIPOutputStream, null);
                a.wv.z(outputStream, null);
                return qr0Var.l(e);
            } finally {
            }
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                a.wv.z(outputStream, th);
                throw th2;
            }
        }
    }

    public final java.net.HttpURLConnection a(java.net.HttpURLConnection httpURLConnection) {
        int responseCode = httpURLConnection.getResponseCode();
        if (responseCode != 307 && responseCode != 308) {
            switch (responseCode) {
                case 301:
                case 302:
                case 303:
                    break;
                default:
                    return httpURLConnection;
            }
        }
        java.lang.String headerField = httpURLConnection.getHeaderField("Location");
        if (headerField == null || headerField.length() == 0) {
            return httpURLConnection;
        }
        httpURLConnection.disconnect();
        java.lang.String url = httpURLConnection.getURL().toString();
        a.wv.v(url, "connection.url.toString()");
        java.lang.String url2 = new java.net.URL(new java.net.URL(url), headerField).toString();
        a.wv.v(url2, "URL(URL(url), location).toString()");
        if (a.wv.e(url2, url)) {
            return httpURLConnection;
        }
        httpURLConnection.disconnect();
        java.lang.String contentType = httpURLConnection.getContentType();
        a.wv.v(contentType, "connection.contentType");
        return e(url2, contentType);
    }

    public int c() {
        return this.c;
    }

    public int d() {
        return this.d;
    }

    public final java.net.HttpURLConnection e(java.lang.String str, java.lang.String str2) {
        java.net.HttpURLConnection httpURLConnection;
        java.net.Proxy proxy = this.f476a;
        if (proxy == null) {
            java.net.URLConnection openConnection = new java.net.URL(str).openConnection();
            a.wv.t(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
            httpURLConnection = (java.net.HttpURLConnection) openConnection;
        } else {
            java.net.URLConnection openConnection2 = new java.net.URL(str).openConnection(proxy);
            a.wv.t(openConnection2, "null cannot be cast to non-null type java.net.HttpURLConnection");
            httpURLConnection = (java.net.HttpURLConnection) openConnection2;
        }
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setConnectTimeout(c());
        httpURLConnection.setReadTimeout(d());
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setRequestProperty("Content-Type", str2);
        return httpURLConnection;
    }

    public final java.lang.String f(java.lang.String str) {
        byte[] decode = android.util.Base64.decode(str, 11);
        javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance(a.r10.b);
        cipher.init(2, new javax.crypto.spec.SecretKeySpec(this.b, a.r10.f484a), new javax.crypto.spec.IvParameterSpec(a.r10.c));
        byte[] doFinal = cipher.doFinal(decode);
        a.wv.v(doFinal, "decrypted");
        return new java.lang.String(doFinal, a.bu.f53a);
    }

    public final java.lang.String g(a.lt0 lt0Var, java.lang.String str) {
        a.wv.w(str, "url");
        java.net.HttpURLConnection e = e(str, "text/plain");
        java.io.OutputStream outputStream = e.getOutputStream();
        java.lang.String p = lt0Var.p(0);
        a.wv.v(p, "str");
        byte[] bytes = p.getBytes(a.bu.f53a);
        a.wv.v(bytes, "this as java.lang.String).getBytes(charset)");
        outputStream.write(android.util.Base64.encode(bytes, 11));
        outputStream.flush();
        outputStream.close();
        return l(e);
    }

    public final java.lang.String i(java.lang.String str, a.lt0 lt0Var, long j) {
        a.wv.w(str, "url");
        java.util.concurrent.FutureTask futureTask = new java.util.concurrent.FutureTask(new a.or0(this, str, lt0Var, 0));
        a.wv.M0(a.wv.b(a.z80.b), null, new a.pr0(futureTask, null), 3);
        try {
            return (java.lang.String) futureTask.get(j, java.util.concurrent.TimeUnit.SECONDS);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public final java.lang.String k(java.lang.String str, java.lang.String str2) {
        a.wv.w(str, "url");
        byte[] bytes = str2.getBytes(a.bu.f53a);
        a.wv.v(bytes, "this as java.lang.String).getBytes(charset)");
        java.net.HttpURLConnection e = e(str, "text/plain");
        java.io.OutputStream outputStream = e.getOutputStream();
        outputStream.write(bytes);
        outputStream.flush();
        outputStream.close();
        return l(e);
    }

    public final java.lang.String l(java.net.HttpURLConnection httpURLConnection) {
        try {
            java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(a(httpURLConnection).getInputStream()));
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            while (true) {
                java.lang.String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    java.lang.String sb2 = sb.toString();
                    a.wv.v(sb2, "stringBuilder.toString()");
                    httpURLConnection.disconnect();
                    return sb2;
                }
                sb.append(readLine);
                sb.append("\n");
            }
        } catch (java.lang.Throwable th) {
            httpURLConnection.disconnect();
            throw th;
        }
    }
}
