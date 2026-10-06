package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class lw0 {

    public lw0() {
        this(null, 0, null);
    }

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f333a;
    public final com.omarea.krscript.model.NodeInfoBase b;
    public final android.view.View c;
    public final android.widget.TextView d;
    public final android.widget.TextView e;
    public final android.widget.TextView f;

    public lw0(android.content.Context context, int i, com.omarea.krscript.model.NodeInfoBase nodeInfoBase) {
        a.wv.w(context, "context");
        this.f333a = context;
        this.b = nodeInfoBase;
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(i, (android.view.ViewGroup) null);
        this.c = inflate;
        this.d = (android.widget.TextView) inflate.findViewById(2131362678);
        this.e = (android.widget.TextView) inflate.findViewById(2131362719);
        this.f = (android.widget.TextView) inflate.findViewById(2131362725);
        c(nodeInfoBase.getTitle());
        a(nodeInfoBase.getDesc());
        b(nodeInfoBase.getSummary());
    }

    public final void a(java.lang.String str) {
        a.wv.w(str, "value");
        int length = str.length();
        android.widget.TextView textView = this.d;
        if (length == 0) {
            if (textView == null) {
                return;
            }
            textView.setVisibility(8);
        } else {
            if (textView != null) {
                textView.setText(str);
            }
            if (textView == null) {
                return;
            }
            textView.setVisibility(0);
        }
    }

    public final void b(java.lang.String str) {
        a.wv.w(str, "value");
        int length = str.length();
        android.widget.TextView textView = this.e;
        if (length == 0) {
            if (textView == null) {
                return;
            }
            textView.setVisibility(8);
        } else {
            if (textView != null) {
                textView.setText(str);
            }
            if (textView == null) {
                return;
            }
            textView.setVisibility(0);
        }
    }

    public final void c(java.lang.String str) {
        a.wv.w(str, "value");
        int length = str.length();
        android.widget.TextView textView = this.f;
        if (length == 0) {
            if (textView == null) {
                return;
            }
            textView.setVisibility(8);
        } else {
            if (textView != null) {
                textView.setText(str);
            }
            if (textView == null) {
                return;
            }
            textView.setVisibility(0);
        }
    }

    public void d() {
        com.omarea.krscript.model.NodeInfoBase nodeInfoBase = this.b;
        int length = nodeInfoBase.getDescSh().length();
        android.content.Context context = this.f333a;
        if (length > 0) {
            java.lang.String V = a.wv.V(context, nodeInfoBase.getDescSh(), nodeInfoBase);
            a.wv.v(V, "executeResultRoot(context, config.descSh, config)");
            nodeInfoBase.setDesc(V);
            a(nodeInfoBase.getDesc());
        }
        if (nodeInfoBase.getSummarySh().length() > 0) {
            java.lang.String V2 = a.wv.V(context, nodeInfoBase.getSummarySh(), nodeInfoBase);
            a.wv.v(V2, "executeResultRoot(contex…config.summarySh, config)");
            nodeInfoBase.setSummary(V2);
            b(nodeInfoBase.getSummary());
        }
    }
}
