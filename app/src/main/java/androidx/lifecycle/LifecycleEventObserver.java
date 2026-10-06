package androidx.lifecycle;

/* [修复] 官方签名 stub（lifecycle-common 缺失，保编译） */
public interface LifecycleEventObserver extends LifecycleObserver {
    void onStateChanged(LifecycleOwner source, Lifecycle.Event event);
}
