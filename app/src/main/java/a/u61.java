package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class u61 implements java.util.Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f579a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ u61(int i, java.lang.Object obj) {
        this.f579a = i;
        this.b = obj;
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        int i;
        int i2;
        int cpu;
        int cpu2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = this.f579a;
        java.lang.Object obj3 = this.b;
        switch (i7) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                return ((a.bi1) obj).b - ((a.bi1) obj2).b;
            case 1:
                com.google.android.material.button.MaterialButton materialButton = (com.google.android.material.button.MaterialButton) obj;
                com.google.android.material.button.MaterialButton materialButton2 = (com.google.android.material.button.MaterialButton) obj2;
                int compareTo = java.lang.Boolean.valueOf(materialButton.isChecked()).compareTo(java.lang.Boolean.valueOf(materialButton2.isChecked()));
                if (compareTo != 0) {
                    return compareTo;
                }
                int compareTo2 = java.lang.Boolean.valueOf(materialButton.isPressed()).compareTo(java.lang.Boolean.valueOf(materialButton2.isPressed()));
                if (compareTo2 != 0) {
                    return compareTo2;
                }
                com.google.android.material.button.MaterialButtonToggleGroup materialButtonToggleGroup = (com.google.android.material.button.MaterialButtonToggleGroup) obj3;
                return java.lang.Integer.valueOf(materialButtonToggleGroup.indexOfChild(materialButton)).compareTo(java.lang.Integer.valueOf(materialButtonToggleGroup.indexOfChild(materialButton2)));
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                android.content.pm.ActivityInfo activityInfo = (android.content.pm.ActivityInfo) obj;
                a.pg pgVar = (a.pg) obj3;
                android.content.pm.ActivityInfo activityInfo2 = (android.content.pm.ActivityInfo) obj2;
                return a.wv.D(java.lang.Integer.valueOf(a.wv.e(pgVar.f, activityInfo.name) ? -1 : (activityInfo.exported && activityInfo.enabled) ? 0 : 1), java.lang.Integer.valueOf(a.wv.e(pgVar.f, activityInfo2.name) ? -1 : (activityInfo2.exported && activityInfo2.enabled) ? 0 : 1));
            case 3:
                android.content.pm.ComponentInfo componentInfo = (android.content.pm.ComponentInfo) obj;
                a.ki kiVar = (a.ki) obj3;
                android.content.pm.ComponentInfo componentInfo2 = (android.content.pm.ComponentInfo) obj2;
                return a.wv.D(java.lang.Integer.valueOf(a.wv.e(kiVar.g, componentInfo.name) ? -1 : (componentInfo.exported && componentInfo.enabled) ? 0 : 1), java.lang.Integer.valueOf(a.wv.e(kiVar.g, componentInfo2.name) ? -1 : (componentInfo2.exported && componentInfo2.enabled) ? 0 : 1));
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_READ_ERROR /* 4 */:
                java.util.HashMap hashMap = (java.util.HashMap) obj3;
                java.lang.Long l = (java.lang.Long) hashMap.get((java.lang.String) obj2);
                if (l == null) {
                    l = a.q71.f;
                }
                java.lang.Long l2 = (java.lang.Long) hashMap.get((java.lang.String) obj);
                return a.wv.D(l, l2 != null ? l2 : 0L);
            case 5:
                com.omarea.model.ProcessInfo processInfo = (com.omarea.model.ProcessInfo) obj;
                a.nj njVar = (a.nj) obj3;
                int i8 = njVar.i;
                if (i8 != 1) {
                    if (i8 == 4) {
                        cpu2 = (int) (processInfo.getCpu() * 10);
                    } else if (i8 == 8) {
                        cpu2 = (int) (processInfo.res * 100);
                    } else if (i8 == 16) {
                        cpu2 = processInfo.pid;
                    } else if (i8 != 20) {
                        i = processInfo.pid;
                    } else {
                        java.util.HashMap hashMap2 = a.q71.f;
                        i = a.gy.U(processInfo.user);
                    }
                    i = -cpu2;
                } else {
                    i = processInfo.pid;
                }
                java.lang.Integer valueOf = java.lang.Integer.valueOf(i);
                com.omarea.model.ProcessInfo processInfo2 = (com.omarea.model.ProcessInfo) obj2;
                int i9 = njVar.i;
                if (i9 != 1) {
                    if (i9 == 4) {
                        cpu = (int) (processInfo2.getCpu() * 10);
                    } else if (i9 == 8) {
                        cpu = (int) (processInfo2.res * 100);
                    } else if (i9 == 16) {
                        cpu = processInfo2.pid;
                    } else if (i9 != 20) {
                        i2 = processInfo2.pid;
                    } else {
                        java.util.HashMap hashMap3 = a.q71.f;
                        i2 = a.gy.U(processInfo2.user);
                    }
                    i2 = -cpu;
                } else {
                    i2 = processInfo2.pid;
                }
                return a.wv.D(valueOf, java.lang.Integer.valueOf(i2));
            default:
                com.omarea.model.ProcessInfo processInfo3 = (com.omarea.model.ProcessInfo) obj;
                a.rj rjVar = (a.rj) obj3;
                int i10 = rjVar.f;
                if (i10 != 1) {
                    if (i10 == 4) {
                        i6 = (int) (processInfo3.cpu * 10);
                    } else if (i10 == 8) {
                        i6 = (int) (processInfo3.rss * 100);
                    } else if (i10 != 16) {
                        i3 = processInfo3.pid;
                    } else {
                        i6 = processInfo3.pid;
                    }
                    i3 = -i6;
                } else {
                    i3 = processInfo3.pid;
                }
                java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i3);
                com.omarea.model.ProcessInfo processInfo4 = (com.omarea.model.ProcessInfo) obj2;
                int i11 = rjVar.f;
                if (i11 != 1) {
                    if (i11 == 4) {
                        i5 = (int) (processInfo4.cpu * 10);
                    } else if (i11 == 8) {
                        i5 = (int) (processInfo4.rss * 100);
                    } else if (i11 != 16) {
                        i4 = processInfo4.pid;
                    } else {
                        i5 = processInfo4.pid;
                    }
                    i4 = -i5;
                } else {
                    i4 = processInfo4.pid;
                }
                return a.wv.D(valueOf2, java.lang.Integer.valueOf(i4));
        }
    }
}
