package a;

import java.util.Set;
/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ta0 {
    public static final java.lang.Object i = new java.lang.Object();
    public static volatile a.ta0 j;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.locks.ReentrantReadWriteLock f554a;
    public final a.np b;
    public volatile int c;
    public final android.os.Handler d;
    public final a.oa0 e;
    public final a.sa0 f;
    public final int g;
    public final a.j20 h;

    /* JADX WARN: Type inference failed for: r5v4, types: [a.vu0, a.oa0] */
    public ta0(a.si0 si0Var) {
        java.util.concurrent.locks.ReentrantReadWriteLock reentrantReadWriteLock = new java.util.concurrent.locks.ReentrantReadWriteLock();
        this.f554a = reentrantReadWriteLock;
        this.c = 3;
        this.f = si0Var.f432a;
        int i2 = si0Var.b;
        this.g = i2;
        this.h = si0Var.c;
        this.d = new android.os.Handler(android.os.Looper.getMainLooper());
        this.b = new a.np(0);
        a.vu0 vu0Var = new a.vu0(21, this);
        this.e = (oa0) vu0Var;
        reentrantReadWriteLock.writeLock().lock();
        if (i2 == 0) {
            try {
                this.c = 0;
            } catch (java.lang.Throwable th) {
                this.f554a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (b() == 0) {
            vu0Var.E();
        }
    }

    public static a.ta0 a() {
        a.ta0 ta0Var;
        synchronized (i) {
            try {
                ta0Var = j;
                if (!(ta0Var != null)) {
                    throw new java.lang.IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                }
            } finally {
            }
        }
        return ta0Var;
    }

    public final int b() {
        this.f554a.readLock().lock();
        try {
            return this.c;
        } finally {
            this.f554a.readLock().unlock();
        }
    }

    public final void c() {
        if (!(this.g == 1)) {
            throw new java.lang.IllegalStateException("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        }
        if (b() == 1) {
            return;
        }
        this.f554a.writeLock().lock();
        try {
            if (this.c == 0) {
                return;
            }
            this.c = 0;
            this.f554a.writeLock().unlock();
            this.e.E();
        } finally {
            this.f554a.writeLock().unlock();
        }
    }

    public final void d(java.lang.Throwable th) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f554a.writeLock().lock();
        try {
            this.c = 2;
            arrayList.addAll(this.b);
            this.b.clear();
            this.f554a.writeLock().unlock();
            this.d.post(new a.iw(arrayList, this.c, th));
        } catch (java.lang.Throwable th2) {
            this.f554a.writeLock().unlock();
            throw th2;
        }
    }

    public final void e() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f554a.writeLock().lock();
        try {
            this.c = 1;
            arrayList.addAll(this.b);
            this.b.clear();
            this.f554a.writeLock().unlock();
            this.d.post(new a.iw(this.c, arrayList));
        } catch (java.lang.Throwable th) {
            this.f554a.writeLock().unlock();
            throw th;
        }
    }

    public final java.lang.CharSequence f(int i2, int i3, java.lang.CharSequence charSequence) {
        if (!(b() == 1)) {
            throw new java.lang.IllegalStateException("Not initialized yet");
        }
        if (i2 < 0) {
            throw new java.lang.IllegalArgumentException("start cannot be negative");
        }
        if (i3 < 0) {
            throw new java.lang.IllegalArgumentException("end cannot be negative");
        }
        a.wv.q("start should be <= than end", i2 <= i3);
        if (charSequence == null) {
            return null;
        }
        a.wv.q("start should be < than charSequence length", i2 <= charSequence.length());
        a.wv.q("end should be < than charSequence length", i3 <= charSequence.length());
        return (charSequence.length() == 0 || i2 == i3) ? charSequence : this.e.F(charSequence, i2, i3, false);
    }

    public final void g(a.ra0 ra0Var) {
        if (ra0Var == null) {
            throw new java.lang.NullPointerException("initCallback cannot be null");
        }
        this.f554a.writeLock().lock();
        try {
            if (this.c != 1 && this.c != 2) {
                this.b.add(ra0Var);
                this.f554a.writeLock().unlock();
            }
            this.d.post(new a.iw(ra0Var, this.c));
            this.f554a.writeLock().unlock();
        } catch (java.lang.Throwable th) {
            this.f554a.writeLock().unlock();
            throw th;
        }
    }
}
