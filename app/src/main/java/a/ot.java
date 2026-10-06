package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ot extends android.util.Property {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f422a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ot(java.lang.Class cls, java.lang.String str, int i) {
        super(cls, str);
        this.f422a = i;
    }

    public final java.lang.Float a(android.view.View view) {
        switch (this.f422a) {
            case 5:
                return java.lang.Float.valueOf(a.yr1.f718a.a0(view));
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_WRITE /* 6 */:
            default:
                java.util.WeakHashMap weakHashMap = a.jq1.f264a;
                return java.lang.Float.valueOf(a.sp1.e(view));
            case 7:
                return java.lang.Float.valueOf(view.getLayoutParams().width);
            case 8:
                return java.lang.Float.valueOf(view.getLayoutParams().height);
            case 9:
                java.util.WeakHashMap weakHashMap2 = a.jq1.f264a;
                return java.lang.Float.valueOf(a.sp1.f(view));
        }
    }

    public final void b(a.rt rtVar, android.graphics.PointF pointF) {
        switch (this.f422a) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                rtVar.getClass();
                rtVar.f505a = java.lang.Math.round(pointF.x);
                int round = java.lang.Math.round(pointF.y);
                rtVar.b = round;
                int i = rtVar.f + 1;
                rtVar.f = i;
                if (i == rtVar.g) {
                    a.yr1.a(rtVar.e, rtVar.f505a, round, rtVar.c, rtVar.d);
                    rtVar.f = 0;
                    rtVar.g = 0;
                    return;
                }
                return;
            default:
                rtVar.getClass();
                rtVar.c = java.lang.Math.round(pointF.x);
                int round2 = java.lang.Math.round(pointF.y);
                rtVar.d = round2;
                int i2 = rtVar.g + 1;
                rtVar.g = i2;
                if (rtVar.f == i2) {
                    a.yr1.a(rtVar.e, rtVar.f505a, rtVar.b, rtVar.c, round2);
                    rtVar.f = 0;
                    rtVar.g = 0;
                    return;
                }
                return;
        }
    }

    public final void c(android.view.View view, android.graphics.PointF pointF) {
        switch (this.f422a) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                a.yr1.a(view, view.getLeft(), view.getTop(), java.lang.Math.round(pointF.x), java.lang.Math.round(pointF.y));
                return;
            case 3:
                a.yr1.a(view, java.lang.Math.round(pointF.x), java.lang.Math.round(pointF.y), view.getRight(), view.getBottom());
                return;
            default:
                int round = java.lang.Math.round(pointF.x);
                int round2 = java.lang.Math.round(pointF.y);
                a.yr1.a(view, round, round2, view.getWidth() + round, view.getHeight() + round2);
                return;
        }
    }

    public final void d(android.view.View view, java.lang.Float f) {
        switch (this.f422a) {
            case 5:
                a.yr1.f718a.b0(view, f.floatValue());
                return;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_WRITE /* 6 */:
            default:
                java.util.WeakHashMap weakHashMap = a.jq1.f264a;
                a.sp1.k(view, a.sp1.f(view), view.getPaddingTop(), f.intValue(), view.getPaddingBottom());
                return;
            case 7:
                view.getLayoutParams().width = f.intValue();
                view.requestLayout();
                return;
            case 8:
                view.getLayoutParams().height = f.intValue();
                view.requestLayout();
                return;
            case 9:
                int intValue = f.intValue();
                int paddingTop = view.getPaddingTop();
                java.util.WeakHashMap weakHashMap2 = a.jq1.f264a;
                a.sp1.k(view, intValue, paddingTop, a.sp1.e(view), view.getPaddingBottom());
                return;
        }
    }

    @Override // android.util.Property
    public final java.lang.Object get(java.lang.Object obj) {
        switch (this.f422a) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                return null;
            case 1:
                return null;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                return null;
            case 3:
                return null;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_READ_ERROR /* 4 */:
                return null;
            case 5:
                return a((android.view.View) obj);
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_WRITE /* 6 */:
                java.util.WeakHashMap weakHashMap = a.jq1.f264a;
                return a.tp1.a((android.view.View) obj);
            case 7:
                return a((android.view.View) obj);
            case 8:
                return a((android.view.View) obj);
            case 9:
                return a((android.view.View) obj);
            default:
                return a((android.view.View) obj);
        }
    }

    @Override // android.util.Property
    public final void set(java.lang.Object obj, java.lang.Object obj2) {
        switch (this.f422a) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                b((a.rt) obj, (android.graphics.PointF) obj2);
                return;
            case 1:
                b((a.rt) obj, (android.graphics.PointF) obj2);
                return;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                c((android.view.View) obj, (android.graphics.PointF) obj2);
                return;
            case 3:
                c((android.view.View) obj, (android.graphics.PointF) obj2);
                return;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_READ_ERROR /* 4 */:
                c((android.view.View) obj, (android.graphics.PointF) obj2);
                return;
            case 5:
                d((android.view.View) obj, (java.lang.Float) obj2);
                return;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_WRITE /* 6 */:
                java.util.WeakHashMap weakHashMap = a.jq1.f264a;
                a.tp1.c((android.view.View) obj, (android.graphics.Rect) obj2);
                return;
            case 7:
                d((android.view.View) obj, (java.lang.Float) obj2);
                return;
            case 8:
                d((android.view.View) obj, (java.lang.Float) obj2);
                return;
            case 9:
                d((android.view.View) obj, (java.lang.Float) obj2);
                return;
            default:
                d((android.view.View) obj, (java.lang.Float) obj2);
                return;
        }
    }
}
