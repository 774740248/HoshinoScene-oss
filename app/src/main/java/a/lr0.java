package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class lr0 extends com.omarea.krscript.model.ShellHandlerBase {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f325a;
    public final java.util.ArrayList b = new java.util.ArrayList();

    public lr0(android.content.Context context) {
        this.f325a = context;
    }

    @Override // com.omarea.krscript.model.ShellHandlerBase
    public final void onError(java.lang.Object obj) {
        java.lang.String obj2;
        a.wv.v(this.f325a.getString(2131952724), "context.getString(R.stri…kr_script_task_has_error)");
        synchronized (this.b) {
            try {
                this.b.add(((obj == null || (obj2 = obj.toString()) == null) ? null : a.yi1.F2(obj2).toString()));
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.omarea.krscript.model.ShellHandlerBase
    public final void onExit(java.lang.Object obj) {
        java.util.ArrayList arrayList = this.b;
        if (arrayList.size() > 0) {
            android.content.Context context = this.f325a;
            java.lang.String string = context.getString(2131952724);
            a.ob1 ob1Var = new a.ob1(context);
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.util.Iterator it = arrayList.iterator();
            int i = 0;
            while (it.hasNext()) {
                java.lang.String str = (java.lang.String) it.next();
                if (i > 0) {
                    sb.append("\n");
                }
                sb.append(ob1Var.a(str, false));
                i++;
            }
            java.lang.String sb2 = sb.toString();
            a.wv.v(sb2, "builder.toString()");
            android.widget.Toast.makeText(context, string + "\n\n" + sb2, 1).show();
        }
    }

    @Override // com.omarea.krscript.model.ShellHandlerBase
    public final void onProgress(int i, int i2) {
    }

    @Override // com.omarea.krscript.model.ShellHandlerBase
    public final void onReader(java.lang.Object obj) {
    }

    @Override // com.omarea.krscript.model.ShellHandlerBase
    public final void onStart(java.lang.Object obj) {
    }

    @Override // com.omarea.krscript.model.ShellHandlerBase
    public final void onWrite(java.lang.Object obj) {
    }

    @Override // com.omarea.krscript.model.ShellHandlerBase
    public final void updateLog(android.text.SpannableString spannableString) {
    }

    @Override // com.omarea.krscript.model.ShellHandlerBase
    public final void onStart(java.lang.Runnable runnable) {
    }
}
