package a;

import com.omarea.vtools.activities.ActivityCommandList;
import java.io.File;
import java.util.ArrayList;

/* loaded from: /tmp/jadx-9051527860862319108.dex */
public final /* synthetic */ class e6 implements Runnable {
    public final /* synthetic */ ActivityCommandList c;
    public final /* synthetic */ s10 d;
    public final /* synthetic */ gi e;
    public final /* synthetic */ int f;

    public /* synthetic */ e6(ActivityCommandList activityCommandList, s10 s10Var, gi giVar, int i) {
        this.c = activityCommandList;
        this.d = s10Var;
        this.e = giVar;
        this.f = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        gu0[] gu0VarArr = ActivityCommandList.f;
        wv.w(this.c, "this$0");
        s10 s10Var = this.d;
        wv.w(s10Var, "$item");
        gi giVar = this.e;
        wv.w(giVar, "$adapter");
        File file = new File(s10Var.d);
        if (file.exists()) {
            file.delete();
        }
        ArrayList arrayList = giVar.g;
        int i = this.f;
        arrayList.remove(i);
        ((e91) giVar).c.f(i, 1);
    }
}
