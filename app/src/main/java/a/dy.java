package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class dy extends android.content.ContextWrapper {
    public static android.content.res.Configuration f;

    /* renamed from: a, reason: collision with root package name */
    public int f112a;
    public android.content.res.Resources.Theme b;
    public android.view.LayoutInflater c;
    public android.content.res.Configuration d;
    public android.content.res.Resources e;

    public dy(android.content.Context context, int i) {
        super(context);
        this.f112a = i;
    }

    public final void a(android.content.res.Configuration configuration) {
        if (this.e != null) {
            throw new java.lang.IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.d != null) {
            throw new java.lang.IllegalStateException("Override configuration has already been set");
        }
        this.d = new android.content.res.Configuration(configuration);
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    public final void b() {
        if (this.b == null) {
            this.b = getResources().newTheme();
            android.content.res.Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.b.setTo(theme);
            }
        }
        this.b.applyStyle(this.f112a, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final android.content.res.AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final android.content.res.Resources getResources() {
        if (this.e == null) {
            android.content.res.Configuration configuration = this.d;
            if (configuration != null) {
                if (f == null) {
                    android.content.res.Configuration configuration2 = new android.content.res.Configuration();
                    configuration2.fontScale = 0.0f;
                    f = configuration2;
                }
                if (!configuration.equals(f)) {
                    this.e = a.cy.a(this, this.d).getResources();
                }
            }
            this.e = super.getResources();
        }
        return this.e;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final java.lang.Object getSystemService(java.lang.String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.c == null) {
            this.c = android.view.LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final android.content.res.Resources.Theme getTheme() {
        android.content.res.Resources.Theme theme = this.b;
        if (theme != null) {
            return theme;
        }
        if (this.f112a == 0) {
            this.f112a = 2132017725;
        }
        b();
        return this.b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        if (this.f112a != i) {
            this.f112a = i;
            b();
        }
    }
}
