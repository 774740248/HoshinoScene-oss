package a;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import com.omarea.vtools.activities.ActivityFiles;

/* loaded from: /tmp/jadx-9051527860862319108.dex */
public final /* synthetic */ class g8 implements View.OnTouchListener {

    public g8() {
        this(null, null, null, null, 0, 0, null);
    }
    public final /* synthetic */ ja1 c;
    public final /* synthetic */ ja1 d;
    public final /* synthetic */ ha1 e;
    public final /* synthetic */ ma1 f;
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;
    public final /* synthetic */ ActivityFiles i;

    public /* synthetic */ g8(ja1 ja1Var, ja1 ja1Var2, ha1 ha1Var, ma1 ma1Var, int i, int i2, ActivityFiles activityFiles) {
        this.c = ja1Var;
        this.d = ja1Var2;
        this.e = ha1Var;
        this.f = ma1Var;
        this.g = i;
        this.h = i2;
        this.i = activityFiles;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        float f;
        float width;
        gu0[] gu0VarArr = ActivityFiles.C;
        ja1 ja1Var = this.c;
        wv.w(ja1Var, "$downX");
        ja1 ja1Var2 = this.d;
        wv.w(ja1Var2, "$downY");
        ha1 ha1Var = this.e;
        wv.w(ha1Var, "$dragging");
        ma1 ma1Var = this.f;
        wv.w(ma1Var, "$velocityTracker");
        ActivityFiles activityFiles = this.i;
        wv.w(activityFiles, "this$0");
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            ja1Var.c = motionEvent.getRawX();
            ja1Var2.c = motionEvent.getRawY();
            ha1Var.c = false;
            VelocityTracker obtain = VelocityTracker.obtain();
            obtain.addMovement(motionEvent);
            ma1Var.c = obtain;
            view.getParent().requestDisallowInterceptTouchEvent(true);
        } else if (actionMasked != 1) {
            if (actionMasked == 2) {
                float rawX = motionEvent.getRawX() - ja1Var.c;
                float rawY = motionEvent.getRawY() - ja1Var2.c;
                if (!ha1Var.c && Math.abs(rawX) > this.g && Math.abs(rawX) > Math.abs(rawY)) {
                    ha1Var.c = true;
                }
                if (ha1Var.c) {
                    view.setTranslationX(rawX);
                    view.setAlpha(wv.B(1.0f - (Math.abs(rawX) / view.getWidth()), 0.2f, 1.0f));
                }
                VelocityTracker velocityTracker = (VelocityTracker) ma1Var.c;
                if (velocityTracker != null) {
                    velocityTracker.addMovement(motionEvent);
                }
            } else if (actionMasked == 3) {
                VelocityTracker velocityTracker2 = (VelocityTracker) ma1Var.c;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                }
                ma1Var.c = null;
                view.animate().translationX(0.0f).alpha(1.0f).setDuration(180L).start();
            }
        } else if (ha1Var.c) {
            float rawX2 = motionEvent.getRawX() - ja1Var.c;
            VelocityTracker velocityTracker3 = (VelocityTracker) ma1Var.c;
            if (velocityTracker3 != null) {
                velocityTracker3.addMovement(motionEvent);
                velocityTracker3.computeCurrentVelocity(1000);
                f = velocityTracker3.getXVelocity();
            } else {
                f = 0.0f;
            }
            VelocityTracker velocityTracker4 = (VelocityTracker) ma1Var.c;
            if (velocityTracker4 != null) {
                velocityTracker4.recycle();
            }
            ma1Var.c = null;
            if (Math.abs(rawX2) > view.getWidth() * 0.35f || Math.abs(f) > this.h) {
                if (rawX2 == 0.0f) {
                    width = view.getWidth() * (f > 0.0f ? 1 : -1);
                } else {
                    width = (rawX2 > 0.0f ? 1 : -1) * view.getWidth();
                }
                view.animate().translationX(width).alpha(0.0f).setDuration(180L).withEndAction(new h8(activityFiles, 0)).start();
            } else {
                view.animate().translationX(0.0f).alpha(1.0f).setDuration(180L).start();
            }
        } else {
            VelocityTracker velocityTracker5 = (VelocityTracker) ma1Var.c;
            if (velocityTracker5 != null) {
                velocityTracker5.recycle();
            }
            ma1Var.c = null;
            Rect rect = new Rect();
            activityFiles.v().getHitRect(rect);
            if (rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                activityFiles.v().performClick();
            }
        }
        return true;
    }
}
