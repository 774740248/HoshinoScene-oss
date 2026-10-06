package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class vs1 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f642a;
    public final com.omarea.krscript.model.NodeInfoBase b = new com.omarea.krscript.model.NodeInfoBase("");
    public final /* synthetic */ a.nk c;

    public vs1(a.nk nkVar, android.content.Context context) {
        this.c = nkVar;
        this.f642a = context;
    }

    @android.webkit.JavascriptInterface
    public java.lang.String executeShell(java.lang.String str) {
        if (str == null || str.isEmpty()) {
            return "";
        }
        return a.wv.V(this.f642a, str, this.b);
    }

    @android.webkit.JavascriptInterface
    public boolean executeShellAsync(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.lang.Process process;
        java.util.HashMap hashMap = new java.util.HashMap();
        int i = 0;
        android.content.Context context = this.f642a;
        if (str3 != null) {
            try {
                if (!str3.isEmpty()) {
                    a.lt0 lt0Var = new a.lt0(str3);
                    java.util.Iterator i2 = lt0Var.i();
                    while (i2.hasNext()) {
                        java.lang.String str4 = (java.lang.String) i2.next();
                        hashMap.put(str4, lt0Var.h(str4));
                    }
                }
            } catch (java.lang.Exception e) {
                android.widget.Toast.makeText(context, e.getMessage(), 0).show();
                process = null;
            }
        }
        process = a.wv.l0(a.wv.s0(false));
        if (process == null) {
            return false;
        }
        java.io.DataOutputStream dataOutputStream = new java.io.DataOutputStream(process.getOutputStream());
        a.hw hwVar = new a.hw(12, this);
        java.io.InputStream inputStream = process.getInputStream();
        java.io.InputStream errorStream = process.getErrorStream();
        java.lang.Thread thread = new java.lang.Thread(new a.ts1(this, inputStream, str2, i));
        java.lang.Thread thread2 = new java.lang.Thread(new a.ts1(this, errorStream, str2, 1));
        java.lang.Thread thread3 = new java.lang.Thread(new a.us1(this, process, str2, thread, thread2, hwVar));
        thread.start();
        thread2.start();
        thread3.start();
        hashMap.put("PAGE_CONFIG_DIR", "");
        hashMap.put("PAGE_CONFIG_FILE", "");
        hashMap.put("PAGE_WORK_DIR", "");
        hashMap.put("PAGE_WORK_FILE", "");
        java.util.ArrayList u0 = a.wv.u0(hashMap);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (u0.size() > 0) {
            java.util.Iterator it = u0.iterator();
            while (it.hasNext()) {
                java.lang.String str5 = (java.lang.String) it.next();
                sb.append("export ");
                sb.append(str5);
                sb.append("\n");
            }
        }
        try {
            java.lang.String sb2 = sb.toString();
            java.nio.charset.Charset charset = java.nio.charset.StandardCharsets.UTF_8;
            dataOutputStream.write(sb2.getBytes(charset));
            dataOutputStream.write(a.wv.g0(context, str, null).getBytes(charset));
            dataOutputStream.writeBytes("\n\n");
            dataOutputStream.writeBytes("sleep 0.2;\n");
            dataOutputStream.writeBytes("exit\n");
            dataOutputStream.writeBytes("exit\n");
            dataOutputStream.flush();
            return true;
        } catch (java.lang.Exception unused) {
            return true;
        }
    }

    @android.webkit.JavascriptInterface
    public java.lang.String extractAssets(java.lang.String str) {
        return new a.vc0(this.f642a).a(str);
    }

    @android.webkit.JavascriptInterface
    public boolean fileChooser(java.lang.String str) {
        a.i41 obj = (i41) this.c.f;
        if (((a.i41) obj) == null) {
            return false;
        }
        return ((a.w1) ((a.i41) obj)).c(new a.ss1(this, str));
    }

    @android.webkit.JavascriptInterface
    public boolean rootCheck() {
        a.q10 q10Var = a.q10.f457a;
        return a.q10.t().equals("root");
    }
}
