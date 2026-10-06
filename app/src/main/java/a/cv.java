package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class cv {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashMap f84a = new java.util.HashMap();
    public final java.util.Map b;

    public cv(java.util.HashMap hashMap) {
        this.b = hashMap;
        for (java.util.Map.Entry entry : (Iterable<java.util.Map.Entry>) hashMap.entrySet()) {
            a.ev0 ev0Var = (a.ev0) entry.getValue();
            java.util.List list = (java.util.List) this.f84a.get(ev0Var);
            if (list == null) {
                list = new java.util.ArrayList();
                this.f84a.put(ev0Var, list);
            }
            list.add((a.dv) entry.getKey());
        }
    }

    public static void a(java.util.List list, a.mv0 mv0Var, a.ev0 ev0Var, java.lang.Object obj) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                a.dv dvVar = (a.dv) list.get(size);
                dvVar.getClass();
                try {
                    int i = dvVar.f108a;
                    java.lang.reflect.Method method = dvVar.b;
                    if (i == 0) {
                        method.invoke(obj, new java.lang.Object[0]);
                    } else if (i == 1) {
                        method.invoke(obj, mv0Var);
                    } else if (i == 2) {
                        method.invoke(obj, mv0Var, ev0Var);
                    }
                } catch (java.lang.IllegalAccessException e) {
                    throw new java.lang.RuntimeException(e);
                } catch (java.lang.reflect.InvocationTargetException e2) {
                    throw new java.lang.RuntimeException("Failed to call observer method", e2.getCause());
                }
            }
        }
    }
}
