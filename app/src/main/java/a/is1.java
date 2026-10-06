package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class is1 extends a.ww {
    public boolean i;
    public boolean j;

    @Override // a.ww
    public void e(android.util.AttributeSet attributeSet) {
        super.e(attributeSet);
        if (attributeSet != null) {
            android.content.res.TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, a.m81.b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 6) {
                    this.i = true;
                } else if (index == 13) {
                    this.j = true;
                }
            }
        }
    }

    public abstract void h(a.hi0 hi0Var, int i, int i2);

    @Override // a.ww, android.view.View
    public final void onAttachedToWindow() {
        android.view.ViewParent parent;
        super.onAttachedToWindow();
        if ((this.i || this.j) && (parent = getParent()) != null && (parent instanceof androidx.constraintlayout.widget.ConstraintLayout)) {
            androidx.constraintlayout.widget.ConstraintLayout constraintLayout = (androidx.constraintlayout.widget.ConstraintLayout) parent;
            int visibility = getVisibility();
            float elevation = getElevation();
            for (int i = 0; i < this.d; i++) {
                android.view.View view = (android.view.View) constraintLayout.mChildrenByIds.get(this.c[i]);
                if (view != null) {
                    if (this.i) {
                        view.setVisibility(visibility);
                    }
                    if (this.j && elevation > 0.0f) {
                        view.setTranslationZ(view.getTranslationZ() + elevation);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        c();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        c();
    }
}
