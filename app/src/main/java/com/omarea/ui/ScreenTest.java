package com.omarea.ui;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ScreenTest extends android.view.View {
    public final java.util.ArrayList c;
    public a.sf1 d;
    public final android.graphics.Paint e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScreenTest(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        a.wv.w(context, "context");
        a.wv.w(attributeSet, "attrs");
        a.sf1 sf1Var = a.sf1.c;
        this.c = a.b20.f(sf1Var, a.sf1.d, a.sf1.e, a.sf1.f, a.sf1.g, a.sf1.h, a.sf1.i, a.sf1.j, a.sf1.k, a.sf1.l, a.sf1.m);
        this.d = sf1Var;
        this.e = new android.graphics.Paint();
    }

    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas canvas) {
        a.wv.w(canvas, "canvas");
        android.graphics.Paint paint = this.e;
        paint.reset();
        switch (this.d.ordinal()) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                paint.setColor(-65536);
                break;
            case 1:
                paint.setColor(-16711936);
                break;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                paint.setColor(-16776961);
                break;
            case 3:
                paint.setColor(-1);
                break;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_READ_ERROR /* 4 */:
                paint.setColor(-16777216);
                break;
            case 5:
                paint.setColor(-7829368);
                break;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_WRITE /* 6 */:
                paint.setColor(android.graphics.Color.argb(255, 40, 40, 40));
                break;
            case 7:
                paint.setShader(new android.graphics.LinearGradient(0.0f, 0.0f, 0.0f, canvas.getHeight(), new int[]{-1, -16777216}, (float[]) null, android.graphics.Shader.TileMode.CLAMP));
                break;
            case 8:
                paint.setShader(new android.graphics.LinearGradient(0.0f, 0.0f, 0.0f, canvas.getHeight(), new int[]{-16777216, -1}, (float[]) null, android.graphics.Shader.TileMode.CLAMP));
                break;
            case 9:
                paint.setShader(new android.graphics.LinearGradient(0.0f, 0.0f, canvas.getWidth(), 0.0f, new int[]{-1, -16777216}, (float[]) null, android.graphics.Shader.TileMode.CLAMP));
                break;
            case 10:
                paint.setShader(new android.graphics.LinearGradient(0.0f, 0.0f, canvas.getWidth(), 0.0f, new int[]{-16777216, -1}, (float[]) null, android.graphics.Shader.TileMode.CLAMP));
                break;
        }
        canvas.drawRect(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), paint);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        if (motionEvent != null && motionEvent.getAction() == 0) {
            a.sf1 sf1Var = this.d;
            java.util.ArrayList arrayList = this.c;
            java.lang.Object obj = arrayList.get((arrayList.indexOf(sf1Var) + 1) % arrayList.size());
            a.wv.v(obj, "steps[index]");
            this.d = (a.sf1) obj;
            invalidate();
        }
        return super.onTouchEvent(motionEvent);
    }
}
