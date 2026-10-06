package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class kh1 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f292a = false;
    public final java.lang.String b = "pio_" + java.lang.System.currentTimeMillis();

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, a.jh1] */
    public final void a(android.content.Context context, com.omarea.krscript.model.RunnableNode runnableNode, java.lang.String str, java.lang.Runnable runnable, java.util.HashMap hashMap, com.omarea.krscript.model.ShellHandlerBase shellHandlerBase) {
        boolean z;
        if (this.f292a) {
            return;
        }
        boolean z2 = runnableNode.getInterruptable() || runnableNode.getShell().equals(com.omarea.krscript.model.RunnableNode.Companion.getShellModeBgTask());
        a.jh1 obj = new a.jh1();
        obj.d = -1;
        obj.f254a = shellHandlerBase;
        obj.b = runnable;
        obj.c = z2;
        java.lang.String str2 = this.b;
        if (hashMap == null) {
            hashMap = new java.util.HashMap();
        }
        java.lang.String pageConfigDir = runnableNode.getPageConfigDir();
        java.lang.String currentPageConfigPath = runnableNode.getCurrentPageConfigPath();
        hashMap.put("PAGE_CONFIG_DIR", pageConfigDir);
        hashMap.put("PAGE_CONFIG_FILE", currentPageConfigPath);
        if (currentPageConfigPath.startsWith("file:///android_asset/")) {
            hashMap.put("PAGE_WORK_DIR", new a.vc0(context).d(pageConfigDir));
            hashMap.put("PAGE_WORK_FILE", new a.vc0(context).d(currentPageConfigPath));
        } else {
            hashMap.put("PAGE_WORK_DIR", pageConfigDir);
            hashMap.put("PAGE_WORK_FILE", currentPageConfigPath);
        }
        java.util.ArrayList u0 = a.wv.u0(hashMap);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (u0.size() > 0) {
            java.util.Iterator it = u0.iterator();
            while (it.hasNext()) {
                java.lang.String str3 = (java.lang.String) it.next();
                sb.append("export ");
                sb.append(str3);
                sb.append("\n");
            }
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append((java.lang.CharSequence) sb);
        sb2.append(a.wv.g0(context, str, str2));
        sb2.append("\nexit\nexit\n");
        boolean[] zArr = new boolean[1];
        new java.lang.Thread(new a.ts(zArr, sb2, obj, 5, 0)).start();
        synchronized (obj) {
            try {
                obj.wait();
            } catch (java.lang.Exception unused) {
            }
            z = zArr[0];
        }
        this.f292a = z;
    }
}
