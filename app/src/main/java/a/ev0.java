package a;

/* [修复] 从 smali 还原 enum（jadx 失败）。Lifecycle.Event */
public enum ev0 {
    ON_CREATE,
    ON_START,
    ON_RESUME,
    ON_PAUSE,
    ON_STOP,
    ON_DESTROY,
    ON_ANY;

    public static final cv0 Companion = new cv0();

    public final fv0 a() {
        switch (this) {
            case ON_CREATE:
            case ON_STOP:
                return fv0.e;
            case ON_START:
            case ON_PAUSE:
                return fv0.f;
            case ON_RESUME:
                return fv0.g;
            case ON_DESTROY:
                return fv0.c;
            default:
                throw new IllegalArgumentException(this + " has no target state");
        }
    }
}
