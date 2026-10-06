package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class bv implements a.bu0, a.av {
    public static final java.util.Map b;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Class f54a;

    static {
        int i = 0;
        java.util.List z0 = a.b20.z0(a.qo0.class, a.bp0.class, a.fp0.class, a.gp0.class, a.hp0.class, a.ip0.class, a.jp0.class, a.kp0.class, a.lp0.class, a.mp0.class, a.ro0.class, a.so0.class, a.to0.class, a.uo0.class, a.vo0.class, a.wo0.class, a.xo0.class, a.yo0.class, a.zo0.class, a.ap0.class, a.cp0.class, a.dp0.class, a.ep0.class);
        java.util.ArrayList arrayList = new java.util.ArrayList(a.op.J1(z0, 10));
        for (java.lang.Object obj : z0) {
            int i2 = i + 1;
            if (i < 0) {
                a.b20.p1();
                throw null;
            }
            arrayList.add(new a.y31((java.lang.Class) obj, java.lang.Integer.valueOf(i)));
            i = i2;
        }
        b = a.op.X1(arrayList);
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        java.util.HashMap hashMap2 = new java.util.HashMap();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        java.util.HashMap hashMap3 = new java.util.HashMap();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(hashMap);
        hashMap3.putAll(hashMap2);
        java.util.Collection<java.lang.String> values = hashMap.values();
        a.wv.v(values, "primitiveFqNames.values");
        for (java.lang.String str : values) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("kotlin.jvm.internal.");
            a.wv.v(str, "kotlinName");
            sb.append(a.yi1.D2(str, '.', str));
            sb.append("CompanionObject");
            hashMap3.put(sb.toString(), str.concat(".Companion"));
        }
        for (java.util.Map.Entry entry : (Iterable<java.util.Map.Entry>) b.entrySet()) {
            java.lang.Class cls = (java.lang.Class) entry.getKey();
            int intValue = ((java.lang.Number) entry.getValue()).intValue();
            hashMap3.put(cls.getName(), "kotlin.Function" + intValue);
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(a.b20.B0(hashMap3.size()));
        for (java.util.Map.Entry entry2 : (Iterable<java.util.Map.Entry>) hashMap3.entrySet()) {
            java.lang.Object key = entry2.getKey();
            java.lang.String str2 = (java.lang.String) entry2.getValue();
            linkedHashMap.put(key, a.yi1.D2(str2, '.', str2));
        }
    }

    public bv(java.lang.Class cls) {
        a.wv.w(cls, "jClass");
        this.f54a = cls;
    }

    @Override // a.av
    public final java.lang.Class a() {
        return this.f54a;
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof a.bv) && a.wv.e(a.wv.h0(this), a.wv.h0((a.bu0) obj));
    }

    public final int hashCode() {
        return a.wv.h0(this).hashCode();
    }

    public final java.lang.String toString() {
        return this.f54a.toString() + " (Kotlin reflection is not available)";
    }
}
