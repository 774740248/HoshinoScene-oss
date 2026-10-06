package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class gq {

    /* renamed from: a, reason: collision with root package name */
    public final a.fq f187a;
    public final a.fq b = new a.fq();
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final float i;
    public final int j;
    public final int k;
    public final int l;

    public gq(android.content.Context context) {
        android.util.AttributeSet attributeSet;
        int i;
        int next;
        a.fq fqVar = new a.fq();
        int i2 = fqVar.c;
        if (i2 != 0) {
            try {
                android.content.res.XmlResourceParser xml = context.getResources().getXml(i2);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new org.xmlpull.v1.XmlPullParserException("No start tag found");
                }
                if (!android.text.TextUtils.equals(xml.getName(), "badge")) {
                    throw new org.xmlpull.v1.XmlPullParserException("Must have a <" + ((java.lang.Object) "badge") + "> start tag");
                }
                android.util.AttributeSet asAttributeSet = android.util.Xml.asAttributeSet(xml);
                i = asAttributeSet.getStyleAttribute();
                attributeSet = asAttributeSet;
            } catch (java.io.IOException | org.xmlpull.v1.XmlPullParserException e) {
                android.content.res.Resources.NotFoundException notFoundException = new android.content.res.Resources.NotFoundException("Can't load badge resource ID #0x" + java.lang.Integer.toHexString(i2));
                notFoundException.initCause(e);
                throw notFoundException;
            }
        } else {
            attributeSet = null;
            i = 0;
        }
        int i3 = i == 0 ? 2132018183 : i;
        int[] iArr = a.t81.c;
        a.b20.r(context, attributeSet, 2130968658, i3);
        a.b20.u(context, attributeSet, iArr, 2130968658, i3, new int[0]);
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 2130968658, i3);
        android.content.res.Resources resources = context.getResources();
        this.c = obtainStyledAttributes.getDimensionPixelSize(3, -1);
        this.i = obtainStyledAttributes.getDimensionPixelSize(8, resources.getDimensionPixelSize(2131165754));
        this.j = context.getResources().getDimensionPixelSize(2131165753);
        this.k = context.getResources().getDimensionPixelSize(2131165756);
        this.d = obtainStyledAttributes.getDimensionPixelSize(11, -1);
        this.e = obtainStyledAttributes.getDimension(9, resources.getDimension(2131165366));
        this.g = obtainStyledAttributes.getDimension(14, resources.getDimension(2131165370));
        this.f = obtainStyledAttributes.getDimension(2, resources.getDimension(2131165366));
        this.h = obtainStyledAttributes.getDimension(10, resources.getDimension(2131165370));
        this.l = obtainStyledAttributes.getInt(19, 1);
        a.fq fqVar2 = this.b;
        int i4 = fqVar.k;
        fqVar2.k = i4 == -2 ? 255 : i4;
        java.lang.CharSequence charSequence = fqVar.o;
        fqVar2.o = charSequence == null ? context.getString(2131953009) : charSequence;
        a.fq fqVar3 = this.b;
        int i5 = fqVar.p;
        fqVar3.p = i5 == 0 ? 2131820544 : i5;
        int i6 = fqVar.q;
        fqVar3.q = i6 == 0 ? 2131953022 : i6;
        java.lang.Boolean bool = fqVar.s;
        fqVar3.s = java.lang.Boolean.valueOf(bool == null || bool.booleanValue());
        a.fq fqVar4 = this.b;
        int i7 = fqVar.m;
        fqVar4.m = i7 == -2 ? obtainStyledAttributes.getInt(17, 4) : i7;
        int i8 = fqVar.l;
        if (i8 != -2) {
            this.b.l = i8;
        } else if (obtainStyledAttributes.hasValue(18)) {
            this.b.l = obtainStyledAttributes.getInt(18, 0);
        } else {
            this.b.l = -1;
        }
        a.fq fqVar5 = this.b;
        java.lang.Integer num = fqVar.g;
        fqVar5.g = java.lang.Integer.valueOf(num == null ? obtainStyledAttributes.getResourceId(4, 2132017549) : num.intValue());
        a.fq fqVar6 = this.b;
        java.lang.Integer num2 = fqVar.h;
        fqVar6.h = java.lang.Integer.valueOf(num2 == null ? obtainStyledAttributes.getResourceId(5, 0) : num2.intValue());
        a.fq fqVar7 = this.b;
        java.lang.Integer num3 = fqVar.i;
        fqVar7.i = java.lang.Integer.valueOf(num3 == null ? obtainStyledAttributes.getResourceId(12, 2132017549) : num3.intValue());
        a.fq fqVar8 = this.b;
        java.lang.Integer num4 = fqVar.j;
        fqVar8.j = java.lang.Integer.valueOf(num4 == null ? obtainStyledAttributes.getResourceId(13, 0) : num4.intValue());
        a.fq fqVar9 = this.b;
        java.lang.Integer num5 = fqVar.d;
        fqVar9.d = java.lang.Integer.valueOf(num5 == null ? a.wv.c0(context, obtainStyledAttributes, 0).getDefaultColor() : num5.intValue());
        a.fq fqVar10 = this.b;
        java.lang.Integer num6 = fqVar.f;
        fqVar10.f = java.lang.Integer.valueOf(num6 == null ? obtainStyledAttributes.getResourceId(6, 2132017691) : num6.intValue());
        java.lang.Integer num7 = fqVar.e;
        if (num7 != null) {
            this.b.e = num7;
        } else if (obtainStyledAttributes.hasValue(7)) {
            this.b.e = java.lang.Integer.valueOf(a.wv.c0(context, obtainStyledAttributes, 7).getDefaultColor());
        } else {
            int intValue = this.b.f.intValue();
            android.content.res.TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(intValue, a.t81.C);
            obtainStyledAttributes2.getDimension(0, 0.0f);
            android.content.res.ColorStateList c0 = a.wv.c0(context, obtainStyledAttributes2, 3);
            a.wv.c0(context, obtainStyledAttributes2, 4);
            a.wv.c0(context, obtainStyledAttributes2, 5);
            obtainStyledAttributes2.getInt(2, 0);
            obtainStyledAttributes2.getInt(1, 1);
            int i9 = obtainStyledAttributes2.hasValue(12) ? 12 : 10;
            obtainStyledAttributes2.getResourceId(i9, 0);
            obtainStyledAttributes2.getString(i9);
            obtainStyledAttributes2.getBoolean(14, false);
            a.wv.c0(context, obtainStyledAttributes2, 6);
            obtainStyledAttributes2.getFloat(7, 0.0f);
            obtainStyledAttributes2.getFloat(8, 0.0f);
            obtainStyledAttributes2.getFloat(9, 0.0f);
            obtainStyledAttributes2.recycle();
            android.content.res.TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(intValue, a.t81.t);
            obtainStyledAttributes3.hasValue(0);
            obtainStyledAttributes3.getFloat(0, 0.0f);
            obtainStyledAttributes3.recycle();
            this.b.e = java.lang.Integer.valueOf(c0.getDefaultColor());
        }
        a.fq fqVar11 = this.b;
        java.lang.Integer num8 = fqVar.r;
        fqVar11.r = java.lang.Integer.valueOf(num8 == null ? obtainStyledAttributes.getInt(1, 8388661) : num8.intValue());
        a.fq fqVar12 = this.b;
        java.lang.Integer num9 = fqVar.t;
        fqVar12.t = java.lang.Integer.valueOf(num9 == null ? obtainStyledAttributes.getDimensionPixelOffset(15, 0) : num9.intValue());
        a.fq fqVar13 = this.b;
        java.lang.Integer num10 = fqVar.u;
        fqVar13.u = java.lang.Integer.valueOf(num10 == null ? obtainStyledAttributes.getDimensionPixelOffset(20, 0) : num10.intValue());
        a.fq fqVar14 = this.b;
        java.lang.Integer num11 = fqVar.v;
        fqVar14.v = java.lang.Integer.valueOf(num11 == null ? obtainStyledAttributes.getDimensionPixelOffset(16, fqVar14.t.intValue()) : num11.intValue());
        a.fq fqVar15 = this.b;
        java.lang.Integer num12 = fqVar.w;
        fqVar15.w = java.lang.Integer.valueOf(num12 == null ? obtainStyledAttributes.getDimensionPixelOffset(21, fqVar15.u.intValue()) : num12.intValue());
        a.fq fqVar16 = this.b;
        java.lang.Integer num13 = fqVar.x;
        fqVar16.x = java.lang.Integer.valueOf(num13 == null ? 0 : num13.intValue());
        a.fq fqVar17 = this.b;
        java.lang.Integer num14 = fqVar.y;
        fqVar17.y = java.lang.Integer.valueOf(num14 != null ? num14.intValue() : 0);
        obtainStyledAttributes.recycle();
        java.util.Locale locale = fqVar.n;
        if (locale == null) {
            this.b.n = java.util.Locale.getDefault(java.util.Locale.Category.FORMAT);
        } else {
            this.b.n = locale;
        }
        this.f187a = fqVar;
    }

    public final boolean a() {
        return this.b.l != -1;
    }
}
