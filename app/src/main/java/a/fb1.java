package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class fb1 extends android.app.Fragment {
    public static final /* synthetic */ int d = 0;
    public a.j71 c;

    public final void a(a.ev0 ev0Var) {
        if (android.os.Build.VERSION.SDK_INT < 29) {
            android.app.Activity activity = getActivity();
            a.wv.v(activity, "activity");
            a.fa0.h(activity, ev0Var);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(android.os.Bundle bundle) {
        super.onActivityCreated(bundle);
        a(a.ev0.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        a(a.ev0.ON_DESTROY);
        this.c = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        a(a.ev0.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        a.j71 j71Var = this.c;
        if (j71Var != null) {
            j71Var.f248a.a();
        }
        a(a.ev0.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        a.j71 j71Var = this.c;
        if (j71Var != null) {
            a.k71 k71Var = j71Var.f248a;
            int i = k71Var.c + 1;
            k71Var.c = i;
            if (i == 1 && k71Var.f) {
                k71Var.h.e(a.ev0.ON_START);
                k71Var.f = false;
            }
        }
        a(a.ev0.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        a(a.ev0.ON_STOP);
    }
}
