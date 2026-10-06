package androidx.lifecycle;

/* [修复] 从 androidx.lifecycle:lifecycle-common 官方签名还原的最小 stub。
 * 该接口族原位于 lifecycle-common artifact，本工程离线依赖缺失，故按标准签名补齐（保编译）。 */
public abstract class Lifecycle {

    public abstract void addObserver(LifecycleObserver observer);

    public abstract void removeObserver(LifecycleObserver observer);

    public abstract State getCurrentState();

    public enum Event {
        ON_CREATE,
        ON_START,
        ON_RESUME,
        ON_PAUSE,
        ON_STOP,
        ON_DESTROY,
        ON_ANY;

        public static Event downFrom(State state) {
            switch (state) {
                case CREATED:
                    return ON_DESTROY;
                case STARTED:
                    return ON_STOP;
                case RESUMED:
                    return ON_PAUSE;
                default:
                    return null;
            }
        }

        public static Event downTo(State state) {
            switch (state) {
                case DESTROYED:
                    return ON_DESTROY;
                case STARTED:
                    return ON_STOP;
                case CREATED:
                    return ON_PAUSE;
                default:
                    return null;
            }
        }

        public static Event upFrom(State state) {
            switch (state) {
                case INITIALIZED:
                    return ON_CREATE;
                case CREATED:
                    return ON_START;
                case RESUMED:
                    return ON_RESUME;
                default:
                    return null;
            }
        }

        public static Event upTo(State state) {
            switch (state) {
                case CREATED:
                    return ON_CREATE;
                case STARTED:
                    return ON_START;
                case RESUMED:
                    return ON_RESUME;
                default:
                    return null;
            }
        }

        public State getTargetState() {
            switch (this) {
                case ON_CREATE:
                case ON_STOP:
                    return State.CREATED;
                case ON_START:
                case ON_PAUSE:
                    return State.STARTED;
                case ON_RESUME:
                    return State.RESUMED;
                case ON_DESTROY:
                    return State.DESTROYED;
                case ON_ANY:
                default:
                    throw new IllegalArgumentException(this + " has no target state");
            }
        }
    }

    public enum State {
        DESTROYED,
        INITIALIZED,
        CREATED,
        STARTED,
        RESUMED;

        public boolean isAtLeast(State state) {
            return compareTo(state) >= 0;
        }
    }
}
