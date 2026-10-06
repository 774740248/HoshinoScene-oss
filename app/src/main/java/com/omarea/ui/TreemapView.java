package com.omarea.ui;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class TreemapView extends android.view.View {
    public static final /* synthetic */ int N = 0;
    public a.bp0 A;
    public a.bp0 B;
    public a.bp0 C;
    public boolean D;
    public final java.util.HashMap E;
    public final java.util.HashSet F;
    public final java.util.HashSet G;
    public float H;
    public float I;
    public a.vn1 J;
    public boolean K;
    public final android.os.Handler L;
    public final a.fw M;
    public int c;
    public int d;
    public a.vn1 e;
    public final java.util.ArrayList f;
    public final java.util.ArrayList g;
    public boolean h;
    public int i;
    public final android.graphics.Paint j;
    public final android.graphics.Paint k;
    public final android.text.TextPaint l;
    public final android.graphics.Paint m;
    public final int[] n;
    public final int[] o;
    public final int p;
    public final int q;
    public float r;
    public float s;
    public float t;
    public float u;
    public float v;
    public float w;
    public float x;
    public a.bp0 y;
    public a.bp0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TreemapView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        a.wv.w(context, "context");
        a.wv.w(attributeSet, "attrs");
        this.f = new java.util.ArrayList();
        this.g = new java.util.ArrayList();
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setAntiAlias(true);
        android.graphics.Paint.Style style = android.graphics.Paint.Style.FILL;
        paint.setStyle(style);
        this.j = paint;
        android.graphics.Paint paint2 = new android.graphics.Paint();
        paint2.setAntiAlias(true);
        paint2.setStyle(android.graphics.Paint.Style.STROKE);
        paint2.setColor(872415231);
        this.k = paint2;
        android.text.TextPaint textPaint = new android.text.TextPaint();
        textPaint.setAntiAlias(true);
        textPaint.setColor(-1);
        textPaint.setTextAlign(android.graphics.Paint.Align.LEFT);
        this.l = textPaint;
        android.graphics.Paint paint3 = new android.graphics.Paint();
        paint3.setAntiAlias(true);
        paint3.setStyle(style);
        paint3.setColor(1929379840);
        this.m = paint3;
        this.n = new int[]{227, 242, 253};
        this.o = new int[]{21, 101, 192};
        this.p = -14796193;
        this.q = -1;
        this.r = 2.0f;
        this.D = true;
        this.E = new java.util.HashMap();
        this.F = new java.util.HashSet();
        this.G = new java.util.HashSet();
        this.L = new android.os.Handler(android.os.Looper.getMainLooper());
        this.M = new a.fw(19, this);
    }

    public static double d(java.util.ArrayList arrayList, double d) {
        double d2 = Double.MAX_VALUE;
        if (!arrayList.isEmpty()) {
            double d3 = 0.0d;
            if (d > 0.0d) {
                java.util.Iterator it = arrayList.iterator();
                double d4 = 0.0d;
                while (it.hasNext()) {
                    double doubleValue = ((java.lang.Number) it.next()).doubleValue();
                    d4 += doubleValue;
                    if (doubleValue > d3) {
                        d3 = doubleValue;
                    }
                    if (doubleValue < d2) {
                        d2 = doubleValue;
                    }
                }
                double d5 = d * d;
                double d6 = d4 * d4;
                return java.lang.Math.max((d3 * d5) / d6, d6 / (d5 * d2));
            }
        }
        return Double.MAX_VALUE;
    }

    public final a.vn1 a() {
        java.util.ArrayList arrayList = this.f;
        return arrayList.isEmpty() ? this.e : (a.vn1) a.qv.l2(arrayList);
    }

    public final void b(a.vn1 vn1Var) {
        if (!vn1Var.d || vn1Var.c != null || this.B == null || this.h) {
            return;
        }
        c(vn1Var, this.i, false);
    }

    public final void c(a.vn1 vn1Var, int i, boolean z) {
        a.bp0 bp0Var = this.B;
        if (bp0Var == null) {
            return;
        }
        this.h = true;
        invalidate();
        a.wv.M0(a.wv.b(a.z80.b), null, new a.zn1(bp0Var, vn1Var, this, i, z, null), 3);
    }

    public final java.lang.String getCurrentPath() {
        a.vn1 vn1Var = this.e;
        if (vn1Var == null) {
            return "";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(vn1Var.f637a);
        java.util.Iterator it = this.f.iterator();
        while (it.hasNext()) {
            a.vn1 vn1Var2 = (a.vn1) it.next();
            sb.append("/");
            sb.append(vn1Var2.f637a);
        }
        java.lang.String sb2 = sb.toString();
        a.wv.v(sb2, "sb.toString()");
        return sb2;
    }

    public final a.bp0 getDataLoader() {
        return this.B;
    }

    public final a.bp0 getIconLoader() {
        return this.C;
    }

    public final boolean getIconsEnabled() {
        return this.D;
    }

    public final a.bp0 getOnNodeClick() {
        return this.y;
    }

    public final a.bp0 getOnNodeLongClick() {
        return this.z;
    }

    public final a.bp0 getOnPathChange() {
        return this.A;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0489  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDraw(android.graphics.Canvas r36) {
        /*
            Method dump skipped, instructions count: 1702
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.omarea.ui.TreemapView.onDraw(android.graphics.Canvas):void");
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.d = i;
        this.c = i2;
        this.r = a.b20.N(this, 1.0f);
        this.s = a.b20.N(this, 6.0f);
        this.t = a.b20.N(this, 8.0f);
        this.u = a.b20.N(this, 16.0f);
        this.v = a.b20.N(this, 48.0f);
        this.w = a.b20.N(this, 13.0f);
        this.x = a.b20.N(this, 11.0f);
        this.l.setTextSize(this.w);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        a.wv.w(motionEvent, "event");
        int action = motionEvent.getAction();
        java.util.ArrayList arrayList = this.g;
        a.fw fwVar = this.M;
        android.os.Handler handler = this.L;
        a.vn1 vn1Var = null;
        if (action == 0) {
            this.H = motionEvent.getX();
            this.I = motionEvent.getY();
            this.K = false;
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            java.util.Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                a.un1 un1Var = (a.un1) it.next();
                if (un1Var.b.contains(x, y)) {
                    vn1Var = un1Var.f603a;
                    break;
                }
            }
            this.J = vn1Var;
            if (vn1Var != null && this.z != null) {
                handler.postDelayed(fwVar, android.view.ViewConfiguration.getLongPressTimeout());
            }
            return true;
        }
        if (action != 1) {
            if (action != 2) {
                if (action == 3) {
                    handler.removeCallbacks(fwVar);
                    this.J = null;
                }
                return super.onTouchEvent(motionEvent);
            }
            float x2 = motionEvent.getX() - this.H;
            float y2 = motionEvent.getY() - this.I;
            float f = (y2 * y2) + (x2 * x2);
            float f2 = this.t;
            if (f >= f2 * f2) {
                handler.removeCallbacks(fwVar);
                this.J = null;
            }
            return true;
        }
        float x3 = motionEvent.getX() - this.H;
        float y3 = motionEvent.getY() - this.I;
        handler.removeCallbacks(fwVar);
        this.J = null;
        if (!this.K) {
            float f3 = (y3 * y3) + (x3 * x3);
            float f4 = this.t;
            if (f3 < f4 * f4) {
                float x4 = motionEvent.getX();
                float y4 = motionEvent.getY();
                java.util.Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    a.un1 un1Var2 = (a.un1) it2.next();
                    if (un1Var2.b.contains(x4, y4)) {
                        vn1Var = un1Var2.f603a;
                        break;
                    }
                }
                if (vn1Var != null) {
                    a.bp0 bp0Var = this.y;
                    if (bp0Var != null) {
                        bp0Var.i(vn1Var);
                    }
                    if (vn1Var.d && !this.h) {
                        if (vn1Var.c == null) {
                            c(vn1Var, this.i, true);
                        } else if (!vn1Var.c.isEmpty()) {
                            this.f.add(vn1Var);
                            this.i++;
                            a.bp0 bp0Var2 = this.A;
                            if (bp0Var2 != null) {
                                bp0Var2.i(getCurrentPath());
                            }
                            invalidate();
                        }
                    }
                }
            }
        }
        return true;
    }

    public final void setData(a.vn1 vn1Var) {
        a.wv.w(vn1Var, "root");
        this.e = vn1Var;
        this.f.clear();
        this.i++;
        this.E.clear();
        this.F.clear();
        this.G.clear();
        a.bp0 bp0Var = this.A;
        if (bp0Var != null) {
            bp0Var.i(getCurrentPath());
        }
        invalidate();
        b(vn1Var);
    }

    public final void setDataLoader(a.bp0 bp0Var) {
        this.B = bp0Var;
    }

    public final void setIconLoader(a.bp0 bp0Var) {
        this.C = bp0Var;
    }

    public final void setIconsEnabled(boolean z) {
        this.D = z;
    }

    public final void setOnNodeClick(a.bp0 bp0Var) {
        this.y = bp0Var;
    }

    public final void setOnNodeLongClick(a.bp0 bp0Var) {
        this.z = bp0Var;
    }

    public final void setOnPathChange(a.bp0 bp0Var) {
        this.A = bp0Var;
    }
}
