package a;

import com.omarea.krscript.model.PickerNode;

/* loaded from: /tmp/jadx-9051527860862319108.dex */
public final /* synthetic */ class n1 implements Runnable {

    public n1() {
        this(null, null, null, 0);
    }
    public final /* synthetic */ int c;
    public final /* synthetic */ a2 d;
    public final /* synthetic */ PickerNode e;
    public final /* synthetic */ Runnable f;

    public /* synthetic */ n1(a2 a2Var, PickerNode pickerNode, u1 u1Var, int i) {
        this.c = i;
        this.d = a2Var;
        this.e = pickerNode;
        this.f = u1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        Runnable runnable = this.f;
        PickerNode pickerNode = this.e;
        a2 a2Var = this.d;
        switch (i) {
            case 0:
                int i2 = a2.d0;
                wv.w(a2Var, "this$0");
                wv.w(pickerNode, "$item");
                wv.w(runnable, "$onCompleted");
                a2Var.W(pickerNode, runnable);
                return;
            default:
                int i3 = a2.d0;
                wv.w(a2Var, "this$0");
                wv.w(pickerNode, "$item");
                wv.w(runnable, "$onCompleted");
                a2Var.W(pickerNode, runnable);
                return;
        }
    }
}
