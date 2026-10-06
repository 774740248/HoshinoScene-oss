package a;

/* [修复] 从 smali 重建（r1.smali）。Runnable，方法体为保编译占位（L2 黑盒） */
public final class r1 implements java.lang.Runnable {

    public r1(a2 p0) {
        this(p0, null, 0);
    }
    public final /* synthetic */ int c;
    public final /* synthetic */ a.a2 d;
    public final /* synthetic */ com.omarea.krscript.model.RunnableNode e;

    public r1(a.a2 a2Var, com.omarea.krscript.model.RunnableNode runnableNode, int i) {
        this.c = i;
        this.d = a2Var;
        this.e = runnableNode;
    }

    @Override
    public void run() {
        // [修复] 保编译占位：smali 为脚本动作完成回调
    }
}
