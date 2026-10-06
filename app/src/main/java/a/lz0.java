package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class lz0 {

    public lz0() {
    }

    public static int a(java.lang.String str) {
        java.lang.String substring = str.substring(a.yi1.m2(str, ":", 0, false, 6) + 1, a.yi1.q2(str, " ", 6));
        a.wv.v(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        int length = substring.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean z2 = a.wv.C(substring.charAt(!z ? i : length), 32) <= 0;
            if (z) {
                if (!z2) {
                    break;
                }
                length--;
            } else if (z2) {
                i++;
            } else {
                z = true;
            }
        }
        return java.lang.Integer.parseInt(substring.subSequence(i, length + 1).toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x013a A[EDGE_INSN: B:48:0x013a->B:45:0x013a BREAK  A[LOOP:1: B:23:0x00d9->B:28:0x0137], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, a.jz0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(a.ey r8) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.lz0.b(a.ey):java.lang.Object");
    }
}
