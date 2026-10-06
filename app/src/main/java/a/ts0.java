package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ts0 implements a.z21 {

    public ts0() {
    }

    public int c;
    public int d;
    public java.lang.Object e = new java.util.ArrayList();
    public java.lang.Object f;

    public ts0(android.content.Context context, android.content.res.XmlResourceParser xmlResourceParser) {
        this.d = -1;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(android.util.Xml.asAttributeSet(xmlResourceParser), a.m81.g);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 0) {
                this.c = obtainStyledAttributes.getResourceId(index, this.c);
            } else if (index == 1) {
                this.d = obtainStyledAttributes.getResourceId(index, this.d);
                java.lang.String resourceTypeName = context.getResources().getResourceTypeName(this.d);
                context.getResources().getResourceName(this.d);
                if ("layout".equals(resourceTypeName)) {
                    a.hx hxVar = new a.hx();
                    this.f = hxVar;
                    hxVar.b((androidx.constraintlayout.widget.ConstraintLayout) android.view.LayoutInflater.from(context).inflate(this.d, (android.view.ViewGroup) null));
                }
            }
        }
        obtainStyledAttributes.recycle();
    }

    @Override // a.z21
    public final a.du1 u(android.view.View view, a.du1 du1Var) {
        int i = du1Var.f107a.f(7).b;
        int i2 = this.c;
        android.view.View obj = (android.view.View) this.e;
        if (i2 >= 0) {
            android.view.View view2 = (android.view.View) obj;
            view2.getLayoutParams().height = this.c + i;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        android.view.View view3 = (android.view.View) obj;
        view3.setPadding(view3.getPaddingLeft(), this.d + i, view3.getPaddingRight(), view3.getPaddingBottom());
        return du1Var;
    }
}
