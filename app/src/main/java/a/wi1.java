package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class wi1 extends a.vi1 {
    public static java.lang.Integer c2(java.lang.String str) {
        boolean z;
        int i;
        int i2;
        a.wv.w(str, "<this>");
        a.wv.x(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i3 = 0;
        char charAt = str.charAt(0);
        int i4 = -2147483647;
        if (a.wv.C(charAt, 48) < 0) {
            i = 1;
            if (length == 1) {
                return null;
            }
            if (charAt == '-') {
                i4 = Integer.MIN_VALUE;
                z = true;
            } else {
                if (charAt != '+') {
                    return null;
                }
                z = false;
            }
        } else {
            z = false;
            i = 0;
        }
        int i5 = -59652323;
        while (i < length) {
            int digit = java.lang.Character.digit((int) str.charAt(i), 10);
            if (digit < 0) {
                return null;
            }
            if ((i3 < i5 && (i5 != -59652323 || i3 < (i5 = i4 / 10))) || (i2 = i3 * 10) < i4 + digit) {
                return null;
            }
            i3 = i2 - digit;
            i++;
        }
        return z ? java.lang.Integer.valueOf(i3) : java.lang.Integer.valueOf(-i3);
    }

    public static java.lang.Long d2(java.lang.String str) {
        boolean z;
        a.wv.w(str, "<this>");
        a.wv.x(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i = 0;
        char charAt = str.charAt(0);
        long j = -9223372036854775807L;
        if (a.wv.C(charAt, 48) < 0) {
            z = true;
            if (length == 1) {
                return null;
            }
            if (charAt == '-') {
                j = Long.MIN_VALUE;
                i = 1;
            } else {
                if (charAt != '+') {
                    return null;
                }
                z = false;
                i = 1;
            }
        } else {
            z = false;
        }
        long j2 = -256204778801521550L;
        long j3 = 0;
        long j4 = -256204778801521550L;
        while (i < length) {
            int digit = java.lang.Character.digit((int) str.charAt(i), 10);
            if (digit < 0) {
                return null;
            }
            if (j3 < j4) {
                if (j4 != j2) {
                    return null;
                }
                j4 = j / 10;
                if (j3 < j4) {
                    return null;
                }
            }
            long j5 = j3 * 10;
            long j6 = digit;
            if (j5 < j + j6) {
                return null;
            }
            j3 = j5 - j6;
            i++;
            j2 = -256204778801521550L;
        }
        return z ? java.lang.Long.valueOf(j3) : java.lang.Long.valueOf(-j3);
    }
}
