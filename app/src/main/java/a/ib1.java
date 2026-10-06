package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ib1 {
    private volatile java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> array;

    public ib1(int i) {
        this.array = new java.util.concurrent.atomic.AtomicReferenceArray<>(i);
    }

    public final int a() {
        return this.array.length();
    }

    public final java.lang.Object b(int i) {
        java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> atomicReferenceArray = this.array;
        if (i < atomicReferenceArray.length()) {
            return atomicReferenceArray.get(i);
        }
        return null;
    }

    public final void c(int i, a.az azVar) {
        java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> atomicReferenceArray = this.array;
        int length = atomicReferenceArray.length();
        if (i < length) {
            atomicReferenceArray.set(i, azVar);
            return;
        }
        int i2 = i + 1;
        int i3 = length * 2;
        if (i2 < i3) {
            i2 = i3;
        }
        java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> atomicReferenceArray2 = new java.util.concurrent.atomic.AtomicReferenceArray<>(i2);
        for (int i4 = 0; i4 < length; i4++) {
            atomicReferenceArray2.set(i4, atomicReferenceArray.get(i4));
        }
        atomicReferenceArray2.set(i, azVar);
        this.array = atomicReferenceArray2;
    }
}
