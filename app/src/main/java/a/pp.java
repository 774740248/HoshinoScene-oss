package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final /* synthetic */ class pp implements java.lang.Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ a.pm d;

    public /* synthetic */ pp(a.pm pmVar, int i) {
        this.c = i;
        this.d = pmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        a.pm pmVar = this.d;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.wv.w(pmVar, "this$0");
                try {
                    java.lang.Process process = (java.lang.Process) pmVar.e;
                    a.wv.s(process);
                    java.io.InputStream inputStream = process.getInputStream();
                    a.wv.v(inputStream, "process!!.inputStream");
                    java.io.Reader inputStreamReader = new java.io.InputStreamReader(inputStream, a.bu.f53a);
                    java.io.BufferedReader bufferedReader = inputStreamReader instanceof java.io.BufferedReader ? (java.io.BufferedReader) inputStreamReader : new java.io.BufferedReader(inputStreamReader, 8192);
                    while (true) {
                        java.lang.String readLine = bufferedReader.readLine();
                        a.wv.v(readLine, "reader.readLine()");
                        java.lang.String obj = a.yi1.F2(readLine).toString();
                        if (obj.length() > 0) {
                            android.os.Handler obj2 = (android.os.Handler) pmVar.d;
                            ((android.os.Handler) obj2).sendMessage(((android.os.Handler) obj2).obtainMessage(1, obj));
                        }
                    }
                } catch (java.lang.Exception e) {
                    java.lang.System.out.print((java.lang.Object) e.getMessage());
                    return;
                }
            case 1:
                a.wv.w(pmVar, "this$0");
                try {
                    java.lang.Process process2 = (java.lang.Process) pmVar.e;
                    a.wv.s(process2);
                    java.io.InputStream errorStream = process2.getErrorStream();
                    a.wv.v(errorStream, "process!!.errorStream");
                    java.io.Reader inputStreamReader2 = new java.io.InputStreamReader(errorStream, a.bu.f53a);
                    java.io.BufferedReader bufferedReader2 = inputStreamReader2 instanceof java.io.BufferedReader ? (java.io.BufferedReader) inputStreamReader2 : new java.io.BufferedReader(inputStreamReader2, 8192);
                    while (true) {
                        java.lang.String readLine2 = bufferedReader2.readLine();
                        a.wv.v(readLine2, "reader.readLine()");
                        java.lang.String obj3 = a.yi1.F2(readLine2).toString();
                        if (obj3.length() > 0) {
                            android.os.Handler obj4 = (android.os.Handler) pmVar.d;
                            ((android.os.Handler) obj4).sendMessage(((android.os.Handler) obj4).obtainMessage(5, obj3));
                        }
                    }
                } catch (java.lang.Exception e2) {
                    java.lang.System.out.print((java.lang.Object) e2.getMessage());
                    return;
                }
            default:
                a.wv.w(pmVar, "this$0");
                java.lang.Process process3 = (java.lang.Process) pmVar.e;
                a.wv.s(process3);
                if (process3.waitFor() == 0) {
                    android.os.Handler handler = (android.os.Handler) pmVar.d;
                    handler.sendMessage(handler.obtainMessage(10, java.lang.Boolean.TRUE));
                } else {
                    android.os.Handler handler2 = (android.os.Handler) pmVar.d;
                    handler2.sendMessage(handler2.obtainMessage(10, java.lang.Boolean.FALSE));
                }
                try {
                    java.lang.Process obj5 = (Process) pmVar.e;
                    if (((java.lang.Process) obj5) != null) {
                        java.lang.Process process4 = (java.lang.Process) obj5;
                        a.wv.s(process4);
                        process4.getOutputStream().close();
                        java.lang.Process process5 = (java.lang.Process) pmVar.e;
                        a.wv.s(process5);
                        process5.destroy();
                        return;
                    }
                    return;
                } catch (java.lang.Exception unused) {
                    return;
                }
        }
    }
}
