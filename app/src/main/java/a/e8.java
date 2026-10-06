package a;

import android.view.View;
import com.omarea.Scene;
import com.omarea.vtools.activities.ActivityFiles;
import java.io.File;

/* loaded from: /tmp/jadx-9051527860862319108.dex */
public final /* synthetic */ class e8 implements View.OnLongClickListener {

    public e8(ActivityFiles p0) {
        this(p0, 0);
    }

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3a;
    public final /* synthetic */ ActivityFiles b;

    public /* synthetic */ e8(ActivityFiles activityFiles, int i) {
        this.f3a = i;
        this.b = activityFiles;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        String r;
        int i = this.f3a;
        ActivityFiles activityFiles = this.b;
        switch (i) {
            case 0:
                gu0[] gu0VarArr = ActivityFiles.C;
                wv.w(activityFiles, "this$0");
                activityFiles.q(true);
                return true;
            default:
                gu0[] gu0VarArr2 = ActivityFiles.C;
                wv.w(activityFiles, "this$0");
                xj t = activityFiles.t();
                if (t == null || (r = t.r()) == null) {
                    return false;
                }
                vj1 vj1Var = mi0.f353a;
                String name = new File(r).getName();
                wv.v(name, "File(current).name");
                mi0.b().edit().putString(r, name).apply();
                cp cpVar = Scene.c;
                String string = activityFiles.getString(2131952416);
                wv.v(string, "getString(R.string.fs_fav_added)");
                fs1.X(string, 0);
                return true;
        }
    }
}
