package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ax {

    /* renamed from: a, reason: collision with root package name */
    public final float f27a;
    public final float b;
    public final float c;
    public final float d;
    public final int e;

    public ax(android.content.Context context, android.content.res.XmlResourceParser xmlResourceParser) {
        this.f27a = Float.NaN;
        this.b = Float.NaN;
        this.c = Float.NaN;
        this.d = Float.NaN;
        this.e = -1;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(android.util.Xml.asAttributeSet(xmlResourceParser), a.m81.i);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 0) {
                int resourceId = obtainStyledAttributes.getResourceId(index, this.e);
                this.e = resourceId;
                java.lang.String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new a.hx().b((androidx.constraintlayout.widget.ConstraintLayout) android.view.LayoutInflater.from(context).inflate(resourceId, (android.view.ViewGroup) null));
                }
            } else if (index == 1) {
                this.d = obtainStyledAttributes.getDimension(index, this.d);
            } else if (index == 2) {
                this.b = obtainStyledAttributes.getDimension(index, this.b);
            } else if (index == 3) {
                this.c = obtainStyledAttributes.getDimension(index, this.c);
            } else if (index == 4) {
                this.f27a = obtainStyledAttributes.getDimension(index, this.f27a);
            } else {
                android.util.Log.v("ConstraintLayoutStates", "Unknown tag");
            }
        }
        obtainStyledAttributes.recycle();
    }
}
