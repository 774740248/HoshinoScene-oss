package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class e9 extends a.uu0 implements a.qo0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ java.lang.Object e;
    public final /* synthetic */ java.lang.Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e9(java.lang.Object obj, int i, java.lang.Object obj2) {
        super(0);
        this.d = i;
        this.e = obj;
        this.f = obj2;
    }

    public final void a() {
        java.lang.Object I;
        int i = this.d;
        java.lang.Object obj = this.f;
        java.lang.Object obj2 = this.e;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                final com.omarea.vtools.activities.ActivityFpsSession activityFpsSession = (com.omarea.vtools.activities.ActivityFpsSession) obj2;
                java.lang.String e = a.ii1.e((java.lang.String) obj, ".jpg");
                a.gu0[] gu0VarArr = com.omarea.vtools.activities.ActivityFpsSession.I0;
                final int paddingTop = activityFpsSession.y().getPaddingTop();
                final int paddingBottom = activityFpsSession.y().getPaddingBottom();
                int M = a.b20.M(activityFpsSession, 16.0f);
                a.ej1 ej1Var = new a.ej1(activityFpsSession, activityFpsSession.getThemeMode());
                ej1Var.f = new a.tb1(M, 5, activityFpsSession);
                ej1Var.e = new a.y8();
                ej1Var.l(activityFpsSession.y(), e);
                return;
            case 1:
                com.omarea.vtools.activities.ActivityOtherSettings activityOtherSettings = (com.omarea.vtools.activities.ActivityOtherSettings) obj2;
                android.graphics.Bitmap bitmap = (android.graphics.Bitmap) ((a.ma1) obj).c;
                float f = 1;
                a.vj1 vj1Var = a.ql1.f470a;
                try {
                    a.cp cpVar = com.omarea.Scene.c;
                    java.lang.Object systemService = a.fs1.t().getSystemService("window");
                    a.wv.t(systemService, "null cannot be cast to non-null type android.view.WindowManager");
                    android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
                    ((android.view.WindowManager) systemService).getDefaultDisplay().getRealMetrics(displayMetrics);
                    I = new android.graphics.Point(displayMetrics.widthPixels, displayMetrics.heightPixels);
                } catch (java.lang.Throwable th) {
                    I = a.b20.I(th);
                }
                java.lang.Object point = new android.graphics.Point(0, 0);
                if (I instanceof a.ac1) {
                    I = point;
                }
                android.graphics.Point point2 = (android.graphics.Point) I;
                android.graphics.Bitmap R = a.b20.R(bitmap, java.lang.Float.valueOf(f / (point2.y / point2.x)));
                a.cp cpVar2 = com.omarea.Scene.c;
                if (a.fs1.D().getBoolean("theme_bg_blur", false)) {
                    R = a.b20.P(R, R.getWidth() / 10, false);
                }
                a.gu0[] gu0VarArr2 = com.omarea.vtools.activities.ActivityOtherSettings.t;
                activityOtherSettings.getClass();
                java.lang.String str = a.pe0.f434a;
                a.fs1.M(R, a.pe0.d(activityOtherSettings.getContext(), "windowBg.jpg"), java.lang.Boolean.FALSE);
                a.fs1.D().edit().putInt("app_theme5", 10).apply();
                activityOtherSettings.p();
                return;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                a.fa0 fa0Var = com.omarea.vtools.activities.ActivityPerfOptions.f;
                com.omarea.ui.SwitchOptionItemView switchOptionItemView = (com.omarea.ui.SwitchOptionItemView) obj2;
                android.content.Context context = switchOptionItemView.getContext();
                a.wv.v(context, "context");
                java.lang.String str2 = (java.lang.String) ((a.en1) obj).c;
                java.lang.String string = switchOptionItemView.getContext().getString(2131953367);
                a.wv.v(string, "context.getString(R.string.schedule_bypass_power)");
                fa0Var.getClass();
                a.fa0.y(context, 2131886088, str2, string);
                return;
            default:
                ((a.ag0) obj2).f = 0;
                for (android.widget.TextView textView : (android.widget.TextView[]) obj) {
                    textView.setAlpha(0.3f);
                }
                return;
        }
    }

    @Override // a.qo0
    public final /* bridge */ /* synthetic */ java.lang.Object b() {
        a.no1 no1Var = a.no1.f387a;
        switch (this.d) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a();
                return no1Var;
            case 1:
                a();
                return no1Var;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                a();
                return no1Var;
            default:
                a();
                return no1Var;
        }
    }
}
