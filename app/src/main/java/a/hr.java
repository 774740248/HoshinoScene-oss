package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class hr extends java.util.TimerTask {
    public final /* synthetic */ int c;
    public final /* synthetic */ java.lang.Object d;

    public /* synthetic */ hr(int i, java.lang.Object obj) {
        this.c = i;
        this.d = obj;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        switch (this.c) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                com.omarea.data.customer.BatteryReceiver.access$governorRun((com.omarea.data.customer.BatteryReceiver) this.d);
                return;
            case 1:
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                com.omarea.vtools.AccessibilitySceneMode accessibilitySceneMode = (com.omarea.vtools.AccessibilitySceneMode) this.d;
                if (currentTimeMillis - accessibilitySceneMode.y <= accessibilitySceneMode.z) {
                    accessibilitySceneMode.b(null);
                    return;
                } else {
                    accessibilitySceneMode.f();
                    return;
                }
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                com.omarea.vtools.activities.ActivityChargeStat activityChargeStat = (com.omarea.vtools.activities.ActivityChargeStat) this.d;
                a.gu0[] gu0VarArr = com.omarea.vtools.activities.ActivityChargeStat.v;
                activityChargeStat.o();
                return;
            case 3:
                com.omarea.vtools.activities.ActivityCpuControl activityCpuControl = (com.omarea.vtools.activities.ActivityCpuControl) this.d;
                if (activityCpuControl.B) {
                    a.wv.M0(a.wv.b(a.z80.b), null, new a.b7(activityCpuControl, null), 3);
                    return;
                }
                return;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_READ_ERROR /* 4 */:
                com.omarea.vtools.activities.ActivityProcess activityProcess = (com.omarea.vtools.activities.ActivityProcess) this.d;
                a.pm pmVar = activityProcess.s;
                pmVar.getClass();
                a.l71 l71Var = a.l71.e;
                a.lt0 lt0Var = new a.lt0();
                l71Var.i(lt0Var);
                java.lang.String lt0Var2 = lt0Var.toString();
                a.wv.v(lt0Var2, "json{\n                \"m…\n            }.toString()");
                a.q10 q10Var = a.q10.f457a;
                java.util.List y2 = a.yi1.y2(a.q10.L("top", lt0Var2, 1000L), new java.lang.String[]{"\n"});
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.Iterator it = y2.iterator();
                while (it.hasNext()) {
                    com.omarea.model.ProcessInfo E = pmVar.E((java.lang.String) it.next());
                    if (E != null) {
                        arrayList.add(E);
                    }
                }
                activityProcess.r = arrayList;
                activityProcess.w().post(new a.xa(activityProcess, 7, arrayList));
                return;
            case 5:
                ((com.omarea.vtools.activities.ActivitySwap) this.d).U.b();
                return;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_WRITE /* 6 */:
                a.wv.M0(a.wv.b(a.z80.b), null, new a.bl0((a.pl0) this.d, null), 3);
                return;
            case 7:
                a.wv.M0(a.wv.b(a.z80.b), null, new a.vf0((a.ag0) this.d, null), 3);
                return;
            case 8:
                a.wv.M0(a.wv.b(a.z80.b), null, new a.dg0((a.fg0) this.d, null), 3);
                return;
            case 9:
                a.ph0 ph0Var = (a.ph0) this.d;
                a.fa0 fa0Var = a.ph0.i;
                ph0Var.getClass();
                long currentTimeMillis2 = java.lang.System.currentTimeMillis();
                if (currentTimeMillis2 - a.ph0.m < 3000 || currentTimeMillis2 - a.ph0.l < 3000) {
                    return;
                }
                ph0Var.b.post(new a.xa(ph0Var, 26, ph0Var.c.g()));
                return;
            default:
                a.wv.M0(a.wv.b(a.z80.b), null, new a.rh0((a.uh0) this.d, null), 3);
                return;
        }
    }
}
