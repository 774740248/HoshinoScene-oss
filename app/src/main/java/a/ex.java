package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ex {

    public ex() {
    }

    public static final android.util.SparseIntArray e;

    /* renamed from: a, reason: collision with root package name */
    public int f140a;
    public int b;
    public float c;
    public float d;

    static {
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        e = sparseIntArray;
        sparseIntArray.append(2, 1);
        sparseIntArray.append(4, 2);
        sparseIntArray.append(5, 3);
        sparseIntArray.append(1, 4);
        sparseIntArray.append(0, 5);
        sparseIntArray.append(3, 6);
    }

    public final void a(android.content.Context context, android.util.AttributeSet attributeSet) {
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.m81.e);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            switch (e.get(index)) {
                case 1:
                    this.d = obtainStyledAttributes.getFloat(index, this.d);
                    break;
                case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                    this.b = obtainStyledAttributes.getInt(index, this.b);
                    break;
                case 3:
                    if (obtainStyledAttributes.peekValue(index).type == 3) {
                        obtainStyledAttributes.getString(index);
                        break;
                    } else {
                        java.lang.String str = a.b20.h[obtainStyledAttributes.getInteger(index, 0)];
                        break;
                    }
                case com.omarea.krscript.model.ShellHandlerBase.EVENT_READ_ERROR /* 4 */:
                    obtainStyledAttributes.getInt(index, 0);
                    break;
                case 5:
                    this.f140a = a.hx.f(obtainStyledAttributes, index, this.f140a);
                    break;
                case com.omarea.krscript.model.ShellHandlerBase.EVENT_WRITE /* 6 */:
                    this.c = obtainStyledAttributes.getFloat(index, this.c);
                    break;
            }
        }
        obtainStyledAttributes.recycle();
    }
}
