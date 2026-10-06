package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class cp1 extends a.to1 {
    public static final android.graphics.PorterDuff.Mode l = android.graphics.PorterDuff.Mode.SRC_IN;
    public a.ap1 d;
    public android.graphics.PorterDuffColorFilter e;
    public android.graphics.ColorFilter f;
    public boolean g;
    public boolean h;
    public final float[] i;
    public final android.graphics.Matrix j;
    public final android.graphics.Rect k;

    /* JADX WARN: Type inference failed for: r0v5, types: [android.graphics.drawable.Drawable.ConstantState, a.ap1] */
    public cp1() {
        this.h = true;
        this.i = new float[9];
        this.j = new android.graphics.Matrix();
        this.k = new android.graphics.Rect();
        ap1 constantState = new ap1();
        constantState.c = null;
        constantState.d = l;
        constantState.b = new a.zo1();
        this.d = constantState;
    }

    public final android.graphics.PorterDuffColorFilter a(android.content.res.ColorStateList colorStateList, android.graphics.PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new android.graphics.PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        android.graphics.drawable.Drawable drawable = this.c;
        if (drawable == null) {
            return false;
        }
        a.i90.b(drawable);
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(android.graphics.Canvas canvas) {
        android.graphics.Paint paint;
        android.graphics.drawable.Drawable drawable = this.c;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        android.graphics.Rect rect = this.k;
        copyBounds(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        android.graphics.ColorFilter colorFilter = this.f;
        if (colorFilter == null) {
            colorFilter = this.e;
        }
        android.graphics.Matrix matrix = this.j;
        canvas.getMatrix(matrix);
        float[] fArr = this.i;
        matrix.getValues(fArr);
        float abs = java.lang.Math.abs(fArr[0]);
        float abs2 = java.lang.Math.abs(fArr[4]);
        float abs3 = java.lang.Math.abs(fArr[1]);
        float abs4 = java.lang.Math.abs(fArr[3]);
        if (abs3 != 0.0f || abs4 != 0.0f) {
            abs = 1.0f;
            abs2 = 1.0f;
        }
        int width = (int) (rect.width() * abs);
        int min = java.lang.Math.min(2048, width);
        int min2 = java.lang.Math.min(2048, (int) (rect.height() * abs2));
        if (min <= 0 || min2 <= 0) {
            return;
        }
        int save = canvas.save();
        canvas.translate(rect.left, rect.top);
        if (isAutoMirrored() && a.j90.a(this) == 1) {
            canvas.translate(rect.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        rect.offsetTo(0, 0);
        a.ap1 ap1Var = this.d;
        android.graphics.Bitmap bitmap = ap1Var.f;
        if (bitmap == null || min != bitmap.getWidth() || min2 != ap1Var.f.getHeight()) {
            ap1Var.f = android.graphics.Bitmap.createBitmap(min, min2, android.graphics.Bitmap.Config.ARGB_8888);
            ap1Var.k = true;
        }
        if (this.h) {
            a.ap1 ap1Var2 = this.d;
            if (ap1Var2.k || ap1Var2.g != ap1Var2.c || ap1Var2.h != ap1Var2.d || ap1Var2.j != ap1Var2.e || ap1Var2.i != ap1Var2.b.getRootAlpha()) {
                a.ap1 ap1Var3 = this.d;
                ap1Var3.f.eraseColor(0);
                android.graphics.Canvas canvas2 = new android.graphics.Canvas(ap1Var3.f);
                a.zo1 zo1Var = ap1Var3.b;
                zo1Var.a(zo1Var.g, a.zo1.p, canvas2, min, min2);
                a.ap1 ap1Var4 = this.d;
                ap1Var4.g = ap1Var4.c;
                ap1Var4.h = ap1Var4.d;
                ap1Var4.i = ap1Var4.b.getRootAlpha();
                ap1Var4.j = ap1Var4.e;
                ap1Var4.k = false;
            }
        } else {
            a.ap1 ap1Var5 = this.d;
            ap1Var5.f.eraseColor(0);
            android.graphics.Canvas canvas3 = new android.graphics.Canvas(ap1Var5.f);
            a.zo1 zo1Var2 = ap1Var5.b;
            zo1Var2.a(zo1Var2.g, a.zo1.p, canvas3, min, min2);
        }
        a.ap1 ap1Var6 = this.d;
        if (ap1Var6.b.getRootAlpha() >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (ap1Var6.l == null) {
                android.graphics.Paint paint2 = new android.graphics.Paint();
                ap1Var6.l = paint2;
                paint2.setFilterBitmap(true);
            }
            ap1Var6.l.setAlpha(ap1Var6.b.getRootAlpha());
            ap1Var6.l.setColorFilter(colorFilter);
            paint = ap1Var6.l;
        }
        canvas.drawBitmap(ap1Var6.f, (android.graphics.Rect) null, rect, paint);
        canvas.restoreToCount(save);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        android.graphics.drawable.Drawable drawable = this.c;
        return drawable != null ? a.h90.a(drawable) : this.d.b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        android.graphics.drawable.Drawable drawable = this.c;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.d.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final android.graphics.ColorFilter getColorFilter() {
        android.graphics.drawable.Drawable drawable = this.c;
        return drawable != null ? a.i90.c(drawable) : this.f;
    }

    @Override // android.graphics.drawable.Drawable
    public final android.graphics.drawable.Drawable.ConstantState getConstantState() {
        if (this.c != null) {
            return new a.bp1(this.c.getConstantState());
        }
        this.d.f21a = getChangingConfigurations();
        return this.d;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        android.graphics.drawable.Drawable drawable = this.c;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.d.b.i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        android.graphics.drawable.Drawable drawable = this.c;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.d.b.h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        android.graphics.drawable.Drawable drawable = this.c;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v21, types: [a.yo1, a.vo1, java.lang.Object] */
    @Override // android.graphics.drawable.Drawable
    public final void inflate(android.content.res.Resources resources, org.xmlpull.v1.XmlPullParser xmlPullParser, android.util.AttributeSet attributeSet, android.content.res.Resources.Theme theme) {
        a.zo1 zo1Var;
        int i;
        int i2;
        boolean z;
        int i3;
        boolean z2;
        android.graphics.Paint.Join join;
        android.graphics.Paint.Cap cap;
        android.graphics.Paint.Join join2;
        android.graphics.drawable.Drawable drawable = this.c;
        if (drawable != null) {
            a.i90.d(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        a.ap1 ap1Var = this.d;
        ap1Var.b = new a.zo1();
        android.content.res.TypedArray U0 = a.wv.U0(resources, theme, attributeSet, a.wv.c);
        a.ap1 ap1Var2 = this.d;
        a.zo1 zo1Var2 = ap1Var2.b;
        int i4 = !a.wv.x0(xmlPullParser, "tintMode") ? -1 : U0.getInt(6, -1);
        android.graphics.PorterDuff.Mode mode = android.graphics.PorterDuff.Mode.SRC_IN;
        int i5 = 3;
        if (i4 == 3) {
            mode = android.graphics.PorterDuff.Mode.SRC_OVER;
        } else if (i4 != 5) {
            if (i4 != 9) {
                switch (i4) {
                    case 14:
                        mode = android.graphics.PorterDuff.Mode.MULTIPLY;
                        break;
                    case 15:
                        mode = android.graphics.PorterDuff.Mode.SCREEN;
                        break;
                    case 16:
                        mode = android.graphics.PorterDuff.Mode.ADD;
                        break;
                }
            } else {
                mode = android.graphics.PorterDuff.Mode.SRC_ATOP;
            }
        }
        ap1Var2.d = mode;
        int i6 = 1;
        android.content.res.ColorStateList colorStateList = null;
        boolean z3 = false;
        if (a.wv.x0(xmlPullParser, "tint")) {
            android.util.TypedValue typedValue = new android.util.TypedValue();
            U0.getValue(1, typedValue);
            int i7 = typedValue.type;
            if (i7 == 2) {
                throw new java.lang.UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
            }
            if (i7 >= 28 && i7 <= 31) {
                colorStateList = android.content.res.ColorStateList.valueOf(typedValue.data);
            } else {
                android.content.res.Resources resources2 = U0.getResources();
                int resourceId = U0.getResourceId(1, 0);
                java.lang.ThreadLocal threadLocal = a.rv.f508a;
                try {
                    colorStateList = a.rv.a(resources2, resources2.getXml(resourceId), theme);
                } catch (java.lang.Exception e) {
                    android.util.Log.e("CSLCompat", "Failed to inflate ColorStateList.", e);
                }
            }
        }
        android.content.res.ColorStateList colorStateList2 = colorStateList;
        if (colorStateList2 != null) {
            ap1Var2.c = colorStateList2;
        }
        boolean z4 = ap1Var2.e;
        if (a.wv.x0(xmlPullParser, "autoMirrored")) {
            z4 = U0.getBoolean(5, z4);
        }
        ap1Var2.e = z4;
        float f = zo1Var2.j;
        if (a.wv.x0(xmlPullParser, "viewportWidth")) {
            f = U0.getFloat(7, f);
        }
        zo1Var2.j = f;
        float f2 = zo1Var2.k;
        if (a.wv.x0(xmlPullParser, "viewportHeight")) {
            f2 = U0.getFloat(8, f2);
        }
        zo1Var2.k = f2;
        if (zo1Var2.j <= 0.0f) {
            throw new org.xmlpull.v1.XmlPullParserException(U0.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f2 > 0.0f) {
            zo1Var2.h = U0.getDimension(3, zo1Var2.h);
            float dimension = U0.getDimension(2, zo1Var2.i);
            zo1Var2.i = dimension;
            if (zo1Var2.h <= 0.0f) {
                throw new org.xmlpull.v1.XmlPullParserException(U0.getPositionDescription() + "<vector> tag requires width > 0");
            }
            if (dimension > 0.0f) {
                float alpha = zo1Var2.getAlpha();
                if (a.wv.x0(xmlPullParser, "alpha")) {
                    alpha = U0.getFloat(4, alpha);
                }
                zo1Var2.setAlpha(alpha);
                java.lang.String string = U0.getString(0);
                if (string != null) {
                    zo1Var2.m = string;
                    zo1Var2.o.put(string, zo1Var2);
                }
                U0.recycle();
                ap1Var.f21a = getChangingConfigurations();
                ap1Var.k = true;
                a.ap1 ap1Var3 = this.d;
                a.zo1 zo1Var3 = ap1Var3.b;
                java.util.ArrayDeque arrayDeque = new java.util.ArrayDeque();
                arrayDeque.push(zo1Var3.g);
                int eventType = xmlPullParser.getEventType();
                int depth = xmlPullParser.getDepth() + 1;
                boolean z5 = true;
                while (eventType != i6 && (xmlPullParser.getDepth() >= depth || eventType != i5)) {
                    if (eventType == 2) {
                        java.lang.String name = xmlPullParser.getName();
                        a.wo1 wo1Var = (a.wo1) arrayDeque.peek();
                        boolean equals = "path".equals(name);
                        i = depth;
                        a.kp kpVar = zo1Var3.o;
                        if (equals) {
                            vo1 yo1Var = new vo1();
                            /* TODO: jadx type unresolved, defaulted to Object */
                            yo1Var.f = 0.0f;
                            yo1Var.h = 1.0f;
                            yo1Var.i = 1.0f;
                            yo1Var.j = 0.0f;
                            yo1Var.k = 1.0f;
                            yo1Var.l = 0.0f;
                            android.graphics.Paint.Cap cap2 = android.graphics.Paint.Cap.BUTT;
                            yo1Var.m = cap2;
                            android.graphics.Paint.Join join3 = android.graphics.Paint.Join.MITER;
                            yo1Var.n = join3;
                            zo1Var = zo1Var3;
                            yo1Var.o = 4.0f;
                            android.content.res.TypedArray U02 = a.wv.U0(resources, theme, attributeSet, a.wv.e);
                            if (a.wv.x0(xmlPullParser, "pathData")) {
                                java.lang.String string2 = U02.getString(0);
                                if (string2 != null) {
                                    yo1Var.b = string2;
                                }
                                java.lang.String string3 = U02.getString(2);
                                if (string3 != null) {
                                    yo1Var.f714a = a.wv.L(string3);
                                }
                                yo1Var.g = a.wv.j0(U02, xmlPullParser, theme, "fillColor", 1);
                                float f3 = yo1Var.i;
                                if (a.wv.x0(xmlPullParser, "fillAlpha")) {
                                    f3 = U02.getFloat(12, f3);
                                }
                                yo1Var.i = f3;
                                int i8 = !a.wv.x0(xmlPullParser, "strokeLineCap") ? -1 : U02.getInt(8, -1);
                                android.graphics.Paint.Cap cap3 = yo1Var.m;
                                if (i8 != 0) {
                                    join = join3;
                                    if (i8 != 1) {
                                        cap = i8 != 2 ? cap3 : android.graphics.Paint.Cap.SQUARE;
                                    } else {
                                        cap = android.graphics.Paint.Cap.ROUND;
                                    }
                                } else {
                                    join = join3;
                                    cap = cap2;
                                }
                                yo1Var.m = cap;
                                int i9 = !a.wv.x0(xmlPullParser, "strokeLineJoin") ? -1 : U02.getInt(9, -1);
                                android.graphics.Paint.Join join4 = yo1Var.n;
                                if (i9 == 0) {
                                    join2 = join;
                                } else if (i9 != 1) {
                                    join2 = i9 != 2 ? join4 : android.graphics.Paint.Join.BEVEL;
                                } else {
                                    join2 = android.graphics.Paint.Join.ROUND;
                                }
                                yo1Var.n = join2;
                                float f4 = yo1Var.o;
                                if (a.wv.x0(xmlPullParser, "strokeMiterLimit")) {
                                    f4 = U02.getFloat(10, f4);
                                }
                                yo1Var.o = f4;
                                yo1Var.e = a.wv.j0(U02, xmlPullParser, theme, "strokeColor", 3);
                                float f5 = yo1Var.h;
                                if (a.wv.x0(xmlPullParser, "strokeAlpha")) {
                                    f5 = U02.getFloat(11, f5);
                                }
                                yo1Var.h = f5;
                                float f6 = yo1Var.f;
                                if (a.wv.x0(xmlPullParser, "strokeWidth")) {
                                    f6 = U02.getFloat(4, f6);
                                }
                                yo1Var.f = f6;
                                float f7 = yo1Var.k;
                                if (a.wv.x0(xmlPullParser, "trimPathEnd")) {
                                    f7 = U02.getFloat(6, f7);
                                }
                                yo1Var.k = f7;
                                float f8 = yo1Var.l;
                                if (a.wv.x0(xmlPullParser, "trimPathOffset")) {
                                    f8 = U02.getFloat(7, f8);
                                }
                                yo1Var.l = f8;
                                float f9 = yo1Var.j;
                                if (a.wv.x0(xmlPullParser, "trimPathStart")) {
                                    f9 = U02.getFloat(5, f9);
                                }
                                yo1Var.j = f9;
                                int i10 = yo1Var.c;
                                if (a.wv.x0(xmlPullParser, "fillType")) {
                                    i10 = U02.getInt(13, i10);
                                }
                                yo1Var.c = i10;
                            }
                            U02.recycle();
                            wo1Var.b.add(yo1Var);
                            if (yo1Var.getPathName() != null) {
                                kpVar.put(yo1Var.getPathName(), yo1Var);
                            }
                            ap1Var3.f21a |= yo1Var.d;
                            z2 = false;
                            i2 = 1;
                            z5 = false;
                        } else {
                            zo1Var = zo1Var3;
                            if ("clip-path".equals(name)) {
                                a.yo1 yo1Var2 = new vo1();
                                if (a.wv.x0(xmlPullParser, "pathData")) {
                                    android.content.res.TypedArray U03 = a.wv.U0(resources, theme, attributeSet, a.wv.f);
                                    java.lang.String string4 = U03.getString(0);
                                    if (string4 != null) {
                                        yo1Var2.b = string4;
                                    }
                                    java.lang.String string5 = U03.getString(1);
                                    if (string5 != null) {
                                        yo1Var2.f714a = a.wv.L(string5);
                                    }
                                    yo1Var2.c = !a.wv.x0(xmlPullParser, "fillType") ? 0 : U03.getInt(2, 0);
                                    U03.recycle();
                                }
                                wo1Var.b.add(yo1Var2);
                                if (yo1Var2.getPathName() != null) {
                                    kpVar.put(yo1Var2.getPathName(), yo1Var2);
                                }
                                ap1Var3.f21a = yo1Var2.d | ap1Var3.f21a;
                            } else if ("group".equals(name)) {
                                a.wo1 wo1Var2 = new a.wo1();
                                android.content.res.TypedArray U04 = a.wv.U0(resources, theme, attributeSet, a.wv.d);
                                float f10 = wo1Var2.c;
                                if (a.wv.x0(xmlPullParser, "rotation")) {
                                    f10 = U04.getFloat(5, f10);
                                }
                                wo1Var2.c = f10;
                                i2 = 1;
                                wo1Var2.d = U04.getFloat(1, wo1Var2.d);
                                wo1Var2.e = U04.getFloat(2, wo1Var2.e);
                                float f11 = wo1Var2.f;
                                if (a.wv.x0(xmlPullParser, "scaleX")) {
                                    f11 = U04.getFloat(3, f11);
                                }
                                wo1Var2.f = f11;
                                float f12 = wo1Var2.g;
                                if (a.wv.x0(xmlPullParser, "scaleY")) {
                                    f12 = U04.getFloat(4, f12);
                                }
                                wo1Var2.g = f12;
                                float f13 = wo1Var2.h;
                                if (a.wv.x0(xmlPullParser, "translateX")) {
                                    f13 = U04.getFloat(6, f13);
                                }
                                wo1Var2.h = f13;
                                float f14 = wo1Var2.i;
                                if (a.wv.x0(xmlPullParser, "translateY")) {
                                    f14 = U04.getFloat(7, f14);
                                }
                                wo1Var2.i = f14;
                                z2 = false;
                                java.lang.String string6 = U04.getString(0);
                                if (string6 != null) {
                                    wo1Var2.l = string6;
                                }
                                wo1Var2.c();
                                U04.recycle();
                                wo1Var.b.add(wo1Var2);
                                arrayDeque.push(wo1Var2);
                                if (wo1Var2.getGroupName() != null) {
                                    kpVar.put(wo1Var2.getGroupName(), wo1Var2);
                                }
                                ap1Var3.f21a = wo1Var2.k | ap1Var3.f21a;
                            }
                            z2 = false;
                            i2 = 1;
                        }
                        z = z2;
                        i3 = 3;
                    } else {
                        zo1Var = zo1Var3;
                        i = depth;
                        i2 = i6;
                        z = z3;
                        i3 = 3;
                        if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                            arrayDeque.pop();
                        }
                    }
                    eventType = xmlPullParser.next();
                    i5 = i3;
                    z3 = z;
                    i6 = i2;
                    depth = i;
                    zo1Var3 = zo1Var;
                }
                if (!z5) {
                    this.e = a(ap1Var.c, ap1Var.d);
                    return;
                }
                throw new org.xmlpull.v1.XmlPullParserException("no path defined");
            }
            throw new org.xmlpull.v1.XmlPullParserException(U0.getPositionDescription() + "<vector> tag requires height > 0");
        }
        throw new org.xmlpull.v1.XmlPullParserException(U0.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        android.graphics.drawable.Drawable drawable = this.c;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        android.graphics.drawable.Drawable drawable = this.c;
        return drawable != null ? a.h90.d(drawable) : this.d.e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        android.content.res.ColorStateList colorStateList;
        android.graphics.drawable.Drawable drawable = this.c;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (!super.isStateful()) {
            a.ap1 ap1Var = this.d;
            if (ap1Var != null) {
                a.zo1 zo1Var = ap1Var.b;
                if (zo1Var.n == null) {
                    zo1Var.n = java.lang.Boolean.valueOf(zo1Var.g.a());
                }
                if (zo1Var.n.booleanValue() || ((colorStateList = this.d.c) != null && colorStateList.isStateful())) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.graphics.drawable.Drawable.ConstantState, a.ap1] */
    @Override // android.graphics.drawable.Drawable
    public final android.graphics.drawable.Drawable mutate() {
        android.graphics.drawable.Drawable drawable = this.c;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.g && super.mutate() == this) {
            a.ap1 ap1Var = this.d;
            android.graphics.drawable.Drawable.ConstantState constantState = new ap1();
            constantState.c = null;
            constantState.d = l;
            if (ap1Var != null) {
                constantState.f21a = ap1Var.f21a;
                a.zo1 zo1Var = new a.zo1(ap1Var.b);
                constantState.b = zo1Var;
                if (ap1Var.b.e != null) {
                    zo1Var.e = new android.graphics.Paint(ap1Var.b.e);
                }
                if (ap1Var.b.d != null) {
                    constantState.b.d = new android.graphics.Paint(ap1Var.b.d);
                }
                constantState.c = ap1Var.c;
                constantState.d = ap1Var.d;
                constantState.e = ap1Var.e;
            }
            this.d = (ap1) constantState;
            this.g = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(android.graphics.Rect rect) {
        android.graphics.drawable.Drawable drawable = this.c;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z;
        android.graphics.PorterDuff.Mode mode;
        android.graphics.drawable.Drawable drawable = this.c;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        a.ap1 ap1Var = this.d;
        android.content.res.ColorStateList colorStateList = ap1Var.c;
        if (colorStateList == null || (mode = ap1Var.d) == null) {
            z = false;
        } else {
            this.e = a(colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        a.zo1 zo1Var = ap1Var.b;
        if (zo1Var.n == null) {
            zo1Var.n = java.lang.Boolean.valueOf(zo1Var.g.a());
        }
        if (zo1Var.n.booleanValue()) {
            boolean b = ap1Var.b.g.b(iArr);
            ap1Var.k |= b;
            if (b) {
                invalidateSelf();
                return true;
            }
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(java.lang.Runnable runnable, long j) {
        android.graphics.drawable.Drawable drawable = this.c;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        android.graphics.drawable.Drawable drawable = this.c;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.d.b.getRootAlpha() != i) {
            this.d.b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        android.graphics.drawable.Drawable drawable = this.c;
        if (drawable != null) {
            a.h90.e(drawable, z);
        } else {
            this.d.e = z;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(android.graphics.ColorFilter colorFilter) {
        android.graphics.drawable.Drawable drawable = this.c;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        android.graphics.drawable.Drawable drawable = this.c;
        if (drawable != null) {
            a.wv.C1(drawable, i);
        } else {
            setTintList(android.content.res.ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(android.content.res.ColorStateList colorStateList) {
        android.graphics.drawable.Drawable drawable = this.c;
        if (drawable != null) {
            a.i90.h(drawable, colorStateList);
            return;
        }
        a.ap1 ap1Var = this.d;
        if (ap1Var.c != colorStateList) {
            ap1Var.c = colorStateList;
            this.e = a(colorStateList, ap1Var.d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(android.graphics.PorterDuff.Mode mode) {
        android.graphics.drawable.Drawable drawable = this.c;
        if (drawable != null) {
            a.i90.i(drawable, mode);
            return;
        }
        a.ap1 ap1Var = this.d;
        if (ap1Var.d != mode) {
            ap1Var.d = mode;
            this.e = a(ap1Var.c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        android.graphics.drawable.Drawable drawable = this.c;
        return drawable != null ? drawable.setVisible(z, z2) : super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(java.lang.Runnable runnable) {
        android.graphics.drawable.Drawable drawable = this.c;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    public cp1(a.ap1 ap1Var) {
        this.h = true;
        this.i = new float[9];
        this.j = new android.graphics.Matrix();
        this.k = new android.graphics.Rect();
        this.d = ap1Var;
        this.e = a(ap1Var.c, ap1Var.d);
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(android.content.res.Resources resources, org.xmlpull.v1.XmlPullParser xmlPullParser, android.util.AttributeSet attributeSet) {
        android.graphics.drawable.Drawable drawable = this.c;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }
}
