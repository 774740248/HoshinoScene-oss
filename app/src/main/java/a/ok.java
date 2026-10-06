package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ok implements android.widget.AdapterView.OnItemClickListener {
    public final /* synthetic */ int c;
    public final /* synthetic */ java.lang.Object d;
    public final /* synthetic */ java.lang.Object e;

    public /* synthetic */ ok(java.lang.Object obj, int i, java.lang.Object obj2) {
        this.c = i;
        this.e = obj;
        this.d = obj2;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i, long j) {
        int i2 = this.c;
        java.lang.Object obj = this.e;
        switch (i2) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.pk pkVar = (a.pk) obj;
                android.content.DialogInterface.OnClickListener onClickListener = pkVar.h;
                a.sk skVar = (a.sk) this.d;
                onClickListener.onClick(skVar.b, i);
                if (pkVar.i) {
                    return;
                }
                skVar.b.dismiss();
                return;
            default:
                a.hn hnVar = (a.hn) obj;
                hnVar.I.setSelection(i);
                a.kn knVar = hnVar.I;
                if (knVar.getOnItemClickListener() != null) {
                    knVar.performItemClick(view, i, hnVar.F.getItemId(i));
                }
                hnVar.dismiss();
                return;
        }
    }
}
