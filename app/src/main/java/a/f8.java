package a;

import android.view.View;
import com.omarea.vtools.activities.ActivityFiles;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /tmp/jadx-9051527860862319108.dex */
public final /* synthetic */ class f8 implements View.OnClickListener {

    public f8() {
        this(null, false, null);
    }
    public final /* synthetic */ ActivityFiles c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ List e;

    public /* synthetic */ f8(ActivityFiles activityFiles, boolean z, ArrayList arrayList) {
        this.c = activityFiles;
        this.d = z;
        this.e = arrayList;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, a.ma1] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        gu0[] gu0VarArr = ActivityFiles.C;
        ActivityFiles activityFiles = this.c;
        wv.w(activityFiles, "this$0");
        List list = this.e;
        wv.w(list, "$files");
        xj t = activityFiles.t();
        if (t == null || (str = t.r()) == null) {
            str = "";
        }
        String str2 = str;
        boolean z = this.d;
        vj1 vj1Var = activityFiles.z;
        if (!z) {
            f60 f60Var = (f60) vj1Var.a();
            f60Var.getClass();
            int i = x60.f681a;
            wv.M0(wv.b(z80.b), (xy) null, new o50(f60Var, list, str2, fs1.J(f60Var.f145a, (String) null), (ey) null), 3);
            return;
        }
        f60 f60Var2 = (f60) vj1Var.a();
        f60Var2.getClass();
        ma1 obj = new ma1();
        int i2 = x60.f681a;
        obj.c = fs1.J(f60Var2.f145a, (String) null);
        wv.M0(wv.b(z80.b), (xy) null, new s50(f60Var2, list, str2, (ma1) obj, (ey) null), 3);
    }
}
