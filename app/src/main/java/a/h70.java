package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final /* synthetic */ class h70 implements java.lang.Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ a.j70 d;
    public final /* synthetic */ android.text.SpannableString e;

    public /* synthetic */ h70(a.j70 j70Var, android.text.SpannableString spannableString, int i) {
        this.c = i;
        this.d = j70Var;
        this.e = spannableString;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        android.text.SpannableString spannableString = this.e;
        a.j70 j70Var = this.d;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.wv.w(j70Var, "this$0");
                android.widget.TextView textView = j70Var.b;
                textView.append(spannableString);
                android.view.ViewParent parent = textView.getParent();
                a.wv.t(parent, "null cannot be cast to non-null type android.widget.ScrollView");
                ((android.widget.ScrollView) parent).fullScroll(130);
                return;
            default:
                a.wv.w(j70Var, "this$0");
                a.wv.w(spannableString, "$spannableString");
                android.widget.TextView textView2 = j70Var.b;
                textView2.append(spannableString);
                android.view.ViewParent parent2 = textView2.getParent();
                a.wv.t(parent2, "null cannot be cast to non-null type android.widget.ScrollView");
                ((android.widget.ScrollView) parent2).fullScroll(130);
                return;
        }
    }
}
