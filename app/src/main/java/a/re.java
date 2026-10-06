package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class re extends a.qe {
    @Override // a.qe
    public final android.content.Intent a(androidx.activity.ComponentActivity componentActivity, java.lang.Object obj) {
        java.lang.String[] strArr = (java.lang.String[]) obj;
        a.wv.w(componentActivity, "context");
        a.wv.w(strArr, "input");
        android.content.Intent putExtra = new android.content.Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
        a.wv.v(putExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
        return putExtra;
    }

    @Override // a.qe
    public final a.pe b(androidx.activity.ComponentActivity componentActivity, java.lang.Object obj) {
        java.lang.String[] strArr = (java.lang.String[]) obj;
        a.wv.w(componentActivity, "context");
        a.wv.w(strArr, "input");
        if (strArr.length == 0) {
            return new a.pe(a.rb0.c);
        }
        for (java.lang.String str : strArr) {
            if (a.zx.a(componentActivity, str) != 0) {
                return null;
            }
        }
        int B0 = a.b20.B0(strArr.length);
        if (B0 < 16) {
            B0 = 16;
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(B0);
        for (java.lang.String str2 : strArr) {
            linkedHashMap.put(str2, java.lang.Boolean.TRUE);
        }
        return new a.pe(linkedHashMap);
    }

    @Override // a.qe
    public final java.lang.Object c(android.content.Intent intent, int i) {
        a.rb0 rb0Var = a.rb0.c;
        if (i != -1 || intent == null) {
            return rb0Var;
        }
        java.lang.String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        if (intArrayExtra == null || stringArrayExtra == null) {
            return rb0Var;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(intArrayExtra.length);
        for (int i2 : intArrayExtra) {
            arrayList.add(java.lang.Boolean.valueOf(i2 == 0));
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.String str : stringArrayExtra) {
            if (str != null) {
                arrayList2.add(str);
            }
        }
        java.util.Iterator it = arrayList2.iterator();
        java.util.Iterator it2 = arrayList.iterator();
        java.util.ArrayList arrayList3 = new java.util.ArrayList(java.lang.Math.min(a.op.J1(arrayList2, 10), a.op.J1(arrayList, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList3.add(new a.y31(it.next(), it2.next()));
        }
        return a.op.X1(arrayList3);
    }
}
