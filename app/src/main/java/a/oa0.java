package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class oa0 extends a.vu0 {
    public volatile a.gb0 e;
    public volatile a.ej1 f;

    public final void E() {
        try {
            ((a.ta0) this.d).f.a(new a.na0(this));
        } catch (java.lang.Throwable th) {
            ((a.ta0) this.d).d(th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0050 A[Catch: all -> 0x002f, TryCatch #0 {all -> 0x002f, blocks: (B:103:0x0013, B:106:0x0018, B:108:0x001c, B:110:0x0029, B:9:0x003f, B:11:0x0049, B:13:0x004c, B:15:0x0050, B:17:0x0060, B:19:0x0063, B:23:0x0070, B:26:0x0078, B:31:0x009e, B:56:0x00ac, B:60:0x00b8, B:61:0x00c2, B:43:0x00d8, B:46:0x00df, B:34:0x00e4, B:36:0x00ef, B:67:0x00f6, B:69:0x00fa, B:71:0x0100, B:73:0x0104, B:77:0x010e, B:80:0x011a, B:81:0x011f, B:83:0x0134, B:6:0x0034), top: B:102:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x011a A[Catch: all -> 0x002f, TryCatch #0 {all -> 0x002f, blocks: (B:103:0x0013, B:106:0x0018, B:108:0x001c, B:110:0x0029, B:9:0x003f, B:11:0x0049, B:13:0x004c, B:15:0x0050, B:17:0x0060, B:19:0x0063, B:23:0x0070, B:26:0x0078, B:31:0x009e, B:56:0x00ac, B:60:0x00b8, B:61:0x00c2, B:43:0x00d8, B:46:0x00df, B:34:0x00e4, B:36:0x00ef, B:67:0x00f6, B:69:0x00fa, B:71:0x0100, B:73:0x0104, B:77:0x010e, B:80:0x011a, B:81:0x011f, B:83:0x0134, B:6:0x0034), top: B:102:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0134 A[Catch: all -> 0x002f, TRY_LEAVE, TryCatch #0 {all -> 0x002f, blocks: (B:103:0x0013, B:106:0x0018, B:108:0x001c, B:110:0x0029, B:9:0x003f, B:11:0x0049, B:13:0x004c, B:15:0x0050, B:17:0x0060, B:19:0x0063, B:23:0x0070, B:26:0x0078, B:31:0x009e, B:56:0x00ac, B:60:0x00b8, B:61:0x00c2, B:43:0x00d8, B:46:0x00df, B:34:0x00e4, B:36:0x00ef, B:67:0x00f6, B:69:0x00fa, B:71:0x0100, B:73:0x0104, B:77:0x010e, B:80:0x011a, B:81:0x011f, B:83:0x0134, B:6:0x0034), top: B:102:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x013f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.CharSequence F(java.lang.CharSequence r12, int r13, int r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.oa0.F(java.lang.CharSequence, int, int, boolean):java.lang.CharSequence");
    }

    public final void G(android.view.inputmethod.EditorInfo editorInfo) {
        android.os.Bundle bundle = editorInfo.extras;
        a.u01 u01Var = (a.u01) this.f.c;
        int a2 = u01Var.a(4);
        bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", a2 != 0 ? u01Var.b.getInt(a2 + u01Var.f295a) : 0);
        android.os.Bundle bundle2 = editorInfo.extras;
        ((a.ta0) this.d).getClass();
        bundle2.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
    }
}
