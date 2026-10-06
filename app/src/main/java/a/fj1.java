package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class fj1 extends android.view.ActionMode {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f151a;
    public final a.o2 b;

    public fj1(android.content.Context context, a.o2 o2Var) {
        this.f151a = context;
        this.b = o2Var;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.b.a();
    }

    @Override // android.view.ActionMode
    public final android.view.View getCustomView() {
        return this.b.b();
    }

    @Override // android.view.ActionMode
    public final android.view.Menu getMenu() {
        return new a.s01(this.f151a, this.b.c());
    }

    @Override // android.view.ActionMode
    public final android.view.MenuInflater getMenuInflater() {
        return this.b.d();
    }

    @Override // android.view.ActionMode
    public final java.lang.CharSequence getSubtitle() {
        return this.b.e();
    }

    @Override // android.view.ActionMode
    public final java.lang.Object getTag() {
        return this.b.c;
    }

    @Override // android.view.ActionMode
    public final java.lang.CharSequence getTitle() {
        return this.b.f();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.b.d;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.b.h();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.b.i();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(android.view.View view) {
        this.b.j(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(java.lang.CharSequence charSequence) {
        this.b.l(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTag(java.lang.Object obj) {
        this.b.c = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(java.lang.CharSequence charSequence) {
        this.b.n(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z) {
        this.b.o(z);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i) {
        this.b.k(i);
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i) {
        this.b.m(i);
    }
}
