package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class yi1 extends a.wi1 {
    public static boolean A2(java.lang.CharSequence charSequence, java.lang.String str) {
        return charSequence instanceof java.lang.String ? B2((java.lang.String) charSequence, str) : u2(charSequence, 0, str, 0, str.length(), false);
    }

    public static boolean B2(java.lang.String str, java.lang.String str2) {
        a.wv.w(str, "<this>");
        a.wv.w(str2, "prefix");
        return str.startsWith(str2);
    }

    public static final java.lang.String C2(java.lang.CharSequence charSequence, a.ss0 ss0Var) {
        a.wv.w(charSequence, "<this>");
        a.wv.w(ss0Var, "range");
        return charSequence.subSequence(java.lang.Integer.valueOf(ss0Var.c).intValue(), java.lang.Integer.valueOf(ss0Var.d).intValue() + 1).toString();
    }

    public static java.lang.String D2(java.lang.String str, char c, java.lang.String str2) {
        a.wv.w(str, "<this>");
        a.wv.w(str2, "missingDelimiterValue");
        int p2 = p2(str, c);
        if (p2 == -1) {
            return str2;
        }
        java.lang.String substring = str.substring(p2 + 1, str.length());
        a.wv.v(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static java.lang.String E2(java.lang.String str, java.lang.String str2) {
        int m2 = m2(str, str2, 0, false, 6);
        if (m2 == -1) {
            return str;
        }
        java.lang.String substring = str.substring(0, m2);
        a.wv.v(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static java.lang.CharSequence F2(java.lang.CharSequence charSequence) {
        a.wv.w(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean L0 = a.wv.L0(charSequence.charAt(!z ? i : length));
            if (z) {
                if (!L0) {
                    break;
                }
                length--;
            } else if (L0) {
                i++;
            } else {
                z = true;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }

    public static java.lang.CharSequence G2(java.lang.String str) {
        a.wv.w(str, "<this>");
        int length = str.length() - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                if (!a.wv.L0(str.charAt(length))) {
                    return str.subSequence(0, length + 1);
                }
                if (i < 0) {
                    break;
                }
                length = i;
            }
        }
        return "";
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
    
        if (r1 >= 0) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0026, code lost:
    
        r7 = r7.subSequence(0, r0 + 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001c, code lost:
    
        if (r5 < 0) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String H2(java.lang.String r7, char... r8) {
        /*
            java.lang.String r0 = "<this>"
            a.wv.w(r7, r0)
            int r0 = r7.length()
            int r0 = r0 + (-1)
            if (r0 < 0) goto L2d
        Ld:
            int r1 = r0 + (-1)
            char r2 = r7.charAt(r0)
            int r3 = r8.length
            r4 = 0
            r5 = r4
        L16:
            if (r5 >= r3) goto L26
            char r6 = r8[r5]
            if (r2 != r6) goto L23
            if (r5 < 0) goto L26
            if (r1 >= 0) goto L21
            goto L2d
        L21:
            r0 = r1
            goto Ld
        L23:
            int r5 = r5 + 1
            goto L16
        L26:
            int r0 = r0 + 1
            java.lang.CharSequence r7 = r7.subSequence(r4, r0)
            goto L2f
        L2d:
            java.lang.String r7 = ""
        L2f:
            java.lang.String r7 = r7.toString()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: a.yi1.H2(java.lang.String, char[]):java.lang.String");
    }

    public static int e2(java.lang.String str, java.lang.String str2) {
        a.wv.w(str, "<this>");
        a.wv.w(str2, "other");
        return str.compareToIgnoreCase(str2);
    }

    public static boolean f2(java.lang.CharSequence charSequence, char c) {
        a.wv.w(charSequence, "<this>");
        return l2(charSequence, c, false, 2) >= 0;
    }

    public static boolean g2(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2) {
        a.wv.w(charSequence, "<this>");
        a.wv.w(charSequence2, "other");
        if (charSequence2 instanceof java.lang.String) {
            if (m2(charSequence, (java.lang.String) charSequence2, 0, false, 2) < 0) {
                return false;
            }
        } else if (k2(charSequence, charSequence2, 0, charSequence.length(), false, false) < 0) {
            return false;
        }
        return true;
    }

    public static boolean h2(java.lang.String str, java.lang.String str2, boolean z) {
        a.wv.w(str, "<this>");
        return !z ? str.endsWith(str2) : t2(str.length() - str2.length(), 0, str2.length(), str, str2, true);
    }

    public static final int i2(java.lang.CharSequence charSequence) {
        a.wv.w(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final int j2(int i, java.lang.CharSequence charSequence, java.lang.String str, boolean z) {
        a.wv.w(charSequence, "<this>");
        a.wv.w(str, "string");
        return (z || !(charSequence instanceof java.lang.String)) ? k2(charSequence, str, i, charSequence.length(), z, false) : ((java.lang.String) charSequence).indexOf(str, i);
    }

    public static final int k2(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        a.qs0 qs0Var;
        if (z2) {
            int i22 = i2(charSequence);
            if (i > i22) {
                i = i22;
            }
            if (i2 < 0) {
                i2 = 0;
            }
            qs0Var = new a.qs0(i, i2, -1);
        } else {
            if (i < 0) {
                i = 0;
            }
            int length = charSequence.length();
            if (i2 > length) {
                i2 = length;
            }
            qs0Var = new a.qs0(i, i2, 1);
        }
        boolean z3 = charSequence instanceof java.lang.String;
        int i3 = qs0Var.e;
        int i4 = qs0Var.d;
        int i5 = qs0Var.c;
        if (z3 && (charSequence2 instanceof java.lang.String)) {
            if ((i3 > 0 && i5 <= i4) || (i3 < 0 && i4 <= i5)) {
                while (!t2(0, i5, charSequence2.length(), (java.lang.String) charSequence2, (java.lang.String) charSequence, z)) {
                    if (i5 != i4) {
                        i5 += i3;
                    }
                }
                return i5;
            }
        } else if ((i3 > 0 && i5 <= i4) || (i3 < 0 && i4 <= i5)) {
            while (!u2(charSequence2, 0, charSequence, i5, charSequence2.length(), z)) {
                if (i5 != i4) {
                    i5 += i3;
                }
            }
            return i5;
        }
        return -1;
    }

    public static int l2(java.lang.CharSequence charSequence, char c, boolean z, int i) {
        if ((i & 4) != 0) {
            z = false;
        }
        a.wv.w(charSequence, "<this>");
        return (z || !(charSequence instanceof java.lang.String)) ? n2(0, charSequence, z, new char[]{c}) : ((java.lang.String) charSequence).indexOf(c, 0);
    }

    public static /* synthetic */ int m2(java.lang.CharSequence charSequence, java.lang.String str, int i, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return j2(i, charSequence, str, z);
    }

    public static final int n2(int i, java.lang.CharSequence charSequence, boolean z, char[] cArr) {
        a.wv.w(charSequence, "<this>");
        a.wv.w(cArr, "chars");
        if (!z && cArr.length == 1 && (charSequence instanceof java.lang.String)) {
            return ((java.lang.String) charSequence).indexOf(a.op.S1(cArr), i);
        }
        if (i < 0) {
            i = 0;
        }
        a.rs0 it = new a.qs0(i, i2(charSequence), 1).iterator();
        while (it.e) {
            int b = it.b();
            char charAt = charSequence.charAt(b);
            for (char c : cArr) {
                if (a.wv.U(c, charAt, z)) {
                    return b;
                }
            }
        }
        return -1;
    }

    public static boolean o2(java.lang.CharSequence charSequence) {
        a.wv.w(charSequence, "<this>");
        if (charSequence.length() == 0) {
            return true;
        }
        java.lang.Iterable qs0Var = new a.qs0(0, charSequence.length() - 1, 1);
        if ((qs0Var instanceof java.util.Collection) && ((java.util.Collection) qs0Var).isEmpty()) {
            return true;
        }
        java.util.Iterator it = qs0Var.iterator();
        while (it.hasNext()) {
            if (!a.wv.L0(charSequence.charAt(((a.rs0) it).b()))) {
                return false;
            }
        }
        return true;
    }

    public static int p2(java.lang.CharSequence charSequence, char c) {
        int i2 = i2(charSequence);
        a.wv.w(charSequence, "<this>");
        if (charSequence instanceof java.lang.String) {
            return ((java.lang.String) charSequence).lastIndexOf(c, i2);
        }
        char[] cArr = {c};
        if (charSequence instanceof java.lang.String) {
            return ((java.lang.String) charSequence).lastIndexOf(a.op.S1(cArr), i2);
        }
        int i22 = i2(charSequence);
        if (i2 > i22) {
            i2 = i22;
        }
        while (-1 < i2) {
            if (a.wv.U(cArr[0], charSequence.charAt(i2), false)) {
                return i2;
            }
            i2--;
        }
        return -1;
    }

    public static int q2(java.lang.CharSequence charSequence, java.lang.String str, int i) {
        int i2 = (i & 2) != 0 ? i2(charSequence) : 0;
        a.wv.w(charSequence, "<this>");
        a.wv.w(str, "string");
        return !(charSequence instanceof java.lang.String) ? k2(charSequence, str, i2, 0, false, true) : ((java.lang.String) charSequence).lastIndexOf(str, i2);
    }

    public static java.lang.String r2(java.lang.String str, int i) {
        java.lang.CharSequence charSequence;
        a.wv.w(str, "<this>");
        if (i < 0) {
            throw new java.lang.IllegalArgumentException(a.ai1.e("Desired length ", i, " is less than zero."));
        }
        if (i <= str.length()) {
            charSequence = str.subSequence(0, str.length());
        } else {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(i);
            sb.append((java.lang.CharSequence) str);
            a.rs0 it = new a.qs0(1, i - str.length(), 1).iterator();
            while (it.e) {
                it.b();
                sb.append(' ');
            }
            charSequence = sb;
        }
        return charSequence.toString();
    }

    public static a.h30 s2(java.lang.CharSequence charSequence, java.lang.String[] strArr, boolean z, int i) {
        w2(i);
        return new a.h30(charSequence, 0, i, new a.xi1(a.op.I1(strArr), z, 1));
    }

    public static final boolean t2(int i, int i2, int i3, java.lang.String str, java.lang.String str2, boolean z) {
        a.wv.w(str, "<this>");
        a.wv.w(str2, "other");
        return !z ? str.regionMatches(i, str2, i2, i3) : str.regionMatches(z, i, str2, i2, i3);
    }

    public static final boolean u2(java.lang.CharSequence charSequence, int i, java.lang.CharSequence charSequence2, int i2, int i3, boolean z) {
        a.wv.w(charSequence, "<this>");
        a.wv.w(charSequence2, "other");
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!a.wv.U(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    public static java.lang.String v2(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        a.wv.w(str, "<this>");
        a.wv.w(str2, "oldValue");
        a.wv.w(str3, "newValue");
        int j2 = j2(0, str, str2, false);
        if (j2 < 0) {
            return str;
        }
        int length = str2.length();
        int i = length >= 1 ? length : 1;
        int length2 = str3.length() + (str.length() - length);
        if (length2 < 0) {
            throw new java.lang.OutOfMemoryError();
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length2);
        int i2 = 0;
        do {
            sb.append((java.lang.CharSequence) str, i2, j2);
            sb.append(str3);
            i2 = j2 + length;
            if (j2 >= str.length()) {
                break;
            }
            j2 = j2(j2 + i, str, str2, false);
        } while (j2 > 0);
        sb.append((java.lang.CharSequence) str, i2, str.length());
        java.lang.String sb2 = sb.toString();
        a.wv.v(sb2, "stringBuilder.append(this, i, length).toString()");
        return sb2;
    }

    public static final void w2(int i) {
        if (i < 0) {
            throw new java.lang.IllegalArgumentException(a.ii1.d("Limit must be non-negative, but was ", i).toString());
        }
    }

    public static final java.util.List x2(int i, java.lang.CharSequence charSequence, java.lang.String str, boolean z) {
        w2(i);
        int i2 = 0;
        int j2 = j2(0, charSequence, str, z);
        if (j2 == -1 || i == 1) {
            return a.b20.y0(charSequence.toString());
        }
        boolean z2 = i > 0;
        int i3 = 10;
        if (z2 && i <= 10) {
            i3 = i;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(i3);
        do {
            arrayList.add(charSequence.subSequence(i2, j2).toString());
            i2 = str.length() + j2;
            if (z2 && arrayList.size() == i - 1) {
                break;
            }
            j2 = j2(i2, charSequence, str, z);
        } while (j2 != -1);
        arrayList.add(charSequence.subSequence(i2, charSequence.length()).toString());
        return arrayList;
    }

    public static java.util.List y2(java.lang.CharSequence charSequence, java.lang.String[] strArr) {
        a.wv.w(charSequence, "<this>");
        if (strArr.length == 1) {
            java.lang.String str = strArr[0];
            if (str.length() != 0) {
                return x2(0, charSequence, str, false);
            }
        }
        a.ds0 ds0Var = new a.ds0(s2(charSequence, strArr, false, 0));
        java.util.ArrayList arrayList = new java.util.ArrayList(a.op.J1(ds0Var, 10));
        java.util.Iterator it = ds0Var.iterator();
        while (it.hasNext()) {
            arrayList.add(C2(charSequence, (a.ss0) it.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static java.util.List z2(java.lang.String str, char[] cArr) {
        a.wv.w(str, "<this>");
        boolean z = false;
        java.lang.Object[] objArr = (Object[]) 0;
        if (cArr.length == 1) {
            return x2(0, str, java.lang.String.valueOf(cArr[0]), false);
        }
        w2(0);
        a.ds0 ds0Var = new a.ds0(new a.h30(str, 0, 0, new a.xi1(cArr, z, objArr == true ? 1 : 0)));
        java.util.ArrayList arrayList = new java.util.ArrayList(a.op.J1(ds0Var, 10));
        java.util.Iterator it = ds0Var.iterator();
        while (it.hasNext()) {
            arrayList.add(C2(str, (a.ss0) it.next()));
        }
        return arrayList;
    }
}
