package a;

import java.util.List;
import java.util.Collection;
/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class qv extends a.pv {
    public static double b2(java.util.ArrayList arrayList) {
        a.wv.w(arrayList, "<this>");
        java.util.Iterator it = arrayList.iterator();
        double d = 0.0d;
        int i = 0;
        while (it.hasNext()) {
            d += ((java.lang.Number) it.next()).doubleValue();
            i++;
            if (i < 0) {
                throw new java.lang.ArithmeticException("Count overflow has happened.");
            }
        }
        if (i == 0) {
            return Double.NaN;
        }
        return d / i;
    }

    public static double c2(java.util.ArrayList arrayList) {
        java.util.Iterator it = arrayList.iterator();
        double d = 0.0d;
        int i = 0;
        while (it.hasNext()) {
            d += ((java.lang.Number) it.next()).intValue();
            i++;
            if (i < 0) {
                throw new java.lang.ArithmeticException("Count overflow has happened.");
            }
        }
        if (i == 0) {
            return Double.NaN;
        }
        return d / i;
    }

    public static boolean d2(java.lang.Iterable iterable, java.lang.Object obj) {
        int i;
        a.wv.w(iterable, "<this>");
        if (iterable instanceof java.util.Collection) {
            return ((java.util.Collection) iterable).contains(obj);
        }
        if (!(iterable instanceof java.util.List)) {
            int i2 = 0;
            for (java.lang.Object obj2 : iterable) {
                if (i2 < 0) {
                    a.b20.p1();
                    throw null;
                }
                if (a.wv.e(obj, obj2)) {
                    i = i2;
                } else {
                    i2++;
                }
            }
            return false;
        }
        i = ((java.util.List) iterable).indexOf(obj);
        return i >= 0;
    }

    public static java.lang.Object e2(java.util.List list) {
        a.wv.w(list, "<this>");
        if (list.isEmpty()) {
            throw new java.util.NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static java.lang.Object f2(a.iy0 iy0Var) {
        if ((List) iy0Var instanceof java.util.List) {
            java.util.List list = (java.util.List) iy0Var;
            if (list.isEmpty()) {
                return null;
            }
            return list.get(0);
        }
        java.util.Iterator it = iy0Var.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static java.lang.Object g2(java.util.List list) {
        a.wv.w(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static java.lang.Object h2(java.util.List list, int i) {
        a.wv.w(list, "<this>");
        if (i < 0 || i > a.b20.d0(list)) {
            return null;
        }
        return list.get(i);
    }

    public static final void i2(java.lang.Iterable iterable, java.lang.StringBuilder sb, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, java.lang.CharSequence charSequence3, int i, java.lang.CharSequence charSequence4, a.bp0 bp0Var) {
        a.wv.w(iterable, "<this>");
        a.wv.w(charSequence, "separator");
        a.wv.w(charSequence2, "prefix");
        a.wv.w(charSequence3, "postfix");
        a.wv.w(charSequence4, "truncated");
        sb.append(charSequence2);
        int i2 = 0;
        for (java.lang.Object obj : iterable) {
            i2++;
            if (i2 > 1) {
                sb.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            } else {
                a.wv.c(sb, obj, bp0Var);
            }
        }
        if (i >= 0 && i2 > i) {
            sb.append(charSequence4);
        }
        sb.append(charSequence3);
    }

    public static java.lang.String j2(java.lang.Iterable iterable, java.lang.String str, java.lang.String str2, java.lang.String str3, a.bp0 bp0Var, int i) {
        if ((i & 1) != 0) {
            str = ", ";
        }
        java.lang.String str4 = str;
        java.lang.String str5 = (i & 2) != 0 ? "" : str2;
        java.lang.String str6 = (i & 4) != 0 ? "" : str3;
        int i2 = (i & 8) != 0 ? -1 : 0;
        java.lang.CharSequence charSequence = (i & 16) != 0 ? "..." : null;
        a.bp0 bp0Var2 = (i & 32) != 0 ? null : bp0Var;
        a.wv.w(iterable, "<this>");
        a.wv.w(str4, "separator");
        a.wv.w(str5, "prefix");
        a.wv.w(str6, "postfix");
        a.wv.w(charSequence, "truncated");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        i2(iterable, sb, str4, str5, str6, i2, charSequence, bp0Var2);
        java.lang.String sb2 = sb.toString();
        a.wv.v(sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb2;
    }

    public static java.lang.Object k2(java.util.Collection collection) {
        if (collection instanceof java.util.List) {
            return l2((java.util.List) collection);
        }
        java.util.Iterator it = collection.iterator();
        if (!it.hasNext()) {
            throw new java.util.NoSuchElementException("Collection is empty.");
        }
        java.lang.Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static java.lang.Object l2(java.util.List list) {
        a.wv.w(list, "<this>");
        if (list.isEmpty()) {
            throw new java.util.NoSuchElementException("List is empty.");
        }
        return list.get(a.b20.d0(list));
    }

    public static java.lang.Object m2(java.util.List list) {
        a.wv.w(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static java.lang.Comparable n2(java.util.List list) {
        java.util.Iterator it = list.iterator();
        if (!it.hasNext()) {
            return null;
        }
        java.lang.Comparable comparable = (java.lang.Comparable) it.next();
        while (it.hasNext()) {
            java.lang.Comparable comparable2 = (java.lang.Comparable) it.next();
            if (comparable.compareTo(comparable2) < 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static java.lang.Double o2(java.util.List list) {
        java.util.Iterator it = list.iterator();
        if (!it.hasNext()) {
            return null;
        }
        double doubleValue = ((java.lang.Number) it.next()).doubleValue();
        while (it.hasNext()) {
            doubleValue = java.lang.Math.max(doubleValue, ((java.lang.Number) it.next()).doubleValue());
        }
        return java.lang.Double.valueOf(doubleValue);
    }

    public static java.lang.Float p2(java.util.ArrayList arrayList) {
        java.util.Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float floatValue = ((java.lang.Number) it.next()).floatValue();
        while (it.hasNext()) {
            floatValue = java.lang.Math.max(floatValue, ((java.lang.Number) it.next()).floatValue());
        }
        return java.lang.Float.valueOf(floatValue);
    }

    public static java.lang.Comparable q2(java.util.ArrayList arrayList) {
        java.util.Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            return null;
        }
        java.lang.Comparable comparable = (java.lang.Comparable) it.next();
        while (it.hasNext()) {
            java.lang.Comparable comparable2 = (java.lang.Comparable) it.next();
            if (comparable.compareTo(comparable2) > 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static java.lang.Float r2(java.util.ArrayList arrayList) {
        java.util.Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float floatValue = ((java.lang.Number) it.next()).floatValue();
        while (it.hasNext()) {
            floatValue = java.lang.Math.min(floatValue, ((java.lang.Number) it.next()).floatValue());
        }
        return java.lang.Float.valueOf(floatValue);
    }

    public static java.util.List s2(java.lang.Iterable iterable, java.util.Comparator comparator) {
        java.util.ArrayList arrayList;
        a.wv.w(iterable, "<this>");
        boolean z = iterable instanceof java.util.Collection;
        if (z) {
            java.util.Collection collection = (java.util.Collection) iterable;
            if (collection.size() <= 1) {
                return w2(iterable);
            }
            java.lang.Object[] array = collection.toArray(new java.lang.Object[0]);
            a.op.U1(array, comparator);
            return a.op.I1(array);
        }
        if (z) {
            arrayList = x2((java.util.Collection) iterable);
        } else {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            v2(iterable, arrayList2);
            arrayList = arrayList2;
        }
        a.ov.Z1(arrayList, comparator);
        return arrayList;
    }

    public static java.util.List t2(java.util.List list, int i) {
        if (i < 0) {
            throw new java.lang.IllegalArgumentException(a.ai1.e("Requested element count ", i, " is less than zero.").toString());
        }
        if (i == 0) {
            return a.qb0.c;
        }
        if (i >= list.size()) {
            return w2(list);
        }
        if (i == 1) {
            return a.b20.y0(e2(list));
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(i);
        java.util.Iterator it = list.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i2++;
            if (i2 == i) {
                break;
            }
        }
        return a.b20.P0(arrayList);
    }

    public static boolean[] u2(java.util.ArrayList arrayList) {
        boolean[] zArr = new boolean[arrayList.size()];
        java.util.Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            zArr[i] = ((java.lang.Boolean) it.next()).booleanValue();
            i++;
        }
        return zArr;
    }

    public static void v2(java.lang.Iterable iterable, java.util.AbstractCollection abstractCollection) {
        a.wv.w(iterable, "<this>");
        java.util.Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static java.util.List w2(java.lang.Iterable iterable) {
        java.util.ArrayList arrayList;
        a.wv.w(iterable, "<this>");
        boolean z = iterable instanceof java.util.Collection;
        if (!z) {
            if (z) {
                arrayList = x2((java.util.Collection) iterable);
            } else {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                v2(iterable, arrayList2);
                arrayList = arrayList2;
            }
            return a.b20.P0(arrayList);
        }
        java.util.Collection collection = (java.util.Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return a.qb0.c;
        }
        if (size != 1) {
            return x2(collection);
        }
        return a.b20.y0(iterable instanceof java.util.List ? ((java.util.List) iterable).get(0) : iterable.iterator().next());
    }

    public static java.util.ArrayList x2(java.util.Collection collection) {
        a.wv.w(collection, "<this>");
        return new java.util.ArrayList(collection);
    }

    public static java.util.Set y2(java.util.ArrayList arrayList) {
        a.sb0 sb0Var = a.sb0.c;
        int size = arrayList.size();
        if (size == 0) {
            return sb0Var;
        }
        if (size != 1) {
            java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet(a.b20.B0(arrayList.size()));
            v2(arrayList, linkedHashSet);
            return linkedHashSet;
        }
        java.util.Set singleton = java.util.Collections.singleton(arrayList.get(0));
        a.wv.v(singleton, "singleton(element)");
        return singleton;
    }

    public static a.ds0 z2(java.lang.Iterable iterable) {
        a.wv.w(iterable, "<this>");
        return new a.ds0(new a.qf0(3, iterable));
    }
}
