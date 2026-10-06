package a;

/* [修复] 从 smali 重建（v81.smali）。Runnable，转发到 a.w81.g() */
public final class v81 implements java.lang.Runnable {

    public v81() {
        this(null);
    }
    public final /* synthetic */ a.w81 c;

    public v81(a.w81 w81Var) {
        this.c = w81Var;
    }

    @Override
    public void run() {
        this.c.g();
    }
}
