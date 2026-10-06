package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final /* synthetic */ class sg implements android.view.View.OnClickListener {
    public final /* synthetic */ int c;
    public final /* synthetic */ java.lang.Object d;
    public final /* synthetic */ java.lang.Object e;
    public final /* synthetic */ java.lang.Object f;

    public /* synthetic */ sg(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i) {
        this.c = i;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
    }

    private final void a() {
        java.lang.Object obj;
        a.xg xgVar = (a.xg) this.d;
        a.tg tgVar = (a.tg) this.e;
        a.ug ugVar = (a.ug) this.f;
        a.wv.w(xgVar, "this$0");
        a.wv.w(tgVar, "$item");
        a.wv.w(ugVar, "$viewHolder");
        boolean z = xgVar.e;
        if (!z && !tgVar.getSelected()) {
            java.util.Iterator it = xgVar.d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (((a.tg) obj).getSelected()) {
                        break;
                    }
                }
            }
            a.tg tgVar2 = (a.tg) obj;
            if (tgVar2 != null) {
                tgVar2.setSelected(false);
            }
            tgVar.setSelected(true);
            xgVar.notifyDataSetChanged();
        } else if (z) {
            tgVar.setSelected(!tgVar.getSelected());
            android.widget.CompoundButton compoundButton = ugVar.d;
            if (compoundButton != null) {
                compoundButton.setChecked(tgVar.getSelected());
            }
        }
        a.y30 y30Var = xgVar.f;
        if (y30Var != null) {
            y30Var.f703a.setChecked(xgVar.a().size() == y30Var.b.o0.size());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x024b  */
    /* JADX WARN: Type inference failed for: r0v74, types: [java.lang.Object, a.ma1] */
    /* JADX WARN: Type inference failed for: r6v3, types: [a.ng1, java.lang.Object] */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.view.View r24) {
        /*
            Method dump skipped, instructions count: 3076
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.sg.onClick(android.view.View):void");
    }
}
