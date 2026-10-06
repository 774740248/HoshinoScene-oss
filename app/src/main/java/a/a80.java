package a;

/* [修复] 从 smali 重建（a80.smali）。Runnable，方法体为保编译占位（L2 黑盒） */
public final class a80 implements java.lang.Runnable {

    public a80() {
        this(null, 0);
    }
    public final /* synthetic */ int c;
    public final /* synthetic */ a.x01 d;

    public a80(a.x01 x01Var, int i) {
        this.c = i;
        this.d = x01Var;
    }

    @Override
    public void run() {
        // [修复] 保编译占位：smali 为支付流程分发逻辑
    }
}
