package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class fx {

    public fx() {
    }


    /* renamed from: a, reason: collision with root package name */
    public int f162a;
    public int b;
    public float c;
    public float d;

    public final void a(android.content.Context context, android.util.AttributeSet attributeSet) {
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.m81.f);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 1) {
                this.c = obtainStyledAttributes.getFloat(index, this.c);
            } else if (index == 0) {
                int i2 = obtainStyledAttributes.getInt(index, this.f162a);
                this.f162a = i2;
                this.f162a = a.hx.d[i2];
            } else if (index == 4) {
                this.b = obtainStyledAttributes.getInt(index, this.b);
            } else if (index == 3) {
                this.d = obtainStyledAttributes.getFloat(index, this.d);
            }
        }
        obtainStyledAttributes.recycle();
    }
}
