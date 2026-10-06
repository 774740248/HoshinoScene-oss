package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class sk {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f527a;
    public final a.uk b;
    public final android.view.Window c;
    public java.lang.CharSequence d;
    public androidx.appcompat.app.AlertController.RecycleListView e;
    public android.widget.Button f;
    public android.widget.Button g;
    public android.widget.Button h;
    public androidx.core.widget.NestedScrollView i;
    public android.graphics.drawable.Drawable k;
    public android.widget.ImageView l;
    public android.widget.TextView m;
    public android.widget.TextView n;
    public android.view.View o;
    public android.widget.ListAdapter p;
    public final int r;
    public final int s;
    public final int t;
    public final int u;
    public final boolean v;
    public final a.qk w;
    public int j = 0;
    public int q = -1;
    public final a.mk x = new a.mk(0, this);

    public sk(android.content.Context context, a.uk ukVar, android.view.Window window) {
        this.f527a = context;
        this.b = ukVar;
        this.c = window;
        this.w = new a.qk(ukVar);
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, a.u81.e, 2130968616, 0);
        this.r = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.getResourceId(2, 0);
        this.s = obtainStyledAttributes.getResourceId(4, 0);
        obtainStyledAttributes.getResourceId(5, 0);
        this.t = obtainStyledAttributes.getResourceId(7, 0);
        this.u = obtainStyledAttributes.getResourceId(3, 0);
        this.v = obtainStyledAttributes.getBoolean(6, true);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        ukVar.g().i(1);
    }

    public static void a(android.view.View view, android.view.View view2, android.view.View view3) {
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            view3.setVisibility(view.canScrollVertically(1) ? 0 : 4);
        }
    }

    public static android.view.ViewGroup b(android.view.View view, android.view.View view2) {
        if (view == null) {
            if (view2 instanceof android.view.ViewStub) {
                view2 = ((android.view.ViewStub) view2).inflate();
            }
            return (android.view.ViewGroup) view2;
        }
        if (view2 != null) {
            android.view.ViewParent parent = view2.getParent();
            if (parent instanceof android.view.ViewGroup) {
                ((android.view.ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof android.view.ViewStub) {
            view = ((android.view.ViewStub) view).inflate();
        }
        return (android.view.ViewGroup) view;
    }
}
