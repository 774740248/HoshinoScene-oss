package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ye0 {

    /* renamed from: a, reason: collision with root package name */
    public int f707a;
    public int b;
    public int c;
    public int d = 0;
    public boolean e;
    public boolean f;
    public boolean g;
    public final /* synthetic */ com.google.android.flexbox.FlexboxLayoutManager h;

    public ye0(com.google.android.flexbox.FlexboxLayoutManager flexboxLayoutManager) {
        this.h = flexboxLayoutManager;
    }

    public static void a(a.ye0 ye0Var) {
        com.google.android.flexbox.FlexboxLayoutManager flexboxLayoutManager = ye0Var.h;
        if (flexboxLayoutManager.isMainAxisDirectionHorizontal() || !flexboxLayoutManager.mIsRtl) {
            ye0Var.c = ye0Var.e ? flexboxLayoutManager.D.h() : flexboxLayoutManager.D.i();
        } else {
            ye0Var.c = ye0Var.e ? flexboxLayoutManager.D.h() : flexboxLayoutManager.p - flexboxLayoutManager.D.i();
        }
    }

    public static void b(a.ye0 ye0Var) {
        ye0Var.f707a = -1;
        ye0Var.b = -1;
        ye0Var.c = Integer.MIN_VALUE;
        ye0Var.f = false;
        ye0Var.g = false;
        com.google.android.flexbox.FlexboxLayoutManager flexboxLayoutManager = ye0Var.h;
        if (flexboxLayoutManager.isMainAxisDirectionHorizontal()) {
            int i = flexboxLayoutManager.mJustifyContent;
            if (i == 0) {
                ye0Var.e = flexboxLayoutManager.mFlexWrap == 1;
                return;
            } else {
                ye0Var.e = i == 2;
                return;
            }
        }
        int i2 = flexboxLayoutManager.mJustifyContent;
        if (i2 == 0) {
            ye0Var.e = flexboxLayoutManager.mFlexWrap == 3;
        } else {
            ye0Var.e = i2 == 2;
        }
    }

    public final java.lang.String toString() {
        return "AnchorInfo{mPosition=" + this.f707a + ", mFlexLinePosition=" + this.b + ", mCoordinate=" + this.c + ", mPerpendicularCoordinate=" + this.d + ", mLayoutFromEnd=" + this.e + ", mValid=" + this.f + ", mAssignedFromSavedState=" + this.g + '}';
    }
}
