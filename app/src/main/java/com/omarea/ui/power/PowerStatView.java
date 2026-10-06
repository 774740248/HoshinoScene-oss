package com.omarea.ui.power;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class PowerStatView extends android.view.View {
    public static final /* synthetic */ int w = 0;
    public final a.au c;
    public final a.gy d;
    public int e;
    public boolean f;
    public final android.graphics.Paint g;
    public final android.graphics.Paint h;
    public final android.graphics.DashPathEffect i;
    public final int[] j;
    public final int[] k;
    public final int l;
    public final float m;
    public final float n;
    public final float o;
    public final int p;
    public final int q;
    public final int r;
    public final a.vj1 s;
    public android.graphics.Bitmap t;
    public final a.rx0 u;
    public boolean v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r4v2, types: [a.gy, java.lang.Object] */
    public PowerStatView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        a.wv.w(context, "context");
        a.wv.w(attributeSet, "attrs");
        this.c = a.au.f();
        this.d = new a.gy();
        this.f = true;
        this.g = new android.graphics.Paint();
        android.graphics.Paint paint = new android.graphics.Paint(1);
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        paint.setStrokeWidth(2.0f);
        paint.setColor(-3355444);
        paint.setAlpha(128);
        this.h = paint;
        this.i = new android.graphics.DashPathEffect(new float[]{4.0f, 4.0f}, 2.0f);
        this.j = new int[]{10, 15, 30, 45, 60, 90, 120, 150, 180, 240, 300, 360, 420, 480, 540, 600, 660, 720, 960, 1200, 1440};
        this.k = new int[]{10, 6, 12, 9, 12, 9, 12, 10, 12, 12, 10, 12, 7, 8, 9, 10, 11, 12, 8, 12, 12};
        this.l = 20;
        this.m = 7.0f;
        this.n = 23.0f;
        this.o = 36.0f;
        int parseColor = android.graphics.Color.parseColor("#fdbb00");
        this.p = parseColor;
        this.q = android.graphics.Color.parseColor("#FF3A3A");
        this.r = android.graphics.Color.argb(0, android.graphics.Color.red(parseColor), android.graphics.Color.green(parseColor), android.graphics.Color.blue(parseColor));
        this.s = new a.vj1(new a.cd1(19, this));
        a.cp cpVar = com.omarea.Scene.c;
        this.u = new a.rx0(a.fs1.t(), true, 4);
        this.v = true;
    }

    public static int a(float f, int i, int i2) {
        float B = a.wv.B(f, 0.0f, 1.0f);
        return android.graphics.Color.argb(android.graphics.Color.alpha(i) + ((int) ((android.graphics.Color.alpha(i2) - android.graphics.Color.alpha(i)) * B)), android.graphics.Color.red(i) + ((int) ((android.graphics.Color.red(i2) - android.graphics.Color.red(i)) * B)), android.graphics.Color.green(i) + ((int) ((android.graphics.Color.green(i2) - android.graphics.Color.green(i)) * B)), android.graphics.Color.blue(i) + ((int) ((android.graphics.Color.blue(i2) - android.graphics.Color.blue(i)) * B)));
    }

    private final a.du getChartStyles() {
        return (a.du) this.s.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x02f7 A[LOOP:5: B:90:0x0279->B:105:0x02f7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02fd A[EDGE_INSN: B:106:0x02fd->B:107:0x02fd BREAK  A[LOOP:5: B:90:0x0279->B:105:0x02f7], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x01d8 A[EDGE_INSN: B:308:0x01d8->B:307:0x01d8 BREAK  A[LOOP:2: B:63:0x01b9->B:66:0x01d3], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0280  */
    /* JADX WARN: Type inference failed for: r10v6, types: [a.ja1, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            Method dump skipped, instructions count: 2213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.omarea.ui.power.PowerStatView.b():void");
    }

    public final int getColorAccent() {
        return getResources().getColor(2131099704);
    }

    public final boolean getLadder() {
        return this.f;
    }

    public final int getSessionId() {
        return this.e;
    }

    public final boolean getShowIcons() {
        return this.v;
    }

    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas canvas) {
        a.wv.w(canvas, "originCanvas");
        super.onDraw(canvas);
        android.graphics.Bitmap bitmap = this.t;
        if (bitmap == null) {
            a.wv.M0(a.wv.b(a.z80.f728a), null, new a.m61(this, null), 3);
        } else {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (android.graphics.Paint) null);
            this.t = null;
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (i == 0) {
            this.t = null;
            invalidate();
        }
    }

    public final void setLadder(boolean z) {
        if (this.f != z) {
            this.f = z;
            this.t = null;
            invalidate();
        }
    }

    public final void setSessionId(int i) {
        if (this.e != i) {
            this.e = i;
            this.t = null;
            post(new a.fw(22, this));
        }
    }

    public final void setShowIcons(boolean z) {
        this.v = z;
    }
}
