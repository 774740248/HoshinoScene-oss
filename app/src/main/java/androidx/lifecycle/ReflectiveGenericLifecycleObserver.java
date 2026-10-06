package androidx.lifecycle;
import a.cv;
import a.ev;
import a.ev0;
import a.kv0;
import a.mv0;


/* JADX INFO: Access modifiers changed from: package-private */
@java.lang.Deprecated
/* loaded from: /tmp/jadx-10340276197810293799.dex */
public class ReflectiveGenericLifecycleObserver implements kv0 {
    public final java.lang.Object c;
    public final cv d;

    public ReflectiveGenericLifecycleObserver(java.lang.Object obj) {
        this.c = obj;
        ev evVar = ev.c;
        java.lang.Class<?> cls = obj.getClass();
        cv cvVar = (cv) evVar.f138a.get(cls);
        this.d = cvVar == null ? evVar.a(cls, null) : cvVar;
    }

    @Override // kv0
    public final void c(mv0 mv0Var, ev0 ev0Var) {
        java.util.HashMap hashMap = this.d.f84a;
        java.util.List list = (java.util.List) hashMap.get(ev0Var);
        java.lang.Object obj = this.c;
        cv.a(list, mv0Var, ev0Var, obj);
        cv.a((java.util.List) hashMap.get(ev0.ON_ANY), mv0Var, ev0Var, obj);
    }
}
