package a;

import android.content.Context;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import com.omarea.krscript.model.RunnableNode;
import com.omarea.vtools.activities.ActivityCustomCommand;
import java.util.HashMap;

/* loaded from: /tmp/jadx-9051527860862319108.dex */
public final /* synthetic */ class h7 implements View.OnClickListener {

    public h7(ActivityCustomCommand p0) {
        this(p0, 0);
    }
    public final /* synthetic */ int c;
    public final /* synthetic */ ActivityCustomCommand d;

    public /* synthetic */ h7(ActivityCustomCommand activityCustomCommand, int i) {
        this.c = i;
        this.d = activityCustomCommand;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String obj;
        int i = this.c;
        ActivityCustomCommand activityCustomCommand = this.d;
        switch (i) {
            case 0:
                gu0[] gu0VarArr = ActivityCustomCommand.h;
                wv.w(activityCustomCommand, "this$0");
                gu0[] gu0VarArr2 = ActivityCustomCommand.h;
                Editable text = ((EditText) activityCustomCommand.g.a(gu0VarArr2[3])).getText();
                String obj2 = text != null ? text.toString() : null;
                Editable text2 = ((EditText) activityCustomCommand.f.a(gu0VarArr2[2])).getText();
                obj = text2 != null ? text2.toString() : null;
                RunnableNode runnableNode = new RunnableNode("");
                runnableNode.setTitle("TEST-EXECUTOR");
                runnableNode.setDesc("COMMAND >> " + obj2);
                fs1 fs1Var = l70.A0;
                hs hsVar = new hs(8);
                hs hsVar2 = new hs(9);
                String valueOf = String.valueOf(obj);
                fs1Var.getClass();
                l70 l = fs1.l(runnableNode, hsVar, hsVar2, valueOf, (HashMap) null, false);
                l.V(activityCustomCommand.getSupportFragmentManager(), "");
                l.U(false);
                return;
            default:
                gu0[] gu0VarArr3 = ActivityCustomCommand.h;
                wv.w(activityCustomCommand, "this$0");
                gu0[] gu0VarArr4 = ActivityCustomCommand.h;
                Editable text3 = ((EditText) activityCustomCommand.g.a(gu0VarArr4[3])).getText();
                String obj3 = text3 != null ? text3.toString() : null;
                Editable text4 = ((EditText) activityCustomCommand.f.a(gu0VarArr4[2])).getText();
                obj = text4 != null ? text4.toString() : null;
                if (obj3 == null || obj3.length() == 0) {
                    Toast.makeText((Context) activityCustomCommand, (CharSequence) activityCustomCommand.getString(2131953630), 0).show();
                    return;
                } else if (obj == null || obj.length() == 0) {
                    Toast.makeText((Context) activityCustomCommand, (CharSequence) activityCustomCommand.getString(2131953628), 0).show();
                    return;
                } else {
                    activityCustomCommand.o(obj3, obj, false);
                    return;
                }
        }
    }
}
