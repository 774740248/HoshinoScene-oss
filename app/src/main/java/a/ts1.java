package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ts1 implements java.lang.Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ java.io.InputStream d;
    public final /* synthetic */ java.lang.String e;
    public final /* synthetic */ a.vs1 f;

    public /* synthetic */ ts1(a.vs1 vs1Var, java.io.InputStream inputStream, java.lang.String str, int i) {
        this.c = i;
        this.f = vs1Var;
        this.d = inputStream;
        this.e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        a.vs1 vs1Var = this.f;
        java.io.InputStream inputStream = this.d;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                try {
                    java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(inputStream, java.nio.charset.StandardCharsets.UTF_8));
                    while (true) {
                        java.lang.String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            return;
                        }
                        try {
                            a.lt0 lt0Var = new a.lt0();
                            lt0Var.n("type", 2);
                            lt0Var.m(readLine + "\n", "message");
                            ((android.webkit.WebView) vs1Var.c.d).post(new a.g2(this, 8, lt0Var));
                        } catch (java.lang.Exception unused) {
                        }
                    }
                } catch (java.io.IOException e) {
                    e.printStackTrace();
                    return;
                }
            default:
                try {
                    java.io.BufferedReader bufferedReader2 = new java.io.BufferedReader(new java.io.InputStreamReader(inputStream, java.nio.charset.StandardCharsets.UTF_8));
                    while (true) {
                        java.lang.String readLine2 = bufferedReader2.readLine();
                        if (readLine2 == null) {
                            return;
                        }
                        try {
                            a.lt0 lt0Var2 = new a.lt0();
                            lt0Var2.n("type", 4);
                            lt0Var2.m(readLine2 + "\n", "message");
                            ((android.webkit.WebView) vs1Var.c.d).post(new a.g2(this, 9, lt0Var2));
                        } catch (java.lang.Exception unused2) {
                        }
                    }
                } catch (java.io.IOException e2) {
                    e2.printStackTrace();
                    return;
                }
        }
    }
}
