package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class vw {

    public vw() {
        this(null, null);
    }

    /* renamed from: a, reason: collision with root package name */
    public int f644a;
    public int b;
    public float c;
    public java.lang.String d;
    public boolean e;
    public int f;

    public vw(a.vw vwVar, java.lang.Object obj) {
        vwVar.getClass();
        this.f644a = vwVar.f644a;
        b(obj);
    }

    /* JADX WARN: Type inference failed for: r13v1, types: [a.vw, java.lang.Object] */
    public static void a(android.content.Context context, android.content.res.XmlResourceParser xmlResourceParser, java.util.HashMap hashMap) {
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(android.util.Xml.asAttributeSet(xmlResourceParser), a.m81.c);
        int indexCount = obtainStyledAttributes.getIndexCount();
        java.lang.String str = null;
        int i = 0;
        a.vw obj = null;
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = obtainStyledAttributes.getIndex(i2);
            if (index == 0) {
                str = obtainStyledAttributes.getString(index);
                if (str != null && str.length() > 0) {
                    str = java.lang.Character.toUpperCase(str.charAt(0)) + str.substring(1);
                }
            } else if (index == 1) {
                obj = java.lang.Boolean.valueOf(obtainStyledAttributes.getBoolean(index, false));
                i = 6;
            } else {
                int i3 = 3;
                if (index == 3) {
                    obj = java.lang.Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                } else {
                    i3 = 4;
                    if (index == 2) {
                        obj = java.lang.Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                    } else {
                        if (index == 7) {
                            obj = java.lang.Float.valueOf(android.util.TypedValue.applyDimension(1, obtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                        } else if (index == 4) {
                            obj = java.lang.Float.valueOf(obtainStyledAttributes.getDimension(index, 0.0f));
                        } else {
                            i3 = 5;
                            if (index == 5) {
                                obj = java.lang.Float.valueOf(obtainStyledAttributes.getFloat(index, Float.NaN));
                                i = 2;
                            } else if (index == 6) {
                                obj = java.lang.Integer.valueOf(obtainStyledAttributes.getInteger(index, -1));
                                i = 1;
                            } else if (index == 8) {
                                obj = obtainStyledAttributes.getString(index);
                            }
                        }
                        i = 7;
                    }
                }
                i = i3;
            }
        }
        if (str != null && obj != null) {
            a.vw obj2 = new a.vw();
            obj2.f644a = i;
            obj2.b(obj);
            hashMap.put(str, obj2);
        }
        obtainStyledAttributes.recycle();
    }

    public final void b(java.lang.Object obj) {
        switch (a.ai1.B(this.f644a)) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                this.b = ((java.lang.Integer) obj).intValue();
                return;
            case 1:
                this.c = ((java.lang.Float) obj).floatValue();
                return;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
            case 3:
                this.f = ((java.lang.Integer) obj).intValue();
                return;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_READ_ERROR /* 4 */:
                this.d = (java.lang.String) obj;
                return;
            case 5:
                this.e = ((java.lang.Boolean) obj).booleanValue();
                return;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_WRITE /* 6 */:
                this.c = ((java.lang.Float) obj).floatValue();
                return;
            default:
                return;
        }
    }
}
