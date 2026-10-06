package com.omarea.vtools.activities;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ActivityFpsSessions extends a.p5 implements a.bk {
    public static final /* synthetic */ a.gu0[] t;
    public a.r51 p;
    public a.qi1 q;
    public boolean r;
    public final a.yq1 d = a.b20.i(this, 2131363330);
    public final a.yq1 e = a.b20.i(this, 2131363302);
    public final a.yq1 f = a.b20.i(this, 2131362139);
    public final a.yq1 g = a.b20.i(this, 2131362141);
    public final a.yq1 h = a.b20.i(this, 2131362157);
    public final a.yq1 i = a.b20.i(this, 2131362158);
    public final a.yq1 j = a.b20.i(this, 2131362189);
    public final a.yq1 k = a.b20.i(this, 2131362191);
    public final a.yq1 l = a.b20.i(this, 2131362192);
    public final a.yq1 m = a.b20.i(this, 2131362205);
    public final a.yq1 n = a.b20.i(this, 2131362206);
    public final a.yq1 o = a.b20.i(this, 2131362514);
    public int s = -1;

    static {
        a.d81 d81Var = new a.d81(com.omarea.vtools.activities.ActivityFpsSessions.class, "upload_settings", "getUpload_settings()Landroid/widget/ImageView;");
        a.na1.f375a.getClass();
        t = new a.gu0[]{d81Var, new a.d81(com.omarea.vtools.activities.ActivityFpsSessions.class, "trace_settings", "getTrace_settings()Landroid/widget/ImageView;"), new a.d81(com.omarea.vtools.activities.ActivityFpsSessions.class, "chart_add", "getChart_add()Landroid/widget/ImageView;"), new a.d81(com.omarea.vtools.activities.ActivityFpsSessions.class, "chart_apps_list", "getChart_apps_list()Landroidx/recyclerview/widget/RecyclerView;"), new a.d81(com.omarea.vtools.activities.ActivityFpsSessions.class, "chart_delete", "getChart_delete()Landroid/widget/ImageView;"), new a.d81(com.omarea.vtools.activities.ActivityFpsSessions.class, "chart_delete_confirm", "getChart_delete_confirm()Landroid/widget/ImageView;"), new a.d81(com.omarea.vtools.activities.ActivityFpsSessions.class, "chart_os", "getChart_os()Landroid/widget/TextView;"), new a.d81(com.omarea.vtools.activities.ActivityFpsSessions.class, "chart_phone", "getChart_phone()Landroid/widget/TextView;"), new a.d81(com.omarea.vtools.activities.ActivityFpsSessions.class, "chart_platform", "getChart_platform()Landroid/widget/TextView;"), new a.d81(com.omarea.vtools.activities.ActivityFpsSessions.class, "chart_sessions", "getChart_sessions()Landroidx/recyclerview/widget/RecyclerView;"), new a.d81(com.omarea.vtools.activities.ActivityFpsSessions.class, "chart_sessions_empty", "getChart_sessions_empty()Landroid/widget/TextView;"), new a.d81(com.omarea.vtools.activities.ActivityFpsSessions.class, "fps_device_info", "getFps_device_info()Lcom/omarea/ui/BlurViewLinearLayout;")};
    }

    @Override // a.p5
    public final void autoLayout(android.content.res.Configuration configuration) {
        super.autoLayout(configuration);
        ((com.omarea.ui.BlurViewLinearLayout) this.o.a(t[11])).setVisibility(getDisplayRatio() > 1.7777778f ? 0 : 8);
    }

    @Override // a.bk
    public final void b(int i) {
        a.e91 adapter = s().getAdapter();
        a.wv.t(adapter, "null cannot be cast to non-null type com.omarea.ui.fps.AdapterSessions");
        java.lang.Object obj = ((a.dk) adapter).j.get(i);
        a.wv.v(obj, "filterResult[position]");
        com.omarea.model.FpsWatchSession fpsWatchSession = (com.omarea.model.FpsWatchSession) obj;
        android.content.Intent intent = new android.content.Intent(getContext(), (java.lang.Class<?>) com.omarea.vtools.activities.ActivityFpsSession.class);
        java.lang.Long l = fpsWatchSession.sessionId;
        a.wv.v(l, "item.sessionId");
        intent.putExtra("sessionId", l.longValue());
        intent.putExtra("appName", fpsWatchSession.appName);
        intent.putExtra("packageName", fpsWatchSession.packageName);
        java.lang.Long l2 = fpsWatchSession.beginTime;
        a.wv.v(l2, "item.beginTime");
        intent.putExtra("beginTime", l2.longValue());
        startActivity(intent);
    }

    public final void o(java.util.List list) {
        a.cp cpVar = com.omarea.Scene.c;
        if (a.fs1.D().getBoolean("sync_delete_cloud", false)) {
            a.wv.M0(a.wv.b(a.z80.b), null, new a.y9(list, null), 3);
            return;
        }
        int i = a.x60.f681a;
        java.lang.String string = getString(2131952290);
        a.wv.v(string, "getString(R.string.fps_delete_cloud)");
        java.lang.String string2 = getString(2131952291);
        a.wv.v(string2, "getString(R.string.fps_delete_cloud_desc)");
        a.fs1.i(this, string, string2, new a.fw(28, list), null).b(false);
    }

    @Override // a.p5, a.ml, a.kk0, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(android.content.res.Configuration configuration) {
        a.wv.w(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        autoLayout(configuration);
    }

    @Override // a.p5, a.kk0, androidx.activity.ComponentActivity, a.nw, android.app.Activity
    public final void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131558453);
        setBackArrow();
        this.p = new a.r51(this);
        a.gu0[] gu0VarArr = t;
        final int i = 0;
        ((android.widget.ImageView) this.d.a(gu0VarArr[0])).setOnClickListener(new a.t9(this));
        final int i2 = 1;
        ((android.widget.ImageView) this.e.a(gu0VarArr[1])).setOnClickListener(new a.t9(this));
        android.widget.TextView textView = (android.widget.TextView) this.l.a(gu0VarArr[8]);
        java.lang.String upperCase = a.gy.u().toUpperCase(java.util.Locale.ROOT);
        a.wv.v(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        textView.setText(upperCase);
        android.widget.TextView textView2 = (android.widget.TextView) this.k.a(gu0VarArr[7]);
        java.lang.String w = a.gy.w();
        if (w == null) {
            w = android.os.Build.MODEL;
        }
        textView2.setText(w);
        ((android.widget.TextView) this.j.a(gu0VarArr[6])).setText(a.wv.x1(android.os.Build.VERSION.SDK_INT));
        getContext();
        s().setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(1));
        final int i3 = 2;
        q().setOnClickListener(new a.t9(this));
        final int i4 = 4;
        final int i5 = 3;
        ((android.widget.ImageView) this.h.a(gu0VarArr[4])).setOnClickListener(new a.t9(this));
        ((android.widget.ImageView) this.i.a(gu0VarArr[5])).setOnClickListener(new a.t9(this));
        a.p5.autoLayout$default(this, null, 1, null);
    }

    @Override // a.p5, a.ml, a.kk0, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
    }

    @Override // a.kk0, android.app.Activity
    public final void onPause() {
        super.onPause();
    }

    @Override // a.ml, a.kk0, android.app.Activity
    public final void onPostResume() {
        super.onPostResume();
        getDelegate().f();
        setTitle(2131952900);
    }

    @Override // a.p5, a.kk0, android.app.Activity
    public final void onResume() {
        super.onResume();
        q().setRotation(a.wv.e(a.ag0.w.q(), java.lang.Boolean.TRUE) ? 45.0f : 0.0f);
        if (isDestroyed()) {
            return;
        }
        a.wv.M0(a.wv.b(a.z80.b), null, new a.aa(this, false, null), 3);
    }

    public final void p() {
        this.r = false;
        a.gu0[] gu0VarArr = t;
        ((android.widget.ImageView) this.h.a(gu0VarArr[4])).setVisibility(0);
        q().setVisibility(0);
        ((android.widget.ImageView) this.i.a(gu0VarArr[5])).setVisibility(8);
        a.e91 adapter = r().getAdapter();
        a.wv.t(adapter, "null cannot be cast to non-null type com.omarea.ui.apps.AdapterAppIconList");
        a.jh jhVar = (a.jh) adapter;
        jhVar.k = false;
        jhVar.f();
    }

    public final android.widget.ImageView q() {
        return (android.widget.ImageView) this.f.a(t[2]);
    }

    public final androidx.recyclerview.widget.RecyclerView r() {
        return (androidx.recyclerview.widget.RecyclerView) this.g.a(t[3]);
    }

    public final androidx.recyclerview.widget.RecyclerView s() {
        return (androidx.recyclerview.widget.RecyclerView) this.m.a(t[9]);
    }
}
