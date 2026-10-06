package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class dx {

    public dx() {
    }

    public static final android.util.SparseIntArray j0;
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public float O;
    public float P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public int V;
    public int W;
    public int X;
    public float Y;
    public float Z;

    /* renamed from: a, reason: collision with root package name */
    public boolean f111a;
    public int a0;
    public int b;
    public int b0;
    public int c;
    public int c0;
    public int d;
    public int[] d0;
    public int e;
    public java.lang.String e0;
    public float f;
    public java.lang.String f0;
    public int g;
    public boolean g0;
    public int h;
    public boolean h0;
    public int i;
    public boolean i0;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public float t;
    public float u;
    public java.lang.String v;
    public int w;
    public int x;
    public float y;
    public int z;

    static {
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        j0 = sparseIntArray;
        sparseIntArray.append(38, 24);
        sparseIntArray.append(39, 25);
        sparseIntArray.append(41, 28);
        sparseIntArray.append(42, 29);
        sparseIntArray.append(47, 35);
        sparseIntArray.append(46, 34);
        sparseIntArray.append(20, 4);
        sparseIntArray.append(19, 3);
        sparseIntArray.append(17, 1);
        sparseIntArray.append(55, 6);
        sparseIntArray.append(56, 7);
        sparseIntArray.append(27, 17);
        sparseIntArray.append(28, 18);
        sparseIntArray.append(29, 19);
        sparseIntArray.append(0, 26);
        sparseIntArray.append(43, 31);
        sparseIntArray.append(44, 32);
        sparseIntArray.append(26, 10);
        sparseIntArray.append(25, 9);
        sparseIntArray.append(59, 13);
        sparseIntArray.append(62, 16);
        sparseIntArray.append(60, 14);
        sparseIntArray.append(57, 11);
        sparseIntArray.append(61, 15);
        sparseIntArray.append(58, 12);
        sparseIntArray.append(50, 38);
        sparseIntArray.append(36, 37);
        sparseIntArray.append(35, 39);
        sparseIntArray.append(49, 40);
        sparseIntArray.append(34, 20);
        sparseIntArray.append(48, 36);
        sparseIntArray.append(24, 5);
        sparseIntArray.append(37, 76);
        sparseIntArray.append(45, 76);
        sparseIntArray.append(40, 76);
        sparseIntArray.append(18, 76);
        sparseIntArray.append(16, 76);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(5, 27);
        sparseIntArray.append(7, 30);
        sparseIntArray.append(8, 8);
        sparseIntArray.append(4, 33);
        sparseIntArray.append(6, 2);
        sparseIntArray.append(1, 22);
        sparseIntArray.append(2, 21);
        sparseIntArray.append(21, 61);
        sparseIntArray.append(23, 62);
        sparseIntArray.append(22, 63);
        sparseIntArray.append(54, 69);
        sparseIntArray.append(33, 70);
        sparseIntArray.append(12, 71);
        sparseIntArray.append(10, 72);
        sparseIntArray.append(11, 73);
        sparseIntArray.append(13, 74);
        sparseIntArray.append(9, 75);
    }

    public final void a(android.content.Context context, android.util.AttributeSet attributeSet) {
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.m81.d);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            android.util.SparseIntArray sparseIntArray = j0;
            int i2 = sparseIntArray.get(index);
            if (i2 == 80) {
                this.g0 = obtainStyledAttributes.getBoolean(index, this.g0);
            } else if (i2 != 81) {
                switch (i2) {
                    case 1:
                        this.o = a.hx.f(obtainStyledAttributes, index, this.o);
                        break;
                    case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                        this.F = obtainStyledAttributes.getDimensionPixelSize(index, this.F);
                        break;
                    case 3:
                        this.n = a.hx.f(obtainStyledAttributes, index, this.n);
                        break;
                    case com.omarea.krscript.model.ShellHandlerBase.EVENT_READ_ERROR /* 4 */:
                        this.m = a.hx.f(obtainStyledAttributes, index, this.m);
                        break;
                    case 5:
                        this.v = obtainStyledAttributes.getString(index);
                        break;
                    case com.omarea.krscript.model.ShellHandlerBase.EVENT_WRITE /* 6 */:
                        this.z = obtainStyledAttributes.getDimensionPixelOffset(index, this.z);
                        break;
                    case 7:
                        this.A = obtainStyledAttributes.getDimensionPixelOffset(index, this.A);
                        break;
                    case 8:
                        this.G = obtainStyledAttributes.getDimensionPixelSize(index, this.G);
                        break;
                    case 9:
                        this.s = a.hx.f(obtainStyledAttributes, index, this.s);
                        break;
                    case 10:
                        this.r = a.hx.f(obtainStyledAttributes, index, this.r);
                        break;
                    case 11:
                        this.L = obtainStyledAttributes.getDimensionPixelSize(index, this.L);
                        break;
                    case 12:
                        this.M = obtainStyledAttributes.getDimensionPixelSize(index, this.M);
                        break;
                    case 13:
                        this.I = obtainStyledAttributes.getDimensionPixelSize(index, this.I);
                        break;
                    case 14:
                        this.K = obtainStyledAttributes.getDimensionPixelSize(index, this.K);
                        break;
                    case 15:
                        this.N = obtainStyledAttributes.getDimensionPixelSize(index, this.N);
                        break;
                    case 16:
                        this.J = obtainStyledAttributes.getDimensionPixelSize(index, this.J);
                        break;
                    case 17:
                        this.d = obtainStyledAttributes.getDimensionPixelOffset(index, this.d);
                        break;
                    case 18:
                        this.e = obtainStyledAttributes.getDimensionPixelOffset(index, this.e);
                        break;
                    case 19:
                        this.f = obtainStyledAttributes.getFloat(index, this.f);
                        break;
                    case 20:
                        this.t = obtainStyledAttributes.getFloat(index, this.t);
                        break;
                    case 21:
                        this.c = obtainStyledAttributes.getLayoutDimension(index, this.c);
                        break;
                    case 22:
                        this.b = obtainStyledAttributes.getLayoutDimension(index, this.b);
                        break;
                    case 23:
                        this.C = obtainStyledAttributes.getDimensionPixelSize(index, this.C);
                        break;
                    case 24:
                        this.g = a.hx.f(obtainStyledAttributes, index, this.g);
                        break;
                    case 25:
                        this.h = a.hx.f(obtainStyledAttributes, index, this.h);
                        break;
                    case 26:
                        this.B = obtainStyledAttributes.getInt(index, this.B);
                        break;
                    case 27:
                        this.D = obtainStyledAttributes.getDimensionPixelSize(index, this.D);
                        break;
                    case 28:
                        this.i = a.hx.f(obtainStyledAttributes, index, this.i);
                        break;
                    case 29:
                        this.j = a.hx.f(obtainStyledAttributes, index, this.j);
                        break;
                    case 30:
                        this.H = obtainStyledAttributes.getDimensionPixelSize(index, this.H);
                        break;
                    case 31:
                        this.p = a.hx.f(obtainStyledAttributes, index, this.p);
                        break;
                    case 32:
                        this.q = a.hx.f(obtainStyledAttributes, index, this.q);
                        break;
                    case 33:
                        this.E = obtainStyledAttributes.getDimensionPixelSize(index, this.E);
                        break;
                    case 34:
                        this.l = a.hx.f(obtainStyledAttributes, index, this.l);
                        break;
                    case 35:
                        this.k = a.hx.f(obtainStyledAttributes, index, this.k);
                        break;
                    case 36:
                        this.u = obtainStyledAttributes.getFloat(index, this.u);
                        break;
                    case 37:
                        this.P = obtainStyledAttributes.getFloat(index, this.P);
                        break;
                    case 38:
                        this.O = obtainStyledAttributes.getFloat(index, this.O);
                        break;
                    case 39:
                        this.Q = obtainStyledAttributes.getInt(index, this.Q);
                        break;
                    case 40:
                        this.R = obtainStyledAttributes.getInt(index, this.R);
                        break;
                    default:
                        switch (i2) {
                            case 54:
                                this.S = obtainStyledAttributes.getInt(index, this.S);
                                break;
                            case 55:
                                this.T = obtainStyledAttributes.getInt(index, this.T);
                                break;
                            case 56:
                                this.U = obtainStyledAttributes.getDimensionPixelSize(index, this.U);
                                break;
                            case 57:
                                this.V = obtainStyledAttributes.getDimensionPixelSize(index, this.V);
                                break;
                            case 58:
                                this.W = obtainStyledAttributes.getDimensionPixelSize(index, this.W);
                                break;
                            case 59:
                                this.X = obtainStyledAttributes.getDimensionPixelSize(index, this.X);
                                break;
                            default:
                                switch (i2) {
                                    case 61:
                                        this.w = a.hx.f(obtainStyledAttributes, index, this.w);
                                        break;
                                    case 62:
                                        this.x = obtainStyledAttributes.getDimensionPixelSize(index, this.x);
                                        break;
                                    case 63:
                                        this.y = obtainStyledAttributes.getFloat(index, this.y);
                                        break;
                                    default:
                                        switch (i2) {
                                            case 69:
                                                this.Y = obtainStyledAttributes.getFloat(index, 1.0f);
                                                break;
                                            case 70:
                                                this.Z = obtainStyledAttributes.getFloat(index, 1.0f);
                                                break;
                                            case 71:
                                                android.util.Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                                break;
                                            case 72:
                                                this.a0 = obtainStyledAttributes.getInt(index, this.a0);
                                                break;
                                            case 73:
                                                this.b0 = obtainStyledAttributes.getDimensionPixelSize(index, this.b0);
                                                break;
                                            case 74:
                                                this.e0 = obtainStyledAttributes.getString(index);
                                                break;
                                            case 75:
                                                this.i0 = obtainStyledAttributes.getBoolean(index, this.i0);
                                                break;
                                            case 76:
                                                android.util.Log.w("ConstraintSet", "unused attribute 0x" + java.lang.Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                                                break;
                                            case 77:
                                                this.f0 = obtainStyledAttributes.getString(index);
                                                break;
                                            default:
                                                android.util.Log.w("ConstraintSet", "Unknown attribute 0x" + java.lang.Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                                                break;
                                        }
                                }
                        }
                }
            } else {
                this.h0 = obtainStyledAttributes.getBoolean(index, this.h0);
            }
        }
        obtainStyledAttributes.recycle();
    }
}
