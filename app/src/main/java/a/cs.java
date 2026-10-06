package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class cs {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f79a;
    public int b;
    public boolean c;
    public final java.lang.Runnable d;
    public final /* synthetic */ a.jy e;

    public cs(com.google.android.material.sidesheet.SideSheetBehavior sideSheetBehavior) {
        this.f79a = 1;
        this.e = (jy) sideSheetBehavior;
        this.d = new a.fw(5, this);
    }

    public final void a(int i) {
        int i2 = this.f79a;
        java.lang.Runnable runnable = this.d;
        a.jy jyVar = this.e;
        switch (i2) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                com.google.android.material.bottomsheet.BottomSheetBehavior bottomSheetBehavior = (com.google.android.material.bottomsheet.BottomSheetBehavior) jyVar;
                java.lang.ref.WeakReference weakReference = bottomSheetBehavior.U;
                if (weakReference == null || weakReference.get() == null) {
                    return;
                }
                this.b = i;
                if (this.c) {
                    return;
                }
                android.view.View view = (android.view.View) bottomSheetBehavior.U.get();
                java.util.WeakHashMap weakHashMap = a.jq1.f264a;
                a.rp1.m(view, runnable);
                this.c = true;
                return;
            default:
                com.google.android.material.sidesheet.SideSheetBehavior sideSheetBehavior = (com.google.android.material.sidesheet.SideSheetBehavior) jyVar;
                java.lang.ref.WeakReference weakReference2 = sideSheetBehavior.viewRef;
                if (weakReference2 == null || weakReference2.get() == null) {
                    return;
                }
                this.b = i;
                if (this.c) {
                    return;
                }
                android.view.View view2 = (android.view.View) sideSheetBehavior.viewRef.get();
                java.util.WeakHashMap weakHashMap2 = a.jq1.f264a;
                a.rp1.m(view2, runnable);
                this.c = true;
                return;
        }
    }

    public cs(com.google.android.material.bottomsheet.BottomSheetBehavior bottomSheetBehavior) {
        this.f79a = 0;
        this.e = (jy) bottomSheetBehavior;
        this.d = new a.hw(10, this);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cs(com.google.android.material.bottomsheet.BottomSheetBehavior bottomSheetBehavior, int i) {
        this(bottomSheetBehavior);
        this.f79a = 0;
    }
}
