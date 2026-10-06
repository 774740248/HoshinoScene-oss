package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class qs {

    /* renamed from: a, reason: collision with root package name */
    public final a.ol f478a;
    public final a.ol b;

    public qs(android.content.Context context) {
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(a.wv.q1(2130969294, context, a.wy0.class.getCanonicalName()).data, a.t81.o);
        a.ol.b(context, obtainStyledAttributes.getResourceId(3, 0));
        a.ol.b(context, obtainStyledAttributes.getResourceId(1, 0));
        a.ol.b(context, obtainStyledAttributes.getResourceId(2, 0));
        a.ol.b(context, obtainStyledAttributes.getResourceId(4, 0));
        android.content.res.ColorStateList c0 = a.wv.c0(context, obtainStyledAttributes, 6);
        this.f478a = a.ol.b(context, obtainStyledAttributes.getResourceId(8, 0));
        a.ol.b(context, obtainStyledAttributes.getResourceId(7, 0));
        this.b = a.ol.b(context, obtainStyledAttributes.getResourceId(9, 0));
        new android.graphics.Paint().setColor(c0.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
