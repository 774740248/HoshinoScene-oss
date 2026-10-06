package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class no {
    public static volatile a.no d;
    public static final java.lang.Object e = new java.lang.Object();
    public final android.content.Context c;
    public final java.util.HashSet b = new java.util.HashSet();

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashMap f386a = new java.util.HashMap();

    public no(android.content.Context context) {
        this.c = context.getApplicationContext();
    }

    public static a.no c(android.content.Context context) {
        if (d == null) {
            synchronized (e) {
                try {
                    if (d == null) {
                        d = new a.no(context);
                    }
                } finally {
                }
            }
        }
        return d;
    }

    public final void a(android.os.Bundle bundle) {
        java.util.HashSet hashSet;
        java.lang.String string = this.c.getString(2131951864);
        if (bundle != null) {
            try {
                java.util.HashSet hashSet2 = new java.util.HashSet();
                java.util.Iterator<java.lang.String> it = bundle.keySet().iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    hashSet = this.b;
                    if (!hasNext) {
                        break;
                    }
                    java.lang.String next = it.next();
                    if (string.equals(bundle.getString(next, null))) {
                        java.lang.Class<?> cls = java.lang.Class.forName(next);
                        if (a.hs0.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                java.util.Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    b((java.lang.Class) it2.next(), hashSet2);
                }
            } catch (java.lang.ClassNotFoundException e2) {
                throw new java.lang.RuntimeException(e2);
            }
        }
    }

    public final java.lang.Object b(java.lang.Class cls, java.util.HashSet hashSet) {
        java.lang.Object obj;
        if (a.b20.w0()) {
            try {
                android.os.Trace.beginSection(cls.getSimpleName());
            } catch (java.lang.Throwable th) {
                android.os.Trace.endSection();
                throw th;
            }
        }
        if (hashSet.contains(cls)) {
            throw new java.lang.IllegalStateException(java.lang.String.format("Cannot initialize %s. Cycle detected.", cls.getName()));
        }
        java.util.HashMap hashMap = this.f386a;
        if (hashMap.containsKey(cls)) {
            obj = hashMap.get(cls);
        } else {
            hashSet.add(cls);
            try {
                a.hs0 hs0Var = (a.hs0) cls.getDeclaredConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
                java.util.List<java.lang.Class> a2 = hs0Var.a();
                if (!a2.isEmpty()) {
                    for (java.lang.Class cls2 : a2) {
                        if (!hashMap.containsKey(cls2)) {
                            b(cls2, hashSet);
                        }
                    }
                }
                obj = hs0Var.b(this.c);
                hashSet.remove(cls);
                hashMap.put(cls, obj);
            } catch (java.lang.Throwable th2) {
                throw new java.lang.RuntimeException(th2);
            }
        }
        android.os.Trace.endSection();
        return obj;
    }
}
