package androidx.lifecycle;

/* [修复] 官方签名 stub（lifecycle-common 缺失，保编译） */
public interface DefaultLifecycleObserver extends LifecycleObserver {

    default void onCreate(LifecycleOwner owner) {
    }

    default void onStart(LifecycleOwner owner) {
    }

    default void onResume(LifecycleOwner owner) {
    }

    default void onPause(LifecycleOwner owner) {
    }

    default void onStop(LifecycleOwner owner) {
    }

    default void onDestroy(LifecycleOwner owner) {
    }
}
