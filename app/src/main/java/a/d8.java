package a;

import android.view.View;
import com.omarea.Scene;
import com.omarea.vtools.activities.ActivityFiles;
import java.util.ArrayList;

/* loaded from: /tmp/jadx-9051527860862319108.dex */
public final /* synthetic */ class d8 implements View.OnClickListener {

    public d8(ActivityFiles p0) {
        this(p0, 0);
    }
    public final /* synthetic */ int c;
    public final /* synthetic */ ActivityFiles d;

    public /* synthetic */ d8(ActivityFiles activityFiles, int i) {
        this.c = i;
        this.d = activityFiles;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ArrayList arrayList;
        int i = this.c;
        ActivityFiles activityFiles = this.d;
        switch (i) {
            case 0:
                gu0[] gu0VarArr = ActivityFiles.C;
                wv.w(activityFiles, "this$0");
                wv.v(view, "it");
                d61 d61Var = new d61(activityFiles, view, 0);
                d61Var.c = activityFiles;
                jj1 jj1Var = new jj1(activityFiles);
                pz0 pz0Var = d61Var.f88a;
                jj1Var.inflate(2131689473, pz0Var);
                d61Var.a();
                b20.w(d61Var);
                xj t = activityFiles.t();
                if (t == null || !t.z) {
                    return;
                }
                pz0Var.findItem(2131362803).setVisible(false);
                return;
            case 1:
                gu0[] gu0VarArr2 = ActivityFiles.C;
                wv.w(activityFiles, "this$0");
                mi0.a(activityFiles, new k8(activityFiles, 6));
                return;
            case 2:
                gu0[] gu0VarArr3 = ActivityFiles.C;
                wv.w(activityFiles, "this$0");
                wv.v(view, "it");
                d61 d61Var2 = new d61(activityFiles, view, 0);
                d61Var2.c = activityFiles;
                new jj1(activityFiles).inflate(2131689474, d61Var2.f88a);
                d61Var2.a();
                b20.w(d61Var2);
                return;
            case 3:
                gu0[] gu0VarArr4 = ActivityFiles.C;
                wv.w(activityFiles, "this$0");
                xj t2 = activityFiles.t();
                ArrayList<String> arrayList2 = t2 != null ? t2.A : null;
                if (arrayList2 == null || arrayList2.isEmpty()) {
                    cp cpVar = Scene.c;
                    String string = activityFiles.getString(2131952438);
                    wv.v(string, "getString(R.string.fs_no_files_selected)");
                    fs1.X(string, 0);
                    return;
                }
                int i2 = x60.f681a;
                String string2 = activityFiles.getString(2131952264);
                wv.v(string2, "getString(R.string.file_delete_selected)");
                ArrayList arrayList3 = new ArrayList(op.J1(arrayList2, 10));
                for (String str : arrayList2) {
                    String substring = str.substring(yi1.q2(str, "/", 6) + 1);
                    wv.v(substring, "this as java.lang.String).substring(startIndex)");
                    arrayList3.add(substring);
                }
                String j2 = qv.j2(arrayList3, "\n", (String) null, (String) null, (bp0) null, 62);
                if (j2.length() > 256) {
                    String substring2 = j2.substring(0, 256);
                    wv.v(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                    j2 = substring2.concat("……");
                }
                fs1.i(activityFiles, string2, j2, new so(activityFiles, 23, arrayList2), (Runnable) null);
                return;
            case 4:
                gu0[] gu0VarArr5 = ActivityFiles.C;
                wv.w(activityFiles, "this$0");
                xj t3 = activityFiles.t();
                arrayList = t3 != null ? t3.A : null;
                if (arrayList == null || arrayList.isEmpty()) {
                    cp cpVar2 = Scene.c;
                    String string3 = activityFiles.getString(2131952438);
                    wv.v(string3, "getString(R.string.fs_no_files_selected)");
                    fs1.X(string3, 0);
                    return;
                }
                ArrayList arrayList4 = new ArrayList();
                arrayList4.addAll(arrayList);
                activityFiles.C(arrayList4, false);
                activityFiles.s();
                return;
            default:
                gu0[] gu0VarArr6 = ActivityFiles.C;
                wv.w(activityFiles, "this$0");
                xj t4 = activityFiles.t();
                arrayList = t4 != null ? t4.A : null;
                if (arrayList == null || arrayList.isEmpty()) {
                    cp cpVar3 = Scene.c;
                    String string4 = activityFiles.getString(2131952438);
                    wv.v(string4, "getString(R.string.fs_no_files_selected)");
                    fs1.X(string4, 0);
                    return;
                }
                ArrayList arrayList5 = new ArrayList();
                arrayList5.addAll(arrayList);
                activityFiles.C(arrayList5, true);
                activityFiles.s();
                return;
        }
    }
}
