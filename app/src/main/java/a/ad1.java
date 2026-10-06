package a;

import android.util.Size;
import android.util.SizeF;
import android.os.Bundle;
import android.os.Parcelable;
/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ad1 {
    public static final java.lang.Class[] f = {java.lang.Boolean.TYPE, boolean[].class, java.lang.Double.TYPE, double[].class, java.lang.Integer.TYPE, int[].class, java.lang.Long.TYPE, long[].class, java.lang.String.class, java.lang.String[].class, android.os.Binder.class, android.os.Bundle.class, java.lang.Byte.TYPE, byte[].class, java.lang.Character.TYPE, char[].class, java.lang.CharSequence.class, java.lang.CharSequence[].class, java.util.ArrayList.class, java.lang.Float.TYPE, float[].class, android.os.Parcelable.class, android.os.Parcelable[].class, java.io.Serializable.class, java.lang.Short.TYPE, short[].class, android.util.SparseArray.class, android.util.Size.class, android.util.SizeF.class};

    /* renamed from: a, reason: collision with root package name */
    public final java.util.LinkedHashMap f7a;
    public final java.util.LinkedHashMap b;
    public final java.util.LinkedHashMap c;
    public final java.util.LinkedHashMap d;
    public final a.zc1 e;

    public ad1(java.util.HashMap hashMap) {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        this.f7a = linkedHashMap;
        this.b = new java.util.LinkedHashMap();
        this.c = new java.util.LinkedHashMap();
        this.d = new java.util.LinkedHashMap();
        this.e = new a.zc1(0, this);
        linkedHashMap.putAll(hashMap);
    }

    public static android.os.Bundle a(a.ad1 ad1Var) {
        a.wv.w(ad1Var, "this$0");
        java.util.LinkedHashMap linkedHashMap = ad1Var.b;
        a.wv.w(linkedHashMap, "<this>");
        int size = linkedHashMap.size();
        java.util.Iterator it = (size != 0 ? size != 1 ? new java.util.LinkedHashMap(linkedHashMap) : a.b20.y1(linkedHashMap) : a.rb0.c).entrySet().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            java.util.LinkedHashMap linkedHashMap2 = ad1Var.f7a;
            int i = 0;
            if (!hasNext) {
                java.util.Set<java.lang.String> keySet = linkedHashMap2.keySet();
                java.util.ArrayList arrayList = new java.util.ArrayList(keySet.size());
                java.util.ArrayList arrayList2 = new java.util.ArrayList(arrayList.size());
                for (java.lang.String str : keySet) {
                    arrayList.add(str);
                    arrayList2.add(linkedHashMap2.get(str));
                }
                a.y31[] y31VarArr = {new a.y31("keys", arrayList), new a.y31("values", arrayList2)};
                android.os.Bundle bundle = new android.os.Bundle(2);
                while (i < 2) {
                    a.y31 y31Var = y31VarArr[i];
                    java.lang.String str2 = (java.lang.String) y31Var.c;
                    java.lang.Object obj = y31Var.d;
                    if (obj == null) {
                        bundle.putString(str2, null);
                    } else if (obj instanceof java.lang.Boolean) {
                        bundle.putBoolean(str2, ((java.lang.Boolean) obj).booleanValue());
                    } else if (obj instanceof java.lang.Byte) {
                        bundle.putByte(str2, ((java.lang.Number) obj).byteValue());
                    } else if (obj instanceof java.lang.Character) {
                        bundle.putChar(str2, ((java.lang.Character) obj).charValue());
                    } else if (obj instanceof java.lang.Double) {
                        bundle.putDouble(str2, ((java.lang.Number) obj).doubleValue());
                    } else if (obj instanceof java.lang.Float) {
                        bundle.putFloat(str2, ((java.lang.Number) obj).floatValue());
                    } else if (obj instanceof java.lang.Integer) {
                        bundle.putInt(str2, ((java.lang.Number) obj).intValue());
                    } else if (obj instanceof java.lang.Long) {
                        bundle.putLong(str2, ((java.lang.Number) obj).longValue());
                    } else if (obj instanceof java.lang.Short) {
                        bundle.putShort(str2, ((java.lang.Number) obj).shortValue());
                    } else if (obj instanceof android.os.Bundle) {
                        bundle.putBundle(str2, (android.os.Bundle) obj);
                    } else if (obj instanceof java.lang.CharSequence) {
                        bundle.putCharSequence(str2, (java.lang.CharSequence) obj);
                    } else if (obj instanceof android.os.Parcelable) {
                        bundle.putParcelable(str2, (android.os.Parcelable) obj);
                    } else if (obj instanceof boolean[]) {
                        bundle.putBooleanArray(str2, (boolean[]) obj);
                    } else if (obj instanceof byte[]) {
                        bundle.putByteArray(str2, (byte[]) obj);
                    } else if (obj instanceof char[]) {
                        bundle.putCharArray(str2, (char[]) obj);
                    } else if (obj instanceof double[]) {
                        bundle.putDoubleArray(str2, (double[]) obj);
                    } else if (obj instanceof float[]) {
                        bundle.putFloatArray(str2, (float[]) obj);
                    } else if (obj instanceof int[]) {
                        bundle.putIntArray(str2, (int[]) obj);
                    } else if (obj instanceof long[]) {
                        bundle.putLongArray(str2, (long[]) obj);
                    } else if (obj instanceof short[]) {
                        bundle.putShortArray(str2, (short[]) obj);
                    } else if (obj instanceof java.lang.Object[]) {
                        java.lang.Class<?> componentType = obj.getClass().getComponentType();
                        a.wv.s(componentType);
                        if (android.os.Parcelable.class.isAssignableFrom(componentType)) {
                            bundle.putParcelableArray(str2, (android.os.Parcelable[]) obj);
                        } else if (java.lang.String.class.isAssignableFrom(componentType)) {
                            bundle.putStringArray(str2, (java.lang.String[]) obj);
                        } else if (java.lang.CharSequence.class.isAssignableFrom(componentType)) {
                            bundle.putCharSequenceArray(str2, (java.lang.CharSequence[]) obj);
                        } else {
                            if (!java.io.Serializable.class.isAssignableFrom(componentType)) {
                                throw new java.lang.IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str2 + '\"');
                            }
                            bundle.putSerializable(str2, (java.io.Serializable) obj);
                        }
                    } else if (obj instanceof java.io.Serializable) {
                        bundle.putSerializable(str2, (java.io.Serializable) obj);
                    } else if (obj instanceof android.os.IBinder) {
                        a.fs.a(bundle, str2, (android.os.IBinder) obj);
                    } else if (obj instanceof android.util.Size) {
                        a.gs.a(bundle, str2, (android.util.Size) obj);
                    } else {
                        if (!(obj instanceof android.util.SizeF)) {
                            throw new java.lang.IllegalArgumentException("Illegal value type " + obj.getClass().getCanonicalName() + " for key \"" + str2 + '\"');
                        }
                        a.gs.b(bundle, str2, (android.util.SizeF) obj);
                    }
                    i++;
                }
                return bundle;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            java.lang.String str3 = (java.lang.String) entry.getKey();
            android.os.Bundle a2 = ((a.hd1) entry.getValue()).a();
            a.wv.w(str3, "key");
            if (a2 != null) {
                java.lang.Class[] clsArr = f;
                while (i < 29) {
                    java.lang.Class cls = clsArr[i];
                    a.wv.s(cls);
                    if (!cls.isInstance(a2)) {
                        i++;
                    }
                }
                throw new java.lang.IllegalArgumentException("Can't put value with type " + a2.getClass() + " into saved state");
            }
            java.lang.Object obj2 = ad1Var.c.get(str3);
            androidx.lifecycle.b bVar = obj2 instanceof androidx.lifecycle.b ? (androidx.lifecycle.b) obj2 : null;
            if (bVar != null) {
                bVar.e(a2);
            } else {
                linkedHashMap2.put(str3, a2);
            }
            a.ai1.t(ad1Var.d.get(str3));
        }
    }

    public ad1() {
        this.f7a = new java.util.LinkedHashMap();
        this.b = new java.util.LinkedHashMap();
        this.c = new java.util.LinkedHashMap();
        this.d = new java.util.LinkedHashMap();
        this.e = new a.zc1(1, this);
    }
}
