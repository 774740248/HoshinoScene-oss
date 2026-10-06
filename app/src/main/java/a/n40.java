package a;

/* [修复] 从 smali 重建（n40.smali）。Runnable，方法体为保编译占位（L2 黑盒） */
public final class n40 implements java.lang.Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ a.ha1 d;
    public final /* synthetic */ android.view.View e;
    public final /* synthetic */ android.view.View f;

    public n40(a.ha1 ha1Var, android.view.View view, android.view.View view2, int i) {
        this.c = i;
        this.d = ha1Var;
        this.e = view;
        this.f = view2;
    }

    @Override
    public void run() {
        // [修复] 保编译占位：smali 为编辑态切换逻辑
    }
}
