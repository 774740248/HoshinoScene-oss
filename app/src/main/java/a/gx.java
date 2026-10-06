package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class gx {

    public gx() {
    }

    public static final android.util.SparseIntArray m;

    /* renamed from: a, reason: collision with root package name */
    public float f195a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;
    public boolean k;
    public float l;

    static {
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        m = sparseIntArray;
        sparseIntArray.append(6, 1);
        sparseIntArray.append(7, 2);
        sparseIntArray.append(8, 3);
        sparseIntArray.append(4, 4);
        sparseIntArray.append(5, 5);
        sparseIntArray.append(0, 6);
        sparseIntArray.append(1, 7);
        sparseIntArray.append(2, 8);
        sparseIntArray.append(3, 9);
        sparseIntArray.append(9, 10);
        sparseIntArray.append(10, 11);
    }

    public final void a(android.content.Context context, android.util.AttributeSet attributeSet) {
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.m81.h);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            switch (m.get(index)) {
                case 1:
                    this.f195a = obtainStyledAttributes.getFloat(index, this.f195a);
                    break;
                case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                    this.b = obtainStyledAttributes.getFloat(index, this.b);
                    break;
                case 3:
                    this.c = obtainStyledAttributes.getFloat(index, this.c);
                    break;
                case com.omarea.krscript.model.ShellHandlerBase.EVENT_READ_ERROR /* 4 */:
                    this.d = obtainStyledAttributes.getFloat(index, this.d);
                    break;
                case 5:
                    this.e = obtainStyledAttributes.getFloat(index, this.e);
                    break;
                case com.omarea.krscript.model.ShellHandlerBase.EVENT_WRITE /* 6 */:
                    this.f = obtainStyledAttributes.getDimension(index, this.f);
                    break;
                case 7:
                    this.g = obtainStyledAttributes.getDimension(index, this.g);
                    break;
                case 8:
                    this.h = obtainStyledAttributes.getDimension(index, this.h);
                    break;
                case 9:
                    this.i = obtainStyledAttributes.getDimension(index, this.i);
                    break;
                case 10:
                    this.j = obtainStyledAttributes.getDimension(index, this.j);
                    break;
                case 11:
                    this.k = true;
                    this.l = obtainStyledAttributes.getDimension(index, this.l);
                    break;
            }
        }
        obtainStyledAttributes.recycle();
    }
}
