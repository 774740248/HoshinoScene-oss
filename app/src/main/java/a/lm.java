package a;

/* [修复] 从 smali 重建（lm.smali）。实现 a.ou0，转发 superDispatchKeyEvent 到 a.uk.r() */
public final class lm implements a.ou0 {
    public final /* synthetic */ a.uk c;

    public lm(a.uk ukVar) {
        this.c = ukVar;
    }

    @Override
    public boolean superDispatchKeyEvent(android.view.KeyEvent keyEvent) {
        return this.c.r(keyEvent);
    }
}
