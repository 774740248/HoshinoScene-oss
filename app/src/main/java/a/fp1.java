package a;

import androidx.versionedparcelable.VersionedParcel;
/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class fp1 {

    /* renamed from: a, reason: collision with root package name */
    public final a.kp f155a;
    public final a.kp b;
    public final a.kp c;

    public fp1(a.kp kpVar, a.kp kpVar2, a.kp kpVar3) {
        this.f155a = kpVar;
        this.b = kpVar2;
        this.c = kpVar3;
    }

    public abstract a.gp1 a();

    public final java.lang.Class b(java.lang.Class cls) {
        java.lang.String name = cls.getName();
        a.kp kpVar = this.c;
        java.lang.Class cls2 = (java.lang.Class) kpVar.getOrDefault(name, null);
        if (cls2 != null) {
            return cls2;
        }
        java.lang.Class<?> cls3 = java.lang.Class.forName(java.lang.String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
        kpVar.put(cls.getName(), cls3);
        return cls3;
    }

    public final java.lang.reflect.Method c(java.lang.String str) {
        a.kp kpVar = this.f155a;
        java.lang.reflect.Method method = (java.lang.reflect.Method) kpVar.getOrDefault(str, null);
        if (method != null) {
            return method;
        }
        java.lang.System.currentTimeMillis();
        java.lang.reflect.Method declaredMethod = java.lang.Class.forName(str, true, a.fp1.class.getClassLoader()).getDeclaredMethod("read", a.fp1.class);
        kpVar.put(str, declaredMethod);
        return declaredMethod;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.reflect.Method d(java.lang.Class cls) {
        java.lang.String name = cls.getName();
        a.kp kpVar = this.b;
        java.lang.reflect.Method method = (java.lang.reflect.Method) kpVar.getOrDefault(name, null);
        if (method != null) {
            return method;
        }
        java.lang.Class b = b(cls);
        java.lang.System.currentTimeMillis();
        java.lang.reflect.Method declaredMethod = b.getDeclaredMethod("write", cls, a.fp1.class);
        kpVar.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public abstract boolean e(int i);

    public final android.os.Parcelable f(android.os.Parcelable parcelable, int i) {
        if (!e(i)) {
            return parcelable;
        }
        return ((a.gp1) this).e.readParcelable(a.gp1.class.getClassLoader());
    }

    public final a.hp1 g() {
        java.lang.String readString = ((a.gp1) this).e.readString();
        if (readString == null) {
            return null;
        }
        try {
            return (a.hp1) c(readString).invoke(null, a());
        } catch (java.lang.ClassNotFoundException e) {
            throw new java.lang.RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
        } catch (java.lang.IllegalAccessException e2) {
            throw new java.lang.RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
        } catch (java.lang.NoSuchMethodException e3) {
            throw new java.lang.RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (java.lang.reflect.InvocationTargetException e4) {
            if (e4.getCause() instanceof java.lang.RuntimeException) {
                throw ((java.lang.RuntimeException) e4.getCause());
            }
            throw new java.lang.RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
        }
    }

    public abstract void h(int i);

    public final void i(a.hp1 hp1Var) {
        if (hp1Var == null) {
            ((a.gp1) this).e.writeString(null);
            return;
        }
        try {
            ((a.gp1) this).e.writeString(b(hp1Var.getClass()).getName());
            a.gp1 a2 = a();
            try {
                d(hp1Var.getClass()).invoke(null, hp1Var, a2);
                int i = a2.i;
                if (i >= 0) {
                    int i2 = a2.d.get(i);
                    android.os.Parcel parcel = a2.e;
                    int dataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i2);
                    parcel.writeInt(dataPosition - i2);
                    parcel.setDataPosition(dataPosition);
                }
            } catch (java.lang.ClassNotFoundException e) {
                throw new java.lang.RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
            } catch (java.lang.IllegalAccessException e2) {
                throw new java.lang.RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
            } catch (java.lang.NoSuchMethodException e3) {
                throw new java.lang.RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
            } catch (java.lang.reflect.InvocationTargetException e4) {
                if (!(e4.getCause() instanceof java.lang.RuntimeException)) {
                    throw new java.lang.RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
                }
                throw ((java.lang.RuntimeException) e4.getCause());
            }
        } catch (java.lang.ClassNotFoundException e5) {
            throw new java.lang.RuntimeException(hp1Var.getClass().getSimpleName().concat(" does not have a Parcelizer"), e5);
        }
    }
}
