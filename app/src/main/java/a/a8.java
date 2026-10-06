package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final /* synthetic */ class a8 implements android.view.View.OnClickListener {
    public final /* synthetic */ int c;
    public final /* synthetic */ com.omarea.vtools.activities.ActivityFileSelector d;

    public /* synthetic */ a8(com.omarea.vtools.activities.ActivityFileSelector activityFileSelector, int i) {
        this.c = i;
        this.d = activityFileSelector;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        int i = this.c;
        final int i2 = 0;
        final com.omarea.vtools.activities.ActivityFileSelector activityFileSelector = this.d;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.fa0 fa0Var = com.omarea.vtools.activities.ActivityFileSelector.m;
                a.wv.w(activityFileSelector, "this$0");
                a.xj xjVar = activityFileSelector.h;
                a.wv.s(xjVar);
                final java.lang.String r = xjVar.r();
                a.wv.s(r);
                int i3 = a.x60.f681a;
                java.lang.String string = activityFileSelector.getString(activityFileSelector.j == com.omarea.vtools.activities.ActivityFileSelector.o ? 2131952282 : 2131952280);
                a.wv.v(string, "getString(if (mode == MO…lse R.string.file_select)");
                a.fs1.i(activityFileSelector, string, r, new a.b8(), null);
                return;
            case 1:
                a.fa0 fa0Var2 = com.omarea.vtools.activities.ActivityFileSelector.m;
                a.wv.w(activityFileSelector, "this$0");
                a.ti tiVar = activityFileSelector.g;
                a.wv.s(tiVar);
                java.io.File file = tiVar.h;
                a.wv.s(file);
                final java.lang.String absolutePath = file.getAbsolutePath();
                a.wv.v(absolutePath, "currentDir!!.absolutePath");
                int i4 = a.x60.f681a;
                java.lang.String string2 = activityFileSelector.getString(activityFileSelector.j == com.omarea.vtools.activities.ActivityFileSelector.o ? 2131952282 : 2131952280);
                a.wv.v(string2, "getString(if (mode == MO…lse R.string.file_select)");
                final int i5 = 1;
                a.fs1.i(activityFileSelector, string2, absolutePath, new a.b8(), null);
                return;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                a.fa0 fa0Var3 = com.omarea.vtools.activities.ActivityFileSelector.m;
                a.wv.w(activityFileSelector, "this$0");
                a.mi0.a(activityFileSelector, new a.c8(activityFileSelector, 0));
                return;
            default:
                a.fa0 fa0Var4 = com.omarea.vtools.activities.ActivityFileSelector.m;
                a.wv.w(activityFileSelector, "this$0");
                activityFileSelector.finish();
                return;
        }
    }
}
