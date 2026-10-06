package a;

import android.util.SparseIntArray;
/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class hx {
    public static final int[] d = {0, 4, 8};
    public static android.util.SparseIntArray e;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashMap f220a = new java.util.HashMap();
    public final boolean b = true;
    public final java.util.HashMap c = new java.util.HashMap();

    static {
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        e = sparseIntArray;
        sparseIntArray.append(76, 25);
        sparseIntArray.append(77, 26);
        sparseIntArray.append(79, 29);
        sparseIntArray.append(80, 30);
        sparseIntArray.append(86, 36);
        sparseIntArray.append(85, 35);
        sparseIntArray.append(58, 4);
        sparseIntArray.append(57, 3);
        sparseIntArray.append(55, 1);
        sparseIntArray.append(94, 6);
        sparseIntArray.append(95, 7);
        sparseIntArray.append(65, 17);
        sparseIntArray.append(66, 18);
        sparseIntArray.append(67, 19);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(81, 32);
        sparseIntArray.append(82, 33);
        sparseIntArray.append(64, 10);
        sparseIntArray.append(63, 9);
        sparseIntArray.append(98, 13);
        sparseIntArray.append(101, 16);
        sparseIntArray.append(99, 14);
        sparseIntArray.append(96, 11);
        sparseIntArray.append(100, 15);
        sparseIntArray.append(97, 12);
        sparseIntArray.append(89, 40);
        sparseIntArray.append(74, 39);
        sparseIntArray.append(73, 41);
        sparseIntArray.append(88, 42);
        sparseIntArray.append(72, 20);
        sparseIntArray.append(87, 37);
        sparseIntArray.append(62, 5);
        sparseIntArray.append(75, 82);
        sparseIntArray.append(84, 82);
        sparseIntArray.append(78, 82);
        sparseIntArray.append(56, 82);
        sparseIntArray.append(54, 82);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(23, 31);
        sparseIntArray.append(24, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(13, 43);
        sparseIntArray.append(26, 44);
        sparseIntArray.append(21, 45);
        sparseIntArray.append(22, 46);
        sparseIntArray.append(20, 60);
        sparseIntArray.append(18, 47);
        sparseIntArray.append(19, 48);
        sparseIntArray.append(14, 49);
        sparseIntArray.append(15, 50);
        sparseIntArray.append(16, 51);
        sparseIntArray.append(17, 52);
        sparseIntArray.append(25, 53);
        sparseIntArray.append(90, 54);
        sparseIntArray.append(68, 55);
        sparseIntArray.append(91, 56);
        sparseIntArray.append(69, 57);
        sparseIntArray.append(92, 58);
        sparseIntArray.append(70, 59);
        sparseIntArray.append(59, 61);
        sparseIntArray.append(61, 62);
        sparseIntArray.append(60, 63);
        sparseIntArray.append(27, 64);
        sparseIntArray.append(106, 65);
        sparseIntArray.append(33, 66);
        sparseIntArray.append(107, 67);
        sparseIntArray.append(103, 79);
        sparseIntArray.append(1, 38);
        sparseIntArray.append(102, 68);
        sparseIntArray.append(93, 69);
        sparseIntArray.append(71, 70);
        sparseIntArray.append(31, 71);
        sparseIntArray.append(29, 72);
        sparseIntArray.append(30, 73);
        sparseIntArray.append(32, 74);
        sparseIntArray.append(28, 75);
        sparseIntArray.append(104, 76);
        sparseIntArray.append(83, 77);
        sparseIntArray.append(108, 78);
        sparseIntArray.append(53, 80);
        sparseIntArray.append(52, 81);
    }

    public static int[] c(androidx.constraintlayout.widget.Barrier barrier, java.lang.String str) {
        int i;
        java.util.HashMap hashMap;
        java.lang.String[] split = str.split(",");
        android.content.Context context = barrier.getContext();
        int[] iArr = new int[split.length];
        int i2 = 0;
        int i3 = 0;
        while (i2 < split.length) {
            java.lang.String trim = split[i2].trim();
            java.lang.Object obj = null;
            try {
                i = a.h81.class.getField(trim).getInt(null);
            } catch (java.lang.Exception unused) {
                i = 0;
            }
            if (i == 0) {
                i = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i == 0 && barrier.isInEditMode() && (barrier.getParent() instanceof androidx.constraintlayout.widget.ConstraintLayout)) {
                androidx.constraintlayout.widget.ConstraintLayout constraintLayout = (androidx.constraintlayout.widget.ConstraintLayout) barrier.getParent();
                constraintLayout.getClass();
                if ((trim instanceof java.lang.String) && (hashMap = constraintLayout.mDesignIds) != null && hashMap.containsKey(trim)) {
                    obj = constraintLayout.mDesignIds.get(trim);
                }
                if (obj != null && (obj instanceof java.lang.Integer)) {
                    i = ((java.lang.Integer) obj).intValue();
                }
            }
            iArr[i3] = i;
            i2++;
            i3++;
        }
        return i3 != split.length ? java.util.Arrays.copyOf(iArr, i3) : iArr;
    }

    public static a.cx d(android.content.Context context, android.util.AttributeSet attributeSet) {
        a.cx cxVar = new a.cx();
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.m81.f339a);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            a.fx fxVar = cxVar.b;
            a.ex exVar = cxVar.c;
            a.gx gxVar = cxVar.e;
            a.dx dxVar = cxVar.d;
            if (index != 1 && 23 != index && 24 != index) {
                exVar.getClass();
                dxVar.getClass();
                fxVar.getClass();
                gxVar.getClass();
            }
            android.util.SparseIntArray sparseIntArray = e;
            switch (sparseIntArray.get(index)) {
                case 1:
                    dxVar.o = f(obtainStyledAttributes, index, dxVar.o);
                    break;
                case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                    dxVar.F = obtainStyledAttributes.getDimensionPixelSize(index, dxVar.F);
                    break;
                case 3:
                    dxVar.n = f(obtainStyledAttributes, index, dxVar.n);
                    break;
                case com.omarea.krscript.model.ShellHandlerBase.EVENT_READ_ERROR /* 4 */:
                    dxVar.m = f(obtainStyledAttributes, index, dxVar.m);
                    break;
                case 5:
                    dxVar.v = obtainStyledAttributes.getString(index);
                    break;
                case com.omarea.krscript.model.ShellHandlerBase.EVENT_WRITE /* 6 */:
                    dxVar.z = obtainStyledAttributes.getDimensionPixelOffset(index, dxVar.z);
                    break;
                case 7:
                    dxVar.A = obtainStyledAttributes.getDimensionPixelOffset(index, dxVar.A);
                    break;
                case 8:
                    dxVar.G = obtainStyledAttributes.getDimensionPixelSize(index, dxVar.G);
                    break;
                case 9:
                    dxVar.s = f(obtainStyledAttributes, index, dxVar.s);
                    break;
                case 10:
                    dxVar.r = f(obtainStyledAttributes, index, dxVar.r);
                    break;
                case 11:
                    dxVar.L = obtainStyledAttributes.getDimensionPixelSize(index, dxVar.L);
                    break;
                case 12:
                    dxVar.M = obtainStyledAttributes.getDimensionPixelSize(index, dxVar.M);
                    break;
                case 13:
                    dxVar.I = obtainStyledAttributes.getDimensionPixelSize(index, dxVar.I);
                    break;
                case 14:
                    dxVar.K = obtainStyledAttributes.getDimensionPixelSize(index, dxVar.K);
                    break;
                case 15:
                    dxVar.N = obtainStyledAttributes.getDimensionPixelSize(index, dxVar.N);
                    break;
                case 16:
                    dxVar.J = obtainStyledAttributes.getDimensionPixelSize(index, dxVar.J);
                    break;
                case 17:
                    dxVar.d = obtainStyledAttributes.getDimensionPixelOffset(index, dxVar.d);
                    break;
                case 18:
                    dxVar.e = obtainStyledAttributes.getDimensionPixelOffset(index, dxVar.e);
                    break;
                case 19:
                    dxVar.f = obtainStyledAttributes.getFloat(index, dxVar.f);
                    break;
                case 20:
                    dxVar.t = obtainStyledAttributes.getFloat(index, dxVar.t);
                    break;
                case 21:
                    dxVar.c = obtainStyledAttributes.getLayoutDimension(index, dxVar.c);
                    break;
                case 22:
                    fxVar.f162a = d[obtainStyledAttributes.getInt(index, fxVar.f162a)];
                    break;
                case 23:
                    dxVar.b = obtainStyledAttributes.getLayoutDimension(index, dxVar.b);
                    break;
                case 24:
                    dxVar.C = obtainStyledAttributes.getDimensionPixelSize(index, dxVar.C);
                    break;
                case 25:
                    dxVar.g = f(obtainStyledAttributes, index, dxVar.g);
                    break;
                case 26:
                    dxVar.h = f(obtainStyledAttributes, index, dxVar.h);
                    break;
                case 27:
                    dxVar.B = obtainStyledAttributes.getInt(index, dxVar.B);
                    break;
                case 28:
                    dxVar.D = obtainStyledAttributes.getDimensionPixelSize(index, dxVar.D);
                    break;
                case 29:
                    dxVar.i = f(obtainStyledAttributes, index, dxVar.i);
                    break;
                case 30:
                    dxVar.j = f(obtainStyledAttributes, index, dxVar.j);
                    break;
                case 31:
                    dxVar.H = obtainStyledAttributes.getDimensionPixelSize(index, dxVar.H);
                    break;
                case 32:
                    dxVar.p = f(obtainStyledAttributes, index, dxVar.p);
                    break;
                case 33:
                    dxVar.q = f(obtainStyledAttributes, index, dxVar.q);
                    break;
                case 34:
                    dxVar.E = obtainStyledAttributes.getDimensionPixelSize(index, dxVar.E);
                    break;
                case 35:
                    dxVar.l = f(obtainStyledAttributes, index, dxVar.l);
                    break;
                case 36:
                    dxVar.k = f(obtainStyledAttributes, index, dxVar.k);
                    break;
                case 37:
                    dxVar.u = obtainStyledAttributes.getFloat(index, dxVar.u);
                    break;
                case 38:
                    cxVar.f86a = obtainStyledAttributes.getResourceId(index, cxVar.f86a);
                    break;
                case 39:
                    dxVar.P = obtainStyledAttributes.getFloat(index, dxVar.P);
                    break;
                case 40:
                    dxVar.O = obtainStyledAttributes.getFloat(index, dxVar.O);
                    break;
                case 41:
                    dxVar.Q = obtainStyledAttributes.getInt(index, dxVar.Q);
                    break;
                case 42:
                    dxVar.R = obtainStyledAttributes.getInt(index, dxVar.R);
                    break;
                case 43:
                    fxVar.c = obtainStyledAttributes.getFloat(index, fxVar.c);
                    break;
                case 44:
                    gxVar.k = true;
                    gxVar.l = obtainStyledAttributes.getDimension(index, gxVar.l);
                    break;
                case 45:
                    gxVar.b = obtainStyledAttributes.getFloat(index, gxVar.b);
                    break;
                case 46:
                    gxVar.c = obtainStyledAttributes.getFloat(index, gxVar.c);
                    break;
                case 47:
                    gxVar.d = obtainStyledAttributes.getFloat(index, gxVar.d);
                    break;
                case 48:
                    gxVar.e = obtainStyledAttributes.getFloat(index, gxVar.e);
                    break;
                case 49:
                    gxVar.f = obtainStyledAttributes.getDimension(index, gxVar.f);
                    break;
                case 50:
                    gxVar.g = obtainStyledAttributes.getDimension(index, gxVar.g);
                    break;
                case 51:
                    gxVar.h = obtainStyledAttributes.getDimension(index, gxVar.h);
                    break;
                case 52:
                    gxVar.i = obtainStyledAttributes.getDimension(index, gxVar.i);
                    break;
                case 53:
                    gxVar.j = obtainStyledAttributes.getDimension(index, gxVar.j);
                    break;
                case 54:
                    dxVar.S = obtainStyledAttributes.getInt(index, dxVar.S);
                    break;
                case 55:
                    dxVar.T = obtainStyledAttributes.getInt(index, dxVar.T);
                    break;
                case 56:
                    dxVar.U = obtainStyledAttributes.getDimensionPixelSize(index, dxVar.U);
                    break;
                case 57:
                    dxVar.V = obtainStyledAttributes.getDimensionPixelSize(index, dxVar.V);
                    break;
                case 58:
                    dxVar.W = obtainStyledAttributes.getDimensionPixelSize(index, dxVar.W);
                    break;
                case 59:
                    dxVar.X = obtainStyledAttributes.getDimensionPixelSize(index, dxVar.X);
                    break;
                case 60:
                    gxVar.f195a = obtainStyledAttributes.getFloat(index, gxVar.f195a);
                    break;
                case 61:
                    dxVar.w = f(obtainStyledAttributes, index, dxVar.w);
                    break;
                case 62:
                    dxVar.x = obtainStyledAttributes.getDimensionPixelSize(index, dxVar.x);
                    break;
                case 63:
                    dxVar.y = obtainStyledAttributes.getFloat(index, dxVar.y);
                    break;
                case 64:
                    exVar.f140a = f(obtainStyledAttributes, index, exVar.f140a);
                    break;
                case 65:
                    if (obtainStyledAttributes.peekValue(index).type == 3) {
                        obtainStyledAttributes.getString(index);
                        exVar.getClass();
                        break;
                    } else {
                        java.lang.String str = a.b20.h[obtainStyledAttributes.getInteger(index, 0)];
                        exVar.getClass();
                        break;
                    }
                case 66:
                    obtainStyledAttributes.getInt(index, 0);
                    exVar.getClass();
                    break;
                case 67:
                    exVar.d = obtainStyledAttributes.getFloat(index, exVar.d);
                    break;
                case 68:
                    fxVar.d = obtainStyledAttributes.getFloat(index, fxVar.d);
                    break;
                case 69:
                    dxVar.Y = obtainStyledAttributes.getFloat(index, 1.0f);
                    break;
                case 70:
                    dxVar.Z = obtainStyledAttributes.getFloat(index, 1.0f);
                    break;
                case 71:
                    android.util.Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    dxVar.a0 = obtainStyledAttributes.getInt(index, dxVar.a0);
                    break;
                case 73:
                    dxVar.b0 = obtainStyledAttributes.getDimensionPixelSize(index, dxVar.b0);
                    break;
                case 74:
                    dxVar.e0 = obtainStyledAttributes.getString(index);
                    break;
                case 75:
                    dxVar.i0 = obtainStyledAttributes.getBoolean(index, dxVar.i0);
                    break;
                case 76:
                    exVar.b = obtainStyledAttributes.getInt(index, exVar.b);
                    break;
                case 77:
                    dxVar.f0 = obtainStyledAttributes.getString(index);
                    break;
                case 78:
                    fxVar.b = obtainStyledAttributes.getInt(index, fxVar.b);
                    break;
                case 79:
                    exVar.c = obtainStyledAttributes.getFloat(index, exVar.c);
                    break;
                case 80:
                    dxVar.g0 = obtainStyledAttributes.getBoolean(index, dxVar.g0);
                    break;
                case 81:
                    dxVar.h0 = obtainStyledAttributes.getBoolean(index, dxVar.h0);
                    break;
                case 82:
                    android.util.Log.w("ConstraintSet", "unused attribute 0x" + java.lang.Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                    break;
                default:
                    android.util.Log.w("ConstraintSet", "Unknown attribute 0x" + java.lang.Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                    break;
            }
        }
        obtainStyledAttributes.recycle();
        return cxVar;
    }

    public static int f(android.content.res.TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:43:0x0102. Please report as an issue. */
    public final void a(androidx.constraintlayout.widget.ConstraintLayout constraintLayout) {
        android.view.ViewGroup viewGroup;
        int i;
        java.util.HashMap hashMap;
        java.lang.String str;
        a.hx hxVar = this;
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout2 = constraintLayout;
        int childCount = constraintLayout.getChildCount();
        java.util.HashMap hashMap2 = hxVar.c;
        java.util.HashSet hashSet = new java.util.HashSet(hashMap2.keySet());
        int i2 = 0;
        while (i2 < childCount) {
            android.view.View childAt = constraintLayout2.getChildAt(i2);
            int id = childAt.getId();
            if (!hashMap2.containsKey(java.lang.Integer.valueOf(id))) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("id unknown ");
                try {
                    str = childAt.getContext().getResources().getResourceEntryName(childAt.getId());
                } catch (java.lang.Exception unused) {
                    str = "UNKNOWN";
                }
                sb.append(str);
                android.util.Log.w("ConstraintSet", sb.toString());
            } else {
                if (hxVar.b && id == -1) {
                    throw new java.lang.RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1) {
                    if (hashMap2.containsKey(java.lang.Integer.valueOf(id))) {
                        hashSet.remove(java.lang.Integer.valueOf(id));
                        a.cx cxVar = (a.cx) hashMap2.get(java.lang.Integer.valueOf(id));
                        if (childAt instanceof androidx.constraintlayout.widget.Barrier) {
                            cxVar.d.c0 = 1;
                        }
                        int i3 = cxVar.d.c0;
                        if (i3 != -1 && i3 == 1) {
                            androidx.constraintlayout.widget.Barrier barrier = (androidx.constraintlayout.widget.Barrier) childAt;
                            barrier.setId(id);
                            a.dx dxVar = cxVar.d;
                            barrier.setType(dxVar.a0);
                            barrier.setMargin(dxVar.b0);
                            barrier.setAllowsGoneWidget(dxVar.i0);
                            int[] iArr = dxVar.d0;
                            if (iArr != null) {
                                barrier.setReferencedIds(iArr);
                            } else {
                                java.lang.String str2 = dxVar.e0;
                                if (str2 != null) {
                                    int[] c = c(barrier, str2);
                                    dxVar.d0 = c;
                                    barrier.setReferencedIds(c);
                                }
                            }
                        }
                        a.yw ywVar = (a.yw) childAt.getLayoutParams();
                        ywVar.a();
                        cxVar.a(ywVar);
                        java.util.HashMap hashMap3 = cxVar.f;
                        java.lang.Class<?> cls = childAt.getClass();
                        for (java.lang.String str3 : (Iterable<java.lang.String>) hashMap3.keySet()) {
                            a.vw vwVar = (a.vw) hashMap3.get(str3);
                            java.lang.String g = a.ai1.g("set", str3);
                            int i4 = childCount;
                            try {
                                switch (a.ai1.B(vwVar.f644a)) {
                                    case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                                        hashMap = hashMap3;
                                        java.lang.Class<?>[] clsArr = new java.lang.Class[1];
                                        try {
                                            clsArr[0] = java.lang.Integer.TYPE;
                                            cls.getMethod(g, clsArr).invoke(childAt, java.lang.Integer.valueOf(vwVar.b));
                                        } catch (java.lang.IllegalAccessException e2) {
                                            // [restored] e = (SparseIntArray) e2;
                                            android.util.Log.e("TransitionLayout", " Custom Attribute \"" + str3 + "\" not found on " + cls.getName());
                                            e2.printStackTrace();
                                            childCount = i4;
                                            hashMap3 = hashMap;
                                        } catch (java.lang.NoSuchMethodException e3) {
                                            // [restored] e = (SparseIntArray) e3;
                                            android.util.Log.e("TransitionLayout", e3.getMessage());
                                            android.util.Log.e("TransitionLayout", " Custom Attribute \"" + str3 + "\" not found on " + cls.getName());
                                            android.util.Log.e("TransitionLayout", cls.getName() + " must have a method " + g);
                                            childCount = i4;
                                            hashMap3 = hashMap;
                                        } catch (java.lang.reflect.InvocationTargetException e4) {
                                            // [restored] e = (SparseIntArray) e4;
                                            android.util.Log.e("TransitionLayout", " Custom Attribute \"" + str3 + "\" not found on " + cls.getName());
                                            e4.printStackTrace();
                                            childCount = i4;
                                            hashMap3 = hashMap;
                                        }
                                    case 1:
                                        hashMap = hashMap3;
                                        cls.getMethod(g, java.lang.Float.TYPE).invoke(childAt, java.lang.Float.valueOf(vwVar.c));
                                        break;
                                    case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                                        hashMap = hashMap3;
                                        cls.getMethod(g, java.lang.Integer.TYPE).invoke(childAt, java.lang.Integer.valueOf(vwVar.f));
                                        break;
                                    case 3:
                                        hashMap = hashMap3;
                                        java.lang.reflect.Method method = cls.getMethod(g, android.graphics.drawable.Drawable.class);
                                        android.graphics.drawable.ColorDrawable colorDrawable = new android.graphics.drawable.ColorDrawable();
                                        colorDrawable.setColor(vwVar.f);
                                        method.invoke(childAt, colorDrawable);
                                        break;
                                    case com.omarea.krscript.model.ShellHandlerBase.EVENT_READ_ERROR /* 4 */:
                                        hashMap = hashMap3;
                                        cls.getMethod(g, java.lang.CharSequence.class).invoke(childAt, vwVar.d);
                                        break;
                                    case 5:
                                        hashMap = hashMap3;
                                        cls.getMethod(g, java.lang.Boolean.TYPE).invoke(childAt, java.lang.Boolean.valueOf(vwVar.e));
                                        break;
                                    case com.omarea.krscript.model.ShellHandlerBase.EVENT_WRITE /* 6 */:
                                        hashMap = hashMap3;
                                        try {
                                            cls.getMethod(g, java.lang.Float.TYPE).invoke(childAt, java.lang.Float.valueOf(vwVar.c));
                                        } catch (java.lang.IllegalAccessException e5) {
                                            // [restored] e = (SparseIntArray) e5;
                                            android.util.Log.e("TransitionLayout", " Custom Attribute \"" + str3 + "\" not found on " + cls.getName());
                                            e5.printStackTrace();
                                            childCount = i4;
                                            hashMap3 = hashMap;
                                        } catch (java.lang.NoSuchMethodException e6) {
                                            // [restored] e = (SparseIntArray) e6;
                                            android.util.Log.e("TransitionLayout", e6.getMessage());
                                            android.util.Log.e("TransitionLayout", " Custom Attribute \"" + str3 + "\" not found on " + cls.getName());
                                            android.util.Log.e("TransitionLayout", cls.getName() + " must have a method " + g);
                                            childCount = i4;
                                            hashMap3 = hashMap;
                                        } catch (java.lang.reflect.InvocationTargetException e7) {
                                            // [restored] e = (SparseIntArray) e7;
                                            android.util.Log.e("TransitionLayout", " Custom Attribute \"" + str3 + "\" not found on " + cls.getName());
                                            e7.printStackTrace();
                                            childCount = i4;
                                            hashMap3 = hashMap;
                                        }
                                    default:
                                        hashMap = hashMap3;
                                        break;
                                }
                            } catch (java.lang.IllegalAccessException e8) {
                                // [restored] e = (SparseIntArray) e8;
                                hashMap = hashMap3;
                            } catch (java.lang.NoSuchMethodException e9) {
                                // [restored] e = (SparseIntArray) e9;
                                hashMap = hashMap3;
                            } catch (java.lang.reflect.InvocationTargetException e10) {
                                // [restored] e = (SparseIntArray) e10;
                                hashMap = hashMap3;
                            }
                            childCount = i4;
                            hashMap3 = hashMap;
                        }
                        i = childCount;
                        childAt.setLayoutParams(ywVar);
                        a.fx fxVar = cxVar.b;
                        if (fxVar.b == 0) {
                            childAt.setVisibility(fxVar.f162a);
                        }
                        childAt.setAlpha(fxVar.c);
                        a.gx gxVar = cxVar.e;
                        childAt.setRotation(gxVar.f195a);
                        childAt.setRotationX(gxVar.b);
                        childAt.setRotationY(gxVar.c);
                        childAt.setScaleX(gxVar.d);
                        childAt.setScaleY(gxVar.e);
                        if (!java.lang.Float.isNaN(gxVar.f)) {
                            childAt.setPivotX(gxVar.f);
                        }
                        if (!java.lang.Float.isNaN(gxVar.g)) {
                            childAt.setPivotY(gxVar.g);
                        }
                        childAt.setTranslationX(gxVar.h);
                        childAt.setTranslationY(gxVar.i);
                        childAt.setTranslationZ(gxVar.j);
                        if (gxVar.k) {
                            childAt.setElevation(gxVar.l);
                        }
                    } else {
                        i = childCount;
                        android.util.Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id);
                    }
                    i2++;
                    hxVar = this;
                    constraintLayout2 = constraintLayout;
                    childCount = i;
                }
            }
            i = childCount;
            i2++;
            hxVar = this;
            constraintLayout2 = constraintLayout;
            childCount = i;
        }
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            java.lang.Integer num = (java.lang.Integer) it.next();
            a.cx cxVar2 = (a.cx) hashMap2.get(num);
            a.dx dxVar2 = cxVar2.d;
            int i5 = dxVar2.c0;
            if (i5 == -1) {
                viewGroup = constraintLayout;
            } else if (i5 != 1) {
                viewGroup = constraintLayout;
            } else {
                androidx.constraintlayout.widget.Barrier barrier2 = new androidx.constraintlayout.widget.Barrier(constraintLayout.getContext());
                barrier2.setId(num.intValue());
                int[] iArr2 = dxVar2.d0;
                if (iArr2 != null) {
                    barrier2.setReferencedIds(iArr2);
                } else {
                    java.lang.String str4 = dxVar2.e0;
                    if (str4 != null) {
                        int[] c2 = c(barrier2, str4);
                        dxVar2.d0 = c2;
                        barrier2.setReferencedIds(c2);
                    }
                }
                barrier2.setType(dxVar2.a0);
                barrier2.setMargin(dxVar2.b0);
                a.yw a2 = androidx.constraintlayout.widget.ConstraintLayout.a();
                barrier2.g();
                cxVar2.a(a2);
                viewGroup = constraintLayout;
                viewGroup.addView(barrier2, a2);
            }
            if (dxVar2.f111a) {
                a.yq0 yq0Var = new a.yq0(constraintLayout.getContext());
                yq0Var.setId(num.intValue());
                a.yw a3 = androidx.constraintlayout.widget.ConstraintLayout.a();
                cxVar2.a(a3);
                viewGroup.addView(yq0Var, a3);
            }
        }
    }

    public final void b(androidx.constraintlayout.widget.ConstraintLayout constraintLayout) {
        int i;
        a.hx hxVar = this;
        int childCount = constraintLayout.getChildCount();
        java.util.HashMap hashMap = hxVar.c;
        hashMap.clear();
        int i2 = 0;
        while (i2 < childCount) {
            android.view.View childAt = constraintLayout.getChildAt(i2);
            a.yw ywVar = (a.yw) childAt.getLayoutParams();
            int id = childAt.getId();
            if (hxVar.b && id == -1) {
                throw new java.lang.RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!hashMap.containsKey(java.lang.Integer.valueOf(id))) {
                hashMap.put(java.lang.Integer.valueOf(id), new a.cx());
            }
            a.cx cxVar = (a.cx) hashMap.get(java.lang.Integer.valueOf(id));
            java.util.HashMap hashMap2 = hxVar.f220a;
            java.util.HashMap hashMap3 = new java.util.HashMap();
            java.lang.Class<?> cls = childAt.getClass();
            for (java.lang.String str : (Iterable<java.lang.String>) hashMap2.keySet()) {
                a.vw vwVar = (a.vw) hashMap2.get(str);
                try {
                    if (str.equals("BackgroundColor")) {
                        hashMap3.put(str, new a.vw(vwVar, java.lang.Integer.valueOf(((android.graphics.drawable.ColorDrawable) childAt.getBackground()).getColor())));
                        i = childCount;
                    } else {
                        i = childCount;
                        try {
                            hashMap3.put(str, new a.vw(vwVar, cls.getMethod("getMap" + str, new java.lang.Class[0]).invoke(childAt, new java.lang.Object[0])));
                        } catch (java.lang.IllegalAccessException e2) {
                            // [restored] e = (SparseIntArray) e2;
                            e2.printStackTrace();
                            childCount = i;
                        } catch (java.lang.NoSuchMethodException e3) {
                            // [restored] e = (SparseIntArray) e3;
                            e3.printStackTrace();
                            childCount = i;
                        } catch (java.lang.reflect.InvocationTargetException e4) {
                            // [restored] e = (SparseIntArray) e4;
                            e4.printStackTrace();
                            childCount = i;
                        }
                    }
                } catch (java.lang.IllegalAccessException e5) {
                    // [restored] e = (SparseIntArray) e5;
                    i = childCount;
                } catch (java.lang.NoSuchMethodException e6) {
                    // [restored] e = (SparseIntArray) e6;
                    i = childCount;
                } catch (java.lang.reflect.InvocationTargetException e7) {
                    // [restored] e = (SparseIntArray) e7;
                    i = childCount;
                }
                childCount = i;
            }
            int i3 = childCount;
            cxVar.f = hashMap3;
            cxVar.f86a = id;
            int i4 = ywVar.d;
            a.dx dxVar = cxVar.d;
            dxVar.g = i4;
            dxVar.h = ywVar.e;
            dxVar.i = ywVar.f;
            dxVar.j = ywVar.g;
            dxVar.k = ywVar.h;
            dxVar.l = ywVar.i;
            dxVar.m = ywVar.j;
            dxVar.n = ywVar.k;
            dxVar.o = ywVar.l;
            dxVar.p = ywVar.p;
            dxVar.q = ywVar.q;
            dxVar.r = ywVar.r;
            dxVar.s = ywVar.s;
            dxVar.t = ywVar.z;
            dxVar.u = ywVar.A;
            dxVar.v = ywVar.B;
            dxVar.w = ywVar.m;
            dxVar.x = ywVar.n;
            dxVar.y = ywVar.o;
            dxVar.z = ywVar.P;
            dxVar.A = ywVar.Q;
            dxVar.B = ywVar.R;
            dxVar.f = ywVar.c;
            dxVar.d = ywVar.f720a;
            dxVar.e = ywVar.b;
            dxVar.b = ((android.view.ViewGroup.MarginLayoutParams) ywVar).width;
            dxVar.c = ((android.view.ViewGroup.MarginLayoutParams) ywVar).height;
            dxVar.C = ((android.view.ViewGroup.MarginLayoutParams) ywVar).leftMargin;
            dxVar.D = ((android.view.ViewGroup.MarginLayoutParams) ywVar).rightMargin;
            dxVar.E = ((android.view.ViewGroup.MarginLayoutParams) ywVar).topMargin;
            dxVar.F = ((android.view.ViewGroup.MarginLayoutParams) ywVar).bottomMargin;
            dxVar.O = ywVar.E;
            dxVar.P = ywVar.D;
            dxVar.R = ywVar.G;
            dxVar.Q = ywVar.F;
            dxVar.g0 = ywVar.S;
            dxVar.h0 = ywVar.T;
            dxVar.S = ywVar.H;
            dxVar.T = ywVar.I;
            dxVar.U = ywVar.L;
            dxVar.V = ywVar.M;
            dxVar.W = ywVar.J;
            dxVar.X = ywVar.K;
            dxVar.Y = ywVar.N;
            dxVar.Z = ywVar.O;
            dxVar.f0 = ywVar.U;
            dxVar.J = ywVar.u;
            dxVar.L = ywVar.w;
            dxVar.I = ywVar.t;
            dxVar.K = ywVar.v;
            dxVar.N = ywVar.x;
            dxVar.M = ywVar.y;
            dxVar.G = ywVar.getMarginEnd();
            dxVar.H = ywVar.getMarginStart();
            int visibility = childAt.getVisibility();
            a.fx fxVar = cxVar.b;
            fxVar.f162a = visibility;
            fxVar.c = childAt.getAlpha();
            float rotation = childAt.getRotation();
            a.gx gxVar = cxVar.e;
            gxVar.f195a = rotation;
            gxVar.b = childAt.getRotationX();
            gxVar.c = childAt.getRotationY();
            gxVar.d = childAt.getScaleX();
            gxVar.e = childAt.getScaleY();
            float pivotX = childAt.getPivotX();
            float pivotY = childAt.getPivotY();
            if (pivotX != 0.0d || pivotY != 0.0d) {
                gxVar.f = pivotX;
                gxVar.g = pivotY;
            }
            gxVar.h = childAt.getTranslationX();
            gxVar.i = childAt.getTranslationY();
            gxVar.j = childAt.getTranslationZ();
            if (gxVar.k) {
                gxVar.l = childAt.getElevation();
            }
            if (childAt instanceof androidx.constraintlayout.widget.Barrier) {
                androidx.constraintlayout.widget.Barrier barrier = (androidx.constraintlayout.widget.Barrier) childAt;
                dxVar.i0 = barrier.mBarrier.g0;
                dxVar.d0 = barrier.getReferencedIds();
                dxVar.a0 = barrier.getType();
                dxVar.b0 = barrier.getMargin();
            }
            i2++;
            hxVar = this;
            childCount = i3;
        }
    }

    public final void e(android.content.Context context, int i) {
        android.content.res.XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    java.lang.String name = xml.getName();
                    a.cx d2 = d(context, android.util.Xml.asAttributeSet(xml));
                    if (name.equalsIgnoreCase("Guideline")) {
                        d2.d.f111a = true;
                    }
                    this.c.put(java.lang.Integer.valueOf(d2.f86a), d2);
                }
            }
        } catch (java.io.IOException e2) {
            e2.printStackTrace();
        } catch (org.xmlpull.v1.XmlPullParserException e3) {
            e3.printStackTrace();
        }
    }
}
