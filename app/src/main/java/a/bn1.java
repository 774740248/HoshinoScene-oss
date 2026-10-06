package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class bn1 implements a.d20 {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.appcompat.widget.Toolbar f47a;
    public int b;
    public final android.view.View c;
    public android.graphics.drawable.Drawable d;
    public android.graphics.drawable.Drawable e;
    public final android.graphics.drawable.Drawable f;
    public final boolean g;
    public java.lang.CharSequence h;
    public final java.lang.CharSequence i;
    public final java.lang.CharSequence j;
    public android.view.Window.Callback k;
    public boolean l;
    public a.j2 m;
    public final int n;
    public final android.graphics.drawable.Drawable o;

    public bn1(androidx.appcompat.widget.Toolbar toolbar, boolean z) {
        android.graphics.drawable.Drawable drawable;
        this.n = 0;
        this.f47a = toolbar;
        this.h = toolbar.getTitle();
        this.i = toolbar.getSubtitle();
        this.g = this.h != null;
        this.f = toolbar.getNavigationIcon();
        a.nk G = a.nk.G(toolbar.getContext(), null, a.u81.f583a, 2130968581);
        int i = 15;
        this.o = G.l(15);
        if (z) {
            java.lang.CharSequence A = G.A(27);
            if (!android.text.TextUtils.isEmpty(A)) {
                this.g = true;
                this.h = A;
                if ((this.b & 8) != 0) {
                    androidx.appcompat.widget.Toolbar toolbar2 = this.f47a;
                    toolbar2.setTitle(A);
                    if (this.g) {
                        a.jq1.p(toolbar2.getRootView(), A);
                    }
                }
            }
            java.lang.CharSequence A2 = G.A(25);
            if (!android.text.TextUtils.isEmpty(A2)) {
                this.i = A2;
                if ((this.b & 8) != 0) {
                    toolbar.setSubtitle(A2);
                }
            }
            android.graphics.drawable.Drawable l = G.l(20);
            if (l != null) {
                this.e = l;
                c();
            }
            android.graphics.drawable.Drawable l2 = G.l(17);
            if (l2 != null) {
                this.d = l2;
                c();
            }
            if (this.f == null && (drawable = this.o) != null) {
                this.f = drawable;
                int i2 = this.b & 4;
                androidx.appcompat.widget.Toolbar toolbar3 = this.f47a;
                if (i2 != 0) {
                    toolbar3.setNavigationIcon(drawable);
                } else {
                    toolbar3.setNavigationIcon((android.graphics.drawable.Drawable) null);
                }
            }
            a(G.o(10, 0));
            int x = G.x(9, 0);
            if (x != 0) {
                android.view.View inflate = android.view.LayoutInflater.from(toolbar.getContext()).inflate(x, (android.view.ViewGroup) toolbar, false);
                android.view.View view = this.c;
                if (view != null && (this.b & 16) != 0) {
                    toolbar.removeView(view);
                }
                this.c = inflate;
                if (inflate != null && (this.b & 16) != 0) {
                    toolbar.addView(inflate);
                }
                a(this.b | 16);
            }
            int layoutDimension = ((android.content.res.TypedArray) G.e).getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                android.view.ViewGroup.LayoutParams layoutParams = toolbar.getLayoutParams();
                layoutParams.height = layoutDimension;
                toolbar.setLayoutParams(layoutParams);
            }
            int j = G.j(7, -1);
            int j2 = G.j(3, -1);
            if (j >= 0 || j2 >= 0) {
                int max = java.lang.Math.max(j, 0);
                int max2 = java.lang.Math.max(j2, 0);
                toolbar.ensureMenu();
                toolbar.mContentInsets.a(max, max2);
            }
            int x2 = G.x(28, 0);
            if (x2 != 0) {
                android.content.Context context = toolbar.getContext();
                toolbar.mTitleTextAppearance = x2;
                a.vn vnVar = toolbar.mTitleTextView;
                if (vnVar != null) {
                    vnVar.setTextAppearance(context, x2);
                }
            }
            int x3 = G.x(26, 0);
            if (x3 != 0) {
                android.content.Context context2 = toolbar.getContext();
                toolbar.mSubtitleTextAppearance = x3;
                a.vn vnVar2 = toolbar.mSubtitleTextView;
                if (vnVar2 != null) {
                    vnVar2.setTextAppearance(context2, x3);
                }
            }
            int x4 = G.x(22, 0);
            if (x4 != 0) {
                toolbar.setPopupTheme(x4);
            }
        } else {
            if (toolbar.getNavigationIcon() != null) {
                this.o = toolbar.getNavigationIcon();
            } else {
                i = 11;
            }
            this.b = i;
        }
        G.K();
        if (2131951793 != this.n) {
            this.n = 2131951793;
            if (android.text.TextUtils.isEmpty(toolbar.getNavigationContentDescription())) {
                int i3 = this.n;
                this.j = i3 != 0 ? toolbar.getContext().getString(i3) : null;
                b();
            }
        }
        this.j = toolbar.getNavigationContentDescription();
        toolbar.setNavigationOnClickListener(new a.f1(this));
    }

    public final void a(int i) {
        android.view.View view;
        int i2 = this.b ^ i;
        this.b = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    b();
                }
                int i3 = this.b & 4;
                androidx.appcompat.widget.Toolbar toolbar = this.f47a;
                if (i3 != 0) {
                    android.graphics.drawable.Drawable drawable = this.f;
                    if (drawable == null) {
                        drawable = this.o;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((android.graphics.drawable.Drawable) null);
                }
            }
            if ((i2 & 3) != 0) {
                c();
            }
            int i4 = i2 & 8;
            androidx.appcompat.widget.Toolbar toolbar2 = this.f47a;
            if (i4 != 0) {
                if ((i & 8) != 0) {
                    toolbar2.setTitle(this.h);
                    toolbar2.setSubtitle(this.i);
                } else {
                    toolbar2.setTitle((java.lang.CharSequence) null);
                    toolbar2.setSubtitle((java.lang.CharSequence) null);
                }
            }
            if ((i2 & 16) == 0 || (view = this.c) == null) {
                return;
            }
            if ((i & 16) != 0) {
                toolbar2.addView(view);
            } else {
                toolbar2.removeView(view);
            }
        }
    }

    public final void b() {
        if ((this.b & 4) != 0) {
            boolean isEmpty = android.text.TextUtils.isEmpty(this.j);
            androidx.appcompat.widget.Toolbar toolbar = this.f47a;
            if (isEmpty) {
                toolbar.setNavigationContentDescription(this.n);
            } else {
                toolbar.setNavigationContentDescription(this.j);
            }
        }
    }

    public final void c() {
        android.graphics.drawable.Drawable drawable;
        int i = this.b;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) != 0) {
            drawable = this.e;
            if (drawable == null) {
                drawable = this.d;
            }
        } else {
            drawable = this.d;
        }
        this.f47a.setLogo(drawable);
    }
}
