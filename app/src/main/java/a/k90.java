package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class k90 implements android.graphics.drawable.Drawable.Callback {
    public final /* synthetic */ int c = 1;
    public final java.lang.Object d;

    public k90(a.dl dlVar) {
        this.d = dlVar;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(android.graphics.drawable.Drawable drawable) {
        switch (this.c) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                return;
            default:
                ((a.dl) this.d).invalidateSelf();
                return;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(android.graphics.drawable.Drawable drawable, java.lang.Runnable runnable, long j) {
        switch (this.c) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                android.graphics.drawable.Drawable.Callback callback = (android.graphics.drawable.Drawable.Callback) this.d;
                if (callback != null) {
                    callback.scheduleDrawable(drawable, runnable, j);
                    return;
                }
                return;
            default:
                ((a.dl) this.d).scheduleSelf(runnable, j);
                return;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(android.graphics.drawable.Drawable drawable, java.lang.Runnable runnable) {
        switch (this.c) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                android.graphics.drawable.Drawable.Callback callback = (android.graphics.drawable.Drawable.Callback) this.d;
                if (callback != null) {
                    callback.unscheduleDrawable(drawable, runnable);
                    return;
                }
                return;
            default:
                ((a.dl) this.d).unscheduleSelf(runnable);
                return;
        }
    }
}
