package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class be0 implements a.c70 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;

    public /* synthetic */ be0(java.lang.Object obj, int i, java.lang.Object obj2) {
        this.f40a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // a.c70
    public final void a(java.util.ArrayList arrayList, boolean[] zArr) {
        int i = this.f40a;
        java.lang.Object obj = this.b;
        java.lang.Object obj2 = this.c;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.wv.w(arrayList, "selected");
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    java.lang.String str = ((a.ng1) it.next()).c;
                    if (str != null) {
                        arrayList2.add(str);
                    }
                }
                java.lang.String[] strArr = (java.lang.String[]) arrayList2.toArray(new java.lang.String[0]);
                if (strArr.length == 0) {
                    a.cp cpVar = com.omarea.Scene.c;
                    java.lang.String string = ((a.w21) obj).f649a.getString(2131952279);
                    a.wv.v(string, "context.getString(R.string.file_open_select_split)");
                    a.fs1.X(string, 0);
                    return;
                }
                int i2 = a.x60.f681a;
                a.w21 w21Var = (a.w21) obj;
                a.wv.M0(a.wv.b(a.z80.b), null, new a.ae0(w21Var, (java.lang.String) obj2, strArr, a.fs1.J(w21Var.f649a, null), null), 3);
                return;
            case 1:
                a.wv.w(arrayList, "selected");
                a.wv.V = ((a.ng1) a.qv.e2(arrayList)).c;
                a.wv.M0(a.wv.b(a.z80.b), null, new a.ku((a.lu) obj2, null), 3);
                return;
            default:
                a.wv.w(arrayList, "selected");
                if (!arrayList.isEmpty()) {
                    java.lang.String str2 = ((a.ng1) a.qv.e2(arrayList)).c;
                    a.wv.s(str2);
                    java.lang.CharSequence charSequence = (java.lang.CharSequence) ((java.util.ArrayList) obj).get(java.lang.Integer.parseInt(str2));
                    com.omarea.vtools.activities.ActivityMiuiThermal activityMiuiThermal = (com.omarea.vtools.activities.ActivityMiuiThermal) obj2;
                    android.content.Intent intent = new android.content.Intent(activityMiuiThermal, (java.lang.Class<?>) com.omarea.vtools.activities.ActivityFileSelector.class);
                    intent.putExtra("extension", "conf");
                    intent.putExtra("start", charSequence);
                    activityMiuiThermal.startActivityForResult(intent, activityMiuiThermal.f);
                    return;
                }
                return;
        }
    }
}
