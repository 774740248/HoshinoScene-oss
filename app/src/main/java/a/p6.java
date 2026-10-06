package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final /* synthetic */ class p6 implements android.view.View.OnClickListener {
    public final /* synthetic */ int c;
    public final /* synthetic */ com.omarea.vtools.activities.ActivityCpuControl d;
    public final /* synthetic */ int e;

    public /* synthetic */ p6(com.omarea.vtools.activities.ActivityCpuControl activityCpuControl, int i, int i2) {
        this.c = i2;
        this.d = activityCpuControl;
        this.e = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        int i = this.c;
        int i2 = 1;
        int i3 = 2;
        int i4 = this.e;
        com.omarea.vtools.activities.ActivityCpuControl activityCpuControl = this.d;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.gu0[] gu0VarArr = com.omarea.vtools.activities.ActivityCpuControl.J;
                a.wv.w(activityCpuControl, "this$0");
                a.wv.t(view, "null cannot be cast to non-null type android.widget.CheckBox");
                boolean isChecked = ((android.widget.CheckBox) view).isChecked();
                activityCpuControl.G.getClass();
                a.ls.t(i4, isChecked);
                activityCpuControl.D.coreOnline.set(i4, java.lang.Boolean.valueOf(isChecked));
                return;
            case 1:
                a.gu0[] gu0VarArr2 = com.omarea.vtools.activities.ActivityCpuControl.J;
                a.wv.w(activityCpuControl, "this$0");
                java.lang.String[] v = activityCpuControl.v(i4);
                java.lang.String string = activityCpuControl.getString(2131953177);
                a.wv.v(string, "getString(R.string.perf_choose_cpu_min)");
                java.util.ArrayList x = com.omarea.vtools.activities.ActivityCpuControl.x(v);
                java.lang.String str = activityCpuControl.D.clusters.get(i4).min_freq;
                a.wv.v(str, "status.clusters[cluster].min_freq");
                activityCpuControl.w(string, x, a.op.O1(v, com.omarea.vtools.activities.ActivityCpuControl.u(str, v)), new a.t6(activityCpuControl, i4, view, 0));
                return;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                a.gu0[] gu0VarArr3 = com.omarea.vtools.activities.ActivityCpuControl.J;
                a.wv.w(activityCpuControl, "this$0");
                java.lang.String[] v2 = activityCpuControl.v(i4);
                java.lang.String string2 = activityCpuControl.getString(2131953176);
                a.wv.v(string2, "getString(R.string.perf_choose_cpu_max)");
                java.util.ArrayList x2 = com.omarea.vtools.activities.ActivityCpuControl.x(v2);
                java.lang.String str2 = activityCpuControl.D.clusters.get(i4).max_freq;
                a.wv.v(str2, "status.clusters[cluster].max_freq");
                activityCpuControl.w(string2, x2, a.op.O1(v2, com.omarea.vtools.activities.ActivityCpuControl.u(str2, v2)), new a.t6(activityCpuControl, i4, view, i2));
                return;
            case 3:
                a.gu0[] gu0VarArr4 = com.omarea.vtools.activities.ActivityCpuControl.J;
                a.wv.w(activityCpuControl, "this$0");
                java.lang.String string3 = activityCpuControl.getString(2131953175);
                a.wv.v(string3, "getString(R.string.perf_choose_cpu_governor)");
                activityCpuControl.w(string3, com.omarea.vtools.activities.ActivityCpuControl.C(activityCpuControl.F), a.op.O1(activityCpuControl.F, activityCpuControl.D.clusters.get(i4).governor), new a.t6(activityCpuControl, i4, view, i3));
                return;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_READ_ERROR /* 4 */:
                a.gu0[] gu0VarArr5 = com.omarea.vtools.activities.ActivityCpuControl.J;
                a.wv.w(activityCpuControl, "this$0");
                com.omarea.model.CpuClusterStatus cpuClusterStatus = activityCpuControl.D.clusters.get(i4);
                activityCpuControl.G.getClass();
                cpuClusterStatus.governor_params = a.gy.N(a.ls.n(i4));
                android.content.Intent intent = new android.content.Intent(activityCpuControl, (java.lang.Class<?>) com.omarea.vtools.activities.ActivityPerfOptions.class);
                intent.putExtra("dir", a.ls.n(i4));
                activityCpuControl.startActivity(intent);
                return;
            default:
                a.gu0[] gu0VarArr6 = com.omarea.vtools.activities.ActivityCpuControl.J;
                a.wv.w(activityCpuControl, "this$0");
                activityCpuControl.G.getClass();
                java.lang.String q = a.ls.q(i4);
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                a.wv.v(q, "result");
                if (q.length() > 0) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.util.Iterator it = a.yi1.y2(q, new java.lang.String[]{"\n"}).iterator();
                    long j = 0;
                    while (it.hasNext()) {
                        java.util.List y2 = a.yi1.y2((java.lang.String) it.next(), new java.lang.String[]{" "});
                        if (y2.size() == 2) {
                            j += java.lang.Long.parseLong((java.lang.String) y2.get(1));
                            arrayList.add(new a.u6(y2));
                        }
                    }
                    java.util.Iterator it2 = arrayList.iterator();
                    a.wv.v(it2, "data.iterator()");
                    while (it2.hasNext()) {
                        java.util.Map.Entry entry = (java.util.Map.Entry) it2.next();
                        sb.append(com.omarea.vtools.activities.ActivityCpuControl.D((java.lang.String) entry.getKey()));
                        sb.append("    ");
                        sb.append(((java.lang.Number) entry.getValue()).longValue());
                        sb.append("    ");
                        sb.append(((long) ((((java.lang.Number) entry.getValue()).doubleValue() * 10000.0d) / j)) / 100.0d);
                        sb.append("%\n");
                    }
                }
                int i5 = a.x60.f681a;
                java.lang.String string4 = activityCpuControl.getString(2131953199);
                a.wv.v(string4, "getString(R.string.perf_time_in_state)");
                java.lang.String sb2 = sb.toString();
                a.wv.v(sb2, "msg.toString()");
                a.fs1.F(activityCpuControl, string4, sb2, null);
                return;
        }
    }
}
