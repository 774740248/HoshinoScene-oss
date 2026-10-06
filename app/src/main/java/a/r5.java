package a;

/* [修复] 从 smali 重建（r5.smali）。Runnable，方法体为保编译占位（L2 黑盒） */
public final class r5 implements java.lang.Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ com.omarea.vtools.activities.ActivityChargeControl d;

    public r5(com.omarea.vtools.activities.ActivityChargeControl activityChargeControl, int i) {
        this.c = i;
        this.d = activityChargeControl;
    }

    @Override
    public void run() {
        // [修复] 保编译占位：smali 为 switch 分发的充电控制逻辑
    }
}
