package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final /* synthetic */ class ni implements android.view.View.OnLongClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f382a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;

    public /* synthetic */ ni(java.lang.Object obj, int i, java.lang.Object obj2) {
        this.f382a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        int i = this.f382a;
        java.lang.Object obj = this.c;
        java.lang.Object obj2 = this.b;
        int i2 = 1;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.ti tiVar = (a.ti) obj2;
                a.oi oiVar = (a.oi) obj;
                a.wv.w(tiVar, "this$0");
                a.wv.w(oiVar, "this$1");
                int d = oiVar.d();
                if (d != -1 && (!tiVar.l || d != 0)) {
                    java.io.File p = tiVar.p(d);
                    a.wv.t(p, "null cannot be cast to non-null type java.io.File");
                    boolean exists = p.exists();
                    android.view.View view2 = oiVar.f91a;
                    if (!exists) {
                        android.widget.Toast.makeText(view2.getContext(), view2.getContext().getString(2131952266), 0).show();
                    } else if (tiVar.o && p.isDirectory()) {
                        int i3 = a.x60.f681a;
                        android.content.Context context = view2.getContext();
                        a.wv.v(context, "holder.itemView.context");
                        java.lang.String string = view2.getContext().getString(2131952282);
                        a.wv.v(string, "holder.itemView.context.…g(R.string.folder_select)");
                        java.lang.String absolutePath = p.getAbsolutePath();
                        a.wv.v(absolutePath, "file.absolutePath");
                        a.fs1.i(context, string, absolutePath, new a.mi(p, oiVar, tiVar, i2), new a.hs(3));
                    }
                }
                return true;
            case 1:
                a.xj xjVar = (a.xj) obj2;
                a.tj tjVar = (a.tj) obj;
                int i4 = a.tj.y;
                a.wv.w(xjVar, "this$0");
                a.wv.w(tjVar, "this$1");
                int d2 = tjVar.d();
                if (d2 != -1 && (!xjVar.r || d2 != 0)) {
                    a.mc1 s = xjVar.s(d2);
                    java.lang.String str = s.f;
                    if (str != null && str.length() != 0) {
                        s = a.fs1.r(str);
                    }
                    boolean z = s.e;
                    android.view.View view3 = tjVar.f91a;
                    if (!z) {
                        android.widget.Toast.makeText(view3.getContext(), view3.getContext().getString(2131952266), 0).show();
                    } else if (xjVar.k != null) {
                        int i5 = a.x60.f681a;
                        android.content.Context context2 = view3.getContext();
                        a.wv.v(context2, "holder.itemView.context");
                        java.lang.String string2 = view3.getContext().getString(2131952264);
                        a.wv.v(string2, "holder.itemView.context.…ing.file_delete_selected)");
                        a.fs1.i(context2, string2, s.c, new a.so(xjVar, 9, s), null);
                    } else {
                        a.bp0 bp0Var = xjVar.l;
                        if (bp0Var != null) {
                            bp0Var.i(s);
                        }
                    }
                }
                return true;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                android.widget.TextView textView = (android.widget.TextView) obj2;
                java.lang.String str2 = (java.lang.String) obj;
                int i6 = com.omarea.ui.files.BreadcrumbView.e;
                a.wv.w(textView, "$this_apply");
                a.wv.w(str2, "$path");
                java.lang.Object systemService = textView.getContext().getSystemService("clipboard");
                a.wv.t(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
                ((android.content.ClipboardManager) systemService).setPrimaryClip(android.content.ClipData.newPlainText(str2, str2));
                android.widget.Toast.makeText(textView.getContext(), textView.getContext().getString(2131951907) + str2, 0).show();
                return true;
            case 3:
                a.jk jkVar = (a.jk) obj2;
                a.ik ikVar = (a.ik) obj;
                a.wv.w(jkVar, "this$0");
                a.wv.w(ikVar, "$this_apply");
                android.content.Context context3 = jkVar.f;
                java.lang.Object systemService2 = context3.getSystemService("clipboard");
                a.wv.t(systemService2, "null cannot be cast to non-null type android.content.ClipboardManager");
                android.content.ClipboardManager clipboardManager = (android.content.ClipboardManager) systemService2;
                android.widget.TextView textView2 = ikVar.u;
                if (textView2 == null) {
                    a.wv.M1("threadName");
                    throw null;
                }
                clipboardManager.setText(textView2.getText());
                java.lang.String string3 = context3.getString(2131951907);
                android.widget.TextView textView3 = ikVar.u;
                if (textView3 == null) {
                    a.wv.M1("threadName");
                    throw null;
                }
                android.widget.Toast.makeText(context3, string3 + ((java.lang.Object) textView3.getText()), 1).show();
                return true;
            default:
                android.view.WindowManager.LayoutParams layoutParams = (android.view.WindowManager.LayoutParams) obj2;
                android.view.WindowManager windowManager = (android.view.WindowManager) obj;
                a.fa0 fa0Var = a.ph0.i;
                a.wv.w(layoutParams, "$params");
                a.wv.w(windowManager, "$mWindowManager");
                layoutParams.flags = 1080;
                android.view.View view4 = a.ph0.j;
                a.wv.s(view4);
                view4.setBackgroundColor(android.graphics.Color.argb(128, 255, 255, 255));
                windowManager.updateViewLayout(a.ph0.j, layoutParams);
                return true;
        }
    }
}
