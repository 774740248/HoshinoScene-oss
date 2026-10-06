package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class gn1 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f185a = 0;

    static {
        if (android.os.Build.VERSION.SDK_INT < 29) {
            try {
                android.os.Trace.class.getField("TRACE_TAG_APP").getLong(null);
                java.lang.Class cls = java.lang.Long.TYPE;
                android.os.Trace.class.getMethod("isTagEnabled", cls);
                java.lang.Class cls2 = java.lang.Integer.TYPE;
                android.os.Trace.class.getMethod("asyncTraceBegin", cls, java.lang.String.class, cls2);
                android.os.Trace.class.getMethod("asyncTraceEnd", cls, java.lang.String.class, cls2);
                android.os.Trace.class.getMethod("traceCounter", cls, java.lang.String.class, cls2);
            } catch (java.lang.Exception e) {
                android.util.Log.i("TraceCompat", "Unable to initialize via reflection.", e);
            }
        }
    }
}
