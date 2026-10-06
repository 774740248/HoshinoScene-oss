package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class fw0 extends a.dw0 {
    public final android.content.Context i;
    public final com.omarea.krscript.model.SwitchNode j;
    public final android.widget.Switch k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fw0(android.content.Context context, com.omarea.krscript.model.SwitchNode switchNode) {
        super(context, 2131558608, switchNode);
        a.wv.w(context, "context");
        this.i = context;
        this.j = switchNode;
        this.k = (android.widget.Switch) this.c.findViewById(2131362720);
        boolean checked = switchNode.getChecked();
        android.widget.Switch r3 = this.k;
        if (r3 == null) {
            return;
        }
        r3.setChecked(checked);
    }

    @Override // a.lw0
    public final void d() {
        boolean z;
        super.d();
        com.omarea.krscript.model.SwitchNode switchNode = this.j;
        if (switchNode.getGetState().length() > 0) {
            java.lang.String V = a.wv.V(this.i, switchNode.getGetState(), switchNode);
            if (!a.wv.e(V, "1")) {
                a.wv.v(V, "shellResult");
                java.lang.String lowerCase = V.toLowerCase(java.util.Locale.ROOT);
                a.wv.v(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                if (!a.wv.e(lowerCase, "true")) {
                    z = false;
                    switchNode.setChecked(z);
                }
            }
            z = true;
            switchNode.setChecked(z);
        }
        boolean checked = switchNode.getChecked();
        android.widget.Switch r1 = this.k;
        if (r1 == null) {
            return;
        }
        r1.setChecked(checked);
    }
}
