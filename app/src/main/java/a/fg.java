package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class fg extends java.util.TimerTask {
    public final /* synthetic */ int c;
    public final /* synthetic */ com.omarea.vtools.activities.ActivitySwap d;
    public final /* synthetic */ int e;
    public final /* synthetic */ long f;

    public /* synthetic */ fg(com.omarea.vtools.activities.ActivitySwap activitySwap, int i, long j, int i2) {
        this.c = i2;
        this.d = activitySwap;
        this.e = i;
        this.f = j;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        int i = this.c;
        final int i2 = 1;
        long j = this.f;
        int i3 = this.e;
        final com.omarea.vtools.activities.ActivitySwap activitySwap = this.d;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                activitySwap.P.getClass();
                int f = a.pj1.f();
                float currentTimeMillis = ((i3 - f) / ((float) (java.lang.System.currentTimeMillis() - j))) * 1000;
                final java.lang.StringBuilder sb = new java.lang.StringBuilder();
                java.lang.String string = activitySwap.getString(2131953564);
                java.lang.String l = a.ai1.l(new java.lang.Object[]{java.lang.Float.valueOf(currentTimeMillis)}, 1, " " + f + "/" + i3 + "MB (%.1fMB/s)\n", "format(format, *args)");
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                sb2.append(string);
                sb2.append(l);
                sb.append(sb2.toString());
                if (currentTimeMillis > 0.0f) {
                    sb.append(activitySwap.getString(2131953563) + " " + ((int) (f / currentTimeMillis)) + "秒");
                } else {
                    sb.append(activitySwap.getString(2131953565));
                }
                a.cp cpVar = com.omarea.Scene.c;
                final int i4 = 0;
                a.fs1.L(new a.eg());
                return;
            default:
                activitySwap.P.getClass();
                int i5 = a.pj1.i();
                float currentTimeMillis2 = ((i3 - i5) / ((float) (java.lang.System.currentTimeMillis() - j))) * 1000;
                final java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                java.lang.String format = java.lang.String.format(activitySwap.getString(2131953566) + " " + i5 + "/" + i3 + "MB (%.1fMB/s)\n", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Float.valueOf(currentTimeMillis2)}, 1));
                a.wv.v(format, "format(format, *args)");
                sb3.append(format);
                if (currentTimeMillis2 > 0.0f) {
                    sb3.append(activitySwap.getString(2131953563) + " " + ((int) (i5 / currentTimeMillis2)) + "秒");
                } else {
                    sb3.append(activitySwap.getString(2131953565));
                }
                a.cp cpVar2 = com.omarea.Scene.c;
                a.fs1.L(new a.eg());
                return;
        }
    }
}
