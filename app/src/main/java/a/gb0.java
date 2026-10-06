package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class gb0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f175a;
    public final java.lang.Object b;
    public final java.lang.Object c;
    public final java.lang.Object d;
    public final java.lang.Object e;

    public gb0(boolean z) {
        this.f175a = z;
        new a.ls();
        this.b = a.ls.d();
        this.c = new a.ls();
        this.d = new a.vj1(new a.js(this, 1));
        this.e = new a.vj1(new a.js(this, 0));
    }

    public static a.jt0 a(java.lang.Object... objArr) {
        a.jt0 jt0Var = new a.jt0();
        for (java.lang.Object obj : objArr) {
            jt0Var.e(obj.toString());
        }
        return jt0Var;
    }

    public static boolean c(android.text.Editable editable, android.view.KeyEvent keyEvent, boolean z) {
        a.jo1[] jo1VarArr;
        if (!android.view.KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            return false;
        }
        int selectionStart = android.text.Selection.getSelectionStart(editable);
        int selectionEnd = android.text.Selection.getSelectionEnd(editable);
        if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (jo1VarArr = (a.jo1[]) editable.getSpans(selectionStart, selectionEnd, a.jo1.class)) != null && jo1VarArr.length > 0) {
            for (a.jo1 jo1Var : jo1VarArr) {
                int spanStart = editable.getSpanStart(jo1Var);
                int spanEnd = editable.getSpanEnd(jo1Var);
                if ((z && spanStart == selectionStart) || ((!z && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    public static a.jt0 d() {
        a.jt0 jt0Var = new a.jt0();
        a.lt0 lt0Var = new a.lt0();
        lt0Var.m("All", "friendly");
        a.jt0 jt0Var2 = new a.jt0();
        jt0Var2.e("*");
        lt0Var.m(jt0Var2, "packages");
        jt0Var.e(lt0Var);
        return jt0Var;
    }

    public static a.jt0 f(java.lang.String str) {
        a.jt0 jt0Var = new a.jt0();
        a.jt0 jt0Var2 = new a.jt0();
        jt0Var2.e("@shell");
        jt0Var2.e("sh /data/powercfg.sh '" + str + "' > /dev/null 2>&1");
        jt0Var.e(jt0Var2);
        return jt0Var;
    }

    public final a.jt0 b(com.omarea.model.CpuStatus cpuStatus) {
        a.jt0 jt0Var = new a.jt0();
        if (cpuStatus != null) {
            if (((java.lang.Boolean) ((a.vj1) ((a.yu0) this.d)).a()).booleanValue()) {
                jt0Var.e(a("@mtk_reset"));
            }
            if (((java.lang.Boolean) ((a.vj1) ((a.yu0) this.e)).a()).booleanValue()) {
                jt0Var.e(a("@msm_reset"));
            }
            java.lang.String str = cpuStatus.cpusetBg;
            a.wv.v(str, "cpuStatus.cpusetBg");
            java.lang.String str2 = cpuStatus.cpusetSysBg;
            a.wv.v(str2, "cpuStatus.cpusetSysBg");
            java.lang.String str3 = cpuStatus.cpusetFg;
            a.wv.v(str3, "cpuStatus.cpusetFg");
            java.lang.String str4 = cpuStatus.cpusetTop;
            a.wv.v(str4, "cpuStatus.cpusetTop");
            jt0Var.e(a("@cpuset", str, str2, str3, str4));
            java.lang.String str5 = cpuStatus.gpuMinFreq;
            a.wv.v(str5, "cpuStatus.gpuMinFreq");
            java.lang.String str6 = cpuStatus.gpuMaxFreq;
            a.wv.v(str6, "cpuStatus.gpuMaxFreq");
            jt0Var.e(a("@gpu_freq", str5, str6));
            a.jt0 jt0Var2 = new a.jt0();
            jt0Var2.e("@cpu_online");
            java.util.Iterator<java.lang.Boolean> it = cpuStatus.coreOnline.iterator();
            while (it.hasNext()) {
                java.lang.Boolean next = it.next();
                a.wv.v(next, "online");
                if (next.booleanValue()) {
                    jt0Var2.e("1");
                } else {
                    jt0Var2.e("0");
                }
            }
            jt0Var.e(jt0Var2);
            java.util.ArrayList<com.omarea.model.CpuClusterStatus> arrayList = cpuStatus.clusters;
            a.wv.v(arrayList, "cpuStatus.clusters");
            int i = 0;
            for (java.lang.Object obj : arrayList) {
                int i2 = i + 1;
                if (i < 0) {
                    a.b20.p1();
                    throw null;
                }
                com.omarea.model.CpuClusterStatus cpuClusterStatus = (com.omarea.model.CpuClusterStatus) obj;
                java.lang.Object obj2 = ((java.util.ArrayList) this.b).get(i);
                a.wv.v(obj2, "clusters[index]");
                java.lang.String str7 = "cpu" + a.op.N1((java.lang.Object[]) obj2);
                java.lang.String str8 = cpuClusterStatus.governor;
                a.wv.v(str8, "governor");
                jt0Var.e(a("/sys/devices/system/cpu/" + str7 + "/cpufreq/scaling_governor", str8));
                java.lang.String str9 = cpuClusterStatus.min_freq;
                a.wv.v(str9, "cluster.min_freq");
                java.lang.String str10 = cpuClusterStatus.max_freq;
                a.wv.v(str10, "cluster.max_freq");
                jt0Var.e(a("@cpu_freq", str7, str9, str10));
                java.util.HashMap<java.lang.String, java.lang.String> hashMap = cpuClusterStatus.governor_params;
                a.wv.v(hashMap, "cluster.governor_params");
                for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : hashMap.entrySet()) {
                    java.lang.String key = entry.getKey();
                    a.wv.v(key, "param.key");
                    java.lang.String value = entry.getValue();
                    a.wv.v(value, "param.value");
                    jt0Var.e(a(key, value));
                }
                i = i2;
            }
        }
        return jt0Var;
    }

    public final boolean e(java.lang.CharSequence charSequence, int i, int i2, a.eb0 eb0Var) {
        if (eb0Var.c == 0) {
            a.qa0 qa0Var = (a.qa0) this.d;
            a.t01 c = eb0Var.c();
            int a2 = c.a(8);
            if (a2 != 0) {
                c.b.getShort(a2 + c.f295a);
            }
            a.j20 j20Var = (a.j20) qa0Var;
            j20Var.getClass();
            java.lang.ThreadLocal threadLocal = a.j20.b;
            if (threadLocal.get() == null) {
                threadLocal.set(new java.lang.StringBuilder());
            }
            java.lang.StringBuilder sb = (java.lang.StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i < i2) {
                sb.append(charSequence.charAt(i));
                i++;
            }
            android.text.TextPaint textPaint = j20Var.f243a;
            java.lang.String sb2 = sb.toString();
            int i3 = a.x31.f679a;
            eb0Var.c = a.w31.a(textPaint, sb2) ? 2 : 1;
        }
        return eb0Var.c == 2;
    }

    public final void g(java.lang.String str) {
        if (!this.f175a) {
            ((android.view.WindowManager) this.e).addView((android.view.View) this.b, (android.view.WindowManager.LayoutParams) this.d);
            this.f175a = true;
        }
        ((android.widget.TextView) this.c).post(new a.xa(this, 22, str));
    }

    public gb0(android.content.Context context) {
        a.wv.w(context, "mContext");
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(2131558572, (android.view.ViewGroup) null);
        a.wv.v(inflate, "from(mContext).inflate(R.layout.fw_logview, null)");
        this.b = inflate;
        android.view.View findViewById = inflate.findViewById(2131362564);
        a.wv.v(findViewById, "view.findViewById(R.id.fw_logs)");
        this.c = (android.widget.TextView) findViewById;
        android.view.WindowManager.LayoutParams layoutParams = new android.view.WindowManager.LayoutParams();
        layoutParams.height = -1;
        layoutParams.width = -1;
        layoutParams.screenOrientation = -1;
        layoutParams.type = 2003;
        if (context instanceof android.accessibilityservice.AccessibilityService) {
            layoutParams.type = 2032;
        } else {
            layoutParams.type = 2038;
        }
        layoutParams.format = -3;
        layoutParams.x = 0;
        layoutParams.y = 0;
        layoutParams.flags = 56;
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            layoutParams.layoutInDisplayCutoutMode = 1;
        }
        this.d = layoutParams;
        java.lang.Object systemService = context.getSystemService("window");
        a.wv.t(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        this.e = (android.view.WindowManager) systemService;
    }

    public gb0(a.ej1 ej1Var, a.fa0 fa0Var, a.j20 j20Var) {
        this.b = fa0Var;
        this.c = ej1Var;
        this.d = j20Var;
        this.f175a = false;
        this.e = null;
    }
}
