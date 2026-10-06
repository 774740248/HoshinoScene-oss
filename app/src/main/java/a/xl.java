package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class xl {
    public static final a.to c = new a.to((uo) (new java.lang.Object()));
    public static int d = -100;
    public static a.hx0 e = null;
    public static a.hx0 f = null;
    public static java.lang.Boolean g = null;
    public static boolean h = false;
    public static final a.np i = new a.np(0);
    public static final java.lang.Object j = new java.lang.Object();
    public static final java.lang.Object k = new java.lang.Object();

    public static boolean c(android.content.Context context) {
        if (g == null) {
            try {
                int i2 = a.ro.c;
                android.os.Bundle bundle = context.getPackageManager().getServiceInfo(new android.content.ComponentName(context, (java.lang.Class<?>) a.ro.class), a.qo.a() | 128).metaData;
                if (bundle != null) {
                    g = java.lang.Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                android.util.Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                g = java.lang.Boolean.FALSE;
            }
        }
        return g.booleanValue();
    }

    public static void h(a.xl xlVar) {
        synchronized (j) {
            try {
                java.util.Iterator it = i.iterator();
                while (it.hasNext()) {
                    a.xl xlVar2 = (a.xl) ((java.lang.ref.WeakReference) it.next()).get();
                    if (xlVar2 == xlVar || xlVar2 == null) {
                        it.remove();
                    }
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public static void m(int i2) {
        if (i2 != -1 && i2 != 0 && i2 != 1 && i2 != 2 && i2 != 3) {
            android.util.Log.d("AppCompatDelegate", "setDefaultNightMode() called with an unknown mode");
            return;
        }
        if (d != i2) {
            d = i2;
            synchronized (j) {
                try {
                    java.util.Iterator it = i.iterator();
                    while (it.hasNext()) {
                        a.xl xlVar = (a.xl) ((java.lang.ref.WeakReference) it.next()).get();
                        if (xlVar != null) {
                            ((a.km) xlVar).p(true, true);
                        }
                    }
                } finally {
                }
            }
        }
    }

    public abstract void a();

    public abstract void b();

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public abstract boolean i(int i2);

    public abstract void j(int i2);

    public abstract void k(android.view.View view);

    public abstract void l(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams);

    public abstract void n(java.lang.CharSequence charSequence);

    public abstract a.o2 o(a.n2 n2Var);
}
