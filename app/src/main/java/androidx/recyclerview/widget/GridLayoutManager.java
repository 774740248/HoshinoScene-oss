package androidx.recyclerview.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseIntArray;

import a.nm1;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
/* [修复] GridLayoutManager 混淆版 stub，extends LinearLayoutManager。保编译。 */
public class GridLayoutManager extends LinearLayoutManager {

    public boolean G;
    public int H;
    public int[] I;
    public android.view.View[] J;
    public SparseIntArray K = new SparseIntArray();
    public SparseIntArray L = new SparseIntArray();
    public nm1 M;
    public android.graphics.Rect N = new android.graphics.Rect();

    public GridLayoutManager(int spanCount) {
        super(spanCount);
    }

    public GridLayoutManager(int spanCount, int orientation) {
        super(orientation);
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int defStyleAttr, int defStyleRes) {
        super(context, attributeSet, defStyleAttr, defStyleRes);
    }

    public final void z1(int i) {
        throw new UnsupportedOperationException("stub");
    }
}
