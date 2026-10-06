package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class cl extends android.graphics.drawable.Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f74a = 1;
    public final java.lang.Object b;

    public cl(a.yr yrVar) {
        this.b = yrVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        switch (this.f74a) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                return ((android.graphics.drawable.Drawable.ConstantState) this.b).canApplyTheme();
            default:
                return super.canApplyTheme();
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        switch (this.f74a) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                return ((android.graphics.drawable.Drawable.ConstantState) this.b).getChangingConfigurations();
            default:
                return 0;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final android.graphics.drawable.Drawable newDrawable() {
        int i = this.f74a;
        java.lang.Object obj = this.b;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.dl dlVar = new a.dl(null);
                android.graphics.drawable.Drawable newDrawable = ((android.graphics.drawable.Drawable.ConstantState) obj).newDrawable();
                dlVar.c = newDrawable;
                newDrawable.setCallback(dlVar.h);
                return dlVar;
            default:
                return (a.yr) obj;
        }
    }

    public /* synthetic */ cl(a.yr yrVar, int i) {
        this(yrVar);
    }

    public cl(android.graphics.drawable.Drawable.ConstantState constantState) {
        this.b = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final android.graphics.drawable.Drawable newDrawable(android.content.res.Resources resources) {
        switch (this.f74a) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.dl dlVar = new a.dl(null);
                android.graphics.drawable.Drawable newDrawable = ((android.graphics.drawable.Drawable.ConstantState) this.b).newDrawable(resources);
                dlVar.c = newDrawable;
                newDrawable.setCallback(dlVar.h);
                return dlVar;
            default:
                return super.newDrawable(resources);
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final android.graphics.drawable.Drawable newDrawable(android.content.res.Resources resources, android.content.res.Resources.Theme theme) {
        switch (this.f74a) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.dl dlVar = new a.dl(null);
                android.graphics.drawable.Drawable newDrawable = ((android.graphics.drawable.Drawable.ConstantState) this.b).newDrawable(resources, theme);
                dlVar.c = newDrawable;
                newDrawable.setCallback(dlVar.h);
                return dlVar;
            default:
                return super.newDrawable(resources, theme);
        }
    }
}
