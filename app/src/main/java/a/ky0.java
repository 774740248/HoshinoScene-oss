package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ky0 extends android.widget.ArrayAdapter {
    public android.content.res.ColorStateList c;
    public android.content.res.ColorStateList d;
    public final /* synthetic */ a.ly0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ky0(a.ly0 ly0Var, android.content.Context context, int i, java.lang.String[] strArr) {
        super(context, i, strArr);
        this.e = ly0Var;
        a();
    }

    public final void a() {
        android.content.res.ColorStateList colorStateList;
        a.ly0 ly0Var = this.e;
        android.content.res.ColorStateList colorStateList2 = ly0Var.m;
        android.content.res.ColorStateList colorStateList3 = null;
        if (colorStateList2 != null) {
            int[] iArr = {android.R.attr.state_pressed};
            colorStateList = new android.content.res.ColorStateList(new int[][]{iArr, new int[0]}, new int[]{colorStateList2.getColorForState(iArr, 0), 0});
        } else {
            colorStateList = null;
        }
        this.d = colorStateList;
        if (ly0Var.l != 0 && ly0Var.m != null) {
            int[] iArr2 = {android.R.attr.state_hovered, -16842919};
            int[] iArr3 = {android.R.attr.state_selected, -16842919};
            colorStateList3 = new android.content.res.ColorStateList(new int[][]{iArr3, iArr2, new int[0]}, new int[]{a.sv.b(ly0Var.m.getColorForState(iArr3, 0), ly0Var.l), a.sv.b(ly0Var.m.getColorForState(iArr2, 0), ly0Var.l), ly0Var.l});
        }
        this.c = colorStateList3;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final android.view.View getView(int i, android.view.View view, android.view.ViewGroup viewGroup) {
        android.view.View view2 = super.getView(i, view, viewGroup);
        if (view2 instanceof android.widget.TextView) {
            android.widget.TextView textView = (android.widget.TextView) view2;
            a.ly0 ly0Var = this.e;
            android.graphics.drawable.Drawable drawable = null;
            if (ly0Var.getText().toString().contentEquals(textView.getText()) && ly0Var.l != 0) {
                android.graphics.drawable.ColorDrawable colorDrawable = new android.graphics.drawable.ColorDrawable(ly0Var.l);
                if (this.d != null) {
                    a.i90.h(colorDrawable, this.c);
                    drawable = new android.graphics.drawable.RippleDrawable(this.d, colorDrawable, null);
                } else {
                    drawable = colorDrawable;
                }
            }
            java.util.WeakHashMap weakHashMap = a.jq1.f264a;
            a.rp1.q(textView, drawable);
        }
        return view2;
    }
}
