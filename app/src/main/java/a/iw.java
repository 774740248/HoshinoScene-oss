package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class iw implements java.lang.Runnable {
    public final /* synthetic */ int c;
    public final int d;
    public final java.lang.Object e;
    public final java.lang.Object f;

    public /* synthetic */ iw(a.jw jwVar, int i, java.lang.Object obj, int i2) {
        this.c = i2;
        this.e = jwVar;
        this.d = i;
        this.f = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        a.oe oeVar;
        int i = this.c;
        int i2 = 0;
        java.lang.Object obj = this.e;
        int i3 = this.d;
        java.lang.Object obj2 = this.f;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.jw jwVar = (a.jw) obj;
                java.lang.Object obj3 = ((a.pe) obj2).c;
                java.lang.String str = (java.lang.String) jwVar.b.get(java.lang.Integer.valueOf(i3));
                if (str == null) {
                    return;
                }
                a.ve veVar = (a.ve) jwVar.f.get(str);
                if (veVar == null || (oeVar = veVar.f631a) == null) {
                    jwVar.h.remove(str);
                    jwVar.g.put(str, obj3);
                    return;
                } else {
                    if (jwVar.e.remove(str)) {
                        ((a.sl0) oeVar).b(obj3);
                        return;
                    }
                    return;
                }
            case 1:
                ((a.jw) obj).a(i3, 0, new android.content.Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (android.content.IntentSender.SendIntentException) obj2));
                return;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                java.lang.String[] strArr = (java.lang.String[]) obj2;
                int[] iArr = new int[strArr.length];
                android.app.Activity activity = (android.app.Activity) obj;
                android.content.pm.PackageManager packageManager = activity.getPackageManager();
                java.lang.String packageName = activity.getPackageName();
                int length = strArr.length;
                while (i2 < length) {
                    iArr[i2] = packageManager.checkPermission(strArr[i2], packageName);
                    i2++;
                }
                ((a.k6) activity).onRequestPermissionsResult(i3, strArr, iArr);
                return;
            case 3:
                a.b20 b20Var = (a.b20) ((a.vu0) obj2).d;
                if (b20Var != null) {
                    b20Var.K0(i3);
                    return;
                }
                return;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_READ_ERROR /* 4 */:
                java.util.List list = (java.util.List) obj2;
                int size = list.size();
                if (i3 != 1) {
                    while (i2 < size) {
                        ((a.ra0) list.get(i2)).getClass();
                        i2++;
                    }
                    return;
                } else {
                    while (i2 < size) {
                        ((a.ra0) list.get(i2)).a();
                        i2++;
                    }
                    return;
                }
            case 5:
                a.ct0 ct0Var = (a.ct0) obj;
                androidx.recyclerview.widget.RecyclerView recyclerView = ct0Var.q;
                if (recyclerView == null || !recyclerView.isAttachedToWindow()) {
                    return;
                }
                a.zs0 zs0Var = (a.zs0) obj2;
                if (zs0Var.k) {
                    return;
                }
                a.da1 da1Var = zs0Var.e;
                if (da1Var.c() != -1) {
                    a.j91 itemAnimator = ct0Var.q.getItemAnimator();
                    if (itemAnimator == null || !itemAnimator.f()) {
                        java.util.ArrayList arrayList = ct0Var.p;
                        int size2 = arrayList.size();
                        while (i2 < size2) {
                            if (((a.zs0) arrayList.get(i2)).l) {
                                i2++;
                            }
                        }
                        a.th1 th1Var = (a.th1) ct0Var.m;
                        th1Var.getClass();
                        a.wv.w(da1Var, "viewHolder");
                        th1Var.d.a(da1Var.d());
                        return;
                    }
                    ct0Var.q.post(this);
                    return;
                }
                return;
            default:
                ((com.google.android.material.bottomsheet.BottomSheetBehavior) obj).startSettling((android.view.View) obj2, i3, false);
                return;
        }
    }

    public /* synthetic */ iw(java.lang.Object obj, java.lang.Object obj2, int i, int i2) {
        this.c = i2;
        this.e = obj;
        this.f = obj2;
        this.d = i;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public iw(a.ra0 r3, int r4) {
        /*
            r2 = this;
            r0 = 4
            r2.c = r0
            r0 = 1
            a.ra0[] r0 = new a.ra0[r0]
            if (r3 == 0) goto L14
            r1 = 0
            r0[r1] = r3
            java.util.List r3 = java.util.Arrays.asList(r0)
            r0 = 0
            r2.<init>(r3, r4, r0)
            return
        L14:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r4 = "initCallback cannot be null"
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: a.iw.<init>(a.ra0, int):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public iw(int i, java.util.ArrayList arrayList) {
        this(arrayList, i, null);
        this.c = 4;
    }

    public iw(java.util.List list, int i, java.lang.Throwable th) {
        this.c = 4;
        if (list != null) {
            this.f = new java.util.ArrayList(list);
            this.d = i;
            this.e = th;
            return;
        }
        throw new java.lang.NullPointerException("initCallbacks cannot be null");
    }
}
