package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class ov0 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.HashMap f424a = new java.util.HashMap();
    public static final java.util.HashMap b = new java.util.HashMap();

    public static void a(java.lang.reflect.Constructor constructor, java.lang.Object obj) {
        try {
            java.lang.Object newInstance = constructor.newInstance(obj);
            a.wv.v(newInstance, "{\n            constructo…tance(`object`)\n        }");
            a.ai1.y(newInstance);
            throw null;
        } catch (java.lang.IllegalAccessException e) {
            throw new java.lang.RuntimeException(e);
        } catch (java.lang.InstantiationException e2) {
            throw new java.lang.RuntimeException(e2);
        } catch (java.lang.reflect.InvocationTargetException e3) {
            throw new java.lang.RuntimeException(e3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b6, code lost:
    
        if (r8.booleanValue() != false) goto L71;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int b(java.lang.Class r13) {
        /*
            Method dump skipped, instructions count: 339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.ov0.b(java.lang.Class):int");
    }
}
