package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class i1 implements java.lang.Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ androidx.appcompat.widget.ActionBarOverlayLayout d;

    public /* synthetic */ i1(androidx.appcompat.widget.ActionBarOverlayLayout actionBarOverlayLayout, int i) {
        this.c = i;
        this.d = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        androidx.appcompat.widget.ActionBarOverlayLayout actionBarOverlayLayout = this.d;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                actionBarOverlayLayout.haltActionBarHideOffsetAnimations();
                actionBarOverlayLayout.mCurrentActionBarTopAnimator = actionBarOverlayLayout.mActionBarTop.animate().translationY(0.0f).setListener(actionBarOverlayLayout.mInnerInsets);
                return;
            default:
                actionBarOverlayLayout.haltActionBarHideOffsetAnimations();
                actionBarOverlayLayout.mCurrentActionBarTopAnimator = actionBarOverlayLayout.mActionBarTop.animate().translationY(-actionBarOverlayLayout.mActionBarTop.getHeight()).setListener(actionBarOverlayLayout.mInnerInsets);
                return;
        }
    }
}
