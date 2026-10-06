package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class iz0 extends a.vn {
    public static int m(android.content.Context context, android.content.res.TypedArray typedArray, int... iArr) {
        int i = -1;
        for (int i2 = 0; i2 < iArr.length && i < 0; i2++) {
            int i3 = iArr[i2];
            android.util.TypedValue typedValue = new android.util.TypedValue();
            if (typedArray.getValue(i3, typedValue) && typedValue.type == 2) {
                android.content.res.TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
                int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, -1);
                obtainStyledAttributes.recycle();
                i = dimensionPixelSize;
            } else {
                i = typedArray.getDimensionPixelSize(i3, -1);
            }
        }
        return i;
    }

    @Override // a.vn, android.widget.TextView
    public final void setTextAppearance(android.content.Context context, int i) {
        super.setTextAppearance(context, i);
        if (a.wv.n1(2130969628, context, true)) {
            android.content.res.TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(i, a.t81.t);
            int m = m(getContext(), obtainStyledAttributes, 1, 2);
            obtainStyledAttributes.recycle();
            if (m >= 0) {
                setLineHeight(m);
            }
        }
    }
}
