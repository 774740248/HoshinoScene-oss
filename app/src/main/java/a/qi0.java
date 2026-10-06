package a;

import android.content.Context;
import android.graphics.Typeface;
import java.nio.MappedByteBuffer;

/* loaded from: /tmp/jadx-9051527860862319108.dex */
public final /* synthetic */ class qi0 implements Runnable {

    public qi0(ri0 p0) {
        this(p0, 0);
    }
    public final /* synthetic */ int c;
    public final /* synthetic */ ri0 d;

    public /* synthetic */ qi0(ri0 ri0Var, int i) {
        this.c = i;
        this.d = ri0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.c) {
            case 0:
                ri0 ri0Var = this.d;
                synchronized (ri0Var.d) {
                    try {
                        if (ri0Var.h == null) {
                            return;
                        }
                        try {
                            cj0 d = ri0Var.d();
                            int i = d.e;
                            if (i == 2) {
                                synchronized (ri0Var.d) {
                                }
                            }
                            if (i != 0) {
                                throw new RuntimeException("fetchFonts result is not OK. (" + i + ")");
                            }
                            try {
                                int i2 = gn1.f185a;
                                fn1.a("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                fa0 fa0Var = ri0Var.c;
                                Context context = ri0Var.f497a;
                                fa0Var.getClass();
                                Typeface w = do1.f102a.w(context, new cj0[]{d}, 0);
                                MappedByteBuffer S0 = wv.S0(ri0Var.f497a, d.f762a);
                                if (S0 == null || w == null) {
                                    throw new RuntimeException("Unable to open file.");
                                }
                                try {
                                    fn1.a("EmojiCompat.MetadataRepo.create");
                                    ej1 ej1Var = new ej1(w, wv.a1(S0));
                                    fn1.b();
                                    fn1.b();
                                    synchronized (ri0Var.d) {
                                        try {
                                            b20 b20Var = ri0Var.h;
                                            if (b20Var != null) {
                                                b20Var.N0(ej1Var);
                                            }
                                        } finally {
                                        }
                                    }
                                    ri0Var.b();
                                    return;
                                } finally {
                                    int i3 = gn1.f185a;
                                    fn1.b();
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        } catch (Throwable th2) {
                            synchronized (ri0Var.d) {
                                try {
                                    b20 b20Var2 = ri0Var.h;
                                    if (b20Var2 != null) {
                                        b20Var2.J0(th2);
                                    }
                                    ri0Var.b();
                                    return;
                                } finally {
                                }
                            }
                        }
                    } finally {
                    }
                }
            default:
                this.d.c();
                return;
        }
    }
}
