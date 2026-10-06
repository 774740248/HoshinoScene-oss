package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class op extends a.b20 {
    public static java.util.List I1(java.lang.Object[] objArr) {
        a.wv.w(objArr, "<this>");
        java.util.List asList = java.util.Arrays.asList(objArr);
        a.wv.v(asList, "asList(this)");
        return asList;
    }

    public static int J1(java.lang.Iterable iterable, int i) {
        a.wv.w(iterable, "<this>");
        return iterable instanceof java.util.Collection ? ((java.util.Collection) iterable).size() : i;
    }

    public static boolean K1(java.lang.Object[] objArr, java.lang.Object obj) {
        a.wv.w(objArr, "<this>");
        return O1(objArr, obj) >= 0;
    }

    public static final void L1(java.lang.Object[] objArr, java.lang.Object[] objArr2, int i, int i2, int i3) {
        a.wv.w(objArr, "<this>");
        a.wv.w(objArr2, "destination");
        java.lang.System.arraycopy(objArr, i2, objArr2, i, i3 - i2);
    }

    public static final java.lang.Object[] M1(int i, int i2, java.lang.Object[] objArr) {
        int length = objArr.length;
        if (i2 <= length) {
            java.lang.Object[] copyOfRange = java.util.Arrays.copyOfRange(objArr, i, i2);
            a.wv.v(copyOfRange, "copyOfRange(this, fromIndex, toIndex)");
            return copyOfRange;
        }
        throw new java.lang.IndexOutOfBoundsException("toIndex (" + i2 + ") is greater than size (" + length + ").");
    }

    public static java.lang.Object N1(java.lang.Object[] objArr) {
        a.wv.w(objArr, "<this>");
        if (objArr.length != 0) {
            return objArr[0];
        }
        throw new java.util.NoSuchElementException("Array is empty.");
    }

    public static int O1(java.lang.Object[] objArr, java.lang.Object obj) {
        a.wv.w(objArr, "<this>");
        int i = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i < length) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i < length2) {
            if (a.wv.e(obj, objArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static java.lang.String P1(java.lang.Object[] objArr, java.lang.String str) {
        a.wv.w(objArr, "<this>");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append((java.lang.CharSequence) "");
        int i = 0;
        for (java.lang.Object obj : objArr) {
            i++;
            if (i > 1) {
                sb.append((java.lang.CharSequence) str);
            }
            a.wv.c(sb, obj, null);
        }
        sb.append((java.lang.CharSequence) "");
        java.lang.String sb2 = sb.toString();
        a.wv.v(sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb2;
    }

    public static java.lang.Object Q1(java.lang.Object[] objArr) {
        if (objArr.length != 0) {
            return objArr[objArr.length - 1];
        }
        throw new java.util.NoSuchElementException("Array is empty.");
    }

    public static final void R1(java.util.HashMap hashMap, a.y31[] y31VarArr) {
        for (a.y31 y31Var : y31VarArr) {
            hashMap.put(y31Var.c, y31Var.d);
        }
    }

    public static char S1(char[] cArr) {
        a.wv.w(cArr, "<this>");
        int length = cArr.length;
        if (length == 0) {
            throw new java.util.NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return cArr[0];
        }
        throw new java.lang.IllegalArgumentException("Array has more than one element.");
    }

    public static java.lang.Object[] T1(java.lang.Object[] objArr, a.ss0 ss0Var) {
        return ss0Var.isEmpty() ? M1(0, 0, objArr) : M1(java.lang.Integer.valueOf(ss0Var.c).intValue(), java.lang.Integer.valueOf(ss0Var.d).intValue() + 1, objArr);
    }

    public static void U1(java.lang.Object[] objArr, java.util.Comparator comparator) {
        a.wv.w(objArr, "<this>");
        if (objArr.length > 1) {
            java.util.Arrays.sort(objArr, comparator);
        }
    }

    public static final void V1(java.util.HashSet hashSet, java.lang.Object[] objArr) {
        for (java.lang.Object obj : objArr) {
            hashSet.add(obj);
        }
    }

    public static java.util.List W1(java.lang.Object[] objArr) {
        a.wv.w(objArr, "<this>");
        int length = objArr.length;
        return length != 0 ? length != 1 ? new java.util.ArrayList(new a.fp(objArr, false)) : a.b20.y0(objArr[0]) : a.qb0.c;
    }

    public static java.util.Map X1(java.util.ArrayList arrayList) {
        a.rb0 rb0Var = a.rb0.c;
        int size = arrayList.size();
        if (size == 0) {
            return rb0Var;
        }
        if (size != 1) {
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(a.b20.B0(arrayList.size()));
            Y1(arrayList, linkedHashMap);
            return linkedHashMap;
        }
        a.y31 y31Var = (a.y31) arrayList.get(0);
        a.wv.w(y31Var, "pair");
        java.util.Map singletonMap = java.util.Collections.singletonMap(y31Var.c, y31Var.d);
        a.wv.v(singletonMap, "singletonMap(pair.first, pair.second)");
        return singletonMap;
    }

    public static final void Y1(java.util.ArrayList arrayList, java.util.LinkedHashMap linkedHashMap) {
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            a.y31 y31Var = (a.y31) it.next();
            linkedHashMap.put(y31Var.c, y31Var.d);
        }
    }
}
