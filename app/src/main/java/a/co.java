package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class co {
    public static final android.graphics.RectF l = new android.graphics.RectF();
    public static final java.util.concurrent.ConcurrentHashMap m = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public int f75a = 0;
    public boolean b = false;
    public float c = -1.0f;
    public float d = -1.0f;
    public float e = -1.0f;
    public int[] f = new int[0];
    public boolean g = false;
    public android.text.TextPaint h;
    public final android.widget.TextView i;
    public final android.content.Context j;
    public final a.zn k;

    static {
        new java.util.concurrent.ConcurrentHashMap();
    }

    public co(android.widget.TextView textView) {
        this.i = textView;
        this.j = textView.getContext();
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            this.k = new a.ao();
        } else {
            this.k = new a.zn();
        }
    }

    public static int[] b(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        java.util.Arrays.sort(iArr);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i : iArr) {
            if (i > 0 && java.util.Collections.binarySearch(arrayList, java.lang.Integer.valueOf(i)) < 0) {
                arrayList.add(java.lang.Integer.valueOf(i));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr2[i2] = ((java.lang.Integer) arrayList.get(i2)).intValue();
        }
        return iArr2;
    }

    public static java.lang.reflect.Method d(java.lang.String str) {
        try {
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = m;
            java.lang.reflect.Method method = (java.lang.reflect.Method) concurrentHashMap.get(str);
            if (method == null && (method = android.widget.TextView.class.getDeclaredMethod(str, new java.lang.Class[0])) != null) {
                method.setAccessible(true);
                concurrentHashMap.put(str, method);
            }
            return method;
        } catch (java.lang.Exception e) {
            android.util.Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e);
            return null;
        }
    }

    public static java.lang.Object e(java.lang.Object obj, java.lang.Object obj2, java.lang.String str) {
        try {
            return d(str).invoke(obj, new java.lang.Object[0]);
        } catch (java.lang.Exception e) {
            android.util.Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e);
            return obj2;
        }
    }

    public final void a() {
        if (f()) {
            if (this.b) {
                if (this.i.getMeasuredHeight() <= 0 || this.i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.k.b(this.i) ? 1048576 : (this.i.getMeasuredWidth() - this.i.getTotalPaddingLeft()) - this.i.getTotalPaddingRight();
                int height = (this.i.getHeight() - this.i.getCompoundPaddingBottom()) - this.i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                android.graphics.RectF rectF = l;
                synchronized (rectF) {
                    try {
                        rectF.setEmpty();
                        rectF.right = measuredWidth;
                        rectF.bottom = height;
                        float c = c(rectF);
                        if (c != this.i.getTextSize()) {
                            g(0, c);
                        }
                    } finally {
                    }
                }
            }
            this.b = true;
        }
    }

    public final int c(android.graphics.RectF rectF) {
        java.lang.CharSequence transformation;
        int length = this.f.length;
        if (length == 0) {
            throw new java.lang.IllegalStateException("No available text sizes to choose from.");
        }
        int i = length - 1;
        int i2 = 0;
        int i3 = 1;
        while (i3 <= i) {
            int i4 = (i3 + i) / 2;
            int i5 = this.f[i4];
            android.widget.TextView textView = this.i;
            java.lang.CharSequence text = textView.getText();
            android.text.method.TransformationMethod transformationMethod = textView.getTransformationMethod();
            if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, textView)) != null) {
                text = transformation;
            }
            int b = a.wn.b(textView);
            android.text.TextPaint textPaint = this.h;
            if (textPaint == null) {
                this.h = new android.text.TextPaint();
            } else {
                textPaint.reset();
            }
            this.h.set(textView.getPaint());
            this.h.setTextSize(i5);
            android.text.StaticLayout a2 = a.yn.a(text, (android.text.Layout.Alignment) e(textView, android.text.Layout.Alignment.ALIGN_NORMAL, "getLayoutAlignment"), java.lang.Math.round(rectF.right), b, this.i, this.h, this.k);
            if ((b == -1 || (a2.getLineCount() <= b && a2.getLineEnd(a2.getLineCount() - 1) == text.length())) && a2.getHeight() <= rectF.bottom) {
                int i6 = i4 + 1;
                i2 = i3;
                i3 = i6;
            } else {
                i2 = i4 - 1;
                i = i2;
            }
        }
        return this.f[i2];
    }

    public final boolean f() {
        return j() && this.f75a != 0;
    }

    public final void g(int i, float f) {
        android.content.Context context = this.j;
        float applyDimension = android.util.TypedValue.applyDimension(i, f, (context == null ? android.content.res.Resources.getSystem() : context.getResources()).getDisplayMetrics());
        android.widget.TextView textView = this.i;
        if (applyDimension != textView.getPaint().getTextSize()) {
            textView.getPaint().setTextSize(applyDimension);
            boolean a2 = a.xn.a(textView);
            if (textView.getLayout() != null) {
                this.b = false;
                try {
                    java.lang.reflect.Method d = d("nullLayouts");
                    if (d != null) {
                        d.invoke(textView, new java.lang.Object[0]);
                    }
                } catch (java.lang.Exception e) {
                    android.util.Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e);
                }
                if (a2) {
                    textView.forceLayout();
                } else {
                    textView.requestLayout();
                }
                textView.invalidate();
            }
        }
    }

    public final boolean h() {
        if (j() && this.f75a == 1) {
            if (!this.g || this.f.length == 0) {
                int floor = ((int) java.lang.Math.floor((this.e - this.d) / this.c)) + 1;
                int[] iArr = new int[floor];
                for (int i = 0; i < floor; i++) {
                    iArr[i] = java.lang.Math.round((i * this.c) + this.d);
                }
                this.f = b(iArr);
            }
            this.b = true;
        } else {
            this.b = false;
        }
        return this.b;
    }

    public final boolean i() {
        boolean z = this.f.length > 0;
        this.g = z;
        if (z) {
            this.f75a = 1;
            this.d = this.f[0];
            this.e = this.f[this.f.length - 1];
            this.c = -1.0f;
        }
        return z;
    }

    public final boolean j() {
        return !(this.i instanceof androidx.appcompat.widget.AppCompatEditText);
    }

    public final void k(float f, float f2, float f3) {
        if (f <= 0.0f) {
            throw new java.lang.IllegalArgumentException("Minimum auto-size text size (" + f + "px) is less or equal to (0px)");
        }
        if (f2 <= f) {
            throw new java.lang.IllegalArgumentException("Maximum auto-size text size (" + f2 + "px) is less or equal to minimum auto-size text size (" + f + "px)");
        }
        if (f3 <= 0.0f) {
            throw new java.lang.IllegalArgumentException("The auto-size step granularity (" + f3 + "px) is less or equal to (0px)");
        }
        this.f75a = 1;
        this.d = f;
        this.e = f2;
        this.c = f3;
        this.g = false;
    }
}
